/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uiteco.ofSuKienPanel;

import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.awt.Image;
import javax.swing.ImageIcon;
import com.uiteco.database.ConnectionManager;
import com.uiteco.ofSuKienPanel.search.SuKienListModelSearch;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;
import static com.uiteco.ofSuKienPanel.tagsAndSort.SuKienListModelWithTagSort.SORT_OPTION;
import static com.uiteco.ofSuKienPanel.search.SuKienListModelSearch.SEARCH_OPTION;
import static com.uiteco.ofSuKienPanel.tagsAndSort.SuKienListModelWithTagSort.DEFAULT_SORT_OPTION;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author nddmi
 */
public class SuKienDAO {

    /**
     * Should not use this
     *
     * @return
     */
    public static ArrayList<SuKienModel> getAll() {
        ArrayList<SuKienModel> suKienList = new ArrayList<>();
        // mock
        for (int i = 0; i < 100; i++) {
            String title = String.format("Day la su kien thu %d", i + 1);
            String type = "Event";

            HashSet<String> tags = new HashSet<>(java.util.Arrays.asList("Beginner Friendly", "Social Good", "Low/No Code"));

            int postID = i;
            String content = "Hello World Java Swing GUI. Hello World Coconerd. Hello world, good bye world. Bye bye world. I love Java. I hate Java. I hate IT.";
            String postedBy = "Minh Duc";
            java.time.LocalDateTime postedAt = java.time.LocalDateTime.now();
            String note = null;
            String clubID = null;
            ImageIcon thumbnail = new ImageIcon("D:\\LabJava\\FeaturedImages\\3.jpg"); // Mock image
            int views = 1200;
            SuKienModel event = new SuKienModel(title, tags, postID, type, content, postedBy, postedAt, note, clubID, thumbnail, views);
            suKienList.add(event);
        }

        return suKienList;
    }

    public static Set<String> getRandomTags(Set<String> originalTags) {
        // Convert the original set to a list
        List<String> list = new ArrayList<>(originalTags);

        // Determine the number of elements to select (between 1 and 3, inclusive)
        int selectQuantity = new Random().nextInt(Math.min(3, originalTags.size())) + 1;

        // Shuffle the list to randomize the order
        Collections.shuffle(list);

        // Create a new set to hold the randomly selected elements
        Set<String> randomSubset = new HashSet<>();

        // Add the randomly selected elements to the new set
        for (int i = 0; i < selectQuantity; i++) {
            randomSubset.add(list.get(i));
        }

        return randomSubset;
    }

