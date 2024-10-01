import java.sql.*;
import javax.swing.JOptionPane;

public class JAVA_Project extends javax.swing.JFrame{

    public JAVA_Project(){
        initComponents();
    }
    
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        view_frame = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usn = new javax.swing.JTextField();
        fetch_record = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dob = new javax.swing.JTextField();
        course = new javax.swing.JTextField();
        sem = new javax.swing.JTextField();
        year = new javax.swing.JTextField();
        clear = new javax.swing.JButton();
        insert_frame = new javax.swing.JInternalFrame();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        i_usn = new javax.swing.JTextField();
        i_name = new javax.swing.JTextField();
        i_dob = new javax.swing.JTextField();
        i_course = new javax.swing.JTextField();
        i_sem = new javax.swing.JTextField();
        i_year = new javax.swing.JTextField();
        insert = new javax.swing.JButton();
        update_frame = new javax.swing.JInternalFrame();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        u_usn = new javax.swing.JTextField();
        u_fetch_record = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        u_name = new javax.swing.JTextField();
        u_dob = new javax.swing.JTextField();
        u_course = new javax.swing.JTextField();
        u_sem = new javax.swing.JTextField();
        u_year = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        delete_frame = new javax.swing.JInternalFrame();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        d_usn = new javax.swing.JTextField();
        d_fetch_record = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        d_name = new javax.swing.JTextField();
        d_dob = new javax.swing.JTextField();
        d_course = new javax.swing.JTextField();
        d_sem = new javax.swing.JTextField();
        d_year = new javax.swing.JTextField();
        delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        view_frame.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        view_frame.setClosable(true);
        view_frame.setIconifiable(true);
        view_frame.setMaximizable(true);
        view_frame.setResizable(true);
        view_frame.setToolTipText("");
        view_frame.setVisible(true);

