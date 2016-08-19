package org.hawks.main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;
/*
 * Created by JFormDesigner on Thu Aug 18 21:35:29 MDT 2016
 */



/**
 * @author Marcus Israel
 */
public class BoiseHawksInventoryForm extends JFrame {
	public BoiseHawksInventoryForm() {
		initComponents();
	}
	//Mound clay
	private void button1MouseClicked(MouseEvent e) {
	
	}

	private void okButtonMouseClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void cancelButtonMouseClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void menuItem2MouseClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void menuItem5MouseClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void menuItem1MouseClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void menuItem3MouseClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void menuItem4MouseClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void menuItem6MouseClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void menuItem7MouseClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void menuItem8MouseClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void menuItem9MouseClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void menuItem10MouseClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void menuItem11MouseClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void menuItem12MouseClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void menuItem14MouseClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void menuItem13MouseClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Marcus Israel
		dialogPane = new JPanel();
		buttonBar = new JPanel();
		button1 = new JButton();
		okButton = new JButton();
		cancelButton = new JButton();
		menuBar1 = new JMenuBar();
		menu1 = new JMenu();
		menuItem2 = new JMenuItem();
		menuItem14 = new JMenuItem();
		menuItem5 = new JMenuItem();
		menuItem13 = new JMenuItem();
		menuItem1 = new JMenuItem();
		menuItem3 = new JMenuItem();
		menuItem4 = new JMenuItem();
		separator1 = new JPopupMenu.Separator();
		menu2 = new JMenu();
		menuItem6 = new JMenuItem();
		menuItem7 = new JMenuItem();
		menuItem8 = new JMenuItem();
		menuItem9 = new JMenuItem();
		menuItem10 = new JMenuItem();
		menuItem11 = new JMenuItem();
		menuItem12 = new JMenuItem();

		//======== this ========
		setIconImage(new ImageIcon("C:\\Users\\Marcus Israel\\Desktop\\hawksnewlogo.jpg").getImage());
		setTitle("Boise Hawks Field and Stadium Inventory");
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());

		//======== dialogPane ========
		{
			dialogPane.setBorder(Borders.createEmptyBorder("7dlu, 7dlu, 7dlu, 7dlu"));

			// JFormDesigner evaluation mark
			
			dialogPane.setLayout(new BorderLayout());

			//======== buttonBar ========
			{
				buttonBar.setBorder(Borders.createEmptyBorder("5dlu, 0dlu, 0dlu, 0dlu"));
				buttonBar.setLayout(new FormLayout(
					"$lcgap, default, $glue, $button, $rgap, $button",
					"pref"));

				//---- button1 ----
				button1.setText("Add Item");
				button1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						button1MouseClicked(e);
					}
				});
				buttonBar.add(button1, CC.xy(2, 1));

				//---- okButton ----
				okButton.setText("OK");
				okButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						okButtonMouseClicked(e);
					}
				});
				buttonBar.add(okButton, CC.xy(4, 1));

				//---- cancelButton ----
				cancelButton.setText("Cancel");
				cancelButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cancelButtonMouseClicked(e);
					}
				});
				buttonBar.add(cancelButton, CC.xy(6, 1));
			}
			dialogPane.add(buttonBar, BorderLayout.SOUTH);

			//======== menuBar1 ========
			{

				//======== menu1 ========
				{
					menu1.setText("Field Products");

					//---- menuItem2 ----
					menuItem2.setText("Chalk");
					menuItem2.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							menuItem2MouseClicked(e);
						}
					});
					menu1.add(menuItem2);

					//---- menuItem14 ----
					menuItem14.setText("Infield Fertilizer");
					menuItem14.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							menuItem14MouseClicked(e);
						}
					});
					menu1.add(menuItem14);

					//---- menuItem5 ----
					menuItem5.setText("Line Paint");
					menuItem5.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							menuItem5MouseClicked(e);
						}
					});
					menu1.add(menuItem5);

					//---- menuItem13 ----
					menuItem13.setText("Outfield Fertilizer");
					menuItem13.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							menuItem13MouseClicked(e);
						}
					});
					menu1.add(menuItem13);

					//---- menuItem1 ----
					menuItem1.setText("Turface All Purpose Mound Clay");
					menuItem1.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							menuItem1MouseClicked(e);
						}
					});
					menu1.add(menuItem1);

					//---- menuItem3 ----
					menuItem3.setText("Turface MVP Infield Conditioner");
					menuItem3.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							menuItem3MouseClicked(e);
						}
					});
					menu1.add(menuItem3);

					//---- menuItem4 ----
					menuItem4.setText("Turface Quick Drymenu ");
					menuItem4.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							menuItem4MouseClicked(e);
						}
					});
					menu1.add(menuItem4);
				}
				menuBar1.add(menu1);
				menuBar1.add(separator1);

				//======== menu2 ========
				{
					menu2.setText("Cleaning Products");

					//---- menuItem6 ----
					menuItem6.setText("Toilet Paper");
					menuItem6.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							menuItem6MouseClicked(e);
						}
					});
					menu2.add(menuItem6);

					//---- menuItem7 ----
					menuItem7.setText("Paper Towels");
					menuItem7.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							menuItem7MouseClicked(e);
						}
					});
					menu2.add(menuItem7);

					//---- menuItem8 ----
					menuItem8.setText("Antibacterial Hand Soap");
					menuItem8.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							menuItem8MouseClicked(e);
						}
					});
					menu2.add(menuItem8);

					//---- menuItem9 ----
					menuItem9.setText("Urinal Deoderizers");
					menuItem9.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							menuItem9MouseClicked(e);
						}
					});
					menu2.add(menuItem9);

					//---- menuItem10 ----
					menuItem10.setText("Comet Powder Cleanser");
					menuItem10.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							menuItem10MouseClicked(e);
						}
					});
					menu2.add(menuItem10);

					//---- menuItem11 ----
					menuItem11.setText("Large White Trash Bags");
					menuItem11.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							menuItem11MouseClicked(e);
						}
					});
					menu2.add(menuItem11);

					//---- menuItem12 ----
					menuItem12.setText("Medium Black Trash Bags");
					menuItem12.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							menuItem12MouseClicked(e);
						}
					});
					menu2.add(menuItem12);
				}
				menuBar1.add(menu2);
			}
			dialogPane.add(menuBar1, BorderLayout.NORTH);
		}
		contentPane.add(dialogPane, BorderLayout.CENTER);
		pack();
		setVisible(true);
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Marcus Israel
	private JPanel dialogPane;
	private JPanel buttonBar;
	private JButton button1;
	private JButton okButton;
	private JButton cancelButton;
	private JMenuBar menuBar1;
	private JMenu menu1;
	private JMenuItem menuItem2;
	private JMenuItem menuItem14;
	private JMenuItem menuItem5;
	private JMenuItem menuItem13;
	private JMenuItem menuItem1;
	private JMenuItem menuItem3;
	private JMenuItem menuItem4;
	private JPopupMenu.Separator separator1;
	private JMenu menu2;
	private JMenuItem menuItem6;
	private JMenuItem menuItem7;
	private JMenuItem menuItem8;
	private JMenuItem menuItem9;
	private JMenuItem menuItem10;
	private JMenuItem menuItem11;
	private JMenuItem menuItem12;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
