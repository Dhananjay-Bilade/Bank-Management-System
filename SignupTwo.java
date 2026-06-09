
package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {
    
    JTextField pan,aadhar;
    JButton next;
    JRadioButton eyes, eno, syes, sno;
    JComboBox religion, categories, occupationval, educationval, income;
    String formno;
    
    SignupTwo(String formno){
        this.formno = formno;
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setPreferredSize(new Dimension(850,800));
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,20));
        additionalDetails.setBounds(290, 80, 400, 30);
        panel.add(additionalDetails);
        
        JLabel name = new JLabel("Religion:");
        name.setFont(new Font("Raleway",Font.BOLD,18));
        name.setBounds(100, 140, 100, 30);
        panel.add(name);
        
        String[] valReligion = {"Hindu","Muslim","Sikh","Cristian","Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        panel.add(religion);
        
        JLabel category = new JLabel("Category:");
        category.setFont(new Font("Raleway",Font.BOLD,18));
        category.setBounds(100, 190, 200, 30);
        panel.add(category);
        
        String[] valCategory = {"General","OBC","SC","ST","Other"};
        categories = new JComboBox(valCategory);
        categories.setBounds(300, 190, 400, 30);
        categories.setBackground(Color.WHITE);
        panel.add(categories);
        
        JLabel dob = new JLabel("Income:");
        dob.setFont(new Font("Raleway",Font.BOLD,18));
        dob.setBounds(100, 240, 200, 30);
        panel.add(dob);
        
        String[] incomeCategory = {"Null","< 1,50,000","< 2,50,000","< 5,00,000","Upto 10,00,000"};
        income = new JComboBox(incomeCategory);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        panel.add(income);
        
        JLabel education = new JLabel("Educational");
        education.setFont(new Font("Raleway",Font.BOLD,18));
        education.setBounds(100, 290, 200, 30);
        panel.add(education);
        
        JLabel qualification = new JLabel("Qualification:");
        qualification.setFont(new Font("Raleway",Font.BOLD,18));
        qualification.setBounds(100, 315, 200, 30);
        panel.add(qualification);
        
        String[] educationValues = {"Non Graduation","Graduation","Post-Graduation","Doctrate","Others"};
        educationval = new JComboBox(educationValues);
        educationval.setBounds(300, 315, 400, 30);
        educationval.setBackground(Color.WHITE);
        panel.add(educationval);

        JLabel occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway",Font.BOLD,18));
        occupation.setBounds(100, 390, 200, 30);
        panel.add(occupation);
        
        String[] occupationValues = {"Salaried","Self Employeed","Business","Student","Retired","Others"};
        occupationval = new JComboBox(occupationValues);
        occupationval.setBounds(300, 390, 400, 30);
        occupationval.setBackground(Color.WHITE);
        panel.add(occupationval);
        
        JLabel Panno = new JLabel("PAN no:");
        Panno.setFont(new Font("Raleway",Font.BOLD,18));
        Panno.setBounds(100, 440, 200, 30);
        panel.add(Panno);
        
        pan = new JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD,14));
        pan.setBounds(300, 440, 400, 30);
        panel.add(pan);
        
        JLabel city = new JLabel("Aadhanr No:");
        city.setFont(new Font("Raleway",Font.BOLD,18));
        city.setBounds(100, 500, 200, 30);
        panel.add(city);
        
        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway",Font.BOLD,14));
        aadhar.setBounds(300, 500, 400, 30);
        panel.add(aadhar);
        
        JLabel sc = new JLabel("Senior Citizen:");
        sc.setFont(new Font("Raleway",Font.BOLD,18));
        sc.setBounds(100, 550, 200, 30);
        panel.add(sc);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300,550,100,30);
        syes.setBackground(Color.WHITE);
        panel.add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(450,550,100,30);
        sno.setBackground(Color.WHITE);
        panel.add(sno);
        
        ButtonGroup seniorCitizenGroup = new ButtonGroup();
        seniorCitizenGroup.add(syes);
        seniorCitizenGroup.add(sno);
        
        JLabel pincode = new JLabel("Existion Account:");
        pincode.setFont(new Font("Raleway",Font.BOLD,18));
        pincode.setBounds(100, 600, 200, 30);
        panel.add(pincode);
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300,600,100,30);
        eyes.setBackground(Color.WHITE);
        panel.add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(450,600,100,30);
        eno.setBackground(Color.WHITE);
        panel.add(eno);
        
        ButtonGroup existingAccountGroup = new ButtonGroup();
        existingAccountGroup.add(syes);
        existingAccountGroup.add(sno);
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        panel.add(next);
        
        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        add(scrollPane);
        
        panel.setBackground(Color.WHITE);
        
        setSize(850,700);
        setLocation(350, 10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        String sreligion = (String)religion.getSelectedItem();
        String scategories = (String)categories.getSelectedItem();
        String sincome = (String)income.getSelectedItem();
        String seducationval = (String)educationval.getSelectedItem();
        String soccupationval = (String)occupationval.getSelectedItem();
        String seniorCitizen = null;
        if (syes.isSelected()){
            seniorCitizen = "Yes";
        }else if(sno.isSelected()){
            seniorCitizen = "No";
        }

        String existingAccount = null;
        if (eyes.isSelected()){
            existingAccount = "Yes";
        }else if (eno.isSelected()){
            existingAccount = "No";
        }
        
        String span = pan.getText();
        String saadhar = aadhar.getText();     
        
        try{
                Conn c = new Conn();
                String query = "insert into signuptwo values('"+formno+"', '"+sreligion+"', '"+scategories+"', '"+sincome+"', '"+seducationval+"', '"+soccupationval+"', '"+span+"', '"+saadhar+"', '"+seniorCitizen+"', '"+existingAccount+"')";
                c.s.executeUpdate(query);
                
                //SignupThree Object
                setVisible(false);
                new SignupThree(formno).setVisible(true);
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    
    public static void main(String args[]){
        new SignupTwo("");
    }
}

