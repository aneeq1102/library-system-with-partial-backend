import java.awt.EventQueue;

import GUI.GUIForm;

public class Application {
	public static void main(String[] args) 
		{
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						
						GUIForm.newMemberRegistration.setVisible(true);
					
					
					} catch (Exception e) {
						
					}
				}
			});
		}
}


