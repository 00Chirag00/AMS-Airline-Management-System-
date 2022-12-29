//main class;Run this file...
package my.Package;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Client extends javax.swing.JFrame {
    public Client() {
        initComponents();
    }

    private void initComponents() {
       buttonGroup1 = new javax.swing.ButtonGroup();
        loginScreen = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        status = new javax.swing.JLabel();
        adminPanel = new javax.swing.JTabbedPane();
        search = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        departure = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        arrival = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        dispData = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        searchData = new javax.swing.JTable();
        addRemoveFlight = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        dept = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        arr = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        stat = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        idInput = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        hourInput = new javax.swing.JComboBox();
        minInput = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        seatInput = new javax.swing.JTextField();
        removeFlight = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        departure1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        arrival1 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        idText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        searchData2 = new javax.swing.JTable();
        error = new javax.swing.JLabel();
        bookSeat = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        bDept = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        bArr = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        bId = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jButton12 = new javax.swing.JButton();
        bStatus = new javax.swing.JLabel();
        checkReservation = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        cDept = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        cArr = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        cId = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        reservationData = new javax.swing.JTable();
        jButton13 = new javax.swing.JButton();
        cStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Airline Booking System");
        setPreferredSize(new java.awt.Dimension(600, 500));
       // setForeground(new Color(50,0,0));
         loginScreen.setBackground(new Color(0,255,255));
        loginScreen.setBorder(javax.swing.BorderFactory.createTitledBorder("Log In"));
        loginScreen.setPreferredSize(new java.awt.Dimension(600, 450));

        jLabel1.setText("User Name");

        jLabel2.setText("Password");

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        jButton1.setText("Log in as Guest");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Admin Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginScreenLayout = new javax.swing.GroupLayout(loginScreen);
        loginScreen.setLayout(loginScreenLayout);
        loginScreenLayout.setHorizontalGroup(
            loginScreenLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(loginScreenLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(loginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(loginScreenLayout.createSequentialGroup()
                        .addGroup(loginScreenLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(32, 32, 32)
                        .addGroup(loginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(username)))
                    .addGroup(loginScreenLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(loginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(loginScreenLayout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)))))
                .addContainerGap(290, Short.MAX_VALUE))
        );
        loginScreenLayout.setVerticalGroup(
            loginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginScreenLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(loginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(loginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(loginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(246, Short.MAX_VALUE))
        );

        adminPanel.setPreferredSize(new java.awt.Dimension(600, 500));

       // search.setPreferredSize(new java.awt.Dimension(600, 500));

        jLabel3.setText("Departure");

        jLabel4.setText("Arrival");

        jButton8.setText("Search");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dispDataLayout = new javax.swing.GroupLayout(dispData);
        dispData.setLayout(dispDataLayout);
        dispDataLayout.setHorizontalGroup(
            dispDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        dispDataLayout.setVerticalGroup(
            dispDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        searchData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight", "From", "Time", "To", "Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        searchData.getTableHeader().setReorderingAllowed(true);
        searchData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(searchData);

        javax.swing.GroupLayout searchLayout = new javax.swing.GroupLayout(search);
        search.setLayout(searchLayout);
        searchLayout.setHorizontalGroup(
            searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(searchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(departure, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(arrival, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchLayout.createSequentialGroup()
                        .addComponent(dispData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(searchLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        searchLayout.setVerticalGroup(
            searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(departure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrival, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(dispData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        adminPanel.addTab("Search For a Flight", search);

        addRemoveFlight.setPreferredSize(new java.awt.Dimension(600, 500));

        jLabel5.setText("Departure");

        jLabel6.setText("Arrival");

        arr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arrActionPerformed(evt);
            }
        });

        jButton9.setText("Add Flight");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel7.setText("ID");

        jLabel8.setText("Departure Time");

        hourInput.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24" }));

        minInput.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60" }));
        minInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minInputActionPerformed(evt);
            }
        });

        jLabel9.setText("Seats");

        seatInput.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout addRemoveFlightLayout = new javax.swing.GroupLayout(addRemoveFlight);
        addRemoveFlight.setLayout(addRemoveFlightLayout);
        addRemoveFlightLayout.setHorizontalGroup(
            addRemoveFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addRemoveFlightLayout.createSequentialGroup()
                .addGap(0, 124, Short.MAX_VALUE)
                .addGroup(addRemoveFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton9)
                    .addGroup(addRemoveFlightLayout.createSequentialGroup()
                        .addGroup(addRemoveFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addGap(67, 67, 67)
                        .addGroup(addRemoveFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(arr)
                            .addComponent(dept)
                            .addComponent(idInput)
                            .addGroup(addRemoveFlightLayout.createSequentialGroup()
                                .addComponent(hourInput, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addComponent(minInput, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(seatInput))))
                .addGap(129, 129, 129))
            .addGroup(addRemoveFlightLayout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(stat, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addRemoveFlightLayout.setVerticalGroup(
            addRemoveFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addRemoveFlightLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(addRemoveFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(addRemoveFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(addRemoveFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(17, 17, 17)
                .addGroup(addRemoveFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(hourInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addRemoveFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(seatInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(stat, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        adminPanel.addTab("Add Flights", addRemoveFlight);

        removeFlight.setPreferredSize(new java.awt.Dimension(600, 500));

        jLabel13.setText("Departure");

        jLabel14.setText("Arrival");

        jButton11.setText("Search");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton10.setText("Delete");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        idText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextActionPerformed(evt);
            }
        });

        jLabel10.setText("Enter ID");

        searchData2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight", "From", "Time", "To", "Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        searchData2.getTableHeader().setReorderingAllowed(false);
        searchData2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchData2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(searchData2);

        javax.swing.GroupLayout removeFlightLayout = new javax.swing.GroupLayout(removeFlight);
        removeFlight.setLayout(removeFlightLayout);
        removeFlightLayout.setHorizontalGroup(
            removeFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeFlightLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(removeFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(removeFlightLayout.createSequentialGroup()
                        .addGroup(removeFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(removeFlightLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, removeFlightLayout.createSequentialGroup()
                        .addGroup(removeFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(removeFlightLayout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(departure1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(arrival1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)))
                        .addGap(26, 26, 26))))
        );
        removeFlightLayout.setVerticalGroup(
            removeFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeFlightLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(removeFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(departure1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrival1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(removeFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10))
                .addContainerGap(158, Short.MAX_VALUE))
        );

        adminPanel.addTab("Remove Flight", removeFlight);

        bookSeat.setPreferredSize(new java.awt.Dimension(600, 500));

        jLabel11.setText("Departure");

        jLabel12.setText("Arrival");

        jLabel15.setText("ID");

        jLabel16.setText("Name");

        jLabel17.setText("Age");

        jLabel18.setText("Phone");

        jLabel19.setText("sex");

        buttonGroup1.add(male);
        male.setText("Male");

        buttonGroup1.add(female);
        female.setText("Female");

        jButton12.setText("Submit");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bookSeatLayout = new javax.swing.GroupLayout(bookSeat);
        bookSeat.setLayout(bookSeatLayout);
        bookSeatLayout.setHorizontalGroup(
            bookSeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookSeatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bookSeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel18)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16)
                    .addComponent(jLabel11))
                .addGroup(bookSeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bookSeatLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(bookSeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bookSeatLayout.createSequentialGroup()
                                .addComponent(male)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(female))
                            .addGroup(bookSeatLayout.createSequentialGroup()
                                .addGroup(bookSeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(name)
                                    .addComponent(age)
                                    .addComponent(phone, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                                .addGap(37, 37, 37)
                                .addComponent(bStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(bookSeatLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(bDept, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bookSeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bookSeatLayout.createSequentialGroup()
                                .addComponent(bArr, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bId, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bookSeatLayout.setVerticalGroup(
            bookSeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookSeatLayout.createSequentialGroup()
                .addGroup(bookSeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bookSeatLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(bookSeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(bDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(bArr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(bId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(bookSeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(bookSeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(26, 26, 26)
                        .addGroup(bookSeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookSeatLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(bStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(bookSeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(male)
                    .addComponent(female))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton12)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        adminPanel.addTab("Book a Seat", bookSeat);

        checkReservation.setPreferredSize(new java.awt.Dimension(600, 500));

        jLabel20.setText("Departure");

        jLabel21.setText("Arrival");

        cArr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cArrActionPerformed(evt);
            }
        });

        jLabel22.setText("ID");

        cId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cIdActionPerformed(evt);
            }
        });

        reservationData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Age", "Phone", "Sex"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        reservationData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reservationDataMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(reservationData);

        jButton13.setText("Search");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout checkReservationLayout = new javax.swing.GroupLayout(checkReservation);
        checkReservation.setLayout(checkReservationLayout);
        checkReservationLayout.setHorizontalGroup(
            checkReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkReservationLayout.createSequentialGroup()
                .addGroup(checkReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(checkReservationLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(cStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, checkReservationLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(checkReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(checkReservationLayout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(18, 18, 18)
                                .addComponent(cDept, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21)
                                .addGap(18, 18, 18)
                                .addComponent(cArr, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cId, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        checkReservationLayout.setVerticalGroup(
            checkReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkReservationLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(checkReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(cDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(cArr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(cId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(checkReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton13)
                    .addComponent(cStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(148, Short.MAX_VALUE))
        );

        adminPanel.addTab("Check Reservation", checkReservation);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(loginScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(adminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginScreen, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(adminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

     String stat = source.Client1.logA(username.getText(),String.valueOf(password.getPassword()));
     status.setText(stat);
     if(stat.split(" ")[0].equalsIgnoreCase("Welcome")){
         obj.loginScreen.setVisible(false);
         obj.adminPanel.setVisible(true);
         obj.remove(loginScreen);
       //  obj.add(adminPanel);
         obj.revalidate();
         obj.repaint();
         obj.setVisible(true);
     } else {
     }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String dept = departure.getText();
        String arr = arrival.getText();
        DefaultTableModel model = (DefaultTableModel)searchData.getModel();
        model.setRowCount(0);
        if(!dept.equals("") && !arr.equals("")){
            source.Client1.gr.disp3(arr,dept,model);
        }
        else if(dept.equals("") && !arr.equals("")){
            source.Client1.gr.disp2(arr,model);
        }
        else if(!dept.equals("") && arr.equals("")){
            
            javax.swing.JLabel jb = source.Client1.gr.disp(dept,model);
            obj.dispData.add(jb);
            obj.revalidate();
            obj.repaint();
        }
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void arrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arrActionPerformed
    }//GEN-LAST:event_arrActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String output = source.Client1.gr.AddFlight(dept.getText(),arr.getText(),idInput.getText(),hourInput.getSelectedIndex()+1,minInput.getSelectedIndex(),Integer.parseInt(seatInput.getText()));
        stat.setText(output);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void minInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minInputActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
         String depttext = departure1.getText();
        String arrtext = arrival1.getText();
        DefaultTableModel model = (DefaultTableModel)searchData2.getModel();
        model.setRowCount(0);
        if(!depttext.equals("") && !arrtext.equals("")){
            source.Client1.gr.disp3(arrtext,depttext,model);
        }
        else if(depttext.equals("") && !arrtext.equals("")){
            source.Client1.gr.disp2(arrtext,model);
        }
        else if(!depttext.equals("") && arrtext.equals("")){
            
            javax.swing.JLabel jb = source.Client1.gr.disp(depttext,model);
            obj.removeFlight.add(jb);
            obj.revalidate();
            obj.repaint();
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        String iddata=idText.getText();
        String depttext=departure1.getText();
        String arrtext=arrival1.getText();
        if(depttext.equals("")||arrtext.equals(""))
            error.setText("Please enter both the cities.");
        else{
            source.Client1.gr.deleteFlight(depttext, arrtext, iddata, stat);
            error.setText("Flight Deleted");
            jButton11.doClick();
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void idTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextActionPerformed

    private void searchDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchDataMouseClicked
        // TODO add your handling code here:
        menu = new JPopupMenu(" POPUP");
        JMenuItem item1=new JMenuItem("Book a Ticket");
        JMenuItem item2=new JMenuItem("Get Details");
        item1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                int row=searchData.getSelectedRow();
                bDept.setText(searchData.getValueAt(row, 1).toString());
                bArr.setText(searchData.getValueAt(row, 3).toString());
                bId.setText(searchData.getValueAt(row, 0).toString());
              //  adminPanel.setSelectedIndex(3);
                adminPanel.setSelectedComponent(bookSeat);
            }
        });
        item2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                int row=searchData.getSelectedRow();
                cDept.setText(searchData.getValueAt(row, 1).toString());
                cArr.setText(searchData.getValueAt(row, 3).toString());
                cId.setText(searchData.getValueAt(row, 0).toString());
                jButton13.doClick();
                adminPanel.setSelectedIndex(4);
            }
        });
        menu.add(item1);
        menu.add(item2);
        menu.show(evt.getComponent(), evt.getX(), evt.getY());
    }//GEN-LAST:event_searchDataMouseClicked

    private void searchData2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchData2MouseClicked
        // TODO add your handling code here:
        int row=searchData2.getSelectedRow();
        String id=searchData2.getValueAt(row, 0).toString();
        idText.setText(id);
    }//GEN-LAST:event_searchData2MouseClicked

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        String n=name.getText();
        int a =Integer.parseInt(age.getText());
        String p=phone.getText();
        String s;
        if(male.isSelected())
            s="M";
        else
            s="F";
        String output=source.Client1.gr.bookSeat(bDept.getText(),bArr.getText(),bId.getText(),n,a,p,s);
        output="<html>"+output+"</html>";
        bStatus.setText(output);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void cArrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cArrActionPerformed
        // TODO addyour handling code here:
    }//GEN-LAST:event_cArrActionPerformed

    private void cIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cIdActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)reservationData.getModel();
        model.setRowCount(0);
        String dept=cDept.getText();
        String arr=cArr.getText();
        String id=cId.getText();
        source.Client1.gr.getList(dept,arr,id,model);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void reservationDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservationDataMouseClicked
        // TODO add your handling code here:
        JPopupMenu options = new JPopupMenu();
        JMenuItem item1 = new JMenuItem("Cancel Reservation");
        options.add(item1);
        item1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                String dept=cDept.getText();
                String arr=cArr.getText();
                String id=cId.getText();
                int row=reservationData.getSelectedRow();
                String n=reservationData.getValueAt(row, 0).toString();
                String cStat=source.Client1.gr.cancelSeat(dept,arr,id,n);
                cStat="<html>"+cStat+"</html>";
                cStatus.setText(cStat);
                jButton13.doClick();
            }
        });
        options.show(evt.getComponent(), evt.getX(), evt.getY());
    }//GEN-LAST:event_reservationDataMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        obj.loginScreen.setVisible(false);
         obj.adminPanel.setVisible(true);
           adminPanel.remove(addRemoveFlight);
           adminPanel.remove(removeFlight);
           adminPanel.remove(checkReservation);
         obj.remove(loginScreen);
       //  obj.add(adminPanel);
         obj.revalidate();
         obj.repaint();
         obj.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               obj= new Client();
              // obj.control.show(true);
             //  obj.getContentPane().show("card2");
               obj.adminPanel.setVisible(false);
               obj.setVisible(true);
            }
        });
    }
    public static Client obj;
    private javax.swing.JPopupMenu menu;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addRemoveFlight;
    private javax.swing.JTabbedPane adminPanel;
    private javax.swing.JTextField age;
    private javax.swing.JTextField arr;
    private javax.swing.JTextField arrival;
    private javax.swing.JTextField arrival1;
    private javax.swing.JTextField bArr;
    private javax.swing.JTextField bDept;
    private javax.swing.JTextField bId;
    private javax.swing.JLabel bStatus;
    private javax.swing.JPanel bookSeat;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cArr;
    private javax.swing.JTextField cDept;
    private javax.swing.JTextField cId;
    private javax.swing.JLabel cStatus;
    private javax.swing.JPanel checkReservation;
    private javax.swing.JTextField departure;
    private javax.swing.JTextField departure1;
    private javax.swing.JTextField dept;
    private javax.swing.JPanel dispData;
    private javax.swing.JLabel error;
    private javax.swing.JRadioButton female;
    private javax.swing.JComboBox hourInput;
    private javax.swing.JTextField idInput;
    private javax.swing.JTextField idText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel loginScreen;
    private javax.swing.JRadioButton male;
    private javax.swing.JComboBox minInput;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField phone;
    private javax.swing.JPanel removeFlight;
    private javax.swing.JTable reservationData;
    private javax.swing.JPanel search;
    private javax.swing.JTable searchData;
    private javax.swing.JTable searchData2;
    private javax.swing.JTextField seatInput;
    private javax.swing.JLabel stat;
    private javax.swing.JLabel status;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
