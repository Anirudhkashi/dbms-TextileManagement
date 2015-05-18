
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
public class Rawmaterials extends javax.swing.JFrame {
    
    private PreparedStatement p1;
    private ResultSet rs1;
    private int mb_no;
    private Date purchase_dt;
    private String supplier;
    private int denier;
    private double purchase_qty;
    private String yarn_type;
    private int getMbno;
    private Connection connection;
    private int row;
    
    /**
     * Creates new form Rawmaterials
     */
    public Rawmaterials() {
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

        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();

        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mb_no", "DOP", "supplier_name", "denier", "qty_purchased", "type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
        jTextField1.setBackground(new java.awt.Color(51, 0, 255));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField1.setText("     RAW MATERIALS DETAILS");

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("EXIT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 44, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       setVisible(false);
       Rawins p=new Rawins();
       p.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     setVisible(false);
      Entry e=new Entry();
      e.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

   private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException{                                         
       
        try{
            
            Class.forName("org.postgresql.Driver");
            
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        
        String query= "DELETE FROM raw_materials WHERE mb_no= ?";
        getMbno= (int)jTable1.getValueAt(row,0);
        
        System.out.println("Mbno= "+getMbno);
         try{
        
             
        
       connection= DriverManager.getConnection("jdbc:postgresql://localhost:5432/textile_industry","Anirudh","Ani123");
       p1= connection.prepareStatement(query);
       p1.setInt(1, getMbno);
       
       p1.executeUpdate();
       
       Rawmaterials.this.setVisible(false);
       Rawmaterials r= new Rawmaterials();
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
                    getMbno= (int)jTable1.getValueAt(row,0);
                    System.out.println("Mbno="+getMbno);
                    
                    mb_no=(int)jTable1.getValueAt(row,0);
                    purchase_dt= (Date)jTable1.getValueAt(row,1);
                    supplier= (String)jTable1.getValueAt(row,2);
                    denier=(int)jTable1.getValueAt(row,3);
                    purchase_qty= (double)jTable1.getValueAt(row,4);
                    yarn_type= (String)jTable1.getValueAt(row,5);
                    
                    
                    Rawmaterials.this.setVisible(false);
                    
                    rawupdate ru= new rawupdate(mb_no, purchase_dt, supplier, denier, purchase_qty, yarn_type, getMbno);
                    
                    
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
        
        String query2= "SELECT * FROM raw_materials";
        
        try{
            int i=0;
            //Connect to database--> parameters-> localhost:5432 indicates port number, User name, password
            
            connection= DriverManager.getConnection("jdbc:postgresql://localhost:5432/textile_industry","Anirudh","Ani123");
            p1= connection.prepareStatement(query2);
            rs1= p1.executeQuery();
            
            
            while(rs1.next()){
               mb_no= rs1.getInt("mb_no");
               purchase_dt= rs1.getDate("purchase_dt");
               supplier= rs1.getString("supplier");
               denier= rs1.getInt("denier");
               purchase_qty= rs1.getDouble("purchase_qty");
               yarn_type= rs1.getString("yarn_type");
               jTable1.setValueAt(mb_no,i,0);
               jTable1.setValueAt(purchase_dt,i,1);
               jTable1.setValueAt(supplier,i,2);
               jTable1.setValueAt(denier,i,3);
               jTable1.setValueAt(purchase_qty,i,4);
               jTable1.setValueAt(yarn_type,i,5);
               
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
            java.util.logging.Logger.getLogger(Rawmaterials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rawmaterials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rawmaterials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rawmaterials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              
                
                new Rawmaterials().setVisible(true);
             
        }});
    }  
        
  
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
