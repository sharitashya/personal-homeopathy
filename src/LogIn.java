import java.sql.*;
import javax.swing.*;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LogIn.java
 *
 * Created on 5 Nov, 2015, 2:04:59 PM
 */

/**
 *
 * @author Shreyash Haritashya
 */
public class LogIn extends javax.swing.JFrame {

    /** Creates new form LogIn */
    public LogIn() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        User_Name = new javax.swing.JTextField();
        jpass1 = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Log In Portal");
        setIconImage(new ImageIcon("E:\\HomoD\\Images\\unedited\\icon\\ico.png").getImage());
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton7.setBackground(new java.awt.Color(0, 0, 102));
        jButton7.setForeground(new java.awt.Color(0, 0, 153));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exit.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(990, 0, 30, 29);

        jLabel1.setFont(new java.awt.Font("Georgia", 3, 24));
        jLabel1.setForeground(new java.awt.Color(255, 51, 204));
        jLabel1.setText("User Name :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 390, 152, 28);

        jLabel2.setFont(new java.awt.Font("Georgia", 3, 24));
        jLabel2.setForeground(new java.awt.Color(255, 51, 204));
        jLabel2.setText("Password :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 470, 138, 28);

        jLabel3.setFont(new java.awt.Font("Georgia", 3, 48));
        jLabel3.setForeground(new java.awt.Color(0, 51, 204));
        jLabel3.setText("LogIn");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 300, 150, 55);

        User_Name.setFont(new java.awt.Font("Georgia", 3, 18));
        User_Name.setForeground(new java.awt.Color(0, 255, 255));
        User_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                User_NameActionPerformed(evt);
            }
        });
        getContentPane().add(User_Name);
        User_Name.setBounds(190, 390, 250, 30);

        jpass1.setFont(new java.awt.Font("Georgia", 3, 24));
        jpass1.setForeground(new java.awt.Color(0, 255, 255));
        getContentPane().add(jpass1);
        jpass1.setBounds(190, 470, 250, 30);

        jButton3.setBackground(new java.awt.Color(240, 255, 255));
        jButton3.setFont(new java.awt.Font("Tempus Sans ITC", 2, 18));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back(1).png"))); // NOI18N
        jButton3.setText("Go Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(0, 0, 130, 30);

        jButton1.setFont(new java.awt.Font("Georgia", 3, 36));
        jButton1.setForeground(new java.awt.Color(153, 0, 0));
        jButton1.setText("Let's Get Started ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 550, 420, 49);

        jButton2.setFont(new java.awt.Font("Georgia", 3, 36));
        jButton2.setForeground(new java.awt.Color(153, 0, 0));
        jButton2.setText("Forget Password");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(20, 650, 420, 49);

        jLabel4.setFont(new java.awt.Font("Georgia", 3, 24));
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Or,");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(200, 610, 41, 28);

        jSeparator1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 290, 460, 430);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogIn11.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, -20, 1020, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void User_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_User_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_User_NameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
LogIn.this.setVisible(false);
Forget_Password f1= new Forget_Password();
f1.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String pass=null,user_id=null , user_pass=null;
String check;
user_id = User_Name.getText();
user_pass = new String (jpass1.getPassword());
int j=0,kk =1;
String k ="1";

try{
        Class.forName("java.sql.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/homodoct","root","123");
        Statement st= c.createStatement();
String w =("select val from SignUp_forms ;");
        ResultSet ps = st.executeQuery(w);
        while(ps.next())
        {
         check = ps.getString("val");
          if(check.equals("1"))
          {
           kk =0;
          }
        }
}
catch(Exception ll){
            JOptionPane.showMessageDialog(null, ll);
        }

if (kk==1)
{
 if (user_id.equals("admin")&&user_pass.equals("Admin@22"))
{
                j=1;

}
try{
        Class.forName("java.sql.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/homodoct","root","123");
        Statement st= c.createStatement();
        String w =("select Password from SignUp_forms where User_Name ="+ "'"+user_id+"';");
        ResultSet ps = st.executeQuery(w);
        while(ps.next())
        {
            pass = ps.getString("Password");
        }

        if(user_pass.equals(pass))
        {
            j=2;
            String u="update SignUp_forms set val = 1 where User_Name ='"+user_id+"';";
            st.executeUpdate(u);
        }


     }

        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
if (j==1)
{
    LogIn.this.setVisible(false);
  new  Admin().setVisible(true);
}
else if(j==2)
{
    LogIn.this.setVisible(false);
  new  Welcome_Screen().setVisible(true);
}
else if(j==0)
{
     JOptionPane.showMessageDialog(null,"Either User Name or Password incorrect !!!");
}
}
else if(kk==0)
{
    JOptionPane.showMessageDialog(null,"Two user can't logIn at same time On same Machine ");
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
LogIn.this.setVisible(false);
new First_Frame().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        System.exit(0);

        // TODO add your handling code here:
}//GEN-LAST:event_jButton7ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField User_Name;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField jpass1;
    // End of variables declaration//GEN-END:variables

}
