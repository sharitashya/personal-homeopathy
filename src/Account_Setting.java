import java.awt.Image;
import java.io.File;
import java.sql.*;
import javax.swing.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Account_Setting.java
 *
 * Created on 5 Nov, 2015, 5:47:00 PM
 */

/**
 *
 * @author Shreyash Haritashya
 */
public class Account_Setting extends javax.swing.JFrame {

    /** Creates new form Account_Setting */
    public Account_Setting() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton8 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jB1 = new javax.swing.JButton();
        cpLable = new javax.swing.JLabel();
        jp1 = new javax.swing.JPasswordField();
        fname = new javax.swing.JTextField();
        add = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        usname = new javax.swing.JTextField();
        sans = new javax.swing.JTextField();
        phno = new javax.swing.JTextField();
        p1 = new javax.swing.JPasswordField();
        p2 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        questions = new javax.swing.JComboBox();
        jb1 = new javax.swing.JButton();
        jmale = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jfemale = new javax.swing.JRadioButton();
        pic = new javax.swing.JButton();
        dp1 = new javax.swing.JDesktopPane();
        image1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Settings");
        setIconImage(new ImageIcon("E:\\HomoD\\Images\\unedited\\icon\\ico.png").getImage());
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jButton8.setBackground(new java.awt.Color(0, 0, 102));
        jButton8.setForeground(new java.awt.Color(0, 0, 153));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exit.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(990, 0, 30, 29);