    public static ArrayList<SuKienModel> genMockData() throws SQLException {
        ArrayList<SuKienModel> suKienList = new ArrayList<>();
        // mock
        for (int i = 0; i < 100; i++) {
            String title = String.format("Day la su kien thu %d", i + 1);
            String type = "Event";
//            HashSet<String> tags = new HashSet<>(java.util.Arrays.asList("Beginner Friendly", "Social Good", "Low/No Code"));
//            try {
            Set<String> tags = getRandomTags(getAllTags());
//            } catch (Exception e) {
//                e.printStackTrace();
//            }

            int postId = i + 1;
            String content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. \"\n"
                    + "                + \"Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \"\n"
                    + "                + \"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi \"\n"
                    + "                + \"ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \"\n"
                    + "                + \"in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \"\n"
                    + "                + \"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia \"\n"
                    + "                + \"deserunt mollit anim id est laborum."
                    + "Lorem ipsum dolor sit amet, consectetur adipiscing elit. \"\n"
                    + "                + \"Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \"\n"
                    + "                + \"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi \"\n"
                    + "                + \"ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \"\n"
                    + "                + \"in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \"\n"
                    + "                + \"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia \"\n"
                    + "                + \"deserunt mollit anim id est laborum."
                    + "Lorem ipsum dolor sit amet, consectetur adipiscing elit. \"\n"
                    + "                + \"Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \"\n"
                    + "                + \"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi \"\n"
                    + "                + \"ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \"\n"
                    + "                + \"in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \"\n"
                    + "                + \"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia \"\n"
                    + "                + \"deserunt mollit anim id est laborum.Lorem ipsum dolor sit amet, consectetur adipiscing elit. \"\n"
                    + "                + \"Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \"\n"
                    + "                + \"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi \"\n"
                    + "                + \"ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \"\n"
                    + "                + \"in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \"\n"
                    + "                + \"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia \"\n"
                    + "                + \"deserunt mollit anim id est laborum."
                    + "Lorem ipsum dolor sit amet, consectetur adipiscing elit. \"\n"
                    + "                + \"Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \"\n"
                    + "                + \"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi \"\n"
                    + "                + \"ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \"\n"
                    + "                + \"in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \"\n"
                    + "                + \"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia \"\n"
                    + "                + \"deserunt mollit anim id est laborum."
                    + "Lorem ipsum dolor sit amet, consectetur adipiscing elit. \"\n"
                    + "                + \"Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \"\n"
                    + "                + \"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi \"\n"
                    + "                + \"ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \"\n"
                    + "                + \"in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \"\n"
                    + "                + \"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia \"\n"
                    + "                + \"deserunt mollit anim id est laborum.Lorem ipsum dolor sit amet, consectetur adipiscing elit. \"\n"
                    + "                + \"Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \"\n"
                    + "                + \"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi \"\n"
                    + "                + \"ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \"\n"
                    + "                + \"in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \"\n"
                    + "                + \"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia \"\n"
                    + "                + \"deserunt mollit anim id est laborum."
                    + "Lorem ipsum dolor sit amet, consectetur adipiscing elit. \"\n"
                    + "                + \"Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \"\n"
                    + "                + \"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi \"\n"
                    + "                + \"ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \"\n"
                    + "                + \"in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \"\n"
                    + "                + \"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia \"\n"
                    + "                + \"deserunt mollit anim id est laborum."
                    + "Lorem ipsum dolor sit amet, consectetur adipiscing elit. \"\n"
                    + "                + \"Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \"\n"
                    + "                + \"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi \"\n"
                    + "                + \"ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \"\n"
                    + "                + \"in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \"\n"
                    + "                + \"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia \"\n"
                    + "                + \"deserunt mollit anim id est laborum.Lorem ipsum dolor sit amet, consectetur adipiscing elit. \"\n"
                    + "                + \"Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \"\n"
                    + "                + \"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi \"\n"
                    + "                + \"ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \"\n"
                    + "                + \"in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \"\n"
                    + "                + \"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia \"\n"
                    + "                + \"deserunt mollit anim id est laborum."
                    + "Lorem ipsum dolor sit amet, consectetur adipiscing elit. \"\n"
                    + "                + \"Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \"\n"
                    + "                + \"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi \"\n"
                    + "                + \"ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \"\n"
                    + "                + \"in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \"\n"
                    + "                + \"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia \"\n"
                    + "                + \"deserunt mollit anim id est laborum."
                    + "Lorem ipsum dolor sit amet, consectetur adipiscing elit. \"\n"
                    + "                + \"Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \"\n"
                    + "                + \"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi \"\n"
                    + "                + \"ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \"\n"
                    + "                + \"in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \"\n"
                    + "                + \"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia \"\n"
                    + "                + \"deserunt mollit anim id est laborum.Lorem ipsum dolor sit amet, consectetur adipiscing elit. \"\n"
                    + "                + \"Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \"\n"
                    + "                + \"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi \"\n"
                    + "                + \"ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \"\n"
                    + "                + \"in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \"\n"
                    + "                + \"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia \"\n"
                    + "                + \"deserunt mollit anim id est laborum."
                    + "Lorem ipsum dolor sit amet, consectetur adipiscing elit. \"\n"
                    + "                + \"Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \"\n"
                    + "                + \"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi \"\n"
                    + "                + \"ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \"\n"
                    + "                + \"in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \"\n"
                    + "                + \"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia \"\n"
                    + "                + \"deserunt mollit anim id est laborum."
                    + "Lorem ipsum dolor sit amet, consectetur adipiscing elit. \"\n"
                    + "                + \"Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \"\n"
                    + "                + \"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi \"\n"
                    + "                + \"ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \"\n"
                    + "                + \"in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \"\n"
                    + "                + \"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia \"\n"
                    + "                + \"deserunt mollit anim id est laborum.";
            String postedBy = "Duc Minh";
            java.time.LocalDateTime postedAt = java.time.LocalDateTime.now();
            String note = null;
            String clubID = null;
            ImageIcon thumbnail = new ImageIcon("D:\\DoAn\\database\\mock\\FeaturedImages\\3.jpg");
            int views = i + 1;
            SuKienModel event = new SuKienModel(title, tags, postId, type, content, postedBy, postedAt, note, clubID, thumbnail, views);
            suKienList.add(event);
        }

        return suKienList;
    }

