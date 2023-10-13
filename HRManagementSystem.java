import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class HRManagementSystem extends Frame {
    private Panel panel1, panel2, panel3, panel4, panel5;
    private List<Employee> employeeList;
    private int currentPanel;
    private TextField professionField; // Declare professionField
    private TextField experienceField;
    private TextField nameField, emailField, passwordField;
    private TextField idField, nameField2, ageField, positionField, salaryField;
    private TextField idField2;
    private TextArea employeeListArea;
    private Font labelFont, textFieldFont;
    private ImagePanel imagePanel1, imagePanel2, imagePanel3, imagePanel4, imagePanel5;

    public HRManagementSystem() {
        setTitle("Human Resource Management System");
        setSize(1500, 900);
        setLayout(null);
        currentPanel = 1;

        // Set font styles
        labelFont = new Font("Arial", Font.PLAIN, 16);
        textFieldFont = new Font("Arial", Font.PLAIN, 16);

        // Panel 1
        panel1 = new Panel();
        panel1.setBounds(0, 0, 1500, 900);
        panel1.setLayout(null);

        Label typeLabel = new Label("Select user type:");
        typeLabel.setBounds(460, 200, 150, 20);
        typeLabel.setFont(labelFont);
        panel1.add(typeLabel);
	
        List<String> userTypeList = new ArrayList<>();
        userTypeList.add("HR Employee");
        userTypeList.add("HR Manager");
        Choice userTypeChoice = new Choice();
        userTypeChoice.setBounds(700, 200, 150, 20);
        for (String userType : userTypeList) {
            userTypeChoice.add(userType);
        }
        userTypeChoice.setFont(textFieldFont);
        Label headLabel = new Label("Welcome to Human Resource Management System");
        headLabel.setBounds(480, 100, 400, 20);
        headLabel.setFont(labelFont);
        panel1.add(headLabel);

        panel1.add(userTypeChoice);

        Label nameLabel = new Label("Name:");
        nameLabel.setBounds(460, 250, 150, 30);
        nameLabel.setFont(labelFont);
        panel1.add(nameLabel);

        nameField = new TextField();
        nameField.setBounds(700, 250, 150, 30);
        nameField.setFont(textFieldFont);
        panel1.add(nameField);

        Label emailLabel = new Label("Email:");
        emailLabel.setBounds(460, 300, 150, 30);
        emailLabel.setFont(labelFont);
        panel1.add(emailLabel);

        emailField = new TextField();
        emailField.setBounds(700, 300, 150, 30);
        emailField.setFont(textFieldFont);
        panel1.add(emailField);

        Label passwordLabel = new Label("Password:");
        passwordLabel.setBounds(460, 350, 150, 30);
        passwordLabel.setFont(labelFont);
        panel1.add(passwordLabel);

        passwordField = new TextField();
        passwordField.setBounds(700, 350, 150, 30);
        passwordField.setFont(textFieldFont);
        panel1.add(passwordField);

        Button nextButton1 = new Button("Next");
        nextButton1.setBounds(600, 530, 150, 30);
        panel1.add(nextButton1);
	imagePanel1= new ImagePanel("image1.jpg");
	imagePanel1.setBounds(0,0,1400,800);
	panel1.add(imagePanel1);
        nextButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                goToPanel(2);
            }
        });

        // Panel 2
        panel2 = new Panel();
        panel2.setBounds(0, 0, 1500, 900);
        panel2.setLayout(null);

        Label ll = new Label("Select the operation to make :");
        ll.setBounds(400, 150, 200, 40);
        ll.setFont(labelFont);
        panel2.add(ll);

        Button backButton1 = new Button("Back");
        backButton1.setBounds(550, 480, 150, 30);
        panel2.add(backButton1);
        backButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                goToPanel(1);
            }
        });

        Button addButton = new Button("Add Employee");
        addButton.setBounds(550, 250, 150, 40);
        panel2.add(addButton);
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                goToPanel(3);
            }
        });

        Button removeButton = new Button("Remove Employee");
        removeButton.setBounds(550, 320, 150, 40);
        panel2.add(removeButton);
        removeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                goToPanel(4);
            }
        });

        Button displayButton = new Button("Display Employees");
        displayButton.setBounds(550, 390, 150, 40);
        panel2.add(displayButton);
	imagePanel2= new ImagePanel("image2.jpg");
	imagePanel2.setBounds(0,0,1400,800);
	panel2.add(imagePanel2);
        displayButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                goToPanel(5);
                displayEmployeeList();
            }
        });

        // Panel 3
        panel3 = new Panel();
        panel3.setBounds(0, 0, 1500, 900);
        panel3.setLayout(null);

        Label idLabel = new Label("ID:");
        idLabel.setBounds(500, 150, 120, 30);
        idLabel.setFont(labelFont);
        panel3.add(idLabel);

        idField = new TextField();
        idField.setBounds(650, 150, 150, 30);
        idField.setFont(textFieldFont);
        panel3.add(idField);

        Label nameLabel2 = new Label("Name:");
        nameLabel2.setBounds(500, 200, 120, 30);
        nameLabel2.setFont(labelFont);
        panel3.add(nameLabel2);

        nameField2 = new TextField();
        nameField2.setBounds(650, 200, 150, 30);
        nameField2.setFont(textFieldFont);
        panel3.add(nameField2);

        Label ageLabel = new Label("Age:");
        ageLabel.setBounds(500, 250, 120, 30);
        ageLabel.setFont(labelFont);
        panel3.add(ageLabel);

        ageField = new TextField();
        ageField.setBounds(650, 250, 150, 30);
        ageField.setFont(textFieldFont);
        panel3.add(ageField);

        Label positionLabel = new Label("Position:");
        positionLabel.setBounds(500, 300, 120, 30);
        positionLabel.setFont(labelFont);
        panel3.add(positionLabel);

        positionField = new TextField();
        positionField.setBounds(650, 300, 150, 30);
        positionField.setFont(textFieldFont);
        panel3.add(positionField);

        Label salaryLabel = new Label("Salary:");
        salaryLabel.setBounds(500, 350, 120, 30);
        salaryLabel.setFont(labelFont);
        panel3.add(salaryLabel);

        salaryField = new TextField();
        salaryField.setBounds(650, 350, 150, 30);
        salaryField.setFont(textFieldFont);
        panel3.add(salaryField);

        // Additional fields
        Label professionLabel = new Label("Profession:");
        professionLabel.setBounds(500, 400, 120, 30);
        professionLabel.setFont(labelFont);
        panel3.add(professionLabel);

        professionField = new TextField();
        professionField.setBounds(650, 400, 150, 30);
        professionField.setFont(textFieldFont);
        panel3.add(professionField);

        Label experienceLabel = new Label("Experience:");
        experienceLabel.setBounds(500, 450, 120, 30);
        experienceLabel.setFont(labelFont);
        panel3.add(experienceLabel);

        experienceField = new TextField();
        experienceField.setBounds(650, 450, 150, 30);
        experienceField.setFont(textFieldFont);
        panel3.add(experienceField);

        Label departmentLabel = new Label("Department:");
        departmentLabel.setBounds(500, 500, 120, 30);
        departmentLabel.setFont(labelFont);
        panel3.add(departmentLabel);

        Choice departmentChoice = new Choice();
        departmentChoice.setBounds(650, 500, 200, 30);
        departmentChoice.add("Full Stack");
        departmentChoice.add("Software Development");
        departmentChoice.add("Web designer");
        departmentChoice.setFont(textFieldFont);
        panel3.add(departmentChoice);

        Button addButton2 = new Button("Add");
        addButton2.setBounds(590, 580, 150, 30);
        panel3.add(addButton2);
	
        addButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(idField.getText());
                String name = nameField2.getText();
                int age = Integer.parseInt(ageField.getText());
                String position = positionField.getText();
                double salary = Double.parseDouble(salaryField.getText());
                String profession = professionField.getText();
                String experience = experienceField.getText();
                String department = departmentChoice.getSelectedItem();
                addEmployee(id, name, age, position, salary, profession, experience, department);
                clearFields();

                // Display dialog box
                Dialog dialog = new Dialog(HRManagementSystem.this, "Employee Added");
                dialog.setLayout(new BorderLayout());
                dialog.setSize(300, 200);
                dialog.setLocationRelativeTo(null);
                dialog.add(new Label("Employee added successfully!"), BorderLayout.CENTER);
                Button closeButton = new Button("Close");
                closeButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        dialog.dispose();
                    }
                });
                dialog.add(closeButton, BorderLayout.SOUTH);
                dialog.setVisible(true);
            }
        });

        Button backButton2 = new Button("Back");
        backButton2.setBounds(590, 650, 150, 30);
        panel3.add(backButton2);
	imagePanel3= new ImagePanel("image3.jpg");
	imagePanel3.setBounds(0,0,1400,800);
	panel3.add(imagePanel3);
        backButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                goToPanel(2);
            }
        });

        // Panel 4
        panel4 = new Panel();
        panel4.setBounds(0, 0, 1500, 900);
        panel4.setLayout(null);
        Label ll2 = new Label("Enter the ID of the employee to remove:");
        ll2.setBounds(450, 150, 300, 30);
        ll2.setFont(labelFont);
        panel4.add(ll2);

        Label idLabel2 = new Label("ID:");
        idLabel2.setBounds(550, 300, 80, 30);
        idLabel2.setFont(labelFont);
        panel4.add(idLabel2);

        idField2 = new TextField();
        idField2.setBounds(650, 300, 200, 30);
        idField2.setFont(textFieldFont);
        panel4.add(idField2);

        Button removeButton2 = new Button("Remove");
        removeButton2.setBounds(550, 450, 150, 30);
        panel4.add(removeButton2);
        removeButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(idField2.getText());
                removeEmployee(id);
                clearFields();
            }
        });

        Button backButton3 = new Button("Back");
        backButton3.setBounds(550, 550, 150, 30);
        panel4.add(backButton3);
	imagePanel4= new ImagePanel("image4.jpg");
	imagePanel4.setBounds(0,0,1400,800);
	panel4.add(imagePanel4);
        backButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                goToPanel(2);
            }
        });

        // Panel 5
        panel5 = new Panel();
        panel5.setBounds(0, 0, 1500, 900);
        panel5.setLayout(null);
        Label ll3 = new Label("The details of the Employees (current)");
        ll3.setBounds(350, 100, 300, 30);
        ll3.setFont(labelFont);
        panel5.add(ll3);

        employeeListArea = new TextArea();
        employeeListArea.setBounds(420, 180, 400, 400);
        panel5.add(employeeListArea);

        Button backButton4 = new Button("Back");
        backButton4.setBounds(590, 650, 150, 50);
        panel5.add(backButton4);
	imagePanel5= new ImagePanel("image5.jpg");
	imagePanel5.setBounds(0,0,1400,800);
	panel5.add(imagePanel5);
        backButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                goToPanel(2);
            }
        });

        // Add panels to frame
        add(panel1);
        add(panel2);
        add(panel3);
        add(panel4);
        add(panel5);
        panel1.setVisible(true);
        panel2.setVisible(false);
        panel3.setVisible(false);
        panel4.setVisible(false);
        panel5.setVisible(false);

        // Initialize employee list
        employeeList = new ArrayList<>();

        // Window listener to handle frame closing event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void goToPanel(int panel) {
        switch (panel) {
            case 1:
                panel1.setVisible(true);
                panel2.setVisible(false);
                panel3.setVisible(false);
                panel4.setVisible(false);
                panel5.setVisible(false);
                break;
            case 2:
                panel1.setVisible(false);
                panel2.setVisible(true);
                panel3.setVisible(false);
                panel4.setVisible(false);
                panel5.setVisible(false);
                break;
            case 3:
                panel1.setVisible(false);
                panel2.setVisible(false);
                panel3.setVisible(true);
                panel4.setVisible(false);
                panel5.setVisible(false);
                break;
            case 4:
                panel1.setVisible(false);
                panel2.setVisible(false);
                panel3.setVisible(false);
                panel4.setVisible(true);
                panel5.setVisible(false);
                break;
            case 5:
                panel1.setVisible(false);
                panel2.setVisible(false);
                panel3.setVisible(false);
                panel4.setVisible(false);
                panel5.setVisible(true);
                break;
            default:
                break;
        }
    }

    public void addEmployee(int id, String name, int age, String position, double salary, String profession,
                            String experience, String department) {
        Employee employee = new Employee(id, name, age, position, salary, profession, experience, department);
        employeeList.add(employee);
    }

    public void removeEmployee(int id) {
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                employeeList.remove(employee);
                break;
            }
        }
    }

    public void clearFields() {
        idField.setText("");
        nameField2.setText("");
        ageField.setText("");
        positionField.setText("");
        salaryField.setText("");
        idField2.setText("");
        professionField.setText("");
        experienceField.setText("");
    }

    public void displayEmployeeList() {
        StringBuilder sb = new StringBuilder();
        for (Employee employee : employeeList) {
            sb.append(employee.toString()).append("\n");
        }
        employeeListArea.setText(sb.toString());
    }

    public static void main(String[] args) {
        HRManagementSystem hrSystem = new HRManagementSystem();
        hrSystem.setVisible(true);
    }
class ImagePanel extends Panel {
    private Image image;

    public ImagePanel(String imagePath) {
        image = Toolkit.getDefaultToolkit().getImage(imagePath);
    }

    public void paint(Graphics g) {
        super.paint(g); // Clear the panel before painting

        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
    }
}
}

class Employee {
    private int id;
    private String name;
    private int age;
    private String position;
    private double salary;
    private String profession;
    private String experience;
    private String department;

    public Employee(int id, String name, int age, String position, double salary, String profession, String experience,
                    String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
        this.profession = profession;
        this.experience = experience;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public String getProfession() {
        return profession;
    }

    public String getExperience() {
        return experience;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "ID:  " + id + ",  Name:  " + name + ",  Age:  " + age + ",  Position:  " + position + ",  Salary:  " + salary +
                ",  Profession:  " + profession + ",  Experience:  " + experience + ",  Department:  " + department;
    }
}