
package pos.layerd.view;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pos.layerd.controller.ItemController;
import pos.layerd.dto.ItemDto;


public class ItemPanel extends javax.swing.JPanel {
    
    private ItemController itemController;


    
    public ItemPanel() {
        itemController = new ItemController();
        initComponents();
        loadAllItems();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basePanel3 = new javax.swing.JPanel();
        headerPanel3 = new javax.swing.JPanel();
        headerlabel3 = new javax.swing.JLabel();
        fromPanel2 = new javax.swing.JPanel();
        itemCodeLabel2 = new javax.swing.JLabel();
        itemCodeText2 = new javax.swing.JTextField();
        descriptionLabel2 = new javax.swing.JLabel();
        descriptionText2 = new javax.swing.JTextField();
        packSizeLabel2 = new javax.swing.JLabel();
        packSizeText2 = new javax.swing.JTextField();
        unitPriceText2 = new javax.swing.JTextField();
        unitPriceLabel2 = new javax.swing.JLabel();
        qohLabel2 = new javax.swing.JLabel();
        qohText2 = new javax.swing.JTextField();
        addButton2 = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        tablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ItemTable = new javax.swing.JTable();

        headerlabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        headerlabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerlabel3.setText("Manage Item");

        javax.swing.GroupLayout headerPanel3Layout = new javax.swing.GroupLayout(headerPanel3);
        headerPanel3.setLayout(headerPanel3Layout);
        headerPanel3Layout.setHorizontalGroup(
            headerPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerlabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        headerPanel3Layout.setVerticalGroup(
            headerPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerlabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        itemCodeLabel2.setText("Item Code");

        descriptionLabel2.setText("Description");

        packSizeLabel2.setText("Pack Size");

        unitPriceLabel2.setText("Unit Price");

        qohLabel2.setText("QoH");
        qohLabel2.setToolTipText("");

        addButton2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        addButton2.setText("Save Item");
        addButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton2ActionPerformed(evt);
            }
        });

        updateButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        updateButton.setText("Update Item");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        deleteButton.setText("Delete Item");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fromPanel2Layout = new javax.swing.GroupLayout(fromPanel2);
        fromPanel2.setLayout(fromPanel2Layout);
        fromPanel2Layout.setHorizontalGroup(
            fromPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fromPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fromPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(qohLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(unitPriceLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(packSizeLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(descriptionLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(itemCodeLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fromPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fromPanel2Layout.createSequentialGroup()
                        .addComponent(itemCodeText2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fromPanel2Layout.createSequentialGroup()
                        .addGroup(fromPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descriptionText2, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                            .addComponent(packSizeText2))
                        .addGap(352, 352, 352))
                    .addGroup(fromPanel2Layout.createSequentialGroup()
                        .addGroup(fromPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(unitPriceText2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(qohText2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fromPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addButton2)
                .addContainerGap())
        );
        fromPanel2Layout.setVerticalGroup(
            fromPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fromPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fromPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemCodeLabel2)
                    .addComponent(itemCodeText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fromPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descriptionLabel2)
                    .addComponent(descriptionText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fromPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(packSizeLabel2)
                    .addComponent(packSizeText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fromPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unitPriceLabel2)
                    .addComponent(unitPriceText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fromPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qohLabel2)
                    .addComponent(qohText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(fromPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton2)
                    .addComponent(updateButton)
                    .addComponent(deleteButton))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        ItemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        ItemTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ItemTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ItemTable);

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout basePanel3Layout = new javax.swing.GroupLayout(basePanel3);
        basePanel3.setLayout(basePanel3Layout);
        basePanel3Layout.setHorizontalGroup(
            basePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fromPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        basePanel3Layout.setVerticalGroup(
            basePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basePanel3Layout.createSequentialGroup()
                .addComponent(headerPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fromPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basePanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basePanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton2ActionPerformed
        saveItem();
    }//GEN-LAST:event_addButton2ActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        updateItem();
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        deleteItem();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void ItemTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemTableMouseClicked
        searchItem();
    }//GEN-LAST:event_ItemTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ItemTable;
    private javax.swing.JButton addButton;
    private javax.swing.JButton addButton1;
    private javax.swing.JButton addButton2;
    private javax.swing.JPanel basePanel;
    private javax.swing.JPanel basePanel1;
    private javax.swing.JPanel basePanel2;
    private javax.swing.JPanel basePanel3;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JLabel descriptionLabel1;
    private javax.swing.JLabel descriptionLabel2;
    private javax.swing.JTextField descriptionText;
    private javax.swing.JTextField descriptionText1;
    private javax.swing.JTextField descriptionText2;
    private javax.swing.JPanel fromPanel;
    private javax.swing.JPanel fromPanel1;
    private javax.swing.JPanel fromPanel2;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JPanel headerPanel1;
    private javax.swing.JPanel headerPanel2;
    private javax.swing.JPanel headerPanel3;
    private javax.swing.JLabel headerlabel;
    private javax.swing.JLabel headerlabel1;
    private javax.swing.JLabel headerlabel2;
    private javax.swing.JLabel headerlabel3;
    private javax.swing.JLabel itemCodeLabel;
    private javax.swing.JLabel itemCodeLabel1;
    private javax.swing.JLabel itemCodeLabel2;
    private javax.swing.JTextField itemCodeText;
    private javax.swing.JTextField itemCodeText1;
    private javax.swing.JTextField itemCodeText2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel packSizeLabel;
    private javax.swing.JLabel packSizeLabel1;
    private javax.swing.JLabel packSizeLabel2;
    private javax.swing.JTextField packSizeText;
    private javax.swing.JTextField packSizeText1;
    private javax.swing.JTextField packSizeText2;
    private javax.swing.JLabel qohLabel;
    private javax.swing.JLabel qohLabel1;
    private javax.swing.JLabel qohLabel2;
    private javax.swing.JTextField qohText;
    private javax.swing.JTextField qohText1;
    private javax.swing.JTextField qohText2;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JLabel unitPriceLabel;
    private javax.swing.JLabel unitPriceLabel1;
    private javax.swing.JLabel unitPriceLabel2;
    private javax.swing.JTextField unitPriceText;
    private javax.swing.JTextField unitPriceText1;
    private javax.swing.JTextField unitPriceText2;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables


private void saveItem() {
        try {
            ItemDto itemDto = new ItemDto(itemCodeText.getText(),
                    descriptionText.getText(),
                    packSizeText.getText(),
                    Double.parseDouble(unitPriceText.getText()),
                    Integer.parseInt(qohText.getText()));

            String resp = itemController.addItem(itemDto);
            JOptionPane.showMessageDialog(this, resp);
            clear();
            loadAllItems();
        } catch (Exception ex) {
            Logger.getLogger(ItemPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void deleteItem() {
        try {

            String resp = itemController.deleteItem(itemCodeText.getText());
            JOptionPane.showMessageDialog(this, resp);
            clear();
            loadAllItems();
        } catch (Exception ex) {
            Logger.getLogger(ItemPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void updateItem() {
        try {
            ItemDto itemDto = new ItemDto(itemCodeText.getText(),
                    descriptionText.getText(),
                    packSizeText.getText(),
                    Double.parseDouble(unitPriceText.getText()),
                    Integer.parseInt(qohText.getText()));

            String resp = itemController.updateItem(itemDto);
            JOptionPane.showMessageDialog(this, resp);
            clear();
            loadAllItems();
        } catch (Exception ex) {
            Logger.getLogger(ItemPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void searchItem() {
        try {
            String itemCode = ItemTable.getValueAt(ItemTable.getSelectedRow(), 0).toString();

            ItemDto itemDto = itemController.getItem(itemCode);

            if (itemDto != null) {
                itemCodeText.setText(itemDto.getId());
                descriptionText.setText(itemDto.getDescription());
                packSizeText.setText(itemDto.getPackSize());
                unitPriceText.setText(Double.toString(itemDto.getUnitPrice()));
                qohText.setText(Integer.toString(itemDto.getQoh()));
            } else {
                JOptionPane.showMessageDialog(this, "Item Not Found");
            }
        } catch (Exception ex) {
            Logger.getLogger(ItemPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void loadAllItems() {
        try {
            String[] collumns = {"Code", "Description", "Pack Size", "Unit Price", "Quantity on Hand"};
            DefaultTableModel dtm = new DefaultTableModel(collumns, 0) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            ItemTable.setModel(dtm);

            ArrayList<ItemDto> itemDtos = itemController.getAllItem();
            for (ItemDto item : itemDtos) {
                Object[] row = {item.getId(), item.getDescription(), item.getPackSize(), item.getUnitPrice(), item.getQoh()};
                dtm.addRow(row);
            }
        } catch (Exception ex) {
            Logger.getLogger(ItemPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void clear() {
        itemCodeText.setText("");
        descriptionText.setText("");
        packSizeText.setText("");
        unitPriceText.setText("");
        qohText.setText("");
    }
}