    public static ArrayList<SuKienModel> genMockData(int N) throws SQLException {
        ArrayList<SuKienModel> suKienList = new ArrayList<>();
        // mock
        for (int i = 0; i < N; i++) {
            String title = String.format("Day la su kien thu %d", i + 1);
            String type = "Event";
//            HashSet<String> tags = new HashSet<>(java.util.Arrays.asList("Beginner Friendly", "Social Good", "Low/No Code"));
//            try {
            Set<String> tags = getRandomTags(getAllTags());
//            } catch (Exception e) {
//                e.printStackTrace();
//            }

            int postId = i + 1;
            String content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. \"\n"
                    + "                + \"Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \"\n"
                    + "                + \"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi \"\n"
                    + "                + \"ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \"\n"
                    + "                + \"in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \"\n"
                    + "                + \"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia \"\n"
                    + "                + \"deserunt mollit anim id est laborum."
                    + "Lorem ipsum dolor sit amet, consectetur adipiscing elit. \"\n"
                    + "                + \"Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \"\n"
                    + "                + \"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi \"\n"
                    + "                + \"ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \"\n"
                    + "                + \"in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \"\n"
                    + "                + \"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia \"\n"
                    + "                + \"deserunt mollit anim id est laborum."
                    + "Lorem ipsum dolor sit amet, consectetur adipiscing elit. \"\n"
                    + "                + \"Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \"\n"
                    + "                + \"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi \"\n"
                    + "                + \"ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \"\n"
                    + "                + \"in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \"\n"
                    + "                + \"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia \"\n"
                    + "                + \"deserunt mollit anim id est laborum.Lorem ipsum dolor sit amet, consectetur adipiscing elit. \"\n"
                    + "                + \"Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \"\n"
                    + "                + \"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi \"\n"
                    + "                + \"ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \"\n"
                    + "                + \"in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \"\n"
                    + "                + \"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia \"\n"
                    + "                + \"deserunt mollit anim id est laborum."
                    + "Lorem ipsum dolor sit amet, consectetur adipiscing elit. \"\n"
                    + "                + \"Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \"\n"
                    + "                + \"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi \"\n"
                    + "                + \"ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \"\n"
                    + "                + \"in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \"\n"
                    + "                + \"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia \"\n"
                    + "                + \"deserunt mollit anim id est laborum."
                    + "Lorem ipsum dolor sit amet, consectetur adipiscing elit. \"\n"
                    + "                + \"Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \"\n"
                    + "                + \"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi \"\n"
                    + "                + \"ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \"\n"
                    + "                + \"in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \"\n"
                    + "                + \"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia \"\n"
                    + "                + \"deserunt mollit anim id est laborum.Lorem ipsum dolor sit amet, consectetur adipiscing elit. \"\n"
                    + "                + \"Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \"\n"
                    + "                + \"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi \"\n"
                    + "                + \"ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \"\n"
                    + "                + \"in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \"\n"
                    + "                + \"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia \"\n"
                    + "                + \"deserunt mollit anim id est laborum."
                    + "Lorem ipsum dolor sit amet, consectetur adipiscing elit. \"\n"
                    + "                + \"Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \"\n"
                    + "                + \"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi \"\n"
                    + "                + \"ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \"\n"
                    + "                + \"in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \"\n"
                    + "                + \"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia \"\n"
                    + "                + \"deserunt mollit anim id est laborum."
                    + "Lorem ipsum dolor sit amet, consectetur adipiscing elit. \"\n"
                    + "                + \"Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \"\n"
                    + "                + \"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi \"\n"
                    + "                + \"ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \"\n"
                    + "                + \"in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \"\n"
                    + "                + \"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia \"\n"
                    + "                + \"deserunt mollit anim id est laborum.Lorem ipsum dolor sit amet, consectetur adipiscing elit. \"\n"
                    + "                + \"Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \"\n"
                    + "                + \"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi \"\n"
                    + "                + \"ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \"\n"
                    + "                + \"in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \"\n"
                    + "                + \"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia \"\n"
                    + "                + \"deserunt mollit anim id est laborum."
                    + "Lorem ipsum dolor sit amet, consectetur adipiscing elit. \"\n"
                    + "                + \"Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \"\n"
                    + "                + \"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi \"\n"
                    + "                + \"ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \"\n"
                    + "                + \"in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \"\n"
                    + "                + \"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia \"\n"
                    + "                + \"deserunt mollit anim id est laborum."
                    + "Lorem ipsum dolor sit amet, consectetur adipiscing elit. \"\n"
                    + "                + \"Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \"\n"
                    + "                + \"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi \"\n"
                    + "                + \"ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \"\n"
                    + "                + \"in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \"\n"
                    + "                + \"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia \"\n"
                    + "                + \"deserunt mollit anim id est laborum.Lorem ipsum dolor sit amet, consectetur adipiscing elit. \"\n"
                    + "                + \"Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \"\n"
                    + "                + \"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi \"\n"
                    + "                + \"ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \"\n"
                    + "                + \"in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \"\n"
                    + "                + \"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia \"\n"
                    + "                + \"deserunt mollit anim id est laborum."
                    + "Lorem ipsum dolor sit amet, consectetur adipiscing elit. \"\n"
                    + "                + \"Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \"\n"
                    + "                + \"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi \"\n"
                    + "                + \"ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \"\n"
                    + "                + \"in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \"\n"
                    + "                + \"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia \"\n"
                    + "                + \"deserunt mollit anim id est laborum."
                    + "Lorem ipsum dolor sit amet, consectetur adipiscing elit. \"\n"
                    + "                + \"Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \"\n"
                    + "                + \"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi \"\n"
                    + "                + \"ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \"\n"
                    + "                + \"in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \"\n"
                    + "                + \"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia \"\n"
                    + "                + \"deserunt mollit anim id est laborum.";
            String postedBy = "Duc Minh";
            java.time.LocalDateTime postedAt = java.time.LocalDateTime.now();
            String note = null;
            String clubID = null;
            ImageIcon thumbnail = new ImageIcon("D:\\DoAn\\database\\mock\\FeaturedImages\\3.jpg");
            int views = i + 1;
            SuKienModel event = new SuKienModel(title, tags, postId, type, content, postedBy, postedAt, note, clubID, thumbnail, views);
            suKienList.add(event);
        }

        return suKienList;
    }