        jButton1.setBackground(new java.awt.Color(0, 0, 204));
        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home.png"))); // NOI18N
        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 0, 130, 30);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/top.jpg"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(-2, 0, 1024, 90);

        jB1.setBackground(new java.awt.Color(0, 153, 0));
        jB1.setFont(new java.awt.Font("Tempus Sans ITC", 2, 24));
        jB1.setForeground(new java.awt.Color(255, 255, 255));
        jB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/go.jpg"))); // NOI18N
        jB1.setText("Go");
        jB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB1ActionPerformed(evt);
            }
        });
        getContentPane().add(jB1);
        jB1.setBounds(520, 100, 120, 30);

        cpLable.setFont(new java.awt.Font("Tahoma", 2, 24));
        cpLable.setForeground(new java.awt.Color(51, 51, 51));
        cpLable.setText("Current Password :");
        getContentPane().add(cpLable);
        cpLable.setBounds(20, 100, 204, 29);
        getContentPane().add(jp1);
        jp1.setBounds(240, 102, 260, 30);

        fname.setFont(new java.awt.Font("Tahoma", 0, 18));
        fname.setEnabled(false);
        getContentPane().add(fname);
        fname.setBounds(270, 200, 300, 28);

        add.setFont(new java.awt.Font("Tahoma", 0, 18));
        add.setEnabled(false);
        getContentPane().add(add);
        add.setBounds(230, 390, 740, 30);

        age.setFont(new java.awt.Font("Tahoma", 0, 18));
        age.setEnabled(false);
        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });
        getContentPane().add(age);
        age.setBounds(270, 290, 300, 28);

        lname.setFont(new java.awt.Font("Tahoma", 0, 18));
        lname.setEnabled(false);
        getContentPane().add(lname);
        lname.setBounds(270, 250, 300, 28);

        usname.setFont(new java.awt.Font("Tahoma", 0, 18));
        usname.setEnabled(false);
        getContentPane().add(usname);
        usname.setBounds(270, 490, 310, 28);

        sans.setFont(new java.awt.Font("Tahoma", 0, 18));
        sans.setEnabled(false);
        getContentPane().add(sans);
        sans.setBounds(280, 690, 310, 28);

        phno.setFont(new java.awt.Font("Tahoma", 0, 18));
        phno.setEnabled(false);
        getContentPane().add(phno);
        phno.setBounds(270, 340, 300, 28);

        p1.setFont(new java.awt.Font("Tahoma", 0, 18));
        p1.setEnabled(false);
        p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1ActionPerformed(evt);
            }
        });
        getContentPane().add(p1);
        p1.setBounds(380, 540, 310, 28);

        p2.setFont(new java.awt.Font("Tahoma", 0, 18));
        p2.setEnabled(false);
        getContentPane().add(p2);
        p2.setBounds(380, 590, 310, 28);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24));
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("First Name :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 200, 160, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24));
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Address :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 390, 130, 29);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24));
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Age :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(160, 300, 80, 29);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 24));
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Last Name :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 250, 160, 29);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 24));
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Answer :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(114, 690, 120, 29);

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 24));
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Security Question :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 640, 240, 29);

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 24));
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Password :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(210, 540, 150, 29);

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 24));
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Re-Type Password :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(100, 580, 250, 29);

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 24));
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("User Name :");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(75, 490, 160, 29);

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 24));
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Phone Number :");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 340, 194, 29);

        questions.setFont(new java.awt.Font("Tahoma", 0, 18));
        questions.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Please select a Question ...", "My first pet name ?", "My Birthplace ?", "Bestfriend's name ?", "What I like most ?", "Place I wanna go ? " }));
        questions.setEnabled(false);
        questions.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                questionsItemStateChanged(evt);
            }
        });
        getContentPane().add(questions);
        questions.setBounds(280, 640, 310, 30);

        jb1.setBackground(new java.awt.Color(0, 153, 0));
        jb1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 36)); // NOI18N
        jb1.setForeground(new java.awt.Color(255, 255, 255));
        jb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update.jpg"))); // NOI18N
        jb1.setText("Submit Changes");
        jb1.setEnabled(false);
        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb1ActionPerformed(evt);
            }
        });
        getContentPane().add(jb1);
        jb1.setBounds(630, 680, 370, 40);

        jmale.setFont(new java.awt.Font("Tahoma", 3, 18));
        jmale.setForeground(new java.awt.Color(0, 255, 255));
        jmale.setText("Male");
        jmale.setEnabled(false);
        getContentPane().add(jmale);
        jmale.setBounds(290, 440, 80, 31);

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 24));
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Gender -");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(140, 440, 110, 29);

        jfemale.setFont(new java.awt.Font("Tahoma", 3, 18));
        jfemale.setForeground(new java.awt.Color(255, 0, 204));
        jfemale.setText("Female");
        jfemale.setEnabled(false);
        getContentPane().add(jfemale);
        jfemale.setBounds(390, 440, 110, 31);

        pic.setBackground(new java.awt.Color(51, 255, 255));
        pic.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14));
        pic.setForeground(new java.awt.Color(255, 255, 255));
        pic.setText("Update Profile Picture ");
        pic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                picActionPerformed(evt);
            }
        });
        getContentPane().add(pic);
        pic.setBounds(740, 350, 190, 27);

        image1.setBounds(0, 0, 270, 150);
        dp1.add(image1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(dp1);
        dp1.setBounds(700, 190, 270, 150);

        jCheckBox1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBox1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(590, 205, 20, 20);

        jCheckBox2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBox2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jCheckBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox2ItemStateChanged(evt);
            }
        });
        getContentPane().add(jCheckBox2);
        jCheckBox2.setBounds(590, 255, 20, 20);

        jCheckBox3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBox3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jCheckBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox3ItemStateChanged(evt);
            }
        });
        getContentPane().add(jCheckBox3);
        jCheckBox3.setBounds(590, 290, 20, 20);

        jCheckBox4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBox4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jCheckBox4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox4ItemStateChanged(evt);
            }
        });
        getContentPane().add(jCheckBox4);
        jCheckBox4.setBounds(590, 345, 20, 20);

        jCheckBox5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBox5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jCheckBox5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox5ItemStateChanged(evt);
            }
        });
        getContentPane().add(jCheckBox5);
        jCheckBox5.setBounds(520, 445, 20, 20);

        jCheckBox6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBox6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jCheckBox6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox6ItemStateChanged(evt);
            }
        });
        getContentPane().add(jCheckBox6);
        jCheckBox6.setBounds(610, 495, 20, 20);

        jCheckBox7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBox7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jCheckBox7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox7ItemStateChanged(evt);
            }
        });
        getContentPane().add(jCheckBox7);
        jCheckBox7.setBounds(720, 545, 20, 20);

        jCheckBox8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBox8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jCheckBox8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox8ItemStateChanged(evt);
            }
        });
        getContentPane().add(jCheckBox8);
        jCheckBox8.setBounds(980, 395, 20, 20);

        jCheckBox9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBox9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jCheckBox9.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox9ItemStateChanged(evt);
            }
        });
        jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox9ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox9);
        jCheckBox9.setBounds(600, 650, 20, 20);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(20, 150, 990, 580);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/forgetpass.jpg"))); // NOI18N
        jLabel14.setText("jLabel14");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(0, 60, 1020, 720);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AdminBk.jpg"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(0, 90, 1070, 680);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Account_Setting.this.setVisible(false);
        new StartUp().setVisible(true);
        // TODO add your handling code here:
}//GEN-LAST:event_jButton1ActionPerformed

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_ageActionPerformed

    private void p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_p1ActionPerformed

    private void jb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb1ActionPerformed
