package com.uiteco.swing;

import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JComponent;
import java.util.Vector;

/**
 *
 * @author nddmi
 */
public class DynamicPanel extends JPanel {

    private final CardLayout cardLayout;
    private final JPanel pageHolder;
    private final Vector<String> pageHistory;
    private static int historyIndex = 0;

    public DynamicPanel() {
        super();
        this.pageHistory = new Vector<String>();
        cardLayout = new CardLayout();
        pageHolder = new JPanel(cardLayout);
        this.add(pageHolder);
    }

    public void previousComponent() {
        if (historyIndex > 0) {
            String name = this.pageHistory.get(historyIndex - 1);
            this._showComponent(name);
            this.historyIndex--;
        }
    }

    public void nextComponent() {
        if (historyIndex < pageHistory.size()) {
            String name = this.pageHistory.get(historyIndex + 1);
            this._showComponent(name);
            this.historyIndex++;
        }
    }

    public void showComponent(String name) {
        // Clear page history after current spot
        int i = this.pageHistory.size() - 1;
        while (i >= this.historyIndex + 1) {
            this.pageHistory.remove(i);
            i--;
        }
        this._showComponent(name);
        this.pageHistory.add(name);
        this.historyIndex++;
    }

    public void registerComponent(JComponent comp, String name) {
        pageHolder.add(name, comp);
        if (this.pageHistory.size() == 0) {
            this.pageHistory.add(name);
        }
    }

    private void _showComponent(String name) {
        this.cardLayout.show(this.pageHolder, name);
    }
}