    /**
     *
     * @param N
     * @return
     */
    public static ArrayList<SuKienModel> getNewest(int N) {

        ArrayList<SuKienModel> suKienList = new ArrayList<>();
        // mock
        for (int i = 0; i < N; i++) {
            String title = String.format("Day la su kien thu %d", i + 1);
            String type = "Event";
            HashSet<String> tags = new HashSet<>(java.util.Arrays.asList("Beginner Friendly", "Social Good", "Low/No Code"));
            int postId = i + 1;
            String content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. \"\n"
                    + "                + \"Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \"\n"
                    + "                + \"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi \"\n"
                    + "                + \"ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \"\n"
                    + "                + \"in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \"\n"
                    + "                + \"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia \"\n"
                    + "                + \"deserunt mollit anim id est laborum."
                    + "Lorem ipsum dolor sit amet, consectetur adipiscing elit. \"\n"
                    + "                + \"Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \"\n"
                    + "                + \"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi \"\n"
                    + "                + \"ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \"\n"
                    + "                + \"in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \"\n"
                    + "                + \"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia \"\n"
                    + "                + \"deserunt mollit anim id est laborum."
                    + "Lorem ipsum dolor sit amet, consectetur adipiscing elit. \"\n"
                    + "                + \"Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \"\n"
                    + "                + \"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi \"\n"
                    + "                + \"ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \"\n"
                    + "                + \"in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \"\n"
                    + "                + \"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia \"\n"
                    + "                + \"deserunt mollit anim id est laborum.Lorem ipsum dolor sit amet, consectetur adipiscing elit. \"\n"
                    + "                + \"Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \"\n"
                    + "                + \"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi \"\n"
                    + "                + \"ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \"\n"
                    + "                + \"in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \"\n"
                    + "                + \"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia \"\n"
                    + "                + \"deserunt mollit anim id est laborum."
                    + "Lorem ipsum dolor sit amet, consectetur adipiscing elit. \"\n"
                    + "                + \"Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \"\n"
                    + "                + \"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi \"\n"
                    + "                + \"ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \"\n"
                    + "                + \"in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \"\n"
                    + "                + \"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia \"\n"
                    + "                + \"deserunt mollit anim id est laborum."
                    + "Lorem ipsum dolor sit amet, consectetur adipiscing elit. \"\n"
                    + "                + \"Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \"\n"
                    + "                + \"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi \"\n"
                    + "                + \"ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \"\n"
                    + "                + \"in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \"\n"
                    + "                + \"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia \"\n"
                    + "                + \"deserunt mollit anim id est laborum.Lorem ipsum dolor sit amet, consectetur adipiscing elit. \"\n"
                    + "                + \"Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \"\n"
                    + "                + \"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi \"\n"
                    + "                + \"ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \"\n"
                    + "                + \"in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \"\n"
                    + "                + \"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia \"\n"
                    + "                + \"deserunt mollit anim id est laborum."
                    + "Lorem ipsum dolor sit amet, consectetur adipiscing elit. \"\n"
                    + "                + \"Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \"\n"
                    + "                + \"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi \"\n"
                    + "                + \"ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \"\n"
                    + "                + \"in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \"\n"
                    + "                + \"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia \"\n"
                    + "                + \"deserunt mollit anim id est laborum."
                    + "Lorem ipsum dolor sit amet, consectetur adipiscing elit. \"\n"
                    + "                + \"Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \"\n"
                    + "                + \"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi \"\n"
                    + "                + \"ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \"\n"
                    + "                + \"in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \"\n"
                    + "                + \"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia \"\n"
                    + "                + \"deserunt mollit anim id est laborum.Lorem ipsum dolor sit amet, consectetur adipiscing elit. \"\n"
                    + "                + \"Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \"\n"
                    + "                + \"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi \"\n"
                    + "                + \"ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \"\n"
                    + "                + \"in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \"\n"
                    + "                + \"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia \"\n"
                    + "                + \"deserunt mollit anim id est laborum."
                    + "Lorem ipsum dolor sit amet, consectetur adipiscing elit. \"\n"
                    + "                + \"Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \"\n"
                    + "                + \"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi \"\n"
                    + "                + \"ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \"\n"
                    + "                + \"in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \"\n"
                    + "                + \"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia \"\n"
                    + "                + \"deserunt mollit anim id est laborum."
                    + "Lorem ipsum dolor sit amet, consectetur adipiscing elit. \"\n"
                    + "                + \"Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \"\n"
                    + "                + \"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi \"\n"
                    + "                + \"ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \"\n"
                    + "                + \"in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \"\n"
                    + "                + \"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia \"\n"
                    + "                + \"deserunt mollit anim id est laborum.Lorem ipsum dolor sit amet, consectetur adipiscing elit. \"\n"
                    + "                + \"Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \"\n"
                    + "                + \"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi \"\n"
                    + "                + \"ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \"\n"
                    + "                + \"in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \"\n"
                    + "                + \"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia \"\n"
                    + "                + \"deserunt mollit anim id est laborum."
                    + "Lorem ipsum dolor sit amet, consectetur adipiscing elit. \"\n"
                    + "                + \"Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \"\n"
                    + "                + \"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi \"\n"
                    + "                + \"ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \"\n"
                    + "                + \"in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \"\n"
                    + "                + \"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia \"\n"
                    + "                + \"deserunt mollit anim id est laborum."
                    + "Lorem ipsum dolor sit amet, consectetur adipiscing elit. \"\n"
                    + "                + \"Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \"\n"
                    + "                + \"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi \"\n"
                    + "                + \"ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \"\n"
                    + "                + \"in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \"\n"
                    + "                + \"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia \"\n"
                    + "                + \"deserunt mollit anim id est laborum.";
            String postedBy = "Duc Minh";
            java.time.LocalDateTime postedAt = java.time.LocalDateTime.now();
            String note = null;
            String clubID = null;
            ImageIcon thumbnail = new ImageIcon("D:\\DoAn\\database\\mock\\FeaturedImages\\3.jpg");
            int views = 1200;
            SuKienModel event = new SuKienModel(title, tags, postId, type, content, postedBy, postedAt, note, clubID, thumbnail, views);
            suKienList.add(event);
        }

        return suKienList;
    }

