import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class WeatherInformationSystem extends Frame 
{
    private Panel panel1, panel2, panel3, panel4;
    private Button button1, button2, button3;
    private Label nameLabel, emailLabel, passwordLabel, cityLabel, tempLabel, airQualityLabel, humidityLabel, historyLabel;
    private TextField nameField, emailField, passwordField, cityField, tempField, airQualityField, humidityField;
    private ImagePanel imagePanel1, imagePanel2 , imagePanel22, imagePanel3, imagePanel4, imagePanel5;
    private String enteredCity;
    private int randomTemp, randomAirQuality, randomMoisture;

    private Font largeFont;
    private Font textFieldFont;

    public WeatherInformationSystem() 
    {

        setSize(1400, 800);
        setLayout(null);


        largeFont = new Font(Font.SANS_SERIF, Font.PLAIN, 20);
        textFieldFont = new Font(Font.SANS_SERIF, Font.PLAIN, 20);


        panel1 = new Panel();
        panel1.setLayout(null);
        panel1.setBounds(0, 0, 1300, 700);
        Label l = new Label("Welcome to the Weather Information System");
        l.setBounds(460, 20, 400, 120);
        l.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));
        imagePanel1 = new ImagePanel("image1.jpg");
        imagePanel1.setBounds(400, 100, 500, 500);
        panel1.add(imagePanel1);
        panel1.add(l);
        button1 = new Button("Next");
        button1.setBounds(605, 620, 100, 40);
	button1.setFont(largeFont);
        button1.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
	    {
                remove(panel1);
                add(panel2);
                repaint();
            }
        });
        panel1.add(button1);



        panel2 = new Panel();
        panel2.setLayout(null);
        panel2.setBounds(0, 0, 1300, 700);

        nameLabel = new Label("Name:");
        nameLabel.setBounds(500, 300, 150, 50);
        nameLabel.setFont(largeFont);
        panel2.add(nameLabel);

        nameField = new TextField();
        nameField.setBounds(650, 300, 200, 40);
        nameField.setFont(textFieldFont);
        panel2.add(nameField);

        passwordLabel = new Label("Password:");
        passwordLabel.setBounds(500, 350, 150, 50);
        passwordLabel.setFont(largeFont);
        panel2.add(passwordLabel);

        passwordField = new TextField();
        passwordField.setBounds(650, 350, 200, 40);
        passwordField.setFont(textFieldFont);
        panel2.add(passwordField);

        cityLabel = new Label("City:");
        cityLabel.setBounds(500, 400, 150, 50);
        cityLabel.setFont(largeFont);
        panel2.add(cityLabel);

        cityField = new TextField();
        cityField.setBounds(650, 400, 200, 40);
        cityField.setFont(textFieldFont);
        panel2.add(cityField);

        imagePanel2 = new ImagePanel("image2.jpg");
        imagePanel2.setBounds(400, 50, 500, 170);
        panel2.add(imagePanel2);
	
	imagePanel22 = new ImagePanel("save.jpg");
        imagePanel22.setBounds(900, 300, 300, 250);
        panel2.add(imagePanel22);

        button2 = new Button("Login");
        button2.setBounds(620, 500, 100, 30);
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                remove(panel2);
                enteredCity = cityField.getText(); 
                cityLabel.setText("City: " + enteredCity); 

                
                Random random = new Random();
                randomTemp = random.nextInt(10) + 24; 
                randomAirQuality = random.nextInt(62); 
                randomMoisture = random.nextInt(36) + 33; 
                add(panel3);
                tempField.setText(String.valueOf(randomTemp));
                airQualityField.setText(String.valueOf(randomAirQuality));
                humidityField.setText(String.valueOf(randomMoisture));
                repaint();
            }
        });
        panel2.add(button2);

     

        panel3 = new Panel();
        panel3.setLayout(null);
        panel3.setBounds(0, 0, 1400, 800);

        cityLabel = new Label("City: " + enteredCity);
        cityLabel.setBounds(220, 150, 220, 40);
        cityLabel.setFont(largeFont);
        panel3.add(cityLabel);

        tempLabel = new Label("Temperature:");
        tempLabel.setBounds(155, 250, 155, 30);
        tempLabel.setFont(largeFont);
        panel3.add(tempLabel);

        tempField = new TextField();
        tempField.setBounds(350, 250, 80, 30);
        tempField.setFont(textFieldFont);
        panel3.add(tempField);

        airQualityLabel = new Label("Air Quality Index:");
        airQualityLabel.setBounds(155, 300, 155, 30);
        airQualityLabel.setFont(largeFont);
        panel3.add(airQualityLabel);

        airQualityField = new TextField();
        airQualityField.setBounds(350, 300, 80, 30);
        airQualityField.setFont(textFieldFont);
        panel3.add(airQualityField);

        humidityLabel = new Label("Moisture:");
        humidityLabel.setBounds(155, 350, 155, 30);
        humidityLabel.setFont(largeFont);
        panel3.add(humidityLabel);

        humidityField = new TextField();
        humidityField.setBounds(350, 350, 80, 30);
        humidityField.setFont(textFieldFont);
        panel3.add(humidityField);

        Label three = new Label("The weather is Slightly warmer");
        Label three1 = new Label(" Possibility of rain is less..!");
        three.setBounds(180, 450, 280, 30);
        three1.setBounds(180, 510, 250, 30);
        three.setFont(largeFont);
        three1.setFont(largeFont);
        panel3.add(three);
        panel3.add(three1);

        imagePanel3 = new ImagePanel("imageworld.jpg");
        imagePanel3.setBounds(1, 1, 1400, 800);
        panel3.add(imagePanel3);
        button3 = new Button("See Forecast");
        button3.setBounds(220, 590, 200, 30);
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                remove(panel3);
                add(panel4);
                repaint();
            }
        });
	Button forecastButton = new Button("Summary");