String n=null,q;
        String san;
        String jc1;
        try{
            Class.forName("java.sql.Driver");
            Connection z = DriverManager.getConnection("jdbc:mysql://localhost:3306/homodoct","root","123");
            Statement st= z.createStatement();

            if(jCheckBox9.isSelected()==true)
{
   try{
        Class.forName("java.sql.Driver");
        Connection o = DriverManager.getConnection("jdbc:mysql://localhost:3306/homodoct","root","123");
        Statement sst= o.createStatement();
  String jc=(String)questions.getSelectedItem();

    q = "update signup_forms set Security_question = '"+jc+"' where val = 1;";
    sst.executeUpdate(q);

    san=sans.getText();
    String  d = "update signup_forms set Security_Answer = '"+san+"' where val = 1;";
    sst.executeUpdate(d);
    JOptionPane.showMessageDialog(null,"Security Question Updated");
}
   catch(Exception v)
   {
        JOptionPane.showMessageDialog(null,v);
   }
}
if(jCheckBox1.isSelected()==true)
{
    n = fname.getText();
    q = "update signup_forms set First_Name ='"+n+"'"+" where val = 1;";
    st.executeUpdate(q);
    JOptionPane.showMessageDialog(null,"First Name Updated");
}
if(jCheckBox2.isSelected()==true)
{
    n = lname.getText();
    q = "update signup_forms set Last_Name ='"+n+"'"+" where val = 1;";
    st.executeUpdate(q);
    JOptionPane.showMessageDialog(null,"Last Name Updated");
}
if(jCheckBox3.isSelected()==true)
{
    n = age.getText();
    q = "update signup_forms set Age ="+n+" where val = 1;";
    st.executeUpdate(q);
    JOptionPane.showMessageDialog(null,"Age Updated");
}

if(jCheckBox4.isSelected()==true)
{
    n = phno.getText();
    q = "update signup_forms set Phone_No = '"+n+"' where val = 1;";
    st.executeUpdate(q);
    JOptionPane.showMessageDialog(null,"Phone Number Updated");
}

if(jCheckBox8.isSelected()==true)
{
    n = add.getText();
    q = "update signup_forms set Address = '"+n+"' where val = 1;";
    st.executeUpdate(q);
    JOptionPane.showMessageDialog(null,"Address Updated Updated");
}
            if(jCheckBox5.isSelected()==true)
{
    if(jmale.isSelected()==true)
    {
        n="M";
    }
    else n="F";

    q = "update signup_forms set Gender = '"+n+"' where val = 1;";
    st.executeUpdate(q);
    JOptionPane.showMessageDialog(null,"Gender Updated");
}
            if(jCheckBox6.isSelected()==true)
{
    n = usname.getText();
    q = "update signup_forms set User_Name = '"+n+"' where val = 1;";
    st.executeUpdate(q);
    JOptionPane.showMessageDialog(null,"User Name  Updated");
}

            if(jCheckBox7.isSelected()==true)
{
  String pass1,pass2;
String Usn=usname.getText();
pass1=new String (p1.getPassword());
pass2=new String(p2.getPassword());
if(pass1.equals(pass2))
{

     try{
        Class.forName("java.sql.Driver");
        Connection o = DriverManager.getConnection("jdbc:mysql://localhost:3306/homodoct","root","123");
        Statement sst= o.createStatement();
        String t = "update signup_forms set Password ="+"'"+pass1+"'"+"where val = 1;";
        
        sst.executeUpdate(t);
       
        JOptionPane.showMessageDialog(null,"Your Password has been Updated");

     }
     catch(Exception m)
     {
           JOptionPane.showMessageDialog(null,m);
     }
}
else
{
    JOptionPane.showMessageDialog(null,"Your New Password is not Matching !!! Please type again");
    
}
            }

   if(fn1!=null)
   {
       String l = "update signup_forms set image ='"+fn1+"' where val =1;";
        st.executeUpdate(l);
   }
   JOptionPane.showMessageDialog(null,"All slected information has been Updated");
     
     new StartUp().setVisible(true);
     this.setVisible(false);


}
catch(Exception e)
{

}


        // TODO add your handling code here:
}//GEN-LAST:event_jb1ActionPerformed
String filename, fn1=null;
private void picActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_picActionPerformed
        JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        filename=f.getAbsolutePath();
        //System.out.println(filename);
        fn1 = filename.replace("\\","/");
        image1.setText(fn1);
        ImageIcon icon= new ImageIcon(fn1);
        Image im = icon.getImage();
        Image myImg = im.getScaledInstance(image1.getWidth(), image1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImage = new ImageIcon(myImg);
        image1.setIcon(newImage);
        jb1.setEnabled(true);
        // TODO add your handling code here:
}//GEN-LAST:event_picActionPerformed

    private void jB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB1ActionPerformed
        String pass = null,pas;
        pas=new String (jp1.getPassword());
 try{
        Class.forName("java.sql.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/homodoct","root","123");
        Statement st= c.createStatement();
        String h = "Select Password from signup_forms where val = 1;" ;
        ResultSet rs = st.executeQuery(h);
         while(rs.next())
         {
             pass = rs.getString("Password");
            
         }
         if (pas.equals(pass))
         {
             age.setVisible(true);
jb1.setVisible(true);
jLabel1.setVisible(true);
jLabel2.setVisible(true);
jLabel3.setVisible(true);
jLabel4.setVisible(true);
jLabel5.setVisible(true);
jLabel6.setVisible(true);
jLabel7.setVisible(true);
jLabel8.setVisible(true);
jLabel9.setVisible(true);
jLabel10.setVisible(true);
jLabel11.setVisible(true);
dp1.setVisible(true);
pic.setVisible(true);
lname.setVisible(true);
fname.setVisible(true);
questions.setVisible(true);
p2.setVisible(true);
p1.setVisible(true);
usname.setVisible(true);
sans.setVisible(true);
phno.setVisible(true);
add.setVisible(true);
jfemale.setVisible(true);
jmale.setVisible(true);
jCheckBox1.setVisible(true);
jCheckBox2.setVisible(true);
jCheckBox3.setVisible(true);
jCheckBox4.setVisible(true);
jCheckBox5.setVisible(true);
jCheckBox6.setVisible(true);
jCheckBox7.setVisible(true);
jCheckBox8.setVisible(true);
jCheckBox9.setVisible(true);

JOptionPane.showMessageDialog(null,"Please tick that, Which you want to be editted");
jb1.setEnabled(true);
             
         }
         else JOptionPane.showMessageDialog(null,"Your Password is not correct,Please Enter correct Password");

 }
 catch(Exception e)
 {
System.out.println(e);
 }
        // TODO add your handling code here:
}//GEN-LAST:event_jB1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
age.setVisible(false);
jb1.setVisible(false);
jLabel1.setVisible(false);
jLabel2.setVisible(false);
jLabel3.setVisible(false);
jLabel4.setVisible(false);
jLabel5.setVisible(false);
jLabel6.setVisible(false);
jLabel7.setVisible(false);
jLabel8.setVisible(false);
jLabel9.setVisible(false);
jLabel10.setVisible(false);
jLabel11.setVisible(false);
dp1.setVisible(false);
pic.setVisible(false);
lname.setVisible(false);
fname.setVisible(false);
questions.setVisible(false);
p2.setVisible(false);
p1.setVisible(false);
usname.setVisible(false);
sans.setVisible(false);
phno.setVisible(false);
add.setVisible(false);
jfemale.setVisible(false);
jmale.setVisible(false);
jCheckBox1.setVisible(false);
jCheckBox2.setVisible(false);
jCheckBox3.setVisible(false);
jCheckBox4.setVisible(false);
jCheckBox5.setVisible(false);
jCheckBox6.setVisible(false);
jCheckBox7.setVisible(false);
jCheckBox8.setVisible(false);
jCheckBox9.setVisible(false);








        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged
if(jCheckBox1.isSelected()==true)
{
    fname.setEnabled(true);
}
else fname.setEnabled(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void jCheckBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox2ItemStateChanged
if(jCheckBox2.isSelected()==true)
{
    lname.setEnabled(true);
}
else lname.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ItemStateChanged

    private void jCheckBox9ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox9ItemStateChanged
if(jCheckBox9.isSelected()==true)
{
    questions.setEnabled(true);
     sans.setEnabled(true);
   
}
else
{
    questions.setEnabled(false);
     sans.setEnabled(false);
    
}
    
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox9ItemStateChanged

    private void jCheckBox7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox7ItemStateChanged
if(jCheckBox7.isSelected()==true)
{
    p1.setEnabled(true);
     p2.setEnabled(true);
}
else 
{
     p2.setEnabled(false);
    p1.setEnabled(false);
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox7ItemStateChanged

    private void jCheckBox5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox5ItemStateChanged
if(jCheckBox5.isSelected()==true)
{
    jmale.setEnabled(true);
    jfemale.setEnabled(true);
}
else 
{
  jfemale.setEnabled(false);
    jmale.setEnabled(false);
}
// TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox5ItemStateChanged

    private void jCheckBox8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox8ItemStateChanged
if(jCheckBox8.isSelected()==true)
{
    add.setEnabled(true);
}
else add.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox8ItemStateChanged

    private void jCheckBox4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox4ItemStateChanged
     if(jCheckBox4.isSelected()==true)
{
    phno.setEnabled(true);
}
else phno.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox4ItemStateChanged

    private void jCheckBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox3ItemStateChanged
    if(jCheckBox3.isSelected()==true)
{
    age.setEnabled(true);
}
else age.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ItemStateChanged

    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox9ActionPerformed

    private void questionsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_questionsItemStateChanged
 sans.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_questionsItemStateChanged

    private void jCheckBox6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox6ItemStateChanged
if(jCheckBox6.isSelected()==true)
{
    usname.setEnabled(true);
}
else usname.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox6ItemStateChanged

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try{
            Class.forName("java.sql.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/homodoct","root","123");
            Statement st= c.createStatement();
            String u="update SignUp_forms set val = 0 where val =1;";
            st.executeUpdate(u);
        } catch(Exception e) {

        }

        System.exit(0);

        // TODO add your handling code here:
}//GEN-LAST:event_jButton8ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Account_Setting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField add;
    private javax.swing.JTextField age;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel cpLable;
    private javax.swing.JDesktopPane dp1;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel image1;
    private javax.swing.JButton jB1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton8;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jb1;
    private javax.swing.JRadioButton jfemale;
    private javax.swing.JRadioButton jmale;
    private javax.swing.JPasswordField jp1;
    private javax.swing.JTextField lname;
    private javax.swing.JPasswordField p1;
    private javax.swing.JPasswordField p2;
    private javax.swing.JTextField phno;
    private javax.swing.JButton pic;
    private javax.swing.JComboBox questions;
    private javax.swing.JTextField sans;
    private javax.swing.JTextField usname;
    // End of variables declaration//GEN-END:variables

}