    public static ArrayList<SuKienModel> getNewest() {
        ArrayList<SuKienModel> suKienList = new ArrayList<>();

        // mock
        for (int i = 0; i < 100; i++) {
            String title = String.format("Day la su kien thu %d", i + 1);
            String type = "Event";
            HashSet<String> tags = new HashSet<>(java.util.Arrays.asList("Beginner Friendly", "Social Good", "Low/No Code"));
            int postId = i + 1;
            String content = "Hello World Java Swing GUI. Hello World Coconerd. Hello world, good bye world. Bye bye world. I love Java. I hate Java. I hate IT.";
            String postedBy = "Duc Minh";
            java.time.LocalDateTime postedAt = java.time.LocalDateTime.now();
            String note = null;
            String clubID = null;
            ImageIcon thumbnail = new ImageIcon("D:\\LabJava\\FeaturedImages\\3.jpg"); // Mock image
            int views = 1200;
            SuKienModel event = new SuKienModel(title, tags, postId, type, content, postedBy, postedAt, note, clubID, thumbnail, views);
            suKienList.add(event);
        }

        return suKienList;

    }

    public static int getCount(Set<String> tags) throws SQLException {
        // Mock
        int count = 0;
        ArrayList<SuKienModel> suKienList = genMockData();
        for (SuKienModel suKienModel : suKienList) {
            boolean tagsMatched = false;

            if (tags.size() <= 0) {
                tagsMatched = true;
            } else {
                for (String tag : tags) {
                    if (suKienModel.getTags().contains(tag)) {
                        tagsMatched = true;
                        break;
                    }
                }
            }

            if (tagsMatched) {
                count++;
            }
        }
        return count;
    }