        jLabel1.setFont(new java.awt.Font("Helvetica", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VIEW");

        jLabel2.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Registration No / USN");

        fetch_record.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        fetch_record.setText("Fetch Record");
        fetch_record.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fetch_recordActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Student Name");

        jLabel4.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Date of Birth");

        jLabel5.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Course");

        jLabel6.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Semester");

        jLabel7.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Year");

        clear.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout view_frameLayout = new javax.swing.GroupLayout(view_frame.getContentPane());
        view_frame.getContentPane().setLayout(view_frameLayout);
        view_frameLayout.setHorizontalGroup(
            view_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(view_frameLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(view_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(view_frameLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(90, 90, 90)
                        .addComponent(usn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(view_frameLayout.createSequentialGroup()
                        .addGroup(view_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(view_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(year, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sem, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dob, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(name)
                            .addComponent(course))))
                .addGap(55, 55, 55))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, view_frameLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(view_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fetch_record)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, view_frameLayout.createSequentialGroup()
                        .addComponent(clear)
                        .addGap(22, 22, 22)))
                .addGap(188, 188, 188))
            .addGroup(view_frameLayout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        view_frameLayout.setVerticalGroup(
            view_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(view_frameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(view_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(usn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(fetch_record)
                .addGap(10, 10, 10)
                .addGroup(view_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(view_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(view_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(view_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(sem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(view_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(clear)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("VIEW", view_frame);

        insert_frame.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        insert_frame.setClosable(true);
        insert_frame.setIconifiable(true);
        insert_frame.setMaximizable(true);
        insert_frame.setResizable(true);
        insert_frame.setVisible(true);

        jLabel8.setFont(new java.awt.Font("Helvetica", 1, 20)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("INSERT");

        jLabel9.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Registration No / USN");

        jLabel10.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Student Name");

        jLabel11.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Date of Birth");

        jLabel12.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Course");

        jLabel13.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Semester");

        jLabel14.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Year");

        insert.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        insert.setText("INSERT");
        insert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout insert_frameLayout = new javax.swing.GroupLayout(insert_frame.getContentPane());
        insert_frame.getContentPane().setLayout(insert_frameLayout);
        insert_frameLayout.setHorizontalGroup(
            insert_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insert_frameLayout.createSequentialGroup()
                .addGroup(insert_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(insert_frameLayout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jLabel8))
                    .addGroup(insert_frameLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(insert_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                        .addGroup(insert_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(i_year, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(i_sem)
                            .addComponent(i_course)
                            .addComponent(i_dob)
                            .addComponent(i_name)
                            .addComponent(i_usn))))
                .addGap(55, 55, 55))
            .addGroup(insert_frameLayout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(insert)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        insert_frameLayout.setVerticalGroup(
            insert_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insert_frameLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(19, 19, 19)
                .addGroup(insert_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(i_usn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(insert_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(i_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(insert_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(i_dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(insert_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(i_course, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(insert_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(i_sem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(insert_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(i_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(insert)
                .addGap(15, 15, 15))
        );

        jTabbedPane1.addTab("INSERT", insert_frame);

        update_frame.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        update_frame.setClosable(true);
        update_frame.setIconifiable(true);
        update_frame.setMaximizable(true);
        update_frame.setResizable(true);
        update_frame.setVisible(true);

        jLabel15.setFont(new java.awt.Font("Helvetica", 1, 20)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("UPDATE");

        jLabel16.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Registration No / USN");

        u_fetch_record.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        u_fetch_record.setText("Fetch Record");
        u_fetch_record.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        u_fetch_record.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                u_fetch_recordActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Student Name");

        jLabel18.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Date of Birth");

        jLabel19.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Course");

        jLabel20.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Semester");

        jLabel21.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Year");

        update.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout update_frameLayout = new javax.swing.GroupLayout(update_frame.getContentPane());
        update_frame.getContentPane().setLayout(update_frameLayout);
        update_frameLayout.setHorizontalGroup(
            update_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(update_frameLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(update_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(update_frameLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                        .addComponent(u_usn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(update_frameLayout.createSequentialGroup()
                        .addGroup(update_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(update_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(u_year, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(u_sem)
                            .addComponent(u_course)
                            .addComponent(u_dob)
                            .addComponent(u_name))))
                .addGap(55, 55, 55))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, update_frameLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(u_fetch_record)
                .addGap(188, 188, 188))
            .addGroup(update_frameLayout.createSequentialGroup()
                .addGroup(update_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(update_frameLayout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(update_frameLayout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(update)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        update_frameLayout.setVerticalGroup(
            update_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(update_frameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addGroup(update_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(u_usn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(u_fetch_record)
                .addGap(10, 10, 10)
                .addGroup(update_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(u_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(update_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(u_dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(update_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(u_course, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(update_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(u_sem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(update_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(u_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(update)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("UPDATE", update_frame);

        delete_frame.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        delete_frame.setClosable(true);
        delete_frame.setIconifiable(true);
        delete_frame.setMaximizable(true);
        delete_frame.setResizable(true);
        delete_frame.setVisible(true);

        jLabel22.setFont(new java.awt.Font("Helvetica", 1, 20)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("DELETE");

        jLabel23.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Registration No / USN");

        d_fetch_record.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        d_fetch_record.setText("Fetch Record");
        d_fetch_record.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d_fetch_recordActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Student Name");

        jLabel25.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Date of Birth");

        jLabel26.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Course");

        jLabel27.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Semester");

        jLabel28.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Year");

        delete.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout delete_frameLayout = new javax.swing.GroupLayout(delete_frame.getContentPane());
        delete_frame.getContentPane().setLayout(delete_frameLayout);
        delete_frameLayout.setHorizontalGroup(
            delete_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delete_frameLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(delete_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(delete_frameLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                        .addComponent(d_usn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(delete_frameLayout.createSequentialGroup()
                        .addGroup(delete_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(delete_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(d_year, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(d_sem)
                            .addComponent(d_course)
                            .addComponent(d_dob)
                            .addComponent(d_name))))
                .addGap(55, 55, 55))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, delete_frameLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(d_fetch_record)
                .addGap(188, 188, 188))
            .addGroup(delete_frameLayout.createSequentialGroup()
                .addGroup(delete_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(delete_frameLayout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(delete_frameLayout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(delete)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        delete_frameLayout.setVerticalGroup(
            delete_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delete_frameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addGroup(delete_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(d_usn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(d_fetch_record)
                .addGap(10, 10, 10)
                .addGroup(delete_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(d_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(delete_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(d_dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(delete_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(d_course, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(delete_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(d_sem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(delete_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(d_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(delete)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("DELETE", delete_frame);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fetch_recordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fetch_recordActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn=DriverManager.getConnection("http://localhost:1433/student_record","SA","Naveen@7300");
            
            String sql, usn_id;
            usn_id = usn.getText();
            sql="select * from Student where USN='"+usn_id+"'";
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            if(!rs.next())
            JOptionPane.showMessageDialog(null,"No Such Record");
            else
            {
                name.setText(rs.getString("Student_Name"));
                dob.setText(rs.getString("Date_of_Birth"));
                course.setText(rs.getString("Course"));
                sem.setText(rs.getString("Semester"));
                year.setText(rs.getString("YEAR_"));
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error"+e.getMessage());
        }
    }//GEN-LAST:event_fetch_recordActionPerformed

    private void u_fetch_recordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_u_fetch_recordActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:1433/student_record","SA","Naveen@7300");
            String sql, usn_id;
            usn_id = usn.getText();
            sql="select * from Student where USN='"+usn_id+"'";
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            if(!rs.next())
            JOptionPane.showMessageDialog(null,"No Such Record");
            else
            {
                name.setText(rs.getString("Student_Name"));
                dob.setText(rs.getString("Date_of_Birth"));
                course.setText(rs.getString("Course"));
                sem.setText(rs.getString("Semester"));
                year.setText(rs.getString("YEAR_"));
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error"+e.getMessage());
        }
    }//GEN-LAST:event_u_fetch_recordActionPerformed

    private void d_fetch_recordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d_fetch_recordActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:1433/student_record","SA","Naveen@7300");
            String sql;
            int usnid;
            usnid = Integer.parseInt(usn.getText());
            sql="select * from Student where USN='"+usnid+"'";
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            if(!rs.next())
            JOptionPane.showMessageDialog(null,"No Such Record");
            else
            {
                name.setText(rs.getString("Student_Name"));
                dob.setText(rs.getString("Date_of_Birth"));
                course.setText(rs.getString("Course"));
                sem.setText(rs.getString("Semester"));
                year.setText(rs.getString("YEAR_"));
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error"+e.getMessage());
        }
    }//GEN-LAST:event_d_fetch_recordActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        usn.setText("");
        name.setText("");
        dob.setText("");
        course.setText("");
        sem.setText("");
        year.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        // TODO add your handling code here:
        try
        {
           Class.forName("java.sql.DriverManager");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:1433/student_record","sa","Naveen@7300");
           String usn_id, name, dob, course, sem, year, sql;
           usn_id = i_usn.getText();
           name = i_name.getText();
           dob = i_dob.getText();
           course = i_course.getText();
           sem = i_sem.getText();
           year = i_year.getText();
    
           sql="insert into Student values('"+usn_id+"','"+name+"',"+dob+",'"+course+"',"+sem+","+year+")";
           Statement st=con.createStatement();
           st.executeUpdate(sql);
           JOptionPane.showMessageDialog(null,"ITEM ADDED SUCCESSFULLY");
    
           i_usn.setText("");
           i_name.setText("");
           i_dob.setText("");
           i_course.setText("");
           i_sem.setText("");
           i_year.setText("");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_insertActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        try
          {
           Class.forName("");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:1433/student_record","SA","Naveen@7300");
           
           String iname, idob,icourse, isem, iyear, sql;
           String usn_id = u_usn.getText();
           iname = u_name.getText();       
           idob = u_dob.getText();
           icourse = u_course.getText();
           isem = u_sem.getText();
           iyear = u_year.getText();
           
           sql="update Student set Student_Name='"+iname+"',Date_of_Birth="+idob+",Course='"+icourse+"',Semester="+isem+",YEAR_="+iyear+" where USN='"+usn_id+"'";
           Statement st=con.createStatement();
           st.executeUpdate(sql);
           JOptionPane.showMessageDialog(null,"ITEM UPDATED");
          }
           catch(Exception e){
               JOptionPane.showMessageDialog(null,e.getMessage());
           }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        try
        {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost/student_record","SA","Naveen@7300");
           
           String usn_id,sql;
           usn_id=d_usn.getText();
           sql="delete from Student where USN='"+usn_id+"'";
           Statement st=con.createStatement();
           st.executeUpdate(sql);
           JOptionPane.showMessageDialog(null,"ITEM DELETED");
           
           d_usn.setText("");
           d_name.setText("");
           d_dob.setText("");
           d_course.setText("");
           d_sem.setText("");
           d_year.setText("");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_deleteActionPerformed

    public static void main(String args[]){
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run() {
                new JAVA_Project().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JTextField course;
    private javax.swing.JTextField d_course;
    private javax.swing.JTextField d_dob;
    private javax.swing.JButton d_fetch_record;
    private javax.swing.JTextField d_name;
    private javax.swing.JTextField d_sem;
    private javax.swing.JTextField d_usn;
    private javax.swing.JTextField d_year;
    private javax.swing.JButton delete;
    private javax.swing.JInternalFrame delete_frame;
    private javax.swing.JTextField dob;
    private javax.swing.JButton fetch_record;
    private javax.swing.JTextField i_course;
    private javax.swing.JTextField i_dob;
    private javax.swing.JTextField i_name;
    private javax.swing.JTextField i_sem;
    private javax.swing.JTextField i_usn;
    private javax.swing.JTextField i_year;
    private javax.swing.JButton insert;
    private javax.swing.JInternalFrame insert_frame;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField sem;
    private javax.swing.JTextField u_course;
    private javax.swing.JTextField u_dob;
    private javax.swing.JButton u_fetch_record;
    private javax.swing.JTextField u_name;
    private javax.swing.JTextField u_sem;
    private javax.swing.JTextField u_usn;
    private javax.swing.JTextField u_year;
    private javax.swing.JButton update;
    private javax.swing.JInternalFrame update_frame;
    private javax.swing.JTextField usn;
    private javax.swing.JInternalFrame view_frame;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}