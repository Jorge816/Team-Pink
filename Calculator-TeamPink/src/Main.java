/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author pedro
 */
import java.awt.Component;
import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.awt.Image;
import java.util.Timer;
import java.util.TimerTask;


public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    private HashMap<String, Component> storedTabs = new HashMap<>(); // To store removed tabs
    private int currentIndex = 0;
    private int currentIndexLabel3 = 0;
 

    public Main() {
        initComponents();
        this.setMinimumSize(new Dimension(1400, 350)); 
     
  
        //--------------------------------------------------------------------------------------------------------------------
         // Set the icon
        
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Images/logo.jpg"));
        setIconImage(icon);
        //------------------------------------------------------------------------------------------------------------

        //set image for header
         pinkIcon.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("Images/logo.jpg")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
         
         
         //Set image to dashborar
         
         azusena.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("Images/logo.jpg")).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
         jorge.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("Images/logo.jpg")).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
         pedro.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("Images/logo.jpg")).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
         osvaldo.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("Images/logo.jpg")).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
         
         pinkPanterCbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/pinkPanterCBtn.gif")));

         
        

        
        //-------------------------------------------------------------------------------------------------------------------
        //making the panels invisible
         removeAllTabs();
         //Restoring dashboar
         restoreTab("+");
         
         //start animation
         startAnimation(); // Call the method to start the animation.
        FCcontrolBtn.setVisible(false);
        
        
        //displaying Message Instruction for Currency Calculator
        setMessage1();
        //displaying message Instruction for Auto Loan Calculator
        setMessage2();
        setMessage3();
        
        //displaying message Interest Rate Calculator
        setMessage4();
        
        //display message Retirement Calculator
        setMessage5();
        
        //display message Roth IRA Calculator
        setMessage6();
        
        //display message Morgage Payoff Calculator
        setMessage7();
        
        //display message morgage calculator
        setMessage8();
         
        //display message House affordability calculator
        setMessage9();
        
        //display message rent calculator
        setMessage10();
        
        //display message refinance calculator
        setMessage11();
        
        //display message down payment calculator
        setMessage12();
        
        //display message rent and buy calculator
        setMessage13();
     
      
       
   
    }
    
    //showing about 
    // Method to show the About pop-up using JOptionPane
    public static void showAboutPopup() {
String aboutMessage = "<html>"
        + "<h2><b>This Application</b></h2>"
        + "<p>This application is a suite of calculators designed to help users make informed decisions about <b>mortgages, rent, and more.</b></p>"
        + "<p>Developed by a dedicated team of students from the Software Development class,<b>Team Pink</b>, under the guidance of <b>Dr. Johnson</b>.</p>"
        + "<p>We hope you find this tool helpful in your <b>financial planning</b>!</p>"
        + "</html>";

        
        // Display the message in a dialog box
        JOptionPane.showMessageDialog(null, new JLabel(aboutMessage), "About", JOptionPane.INFORMATION_MESSAGE);
    }
    
    //Displaying message under cosntruction
    private void startAnimation() {
        // Create a Timer to update the labels at fixed intervals
        String message = "Under Construction";
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                // If the currentIndex is less than the length of the message, keep adding letters
                if (currentIndex < message.length()) {
                    String textToShow = message.substring(0, currentIndex + 1);
                    // Update only jLabel46, jLabel39, and jLabel37 with the same text
                    jLabel46.setText(textToShow);
                    jLabel39.setText(textToShow);
                    jLabel37.setText(textToShow);
                    currentIndex++;
                } else {
                    // If the entire message has been displayed, reset currentIndex to start over
                    currentIndex = 0;
                    // Clear these labels before starting again
                    jLabel46.setText("");
                    jLabel39.setText("");
                    jLabel37.setText("");
                }
            }
        }, 0, 200); // 200ms delay between updates

        // Set a static message for jLabel3 (Team Pink, Software Development)
    
        String messageLabel3 = "Team Pink, Software Development";
        Timer timerLabel3 = new Timer();
        timerLabel3.schedule(new TimerTask() {
            @Override
            public void run() {
                // If the currentIndexLabel3 is less than the length of the messageLabel3, keep adding letters
                if (currentIndexLabel3 < messageLabel3.length()) {
                    String textToShowLabel3 = messageLabel3.substring(0, currentIndexLabel3 + 1);
                    // Update jLabel3 with the text
                    jLabel3.setText(textToShowLabel3);
                    currentIndexLabel3++;
                } else {
                    // If the entire message has been displayed, reset currentIndexLabel3 to start over
                    currentIndexLabel3 = 0;
                    // Clear the label before starting again
                    jLabel3.setText("");
                }
            }
        }, 0, 100); 
    }
    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //list of functions
    
            //seting every tab invisible 
        public void removeAllTabs() {
            // Loop backwards to avoid indexing issues when removing tabs
            for (int i = panelCalculator.getTabCount() - 1; i >= 0; i--) {
                // Get the tab title and content before removing it
                String tabTitle = panelCalculator.getTitleAt(i);
                Component tabContent = panelCalculator.getComponentAt(i);

                // Store the tab title and content in the map
                storedTabs.put(tabTitle, tabContent);

                // Remove the tab
                panelCalculator.removeTabAt(i);
            }
        }
        
                    // Restores a specific tab based on the tab title.

         public void restoreTab(String title) {
             Component tabContent = storedTabs.get(title);
             if (tabContent != null) {
                // System.out.println("Restoring tab: " + title);  // Debugging message
                 panelCalculator.addTab(title, tabContent);  // Restore the tab
             } else {
                 //System.out.println("Tab content for '" + title + "' not found in storedTabs.");
             }
         }
    

   //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
         
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pinkIcon = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btnmathCalculator = new javax.swing.JButton();
        btnfitnessCalculator = new javax.swing.JButton();
        btnOtherCalculators = new javax.swing.JButton();
        dashboard = new javax.swing.JButton();
        btnfinancialCalculator = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        FCcontrolBtn = new javax.swing.JPanel();
        MortgageandRealEstateBTN = new javax.swing.JButton();
        OtherCalculatorsBTN1 = new javax.swing.JButton();
        RetirementCalculatorBTN2 = new javax.swing.JButton();
        InvestmentCalculatorBTN3 = new javax.swing.JButton();
        autoCalculatorBTN4 = new javax.swing.JButton();
        pinkPanterCbtn = new javax.swing.JLabel();
        panelCalculator = new javax.swing.JTabbedPane();
        rentandbuy = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jTextField36 = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jTextField37 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jTextField38 = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        jTextField39 = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jTextField41 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jComboBox5 = new javax.swing.JComboBox<>();
        jPanel37 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jTextField42 = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        jTextField43 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jTextField44 = new javax.swing.JTextField();
        jTextField49 = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jTextField50 = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        jTextField51 = new javax.swing.JTextField();
        jLabel76 = new javax.swing.JLabel();
        jTextField52 = new javax.swing.JTextField();
        jTextField53 = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jTextField54 = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        jTextField55 = new javax.swing.JTextField();
        jLabel80 = new javax.swing.JLabel();
        jTextField56 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        InstructionsRentAndBuyCalculator = new javax.swing.JTextPane();
        MortgageCalculator2 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jTextField29 = new javax.swing.JTextField();
        jTextField63 = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jTextField71 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jTextField72 = new javax.swing.JTextField();
        jComboBox7 = new javax.swing.JComboBox<>();
        jComboBox8 = new javax.swing.JComboBox<>();
        jTextField80 = new javax.swing.JTextField();
        jCheckBox2 = new javax.swing.JCheckBox();
        jPanel41 = new javax.swing.JPanel();
        jLabel88 = new javax.swing.JLabel();
        jTextField64 = new javax.swing.JTextField();
        jLabel89 = new javax.swing.JLabel();
        jTextField65 = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        jTextField66 = new javax.swing.JTextField();
        jTextField67 = new javax.swing.JTextField();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jTextField68 = new javax.swing.JTextField();
        jComboBox9 = new javax.swing.JComboBox<>();
        jComboBox10 = new javax.swing.JComboBox<>();
        jComboBox11 = new javax.swing.JComboBox<>();
        jComboBox12 = new javax.swing.JComboBox<>();
        jComboBox13 = new javax.swing.JComboBox<>();
        jButton11 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        InstructionsMortgageCalculator = new javax.swing.JTextPane();
        retirementCalculator3 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jTextField30 = new javax.swing.JTextField();
        jTextField69 = new javax.swing.JTextField();
        jLabel93 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jTextField73 = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        jTextField74 = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jLabel69 = new javax.swing.JLabel();
        jTextField31 = new javax.swing.JTextField();
        jLabel94 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jTextField75 = new javax.swing.JTextField();
        jTextField79 = new javax.swing.JTextField();
        jLabel103 = new javax.swing.JLabel();
        jTextField81 = new javax.swing.JTextField();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jTextField82 = new javax.swing.JTextField();
        jLabel106 = new javax.swing.JLabel();
        jTextField83 = new javax.swing.JTextField();
        jLabel107 = new javax.swing.JLabel();
        jTextField84 = new javax.swing.JTextField();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox21 = new javax.swing.JComboBox<>();
        jPanel44 = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        InstructionsRetirementCalculator = new javax.swing.JTextPane();
        HouseAffordabilityCalculator = new javax.swing.JPanel();
        jPanel49 = new javax.swing.JPanel();
        jPanel50 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        jPanel51 = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        jTextField32 = new javax.swing.JTextField();
        jTextField70 = new javax.swing.JTextField();
        jLabel100 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jTextField76 = new javax.swing.JTextField();
        jLabel108 = new javax.swing.JLabel();
        jTextField77 = new javax.swing.JTextField();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jLabel109 = new javax.swing.JLabel();
        jTextField33 = new javax.swing.JTextField();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jTextField78 = new javax.swing.JTextField();
        jTextField85 = new javax.swing.JTextField();
        jLabel112 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jTextField90 = new javax.swing.JTextField();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jComboBox15 = new javax.swing.JComboBox<>();
        jComboBox16 = new javax.swing.JComboBox<>();
        jComboBox17 = new javax.swing.JComboBox<>();
        jComboBox18 = new javax.swing.JComboBox<>();
        jComboBox19 = new javax.swing.JComboBox<>();
        jScrollPane9 = new javax.swing.JScrollPane();
        InstructionsHouseAffordabilityCalculator = new javax.swing.JTextPane();
        RentCalculator = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel28 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        InstructionsRentCalculator = new javax.swing.JTextPane();
        RefinanceCalculator = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jPanel24 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel38 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        InstructionsRefinanceCalculator = new javax.swing.JTextPane();
        RothIRACalculator = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        jPanel47 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        RothIRACalculatorCurrentBalance = new javax.swing.JTextField();
        RothIRACalculateBTN = new javax.swing.JButton();
        RothIRAclearBTN = new javax.swing.JButton();
        LabelAnnualContribution = new javax.swing.JLabel();
        RothIRAAnualContribution = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        RothIRAMaximizeYes = new javax.swing.JRadioButton();
        RothIRAMaximizeNO = new javax.swing.JRadioButton();
        jLabel71 = new javax.swing.JLabel();
        RothIRACalculatorExpectedReturnRate = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        RothIRACurrentAge = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();
        RothIRaRetirementAge = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();
        jPanel48 = new javax.swing.JPanel();
        RothIRAoutput = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        InstructionsRothIRACalculator = new javax.swing.JTextPane();
        downpaymentCalculator = new javax.swing.JPanel();
        jPanel59 = new javax.swing.JPanel();
        jPanel60 = new javax.swing.JPanel();
        jLabel128 = new javax.swing.JLabel();
        jPanel61 = new javax.swing.JPanel();
        jTextField45 = new javax.swing.JTextField();
        jTextField94 = new javax.swing.JTextField();
        jLabel132 = new javax.swing.JLabel();
        jTextField95 = new javax.swing.JTextField();
        jLabel133 = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jLabel134 = new javax.swing.JLabel();
        jTextField46 = new javax.swing.JTextField();
        jLabel138 = new javax.swing.JLabel();
        jTextField99 = new javax.swing.JTextField();
        jCheckBox3 = new javax.swing.JCheckBox();
        jComboBox20 = new javax.swing.JComboBox<>();
        jScrollPane12 = new javax.swing.JScrollPane();
        InstructionsDownPaymentCalculator = new javax.swing.JTextPane();
        MortgagePayoffCalculator = new javax.swing.JPanel();
        jPanel56 = new javax.swing.JPanel();
        jPanel57 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jTextField27 = new javax.swing.JTextField();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jLabel118 = new javax.swing.JLabel();
        jTextField28 = new javax.swing.JTextField();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel120 = new javax.swing.JLabel();
        jTextField34 = new javax.swing.JTextField();
        jLabel121 = new javax.swing.JLabel();
        jTextField40 = new javax.swing.JTextField();
        jTextField59 = new javax.swing.JTextField();
        jTextField60 = new javax.swing.JTextField();
        jLabel125 = new javax.swing.JLabel();
        jTextField61 = new javax.swing.JTextField();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jPanel58 = new javax.swing.JPanel();
        jLabel124 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        InstructionsMortgagePayoffCalculator = new javax.swing.JTextPane();
        MathCalculator = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        FitnessAndHealthCalculator = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        OtherCalculator = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        Currency = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel31 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        instructionCurrencyCalculator = new javax.swing.JTextPane();
        AutoLoan = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel62 = new javax.swing.JPanel();
        jPanel64 = new javax.swing.JPanel();
        jLabel141 = new javax.swing.JLabel();
        jTextField47 = new javax.swing.JTextField();
        jTextField101 = new javax.swing.JTextField();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jTextField102 = new javax.swing.JTextField();
        jLabel144 = new javax.swing.JLabel();
        jTextField103 = new javax.swing.JTextField();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jLabel145 = new javax.swing.JLabel();
        jTextField48 = new javax.swing.JTextField();
        jLabel146 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        jTextField104 = new javax.swing.JTextField();
        jTextField105 = new javax.swing.JTextField();
        jLabel148 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jTextField106 = new javax.swing.JTextField();
        jComboBox28 = new javax.swing.JComboBox<>();
        jLabel150 = new javax.swing.JLabel();
        jTextField107 = new javax.swing.JTextField();
        jCheckBox4 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        InstructionsAutoLoanCalculator = new javax.swing.JTextPane();
        jPanel68 = new javax.swing.JPanel();
        jPanel69 = new javax.swing.JPanel();
        jLabel162 = new javax.swing.JLabel();
        jTextField62 = new javax.swing.JTextField();
        jTextField115 = new javax.swing.JTextField();
        jLabel163 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        jTextField116 = new javax.swing.JTextField();
        jLabel165 = new javax.swing.JLabel();
        jTextField117 = new javax.swing.JTextField();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jLabel166 = new javax.swing.JLabel();
        jTextField86 = new javax.swing.JTextField();
        jLabel167 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        jTextField118 = new javax.swing.JTextField();
        jTextField119 = new javax.swing.JTextField();
        jLabel169 = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        jTextField120 = new javax.swing.JTextField();
        jComboBox29 = new javax.swing.JComboBox<>();
        jLabel171 = new javax.swing.JLabel();
        jTextField121 = new javax.swing.JTextField();
        jCheckBox6 = new javax.swing.JCheckBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        InstructionsAutoLoan2Calculator = new javax.swing.JTextPane();
        jPanel63 = new javax.swing.JPanel();
        jLabel140 = new javax.swing.JLabel();
        InterestRate = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        InterestRateInitialInvestment = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        InterestRateCalculatorCalculateBTN = new javax.swing.JButton();
        InterestRateCalculatorClearBTN = new javax.swing.JButton();
        InterestRateAnnualContribution = new javax.swing.JTextField();
        jLabel116 = new javax.swing.JLabel();
        InterestRateMonthlyContribution = new javax.swing.JTextField();
        InterestRateBeggnning = new javax.swing.JRadioButton();
        InterestRateEnd = new javax.swing.JRadioButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        InterestRateCompoundPeriods = new javax.swing.JComboBox<>();
        jLabel117 = new javax.swing.JLabel();
        InterestRateInterest = new javax.swing.JTextField();
        InterestRateInvestmentLengthYears = new javax.swing.JTextField();
        jLabel119 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        InterestRateOutput = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        InstructionsRateCalculator = new javax.swing.JTextPane();
        jPanel19 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        azusena = new javax.swing.JLabel();
        osvaldo = new javax.swing.JLabel();
        pedro = new javax.swing.JLabel();
        jorge = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        quitBnt = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 215, 255));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Team Pink ,  Software Development");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(pinkIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pinkIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(255, 215, 255));
        jPanel7.setMaximumSize(new java.awt.Dimension(130, 32767));
        jPanel7.setMinimumSize(new java.awt.Dimension(130, 0));
        jPanel7.setPreferredSize(new java.awt.Dimension(100, 0));

        btnmathCalculator.setText("Math Calculators");
        btnmathCalculator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmathCalculatorActionPerformed(evt);
            }
        });

        btnfitnessCalculator.setText("Fitness & Health Calculators");
        btnfitnessCalculator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfitnessCalculatorActionPerformed(evt);
            }
        });

        btnOtherCalculators.setText("Other Calculators");
        btnOtherCalculators.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOtherCalculatorsActionPerformed(evt);
            }
        });

        dashboard.setText("Dashboard");
        dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardActionPerformed(evt);
            }
        });

        btnfinancialCalculator.setText("Financial Calculators ");
        btnfinancialCalculator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfinancialCalculatorActionPerformed(evt);
            }
        });

        jLabel1.setText("All rights reserved.");

        jLabel2.setText("© 2024 Team Pink.  ");

        FCcontrolBtn.setBackground(new java.awt.Color(255, 237, 255));

        MortgageandRealEstateBTN.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        MortgageandRealEstateBTN.setText("Mortgage and Real Estate");
        MortgageandRealEstateBTN.setActionCommand("Currency Calculatro");
        MortgageandRealEstateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MortgageandRealEstateBTNActionPerformed(evt);
            }
        });

        OtherCalculatorsBTN1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        OtherCalculatorsBTN1.setText("Other");
        OtherCalculatorsBTN1.setActionCommand("Currency Calculatro");
        OtherCalculatorsBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OtherCalculatorsBTN1ActionPerformed(evt);
            }
        });

        RetirementCalculatorBTN2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        RetirementCalculatorBTN2.setText("Retirement");
        RetirementCalculatorBTN2.setActionCommand("Currency Calculatro");
        RetirementCalculatorBTN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetirementCalculatorBTN2ActionPerformed(evt);
            }
        });

        InvestmentCalculatorBTN3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        InvestmentCalculatorBTN3.setText("Investment");
        InvestmentCalculatorBTN3.setActionCommand("Currency Calculatro");
        InvestmentCalculatorBTN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InvestmentCalculatorBTN3ActionPerformed(evt);
            }
        });

        autoCalculatorBTN4.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        autoCalculatorBTN4.setText("Auto");
        autoCalculatorBTN4.setActionCommand("Currency Calculatro");
        autoCalculatorBTN4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoCalculatorBTN4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FCcontrolBtnLayout = new javax.swing.GroupLayout(FCcontrolBtn);
        FCcontrolBtn.setLayout(FCcontrolBtnLayout);
        FCcontrolBtnLayout.setHorizontalGroup(
            FCcontrolBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FCcontrolBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FCcontrolBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FCcontrolBtnLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(FCcontrolBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(InvestmentCalculatorBTN3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RetirementCalculatorBTN2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MortgageandRealEstateBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(OtherCalculatorsBTN1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(autoCalculatorBTN4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        FCcontrolBtnLayout.setVerticalGroup(
            FCcontrolBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FCcontrolBtnLayout.createSequentialGroup()
                .addComponent(MortgageandRealEstateBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RetirementCalculatorBTN2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InvestmentCalculatorBTN3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(autoCalculatorBTN4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OtherCalculatorsBTN1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pinkPanterCbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pinkPanterCBtn.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(pinkPanterCbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(btnOtherCalculators, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dashboard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnfinancialCalculator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnfitnessCalculator, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnmathCalculator, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(FCcontrolBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(dashboard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnfinancialCalculator)
                .addGap(1, 1, 1)
                .addComponent(FCcontrolBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnfitnessCalculator)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnmathCalculator)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOtherCalculators)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pinkPanterCbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelCalculator.setBackground(new java.awt.Color(255, 215, 255));

        rentandbuy.setBackground(new java.awt.Color(255, 237, 255));

        jPanel35.setBackground(new java.awt.Color(255, 237, 255));

        jPanel36.setBackground(new java.awt.Color(204, 255, 204));
        jPanel36.setEnabled(false);

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel40.setText("Home Rent");

        jLabel42.setText("Rental Fee Increase");

        jLabel57.setText("Renter's Insurance");

        jLabel58.setText("Security Deposit");

        jLabel59.setText("Upfront Cost");

        jLabel43.setText("Montly Rental Fee");

        jLabel60.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel60.setText("Your Information");

        jLabel61.setText("Average Investment Return");

        jLabel62.setText("Marginal Federal Tax Rate");

        jLabel63.setText("Marginal StateTax Rate");

        jLabel64.setText("Tax Filing Status");

        jButton9.setText("Calculate");

        jButton10.setText("Clear");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married filing jointly", "Married filing separately", "Head of household", "qualified widow" }));

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField21)
                        .addContainerGap())
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField23)
                        .addContainerGap())
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField22)
                        .addContainerGap())
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField37)
                        .addContainerGap())
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField36)
                        .addContainerGap())
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel64, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel63, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel62, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel61, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(jLabel60, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField38)
                            .addComponent(jTextField39)
                            .addComponent(jTextField41)
                            .addGroup(jPanel36Layout.createSequentialGroup()
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jComboBox5, 0, 1, Short.MAX_VALUE))
                        .addGap(11, 11, 11))))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(jTextField23))
                .addGap(18, 18, 18)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(jTextField22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel58)
                    .addComponent(jTextField37))
                .addGap(18, 18, 18)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(jTextField36))
                .addGap(21, 21, 21)
                .addComponent(jLabel60)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(jTextField38))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(jTextField39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63)
                    .addComponent(jTextField41))
                .addGap(18, 18, 18)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11))
        );

        jPanel37.setBackground(new java.awt.Color(204, 255, 204));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel41.setText("Home Purchace");

        jLabel44.setText("Down Payment");

        jLabel65.setText("Interest Rate");

        jLabel66.setText("Loan Term");

        jLabel67.setText("Buying Closing Cost");

        jLabel45.setText("Home Price");

        jLabel73.setText("Property Taxes");

        jLabel74.setText("Property Taxes Increase");

        jLabel75.setText("Home Insurance");

        jLabel76.setText("HOA Fee");

        jLabel77.setText("Maintanence Cost");

        jLabel78.setText("Home Value Appreciation");

        jLabel79.setText("Selling Closing Cost");

        jLabel80.setText("Cost/Insurance Increase");

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel76, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel78, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(jLabel80, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel79, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField56, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(jTextField55)
                            .addComponent(jTextField54)
                            .addComponent(jTextField53)
                            .addComponent(jTextField52)
                            .addComponent(jTextField51)
                            .addComponent(jTextField50)
                            .addComponent(jTextField49)
                            .addComponent(jTextField42)
                            .addComponent(jTextField43)
                            .addComponent(jTextField35)
                            .addComponent(jTextField44)
                            .addComponent(jTextField24))
                        .addContainerGap())))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(jTextField44))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(jTextField35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel66)
                    .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 9, Short.MAX_VALUE)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(jTextField42))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel73)
                    .addComponent(jTextField49))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74)
                    .addComponent(jTextField50))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel75)
                    .addComponent(jTextField51))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76)
                    .addComponent(jTextField52))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel77)
                    .addComponent(jTextField53))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel78)
                    .addComponent(jTextField54))
                .addGap(2, 2, 2)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField55)
                    .addComponent(jLabel80))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79)
                    .addComponent(jTextField56))
                .addGap(19, 19, 19))
        );

        jLabel5.setText("Output here");

        InstructionsRentAndBuyCalculator.setBackground(new java.awt.Color(255, 215, 255));
        jScrollPane13.setViewportView(InstructionsRentAndBuyCalculator);

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel35Layout.createSequentialGroup()
                        .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout rentandbuyLayout = new javax.swing.GroupLayout(rentandbuy);
        rentandbuy.setLayout(rentandbuyLayout);
        rentandbuyLayout.setHorizontalGroup(
            rentandbuyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rentandbuyLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        rentandbuyLayout.setVerticalGroup(
            rentandbuyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rentandbuyLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        panelCalculator.addTab("Rent vs Buy Calculator", rentandbuy);

        MortgageCalculator2.setBackground(new java.awt.Color(255, 237, 255));

        jPanel39.setBackground(new java.awt.Color(255, 237, 255));

        jPanel40.setBackground(new java.awt.Color(204, 255, 204));
        jPanel40.setEnabled(false);

        jLabel72.setText("Output here");

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel72, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel42.setBackground(new java.awt.Color(204, 255, 204));

        jLabel52.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel52.setText("Home Purchace");

        jLabel53.setText("Down Payment");

        jLabel87.setText("Loan Term");

        jLabel95.setText("Interest Rate");

        jLabel96.setText("Start Date");

        jLabel54.setText("Home Price");

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "%", "$" }));

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }));

        jCheckBox2.setText("Include Taxes & Cost Below");

        jPanel41.setBackground(new java.awt.Color(204, 255, 204));

        jLabel88.setText("Property Taxes Increase");

        jLabel89.setText("Home Insurance");

        jLabel90.setText("PMI Insurance");

        jLabel91.setText("HOA Fee");

        jLabel92.setText("Other Costs");

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "%", "$" }));

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "%", "$" }));

        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "%", "$" }));

        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "%", "$" }));

        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "%", "$" }));

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel88, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(jLabel89, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel90, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel91, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel92, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addComponent(jTextField68, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addComponent(jTextField67)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addComponent(jTextField66)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addComponent(jTextField65)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addComponent(jTextField64)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel88)
                    .addComponent(jTextField64)
                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel89)
                    .addComponent(jTextField65)
                    .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel90)
                    .addComponent(jTextField66)
                    .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel91)
                    .addComponent(jTextField67)
                    .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel92)
                    .addComponent(jTextField68)
                    .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jButton11.setText("Calculate");

        jButton13.setText("Clear");

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(jLabel87, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel95, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel96, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField63)
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addComponent(jTextField72, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField71))
                            .addComponent(jTextField80))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel42Layout.createSequentialGroup()
                        .addComponent(jCheckBox2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 11, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel42Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(jTextField72)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel87)
                    .addComponent(jTextField63))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel95)
                    .addComponent(jTextField80))
                .addGap(1, 1, 1)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel96)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField71))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37))
        );

        InstructionsMortgageCalculator.setBackground(new java.awt.Color(255, 215, 255));
        jScrollPane8.setViewportView(InstructionsMortgageCalculator);

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap(380, Short.MAX_VALUE)
                .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel39Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(675, Short.MAX_VALUE)))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel39Layout.createSequentialGroup()
                    .addContainerGap(16, Short.MAX_VALUE)
                    .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(25, 25, 25)))
        );

        javax.swing.GroupLayout MortgageCalculator2Layout = new javax.swing.GroupLayout(MortgageCalculator2);
        MortgageCalculator2.setLayout(MortgageCalculator2Layout);
        MortgageCalculator2Layout.setHorizontalGroup(
            MortgageCalculator2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MortgageCalculator2Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        MortgageCalculator2Layout.setVerticalGroup(
            MortgageCalculator2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MortgageCalculator2Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        panelCalculator.addTab("Mortgage Calculator", MortgageCalculator2);

        retirementCalculator3.setBackground(new java.awt.Color(255, 237, 255));

        jPanel43.setBackground(new java.awt.Color(255, 237, 255));

        jPanel45.setBackground(new java.awt.Color(204, 255, 204));

        jLabel56.setText("Your life expentency");

        jLabel93.setText("Your current pre-tax income");

        jLabel97.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel97.setText("Assumptions");

        jLabel98.setText("Your current income increase");

        jLabel68.setText("Your Current Age");

        jButton12.setText("Calculate");

        jButton14.setText("Clear");

        jLabel69.setText("Your plan retirement age");

        jLabel94.setText("Income Needed after retirement");

        jLabel99.setText("Average Investment return");

        jLabel103.setText("Inflation rate");

        jLabel104.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel104.setText("Optional");

        jLabel105.setText("Other income after retirement");

        jLabel106.setText("Your current retirement savings");

        jLabel107.setText("Future retirement Savings");

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "%", "$" }));

        jComboBox21.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "%", "$" }));

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel45Layout.createSequentialGroup()
                                .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField83, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel45Layout.createSequentialGroup()
                                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel45Layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel107, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel45Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel45Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField84)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox21, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel104, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel45Layout.createSequentialGroup()
                                .addComponent(jLabel98, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(173, 173, 173))
                            .addGroup(jPanel45Layout.createSequentialGroup()
                                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel45Layout.createSequentialGroup()
                                        .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField82, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel45Layout.createSequentialGroup()
                                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel93, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField74, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField69, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel45Layout.createSequentialGroup()
                                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel103, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel99, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel94, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                                        .addGap(1, 1, 1)
                                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField79, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                            .addComponent(jTextField75)
                                            .addComponent(jTextField81)
                                            .addComponent(jTextField73))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addComponent(jLabel68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addComponent(jTextField30, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                        .addGap(3, 3, 3)
                        .addComponent(jTextField31, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(jTextField74))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField69, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(jLabel93))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel97)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel98)
                    .addComponent(jTextField73))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel94)
                    .addComponent(jTextField79)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel99)
                    .addComponent(jTextField75))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel103)
                    .addComponent(jTextField81))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel104)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel105)
                    .addComponent(jTextField82))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel106)
                    .addComponent(jTextField83))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel107)
                    .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField84, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox21, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel44.setBackground(new java.awt.Color(204, 255, 204));
        jPanel44.setEnabled(false);

        jLabel81.setText("Output here");

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel44Layout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        InstructionsRetirementCalculator.setBackground(new java.awt.Color(255, 215, 255));
        jScrollPane5.setViewportView(InstructionsRetirementCalculator);

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(106, 106, 106)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel43Layout.createSequentialGroup()
                        .addComponent(jPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel43Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout retirementCalculator3Layout = new javax.swing.GroupLayout(retirementCalculator3);
        retirementCalculator3.setLayout(retirementCalculator3Layout);
        retirementCalculator3Layout.setHorizontalGroup(
            retirementCalculator3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(retirementCalculator3Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        retirementCalculator3Layout.setVerticalGroup(
            retirementCalculator3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(retirementCalculator3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelCalculator.addTab("Retirement Calculator", retirementCalculator3);

        HouseAffordabilityCalculator.setBackground(new java.awt.Color(255, 237, 255));

        jPanel49.setBackground(new java.awt.Color(255, 237, 255));

        jPanel50.setBackground(new java.awt.Color(204, 255, 204));
        jPanel50.setEnabled(false);

        jLabel85.setText("Output here");

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel50Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel51.setBackground(new java.awt.Color(204, 255, 204));

        jLabel86.setText("Interest rate");

        jLabel100.setText("Monthly debt payback");

        jLabel102.setText("Property Tax ");

        jLabel108.setText("Annual Household Income");

        jButton17.setText("Calculate");

        jButton18.setText("Clear");

        jLabel109.setText("Mortgage loan term");

        jLabel110.setText("HOA or co-op fee");

        jLabel111.setText("Insurance ");

        jLabel112.setText("Debt-to-income (DTI) ratio");

        jLabel101.setText("Down Payment ");

        jLabel113.setText("salary + other income (before tax)");

        jLabel114.setText("years");

        jLabel115.setText("long-term debs, car, student loan, etc");

        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "%", "$" }));

        jComboBox16.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "% per year", "$ per year" }));

        jComboBox17.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "% per year", "$ per year" }));

        jComboBox18.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "% per year", "$ per year" }));

        jComboBox19.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Conventional loan (28/36 rule)", "FHA loan (31% front-end", "43% back-end)", "VA loan (41%)", "10%", "15%", "20%", "25%", "30%", "35%", "40%", "45%", "50%" }));

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel51Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel51Layout.createSequentialGroup()
                        .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(397, Short.MAX_VALUE))
                    .addGroup(jPanel51Layout.createSequentialGroup()
                        .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel109, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel108, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                .addComponent(jLabel86, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel100, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel102, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel101, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel111, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(jLabel112, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox19, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel51Layout.createSequentialGroup()
                                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel51Layout.createSequentialGroup()
                                        .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTextField70, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField32, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                            .addComponent(jTextField33, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField77, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField76)
                                            .addComponent(jTextField90, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel51Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jTextField85, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField78))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel51Layout.createSequentialGroup()
                                        .addComponent(jComboBox18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(125, 125, 125))
                                    .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel51Layout.createSequentialGroup()
                                            .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel113, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel114, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                .addGroup(jPanel51Layout.createSequentialGroup()
                                                    .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBox16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(0, 0, Short.MAX_VALUE)))
                                            .addGap(18, 18, 18))
                                        .addGroup(jPanel51Layout.createSequentialGroup()
                                            .addComponent(jComboBox17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))))
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel108, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField32)
                    .addComponent(jLabel113, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(3, 3, 3)
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel109, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField33)
                    .addComponent(jLabel114, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel86)
                    .addComponent(jTextField77))
                .addGap(18, 18, 18)
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel100)
                    .addComponent(jTextField70)
                    .addComponent(jLabel115, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel101)
                    .addComponent(jTextField90)
                    .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel102)
                    .addComponent(jTextField76)
                    .addComponent(jComboBox16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel110)
                    .addComponent(jTextField85)
                    .addComponent(jComboBox17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel111)
                    .addComponent(jTextField78)
                    .addComponent(jComboBox18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel112)
                    .addComponent(jComboBox19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        InstructionsHouseAffordabilityCalculator.setBackground(new java.awt.Color(255, 215, 255));
        jScrollPane9.setViewportView(InstructionsHouseAffordabilityCalculator);

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel49Layout.createSequentialGroup()
                        .addComponent(jPanel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout HouseAffordabilityCalculatorLayout = new javax.swing.GroupLayout(HouseAffordabilityCalculator);
        HouseAffordabilityCalculator.setLayout(HouseAffordabilityCalculatorLayout);
        HouseAffordabilityCalculatorLayout.setHorizontalGroup(
            HouseAffordabilityCalculatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HouseAffordabilityCalculatorLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        HouseAffordabilityCalculatorLayout.setVerticalGroup(
            HouseAffordabilityCalculatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HouseAffordabilityCalculatorLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        panelCalculator.addTab("House Affordability Calculator", HouseAffordabilityCalculator);

        RentCalculator.setBackground(new java.awt.Color(255, 237, 255));

        jPanel26.setBackground(new java.awt.Color(255, 237, 255));

        jPanel27.setBackground(new java.awt.Color(204, 255, 204));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "per year", "per month" }));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel27.setText("Your pre-tax income");

        jTextField11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel28.setText("Your monthly debt payback");

        jTextField12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel29.setText("car/student loan, credit cards, etc");

        jButton5.setText("Calculate ");

        jButton6.setText("Clear");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField11)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField12)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField11, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField12, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addGap(40, 40, 40)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(28, 28, 28))
        );

        jPanel28.setBackground(new java.awt.Color(204, 255, 204));

        jLabel30.setText("Display output here");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        InstructionsRentCalculator.setBackground(new java.awt.Color(255, 215, 255));
        jScrollPane10.setViewportView(InstructionsRentCalculator);

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane10)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout RentCalculatorLayout = new javax.swing.GroupLayout(RentCalculator);
        RentCalculator.setLayout(RentCalculatorLayout);
        RentCalculatorLayout.setHorizontalGroup(
            RentCalculatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RentCalculatorLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        RentCalculatorLayout.setVerticalGroup(
            RentCalculatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RentCalculatorLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        panelCalculator.addTab("Rent Calculator", RentCalculator);

        RefinanceCalculator.setBackground(new java.awt.Color(255, 237, 255));

        jPanel25.setBackground(new java.awt.Color(255, 237, 255));

        jPanel18.setBackground(new java.awt.Color(204, 255, 204));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "I know my remaining balance", "I know the orginal loan amount" }));

        jLabel12.setText("Current Loan");

        jLabel13.setText("Remaining Balance");

        jLabel14.setText("Monthly Payment");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel15.setText("Interest Rate");

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField3)
                    .addComponent(jTextField4)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox1, 0, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1)
                .addGap(26, 26, 26)
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField10)
                .addGap(26, 26, 26)
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4)
                .addGap(34, 34, 34))
        );

        jPanel24.setBackground(new java.awt.Color(204, 255, 204));

        jLabel17.setText("New Loan");

        jLabel18.setText("New Loan Term");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel22.setText("Interest Rate");

        jLabel24.setText("Points");

        jLabel25.setText("Costs and Fees");

        jLabel26.setText("Cashout");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField6))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel24Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(10, 10, 10))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(59, Short.MAX_VALUE))))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addGap(18, 24, Short.MAX_VALUE)
                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jButton3.setText("Calculate");

        jButton4.setText("Clear");

        jPanel38.setBackground(new java.awt.Color(204, 255, 204));

        jLabel36.setText("Display Output here");

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        InstructionsRefinanceCalculator.setBackground(new java.awt.Color(255, 215, 255));
        jScrollPane11.setViewportView(InstructionsRefinanceCalculator);

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(16, 16, 16)
                        .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))))
        );

        javax.swing.GroupLayout RefinanceCalculatorLayout = new javax.swing.GroupLayout(RefinanceCalculator);
        RefinanceCalculator.setLayout(RefinanceCalculatorLayout);
        RefinanceCalculatorLayout.setHorizontalGroup(
            RefinanceCalculatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RefinanceCalculatorLayout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        RefinanceCalculatorLayout.setVerticalGroup(
            RefinanceCalculatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RefinanceCalculatorLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        panelCalculator.addTab("Refinance Calculator", RefinanceCalculator);

        RothIRACalculator.setBackground(new java.awt.Color(255, 237, 255));

        jPanel46.setBackground(new java.awt.Color(255, 237, 255));

        jPanel47.setBackground(new java.awt.Color(204, 255, 204));

        jLabel48.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel48.setText("Currenct Balance               $");

        RothIRACalculatorCurrentBalance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RothIRACalculatorCurrentBalanceKeyReleased(evt);
            }
        });

        RothIRACalculateBTN.setText("Calculate");
        RothIRACalculateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RothIRACalculateBTNActionPerformed(evt);
            }
        });

        RothIRAclearBTN.setText("Clear");
        RothIRAclearBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RothIRAclearBTNActionPerformed(evt);
            }
        });

        LabelAnnualContribution.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LabelAnnualContribution.setText("Anual Contribution           $");

        RothIRAAnualContribution.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RothIRAAnualContributionKeyReleased(evt);
            }
        });

        jLabel70.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel70.setText("Maximize Contribution?");

        RothIRAMaximizeYes.setText("Yes");
        RothIRAMaximizeYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RothIRAMaximizeYesActionPerformed(evt);
            }
        });

        RothIRAMaximizeNO.setText("No");
        RothIRAMaximizeNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RothIRAMaximizeNOActionPerformed(evt);
            }
        });

        jLabel71.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel71.setText("Expected rate of return        %");

        RothIRACalculatorExpectedReturnRate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RothIRACalculatorExpectedReturnRateKeyReleased(evt);
            }
        });

        jLabel82.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel82.setText("Current age");

        RothIRACurrentAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RothIRACurrentAgeKeyReleased(evt);
            }
        });

        jLabel83.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel83.setText("Retirement Age ");

        RothIRaRetirementAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RothIRaRetirementAgeKeyReleased(evt);
            }
        });

        jLabel84.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel84.setText("Marginal tax rate");

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel47Layout.createSequentialGroup()
                        .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel47Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(RothIRAMaximizeYes, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RothIRAMaximizeNO, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel47Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel82)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel47Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel47Layout.createSequentialGroup()
                                .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RothIRACalculatorExpectedReturnRate, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel47Layout.createSequentialGroup()
                                .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RothIRACalculatorCurrentBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel47Layout.createSequentialGroup()
                                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(LabelAnnualContribution, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RothIRAAnualContribution, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel47Layout.createSequentialGroup()
                                .addComponent(RothIRACalculateBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RothIRAclearBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel47Layout.createSequentialGroup()
                                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField26, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                    .addComponent(RothIRaRetirementAge)
                                    .addComponent(RothIRACurrentAge))))))
                .addContainerGap())
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(RothIRACalculatorCurrentBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelAnnualContribution)
                    .addComponent(RothIRAAnualContribution, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel70)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RothIRAMaximizeYes)
                    .addComponent(RothIRAMaximizeNO))
                .addGap(21, 21, 21)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(RothIRACalculatorExpectedReturnRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel82)
                    .addComponent(RothIRACurrentAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel83)
                    .addComponent(RothIRaRetirementAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel84)
                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RothIRACalculateBTN)
                    .addComponent(RothIRAclearBTN))
                .addContainerGap())
        );

        jPanel48.setBackground(new java.awt.Color(204, 255, 204));

        RothIRAoutput.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RothIRAoutput, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel48Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(RothIRAoutput, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        InstructionsRothIRACalculator.setBackground(new java.awt.Color(255, 215, 255));
        jScrollPane6.setViewportView(InstructionsRothIRACalculator);

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(87, 87, 87)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6)
                    .addGroup(jPanel46Layout.createSequentialGroup()
                        .addComponent(jPanel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout RothIRACalculatorLayout = new javax.swing.GroupLayout(RothIRACalculator);
        RothIRACalculator.setLayout(RothIRACalculatorLayout);
        RothIRACalculatorLayout.setHorizontalGroup(
            RothIRACalculatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RothIRACalculatorLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jPanel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        RothIRACalculatorLayout.setVerticalGroup(
            RothIRACalculatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RothIRACalculatorLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jPanel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        panelCalculator.addTab("Roth IRA Calculator", RothIRACalculator);

        downpaymentCalculator.setBackground(new java.awt.Color(255, 237, 255));

        jPanel59.setBackground(new java.awt.Color(255, 237, 255));

        jPanel60.setBackground(new java.awt.Color(204, 255, 204));
        jPanel60.setEnabled(false);

        jLabel128.setText("Output here");

        javax.swing.GroupLayout jPanel60Layout = new javax.swing.GroupLayout(jPanel60);
        jPanel60.setLayout(jPanel60Layout);
        jPanel60Layout.setHorizontalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel60Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(jLabel128, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel60Layout.setVerticalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel60Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel128, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel61.setBackground(new java.awt.Color(204, 255, 204));

        jLabel132.setText("Loan Term");

        jLabel133.setText("Upfront Cahs Available ");

        jButton21.setText("Calculate");

        jButton22.setText("Clear");

        jLabel134.setText("Down Payemtn");

        jLabel138.setText("Interest Rate");

        jCheckBox3.setText("Include Closing Cost");

        jComboBox20.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "%", "$" }));

        javax.swing.GroupLayout jPanel61Layout = new javax.swing.GroupLayout(jPanel61);
        jPanel61.setLayout(jPanel61Layout);
        jPanel61Layout.setHorizontalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel61Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel61Layout.createSequentialGroup()
                        .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel132, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel138, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel134, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel133, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField95)
                            .addComponent(jTextField99, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField45, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(jTextField46, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel61Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel61Layout.createSequentialGroup()
                        .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField94, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox20, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel61Layout.setVerticalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel61Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel133, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField45))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel134, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField46))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox3)
                    .addComponent(jTextField94)
                    .addComponent(jComboBox20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel138)
                    .addComponent(jTextField99))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel132)
                    .addComponent(jTextField95))
                .addGap(40, 40, 40)
                .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        InstructionsDownPaymentCalculator.setBackground(new java.awt.Color(255, 215, 255));
        jScrollPane12.setViewportView(InstructionsDownPaymentCalculator);

        javax.swing.GroupLayout jPanel59Layout = new javax.swing.GroupLayout(jPanel59);
        jPanel59.setLayout(jPanel59Layout);
        jPanel59Layout.setHorizontalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel59Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel59Layout.setVerticalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel59Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane12)
                    .addGroup(jPanel59Layout.createSequentialGroup()
                        .addComponent(jPanel61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout downpaymentCalculatorLayout = new javax.swing.GroupLayout(downpaymentCalculator);
        downpaymentCalculator.setLayout(downpaymentCalculatorLayout);
        downpaymentCalculatorLayout.setHorizontalGroup(
            downpaymentCalculatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, downpaymentCalculatorLayout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jPanel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        downpaymentCalculatorLayout.setVerticalGroup(
            downpaymentCalculatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, downpaymentCalculatorLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jPanel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        panelCalculator.addTab("Down Payment Calculator", downpaymentCalculator);

        MortgagePayoffCalculator.setBackground(new java.awt.Color(255, 237, 255));

        jPanel56.setBackground(new java.awt.Color(255, 237, 255));

        jPanel57.setBackground(new java.awt.Color(204, 255, 204));

        jLabel49.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel49.setText("Original Loan Amount ");

        jButton19.setText("Calculate");

        jButton20.setText("Clear");

        jLabel118.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel118.setText("Original Loan Term");

        jRadioButton3.setText("Payback Altogether");

        jRadioButton4.setText("Repayment With Extra Payments");

        jLabel120.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel120.setText("per month");

        jLabel121.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel121.setText("Repayment Options ");

        jLabel125.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel125.setText("Interest Rate");

        jLabel126.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel126.setText("Remaining Term");

        jLabel127.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel127.setText("per year");

        jLabel129.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel129.setText("one time");

        jRadioButton5.setText("Biweekly repayment");

        jRadioButton6.setText("Normal Payment");

        javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
        jPanel57.setLayout(jPanel57Layout);
        jPanel57Layout.setHorizontalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel57Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel120)
                        .addGap(102, 102, 102))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel57Layout.createSequentialGroup()
                        .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel118, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel125, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel126, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField61, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField28, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField27)
                            .addComponent(jTextField34))
                        .addGap(49, 49, 49))
                    .addGroup(jPanel57Layout.createSequentialGroup()
                        .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel57Layout.createSequentialGroup()
                                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel121)
                                    .addGroup(jPanel57Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jRadioButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel57Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField59, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField60, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel127)
                            .addComponent(jLabel129))
                        .addGap(113, 113, 113))
                    .addGroup(jPanel57Layout.createSequentialGroup()
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel57Layout.setVerticalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel118)
                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel125)
                    .addComponent(jTextField61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel126))
                .addGap(18, 18, 18)
                .addComponent(jLabel121)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton3)
                .addGap(3, 3, 3)
                .addComponent(jRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel120))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel127))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel129)
                    .addComponent(jTextField60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton19)
                    .addComponent(jButton20))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel58.setBackground(new java.awt.Color(204, 255, 204));

        jLabel124.setText("Display Output");

        javax.swing.GroupLayout jPanel58Layout = new javax.swing.GroupLayout(jPanel58);
        jPanel58.setLayout(jPanel58Layout);
        jPanel58Layout.setHorizontalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel124, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel58Layout.setVerticalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel124, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        InstructionsMortgagePayoffCalculator.setBackground(new java.awt.Color(255, 215, 255));
        jScrollPane7.setViewportView(InstructionsMortgagePayoffCalculator);

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel57, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel56Layout.createSequentialGroup()
                        .addComponent(jPanel57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MortgagePayoffCalculatorLayout = new javax.swing.GroupLayout(MortgagePayoffCalculator);
        MortgagePayoffCalculator.setLayout(MortgagePayoffCalculatorLayout);
        MortgagePayoffCalculatorLayout.setHorizontalGroup(
            MortgagePayoffCalculatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MortgagePayoffCalculatorLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jPanel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        MortgagePayoffCalculatorLayout.setVerticalGroup(
            MortgagePayoffCalculatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MortgagePayoffCalculatorLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jPanel56, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        panelCalculator.addTab("Mortgage Payoff Calculator", MortgagePayoffCalculator);

        MathCalculator.setBackground(new java.awt.Color(255, 237, 255));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pinkPanterUnderConstruction.gif"))); // NOI18N

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel39.setText("Under Construction");

        javax.swing.GroupLayout MathCalculatorLayout = new javax.swing.GroupLayout(MathCalculator);
        MathCalculator.setLayout(MathCalculatorLayout);
        MathCalculatorLayout.setHorizontalGroup(
            MathCalculatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MathCalculatorLayout.createSequentialGroup()
                .addContainerGap(390, Short.MAX_VALUE)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(296, Short.MAX_VALUE))
        );
        MathCalculatorLayout.setVerticalGroup(
            MathCalculatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MathCalculatorLayout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .addGroup(MathCalculatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38))
                .addContainerGap(120, Short.MAX_VALUE))
        );

        panelCalculator.addTab("Math Calculator", MathCalculator);

        FitnessAndHealthCalculator.setBackground(new java.awt.Color(255, 237, 255));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pinkPanterUnderConstruction.gif"))); // NOI18N

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel37.setText("Under Construction");

        javax.swing.GroupLayout FitnessAndHealthCalculatorLayout = new javax.swing.GroupLayout(FitnessAndHealthCalculator);
        FitnessAndHealthCalculator.setLayout(FitnessAndHealthCalculatorLayout);
        FitnessAndHealthCalculatorLayout.setHorizontalGroup(
            FitnessAndHealthCalculatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FitnessAndHealthCalculatorLayout.createSequentialGroup()
                .addContainerGap(381, Short.MAX_VALUE)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(293, Short.MAX_VALUE))
        );
        FitnessAndHealthCalculatorLayout.setVerticalGroup(
            FitnessAndHealthCalculatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FitnessAndHealthCalculatorLayout.createSequentialGroup()
                .addContainerGap(134, Short.MAX_VALUE)
                .addGroup(FitnessAndHealthCalculatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addContainerGap(145, Short.MAX_VALUE))
        );

        panelCalculator.addTab("Fitness & Health Calculator", FitnessAndHealthCalculator);

        OtherCalculator.setBackground(new java.awt.Color(255, 237, 255));

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel46.setText("Under Construction");

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pinkPanterUnderConstruction.gif"))); // NOI18N

        javax.swing.GroupLayout OtherCalculatorLayout = new javax.swing.GroupLayout(OtherCalculator);
        OtherCalculator.setLayout(OtherCalculatorLayout);
        OtherCalculatorLayout.setHorizontalGroup(
            OtherCalculatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OtherCalculatorLayout.createSequentialGroup()
                .addContainerGap(357, Short.MAX_VALUE)
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(329, Short.MAX_VALUE))
        );
        OtherCalculatorLayout.setVerticalGroup(
            OtherCalculatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OtherCalculatorLayout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addGroup(OtherCalculatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(143, Short.MAX_VALUE))
        );

        panelCalculator.addTab("Other Calculators", OtherCalculator);

        Currency.setBackground(new java.awt.Color(255, 237, 255));

        jPanel29.setBackground(new java.awt.Color(255, 237, 255));

        jPanel30.setBackground(new java.awt.Color(204, 255, 204));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "get value from a dictionary" }));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "get value from a dictionary" }));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Amount");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("From");

        jLabel10.setText("To");

        jButton1.setText("Calculate");

        jButton2.setText("Clear");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField2)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(2, 2, 2)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel10)
                .addGap(2, 2, 2)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel31.setBackground(new java.awt.Color(204, 255, 204));

        jLabel11.setText("Display Output");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        instructionCurrencyCalculator.setBackground(new java.awt.Color(255, 215, 255));
        jScrollPane2.setViewportView(instructionCurrencyCalculator);

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(87, 87, 87)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout CurrencyLayout = new javax.swing.GroupLayout(Currency);
        Currency.setLayout(CurrencyLayout);
        CurrencyLayout.setHorizontalGroup(
            CurrencyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CurrencyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CurrencyLayout.setVerticalGroup(
            CurrencyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CurrencyLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelCalculator.addTab("Currency Calculator", Currency);

        AutoLoan.setBackground(new java.awt.Color(255, 237, 255));

        jPanel62.setBackground(new java.awt.Color(255, 237, 255));

        jPanel64.setBackground(new java.awt.Color(204, 255, 204));

        jLabel141.setText("Interest Rate");

        jLabel142.setText("Cash Incentives");

        jLabel143.setText("Trade-in value");

        jLabel144.setText("Auto Price ");

        jButton23.setText("Calculate");

        jButton24.setText("Clear");

        jLabel145.setText("Loan Term");

        jLabel146.setText("Amount Owed on Trade-in");

        jLabel147.setText("Your State");

        jLabel148.setText("Sales Tax");

        jLabel149.setText("Down Payment ");

        jComboBox28.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming" }));

        jLabel150.setText("Title, Registration and Other Fees");

        jCheckBox4.setText("Include All Fees in Loan");

        javax.swing.GroupLayout jPanel64Layout = new javax.swing.GroupLayout(jPanel64);
        jPanel64.setLayout(jPanel64Layout);
        jPanel64Layout.setHorizontalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel64Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jCheckBox4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel145, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel141, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel146, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel147, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel148, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel150, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(jLabel142, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel144, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel149, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel143, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField104)
                    .addComponent(jTextField48)
                    .addComponent(jTextField47)
                    .addComponent(jTextField103)
                    .addComponent(jTextField101)
                    .addComponent(jTextField106)
                    .addComponent(jTextField105)
                    .addComponent(jTextField102)
                    .addComponent(jComboBox28, 0, 167, Short.MAX_VALUE)
                    .addComponent(jTextField107))
                .addGap(0, 65, Short.MAX_VALUE))
        );
        jPanel64Layout.setVerticalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel64Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel144, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField47))
                .addGap(3, 3, 3)
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel145, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField48))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel141)
                    .addComponent(jTextField103))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel142)
                    .addComponent(jTextField101))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel149)
                    .addComponent(jTextField106))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField102)
                    .addComponent(jLabel143))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel146)
                    .addComponent(jTextField105))
                .addGap(9, 9, 9)
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel147)
                    .addComponent(jComboBox28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel148)
                    .addComponent(jTextField104))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel150)
                    .addComponent(jTextField107))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox4)
                .addGap(18, 18, 18)
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        InstructionsAutoLoanCalculator.setBackground(new java.awt.Color(255, 215, 255));
        jScrollPane1.setViewportView(InstructionsAutoLoanCalculator);

        javax.swing.GroupLayout jPanel62Layout = new javax.swing.GroupLayout(jPanel62);
        jPanel62.setLayout(jPanel62Layout);
        jPanel62Layout.setHorizontalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel62Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel62Layout.setVerticalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel62Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Total Price", jPanel62);

        jPanel68.setBackground(new java.awt.Color(255, 237, 255));

        jPanel69.setBackground(new java.awt.Color(204, 255, 204));

        jLabel162.setText("Interest Rate");

        jLabel163.setText("Cash Incentives");

        jLabel164.setText("Trade-in value");

        jLabel165.setText("Monthly Pay");

        jButton27.setText("Calculate");

        jButton28.setText("Clear");

        jLabel166.setText("Loan Term");

        jLabel167.setText("Amount Owed on Trade-in");

        jLabel168.setText("Your State");

        jLabel169.setText("Sales Tax");

        jLabel170.setText("Down Payment ");

        jTextField120.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField120ActionPerformed(evt);
            }
        });

        jComboBox29.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming" }));

        jLabel171.setText("Title, Registration and Other Fees");

        jCheckBox6.setText("Include All Fees in Loan");

        javax.swing.GroupLayout jPanel69Layout = new javax.swing.GroupLayout(jPanel69);
        jPanel69.setLayout(jPanel69Layout);
        jPanel69Layout.setHorizontalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel69Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel69Layout.createSequentialGroup()
                        .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel166, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel162, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel167, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel168, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel169, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel171, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                    .addComponent(jLabel165, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel164, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel163, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel170, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField118)
                            .addComponent(jTextField86)
                            .addComponent(jTextField62)
                            .addComponent(jTextField117)
                            .addComponent(jTextField115)
                            .addComponent(jTextField120)
                            .addComponent(jTextField119)
                            .addComponent(jTextField116)
                            .addComponent(jComboBox29, 0, 167, Short.MAX_VALUE)
                            .addComponent(jTextField121)))
                    .addComponent(jCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 65, Short.MAX_VALUE))
        );
        jPanel69Layout.setVerticalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel69Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel165, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField62))
                .addGap(3, 3, 3)
                .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel166, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField86))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel162)
                    .addComponent(jTextField117))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel163)
                    .addComponent(jTextField115))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel170)
                    .addComponent(jTextField120, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField116)
                    .addComponent(jLabel164))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel167)
                    .addComponent(jTextField119))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel168)
                    .addComponent(jComboBox29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel169)
                    .addComponent(jTextField118))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel171)
                    .addComponent(jTextField121))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(InstructionsAutoLoan2Calculator);

        javax.swing.GroupLayout jPanel68Layout = new javax.swing.GroupLayout(jPanel68);
        jPanel68.setLayout(jPanel68Layout);
        jPanel68Layout.setHorizontalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel68Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel68Layout.setVerticalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel68Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                    .addComponent(jPanel69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Monthly Payment", jPanel68);

        jPanel63.setBackground(new java.awt.Color(204, 255, 204));
        jPanel63.setEnabled(false);

        jLabel140.setText("Output here");

        javax.swing.GroupLayout jPanel63Layout = new javax.swing.GroupLayout(jPanel63);
        jPanel63.setLayout(jPanel63Layout);
        jPanel63Layout.setHorizontalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel63Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel140, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel63Layout.setVerticalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel63Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel140, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout AutoLoanLayout = new javax.swing.GroupLayout(AutoLoan);
        AutoLoan.setLayout(AutoLoanLayout);
        AutoLoanLayout.setHorizontalGroup(
            AutoLoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AutoLoanLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(AutoLoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AutoLoanLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        AutoLoanLayout.setVerticalGroup(
            AutoLoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AutoLoanLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        panelCalculator.addTab("Auto Loan Calculator", AutoLoan);

        InterestRate.setBackground(new java.awt.Color(255, 237, 255));

        jPanel32.setBackground(new java.awt.Color(255, 237, 255));

        jPanel33.setBackground(new java.awt.Color(204, 255, 204));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel31.setText("Initial Investment         $");

        InterestRateInitialInvestment.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        InterestRateInitialInvestment.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        InterestRateInitialInvestment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                InterestRateInitialInvestmentKeyReleased(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel32.setText("Annual Contribution    $");

        InterestRateCalculatorCalculateBTN.setText("Calculate ");
        InterestRateCalculatorCalculateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InterestRateCalculatorCalculateBTNActionPerformed(evt);
            }
        });

        InterestRateCalculatorClearBTN.setText("Clear");
        InterestRateCalculatorClearBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InterestRateCalculatorClearBTNActionPerformed(evt);
            }
        });

        InterestRateAnnualContribution.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        InterestRateAnnualContribution.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        InterestRateAnnualContribution.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                InterestRateAnnualContributionKeyReleased(evt);
            }
        });

        jLabel116.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel116.setText("Monthly Contribution  $");

        InterestRateMonthlyContribution.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        InterestRateMonthlyContribution.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        InterestRateMonthlyContribution.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                InterestRateMonthlyContributionKeyReleased(evt);
            }
        });

        InterestRateBeggnning.setText("Contribute at the beggining of each compound period");
        InterestRateBeggnning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InterestRateBeggnningActionPerformed(evt);
            }
        });

        InterestRateEnd.setText("Contribute at the end of each compound period");
        InterestRateEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InterestRateEndActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel35.setText("Interest Rate                  %");

        jLabel50.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel50.setText("Compound");

        InterestRateCompoundPeriods.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Annually", "Semiannually", "Quarterly", "Monthly", "Semimonthly", "Biweekly", "Weekly", "Daily", "Continuously" }));

        jLabel117.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel117.setText("Investment Length");

        InterestRateInterest.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        InterestRateInterest.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        InterestRateInterest.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                InterestRateInterestKeyReleased(evt);
            }
        });

        InterestRateInvestmentLengthYears.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        InterestRateInvestmentLengthYears.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        InterestRateInvestmentLengthYears.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                InterestRateInvestmentLengthYearsKeyReleased(evt);
            }
        });

        jLabel119.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel119.setText("Years");

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addComponent(InterestRateCalculatorCalculateBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InterestRateCalculatorClearBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InterestRateEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel33Layout.createSequentialGroup()
                                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel116, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(InterestRateAnnualContribution)
                                    .addComponent(InterestRateInitialInvestment)
                                    .addComponent(InterestRateMonthlyContribution, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)))
                            .addComponent(InterestRateBeggnning, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel33Layout.createSequentialGroup()
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InterestRateCompoundPeriods, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel33Layout.createSequentialGroup()
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InterestRateInterest))
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addComponent(jLabel117, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InterestRateInvestmentLengthYears, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel119, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)))
                .addGap(17, 17, 17))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(InterestRateInitialInvestment, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InterestRateAnnualContribution, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel116, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(InterestRateMonthlyContribution, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InterestRateBeggnning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InterestRateEnd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InterestRateInterest, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InterestRateCompoundPeriods, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel117, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InterestRateInvestmentLengthYears, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel119))
                .addGap(24, 24, 24)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InterestRateCalculatorCalculateBTN)
                    .addComponent(InterestRateCalculatorClearBTN))
                .addContainerGap())
        );

        jPanel34.setBackground(new java.awt.Color(204, 255, 204));

        InterestRateOutput.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addComponent(InterestRateOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(InterestRateOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        InstructionsRateCalculator.setBackground(new java.awt.Color(255, 215, 255));
        jScrollPane4.setViewportView(InstructionsRateCalculator);

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );

        javax.swing.GroupLayout InterestRateLayout = new javax.swing.GroupLayout(InterestRate);
        InterestRate.setLayout(InterestRateLayout);
        InterestRateLayout.setHorizontalGroup(
            InterestRateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InterestRateLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        InterestRateLayout.setVerticalGroup(
            InterestRateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InterestRateLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        panelCalculator.addTab("Interest Rate Calculator", InterestRate);

        jPanel19.setBackground(new java.awt.Color(255, 237, 255));

        jPanel4.setBackground(new java.awt.Color(255, 237, 255));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Meet Our Team Pink ");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Welcome Fellas, We are Excited to See You Again!");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(2, 2, 2)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(61, Short.MAX_VALUE)))
        );

        jPanel5.setBackground(new java.awt.Color(255, 237, 255));

        jLabel19.setText("Osvaldo Ramirez");

        jLabel20.setText("Pedro Antonio");

        jLabel21.setText("Jorge Tomas");

        jLabel23.setText("Azusena Fernandez");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(azusena, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jorge, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pedro, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(osvaldo, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(azusena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(osvaldo, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(pedro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jorge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19)
                        .addComponent(jLabel20)
                        .addComponent(jLabel21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addContainerGap())))
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Explore Our Calculators");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(64, 64, 64))
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel6))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(164, 164, 164))
        );

        panelCalculator.addTab("+", jPanel19);

        quitBnt.setText("Quit");
        quitBnt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quitBntMouseClicked(evt);
            }
        });
        jMenuBar1.add(quitBnt);

        jMenu2.setText("About");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCalculator))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCalculator)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)))
        );

        panelCalculator.getAccessibleContext().setAccessibleName("Rent vs Buy Calculator");

        pack();
    }// </editor-fold>//GEN-END:initComponents
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    private void btnmathCalculatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmathCalculatorActionPerformed
        // TODO add your handling code here:
        removeAllTabs();
         restoreTab("Math Calculator");//needs to be change according to the name of the tab   
    }//GEN-LAST:event_btnmathCalculatorActionPerformed

    private void btnfitnessCalculatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfitnessCalculatorActionPerformed
        // TODO add your handling code here:
        removeAllTabs();
       
       restoreTab("Fitness & Health Calculator");
    }//GEN-LAST:event_btnfitnessCalculatorActionPerformed

    private void btnOtherCalculatorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtherCalculatorsActionPerformed
        // TODO add your handling code here:
        removeAllTabs();
        restoreTab("Other Calculators");

    }//GEN-LAST:event_btnOtherCalculatorsActionPerformed

    private void dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardActionPerformed
        // TODO add your handling code here:
        removeAllTabs();
        restoreTab("+");
   
    }//GEN-LAST:event_dashboardActionPerformed

    private void btnfinancialCalculatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfinancialCalculatorActionPerformed
        // TODO add your handling code here:
 
        if (FCcontrolBtn.isVisible()) {
           // If it is visible, set it to invisible
           FCcontrolBtn.setVisible(false);
       } else {
           // If it is invisible, set it to visible
           FCcontrolBtn.setVisible(true);
       }
         
        
    }//GEN-LAST:event_btnfinancialCalculatorActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void MortgageandRealEstateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MortgageandRealEstateBTNActionPerformed
        // TODO add your handling code here:
        removeAllTabs();
        restoreTab("Mortgage Payoff Calculator");
        restoreTab("Mortgage Calculator");
        restoreTab("House Affordability Calculator");
        restoreTab("Rent Calculator");
        restoreTab("Refinance Calculator");
        restoreTab("Down Payment Calculator");
        restoreTab("Rent vs Buy Calculator");
    }//GEN-LAST:event_MortgageandRealEstateBTNActionPerformed

    private void OtherCalculatorsBTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OtherCalculatorsBTN1ActionPerformed
        // TODO add your handling code here:
            removeAllTabs();
            restoreTab("Currency Calculator");//needs to be change according to the name of the tab

    }//GEN-LAST:event_OtherCalculatorsBTN1ActionPerformed

    private void RetirementCalculatorBTN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetirementCalculatorBTN2ActionPerformed
        // TODO add your handling code here:
        removeAllTabs();
        restoreTab("Retirement Calculator");
        restoreTab("Roth IRA Calculator");

    }//GEN-LAST:event_RetirementCalculatorBTN2ActionPerformed

    private void InvestmentCalculatorBTN3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InvestmentCalculatorBTN3ActionPerformed
        // TODO add your handling code here:
        removeAllTabs();
        restoreTab("Interest Rate Calculator");
    }//GEN-LAST:event_InvestmentCalculatorBTN3ActionPerformed

    private void autoCalculatorBTN4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoCalculatorBTN4ActionPerformed
        // TODO add your handling code here:
        removeAllTabs();
        restoreTab("Auto Loan Calculator");
    }//GEN-LAST:event_autoCalculatorBTN4ActionPerformed

    private void quitBntMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitBntMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_quitBntMouseClicked

    private void jTextField120ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField120ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField120ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        showAboutPopup();
    }//GEN-LAST:event_jMenu2MouseClicked

    private void InterestRateCalculatorClearBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InterestRateCalculatorClearBTNActionPerformed
        // TODO add your handling code here:
        InterestRateInitialInvestment.setText("");
        InterestRateAnnualContribution.setText("");
        InterestRateMonthlyContribution.setText("");
        InterestRateBeggnning.setSelected(false);
        InterestRateEnd.setSelected(false);
        InterestRateInterest.setText("");
        InterestRateInvestmentLengthYears.setText("");
        
        
    }//GEN-LAST:event_InterestRateCalculatorClearBTNActionPerformed

    private void InterestRateBeggnningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InterestRateBeggnningActionPerformed
        // TODO add your handling code here:
       if (InterestRateBeggnning.isSelected()) {
        // If selected, uncheck InterestRateEnd
        InterestRateEnd.setSelected(false);
    }
    }//GEN-LAST:event_InterestRateBeggnningActionPerformed

    private void InterestRateEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InterestRateEndActionPerformed
        // TODO add your handling code here:
        if (InterestRateEnd.isSelected()) {
        // If selected, uncheck InterestRateEnd
        InterestRateBeggnning.setSelected(false);}
        
    }//GEN-LAST:event_InterestRateEndActionPerformed

    private void InterestRateInitialInvestmentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InterestRateInitialInvestmentKeyReleased
        // TODO add your handling code here:
         // Get the input from the text field
      String input = InterestRateInitialInvestment.getText();
      // Strip all spaces from the input as the user types
      String strippedInput = input.replaceAll("\\s", "");
      // Set the text field with the stripped input (without spaces)
      InterestRateInitialInvestment.setText(strippedInput);
      Helper.InterestRateCalculatorInputValidation(strippedInput);
    }//GEN-LAST:event_InterestRateInitialInvestmentKeyReleased

    private void InterestRateAnnualContributionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InterestRateAnnualContributionKeyReleased
        // TODO add your handling code here:
                 // Get the input from the text field
      String input = InterestRateAnnualContribution.getText();
      // Strip all spaces from the input as the user types
      String strippedInput = input.replaceAll("\\s", "");
      // Set the text field with the stripped input (without spaces)
      InterestRateAnnualContribution.setText(strippedInput);
      Helper.InterestRateCalculatorInputValidation(strippedInput);
    }//GEN-LAST:event_InterestRateAnnualContributionKeyReleased

    private void InterestRateMonthlyContributionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InterestRateMonthlyContributionKeyReleased
      // Get the input from the text field
      String input = InterestRateMonthlyContribution.getText();
      // Strip all spaces from the input as the user types
      String strippedInput = input.replaceAll("\\s", "");
      // Set the text field with the stripped input (without spaces)
      InterestRateMonthlyContribution.setText(strippedInput);
      Helper.InterestRateCalculatorInputValidation(strippedInput);
    }//GEN-LAST:event_InterestRateMonthlyContributionKeyReleased

    private void InterestRateInterestKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InterestRateInterestKeyReleased
          // Get the input from the text field
      String input = InterestRateInterest.getText();
      // Strip all spaces from the input as the user types
      String strippedInput = input.replaceAll("\\s", "");
      // Set the text field with the stripped input (without spaces)
      InterestRateInterest.setText(strippedInput);
      Helper.InterestRateCalculatorInputValidation(strippedInput);
    }//GEN-LAST:event_InterestRateInterestKeyReleased

    private void InterestRateInvestmentLengthYearsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InterestRateInvestmentLengthYearsKeyReleased
        // TODO add your handling code here:
        if (!Helper.isWholeNumber(InterestRateInvestmentLengthYears.getText().replaceAll("\\s", ""))){
            
            Helper.InterestRateCalculatorInputValidation(InterestRateInvestmentLengthYears.getText().replaceAll("\\s", ""));
        }
    }//GEN-LAST:event_InterestRateInvestmentLengthYearsKeyReleased

    private void InterestRateCalculatorCalculateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InterestRateCalculatorCalculateBTNActionPerformed
        try{
         // Retrieve the selected item from the InterestRateCompoundPeriods combo box
        String selectedOption = (String) InterestRateCompoundPeriods.getSelectedItem();
        
        Helper.InterestRateCalculatorInputValidation(InterestRateInitialInvestment.getText());
        Helper.InterestRateCalculatorInputValidation(InterestRateAnnualContribution.getText());
        Helper.InterestRateCalculatorInputValidation(InterestRateMonthlyContribution.getText());
        Helper.InterestRateCalculatorInputValidation(InterestRateInterest.getText());
        Helper.InterestRateCalculatorInputValidation(InterestRateInterest.getText());
        Helper.InterestRateCalculatorInputValidation(InterestRateInvestmentLengthYears.getText());
        

        double PI = Double.parseDouble(InterestRateInitialInvestment.getText());
        double Ca = Double.parseDouble(InterestRateAnnualContribution.getText());
        double Cm = Double.parseDouble(InterestRateMonthlyContribution.getText());
        double r = Double.parseDouble(InterestRateInterest.getText())/100;
        int a = 1;   
        int n = Helper.selectionPeriod(selectedOption);
        double t = Double.parseDouble(InterestRateInvestmentLengthYears.getText());
        
        
        
        
        
        double FV_year = 0;

        if (InterestRateBeggnning.isSelected()) {
            if ("Continuously".equals(selectedOption)){
                FV_year +=Helper.future_valueBeginning(PI, Ca, Cm, r, t);
            }else{
            FV_year += Helper.interestRateBegining(PI, Ca, Cm, r, a, n, t);}
        }

        // Check if InterestRateEnd is selected
        if (InterestRateEnd.isSelected()) {
             if ("Continuously".equals(selectedOption)){
                 FV_year +=Helper.future_valueEnd(PI, Ca, Cm, r, t);
             }
             else{
             // Calculate future value using nominal interest rate and contributions
                FV_year += Helper.interestrateEND(PI, Ca, Cm, r, a, n, t);}
        }
        
        InterestRateOutput.setText("Ending Balance " + String.format("%.2f", FV_year));

   
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Empty fields!");
        }
       
    }//GEN-LAST:event_InterestRateCalculatorCalculateBTNActionPerformed

    private void RothIRACalculatorCurrentBalanceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RothIRACalculatorCurrentBalanceKeyReleased
        // TODO add your handling code here:
       // Get the input from the text field
      String input = RothIRACalculatorCurrentBalance.getText();
      // Strip all spaces from the input as the user types
      String strippedInput = input.replaceAll("\\s", "");
      // Set the text field with the stripped input (without spaces)
      RothIRACalculatorCurrentBalance.setText(strippedInput);
      Helper.InterestRateCalculatorInputValidation(strippedInput);
    }//GEN-LAST:event_RothIRACalculatorCurrentBalanceKeyReleased

    private void RothIRAAnualContributionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RothIRAAnualContributionKeyReleased
        // TODO add your handling code here:
      // Get the input from the text field
      String input = RothIRAAnualContribution.getText();
      // Strip all spaces from the input as the user types
      String strippedInput = input.replaceAll("\\s", "");
      // Set the text field with the stripped input (without spaces)
      RothIRAAnualContribution.setText(strippedInput);
      Helper.InterestRateCalculatorInputValidation(strippedInput);
    }//GEN-LAST:event_RothIRAAnualContributionKeyReleased

    private void RothIRACalculatorExpectedReturnRateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RothIRACalculatorExpectedReturnRateKeyReleased
        // TODO add your handling code here:
          if (!Helper.isWholeNumber(RothIRACalculatorExpectedReturnRate.getText().replaceAll("\\s", ""))){
            
            Helper.InterestRateCalculatorInputValidation(RothIRACalculatorExpectedReturnRate.getText().replaceAll("\\s", ""));
        }
    }//GEN-LAST:event_RothIRACalculatorExpectedReturnRateKeyReleased

    private void RothIRACurrentAgeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RothIRACurrentAgeKeyReleased
        // TODO add your handling code here:
          if (!Helper.isWholeNumber(RothIRACurrentAge.getText().replaceAll("\\s", ""))){
            
            Helper.InterestRateCalculatorInputValidation(RothIRACurrentAge.getText().replaceAll("\\s", ""));
        }
    }//GEN-LAST:event_RothIRACurrentAgeKeyReleased

    private void RothIRaRetirementAgeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RothIRaRetirementAgeKeyReleased
        // TODO add your handling code here:
        if (!Helper.isWholeNumber(RothIRaRetirementAge.getText().replaceAll("\\s", ""))){
            
            Helper.InterestRateCalculatorInputValidation(RothIRaRetirementAge.getText().replaceAll("\\s", ""));}
    }//GEN-LAST:event_RothIRaRetirementAgeKeyReleased

    private void RothIRAMaximizeYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RothIRAMaximizeYesActionPerformed
        // TODO add your handling code here:
        if (RothIRAMaximizeYes.isSelected()) {
        // If selected, uncheck InterestRateEnd
       RothIRAMaximizeNO.setSelected(false);
        RothIRAAnualContribution.setText("0");
       RothIRAAnualContribution.setVisible(false);
       LabelAnnualContribution.setText("Annual Contributions Max Out");
        }    
    }//GEN-LAST:event_RothIRAMaximizeYesActionPerformed

    private void RothIRAMaximizeNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RothIRAMaximizeNOActionPerformed
        // TODO add your handling code here:
        if (RothIRAMaximizeNO.isSelected()) {
        // If selected, uncheck InterestRateEnd
        RothIRAMaximizeYes.setSelected(false);
         RothIRAAnualContribution.setText("");
        RothIRAAnualContribution.setVisible(true);
        LabelAnnualContribution.setText("Anual Contribution           $");
        }
    }//GEN-LAST:event_RothIRAMaximizeNOActionPerformed

    private void RothIRAclearBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RothIRAclearBTNActionPerformed
        // TODO add your handling code here:
       RothIRACalculatorCurrentBalance.setText("");
       RothIRAAnualContribution.setText("");
       RothIRACalculatorExpectedReturnRate.setText("");
       RothIRACurrentAge.setText("");
       RothIRaRetirementAge.setText("");
       RothIRAMaximizeYes.setSelected(false);
       RothIRAMaximizeNO.setSelected(false);
    }//GEN-LAST:event_RothIRAclearBTNActionPerformed

    private void RothIRACalculateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RothIRACalculateBTNActionPerformed
        // TODO add your handling code here:
        try{
        Helper.InterestRateCalculatorInputValidation(RothIRACalculatorCurrentBalance.getText());
        Helper.InterestRateCalculatorInputValidation(RothIRAAnualContribution.getText());
        Helper.InterestRateCalculatorInputValidation(RothIRACalculatorExpectedReturnRate.getText());
        Helper.InterestRateCalculatorInputValidation(RothIRACurrentAge.getText());
        Helper.InterestRateCalculatorInputValidation(RothIRaRetirementAge.getText());
        
        double PI = Double.parseDouble(RothIRACalculatorCurrentBalance.getText());
        double Ca = Double.parseDouble(RothIRAAnualContribution.getText());
        double r = Double.parseDouble(RothIRACalculatorExpectedReturnRate.getText())/100;
        int C_age = Integer.parseInt(RothIRACurrentAge.getText());
        int R_age = Integer.parseInt(RothIRaRetirementAge.getText());
        
        double balance = 0;
        
         if (RothIRAMaximizeNO.isSelected()) {
             int n = R_age - C_age;
             balance +=Helper.calculate_MaximizeContributionNo(PI, Ca, r, n);
             
            
        }

        // Check if InterestRateEnd is selected
        if (RothIRAMaximizeYes.isSelected()) {
           Ca = 7000;
           balance += Helper.calculate_MaximizeContributionYes(PI, Ca, r, C_age, R_age);
        }
       
  
        RothIRAoutput.setText("Ending Balance " + String.format("%.2f", balance));
     
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Empty fields!");
        }
    }//GEN-LAST:event_RothIRACalculateBTNActionPerformed
    
    
    
    
    //Text field 
     // Method to display the first message in jTextPane1

    // Method to display the second message in jTextPane1
    private void setMessage1() {
        String message2 = "<html>"
                + "<b>Amount Field:</b><br>"
                + "Start by entering the amount of money you want to convert in the 'Amount' box. For example, if you want to convert $100, just type '100' in the box.<br><br>"
                + "<b>From (Currency Selection):</b><br>"
                + "Next, click the dropdown menu labeled 'From.' This is where you select the currency you currently have. For example, if you are converting from U.S. dollars, select 'USD' from the list.<br><br>"
                + "<b>To (Currency Selection):</b><br>"
                + "After that, click the 'To' dropdown menu. This is where you choose the currency you want to convert to. For example, if you want to convert U.S. dollars to euros, select 'EUR' from the list.<br><br>"
                + "<b>Calculate Button:</b><br>"
                + "Once you’ve entered the amount and selected both currencies, click the 'Calculate' button. This will perform the conversion and show you the result.<br><br>"
                + "<b>Clear Button:</b><br>"
                + "If you want to start over or reset everything, click the 'Clear' button. This will remove the amount and reset the currency selections so you can begin a new conversion."
                + "</html>";
        
        instructionCurrencyCalculator.setContentType("text/html");
        instructionCurrencyCalculator.setText(message2);
    }
    
    private void setMessage2(){
            String autoLoanInstructions = "<html>"
        + "<b>Auto Price:</b><br>"
        + "Enter the total price of the car you want to buy.<br><br>"
        + "<b>Loan Term:</b><br>"
        + "Enter the number of months you will be financing the loan.<br><br>"
        + "<b>Interest Rate:</b><br>"
        + "Provide the interest rate for your loan (as a percentage).<br><br>"
        + "<b>Cash Incentives:</b><br>"
        + "If there are any manufacturer or dealer incentives, enter the amount here.<br><br>"
        + "<b>Down Payment:</b><br>"
        + "Enter the amount of money you will pay upfront for the car.<br><br>"
        + "<b>Trade-in Value:</b><br>"
        + "Enter the value of your current vehicle that you are trading in.<br><br>"
        + "<b>Amount Owed on Trade-in:</b><br>"
        + "If you still owe money on your current vehicle, enter that amount here.<br><br>"
        + "<b>Your State:</b><br>"
        + "Select the state where you are purchasing the vehicle. Sales tax will be calculated based on this.<br><br>"
        + "<b>Sales Tax:</b><br>"
        + "Enter the sales tax rate in your state (if not calculated automatically).<br><br>"
        + "<b>Title, Registration, and Other Fees:</b><br>"
        + "Enter the total cost of fees related to title, registration, and other charges.<br><br>"
        + "<b>Include All Fees in Loan:</b><br>"
        + "Check this box if you want to include all fees in your loan calculation.<br><br>"
        + "<b>Calculate Button:</b><br>"
        + "Once all fields are filled, click 'Calculate' to get your estimated monthly payment.<br><br>"
        + "<b>Clear Button:</b><br>"
        + "Click 'Clear' to reset all fields to their default values."
        + "</html>";
    InstructionsAutoLoanCalculator.setContentType("text/html");
    InstructionsAutoLoanCalculator.setText(autoLoanInstructions);
    }
    
    private void setMessage3(){
        String autoLoanInstructions2 = "<html>"
           + "<b>Monthly Pay:</b><br>"
           + "Enter the estimated or calculated monthly payment amount for the loan.<br><br>"
           + "<b>Loan Term:</b><br>"
           + "Enter the number of months you plan to finance the loan.<br><br>"
           + "<b>Interest Rate:</b><br>"
           + "Provide the interest rate for your loan as a percentage.<br><br>"
           + "<b>Cash Incentives:</b><br>"
           + "If there are any manufacturer or dealer incentives, enter the amount here.<br><br>"
           + "<b>Down Payment:</b><br>"
           + "Enter the amount of money you will pay upfront for the car.<br><br>"
           + "<b>Trade-in Value:</b><br>"
           + "Enter the value of your current vehicle that you are trading in.<br><br>"
           + "<b>Amount Owed on Trade-in:</b><br>"
           + "If you still owe money on your current vehicle, enter the amount here.<br><br>"
           + "<b>Your State:</b><br>"
           + "Select the state where you are purchasing the vehicle. Sales tax will be calculated based on this.<br><br>"
           + "<b>Sales Tax:</b><br>"
           + "Enter the sales tax rate for your state (if not automatically calculated).<br><br>"
           + "<b>Title, Registration, and Other Fees:</b><br>"
           + "Enter the total amount for fees related to title, registration, and other charges.<br><br>"
           + "<b>Include All Fees in Loan:</b><br>"
           + "Check this box if you want to include all fees in the total loan calculation.<br><br>"
           + "<b>Calculate Button:</b><br>"
           + "After completing the form, click 'Calculate' to get your estimated loan payments.<br><br>"
           + "<b>Clear Button:</b><br>"
           + "Click 'Clear' to reset all the fields and start a new calculation."
           + "</html>";
        InstructionsAutoLoan2Calculator.setContentType("text/html");
        InstructionsAutoLoan2Calculator.setText(autoLoanInstructions2);
     }
     
