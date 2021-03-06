
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author india
 */
public class Winding extends javax.swing.JFrame {

    private PreparedStatement p1;
    private ResultSet rs1;
    private String dl_no;
    private Date wind_date;
    private String wind_form;
    private double no_of_packages;
    private double weight_per_package;
    private String getdlno;
    private Connection connection;
    private int row;
    
    
    /**
     * Creates new form Winding
     */
    public Winding() {
        connection= null;
        rs1=null;
        p1=null;
        initComponents();
        setTable();
        startListeners();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "dl_no", "wind_date", "wind_form", "no_of_packages", "weight_per_package"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("INSERT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("DELETE");

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(102, 0, 255));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField1.setText("        WINDING DETAILS");

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("EXIT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        Windins y=new Windins();
        y.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         setVisible(false);
      Entry e=new Entry();
      e.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException{                                         
       
        try{
            
            Class.forName("org.postgresql.Driver");
            
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        
        String query= "DELETE FROM winding WHERE dl_no= ? and wind_date=?";
        getdlno= (String)jTable1.getValueAt(row,0);
        
         try{
        
             
        
       connection= DriverManager.getConnection("jdbc:postgresql://localhost:5432/textile_industry","Anirudh","Ani123");
       p1= connection.prepareStatement(query);
       p1.setString(1, getdlno);
       p1.setDate(2, wind_date);
       
       p1.executeUpdate();
       
       Winding.this.setVisible(false);
       Winding r= new Winding();
       r.setVisible(true);
       
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        
        if(connection!=null)
            System.out.println("Successfully connected to the database!");
  
        else
            System.out.println("Connection fail");
       
       
    }
    
    public void startListeners(){

        
      jTable1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                
                row= jTable1.getSelectedRow();
                if(evt.getClickCount() == 2){
                    getdlno= (String)jTable1.getValueAt(row,0);
                    
                    dl_no=(String)jTable1.getValueAt(row,0);
                    wind_date= (Date)jTable1.getValueAt(row,1);
                    wind_form= (String)jTable1.getValueAt(row,2);
                    no_of_packages=(double)jTable1.getValueAt(row,3);
                    weight_per_package= (double)jTable1.getValueAt(row,4);
                    
                    
                    Winding.this.setVisible(false);
                    
                    Windingupdate ru= new Windingupdate(dl_no, wind_date, wind_form, no_of_packages, weight_per_package, getdlno);
                    
                    
                    ru.setVisible(true);
                }
               
                }
        });
    
          jButton2.addActionListener(new java.awt.event.ActionListener()  {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               try{ 
                jButton2ActionPerformed(evt);}
            
                catch(SQLException e){
                e.printStackTrace();
                }
        }
        });
   
        
    }
    
  
    @SuppressWarnings("empty-statement")
    public void setTable(){
                 System.out.println("JDBC connectivity");
        
        try{
            
            Class.forName("org.postgresql.Driver");
            
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        
        String query2= "SELECT * FROM winding";
        
        try{
            int i=0;
            //Connect to database--> parameters-> localhost:5432 indicates port number, User name, password
            
            connection= DriverManager.getConnection("jdbc:postgresql://localhost:5432/textile_industry","Anirudh","Ani123");
            p1= connection.prepareStatement(query2);
            rs1= p1.executeQuery();
            
            
            while(rs1.next()){
               dl_no= rs1.getString("dl_no");
               wind_date= rs1.getDate("wind_date");
               wind_form= rs1.getString("wind_form");
               no_of_packages= rs1.getDouble("no_of_packages");
               weight_per_package= rs1.getDouble("weight_per_package");
               
               
               jTable1.setValueAt(dl_no,i,0);
               jTable1.setValueAt(wind_date,i,1);
               jTable1.setValueAt(wind_form,i,2);
               jTable1.setValueAt(no_of_packages,i,3);
               jTable1.setValueAt(weight_per_package,i,4);
               
               i++;
                
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        
        if(connection!=null){
            System.out.println("Successfully connected to the database!");
             
             
        }
        else
            System.out.println("Connection fail");
    
            
        
    }
    
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Winding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Winding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Winding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Winding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Winding().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
