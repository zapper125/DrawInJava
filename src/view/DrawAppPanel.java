package view;

import java.awt.GridLayout;
import java.util.Hashtable;

import javax.swing.*;
import controller.ArtController;

public class DrawAppPanel
{
	
	private SpringLayout appLayout;
	private ArtPanel canvas;
	private JPanel colorPanel;
	private JPanel menuPanel;
	private JScrollPane canvasPane;
	
	private JButton redButton;
	private JButton blueButton;
	private JButton yellowButton;
	private JButton orangeButton;
	private JButton pinkButton;
	private JButton blackButton;
	private JButton whiteButton;
	private JButton violetButton;
	
	private ArtController app;
	
	private static final int MINIMUM_LINE = 1;
	private static final int MAXIMUM_LINE = 25;
	
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
		
		saveButton = new JButton("save panel");
		loadButton = new JButton("load panel");
		clearButton = new JButton("clear panel");
		widthSlider = new JSlider(MINIMUM_LINE, MAXIMUM_LINE);
		colorPanel = new JPanel(new GridLayout(0,1));
		menuPanel = new JPanel(new GridLayout(0,1));
		
		
		setupMenuPanels();
		setupScrollPanel();
		setupSlider();
		setupPanel();
		setupLayout();
		setupLiseners();
	}
	
	private void setupSlider()
	{
		Hashtable<Integer, JLabel> scaleLabels = new Hashtable<Integer, JLabel>()
		scaleLabels.put(MINIMUM_LINE, new JLabel("<HTML>Small<BR>Line</HTML>"));
		scaleLabels.put(MINIMUM_LINE, new JLabel("<HTML>Large<BR>Line</HTML>"));
		widthSlider.setLabelTabel(scaleLables);
		widthSlider.setSnapToTicks(true);
		widthSlider.setMajorTickSpacing(5);
		widthSlider.setMinorTickSpacing(1);
		widthSlider.setpaintTicks(true);
		widthSlider.setPaintLabels(true);
		widthSlider.set((MAXIMUM_LINE + MINIMUM_LINE) / 2);
		
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
		this.add(blueButton);
	}
	

	private void setupLayout()
	{
		
	}
	
	private void setupLiseners()
	{
		
	}
}
