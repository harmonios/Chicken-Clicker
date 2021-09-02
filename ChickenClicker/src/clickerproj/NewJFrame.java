package clickerproj;
import java.awt.Color;
import javax.swing.Timer;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class NewJFrame extends javax.swing.JFrame {
    double Chickens = 0;
    double curr_Chickens = 0;
    int clicks = 0;
    double cps = 0;
    boolean done = false;
    int upgrades_got = 0;
    double progress = 0;
    boolean isGold = false;
    
    double cost_multiplier = 1.23;
    double cost_multiplier_2 = 1.5;
    
    double clicker_helper_bonus = 0;
    double clicker_helper_cost = 10;
    double click_increase_cost = 100;
 
    double normal_clickers = 1;
    double click_val = 0;
        
    double Upgrade_1_Helper = 0;
    double Upgrade_1_Helper_bonus = 0;
    double Upgrade_1_Helper_Cost = 25;
    double Upgrade_1_increase_cost = 1000;
    
    double Upgrade_2_Helper = 0;
    double Upgrade_2_Helper_bonus = 0;
    double Upgrade_2_Helper_Cost = 50;
    double Upgrade_2_increase_cost = 2500;
    
    double Upgrade_3_Helper = 0;
    double Upgrade_3_Helper_bonus = 0;
    double Upgrade_3_Helper_Cost = 200;
    double Upgrade_3_increase_cost = 5000;
    
    double Upgrade_4_Helper = 0;
    double Upgrade_4_Helper_bonus = 0;
    double Upgrade_4_Helper_Cost = 2000;
    double Upgrade_4_increase_cost = 7000;
    
    double Upgrade_5_increase_cost = 12000;
    
    public NewJFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        Chicken_Button = new javax.swing.JLabel();
        Total_C_Label = new javax.swing.JLabel();
        Total_Clicks = new javax.swing.JLabel();
        CPS_Label = new javax.swing.JLabel();
        CPC_Label = new javax.swing.JLabel();
        Upgrades_Label = new javax.swing.JLabel();
        Current_Chicken_Label = new javax.swing.JLabel();
        Helpers = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        Clicker_Helper_Buy = new javax.swing.JButton();
        Clicker_Helper_Cost_Label = new javax.swing.JLabel();
        Upgrade_1_Helper_Buy = new javax.swing.JButton();
        Upgrade_1_Helper_Cost_Label = new javax.swing.JLabel();
        Upgrade_2_Helper_Buy = new javax.swing.JButton();
        Upgrade_2_Helper_Cost_Label = new javax.swing.JLabel();
        Upgrade_3_Helper_Cost_Label = new javax.swing.JLabel();
        Upgrade_3_Helper_Buy = new javax.swing.JButton();
        Upgrade_4_Helper_Buy = new javax.swing.JButton();
        Upgrade_4_Helper_Cost_Label1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane7 = new javax.swing.JTextPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextPane8 = new javax.swing.JTextPane();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextPane9 = new javax.swing.JTextPane();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextPane10 = new javax.swing.JTextPane();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextPane11 = new javax.swing.JTextPane();
        jScrollPane14 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        Clicker_Increase_Buy = new javax.swing.JButton();
        Clicker_Value_Label_Cost = new javax.swing.JLabel();
        upgrade_1_increase_buy = new javax.swing.JButton();
        upgrade_1_increase_label = new javax.swing.JLabel();
        upgrade_2_increase_buy = new javax.swing.JButton();
        upgrade_2_increase_label = new javax.swing.JLabel();
        upgrade_3_increase_buy = new javax.swing.JButton();
        upgrade_3_increase_label = new javax.swing.JLabel();
        upgrade_4_increase_buy = new javax.swing.JButton();
        upgrade_4_increase_label = new javax.swing.JLabel();
        All_Increase_buy = new javax.swing.JButton();
        All_Increase_label = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jScrollPane17 = new javax.swing.JScrollPane();
        jTextPane4 = new javax.swing.JTextPane();
        jScrollPane18 = new javax.swing.JScrollPane();
        jTextPane5 = new javax.swing.JTextPane();
        jScrollPane19 = new javax.swing.JScrollPane();
        jTextPane6 = new javax.swing.JTextPane();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Progress_Clicker = new javax.swing.JProgressBar();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane6.setViewportView(jTextArea5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(java.awt.Color.black);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel3.setBackground(java.awt.Color.black);
        jPanel3.setForeground(java.awt.Color.white);

        Chicken_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clickerproj/ImagesFile/Item_Fowl.png"))); // NOI18N
        Chicken_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Chicken_ButtonMouseClicked(evt);
            }
        });

        Total_C_Label.setForeground(java.awt.Color.white);
        Total_C_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Total_C_Label.setText("Total Cookies: 0");

        Total_Clicks.setForeground(java.awt.Color.white);
        Total_Clicks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Total_Clicks.setText("Total Clicks: 0");

        CPS_Label.setForeground(java.awt.Color.white);
        CPS_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CPS_Label.setText("Cookies Per Second: 0");

        CPC_Label.setBackground(java.awt.Color.white);
        CPC_Label.setForeground(java.awt.Color.white);
        CPC_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CPC_Label.setText("Cookies Per Click: 1");

        Upgrades_Label.setForeground(java.awt.Color.white);
        Upgrades_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Upgrades_Label.setText("Upgrades Bought: 0");

        Current_Chicken_Label.setForeground(java.awt.Color.white);
        Current_Chicken_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Current_Chicken_Label.setText("Current Cookies: 0");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel1.setBackground(new java.awt.Color(244, 228, 198));

        Clicker_Helper_Buy.setText("Buy!");
        Clicker_Helper_Buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clicker_Helper_BuyActionPerformed(evt);
            }
        });

        Clicker_Helper_Cost_Label.setText("Cost: 10");

        Upgrade_1_Helper_Buy.setText("Buy!");
        Upgrade_1_Helper_Buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Upgrade_1_Helper_BuyActionPerformed(evt);
            }
        });

        Upgrade_1_Helper_Cost_Label.setText("Cost: 25");

        Upgrade_2_Helper_Buy.setText("Buy!");
        Upgrade_2_Helper_Buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Upgrade_2_Helper_BuyActionPerformed(evt);
            }
        });

        Upgrade_2_Helper_Cost_Label.setText("Cost: 50");

        Upgrade_3_Helper_Cost_Label.setText("Cost: 200");

        Upgrade_3_Helper_Buy.setText("Buy!");
        Upgrade_3_Helper_Buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Upgrade_3_Helper_BuyActionPerformed(evt);
            }
        });

        Upgrade_4_Helper_Buy.setText("Buy!");
        Upgrade_4_Helper_Buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Upgrade_4_Helper_BuyActionPerformed(evt);
            }
        });

        Upgrade_4_Helper_Cost_Label1.setText("Cost: 2000");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clickerproj/ImagesFile/baster_1.JPG"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clickerproj/ImagesFile/oven.JPG"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clickerproj/ImagesFile/cook.JPG"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clickerproj/ImagesFile/forkknife.JPG"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clickerproj/ImagesFile/cookevil.JPG"))); // NOI18N

        jTextPane7.setEditable(false);
        jTextPane7.setText("Buy a baster to increase chicken output by 1 per click!  Get those chicken up and ready!");
        jScrollPane4.setViewportView(jTextPane7);

        jTextPane8.setEditable(false);
        jTextPane8.setText("Naturally generate a chicken every second by buying a new oven!  Ovens galore!");
        jScrollPane9.setViewportView(jTextPane8);

        jTextPane9.setEditable(false);
        jTextPane9.setText("Naturally generate 5 chickens every second by buying a new cook!  Better get cooking!");
        jScrollPane10.setViewportView(jTextPane9);

        jTextPane10.setEditable(false);
        jTextPane10.setText("Naturally generate a whole 20 chickens every second by buying a resturant! Better feed those stomachs.....");
        jScrollPane11.setViewportView(jTextPane10);

        jTextPane11.setEditable(false);
        jTextPane11.setText("Naturally generate a whole 100 chickens every second by buying a hellish oven!  Turn to the dark!");
        jScrollPane12.setViewportView(jTextPane11);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Upgrade_4_Helper_Cost_Label1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(Upgrade_4_Helper_Buy, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Upgrade_3_Helper_Buy, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Upgrade_3_Helper_Cost_Label))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Clicker_Helper_Cost_Label)
                            .addComponent(Clicker_Helper_Buy, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Upgrade_1_Helper_Buy, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Upgrade_2_Helper_Buy, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Upgrade_2_Helper_Cost_Label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Upgrade_1_Helper_Cost_Label))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Clicker_Helper_Buy, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Clicker_Helper_Cost_Label))
                    .addComponent(jScrollPane4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(Upgrade_1_Helper_Buy))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Upgrade_2_Helper_Buy)
                                .addGap(55, 55, 55)
                                .addComponent(Upgrade_2_Helper_Cost_Label))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Upgrade_1_Helper_Cost_Label))
                            .addComponent(jScrollPane9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane10)))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Upgrade_3_Helper_Buy)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addComponent(Upgrade_3_Helper_Cost_Label)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Upgrade_4_Helper_Buy)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Upgrade_4_Helper_Cost_Label1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane12))
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel1);

        Helpers.addTab("Helpers", jScrollPane1);

        jScrollPane14.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel2.setBackground(new java.awt.Color(244, 226, 198));

        Clicker_Increase_Buy.setText("Buy!");
        Clicker_Increase_Buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clicker_Increase_BuyActionPerformed(evt);
            }
        });

        Clicker_Value_Label_Cost.setText("Cost: 100");

        upgrade_1_increase_buy.setText("Buy!");
        upgrade_1_increase_buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upgrade_1_increase_buyActionPerformed(evt);
            }
        });

        upgrade_1_increase_label.setText("Cost: 1000");

        upgrade_2_increase_buy.setText("Buy!");
        upgrade_2_increase_buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upgrade_2_increase_buyActionPerformed(evt);
            }
        });

        upgrade_2_increase_label.setText("Cost: 2500");

        upgrade_3_increase_buy.setText("Buy!");
        upgrade_3_increase_buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upgrade_3_increase_buyActionPerformed(evt);
            }
        });

        upgrade_3_increase_label.setText("Cost: 5000");

        upgrade_4_increase_buy.setText("Buy!");
        upgrade_4_increase_buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upgrade_4_increase_buyActionPerformed(evt);
            }
        });

        upgrade_4_increase_label.setText("Cost: 7000");

        All_Increase_buy.setText("Buy!");
        All_Increase_buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                All_Increase_buyActionPerformed(evt);
            }
        });

        All_Increase_label.setText("Cost: 12000");

        jTextPane1.setEditable(false);
        jTextPane1.setText("Increases click value by 5% by increasing the flavour of the baste!");
        jScrollPane3.setViewportView(jTextPane1);

        jTextPane2.setEditable(false);
        jTextPane2.setText("Buy new grease oil and fuel to increase the oven's output by 5% ");
        jScrollPane8.setViewportView(jTextPane2);

        jTextPane3.setEditable(false);
        jTextPane3.setText("Increase the work experience required for cooks to find more worthy cooks, increasing their cooking yield by 5%!");
        jScrollPane16.setViewportView(jTextPane3);

        jTextPane4.setEditable(false);
        jTextPane4.setText("Upgrade the restaurant's cooking gear and outlook to increase the chickens made by 5%! ");
        jScrollPane17.setViewportView(jTextPane4);

        jTextPane5.setEditable(false);
        jTextPane5.setText("Imbue your blood, the ovens spawned from the unspeakable realm will magically increase their outputs by 5%!");
        jScrollPane18.setViewportView(jTextPane5);

        jTextPane6.setEditable(false);
        jTextPane6.setText("Increase and improve your marketing strategies by buying this to increase the yield of everything by 1.5%!");
        jScrollPane19.setViewportView(jTextPane6);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clickerproj/ImagesFile/baste.JPG"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clickerproj/ImagesFile/grease.JPG"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clickerproj/ImagesFile/XP.JPG"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clickerproj/ImagesFile/wrench.JPG"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clickerproj/ImagesFile/blood droplet.JPG"))); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clickerproj/ImagesFile/stockup.JPG"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Clicker_Increase_Buy, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Clicker_Value_Label_Cost))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(upgrade_1_increase_buy, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(upgrade_1_increase_label))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9))))
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(217, 217, 217)
                        .addComponent(jLabel13))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(46, 46, 46)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(upgrade_4_increase_buy, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(upgrade_4_increase_label)
                                .addComponent(All_Increase_buy, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(All_Increase_label)
                                .addComponent(upgrade_3_increase_label)
                                .addComponent(upgrade_3_increase_buy, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel12)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(46, 46, 46)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(upgrade_2_increase_label)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(upgrade_2_increase_buy, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel10))))
                        .addComponent(jLabel14)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Clicker_Increase_Buy)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Clicker_Value_Label_Cost))
                    .addComponent(jScrollPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(upgrade_1_increase_buy)
                        .addGap(67, 67, 67)
                        .addComponent(upgrade_1_increase_label))
                    .addComponent(jScrollPane8)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(upgrade_2_increase_buy)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(upgrade_2_increase_label))
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(upgrade_3_increase_buy)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(upgrade_3_increase_label))
                    .addComponent(jScrollPane17))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(upgrade_4_increase_buy)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(upgrade_4_increase_label))
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(All_Increase_buy)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(11, 11, 11))
                            .addComponent(All_Increase_label, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jScrollPane14.setViewportView(jPanel2);

        Helpers.addTab("Upgrades", jScrollPane14);

        Progress_Clicker.setMaximum(1000000000);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clickerproj/ImagesFile/Black_fire.gif"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clickerproj/ImagesFile/Black_fire.gif"))); // NOI18N

        jLabel15.setForeground(java.awt.Color.white);
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Get to 1,000,000 Chickens Cooked! (Current Progression: 0%)");
        jLabel15.setOpaque(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Progress_Clicker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Chicken_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CPC_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Total_Clicks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Upgrades_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Helpers))
                .addGap(76, 76, 76))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Total_C_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CPS_Label, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                                .addComponent(Current_Chicken_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Helpers, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(Total_Clicks)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Chicken_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CPC_Label)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Upgrades_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Total_C_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CPS_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Current_Chicken_Label)
                .addGap(3, 3, 3)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Progress_Clicker, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        Helpers.getAccessibleContext().setAccessibleName("Helpers");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    Timer clock = new Timer(1000, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            double total = ((1 * Upgrade_1_Helper) * (1 + Upgrade_1_Helper_bonus))
                    + ((5 * Upgrade_2_Helper) * (1 + Upgrade_2_Helper_bonus))
                    + ((20 * Upgrade_3_Helper) * (1 + Upgrade_3_Helper_bonus))
                    + ((100 * Upgrade_4_Helper) * (1 + Upgrade_4_Helper_bonus));
            Chickens = Chickens + ((1 * Upgrade_1_Helper) * (1 + Upgrade_1_Helper_bonus))
                    + ((5 * Upgrade_2_Helper) * (1 + Upgrade_2_Helper_bonus))
                    + ((20 * Upgrade_3_Helper) * (1 + Upgrade_3_Helper_bonus))
                    + ((100 * Upgrade_4_Helper) * (1 + Upgrade_4_Helper_bonus));
            curr_Chickens = curr_Chickens + ((1 * Upgrade_1_Helper) * (1 + Upgrade_1_Helper_bonus))
                    + ((5 * Upgrade_2_Helper) * (1 + Upgrade_2_Helper_bonus))
                    + ((20 * Upgrade_3_Helper) * (1 + Upgrade_3_Helper_bonus))
                    + ((100 * Upgrade_4_Helper) * (1 + Upgrade_4_Helper_bonus));
            Total_C_Label.setText(String.format("Total Chickens: %.2f", Chickens));
            CPS_Label.setText(String.format("Chickens Per Second: +%.2f", total));
            Current_Chicken_Label.setText(String.format("Current Chickens: %.2f", curr_Chickens));
            progress = 0;
            progress = curr_Chickens/1000000000;
            progress = progress * 100;
            jLabel15.setText(String.format("Get to 1,000,000 Chickens Cooked! Current Progression: %.2f", progress));
            int display_number = 0;
            display_number = (int) (curr_Chickens);
            Progress_Clicker.setValue(display_number);
            int value = Progress_Clicker.getValue();
            if (value >= 1000000000 && !done) {
                JOptionPane.showMessageDialog(null, "You are now a Chicken Monopoly (digitally), now go make yourself useful to the real life society.");
                done = true;
            }
        }
     }
    );
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        clock.start();
        CPC_Label.setBackground(Color.blue);
        CPC_Label.setOpaque(true);
        CPS_Label.setBackground(Color.blue);
        CPS_Label.setOpaque(true);
        Upgrades_Label.setBackground(Color.blue);
        Upgrades_Label.setOpaque(true);
        Total_C_Label.setBackground(Color.blue);
        Total_C_Label.setOpaque(true);
        Current_Chicken_Label.setBackground(Color.blue);
        Current_Chicken_Label.setOpaque(true);
        Total_Clicks.setBackground(Color.blue);
        Total_Clicks.setOpaque(true);
        jLabel15.setBackground(Color.blue);
        jLabel15.setOpaque(true);
    }//GEN-LAST:event_formWindowOpened

    private void All_Increase_buyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_All_Increase_buyActionPerformed
        if (curr_Chickens >= Upgrade_5_increase_cost) {
            curr_Chickens = curr_Chickens - Upgrade_5_increase_cost;
            Upgrade_1_Helper_bonus = Upgrade_1_Helper_bonus + 0.015;
            Upgrade_2_Helper_bonus = Upgrade_2_Helper_bonus + 0.015;
            Upgrade_3_Helper_bonus = Upgrade_3_Helper_bonus + 0.015;
            Upgrade_4_Helper_bonus = Upgrade_4_Helper_bonus + 0.015;
            clicker_helper_bonus = clicker_helper_bonus + 0.015;
            click_val = normal_clickers * (1 + clicker_helper_bonus);
            Upgrade_5_increase_cost  = Upgrade_5_increase_cost * cost_multiplier_2;
            All_Increase_label.setText(String.format("Cost: %.2f", Upgrade_5_increase_cost));
            CPC_Label.setText(String.format("Chickens Per Click: +%.2f", click_val));
            upgrades_got++;
            Upgrades_Label.setText("Upgades: " + upgrades_got);
            Current_Chicken_Label.setText(String.format("Current Chickens: %.2f", curr_Chickens));
        }
    }//GEN-LAST:event_All_Increase_buyActionPerformed

    private void upgrade_4_increase_buyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upgrade_4_increase_buyActionPerformed
        if (curr_Chickens >= Upgrade_4_increase_cost) {
            curr_Chickens = curr_Chickens - Upgrade_4_increase_cost;
            Upgrade_4_Helper_bonus = Upgrade_4_Helper_bonus + 0.05;
            Upgrade_4_increase_cost  = Upgrade_4_increase_cost * cost_multiplier_2;
            upgrade_4_increase_label.setText(String.format("Cost: %.2f", Upgrade_4_increase_cost));
            upgrades_got++;
            Upgrades_Label.setText("Upgades: " + upgrades_got);
            Current_Chicken_Label.setText(String.format("Current Chickens: %.2f", curr_Chickens));
        }
    }//GEN-LAST:event_upgrade_4_increase_buyActionPerformed

    private void upgrade_3_increase_buyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upgrade_3_increase_buyActionPerformed
        if (curr_Chickens >= Upgrade_3_increase_cost) {
            curr_Chickens = curr_Chickens - Upgrade_3_increase_cost;
            Upgrade_3_Helper_bonus = Upgrade_3_Helper_bonus + 0.05;
            Upgrade_3_increase_cost  = Upgrade_3_increase_cost * cost_multiplier_2;
            upgrade_3_increase_label.setText(String.format("Cost: %.2f", Upgrade_3_increase_cost));
            upgrades_got++;
            Upgrades_Label.setText("Upgades: " + upgrades_got);
            Current_Chicken_Label.setText(String.format("Current Chickens: %.2f", curr_Chickens));
        }
    }//GEN-LAST:event_upgrade_3_increase_buyActionPerformed

    private void upgrade_2_increase_buyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upgrade_2_increase_buyActionPerformed
        if (curr_Chickens >= Upgrade_2_increase_cost) {
            curr_Chickens = curr_Chickens - Upgrade_2_increase_cost;
            Upgrade_2_Helper_bonus = Upgrade_2_Helper_bonus + 0.05;
            Upgrade_2_increase_cost  = Upgrade_2_increase_cost * cost_multiplier_2;
            upgrade_2_increase_label.setText(String.format("Cost: %.2f", Upgrade_2_increase_cost));
            upgrades_got++;
            Upgrades_Label.setText("Upgades: " + upgrades_got);
            Current_Chicken_Label.setText(String.format("Current Chickens: %.2f", curr_Chickens));
        }
    }//GEN-LAST:event_upgrade_2_increase_buyActionPerformed

    private void upgrade_1_increase_buyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upgrade_1_increase_buyActionPerformed
        if (curr_Chickens >= Upgrade_1_increase_cost) {
            curr_Chickens = curr_Chickens - Upgrade_1_increase_cost;
            Upgrade_1_Helper_bonus = Upgrade_1_Helper_bonus + 0.05;
            Upgrade_1_increase_cost  = Upgrade_1_increase_cost * cost_multiplier_2;
            upgrade_1_increase_label.setText(String.format("Cost: %.2f", Upgrade_1_increase_cost));
            upgrades_got++;
            Upgrades_Label.setText("Upgades: " + upgrades_got);
            Current_Chicken_Label.setText(String.format("Current Chickens: %.2f", curr_Chickens));
        }
    }//GEN-LAST:event_upgrade_1_increase_buyActionPerformed

    private void Clicker_Increase_BuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clicker_Increase_BuyActionPerformed
        if (curr_Chickens >= click_increase_cost) {
            curr_Chickens = curr_Chickens - click_increase_cost;
            clicker_helper_bonus = clicker_helper_bonus + 0.05;
            click_increase_cost  = click_increase_cost * cost_multiplier_2;
            Clicker_Value_Label_Cost.setText(String.format("Cost: %.2f", click_increase_cost));
            click_val = normal_clickers * (1 + clicker_helper_bonus);
            CPC_Label.setText(String.format("Chickens Per Click: +%.2f", click_val));
            Current_Chicken_Label.setText(String.format("Current Chickens: %.2f", curr_Chickens));
        }
    }//GEN-LAST:event_Clicker_Increase_BuyActionPerformed

    private void Chicken_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Chicken_ButtonMouseClicked
        click_val = normal_clickers * (1 + clicker_helper_bonus) * 10000000;
        Chickens = click_val + Chickens;
        curr_Chickens = click_val + curr_Chickens;
        clicks++;
        Total_C_Label.setText(String.format("Total Chickens: %.2f", Chickens));
        Total_Clicks.setText("Total Clicks: " + clicks);
        Current_Chicken_Label.setText(String.format("Current Chickens: %.2f", curr_Chickens));
        int display_number = 0;
        display_number = (int) (curr_Chickens);
        Progress_Clicker.setValue(display_number);
        progress = 0;
        progress = curr_Chickens/1000000000;
        progress = progress * 100;
        jLabel15.setText(String.format("Get to 1,000,000 Chickens Cooked! (Current Progression: %.2f", progress));
        if (!isGold) {
            Chicken_Button.setIcon(new ImageIcon(getClass().getResource("/clickerproj/ImagesFile/Item_Fowl_onClick.png")));
            isGold = true;
        } else { 
            Chicken_Button.setIcon(new ImageIcon(getClass().getResource("/clickerproj/ImagesFile/Item_Fowl.png")));
            isGold = false;
        }
        Current_Chicken_Label.setText(String.format("Current Chickens: %.2f", curr_Chickens));
    }//GEN-LAST:event_Chicken_ButtonMouseClicked

    private void Upgrade_4_Helper_BuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Upgrade_4_Helper_BuyActionPerformed
        if (curr_Chickens >= Upgrade_4_Helper_Cost) {
            curr_Chickens = curr_Chickens - Upgrade_4_Helper_Cost;
            Upgrade_4_Helper++;
            Upgrade_4_Helper_Cost  = Upgrade_4_Helper_Cost * cost_multiplier;
            Upgrade_4_Helper_Cost_Label1.setText(String.format("Cost: %.2f", Upgrade_4_Helper_Cost));
        }
        Current_Chicken_Label.setText(String.format("Current Chickens: %.2f", curr_Chickens));
    }//GEN-LAST:event_Upgrade_4_Helper_BuyActionPerformed

    private void Upgrade_3_Helper_BuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Upgrade_3_Helper_BuyActionPerformed
        if (curr_Chickens >= Upgrade_3_Helper_Cost) {
            curr_Chickens = curr_Chickens - Upgrade_3_Helper_Cost;
            Upgrade_3_Helper++;
            Upgrade_3_Helper_Cost  = Upgrade_3_Helper_Cost * cost_multiplier;
            Upgrade_3_Helper_Cost_Label.setText(String.format("Cost: %.2f", Upgrade_3_Helper_Cost));
        }
        Current_Chicken_Label.setText(String.format("Current Chickens: %.2f", curr_Chickens));
    }//GEN-LAST:event_Upgrade_3_Helper_BuyActionPerformed

    private void Upgrade_2_Helper_BuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Upgrade_2_Helper_BuyActionPerformed
        if (curr_Chickens >= Upgrade_2_Helper_Cost) {
            curr_Chickens = curr_Chickens - Upgrade_2_Helper_Cost;
            Upgrade_2_Helper++;
            Upgrade_2_Helper_Cost  = Upgrade_2_Helper_Cost * cost_multiplier;
            Upgrade_2_Helper_Cost_Label.setText(String.format("Cost: %.2f", Upgrade_2_Helper_Cost));
        }
        Current_Chicken_Label.setText(String.format("Current Chickens: %.2f", curr_Chickens));
    }//GEN-LAST:event_Upgrade_2_Helper_BuyActionPerformed

    private void Upgrade_1_Helper_BuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Upgrade_1_Helper_BuyActionPerformed
        if (curr_Chickens >= Upgrade_1_Helper_Cost) {
            curr_Chickens = curr_Chickens - Upgrade_1_Helper_Cost;
            Upgrade_1_Helper++;
            Upgrade_1_Helper_Cost  = Upgrade_1_Helper_Cost * cost_multiplier;
            Upgrade_1_Helper_Cost_Label.setText(String.format("Cost: %.2f", Upgrade_1_Helper_Cost));
        }
        Current_Chicken_Label.setText(String.format("Current Chickens: %.2f", curr_Chickens));
    }//GEN-LAST:event_Upgrade_1_Helper_BuyActionPerformed

    private void Clicker_Helper_BuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clicker_Helper_BuyActionPerformed
        if (curr_Chickens >= clicker_helper_cost) {
            normal_clickers++;
            curr_Chickens = curr_Chickens - clicker_helper_cost;
            clicker_helper_cost  = clicker_helper_cost * cost_multiplier;
            Clicker_Helper_Cost_Label.setText(String.format("Cost: %.2f", clicker_helper_cost));
            click_val = normal_clickers * (1 + clicker_helper_bonus);
            CPC_Label.setText(String.format("Chickens Per Click: +%.2f", click_val));
        }
        Current_Chicken_Label.setText(String.format("Current Chickens: %.2f", curr_Chickens));
    }//GEN-LAST:event_Clicker_Helper_BuyActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton All_Increase_buy;
    private javax.swing.JLabel All_Increase_label;
    private javax.swing.JLabel CPC_Label;
    private javax.swing.JLabel CPS_Label;
    private javax.swing.JLabel Chicken_Button;
    private javax.swing.JButton Clicker_Helper_Buy;
    private javax.swing.JLabel Clicker_Helper_Cost_Label;
    private javax.swing.JButton Clicker_Increase_Buy;
    private javax.swing.JLabel Clicker_Value_Label_Cost;
    private javax.swing.JLabel Current_Chicken_Label;
    private javax.swing.JTabbedPane Helpers;
    private javax.swing.JProgressBar Progress_Clicker;
    private javax.swing.JLabel Total_C_Label;
    private javax.swing.JLabel Total_Clicks;
    private javax.swing.JButton Upgrade_1_Helper_Buy;
    private javax.swing.JLabel Upgrade_1_Helper_Cost_Label;
    private javax.swing.JButton Upgrade_2_Helper_Buy;
    private javax.swing.JLabel Upgrade_2_Helper_Cost_Label;
    private javax.swing.JButton Upgrade_3_Helper_Buy;
    private javax.swing.JLabel Upgrade_3_Helper_Cost_Label;
    private javax.swing.JButton Upgrade_4_Helper_Buy;
    private javax.swing.JLabel Upgrade_4_Helper_Cost_Label1;
    private javax.swing.JLabel Upgrades_Label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane10;
    private javax.swing.JTextPane jTextPane11;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JTextPane jTextPane4;
    private javax.swing.JTextPane jTextPane5;
    private javax.swing.JTextPane jTextPane6;
    private javax.swing.JTextPane jTextPane7;
    private javax.swing.JTextPane jTextPane8;
    private javax.swing.JTextPane jTextPane9;
    private javax.swing.JButton upgrade_1_increase_buy;
    private javax.swing.JLabel upgrade_1_increase_label;
    private javax.swing.JButton upgrade_2_increase_buy;
    private javax.swing.JLabel upgrade_2_increase_label;
    private javax.swing.JButton upgrade_3_increase_buy;
    private javax.swing.JLabel upgrade_3_increase_label;
    private javax.swing.JButton upgrade_4_increase_buy;
    private javax.swing.JLabel upgrade_4_increase_label;
    // End of variables declaration//GEN-END:variables
}
