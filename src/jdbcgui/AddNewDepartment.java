package jdbcgui;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import java.sql.PreparedStatement;

public class AddNewDepartment extends javax.swing.JFrame {

    /**
     * Creates new form AddNewDepartment
     */
    myDBCon dbCon;
    ResultSet rs;
    LoginUser luser;

    public AddNewDepartment(LoginUser user) {
        initComponents();

        // center form in screen 
        this.setLocationRelativeTo(null);
        luser = user;

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
        txtDeptID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        btnAddNewDepartment = new javax.swing.JButton();
        lblDeptIDError = new javax.swing.JLabel();
        lblLocError = new javax.swing.JLabel();
        lblNameError = new javax.swing.JLabel();
        txtLoc = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New Login User");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Add New Department");

        txtDeptID.setBackground(new java.awt.Color(242, 242, 242));
        txtDeptID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDeptID.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Department ID"));

        txtName.setBackground(new java.awt.Color(242, 242, 242));
        txtName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtName.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Department Name"));

        btnAddNewDepartment.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        btnAddNewDepartment.setText("Add New");
        btnAddNewDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewDepartmentActionPerformed(evt);
            }
        });

        lblDeptIDError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblDeptIDError.setForeground(new java.awt.Color(255, 0, 0));
        lblDeptIDError.setText("error label");

        lblLocError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblLocError.setForeground(new java.awt.Color(255, 0, 0));
        lblLocError.setText("error label");

        lblNameError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblNameError.setForeground(new java.awt.Color(255, 0, 0));
        lblNameError.setText("error label");

        txtLoc.setBackground(new java.awt.Color(242, 242, 242));
        txtLoc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtLoc.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Department Location"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAddNewDepartment)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(txtLoc, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(txtDeptID)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNameError, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(lblDeptIDError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblLocError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNameError, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDeptID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDeptIDError, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLocError, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddNewDepartment)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearErrorLabels() {
        // erase error label text and set visibility to false 
        lblNameError.setText("");
        lblDeptIDError.setText("");
        lblLocError.setText("");
    }

    private boolean isDuplicateDeptID(String deptid) {
        boolean result = false;  // Assume no duplicate exists
        try {
            dbCon = new myDBCon();
            ResultSet newrs;
            // The deptid should be parameterized to prevent SQL injection
            String query = "SELECT * FROM department WHERE deptid = ?";
            PreparedStatement pstmt = dbCon.prepareStatement(query);
            pstmt.setString(1, deptid);
            newrs = pstmt.executeQuery();

            // If newrs.isBeforeFirst() is true, there are rows, hence a duplicate exists
            if (newrs.isBeforeFirst()) {
                result = true;  // There is a duplicate
            }
            newrs.close();
            pstmt.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return result;
    }
    
    private boolean isInteger(String s) {
        try {
            Integer.valueOf(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
  
    private boolean isValidData() {
        boolean result = true;
        String name = txtName.getText().trim();
        String loc = txtLoc.getText().trim();
        String deptID = txtDeptID.getText().trim();
    
        if (name.isEmpty() || name.length() > 30) {
            lblNameError.setText(name.isEmpty() ? "Invalid. Cannot be empty." : "Invalid. Must be <= 30 chars.");
            lblNameError.setVisible(true);
            result = false;
        }

        if (loc.isEmpty() || loc.length() > 30) {
            lblLocError.setText(loc.isEmpty() ? "Invalid. Cannot be empty." : "Invalid. Must be <= 30 chars.");
            lblLocError.setVisible(true);
            result = false;
        }
    
        if (deptID.isEmpty() || !isInteger(deptID) || isDuplicateDeptID(deptID)) {
            if (deptID.isEmpty()) {
                lblDeptIDError.setText("Invalid. Cannot be empty.");
            } else {
                lblDeptIDError.setText(!isInteger(deptID) ? "DeptID Must be an Integer" : "Invalid. This DeptID already exists.");
            }
            lblDeptIDError.setVisible(true);
            result = false;
        }
    
        return result;
    }

    private void clearInputBoxes() {
        // clear all text boxes and set the user type combo to the default value 
        txtName.setText("");
        txtDeptID.setText("");
        txtLoc.setText("");
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

    private void btnAddNewDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewDepartmentActionPerformed
        // verify input data        
        // verify that new user does not currently exist 
        // if all validations are successful then enter the new user
        try {

            clearErrorLabels();
            if (isValidData()) {

                String prepSQL = "INSERT INTO department (deptid, name, loc) VALUES ('"
                        + txtDeptID.getText().trim() + "', '"
                        + txtName.getText().trim() + "', '"
                        + txtLoc.getText().trim() + "')";

                int result = dbCon.executePrepared(prepSQL);
                if (result > 0) {
                    
                    String action = "Department " + txtDeptID.getText().trim() + " has been added";
                    updateLogs(action);

                    javax.swing.JLabel label = new javax.swing.JLabel("New department added successfully.");
                    label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                    JOptionPane.showMessageDialog(null, label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                    clearInputBoxes();
                }

                // rs.close();
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error adding new department.");
        }

    }//GEN-LAST:event_btnAddNewDepartmentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewDepartment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblDeptIDError;
    private javax.swing.JLabel lblLocError;
    private javax.swing.JLabel lblNameError;
    private javax.swing.JTextField txtDeptID;
    private javax.swing.JTextField txtLoc;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
