package gdien;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.util.ArrayList;
import java.util.List;

public class giaodien extends JFrame {
    DefaultTableModel tableModel;
    
    List<thptqg> thptqgList = new ArrayList<>();
    
    /**
	 * Create the frame.
	 */
    public giaodien() {
        initComponents();
        
        tableModel = (DefaultTableModel) tblthptqg.getModel();
        
        showthptqg();
    }
    
    private void showthptqg() {
        thptqgList = thptqgModify.findAll();
        
        tableModel.setRowCount(0);
        
        for (thptqg thptqg: thptqgList) {
            tableModel.addRow(new Object[] {tableModel.getRowCount() + 1, thptqg.getHoten(), 
                thptqg.getGioitinh(), thptqg.getCccd(), thptqg.getDienthoai(), thptqg.getToan(), thptqg.getVan(), thptqg.getNgoaingu(), thptqg.getTohop()});
        }
    }
                                     

	private void initComponents() {
		setTitle("THITHPTQG");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 738, 765);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Nhap thong tin thi sinh", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 42, 704, 383);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Ho va ten:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(25, 20, 143, 21);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Gioi tinh:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(25, 60, 143, 21);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("CCCD/CMND:");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel_3.setBounds(25, 100, 143, 21);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("So DT:");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel_4.setBounds(25, 140, 143, 21);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Diem toan:");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel_5.setBounds(25, 180, 143, 21);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Diem ngu van:");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel_6.setBounds(25, 220, 143, 21);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Diem ngoai ngu:");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel_7.setBounds(25, 260, 143, 21);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Diem bai thi to hop:");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel_8.setBounds(25, 300, 143, 21);
		panel.add(lblNewLabel_8);
		
		txtHovaten = new JTextField();
		txtHovaten.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtHovaten.setBounds(168, 16, 510, 32);
		panel.add(txtHovaten);
		txtHovaten.setColumns(10);
		
		txtGioitinh = new JTextField();
		txtGioitinh.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtGioitinh.setBounds(168, 56, 116, 32);
		panel.add(txtGioitinh);
		txtGioitinh.setColumns(10);
		
		txtCCCD = new JTextField();
		txtCCCD.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtCCCD.setBounds(168, 96, 510, 32);
		panel.add(txtCCCD);
		txtCCCD.setColumns(10);
		
		txtSoDT = new JTextField();
		txtSoDT.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtSoDT.setBounds(168, 136, 510, 32);
		panel.add(txtSoDT);
		txtSoDT.setColumns(10);
		
		txtDiemtoan = new JTextField();
		txtDiemtoan.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtDiemtoan.setBounds(168, 176, 510, 32);
		panel.add(txtDiemtoan);
		txtDiemtoan.setColumns(10);
		
		txtDiemvan = new JTextField();
		txtDiemvan.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtDiemvan.setBounds(168, 216, 510, 32);
		panel.add(txtDiemvan);
		txtDiemvan.setColumns(10);
		
		txtNgoaingu = new JTextField();
		txtNgoaingu.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtNgoaingu.setBounds(168, 256, 510, 32);
		panel.add(txtNgoaingu);
		txtNgoaingu.setColumns(10);
		
		txtTohop = new JTextField();
		txtTohop.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtTohop.setBounds(168, 296, 510, 32);
		panel.add(txtTohop);
		txtTohop.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		btnSave.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnSave.setBounds(168, 338, 93, 32);
		panel.add(btnSave);
		btnSave.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
		
		JButton btnFind = new JButton("Find");
		btnFind.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnFind.setBounds(585, 338, 93, 32);
		panel.add(btnFind);
		btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnReset.setBounds(376, 338, 93, 32);
		panel.add(btnReset);
		btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnUpdate.setBounds(272, 338, 93, 32);
		panel.add(btnUpdate);
		btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnDelete.setBounds(480, 338, 93, 32);
		panel.add(btnDelete);	
		btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
		
		JLabel lblNewLabel = new JLabel("QUAN LI THI TOT NGHIEP THPTQG");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(188, 10, 353, 32);
		contentPane.add(lblNewLabel);
		
		tblthptqg = new JTable();
		tblthptqg.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"STT", "Ho va ten", "Gioi tinh", "CCCD/CMND", "Dien thoai", "Diem toan", "Diem van", "Ngoai ngu", "To hop"
			}
		));
		tblthptqg.getColumnModel().getColumn(0).setPreferredWidth(26);
		tblthptqg.getColumnModel().getColumn(1).setPreferredWidth(146);
		tblthptqg.getColumnModel().getColumn(2).setPreferredWidth(48);
		tblthptqg.getColumnModel().getColumn(3).setPreferredWidth(116);
		tblthptqg.getColumnModel().getColumn(4).setPreferredWidth(86);
		tblthptqg.getColumnModel().getColumn(5).setPreferredWidth(60);
		tblthptqg.getColumnModel().getColumn(6).setPreferredWidth(56);
		tblthptqg.getColumnModel().getColumn(7).setPreferredWidth(56);
		tblthptqg.getColumnModel().getColumn(8).setPreferredWidth(50);
		tblthptqg.setFont(new Font("Times New Roman", Font.PLAIN, 16));
	
		JScrollPane scrollPane = new JScrollPane(tblthptqg);
		scrollPane.setBounds(10, 456, 704, 262);
		contentPane.add(scrollPane);
		
		JLabel lblNewLabel_9 = new JLabel("Danh sach thi sinh");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel_9.setBounds(10, 424, 142, 31);
		contentPane.add(lblNewLabel_9);
	}
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {                                         
        txtHovaten.setText("");
        txtGioitinh.setText("");
        txtCCCD.setText("");
        txtSoDT.setText("");
        txtDiemtoan.setText("");
        txtDiemvan.setText("");
        txtNgoaingu.setText("");
        txtTohop.setText("");
    }                                        

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {                                        
        String hoten = txtHovaten.getText();
        String gioitinh = txtGioitinh.getText();
        String cccd = txtCCCD.getText();
        String dienthoai = txtSoDT.getText();
        float toan = Float.parseFloat(txtDiemtoan.getText());
        float van = Float.parseFloat(txtDiemvan.getText());
        float ngoaingu = Float.parseFloat(txtNgoaingu.getText());
        float tohop = Float.parseFloat(txtTohop.getText());
        
        thptqg thpt = new thptqg(hoten, gioitinh, cccd, dienthoai, toan, van, ngoaingu, tohop);
        
        thptqgModify.insert(thpt);
        
        showthptqg();
    }       
    
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {  
    	int selectedIndex = tblthptqg.getSelectedRow();
        if(selectedIndex >= 0) {
            thptqg th = thptqgList.get(selectedIndex);
            
            int option = JOptionPane.showConfirmDialog(this, "Do you want to update this item?");
            System.out.println("option : " + option);
            
            if(option == 0) {
            	String hoten = txtHovaten.getText();
                String gioitinh = txtGioitinh.getText();
                String cccd = txtCCCD.getText();
                String dienthoai = txtSoDT.getText();
                float toan = Float.parseFloat(txtDiemtoan.getText());
                float van = Float.parseFloat(txtDiemvan.getText());
                float ngoaingu = Float.parseFloat(txtNgoaingu.getText());
                float tohop = Float.parseFloat(txtTohop.getText());
                int stt=th.getStt();
                
                thptqg thpt = new thptqg(stt, hoten, gioitinh, cccd, dienthoai, toan, van, ngoaingu, tohop);
                
                thptqgModify.update(thpt);
                
                showthptqg();
            }
        }       
    }       

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {                                          
        int selectedIndex = tblthptqg.getSelectedRow();
        if(selectedIndex >= 0) {
            thptqg thpt = thptqgList.get(selectedIndex);
            
            int option = JOptionPane.showConfirmDialog(this, "Do you want to delete this item?");
            System.out.println("option : " + option);
            
            if(option == 0) {
                thptqgModify.delete(thpt.getStt());
                
                showthptqg();
            }
        }
    }                                         

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {                                        
        String input = JOptionPane.showInputDialog(this, "Enter full name to search");
        if(input != null && input.length() > 0) {
            thptqgList = thptqgModify.findByHoten(input);
            
            tableModel.setRowCount(0);
        
            for (thptqg thptqg: thptqgList) {
                tableModel.addRow(new Object[] {tableModel.getRowCount() + 1, thptqg.getHoten(), 
                    thptqg.getGioitinh(), thptqg.getCccd(), thptqg.getDienthoai(), thptqg.getToan(), thptqg.getVan(), thptqg.getNgoaingu(), thptqg.getTohop()});
            }
        } else {
            showthptqg();
        }
    }  
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		 try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException ex) {
	            java.util.logging.Logger.getLogger(giaodien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(giaodien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(giaodien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(giaodien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
		
	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					giaodien frame = new giaodien();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private JPanel contentPane;
	private JTextField txtHovaten;
	private JTextField txtGioitinh;
	private JTextField txtCCCD;
	private JTextField txtSoDT;
	private JTextField txtDiemtoan;
	private JTextField txtDiemvan;
	private JTextField txtNgoaingu;
	private JTextField txtTohop;
	private JTable tblthptqg;
}
