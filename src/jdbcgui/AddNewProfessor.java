package jdbcgui;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AddNewProfessor extends javax.swing.JFrame {

    /**
     * Creates new form AddNewProfessor
     */
    myDBCon dbCon;
    ResultSet rs;
    LoginUser luser;

    public AddNewProfessor(LoginUser user) {
        initComponents();
        luser = user;

        // center form in screen 
        this.setLocationRelativeTo(null);
        dbCon = new myDBCon();

        try {

            rs = dbCon.executeStatement("SELECT deptid FROM department ORDER BY deptid asc");
            while (rs.next()) {
                String deptID = rs.getString("deptid");
                jCBDeptID.addItem(deptID);
            }
        } catch (SQLException e) {
        }

        // set all error labels to invisible
        clearErrorLabels();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtOfficeLoc = new javax.swing.JTextField();
        txtFName = new javax.swing.JTextField();
        btnAddNewEmp = new javax.swing.JButton();
        lblConfirmPasswordError = new javax.swing.JLabel();
        lblPasswordError = new javax.swing.JLabel();
        lblFNameError = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtConfirmPassword = new javax.swing.JPasswordField();
        togglePwd = new javax.swing.JCheckBox();
        lblUserIDError = new javax.swing.JLabel();
        txtUserID = new javax.swing.JTextField();
        txtLName = new javax.swing.JTextField();
        lblLNameError = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblEmailError = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblUsernameError = new javax.swing.JLabel();
        txtPhoneNo = new javax.swing.JTextField();
        lblPhoneNoError = new javax.swing.JLabel();
        lblOfficeLocError = new javax.swing.JLabel();
        jCBDeptID = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New Login User");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Add New Professor");

        txtOfficeLoc.setBackground(new java.awt.Color(242, 242, 242));
        txtOfficeLoc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtOfficeLoc.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Office Location"));

        txtFName.setBackground(new java.awt.Color(242, 242, 242));
        txtFName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtFName.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "First Name"));

        btnAddNewEmp.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        btnAddNewEmp.setText("Add New");
        btnAddNewEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewEmpActionPerformed(evt);
            }
        });

        lblConfirmPasswordError.setBackground(new java.awt.Color(255, 255, 255));
        lblConfirmPasswordError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblConfirmPasswordError.setForeground(new java.awt.Color(255, 0, 0));
        lblConfirmPasswordError.setText("error label");

        lblPasswordError.setBackground(new java.awt.Color(255, 255, 255));
        lblPasswordError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblPasswordError.setForeground(new java.awt.Color(255, 0, 0));
        lblPasswordError.setText("error label");

        lblFNameError.setBackground(new java.awt.Color(255, 255, 255));
        lblFNameError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblFNameError.setForeground(new java.awt.Color(255, 0, 0));
        lblFNameError.setText("error label");

        txtPassword.setBackground(new java.awt.Color(242, 242, 242));
        txtPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPassword.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Password"));

        txtConfirmPassword.setBackground(new java.awt.Color(242, 242, 242));
        txtConfirmPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtConfirmPassword.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Confirm Password"));

        togglePwd.setText("👁");
        togglePwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togglePwdActionPerformed(evt);
            }
        });

        lblUserIDError.setBackground(new java.awt.Color(255, 255, 255));
        lblUserIDError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblUserIDError.setForeground(new java.awt.Color(255, 0, 0));
        lblUserIDError.setText("error label");

        txtUserID.setBackground(new java.awt.Color(242, 242, 242));
        txtUserID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtUserID.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "UserID"));

        txtLName.setBackground(new java.awt.Color(242, 242, 242));
        txtLName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtLName.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Last Name"));

        lblLNameError.setBackground(new java.awt.Color(255, 255, 255));
        lblLNameError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblLNameError.setForeground(new java.awt.Color(255, 0, 0));
        lblLNameError.setText("error label");

        txtEmail.setBackground(new java.awt.Color(242, 242, 242));
        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Email"));

        lblEmailError.setBackground(new java.awt.Color(255, 255, 255));
        lblEmailError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblEmailError.setForeground(new java.awt.Color(255, 0, 0));
        lblEmailError.setText("error label");

        txtUsername.setBackground(new java.awt.Color(242, 242, 242));
        txtUsername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtUsername.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Username"));

        lblUsernameError.setBackground(new java.awt.Color(255, 255, 255));
        lblUsernameError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblUsernameError.setForeground(new java.awt.Color(255, 0, 0));
        lblUsernameError.setText("error label");

        txtPhoneNo.setBackground(new java.awt.Color(242, 242, 242));
        txtPhoneNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPhoneNo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Phone Number"));

        lblPhoneNoError.setBackground(new java.awt.Color(255, 255, 255));
        lblPhoneNoError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblPhoneNoError.setForeground(new java.awt.Color(255, 0, 0));
        lblPhoneNoError.setText("error label");

        lblOfficeLocError.setBackground(new java.awt.Color(255, 255, 255));
        lblOfficeLocError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblOfficeLocError.setForeground(new java.awt.Color(255, 0, 0));
        lblOfficeLocError.setText("error label");

        jCBDeptID.setFont(new java.awt.Font("Hack", 0, 18)); // NOI18N
        jCBDeptID.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Department ID"));
        jCBDeptID.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtConfirmPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(togglePwd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jCBDeptID, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAddNewEmp)
                                .addComponent(txtOfficeLoc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblUserIDError, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(lblUsernameError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFNameError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLNameError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPasswordError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblConfirmPasswordError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmailError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPhoneNoError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblOfficeLocError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblUserIDError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(5, 5, 5)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblUsernameError, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblFNameError, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblLNameError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPasswordError, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(togglePwd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblConfirmPasswordError, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmailError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPhoneNoError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(5, 5, 5)))
                        .addComponent(txtOfficeLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblOfficeLocError, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCBDeptID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddNewEmp)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Change the label name to match the GUI

    private boolean isDuplicate(String userID) throws SQLException {
        String stmtSQL = "SELECT userid FROM \"USER\" WHERE userid = " + userID;
        rs = dbCon.executeStatement(stmtSQL);
        return rs.isBeforeFirst();
    }
    
    private void clearErrorLabels() {
        // erase error label text and set visibility to false 
        lblUserIDError.setText("");
        lblFNameError.setText("");
        lblLNameError.setText("");
        lblPasswordError.setText("");
        lblEmailError.setText("");
        lblConfirmPasswordError.setText("");
        lblOfficeLocError.setText("");
        lblPhoneNoError.setText("");
        lblUsernameError.setText("");
    }
    
    private boolean isDuplicateUserID(String userid) throws SQLException {
        String stmtSQL = "SELECT * FROM \"USER\" WHERE userid = " + userid;
        ResultSet rs2 = dbCon.executeStatement(stmtSQL);
        return rs2.isBeforeFirst();
    }
    
private boolean isValidData() throws SQLException {
    boolean result = true;
    String userID = txtUserID.getText().trim();
    String fName = txtFName.getText().trim();
    String lName = txtLName.getText().trim();
    String officeLoc = txtOfficeLoc.getText().trim();
    String phoneNo = txtPhoneNo.getText().trim();
    String username = txtUsername.getText().trim();
    String email = txtEmail.getText().trim();
    String password = txtPassword.getText().trim();
    String confirmPassword = txtConfirmPassword.getText().trim();

    if (userID.isEmpty() || !isInteger(userID) || isDuplicateUserID(userID) || userID.length() > 38) {
        lblUserIDError.setVisible(true);
        lblUserIDError.setText(userID.isEmpty() ? "Required." : userID.length() > 38 ? "Must be an integer." : "UserID already exists.");
        result = false;
    }

    if (fName.isEmpty() || fName.length() > 30) {
        lblFNameError.setVisible(true);
        lblFNameError.setText(fName.isEmpty() ? "Required." : "Must be < 30 chars.");
        result = false;
    }

    if (lName.isEmpty() || lName.length() > 30) {
        lblLNameError.setVisible(true);
        lblLNameError.setText(lName.isEmpty() ? "Required." : "Must be < 30 chars.");
        result = false;
    }

    if (officeLoc.isEmpty() || officeLoc.length() > 30) {
        lblOfficeLocError.setVisible(true);
        lblOfficeLocError.setText(officeLoc.isEmpty() ? "Required." : "Must be < 30 chars.");
        result = false;
    }

    if (phoneNo.isEmpty() || phoneNo.length() > 15) {
        lblPhoneNoError.setVisible(true);
        lblPhoneNoError.setText(phoneNo.isEmpty() ? "Required." : "Must be < 15 chars.");
        result = false;
    }

    if (username.isEmpty() || username.length() > 20) {
        lblUsernameError.setVisible(true);
        lblUsernameError.setText(username.isEmpty() ? "Required." : "Must be < 20 chars.");
        result = false;
    }

    if (email.isEmpty() || email.length() > 20) {
        lblEmailError.setVisible(true);
        lblEmailError.setText(email.isEmpty() ? "Required." : "Must be < 20 chars.");
        result = false;
    }

    if (password.isEmpty() || password.length() > 25) {
        lblPasswordError.setVisible(true);
        lblPasswordError.setText(password.isEmpty() ? "Required." : "Must be < 25 chars.");
        result = false;
    }

    if (!confirmPassword.equals(password) || confirmPassword.isEmpty() || confirmPassword.length() > 25) {
        lblConfirmPasswordError.setVisible(true);
        lblConfirmPasswordError.setText(confirmPassword.isEmpty() ? "Required." : confirmPassword.length() > 25 ? "Must be < 25 chars." : "Passwords do not match.");
        result = false;
    }

    return result;
}


    private void clearInputBoxes() {
        // Clear text fields
        txtFName.setText("");
        txtOfficeLoc.setText("");
        txtPassword.setText("");
        txtConfirmPassword.setText("");
        txtUserID.setText("");
        txtLName.setText("");
        txtEmail.setText("");
        txtPhoneNo.setText("");
        txtUsername.setText("");
    }

    private boolean isValidUsername(String username) {
        boolean result = true;
        try {

            ResultSet newrs;
            newrs = dbCon.executeStatement("SELECT * FROM \"USER\" where username = '" + username + "'");

            if (newrs.isBeforeFirst()) {
                result = false;
            }
            newrs.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return result;
    }

    private void updateLogs(String action) {
        try {
            String prepSQL = "INSERT INTO log VALUES (?,?,?,SYSTIMESTAMP)";
            PreparedStatement preparedStatement = dbCon.prepareStatement(prepSQL);
            preparedStatement.setInt(1, luser.userid);
            preparedStatement.setString(2, luser.username);
            preparedStatement.setString(3, action);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error inserting the logs.");
        }
    }

    private void btnAddNewEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewEmpActionPerformed
        // verify input data        
        // verify that new user does not currently exist 
        // if all validations are successful then enter the new user
        try {

            clearErrorLabels();
            if (isValidData() && !isDuplicate(txtUserID.getText().trim())) {

                String prepSQL = "INSERT INTO \"USER\" (userid, username, fname, lname, password, email, usertype) "
                        + "VALUES (?, ?, ?, ?, ?, ?, 1)";
                PreparedStatement prepStmt = dbCon.prepareStatement(prepSQL);

                prepStmt.setInt(1, Integer.parseInt(txtUserID.getText().trim()));
                prepStmt.setString(2, txtUsername.getText().trim());
                prepStmt.setString(3, txtFName.getText().trim());
                prepStmt.setString(4, txtLName.getText().trim());
                prepStmt.setString(5, txtPassword.getText().trim());
                prepStmt.setString(6, txtEmail.getText().trim());

                String prepSQL2 = "INSERT INTO professor (officeloc, phoneno, deptid, profid) "
                        + "VALUES (?, ?, ?, ?)";

                PreparedStatement prepStmt2 = dbCon.prepareStatement(prepSQL2);

                prepStmt2.setString(1, txtOfficeLoc.getText().trim());
                prepStmt2.setString(2, txtPhoneNo.getText().trim());
                prepStmt2.setInt(3, Integer.parseInt(jCBDeptID.getSelectedItem().toString()));
                prepStmt2.setInt(4, Integer.parseInt(txtUserID.getText().trim()));

                int result = prepStmt.executeUpdate();
                int result2 = prepStmt2.executeUpdate();

                if (result > 0 && result2 > 0) {
                    String action = "New user professor added with id " + txtUserID.getText().trim();
                    updateLogs(action);

                    javax.swing.JLabel label = new javax.swing.JLabel("New user professor added successfully.");
                    label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                    JOptionPane.showMessageDialog(null, label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                    clearInputBoxes();
                }

                rs.close();
            } else if (!isValidData()) {
                javax.swing.JLabel label = new javax.swing.JLabel("Please fix validation errors...");
                label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                javax.swing.JLabel label = new javax.swing.JLabel("UserID already exits.");
                label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error adding new user.");
        }

    }//GEN-LAST:event_btnAddNewEmpActionPerformed

    private boolean isInteger(String s) {
        try {
            Integer.valueOf(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    private void togglePwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togglePwdActionPerformed
        if (togglePwd.isSelected()) {
            txtPassword.setEchoChar((char) 0);
            txtConfirmPassword.setEchoChar((char) 0);
        } else {
            txtPassword.setEchoChar('•');
            txtConfirmPassword.setEchoChar('•');
        }
    }//GEN-LAST:event_togglePwdActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewEmp;
    private javax.swing.JComboBox<String> jCBDeptID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblConfirmPasswordError;
    private javax.swing.JLabel lblEmailError;
    private javax.swing.JLabel lblFNameError;
    private javax.swing.JLabel lblLNameError;
    private javax.swing.JLabel lblOfficeLocError;
    private javax.swing.JLabel lblPasswordError;
    private javax.swing.JLabel lblPhoneNoError;
    private javax.swing.JLabel lblUserIDError;
    private javax.swing.JLabel lblUsernameError;
    private javax.swing.JCheckBox togglePwd;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtLName;
    private javax.swing.JTextField txtOfficeLoc;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhoneNo;
    private javax.swing.JTextField txtUserID;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
