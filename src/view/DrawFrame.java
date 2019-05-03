package view;

import javax.swing.JFrame;
import controller.ArtController;

public class DrawFrame extends JFrame
{
	private ArtController app;
	
	public DrawFrame(ArtController app)
	{
		super();
		this.app = app;
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setVisible(true);
		this.setSize(1000, 800);
		this.setResizable(false);
		
	}
}
