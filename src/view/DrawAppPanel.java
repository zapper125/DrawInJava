package view;

import javax.swing.*;
import controller.ArtController;

public class DrawAppPanel
{
	private SpringLayout appLayout;
	private JButton redButton;
	private JButton blueButton;
	private JButton yellowButton;
	private JButton orangeButton;
	private JButton pinkButton;
	private JButton blackButton;
	private JButton whiteButton;
	private JButton violetButton;
	
	private ArtController app;
	
	public DrawAppPanel(ArtController app)
	{
		super();
		this.app = app;
		redButton = new JButton("Red");
		blueButton = new JButton("Blue");
		yellowButton = new JButton("Yellow");
		orangeButton = new JButton("Orange");
		pinkButton = new JButton("Pink");
		blackButton = new JButton("Black");
		whiteButton = new JButton("White");
		violetButton = new JButton("Violet");
		
		setupMenuPanels();
		setupScrollPanel();
		setupPanel();
		setupLayout();
		setupLiseners();
	}
	
	private void setupMenuPanels()
	{
		
	}
	
	private void setupScrollPanel()
	{
		
	}
	
	public void setupPanel()
	{
		this.setLayout(appLayout);
		this.add(redButton);
		this.add(redButton);
	}
	

	private void setupLayout()
	{
		
	}
	
	private void setupLiseners()
	{
		
	}
}
