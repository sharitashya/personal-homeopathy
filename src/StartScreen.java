import java.sql.*;
import java.awt.Image;
import javax.swing.ImageIcon;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * StartScreen.java
 *
 * Created on 2 Dec, 2015, 9:48:09 PM
 */

/**
 *
 * @author Shreyash Haritashya
 */
public class StartScreen extends javax.swing.JFrame {

    /** Creates new form StartScreen */
    public StartScreen() {
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

        javax.swing.JLabel versionLabel = new javax.swing.JLabel();
        javax.swing.JLabel vendorLabel = new javax.swing.JLabel();
        javax.swing.JLabel homepageLabel = new javax.swing.JLabel();
        javax.swing.JLabel appVersionLabel = new javax.swing.JLabel();
        javax.swing.JLabel appVendorLabel = new javax.swing.JLabel();
        javax.swing.JLabel appHomepageLabel = new javax.swing.JLabel();
        javax.swing.JLabel appTitleLabel = new javax.swing.JLabel();
        st1 = new javax.swing.JLabel();
        javax.swing.JLabel appDescLabel = new javax.swing.JLabel();
        st2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        img1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Connection Status");
        setIconImage(new ImageIcon("E:\\HomoD\\Images\\unedited\\icon\\ico.png").getImage());
        setMinimumSize(new java.awt.Dimension(512, 384));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(null);

        versionLabel.setFont(versionLabel.getFont().deriveFont(versionLabel.getFont().getStyle() | java.awt.Font.BOLD));
        versionLabel.setText("Product Version\\:");
        getContentPane().add(versionLabel);
        versionLabel.setBounds(10, 60, 117, 16);

        vendorLabel.setFont(vendorLabel.getFont().deriveFont(vendorLabel.getFont().getStyle() | java.awt.Font.BOLD));
        vendorLabel.setText("Vendor\\:");
        getContentPane().add(vendorLabel);
        vendorLabel.setBounds(230, 60, 60, 16);

        homepageLabel.setFont(homepageLabel.getFont().deriveFont(homepageLabel.getFont().getStyle() | java.awt.Font.BOLD));
        homepageLabel.setText("Homepage\\:");
        getContentPane().add(homepageLabel);
        homepageLabel.setBounds(10, 90, 81, 16);

        appVersionLabel.setForeground(new java.awt.Color(255, 51, 51));
        appVersionLabel.setText("1.0");
        getContentPane().add(appVersionLabel);
        appVersionLabel.setBounds(130, 60, 30, 16);

        appVendorLabel.setForeground(new java.awt.Color(255, 51, 51));
        appVendorLabel.setText("Haritashya Inc.");
        getContentPane().add(appVendorLabel);
        appVendorLabel.setBounds(300, 60, 90, 16);

        appHomepageLabel.setForeground(new java.awt.Color(255, 51, 51));
        appHomepageLabel.setText("http\\://leanersnewworld.com/Personal Homeopathy");
        getContentPane().add(appHomepageLabel);
        appHomepageLabel.setBounds(100, 90, 270, 16);

        appTitleLabel.setFont(appTitleLabel.getFont().deriveFont((appTitleLabel.getFont().getStyle() | java.awt.Font.ITALIC) | java.awt.Font.BOLD, appTitleLabel.getFont().getSize()+7));
        appTitleLabel.setForeground(new java.awt.Color(51, 255, 51));
        appTitleLabel.setText("Personal Homeopathy Doctor");
        getContentPane().add(appTitleLabel);
        appTitleLabel.setBounds(120, 0, 310, 25);

        st1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        st1.setForeground(new java.awt.Color(0, 0, 255));
        st1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        st1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(st1);
        st1.setBounds(130, 130, 260, 20);

        appDescLabel.setForeground(new java.awt.Color(0, 51, 204));
        appDescLabel.setText("Your Health at your finger tips.(We Care)");
        getContentPane().add(appDescLabel);
        appDescLabel.setBounds(150, 30, 240, 20);

        st2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        st2.setForeground(new java.awt.Color(102, 0, 51));
        st2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        st2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(st2);
        st2.setBounds(70, 320, 370, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 0, 50, 50);

        jSeparator1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 0, 490, 50);

        img1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(img1);
        img1.setBounds(130, 150, 260, 160);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AdminBk.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 520, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents
int a=0;
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
   String img;
        try{
        Class.forName("java.sql.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/homodoct","root","123");
        Statement st= c.createStatement();
        String q = "use homodoct";
         st.executeQuery(q);
          img ="E:/HomoD/Images/conn.jpg";
              ImageIcon icon1= new ImageIcon(img);
              Image im1 = icon1.getImage();
              ImageIcon newImage1 = new ImageIcon(im1);
              img1.setIcon(newImage1);
              st1.setText("Connection Successful");
              st2.setText("Let's Proceed (Press any Key to Continue)");
       a=1;
        }
        catch(Exception e){
         System.out.print(e);
      img ="G:/NetBeans Project/HomoD/Images/ntconn.png";
              ImageIcon icon1= new ImageIcon(img);
              Image im1 = icon1.getImage();
              ImageIcon newImage1 = new ImageIcon(im1);
              img1.setIcon(newImage1);
              st1.setText("Connection Unsuccessful");
              st2.setText("Application can not Proceed");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
if(a==1)
{
     new First_Frame().setVisible(true);
     StartScreen.this.setVisible(false);
}// TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {

          
             java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel img1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel st1;
    private javax.swing.JLabel st2;
    // End of variables declaration//GEN-END:variables

}
