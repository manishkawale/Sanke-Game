package com.Snake;

import javax.swing.*;

public class Frame extends JFrame {

    Frame()
    {
        this.setTitle("SankeGame");
        this.add(new Panel());
        this.setVisible(true);
        this.setResizable(false);
        this.pack();
    }

}