forecastButton.setBounds(220, 640, 200, 30);


forecastButton.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        String forecast = "Forecast : Sunny";

        Dialog dialog = new Dialog(WeatherInformationSystem.this, "Forecast");
        dialog.setLayout(null);
        dialog.setSize(300, 150);
        Label forecastLabel = new Label(forecast);
        forecastLabel.setBounds(80, 50, 200, 30);
        dialog.add(forecastLabel);

        
        Button closeButton = new Button("Close");
        closeButton.setBounds(100, 90, 60, 20);
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();
            }
        });
        dialog.add(closeButton);

        dialog.setVisible(true);
    }
});


	imagePanel3.add(forecastButton);
        imagePanel3.add(button3);

       
	panel4 = new Panel();
	panel4.setLayout(null);
	panel4.setBounds(0, 0, 1400, 800);

	historyLabel = new Label("Weather History");
	historyLabel.setBounds(570, 90, 160, 30);
	historyLabel.setFont(largeFont);
	panel4.add(historyLabel);



	imagePanel4 = new ImagePanel("image4.jpg");
	imagePanel4.setBounds(380, 150, 550, 290);
	panel4.add(imagePanel4);


	Label qrLabel = new Label("For more details, scan the QR code below..");
	qrLabel.setBounds(870, 520, 270, 20);
	panel4.add(qrLabel);

	ImagePanel imagePanelBottomRight = new ImagePanel("image6.jpg");
	imagePanelBottomRight.setBounds(880, 560, 100, 100); // Adjust the coordinates and size accordingly
	panel4.add(imagePanelBottomRight);


	Button backButton = new Button("Go to home");
	backButton.setBounds(620, 680, 100, 30);
	backButton.addActionListener(new ActionListener() {
 	   public void actionPerformed(ActionEvent e) {
      	  remove(panel4);
      	  add(panel1);
      	  repaint();
   	 }
	});
	panel4.add(backButton);

	add(panel1);
	setVisible(true);


        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        WeatherInformationSystem weatherinformationsystem = new WeatherInformationSystem();
    }
}

class ImagePanel extends Panel {
    private Image image;

    public ImagePanel(String imagePath) {
        image = Toolkit.getDefaultToolkit().getImage(imagePath);
    }

    public void paint(Graphics g) {
        super.paint(g); 
        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
    }
}
