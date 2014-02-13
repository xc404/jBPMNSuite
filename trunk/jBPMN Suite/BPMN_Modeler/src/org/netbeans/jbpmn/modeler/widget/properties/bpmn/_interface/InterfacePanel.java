/**
 * Copyright [2014] Gaurav Gupta
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.netbeans.jbpmn.modeler.widget.properties.bpmn._interface;

import javax.swing.JOptionPane;
import org.netbeans.modeler.properties.entity.custom.editor.combobox.client.entity.ComboBoxValue;
import org.netbeans.modeler.properties.entity.custom.editor.combobox.client.entity.Entity;
import org.netbeans.modeler.properties.entity.custom.editor.combobox.client.entity.RowValue;
import org.netbeans.modeler.properties.entity.custom.editor.combobox.internal.EntityComponent;
import org.netbeans.jbpmn.spec.TInterface;
import org.netbeans.modeler.core.NBModelerUtil;
import org.netbeans.modeler.core.ModelerFile;

public class InterfacePanel extends EntityComponent<TInterface> {

//    private ComboBoxValue<TInterface> comboBoxValue;
    private ModelerFile modelerFile;
//      private TDefinitions definition;

    /**
     * Creates new form CreateMessagePanel
     */
    public InterfacePanel(ModelerFile modelerFile) {
        super("Interface", true);
        this.modelerFile = modelerFile;
        initComponents();
    }

    @Override
    public void init() {
    }

    @Override
    public void createEntity(Class<? extends Entity> entityWrapperType) {
        this.setTitle("Create new Interface");
        if (entityWrapperType == ComboBoxValue.class) {
            this.setEntity(new ComboBoxValue<TInterface>());
        } else if (entityWrapperType == RowValue.class) {
            this.setEntity(new RowValue(new Object[3]));
        }
        name_TextField.setText("");
        implementation_TextField.setText("");
    }

    @Override
    public void updateEntity(Entity<TInterface> entityValue) {
        this.setTitle("Update Interface");
        this.setEntity(entityValue);
        TInterface _interface = null;
        if (entityValue.getClass() == ComboBoxValue.class) {
            _interface = ((ComboBoxValue<TInterface>) entityValue).getValue();
        } else if (entityValue.getClass() == RowValue.class) {
            Object[] row = ((RowValue) entityValue).getRow();
            _interface = (TInterface) row[0];
        }

        name_TextField.setText(_interface.getName() == null ? "" : _interface.getName());
        implementation_TextField.setText(_interface.getImplementationRef() == null ? "" : _interface.getImplementationRef());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        root_LayeredPane = new javax.swing.JLayeredPane();
        name_LayeredPane = new javax.swing.JLayeredPane();
        name_Label = new javax.swing.JLabel();
        name_TextField = new javax.swing.JTextField();
        implementation_LayeredPane = new javax.swing.JLayeredPane();
        implementation_Label = new javax.swing.JLabel();
        implementation_TextField = new javax.swing.JTextField();
        action_LayeredPane = new javax.swing.JLayeredPane();
        save_Button = new javax.swing.JButton();
        cancel_Button = new javax.swing.JButton();
        browse_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        org.openide.awt.Mnemonics.setLocalizedText(name_Label, org.openide.util.NbBundle.getMessage(InterfacePanel.class, "InterfacePanel.name_Label.text")); // NOI18N

        name_TextField.setText(org.openide.util.NbBundle.getMessage(InterfacePanel.class, "InterfacePanel.name_TextField.text")); // NOI18N
        name_TextField.setToolTipText(org.openide.util.NbBundle.getMessage(InterfacePanel.class, "InterfacePanel.name_TextField.toolTipText")); // NOI18N

        javax.swing.GroupLayout name_LayeredPaneLayout = new javax.swing.GroupLayout(name_LayeredPane);
        name_LayeredPane.setLayout(name_LayeredPaneLayout);
        name_LayeredPaneLayout.setHorizontalGroup(
            name_LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(name_LayeredPaneLayout.createSequentialGroup()
                .addComponent(name_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(name_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        name_LayeredPaneLayout.setVerticalGroup(
            name_LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(name_Label)
            .addComponent(name_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        name_LayeredPane.setLayer(name_Label, javax.swing.JLayeredPane.DEFAULT_LAYER);
        name_LayeredPane.setLayer(name_TextField, javax.swing.JLayeredPane.DEFAULT_LAYER);

        root_LayeredPane.add(name_LayeredPane);
        name_LayeredPane.setBounds(20, 20, 340, 30);

        org.openide.awt.Mnemonics.setLocalizedText(implementation_Label, org.openide.util.NbBundle.getMessage(InterfacePanel.class, "InterfacePanel.implementation_Label.text")); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, implementation_TextField, org.jdesktop.beansbinding.ObjectProperty.create(), implementation_Label, org.jdesktop.beansbinding.BeanProperty.create("labelFor"));
        bindingGroup.addBinding(binding);

        implementation_TextField.setText(org.openide.util.NbBundle.getMessage(InterfacePanel.class, "InterfacePanel.implementation_TextField.text")); // NOI18N
        implementation_TextField.setToolTipText(org.openide.util.NbBundle.getMessage(InterfacePanel.class, "InterfacePanel.implementation_TextField.toolTipText")); // NOI18N

        javax.swing.GroupLayout implementation_LayeredPaneLayout = new javax.swing.GroupLayout(implementation_LayeredPane);
        implementation_LayeredPane.setLayout(implementation_LayeredPaneLayout);
        implementation_LayeredPaneLayout.setHorizontalGroup(
            implementation_LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(implementation_LayeredPaneLayout.createSequentialGroup()
                .addComponent(implementation_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(implementation_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        implementation_LayeredPaneLayout.setVerticalGroup(
            implementation_LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(implementation_Label)
            .addComponent(implementation_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        implementation_LayeredPane.setLayer(implementation_Label, javax.swing.JLayeredPane.DEFAULT_LAYER);
        implementation_LayeredPane.setLayer(implementation_TextField, javax.swing.JLayeredPane.DEFAULT_LAYER);

        root_LayeredPane.add(implementation_LayeredPane);
        implementation_LayeredPane.setBounds(20, 50, 350, 30);

        org.openide.awt.Mnemonics.setLocalizedText(save_Button, org.openide.util.NbBundle.getMessage(InterfacePanel.class, "InterfacePanel.save_Button.text")); // NOI18N
        save_Button.setToolTipText(org.openide.util.NbBundle.getMessage(InterfacePanel.class, "InterfacePanel.save_Button.toolTipText")); // NOI18N
        save_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_ButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(cancel_Button, org.openide.util.NbBundle.getMessage(InterfacePanel.class, "InterfacePanel.cancel_Button.text")); // NOI18N
        cancel_Button.setToolTipText(org.openide.util.NbBundle.getMessage(InterfacePanel.class, "InterfacePanel.cancel_Button.toolTipText")); // NOI18N
        cancel_Button.setPreferredSize(new java.awt.Dimension(60, 23));
        cancel_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout action_LayeredPaneLayout = new javax.swing.GroupLayout(action_LayeredPane);
        action_LayeredPane.setLayout(action_LayeredPaneLayout);
        action_LayeredPaneLayout.setHorizontalGroup(
            action_LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(action_LayeredPaneLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(save_Button)
                .addGap(3, 3, 3)
                .addComponent(cancel_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        action_LayeredPaneLayout.setVerticalGroup(
            action_LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(save_Button)
            .addComponent(cancel_Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        action_LayeredPane.setLayer(save_Button, javax.swing.JLayeredPane.DEFAULT_LAYER);
        action_LayeredPane.setLayer(cancel_Button, javax.swing.JLayeredPane.DEFAULT_LAYER);

        root_LayeredPane.add(action_LayeredPane);
        action_LayeredPane.setBounds(200, 80, 170, 30);

        browse_Button.setBackground(new java.awt.Color(255, 255, 255));
        browse_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/netbeans/jbpmn/modeler/widget/properties/resource/searchbutton.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(browse_Button, org.openide.util.NbBundle.getMessage(InterfacePanel.class, "InterfacePanel.browse_Button.text")); // NOI18N
        browse_Button.setBorder(null);
        browse_Button.setBorderPainted(false);
        browse_Button.setContentAreaFilled(false);
        browse_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browse_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(root_LayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(browse_Button)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(root_LayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(browse_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean validateField() {
        if (this.name_TextField.getText().trim().length() <= 0 /*|| Pattern.compile("[^\\w-]").matcher(this.id_TextField.getText().trim()).find()*/) {
            JOptionPane.showMessageDialog(this, "Parameter name can't be empty", "Invalid Value", javax.swing.JOptionPane.WARNING_MESSAGE);
            return false;
        }//I18n

//            String sourceRefId = ((ComboBoxValue<TProperty>) sourceRef_ComboBox.getSelectedItem()).getId();
//            if (sourceRefId == null /*|| Pattern.compile("[^\\w-]").matcher(this.id_TextField.getText().trim()).find()*/) {
//                JOptionPane.showMessageDialog(this, "Source can't be blank", "Invalid Value", javax.swing.JOptionPane.WARNING_MESSAGE);
//                return false;
//            }//I18n
        return true;
    }

    private void save_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_ButtonActionPerformed
        if (!validateField()) {
            return;
        }

        TInterface _interface = null;

        if (this.getEntity().getClass() == ComboBoxValue.class) {
            ComboBoxValue<TInterface> comboBoxValue = (ComboBoxValue<TInterface>) this.getEntity();
            if (comboBoxValue.getValue() == null) {
                _interface = new TInterface();
                _interface.setId(NBModelerUtil.getAutoGeneratedStringId());
            } else {
                _interface = comboBoxValue.getValue();
            }

        } else if (this.getEntity().getClass() == RowValue.class) {
            Object[] row = ((RowValue) this.getEntity()).getRow();
            if (row[0] == null) {
                _interface = new TInterface();
                _interface.setId(NBModelerUtil.getAutoGeneratedStringId());
            } else {
                _interface = (TInterface) row[0];
            }
        }
        _interface.setName(name_TextField.getText());
        _interface.setImplementationRef(implementation_TextField.getText().trim().isEmpty() ? null : implementation_TextField.getText());

        if (this.getEntity().getClass() == ComboBoxValue.class) {
            ComboBoxValue<TInterface> comboBoxValue = (ComboBoxValue<TInterface>) this.getEntity();
            comboBoxValue.setId(_interface.getId());
            comboBoxValue.setValue(_interface);
            comboBoxValue.setDisplayValue(_interface.getName());
        } else if (this.getEntity().getClass() == RowValue.class) {
            Object[] row = ((RowValue) this.getEntity()).getRow();
            row[0] = _interface;
            row[1] = _interface.getName();
            row[2] = _interface.getImplementationRef();
        }

        saveActionPerformed(evt);
    }//GEN-LAST:event_save_ButtonActionPerformed

    private void cancel_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_ButtonActionPerformed
        cancelActionPerformed(evt);
    }//GEN-LAST:event_cancel_ButtonActionPerformed

    private void browse_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browse_ButtonActionPerformed
        implementation_TextField.setText(NBModelerUtil.browseClass(modelerFile));
    }//GEN-LAST:event_browse_ButtonActionPerformed
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ErrorPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ErrorPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ErrorPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ErrorPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                ErrorPanel dialog = new ErrorPanel(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane action_LayeredPane;
    private javax.swing.JButton browse_Button;
    private javax.swing.JButton cancel_Button;
    private javax.swing.JLabel implementation_Label;
    private javax.swing.JLayeredPane implementation_LayeredPane;
    private javax.swing.JTextField implementation_TextField;
    private javax.swing.JLabel name_Label;
    private javax.swing.JLayeredPane name_LayeredPane;
    private javax.swing.JTextField name_TextField;
    private javax.swing.JLayeredPane root_LayeredPane;
    private javax.swing.JButton save_Button;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