private void setMessage4() {
    String rateCalculatorInstructions = "<html>"
        + "<b>Initial Investment:</b><br>"
        + "Enter the amount of the initial investment you plan to contribute.<br><br>"
        + "<b>Annual Contribution:</b><br>"
        + "Enter the total amount you plan to contribute each year.<br><br>"
        + "<b>Monthly Contribution:</b><br>"
        + "Enter the total amount you plan to contribute each month.<br><br>"
        + "<b>Contribute at the beginning/end of each period:</b><br>"
        + "Select whether you will contribute at the beginning or end of each compound period.<br><br>"
        + "<b>Interest Rate:</b><br>"
        + "Enter the annual interest rate (in percentage) for your investment.<br><br>"
        + "<b>Compound:</b><br>"
        + "Select how frequently the interest is compounded (e.g., Annually, Monthly, etc.).<br><br>"
        + "<b>Investment Length:</b><br>"
        + "Enter the length of the investment in years and months.<br><br>"
        + "<b>Calculate Button:</b><br>"
        + "Once you’ve entered all the information, click the 'Calculate' button to compute the future value of your investment.<br><br>"
        + "<b>Clear Button:</b><br>"
        + "Click 'Clear' to reset all the fields and start a new calculation."
        + "</html>";

    InstructionsRateCalculator.setContentType("text/html");
    InstructionsRateCalculator.setText(rateCalculatorInstructions);
}

      
    private void setMessage5(){
      String retirementCalculatorInstructions = "<html>"
        + "<b>Your Current Age:</b><br>"
        + "Enter your current age.<br><br>"
        + "<b>Your Planned Retirement Age:</b><br>"
        + "Enter the age at which you plan to retire.<br><br>"
        + "<b>Your Life Expectancy:</b><br>"
        + "Estimate how long you expect to live post-retirement.<br><br>"
        + "<b>Your Current Pre-tax Income:</b><br>"
        + "Enter your current yearly income before taxes.<br><br>"
        + "<b>Assumptions:</b><br>"
        + "<b>Your Current Income Increase:</b><br>"
        + "Enter the rate at which you expect your income to grow annually (as a percentage).<br><br>"
        + "<b>Income Needed After Retirement:</b><br>"
        + "Enter the percentage of your current income that you expect to need after retirement.<br><br>"
        + "<b>Average Investment Return:</b><br>"
        + "Enter the average annual return you expect from your investments (as a percentage).<br><br>"
        + "<b>Inflation Rate:</b><br>"
        + "Enter the expected annual inflation rate (as a percentage).<br><br>"
        + "<b>Optional:</b><br>"
        + "<b>Other Income After Retirement:</b><br>"
        + "Enter any additional income you expect to receive after retirement, such as pensions or social security.<br><br>"
        + "<b>Your Current Retirement Savings:</b><br>"
        + "Enter the amount you currently have saved for retirement.<br><br>"
        + "<b>Future Retirement Savings:</b><br>"
        + "Enter the percentage of your income you plan to save each year going forward.<br><br>"
        + "<b>Calculate Button:</b><br>"
        + "After entering all relevant information, click 'Calculate' to estimate your retirement savings and needs.<br><br>"
        + "<b>Clear Button:</b><br>"
        + "Click 'Clear' to reset all fields and start a new calculation."
        + "</html>";
      InstructionsRetirementCalculator.setContentType("text/html");
      InstructionsRetirementCalculator.setText(retirementCalculatorInstructions);

    }

    private void setMessage6(){
      String rothIRACalculatorInstructions = "<html>"
          + "<b>Current Balance:</b><br>"
          + "Enter the current balance of your Roth IRA account.<br><br>"
          + "<b>Annual Contribution:</b><br>"
          + "Enter the amount you contribute to your Roth IRA each year.<br><br>"
          + "<b>Maximize Contribution?</b><br>"
          + "Select 'Yes' if you plan to maximize your contributions according to IRS limits, or 'No' if you do not.<br><br>"
          + "<b>Expected Rate of Return:</b><br>"
          + "Enter the expected annual rate of return on your Roth IRA investments (as a percentage).<br><br>"
          + "<b>Current Age:</b><br>"
          + "Enter your current age.<br><br>"
          + "<b>Retirement Age:</b><br>"
          + "Enter the age at which you plan to retire.<br><br>"
          + "<b>Marginal Tax Rate:</b><br>"
          + "Enter your marginal tax rate, which is the tax rate that applies to your last dollar of income (as a percentage).<br><br>"
          + "<b>Calculate Button:</b><br>"
          + "Once you’ve filled out all fields, click 'Calculate' to estimate your Roth IRA growth and future balance.<br><br>"
          + "<b>Clear Button:</b><br>"
          + "Click 'Clear' to reset the fields and start a new calculation."
          + "</html>";
      InstructionsRothIRACalculator.setContentType("text/html");
      InstructionsRothIRACalculator.setText(rothIRACalculatorInstructions);

    }

    private void setMessage7(){
      String mortgagePayoffCalculatorInstructions = "<html>"
          + "<b>Original Loan Amount:</b><br>"
          + "Enter the original amount of the mortgage loan when it was first taken out.<br><br>"
          + "<b>Original Loan Term:</b><br>"
          + "Enter the original duration of the loan in months or years (e.g., 30 years).<br><br>"
          + "<b>Interest Rate:</b><br>"
          + "Enter the annual interest rate for the mortgage (as a percentage).<br><br>"
          + "<b>Remaining Term:</b><br>"
          + "Enter the number of months or years remaining on your mortgage.<br><br>"
          + "<b>Repayment Options:</b><br>"
          + "Select one of the repayment options:<br>"
          + "- <b>Payback Altogether:</b> Choose this option if you plan to repay the loan in full at once.<br>"
          + "- <b>Repayment With Extra Payments:</b> Select this option if you plan to make extra payments toward the loan.<br><br>"
          + "<b>Extra Payments:</b><br>"
          + "If you selected 'Repayment With Extra Payments', enter the extra amount you plan to pay:<br>"
          + "- Monthly: Enter the extra amount you plan to pay each month.<br>"
          + "- Yearly: Enter the extra amount you plan to pay each year.<br>"
          + "- One-time: Enter any one-time payment you plan to make.<br><br>"
          + "<b>Payment Frequency:</b><br>"
          + "Select the payment schedule for your loan repayment:<br>"
          + "- <b>Biweekly Repayment:</b> Choose this option if you plan to make biweekly payments.<br>"
          + "- <b>Normal Payment:</b> Choose this option if you plan to make regular monthly payments.<br><br>"
          + "<b>Calculate Button:</b><br>"
          + "After entering all the required information, click 'Calculate' to estimate how your extra payments will affect the payoff time of your mortgage.<br><br>"
          + "<b>Clear Button:</b><br>"
          + "Click 'Clear' to reset the fields and start a new calculation."
          + "</html>";
      InstructionsMortgagePayoffCalculator.setContentType("text/html");
      InstructionsMortgagePayoffCalculator.setText(mortgagePayoffCalculatorInstructions);


    }

    private void setMessage8(){
      String mortgageCalculatorInstructions = "<html>"
          + "<b>Home Price:</b><br>"
          + "Enter the total purchase price of the home you want to buy.<br><br>"
          + "<b>Down Payment:</b><br>"
          + "Enter the amount you plan to pay upfront as a down payment. You can enter a specific amount or a percentage of the home price.<br><br>"
          + "<b>Loan Term:</b><br>"
          + "Enter the number of years over which you plan to repay the loan.<br><br>"
          + "<b>Interest Rate:</b><br>"
          + "Enter the annual interest rate for the mortgage (as a percentage).<br><br>"
          + "<b>Start Date:</b><br>"
          + "Select the start date of the loan. You can choose the month and enter the year.<br><br>"
          + "<b>Include Taxes & Costs Below:</b><br>"
          + "Check this box if you want to include additional costs such as taxes, insurance, and other fees in the calculation.<br><br>"
          + "<b>Property Taxes Increase:</b><br>"
          + "Enter the percentage by which property taxes are expected to increase annually.<br><br>"
          + "<b>Home Insurance:</b><br>"
          + "Enter the expected cost of home insurance as a percentage of the home price.<br><br>"
          + "<b>PMI Insurance:</b><br>"
          + "Enter the percentage for private mortgage insurance (PMI) if applicable. This typically applies when your down payment is less than 20%.<br><br>"
          + "<b>HOA Fee:</b><br>"
          + "Enter the expected amount for homeowners' association (HOA) fees as a percentage of the home price.<br><br>"
          + "<b>Other Costs:</b><br>"
          + "Enter any other additional costs, such as maintenance or repairs, as a percentage.<br><br>"
          + "<b>Calculate Button:</b><br>"
          + "After entering all relevant information, click 'Calculate' to determine your estimated mortgage payments.<br><br>"
          + "<b>Clear Button:</b><br>"
          + "Click 'Clear' to reset the fields and start a new calculation."
          + "</html>";

      InstructionsMortgageCalculator.setContentType("text/html");
      InstructionsMortgageCalculator.setText(mortgageCalculatorInstructions);

     }

    private void setMessage9(){
         String houseAffordabilityCalculatorInstructions = "<html>"
              + "<b>Annual Household Income:</b><br>"
              + "Enter your total household income before taxes, including salary and other income sources.<br><br>"
              + "<b>Mortgage Loan Term:</b><br>"
              + "Enter the number of years over which you plan to repay the mortgage.<br><br>"
              + "<b>Interest Rate:</b><br>"
              + "Enter the annual interest rate for the mortgage (as a percentage).<br><br>"
              + "<b>Monthly Debt Payback:</b><br>"
              + "Enter the total amount you pay each month toward long-term debts, such as car loans, student loans, and credit cards.<br><br>"
              + "<b>Down Payment:</b><br>"
              + "Enter the amount of the down payment. You can select between entering a percentage or a specific dollar amount.<br><br>"
              + "<b>Property Tax:</b><br>"
              + "Enter the property tax as a percentage or a dollar amount per year.<br><br>"
              + "<b>HOA or Co-op Fee:</b><br>"
              + "Enter the homeowners' association (HOA) or co-op fee as a percentage or dollar amount per year.<br><br>"
              + "<b>Insurance:</b><br>"
              + "Enter the cost of insurance as a percentage or a dollar amount per year.<br><br>"
              + "<b>Debt-to-Income (DTI) Ratio:</b><br>"
              + "Select your desired DTI ratio. This is a comparison of your monthly debt payments to your monthly income, used by lenders to assess affordability.<br><br>"
              + "<b>Calculate Button:</b><br>"
              + "Once you've filled in all the necessary fields, click 'Calculate' to determine your house affordability based on your income and other financial factors.<br><br>"
              + "<b>Clear Button:</b><br>"
              + "Click 'Clear' to reset all fields and start a new calculation."
              + "</html>";
          InstructionsHouseAffordabilityCalculator.setContentType("text/html");
          InstructionsHouseAffordabilityCalculator.setText(houseAffordabilityCalculatorInstructions);



     }
    private void setMessage10(){
       String rentCalculatorInstructions = "<html>"
            + "<b>Your Pre-tax Income:</b><br>"
            + "Enter your total pre-tax income. You can select whether the amount is per year or per month from the dropdown menu.<br><br>"
            + "<b>Your Monthly Debt Payback:</b><br>"
            + "Enter the total amount you pay each month toward long-term debts, such as car loans, student loans, credit card payments, etc.<br><br>"
            + "<b>Calculate Button:</b><br>"
            + "After entering your pre-tax income and monthly debt payments, click 'Calculate' to estimate the amount of rent you can afford.<br><br>"
            + "<b>Clear Button:</b><br>"
            + "Click 'Clear' to reset the fields and start a new calculation."
            + "</html>";
       InstructionsRentCalculator.setContentType("text/html");
       InstructionsRentCalculator.setText(rentCalculatorInstructions);


    }
    
    private void setMessage11(){
        String refinanceCalculatorInstructions = "<html>"
            + "<b>Current Loan:</b><br>"
            + "Select whether you know your remaining balance or monthly payment for your current loan.<br><br>"
            + "<b>Remaining Balance:</b><br>"
            + "Enter the remaining balance on your current loan if you selected that option above.<br><br>"
            + "<b>Monthly Payment:</b><br>"
            + "Enter your current monthly payment if you selected that option above.<br><br>"
            + "<b>Interest Rate (Current Loan):</b><br>"
            + "Enter the interest rate on your current loan.<br><br>"
            + "<b>New Loan Term:</b><br>"
            + "Enter the number of years for the new loan term.<br><br>"
            + "<b>Interest Rate (New Loan):</b><br>"
            + "Enter the interest rate for the new loan.<br><br>"
            + "<b>Points:</b><br>"
            + "Enter any points you are paying for the new loan. Points are prepaid interest, with 1 point equal to 1% of the loan amount.<br><br>"
            + "<b>Costs and Fees:</b><br>"
            + "Enter the costs and fees associated with the new loan.<br><br>"
            + "<b>Cashout:</b><br>"
            + "If you are taking cash out as part of the refinancing, enter the cashout amount here.<br><br>"
            + "<b>Calculate Button:</b><br>"
            + "After entering the details of your current loan and the new loan, click 'Calculate' to estimate your new monthly payment and savings from refinancing.<br><br>"
            + "<b>Clear Button:</b><br>"
            + "Click 'Clear' to reset the form and start a new calculation."
            + "</html>";
        InstructionsRefinanceCalculator.setContentType("text/html");
        InstructionsRefinanceCalculator.setText(refinanceCalculatorInstructions);


    }
    private void setMessage12(){
        String downPaymentCalculatorInstructions = "<html>"
            + "<b>Upfront Cash Available:</b><br>"
            + "Enter the total amount of cash you have available for the upfront payment.<br><br>"
            + "<b>Down Payment:</b><br>"
            + "Enter the amount or percentage of the down payment you plan to make.<br><br>"
            + "<b>Include Closing Costs:</b><br>"
            + "Check this box if you want to include closing costs in the calculation. Enter the amount or percentage of the closing costs if applicable.<br><br>"
            + "<b>Interest Rate:</b><br>"
            + "Enter the interest rate for the loan (as a percentage).<br><br>"
            + "<b>Loan Term:</b><br>"
            + "Enter the duration of the loan in years.<br><br>"
            + "<b>Calculate Button:</b><br>"
            + "After entering all necessary fields, click 'Calculate' to determine how much house you can afford based on your available cash and down payment.<br><br>"
            + "<b>Clear Button:</b><br>"
            + "Click 'Clear' to reset all fields and start a new calculation."
            + "</html>";
        InstructionsDownPaymentCalculator.setContentType("text/html");
        InstructionsDownPaymentCalculator.setText(downPaymentCalculatorInstructions);


    }
    private void setMessage13(){
        String rentAndBuyCalculatorInstructions = "<html>"
            + "<h2>Home Purchase:</h2>"
            + "<b>Home Price:</b><br>"
            + "Enter the total purchase price of the home.<br><br>"
            + "<b>Down Payment:</b><br>"
            + "Enter the amount or percentage of the home price you plan to pay upfront as a down payment.<br><br>"
            + "<b>Interest Rate:</b><br>"
            + "Enter the annual interest rate for the mortgage (as a percentage).<br><br>"
            + "<b>Loan Term:</b><br>"
            + "Enter the duration of the loan in years.<br><br>"
            + "<b>Buying Closing Cost:</b><br>"
            + "Enter the closing costs for purchasing the home.<br><br>"
            + "<b>Property Taxes:</b><br>"
            + "Enter the annual property tax amount.<br><br>"
            + "<b>Property Taxes Increase:</b><br>"
            + "Enter the expected annual increase in property taxes (as a percentage).<br><br>"
            + "<b>Home Insurance:</b><br>"
            + "Enter the annual cost of home insurance.<br><br>"
            + "<b>HOA Fee:</b><br>"
            + "Enter the annual homeowners' association (HOA) fee.<br><br>"
            + "<b>Maintenance Cost:</b><br>"
            + "Enter the annual cost of maintaining the property.<br><br>"
            + "<b>Home Value Appreciation:</b><br>"
            + "Enter the expected annual appreciation of the home’s value (as a percentage).<br><br>"
            + "<b>Cost/Insurance Increase:</b><br>"
            + "Enter the expected annual increase in costs and insurance (as a percentage).<br><br>"
            + "<b>Selling Closing Cost:</b><br>"
            + "Enter the expected closing cost when selling the home.<br><br>"

            + "<h2>Home Rent:</h2>"
            + "<b>Monthly Rental Fee:</b><br>"
            + "Enter the monthly rental fee for the property.<br><br>"
            + "<b>Rental Fee Increase:</b><br>"
            + "Enter the expected annual increase in rental fees (as a percentage).<br><br>"
            + "<b>Renter's Insurance:</b><br>"
            + "Enter the annual cost of renter’s insurance.<br><br>"
            + "<b>Security Deposit:</b><br>"
            + "Enter the amount of the security deposit for the rental property.<br><br>"
            + "<b>Upfront Cost:</b><br>"
            + "Enter any other upfront costs associated with renting the property.<br><br>"

            + "<h2>Your Information:</h2>"
            + "<b>Average Investment Return:</b><br>"
            + "Enter the average annual return on investments you expect to make (as a percentage).<br><br>"
            + "<b>Marginal Federal Tax Rate:</b><br>"
            + "Enter your marginal federal tax rate (as a percentage).<br><br>"
            + "<b>Marginal State Tax Rate:</b><br>"
            + "Enter your marginal state tax rate (as a percentage).<br><br>"
            + "<b>Tax Filing Status:</b><br>"
            + "Select your tax filing status from the dropdown (e.g., Single, Married, etc.).<br><br>"

            + "<b>Calculate Button:</b><br>"
            + "Click 'Calculate' to compare the cost of buying versus renting based on the information provided.<br><br>"
            + "<b>Clear Button:</b><br>"
            + "Click 'Clear' to reset all fields and start a new calculation."
            + "</html>";
        InstructionsRentAndBuyCalculator.setContentType("text/html");
        InstructionsRentAndBuyCalculator.setText(rentAndBuyCalculatorInstructions);


    }


    
    


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
             @Override
            public void run() {
                new Main().setVisible(true);
                new Main();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AutoLoan;
    private javax.swing.JPanel Currency;
    private javax.swing.JPanel FCcontrolBtn;
    private javax.swing.JPanel FitnessAndHealthCalculator;
    private javax.swing.JPanel HouseAffordabilityCalculator;
    private javax.swing.JTextPane InstructionsAutoLoan2Calculator;
    private javax.swing.JTextPane InstructionsAutoLoanCalculator;
    private javax.swing.JTextPane InstructionsDownPaymentCalculator;
    private javax.swing.JTextPane InstructionsHouseAffordabilityCalculator;
    private javax.swing.JTextPane InstructionsMortgageCalculator;
    private javax.swing.JTextPane InstructionsMortgagePayoffCalculator;
    private javax.swing.JTextPane InstructionsRateCalculator;
    private javax.swing.JTextPane InstructionsRefinanceCalculator;
    private javax.swing.JTextPane InstructionsRentAndBuyCalculator;
    private javax.swing.JTextPane InstructionsRentCalculator;
    private javax.swing.JTextPane InstructionsRetirementCalculator;
    private javax.swing.JTextPane InstructionsRothIRACalculator;
    private javax.swing.JPanel InterestRate;
    private javax.swing.JTextField InterestRateAnnualContribution;
    private javax.swing.JRadioButton InterestRateBeggnning;
    private javax.swing.JButton InterestRateCalculatorCalculateBTN;
    private javax.swing.JButton InterestRateCalculatorClearBTN;
    private javax.swing.JComboBox<String> InterestRateCompoundPeriods;
    private javax.swing.JRadioButton InterestRateEnd;
    private javax.swing.JTextField InterestRateInitialInvestment;
    private javax.swing.JTextField InterestRateInterest;
    private javax.swing.JTextField InterestRateInvestmentLengthYears;
    private javax.swing.JTextField InterestRateMonthlyContribution;
    private javax.swing.JLabel InterestRateOutput;
    private javax.swing.JButton InvestmentCalculatorBTN3;
    private javax.swing.JLabel LabelAnnualContribution;
    private javax.swing.JPanel MathCalculator;
    private javax.swing.JPanel MortgageCalculator2;
    private javax.swing.JPanel MortgagePayoffCalculator;
    private javax.swing.JButton MortgageandRealEstateBTN;
    private javax.swing.JPanel OtherCalculator;
    private javax.swing.JButton OtherCalculatorsBTN1;
    private javax.swing.JPanel RefinanceCalculator;
    private javax.swing.JPanel RentCalculator;
    private javax.swing.JButton RetirementCalculatorBTN2;
    private javax.swing.JTextField RothIRAAnualContribution;
    private javax.swing.JButton RothIRACalculateBTN;
    private javax.swing.JPanel RothIRACalculator;
    private javax.swing.JTextField RothIRACalculatorCurrentBalance;
    private javax.swing.JTextField RothIRACalculatorExpectedReturnRate;
    private javax.swing.JTextField RothIRACurrentAge;
    private javax.swing.JRadioButton RothIRAMaximizeNO;
    private javax.swing.JRadioButton RothIRAMaximizeYes;
    private javax.swing.JButton RothIRAclearBTN;
    private javax.swing.JLabel RothIRAoutput;
    private javax.swing.JTextField RothIRaRetirementAge;
    private javax.swing.JButton autoCalculatorBTN4;
    private javax.swing.JLabel azusena;
    private javax.swing.JButton btnOtherCalculators;
    private javax.swing.JButton btnfinancialCalculator;
    private javax.swing.JButton btnfitnessCalculator;
    private javax.swing.JButton btnmathCalculator;
    private javax.swing.JButton dashboard;
    private javax.swing.JPanel downpaymentCalculator;
    private javax.swing.JTextPane instructionCurrencyCalculator;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox15;
    private javax.swing.JComboBox<String> jComboBox16;
    private javax.swing.JComboBox<String> jComboBox17;
    private javax.swing.JComboBox<String> jComboBox18;
    private javax.swing.JComboBox<String> jComboBox19;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox20;
    private javax.swing.JComboBox<String> jComboBox21;
    private javax.swing.JComboBox<String> jComboBox28;
    private javax.swing.JComboBox<String> jComboBox29;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField101;
    private javax.swing.JTextField jTextField102;
    private javax.swing.JTextField jTextField103;
    private javax.swing.JTextField jTextField104;
    private javax.swing.JTextField jTextField105;
    private javax.swing.JTextField jTextField106;
    private javax.swing.JTextField jTextField107;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField115;
    private javax.swing.JTextField jTextField116;
    private javax.swing.JTextField jTextField117;
    private javax.swing.JTextField jTextField118;
    private javax.swing.JTextField jTextField119;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField120;
    private javax.swing.JTextField jTextField121;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField51;
    private javax.swing.JTextField jTextField52;
    private javax.swing.JTextField jTextField53;
    private javax.swing.JTextField jTextField54;
    private javax.swing.JTextField jTextField55;
    private javax.swing.JTextField jTextField56;
    private javax.swing.JTextField jTextField59;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField60;
    private javax.swing.JTextField jTextField61;
    private javax.swing.JTextField jTextField62;
    private javax.swing.JTextField jTextField63;
    private javax.swing.JTextField jTextField64;
    private javax.swing.JTextField jTextField65;
    private javax.swing.JTextField jTextField66;
    private javax.swing.JTextField jTextField67;
    private javax.swing.JTextField jTextField68;
    private javax.swing.JTextField jTextField69;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField70;
    private javax.swing.JTextField jTextField71;
    private javax.swing.JTextField jTextField72;
    private javax.swing.JTextField jTextField73;
    private javax.swing.JTextField jTextField74;
    private javax.swing.JTextField jTextField75;
    private javax.swing.JTextField jTextField76;
    private javax.swing.JTextField jTextField77;
    private javax.swing.JTextField jTextField78;
    private javax.swing.JTextField jTextField79;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField80;
    private javax.swing.JTextField jTextField81;
    private javax.swing.JTextField jTextField82;
    private javax.swing.JTextField jTextField83;
    private javax.swing.JTextField jTextField84;
    private javax.swing.JTextField jTextField85;
    private javax.swing.JTextField jTextField86;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField jTextField90;
    private javax.swing.JTextField jTextField94;
    private javax.swing.JTextField jTextField95;
    private javax.swing.JTextField jTextField99;
    private javax.swing.JLabel jorge;
    private javax.swing.JLabel osvaldo;
    private javax.swing.JTabbedPane panelCalculator;
    private javax.swing.JLabel pedro;
    private javax.swing.JLabel pinkIcon;
    private javax.swing.JLabel pinkPanterCbtn;
    private javax.swing.JMenu quitBnt;
    private javax.swing.JPanel rentandbuy;
    private javax.swing.JPanel retirementCalculator3;
    // End of variables declaration//GEN-END:variables
}