    public static int getCount() throws SQLException {
        return genMockData().size();
    }

    public static ArrayList<SuKienModel> searchSuKien(String searchText, SEARCH_OPTION searchOption) throws SQLException {
        // Mock
        ArrayList<SuKienModel> result = new ArrayList<SuKienModel>();
        switch (searchOption) {
            case title:
                for (SuKienModel suKienModel : genMockData()) {
                    if (suKienModel.getTitle().contains(searchText)) {
                        result.add(suKienModel);
                    }
                }
                break;
            case content:
                for (SuKienModel suKienModel : genMockData()) {
                    if (suKienModel.getContent().contains(searchText)) {
                        result.add(suKienModel);
                    }
                }
                break;
            case postedBy:
                for (SuKienModel suKienModel : genMockData()) {
                    if (suKienModel.getTitle().contains(searchText)) {
                        result.add(suKienModel);
                    }
                }
                break;
        }

        return result;
    }

    public static LinkedList<SuKienModel> getPageData(int page, int pageSize) throws SQLException {
        ArrayList<SuKienModel> suKienList = genMockData();

        // Sorting
        suKienList.sort((SuKienModel s1, SuKienModel s2) -> s2.getPostedAt().compareTo(s1.getPostedAt()));

        // Pagination
        int startIdx = (page - 1) * pageSize;
        int endIdx = Math.min(startIdx + pageSize, suKienList.size());
        System.out.println("Debug: start index = " + startIdx);
        System.out.println("Debug: end index = " + endIdx);

        // Sublist for the current page
        return new LinkedList<>(suKienList.subList(startIdx, endIdx));
    }

