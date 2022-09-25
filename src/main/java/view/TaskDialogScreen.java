package view;

import controller.TaskController;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Project;
import model.Task;

public class TaskDialogScreen extends javax.swing.JDialog {

    private TaskController taskController;
    private Project project;

    public TaskDialogScreen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        this.taskController = new TaskController();
    }

    public void setProject(Project project) {
        this.project = project;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelToolBar = new javax.swing.JPanel();
        jLabelToolBarTitle = new javax.swing.JLabel();
        jLabelToolBarSave = new javax.swing.JLabel();
        jPanelTask = new javax.swing.JPanel();
        jLabelTaskName = new javax.swing.JLabel();
        jTextFieldTaskName = new javax.swing.JTextField();
        jLabelTaskDescription = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaTaskDescription = new javax.swing.JTextArea();
        jLabelTaskDeadline = new javax.swing.JLabel();
        jFormattedTextFieldTaskDeadline = new javax.swing.JFormattedTextField();
        jLabelTaskNotes = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaTaskNotes = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelToolBar.setBackground(new java.awt.Color(0, 153, 102));

        jLabelToolBarTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelToolBarTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelToolBarTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelToolBarTitle.setText("Tarefa");

        jLabelToolBarSave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelToolBarSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check.png"))); // NOI18N
        jLabelToolBarSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelToolBarSaveMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelToolBarLayout = new javax.swing.GroupLayout(jPanelToolBar);
        jPanelToolBar.setLayout(jPanelToolBarLayout);
        jPanelToolBarLayout.setHorizontalGroup(
            jPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelToolBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelToolBarTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelToolBarSave, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanelToolBarLayout.setVerticalGroup(
            jPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelToolBarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelToolBarSave)
                    .addComponent(jLabelToolBarTitle))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanelTask.setBackground(new java.awt.Color(255, 255, 255));

        jLabelTaskName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelTaskName.setText("Nome");

        jTextFieldTaskName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldTaskName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTaskNameActionPerformed(evt);
            }
        });

        jLabelTaskDescription.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelTaskDescription.setText("Descrição");

        jTextAreaTaskDescription.setColumns(20);
        jTextAreaTaskDescription.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextAreaTaskDescription.setRows(5);
        jScrollPane1.setViewportView(jTextAreaTaskDescription);

        jLabelTaskDeadline.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelTaskDeadline.setText("Prazo");

        jFormattedTextFieldTaskDeadline.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        jFormattedTextFieldTaskDeadline.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jFormattedTextFieldTaskDeadline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldTaskDeadlineActionPerformed(evt);
            }
        });

        jLabelTaskNotes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelTaskNotes.setText("Notas");

        jTextAreaTaskNotes.setColumns(20);
        jTextAreaTaskNotes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextAreaTaskNotes.setRows(5);
        jScrollPane2.setViewportView(jTextAreaTaskNotes);

        javax.swing.GroupLayout jPanelTaskLayout = new javax.swing.GroupLayout(jPanelTask);
        jPanelTask.setLayout(jPanelTaskLayout);
        jPanelTaskLayout.setHorizontalGroup(
            jPanelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTaskLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTaskName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldTaskName)
                    .addComponent(jLabelTaskDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                    .addComponent(jLabelTaskDeadline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelTaskNotes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                    .addComponent(jFormattedTextFieldTaskDeadline))
                .addContainerGap())
        );
        jPanelTaskLayout.setVerticalGroup(
            jPanelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTaskLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelTaskName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldTaskName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelTaskDescription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelTaskDeadline)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextFieldTaskDeadline, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelTaskNotes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelTask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelTask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldTaskNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTaskNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTaskNameActionPerformed

    private void jFormattedTextFieldTaskDeadlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldTaskDeadlineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldTaskDeadlineActionPerformed

    private void jLabelToolBarSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelToolBarSaveMouseClicked
        try {
            Task task = new Task();
                 
            task.setIdProject(project.getId());
            task.setName(jTextFieldTaskName.getText());
            task.setDescription(jTextAreaTaskDescription.getText());
            task.setNotes(jTextAreaTaskNotes.getText());

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date deadline = dateFormat.parse(jFormattedTextFieldTaskDeadline.getText());
            
            task.setDeadline(deadline);
            
            taskController.save(task);
            
            JOptionPane.showMessageDialog(rootPane, "Tarefa salva com sucesso!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
            this.dispose();
    }//GEN-LAST:event_jLabelToolBarSaveMouseClicked

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
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TaskDialogScreen dialog = new TaskDialogScreen(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField jFormattedTextFieldTaskDeadline;
    private javax.swing.JLabel jLabelTaskDeadline;
    private javax.swing.JLabel jLabelTaskDescription;
    private javax.swing.JLabel jLabelTaskName;
    private javax.swing.JLabel jLabelTaskNotes;
    private javax.swing.JLabel jLabelToolBarSave;
    private javax.swing.JLabel jLabelToolBarTitle;
    private javax.swing.JPanel jPanelTask;
    private javax.swing.JPanel jPanelToolBar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaTaskDescription;
    private javax.swing.JTextArea jTextAreaTaskNotes;
    private javax.swing.JTextField jTextFieldTaskName;
    // End of variables declaration//GEN-END:variables
}