    public static LinkedList<SuKienModel> getPageData(int page, int pageSize, Set<String> selectedTags, SORT_OPTION sortOption) throws SQLException {
        ArrayList<SuKienModel> suKienList = genMockData();

        // Filter the list based on the selected tags
        Iterator<SuKienModel> iterator = suKienList.iterator();
        while (iterator.hasNext()) {
            SuKienModel suKienModel = iterator.next();
            boolean tagsMatched = selectedTags.isEmpty(); // If no tags are selected, consider it matched
            if (!tagsMatched) {
                for (String tag : selectedTags) {
                    if (suKienModel.getTags().contains(tag)) {
                        tagsMatched = true;
                        break;
                    }
                }
            }
            if (!tagsMatched) {
                iterator.remove();
            }
        }

        // Sorting
        if (sortOption == SORT_OPTION.NEWEST) {
            suKienList.sort((SuKienModel s1, SuKienModel s2) -> s2.getPostedAt().compareTo(s1.getPostedAt()));
        } else {
            suKienList.sort((SuKienModel s1, SuKienModel s2) -> compareDatetimeThenViews(s1, s2));
        }

        // Pagination
        int startIdx = (page - 1) * pageSize;
        int endIdx = Math.min(startIdx + pageSize, suKienList.size());
        System.out.println("Debug: start index = " + startIdx);
        System.out.println("Debug: end index = " + endIdx);

        // Sublist for the current page
        return new LinkedList<>(suKienList.subList(startIdx, endIdx));
    }

    public static int compareDatetimeThenViews(SuKienModel s1, SuKienModel s2) {
        // Compare datetime in descending order
        int res = s2.getPostedAt().compareTo(s1.getPostedAt());

        if (res != 0) {
            return res;
        }

        // Compare views in descending order too
        return Integer.compare(s2.getViews(), s1.getViews());

    }

    public static ArrayList<SuKienModel> getSuKienSlideShow(int slides) throws SQLException {
        /**
         * Mock function
         */
        int imageCount = getSlideShowPageCount();
        int imageIndex = 0;
        ArrayList<ImageIcon> images = loadImagesFromFolder();

//        ArrayList<SuKienModel> suKienList = new ArrayList<SuKienModel>();
        ArrayList<SuKienModel> suKienList = genMockData(slides);

        for (int i = 0; i < slides; i++) {
            ImageIcon thumbnail = images.get(imageIndex);
            suKienList.get(i).setThumbnail(thumbnail);
            
            imageIndex = (imageIndex == imageCount - 1 ? 0 : imageIndex + 1); // Update image index
        }

        return suKienList;
    }

    public static int getSlideShowPageCount() {
        return 5;
    }

    // Mock only
    public static ArrayList<ImageIcon> loadImagesFromFolder() {
        String folderPath = "D:\\DoAn\\database\\mock\\FeaturedImages"; // Hardcoded folder path
        File folder = new File(folderPath);
        File[] files = folder.listFiles();
        ArrayList<ImageIcon> imageIcons = new ArrayList<>();
        if (files != null) {
            for (File file : files) {
                ImageIcon icon = new ImageIcon(file.getPath());
                imageIcons.add(icon);
            }
        }
        return imageIcons;
    }

    // Mock only
    public static ArrayList<ImageIcon> loadImagesFromFolder(String path) {
        File folder = new File(path);
        File[] files = folder.listFiles();
        ArrayList<ImageIcon> imageIcons = new ArrayList<>();
        if (files != null) {
            for (File file : files) {
                ImageIcon icon = new ImageIcon(file.getPath());
                imageIcons.add(icon);
            }
        }
        return imageIcons;
    }

    public static ArrayList<ImageIcon> getSuKienImages(int postID) throws SQLException, IOException {
        ArrayList images = new ArrayList<ImageIcon>();
//
//        try {
//            Connection conn = ConnectionManager.getConnection();
//
//            String sql = "SELECT * FROM BAIDANG WHERE MABD = ?";
//            PreparedStatement statement = conn.prepareStatement(sql);
//            statement.setInt(1, postID);
//            System.out.println("Fetching images for postID: " + postID);
//            ResultSet rs = statement.executeQuery();
//
//            while (rs.next()) {
//                Blob blob = rs.getBlob("ANH");
//                Image image = javax.imageio.ImageIO.read(blob.getBinaryStream());
//                ImageIcon imageIcon = new ImageIcon(image);
//                images.add(imageIcon);
//            }
//
//            conn.close();
//            return images;
//
//        } catch (SQLException | IOException e) {
//            throw e;
//        }
        // Mock

        return loadImagesFromFolder("D:\\DoAn\\database\\mock\\ImagesOfSuKien");
    }

    public static ArrayList<SuKienModel> searchSuKienByTitle(String title) throws SQLException {
        ArrayList<SuKienModel> suKienList = new ArrayList<>();
        if (title == null) {
            return suKienList;
        }

//        try {
//            Connection conn = ConnectionManager.getConnection();
//            
//            
//            
//            conn.close();
//        } catch (SQLException e) {
//            throw e;
//        }
        /**
         * Mock data
         */
        for (SuKienModel sk : genMockData()) {
            if (sk.getTitle().contains(title)) {
                suKienList.add(sk);
            }
        }

        return suKienList;
    }

    public static ArrayList<SuKienModel> searchSuKienByContent(String content) throws SQLException {
        ArrayList<SuKienModel> suKienList = new ArrayList<>();
        if (content == null) {
            return suKienList;
        }

//        try {
//            Connection conn = ConnectionManager.getConnection();
//            
//            
//            
//            conn.close();
//        } catch (SQLException e) {
//            throw e;
//        }
        /**
         * Mock data
         */
        for (SuKienModel sk : genMockData()) {
            if (sk.getContent().contains(content)) {
                suKienList.add(sk);
            }
        }

        return suKienList;
    }

    public static ArrayList<SuKienModel> searchSuKienByOwner(String owner) throws SQLException {
        ArrayList<SuKienModel> suKienList = new ArrayList<>();
        if (owner == null) {
            return suKienList;
        }

//        try {
//            Connection conn = ConnectionManager.getConnection();
//            
//            
//            
//            conn.close();
//        } catch (SQLException e) {
//            throw e;
//        }
        /**
         * Mock data
         */
        for (SuKienModel sk : genMockData()) {
            if (sk.getPostedBy().contains(owner)) {
                suKienList.add(sk);
            }
        }

        return suKienList;
    }

    public static HashSet<String> getTagsOfSuKien(int postID) throws SQLException {
        HashSet<String> tags;

//        try {
//            Connection conn = ConnectionManager.getConnection();
//            String sql = "SELECT TAG FROM TAGS_BAIDANG WHERE MABD = ?";
//            PreparedStatement pstm = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
//            ResultSet rs = pstm.executeQuery();
//            
//            while (rs.next()) {
//                String tag = rs.getString("TAGS");
//                tags.add(tag);
//            }
//            
//            rs.close();
//            conn.close();
//        } catch (SQLException e) {
//            throw e;
//        }
//        
        /**
         * Mock
         */
//        tags.add("Beginner Friendly");
//        tags.add("Low/No Code");
//        tags.add("Social good");
        tags = new HashSet<>(java.util.Arrays.asList("Beginner Friendly", "Social Good", "Low/No Code"));
        return tags;
    }

    public static HashSet<String> getAllTags() throws SQLException {
        HashSet<String> tags = new HashSet<String>();

        String sql = "SELECT TAG FROM TAG_NAMES";

        try {
            Connection conn = ConnectionManager.getConnection();
            Statement stm = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()) {
                tags.add(rs.getString("TAG"));
            }

            rs.close();
            conn.close();
        } catch (SQLException e) {
            throw e;
        }

        return tags;
    }

    /**
     * Function meant for test-only purpose
     */
    public static void main(String[] args) {
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
