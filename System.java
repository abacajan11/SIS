/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package system;
import java.net.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.border.MatteBorder;//
import java.text.SimpleDateFormat;
import java.math.RoundingMode;
import java.text.DecimalFormat; 
import java.math.BigDecimal;
/**
 *
 * @author Administrator
 */
public class System {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        {  
        try 
        {            
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");            
        }catch(Exception e){
            java.lang.System.out.println("Look and Feel not set");
        }
    }  
}      
class Window extends JFrame   
{
    JTextField textid,textlrn,textfamilyname,textgivenname,textmiddlename,textstudext,textschoolyear,
               textschoolyear1,textsemester,textdatebirth,textplacebirth,textcitizen,textreligion,textbrgy,
               textctmun,textcontact,textprov,textzip,textemail,textparentcontact,textpwd,textsection,textmajor,
               textffname,textfgname,textfmname,textfext,textmfname,textmgname,textmmname,textmext,textgender,
               textaddress,searchb;

    JLabel     labelid,labelfamilyname,labelgivenname,labelmiddlename,labelschoolyear,labelschoolyear1,
               labelsemester,labelcivilstatus,labeldatebirth,labelplacebirth,labelcitizen,labelreligion,
               labelcontact,labelfathername,labelmothermaiden,labelparentcontact,labelpwd,labelgender,
               labeladdress,labelcourse,labelnewstud,labellrn,labelffname,labelfgname,labelfmname,
               labelfext,labelmfname,labelmgname,labelmmname,labelmext,labelbrgy,labelctmun,
               labelprov,labelzip,labelemail,labelstudext,labelfather,labelmother,labelstudent;  
               
    JButton    button1,button2,button3,save,search,button6; 
                        
    JPanel     cardLayout,window1,menu,panel4,TCClogo;
    JComboBox  combobox,combobox1,combobox2;
    JLabel     logo,talisay,label2;
    JFrame     frame;
    ImageIcon  image;

    Calendar cal = new GregorianCalendar();
    
    ArrayList<String> lrna = new ArrayList<String>(2000);
    ArrayList<String> ida = new ArrayList<String>(2000);
    ArrayList<String> schyra = new ArrayList<String>(2000); 
    ArrayList<String> schyr1a = new ArrayList<String>(2000);
    ArrayList<String> csyra = new ArrayList<String>(2000);
    ArrayList<String> fnamea = new ArrayList<String>(2000);
    ArrayList<String> gnamea = new ArrayList<String>(2000);
    ArrayList<String> mnamea = new ArrayList<String>(2000);
    ArrayList<String> studexta = new ArrayList<String>(2000);
    ArrayList<String> gena = new ArrayList<String>(2000);
    ArrayList<String> addra = new ArrayList<String>(2000);
    ArrayList<String> addrcitya = new ArrayList<String>(2000);
    ArrayList<String> addrprova = new ArrayList<String>(2000);
    ArrayList<String> addrzipa = new ArrayList<String>(2000);
    ArrayList<String> ctza = new ArrayList<String>(2000);                                        
    ArrayList<String> dateba = new ArrayList<String>(2000);
    ArrayList<String> placeba = new ArrayList<String>(2000);
    ArrayList<String> rela = new ArrayList<String>(2000);         
    ArrayList<String> civila = new ArrayList<String>(2000);
    ArrayList<String> contca = new ArrayList<String>(2000);
    ArrayList<String> emaila = new ArrayList<String>(2000);       
    ArrayList<String> pwda = new ArrayList<String>(2000);
    ArrayList<String> fathera = new ArrayList<String>(2000);
    ArrayList<String> fatherga = new ArrayList<String>(2000);        
    ArrayList<String> fatherma = new ArrayList<String>(2000);
    ArrayList<String> fatherexta = new ArrayList<String>(2000);
    ArrayList<String> mothera = new ArrayList<String>(2000);        
    ArrayList<String> motherga = new ArrayList<String>(2000);
    ArrayList<String> motherma = new ArrayList<String>(2000);
    ArrayList<String> motherexta = new ArrayList<String>(2000);        
    ArrayList<String> pcontca = new ArrayList<String>(2000);
    
    File filename = new File("STUDENT.txt");
                     
    String      lrn="",id="",schyr="",schyr1="",csyr="",fname="",gname="",
                mname="",studext="",gen="",addr="",addrcity="",addrprov="",
                addrzip="",ctz="",dateb="",placeb="",rel="",civil="",                  
                contc="",email="",pwd="",father="",fatherg="",fatherm="",
                fatherext="",mother="",motherg="",motherm="",           
                motherext="",pcontc="";                     
    int         stop=0;               
    public Window() 
    {
        
        
        setLayout(new BorderLayout(0,1)); 
        CardLayout cardlayout = new CardLayout();
        Font fonttxt = new Font("Ariel Rounded MT Bold", Font.PLAIN,16); 
      
        Font fontL = new Font("Bookman Old", Font.PLAIN,14);
        Font fontL2 = new Font("Bookman Old", Font.PLAIN,16);
        Font fontL3 = new Font("Bookman Old", Font.PLAIN,20);
        Font font = new Font("Bookman Old", Font.PLAIN,14);
        Font font1 = new Font("Bookman Old", Font.PLAIN,12);
        Font font2 = new Font("Bookman Old", Font.PLAIN,18);
        Font font4 = new Font("Bookman Old", Font.PLAIN,12);
        Font font3 = new Font("Ariel Rounded MT Bold", Font.PLAIN,24);
        Font font5 = new Font("Ariel Rounded MT Bold", Font.PLAIN,15);
        Font fontT = new Font("Ariel Rounded MT Bold", Font.PLAIN,18); //"Ariel Black"
        
        menu = new JPanel();
        TCClogo = new JPanel(); 
        
        cardLayout = new JPanel();
        panel4 = new JPanel();
        window1 = new JPanel();
        /*panel6 = new JPanel();
        panel7 = new JPanel(); 
        panel8 = new JPanel();        
        panel10 = new JPanel();
        panel11 = new JPanel();
        panelgrad = new JPanel();
        panelgrades = new JPanel();*/
        
        logo = new JLabel();
        talisay = new JLabel();        
                      
        String str[] = {"SELECT","BACHELOR OF ELEMENTARY EDUCATION",
                       "BACHELOR OF SECONDARY EDUCATION",
                       "BACHELOR OF SCIENCE IN HOSPITALITY MANAGEMENT",
                       "BACHELOR OF SCIENCE IN INDUSTRIAL TECHNOLOGY"};
                      
        String str1[] = {"SELECT","SINGLE",
                       "MARRIED",
                       "SEPARATED",
                       "WIDOWED"};                
      
        combobox = new JComboBox(str);
        combobox1 = new JComboBox(str1);
        combobox2 = new JComboBox(str);
                                         
        menu.setPreferredSize(new Dimension(200,735));    
        menu.setBackground(Color.darkGray);
        menu.setLayout(new FlowLayout(FlowLayout.CENTER,20,10)); 
      
        TCClogo.setPreferredSize(new Dimension(0,75));      
        TCClogo.setBackground(new Color(0x123456)); 
        TCClogo.setLayout(new BorderLayout()); 
        TCClogo.setBorder(BorderFactory.createEtchedBorder());
        
        cardLayout.setPreferredSize(new Dimension(500,600));    
        cardLayout.setBackground(Color.darkGray);
        cardLayout.setLayout(new FlowLayout(FlowLayout.CENTER,20,30)); 
        cardLayout.setBorder(BorderFactory.createEtchedBorder());
         
        panel4.setPreferredSize(new Dimension(800,700));    
        panel4.setBackground(Color.white);
        panel4.setLayout(new BorderLayout()); //new BorderLayout()
        panel4.setBorder(BorderFactory.createEtchedBorder());  
        panel4.setLayout(null);
   
        window1.setLayout(new FlowLayout(FlowLayout.LEADING,10,15));
        window1.setPreferredSize(new Dimension(400,300));
        window1.setBackground(new Color(0x123456));
        window1.setBorder(BorderFactory.createEtchedBorder());
        window1.setLayout(null);
        
        /*panel6.setLayout(new FlowLayout(FlowLayout.LEADING,3,3)); 
        panel6.setPreferredSize(new Dimension(500,300));    
        panel6.setBackground(new Color(0x123456));
        panel6.setBorder(BorderFactory.createEtchedBorder());
        
        panel8.setLayout(new FlowLayout(FlowLayout.LEADING,3,3));  
        panel8.setPreferredSize(new Dimension(500,300));    
        panel8.setBackground(new Color(0x123456));
        panel8.setBorder(BorderFactory.createEtchedBorder());
            
        panel10.setLayout(new FlowLayout(FlowLayout.LEADING,3,3));    
        panel10.setPreferredSize(new Dimension(500,300));    
        panel10.setBackground(new Color(0x123456));
        panel10.setBorder(BorderFactory.createEtchedBorder());
      
        panel11.setLayout(new FlowLayout(FlowLayout.LEADING,10,30)); 
        panel11.setPreferredSize(new Dimension(0,100));    
        panel11.setBackground(new Color(0x123456));
        panel11.setBorder(BorderFactory.createEtchedBorder());
        panel11.setLayout(null);
      
        panel7.setLayout(new FlowLayout(FlowLayout.LEADING,3,3));  
        panel7.setPreferredSize(new Dimension(500,300)); 
        panel7.setBackground(new Color(0x123456));        
        panel7.setBorder(BorderFactory.createEtchedBorder()); 
        
        panelgrad.setLayout(new FlowLayout(FlowLayout.LEADING,3,3));  
        panelgrad.setPreferredSize(new Dimension(500,300)); 
        panelgrad.setBackground(new Color(0x123456));        
        panelgrad.setBorder(BorderFactory.createEtchedBorder());
        
        panelgrades.setLayout(new FlowLayout(FlowLayout.LEADING,10,15));
        panelgrades.setPreferredSize(new Dimension(400,300));
        panelgrades.setBackground(new Color(0x123456));
        panelgrades.setBorder(BorderFactory.createEtchedBorder());
        panelgrades.setLayout(null);*/
        
        add(menu,BorderLayout.WEST); 
        add(TCClogo,BorderLayout.NORTH);
        
        talisay.setText("TALISAY CITY COLLEGE");
        talisay.setFont(new Font("Ariel",Font.PLAIN,80));  
        talisay.setForeground(new Color(200,200,200));
        talisay.setHorizontalAlignment(JLabel.CENTER); 
        TCClogo.add(talisay);
        
        logo.setIcon(new ImageIcon("C:\\Users\\Other User\\Documents\\Anormanbordalba\\ICONS (Proj)\\TCC LOGO.png"));
        logo.setBackground(new Color(255,255,255));
        logo.setBounds(360,30,600,600);
        panel4.add(logo);
        
        button1 = new JButton("Home"); 
        button1.setFont(new Font("Calibri Light", Font.PLAIN,20));
        button1.setPreferredSize(new Dimension(190,45));
        button1.setFocusable(false);
        button1.setBorderPainted(false);
        button1.setBackground(Color.BLACK);
        button1.setForeground(new Color(200,200,200));
        button1.setVerticalTextPosition(JButton.CENTER);
        button1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        menu.add(button1);
        
        button2 = new JButton("Student Profile"); 
        button2.setFont(new Font("Calibri Light", Font.PLAIN,20));
        button2.setPreferredSize(new Dimension(190,45)); 
        button2.setFocusable(false);
        button2.setBorderPainted(false);
        button2.setBackground(Color.BLACK);           
        button2.setForeground(new Color(200,200,200));
        button2.setVerticalTextPosition(JButton.CENTER);
        button2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        menu.add(button2);
        
        button3 = new JButton("Clear window");  
        button3.setFont(new Font("Calibri Light", Font.PLAIN,20));
        button3.setPreferredSize(new Dimension(190,45)); 
        button3.setFocusable(false);
        button3.setBorderPainted(false);
        button3.setBackground(Color.BLACK);
        button3.setForeground(new Color(200,200,200)); 
        button3.setVerticalTextPosition(JButton.CENTER);
        button3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        menu.add(button3);
      
        //************************************************************************************* 
        //            ENTRY SEARCH AND UPDATE STUDENT PROFILE
        //*************************************************************************************
    
        labelnewstud = new JLabel("STUDENT PROFILE");
        labelnewstud.setFont(font3);
        labelnewstud.setForeground(Color.CYAN);        
        labelnewstud.setBounds(5,10,300,20);
        window1.add(labelnewstud);
        
        labellrn = new JLabel("LRN");
        labellrn.setFont(fontL);
        labellrn.setForeground(new Color(200,200,200));
        labellrn.setBounds(5,35,50,20);
        textlrn = new JTextField();
        textlrn.setFont(fontT);
        textlrn.setBackground(Color.darkGray); //null         
        textlrn.setCaretColor(Color.WHITE);
        textlrn.setForeground(new Color(200,200,200)); 
        //textlrn.setBorder(new MatteBorder(0, 0, 0, 0, Color.WHITE));////////
        textlrn.setForeground(new Color(200,200,200));//////////
        textlrn.setBounds(98,35,130,30);
        window1.add(labellrn);
        window1.add(textlrn);
      
        labelid = new JLabel("Student No.");
        labelid.setFont(fontL);
        labelid.setForeground(new Color(200,200,200));
        labelid.setBounds(5,70,80,20);
        textid = new JTextField();
        textid.setFont(fontT);
        textid.setBackground(Color.darkGray);           
        textid.setCaretColor(Color.WHITE);
        textid.setForeground(new Color(200,200,200)); 
        textid.setBounds(98,70,130,30);
        window1.add(labelid);
        window1.add(textid);
      
        labelschoolyear = new JLabel("School Year");
        labelschoolyear.setFont(fontL);
        labelschoolyear.setForeground(new Color(200,200,200));
        labelschoolyear.setBounds(243,70,90,20);
        textschoolyear = new JTextField();
        textschoolyear.setFont(fontT);          
        textschoolyear.setCaretColor(Color.WHITE);
        textschoolyear.setBackground(Color.darkGray);
        textschoolyear.setForeground(new Color(200,200,200)); 
        textschoolyear.setBounds(335,70,70,30);
        window1.add(labelschoolyear);
        window1.add(textschoolyear); 
        
        labelschoolyear1 = new JLabel("  ");
        labelschoolyear1.setFont(fontL);
        labelschoolyear1.setForeground(new Color(200,200,200));
        labelschoolyear1.setBounds(403,70,20,20);
        textschoolyear1 = new JTextField();
        textschoolyear1.setFont(fontT);        
        textschoolyear1.setCaretColor(Color.WHITE);
        textschoolyear1.setBackground(Color.darkGray);
        textschoolyear1.setForeground(new Color(200,200,200)); 
        textschoolyear1.setBounds(433,70,70,30);
        window1.add(labelschoolyear1);
        window1.add(textschoolyear1);
                     
        labelcourse = new JLabel("Course");
        labelcourse.setFont(fontL);
        labelcourse.setForeground(new Color(200,200,200));
        labelcourse.setBounds(516,70,100,20);        
        combobox.setFont(font4);
        combobox.setBackground(Color.darkGray);
        combobox.setForeground(new Color(200,200,200));   
        combobox.setBounds(576,70,375,30);        
        window1.add(labelcourse);
        window1.add(combobox);
        
        labelstudent = new JLabel("Student name");
        labelstudent.setFont(fontL); 
        labelstudent.setForeground(Color.CYAN);       
        labelstudent.setBounds(5,95,300,20);
        window1.add(labelstudent); 
                
        labelfamilyname = new JLabel("Family");
        labelfamilyname.setFont(fontL);
        labelfamilyname.setForeground(new Color(200,200,200));
        labelfamilyname.setBounds(5,115,90,20);
        textfamilyname = new JTextField();
        textfamilyname.setFont(fontT);         
        textfamilyname.setCaretColor(Color.WHITE);
        textfamilyname.setBackground(Color.darkGray);
        textfamilyname.setForeground(new Color(200,200,200)); 
        textfamilyname.setBounds(98,115,293,30);
        window1.add(labelfamilyname);
        window1.add(textfamilyname); 
        
        labelgivenname = new JLabel("Given");
        labelgivenname.setFont(fontL);
        labelgivenname.setForeground(new Color(200,200,200));
        labelgivenname.setBounds(401,115,90,20);
        textgivenname = new JTextField();
        textgivenname.setFont(fontT);         
        textgivenname.setCaretColor(Color.WHITE);
        textgivenname.setBackground(Color.darkGray);
        textgivenname.setForeground(new Color(200,200,200)); 
        textgivenname.setBounds(479,115,293,30);
        window1.add(labelgivenname);
        window1.add(textgivenname); 
        
        labelmiddlename = new JLabel("Middle");
        labelmiddlename.setFont(fontL);
        labelmiddlename.setForeground(new Color(200,200,200));
        labelmiddlename.setBounds(782,115,90,20);
        textmiddlename = new JTextField();
        textmiddlename.setFont(fontT);         
        textmiddlename.setCaretColor(Color.WHITE);
        textmiddlename.setBackground(Color.darkGray);
        textmiddlename.setForeground(new Color(200,200,200)); 
        textmiddlename.setBounds(867,115,288,30);
        window1.add(labelmiddlename);
        window1.add(textmiddlename);
      
        labelstudext = new JLabel("Name ext.");
        labelstudext.setFont(fontL);
        labelstudext.setForeground(new Color(200,200,200));
        labelstudext.setBounds(5,150,150,20);
        textstudext = new JTextField();
        textstudext.setFont(fontT);          
        textstudext.setCaretColor(Color.WHITE);
        textstudext.setBackground(Color.darkGray);
        textstudext.setForeground(new Color(200,200,200)); 
        textstudext.setBounds(98,150,100,30);
        window1.add(labelstudext);
        window1.add(textstudext);
          
        labelgender = new JLabel("Sex"); 
        labelgender.setFont(fontL);
        labelgender.setForeground(new Color(200,200,200));
        labelgender.setBounds(401,150,90,20);
        textgender = new JTextField();
        textgender.setFont(fontT);        
        textgender.setCaretColor(Color.WHITE);
        textgender.setBackground(Color.darkGray);
        textgender.setForeground(new Color(200,200,200)); 
        textgender.setBounds(479,150,100,30);
        window1.add(labelgender);
        window1.add(textgender); 
                         
        labeladdress = new JLabel("Address");
        labeladdress.setFont(fontL);
        labeladdress.setForeground(Color.CYAN);    
        labeladdress.setBounds(5,175,90,20);
        textaddress = new JTextField();        
        window1.add(labeladdress); 
        
        labelbrgy = new JLabel("barangay");
        labelbrgy.setFont(fontL);
        labelbrgy.setForeground(new Color(200,200,200));
        labelbrgy.setBounds(5,195,90,20);
        textbrgy = new JTextField(); 
        textbrgy.setFont(fontT);
        textbrgy.setCaretColor(Color.WHITE);
        textbrgy.setBackground(Color.darkGray); 
        textbrgy.setForeground(new Color(200,200,200)); 
        textbrgy.setBounds(98,195,250,30);
        window1.add(labelbrgy);
        window1.add(textbrgy); 
      
        labelctmun = new JLabel("city/mun.");
        labelctmun.setFont(fontL);
        labelctmun.setForeground(new Color(200,200,200));
        labelctmun.setBounds(401,195,80,20);
        textctmun = new JTextField();
        textctmun.setFont(fontT);
        textctmun.setCaretColor(Color.WHITE);
        textctmun.setBackground(Color.darkGray); 
        textctmun.setForeground(new Color(200,200,200)); 
        textctmun.setBounds(479,195,250,30);
        window1.add(labelctmun);
        window1.add(textctmun);
      
        labelprov = new JLabel("province");
        labelprov.setFont(fontL);
        labelprov.setForeground(new Color(200,200,200));
        labelprov.setBounds(782,195,80,20);
        textprov = new JTextField();
        textprov.setFont(fontT);
        textprov.setCaretColor(Color.WHITE);
        textprov.setBackground(Color.darkGray); 
        textprov.setForeground(new Color(200,200,200)); 
        textprov.setBounds(867,195,250,30);
        window1.add(labelprov);
        window1.add(textprov); 
      
        labelzip = new JLabel("zip code");
        labelzip.setFont(fontL);
        labelzip.setForeground(new Color(200,200,200));
        labelzip.setBounds(5,230,80,20);
        textzip = new JTextField();
        textzip.setFont(fontT);
        textzip.setCaretColor(Color.WHITE);
        textzip.setBackground(Color.darkGray); 
        textzip.setForeground(new Color(200,200,200)); 
        textzip.setBounds(98,230,150,30);
        window1.add(labelzip);
        window1.add(textzip);
      
        labelcitizen = new JLabel("Citizenship");
        labelcitizen.setFont(fontL);
        labelcitizen.setForeground(new Color(200,200,200));
        labelcitizen.setBounds(401,230,90,20);
        textcitizen = new JTextField();
        textcitizen.setFont(fontT);        
        textcitizen.setCaretColor(Color.WHITE);
        textcitizen.setBackground(Color.darkGray);
        textcitizen.setForeground(new Color(200,200,200)); 
        textcitizen.setBounds(479,230,185,30);
        window1.add(labelcitizen);
        window1.add(textcitizen);
       
        labeldatebirth = new JLabel("Date of Birth"); 
        labeldatebirth.setFont(fontL);
        labeldatebirth.setForeground(new Color(200,200,200));
        labeldatebirth.setBounds(782,230,160,20);
        textdatebirth = new JTextField();
        textdatebirth.setFont(fontT);        
        textdatebirth.setCaretColor(Color.WHITE);
        textdatebirth.setBackground(Color.darkGray);
        textdatebirth.setForeground(new Color(200,200,200)); 
        textdatebirth.setBounds(867,230,180,30);
        window1.add(labeldatebirth);
        window1.add(textdatebirth); 
      
        labelplacebirth = new JLabel("Place of Birth"); 
        labelplacebirth.setFont(fontL);
        labelplacebirth.setForeground(new Color(200,200,200));
        labelplacebirth.setBounds(5,265,90,20);
        textplacebirth = new JTextField();
        textplacebirth.setFont(fontT);        
        textplacebirth.setCaretColor(Color.WHITE);
        textplacebirth.setBackground(Color.darkGray);
        textplacebirth.setForeground(new Color(200,200,200)); 
        textplacebirth.setBounds(98,265,190,30);
        window1.add(labelplacebirth);
        window1.add(textplacebirth);
      
        labelreligion = new JLabel("Religion");
        labelreligion.setFont(fontL);
        labelreligion.setForeground(new Color(200,200,200));
        labelreligion.setBounds(401,265,90,20);
        textreligion = new JTextField();
        textreligion.setFont(fontT);        
        textreligion.setCaretColor(Color.WHITE);
        textreligion.setBackground(Color.darkGray);
        textreligion.setForeground(new Color(200,200,200)); 
        textreligion.setBounds(479,265,250,30);
        window1.add(labelreligion); 
        window1.add(textreligion); 
        
        labelcivilstatus = new JLabel("Civil Status");
        labelcivilstatus.setFont(fontL);
        labelcivilstatus.setForeground(new Color(200,200,200));
        labelcivilstatus.setBounds(782,265,90,20);
        combobox1.setBackground(Color.darkGray);
        combobox1.setForeground(new Color(200,200,200)); 
        combobox1.setBounds(867,265,120,30);        
        window1.add(labelcivilstatus);
        window1.add(combobox1);
        
        labelcontact = new JLabel("Contact No.");
        labelcontact.setFont(fontL);
        labelcontact.setForeground(new Color(200,200,200));
        labelcontact.setBounds(5,300,90,20);
        textcontact = new JTextField();
        textcontact.setFont(fontT);         
        textcontact.setCaretColor(Color.WHITE); 
        textcontact.setBackground(Color.darkGray);
        textcontact.setForeground(new Color(200,200,200)); 
        textcontact.setBounds(98,300,250,30);
        window1.add(labelcontact);
        window1.add(textcontact); 
      
        labelemail = new JLabel("Email addr"); 
        labelemail.setFont(fontL);
        labelemail.setForeground(new Color(200,200,200));
        labelemail.setBounds(401,300,90,20);
        textemail = new JTextField();
        textemail.setFont(fontT);         
        textemail.setCaretColor(Color.WHITE);
        textemail.setBackground(Color.darkGray);
        textemail.setForeground(new Color(200,200,200)); 
        textemail.setBounds(479,300,300,30);
        window1.add(labelemail);
        window1.add(textemail);
       
        labelpwd = new JLabel("P.W.D.");
        labelpwd.setFont(fontL);
        labelpwd.setForeground(new Color(200,200,200));
        labelpwd.setBounds(782,300,160,20);
        textpwd = new JTextField();
        textpwd.setFont(fontT);         
        textpwd.setCaretColor(Color.WHITE);
        textpwd.setBackground(Color.darkGray);
        textpwd.setForeground(new Color(200,200,200)); 
        textpwd.setBounds(867,300,250,30);
        window1.add(labelpwd);
        window1.add(textpwd); 
      
        labelfathername = new JLabel("Father's name");
        labelfathername.setFont(fontL);
        labelfathername.setForeground(Color.CYAN);       
        labelfathername.setBounds(5,325,100,20);
        window1.add(labelfathername);
      
        labelffname = new JLabel("Family");
        labelffname.setFont(fontL);
        labelffname.setForeground(new Color(200,200,200));
        labelffname.setBounds(5,345,90,20); 
        textffname = new JTextField();     
        textffname.setFont(fontT);         
        textffname.setCaretColor(Color.WHITE);
        textffname.setBackground(Color.darkGray);
        textffname.setForeground(new Color(200,200,200)); 
        textffname.setBounds(98,345,293,30);
        window1.add(labelffname);
        window1.add(textffname); 
        
        labelfgname = new JLabel("Given");
        labelfgname.setFont(fontL);
        labelfgname.setForeground(new Color(200,200,200));
        labelfgname.setBounds(401,345,90,20);
        textfgname = new JTextField();
        textfgname.setFont(fontT);         
        textfgname.setCaretColor(Color.WHITE);
        textfgname.setBackground(Color.darkGray);
        textfgname.setForeground(new Color(200,200,200)); 
        textfgname.setBounds(479,345,293,30);
        window1.add(labelfgname);
        window1.add(textfgname); 
        
        labelfmname = new JLabel("Middle");
        labelfmname.setFont(fontL);
        labelfmname.setForeground(new Color(200,200,200));
        labelfmname.setBounds(782,345,90,20);
        textfmname = new JTextField();
        textfmname.setFont(fontT);         
        textfmname.setCaretColor(Color.WHITE);
        textfmname.setBackground(Color.darkGray);
        textfmname.setForeground(new Color(200,200,200)); 
        textfmname.setBounds(867,345,288,30); 
        window1.add(labelfmname);
        window1.add(textfmname);
       
        labelfext = new JLabel("Name ext.");
        labelfext.setFont(fontL);
        labelfext.setForeground(new Color(200,200,200));
        labelfext.setBounds(5,380,90,20);
        textfext = new JTextField();
        textfext.setFont(fontT);          
        textfext.setCaretColor(Color.WHITE);
        textfext.setBackground(Color.darkGray);
        textfext.setForeground(new Color(200,200,200)); 
        textfext.setBounds(98,380,150,30);
        window1.add(labelfext);
        window1.add(textfext);
       
        labelmothermaiden = new JLabel("Mother's Maiden Name");
        labelmothermaiden.setFont(fontL);
        labelmothermaiden.setForeground(Color.CYAN);     
        labelmothermaiden.setBounds(5,405,160,20);
        window1.add(labelmothermaiden);
        
        labelmfname = new JLabel("Family"); 
        labelmfname.setFont(fontL);
        labelmfname.setForeground(new Color(200,200,200));
        labelmfname.setBounds(5,425,90,20); 
        textmfname = new JTextField();     
        textmfname.setFont(fontT);         
        textmfname.setCaretColor(Color.WHITE);
        textmfname.setBackground(Color.darkGray);
        textmfname.setForeground(new Color(200,200,200)); 
        textmfname.setBounds(98,425,293,30);
        window1.add(labelmfname);
        window1.add(textmfname); 
        
        labelmgname = new JLabel("Given");
        labelmgname.setFont(fontL);
        labelmgname.setForeground(new Color(200,200,200));
        labelmgname.setBounds(401,425,90,20);
        textmgname = new JTextField(); 
        textmgname.setFont(fontT);         
        textmgname.setCaretColor(Color.WHITE);
        textmgname.setBackground(Color.darkGray);
        textmgname.setForeground(new Color(200,200,200)); 
        textmgname.setBounds(479,425,293,30);
        window1.add(labelmgname);
        window1.add(textmgname); 
        
        labelmmname = new JLabel("Middle");
        labelmmname.setFont(fontL);
        labelmmname.setForeground(new Color(200,200,200));
        labelmmname.setBounds(782,425,90,20);
        textmmname = new JTextField();
        textmmname.setFont(fontT);          
        textmmname.setCaretColor(Color.WHITE);
        textmmname.setBackground(Color.darkGray);
        textmmname.setForeground(new Color(200,200,200)); 
        textmmname.setBounds(867,425,288,30); 
        window1.add(labelmmname);
        window1.add(textmmname);
      
        labelmext = new JLabel("Name xt.");
        labelmext.setFont(fontL);
        labelmext.setForeground(new Color(200,200,200));
        labelmext.setBounds(5,460,90,20);
        textmext = new JTextField();
        textmext.setFont(fontT);         
        textmext.setCaretColor(Color.WHITE);
        textmext.setBackground(Color.darkGray);
        textmext.setForeground(new Color(200,200,200)); 
        textmext.setBounds(98,460,150,30);
        window1.add(labelmext);
        window1.add(textmext);
                              
        labelparentcontact = new JLabel("Contact No.");
        labelparentcontact.setFont(fontL);
        labelparentcontact.setForeground(new Color(200,200,200));
        labelparentcontact.setBounds(401,460,160,20);
        textparentcontact = new JTextField();
        textparentcontact.setFont(fontT);         
        textparentcontact.setCaretColor(Color.WHITE);
        textparentcontact.setBackground(Color.darkGray);
        textparentcontact.setForeground(new Color(200,200,200)); 
        textparentcontact.setBounds(479,460,250,30);
        window1.add(labelparentcontact);
        window1.add(textparentcontact);
        
        save = new JButton("save");
        save.setFont(fontL);
        save.setBounds(236,35,65,30);
        save.setForeground(new Color(200,200,200)); 
        save.setBackground(Color.BLACK);          
        save.setFocusable(false);
        save.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        save.setBorder(BorderFactory.createEtchedBorder());
        window1.add(save);
       
        search = new JButton("search");
        search.setFont(fontL);
        search.setBounds(672,10,65,35);
        search.setForeground(new Color(200,200,200));  
        search.setBackground(Color.BLACK);         
        search.setFocusable(false);
        search.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        search.setBorder(BorderFactory.createEtchedBorder());
        window1.add(search); 
        
        /*button6 = new JButton("update");
        button6.setFont(fontL);
        button6.setBounds(740,10,65,35);
        button6.setForeground(new Color(200,200,200));
        button6.setBackground(Color.BLACK);         
        button6.setFocusable(false);
        button6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        button6.setBorder(BorderFactory.createEtchedBorder());
        window1.add(button6);*/
      
        searchb = new JTextField();
        searchb.setFont(fonttxt); 
        searchb.setBounds(360,10,330,35);  
        searchb.setForeground(Color.black);
        searchb.setBackground(Color.lightGray);          
        window1.add(searchb);
        
        String placeholderText = "Search by ID number or familyname";
        searchb.setText(placeholderText);
        searchb.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) { 
                if (e.getKeyChar() == KeyEvent.VK_BACK_SPACE && searchb.getCaretPosition() == 0) {
                    searchb.setText(placeholderText);
                    searchb.setCaretPosition(0);
                    e.consume();
                } else if (searchb.getText().equals(placeholderText)) {
                    searchb.setText(""); 
                } else if (searchb.getText().isEmpty()) {
                    searchb.setText(placeholderText);
                    searchb.setCaretPosition(0);
                }
            }
        });  
        searchb.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (searchb.getText().isEmpty()) {
                    searchb.setText(placeholderText);
                    searchb.setCaretPosition(0);
                }
            }

            /*@Override
            public void focusLost(FocusEvent e) {
                textsearchb.setText("");
            
            }*/
        });                
        cardLayout.setLayout(cardlayout);
        cardLayout.add(panel4,"1");
        cardLayout.add(window1,"2");
        //panel3.add(panel11,"3");
        //panel3.add(panel6,"4");
        //panel3.add(panel7,"6");
        //panel3.add(panelgrad,"7");
        //panel3.add(panelgrades,"8"); 
        add(cardLayout);
         
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(1530,735); 
        setLocationRelativeTo(null); 
           
        button1.addActionListener(new ActionListener(){            
            public void actionPerformed(ActionEvent e)
            {
                cardlayout.show(cardLayout,"1");
               // home window
            }            
        });
        
        button2.addActionListener(new ActionListener(){            
            public void actionPerformed(ActionEvent e)
            {
                cardlayout.show(cardLayout,"2"); 
                textlrn.requestFocus();
                // student profile 
            }
        });    
        
        
        ////////////////////////// 
        searchb.addKeyListener(new KeyAdapter() {            
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_UP)
                {
                    textlrn.requestFocus();
                }
            }
        });
        
        searchb.addKeyListener(new KeyAdapter() {            
            public void keyPressed(KeyEvent evt) { 
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_DOWN)
                {
                    textlrn.requestFocus();
                }
            }
        });
        ///////////////////////////
        
        textlrn.addKeyListener(new KeyAdapter() {           
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_ENTER)
                {
                    textid.requestFocus();
                }
            }
        });
      
        textid.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_ENTER)
                {
                    textschoolyear.requestFocus();
                }
            }
        });
      
        textschoolyear.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_ENTER)
                {
                    textschoolyear1.requestFocus();
                }
            }
        }); 
      
        textschoolyear1.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_ENTER)
                {
                    combobox.requestFocus();
                }
            }
        });
      
        combobox.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_ENTER)
                {
                    textfamilyname.requestFocus();
                }
            }
        });
      
        textfamilyname.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_ENTER)
                {
                    textgivenname.requestFocus();
                }
            }
        });
      
        textgivenname.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_ENTER)
                {
                    textmiddlename.requestFocus();
                }
            }
        });
      
        textmiddlename.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_ENTER)
                {
                    textstudext.requestFocus();
                }
            }  
        });
      
        textstudext.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_ENTER)
                {
                    textgender.requestFocus();
                }
            }
        });
      
        textgender.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_ENTER)
                {          
                    textbrgy.requestFocus();
                }
            }
        });
      
        textbrgy.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_ENTER)
                {
                    textctmun.requestFocus();
                }
            }
        });
      
        textctmun.addKeyListener(new KeyAdapter() { 
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_ENTER)
                {
                    textprov.requestFocus();
                }
            }
        });
      
        textprov.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_ENTER)
                {
                    textzip.requestFocus();
                }
            }
        });
      
        textzip.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_ENTER)
                {
                    textcitizen.requestFocus();
                }
            }
        });
      
        textcitizen.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_ENTER)
                {
                     textdatebirth.requestFocus();
                }                                        
            }  
        });
      
        textdatebirth.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_ENTER)
                {
                    textplacebirth.requestFocus();
                }
            }
        });
      
        textplacebirth.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_ENTER)
                {
                    textreligion.requestFocus();
                }
            }
        });
      
        textreligion.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_ENTER)
                {
                    combobox1.requestFocus();
                }
            }
        });
      
        combobox1.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_ENTER)
                {
                    textcontact.requestFocus();
                }
            }
        });
      
        textcontact.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_ENTER)
                {
                  textemail.requestFocus();
                }
            }
        });
      
        textemail.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_ENTER)
                {
                    textpwd.requestFocus();
                }
            }
        });
      
        textpwd.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_ENTER)
                {
                    textffname.requestFocus();
                }
            }
        });
      
        textffname.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_ENTER)
                {
                    textfgname.requestFocus();
                }
            }
        });
      
        textfgname.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_ENTER)
                {
                    textfmname.requestFocus();
                }
            }
        });
      
        textfmname.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_ENTER)
                {
                    textfext.requestFocus();
                }
            }
        });
      
        textfext.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_ENTER)
                {
                    textmfname.requestFocus();
                }
            }
        });  
      
        textmfname.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_ENTER)
                {
                    textmgname.requestFocus();
                }
            }
        });
      
        textmgname.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_ENTER)
                {
                    textmmname.requestFocus();
                }
            }
        });
      
        textmmname.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_ENTER)
                {
                    textmext.requestFocus();
                }
            }
        });
      
        textmext.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_ENTER)
                {
                    textparentcontact.requestFocus();
                }
            }
        });
      
        /*textparentcontact.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_ENTER)
                {
                    textschool1.requestFocus();
                }
            }
        });
      
        textschool1.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_ENTER)
                {
                    textschool2.requestFocus();
                }
            }
        });
      
        textschool2.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_ENTER)
                {
                    textschool3.requestFocus();
                }
            }
        });
      
        textschool3.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_ENTER)
                {
                    textschool4.requestFocus();
                }
            }
        });*/
              
        textlrn.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_RIGHT)
                {
                    textid.requestFocus();
                }
            }
        });
      
        textid.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_RIGHT)
                {
                    textschoolyear.requestFocus();
                }
            }
        });
      
        textschoolyear.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_RIGHT)
                {
                    textschoolyear1.requestFocus();
                }
            }
        }); 
      
        textschoolyear1.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_RIGHT)
                {
                    combobox.requestFocus();
                }
            }
        });
      
        combobox.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_RIGHT)
                {
                    textfamilyname.requestFocus();
                }
            }
        });
      
        textfamilyname.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_RIGHT)
                {
                    textgivenname.requestFocus();
                }
            }
        });
      
        textgivenname.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_RIGHT)
                {
                    textmiddlename.requestFocus();
                }
            }
        });
      
        textmiddlename.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_RIGHT)
                {
                    textstudext.requestFocus();
                }
            }  
        });
      
        textstudext.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_RIGHT)
                {
                    textgender.requestFocus();
                }
            }
        });
      
        textgender.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_RIGHT)
                {
                    textbrgy.requestFocus();
                }
            }
        });
      
        textbrgy.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_RIGHT)
                {
                    textctmun.requestFocus(); 
                }
            }
        });
             
        textctmun.addKeyListener(new KeyAdapter() { 
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_RIGHT)
                {
                    textprov.requestFocus();
                } 
            }
        });
      
        textprov.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if(key == KeyEvent.VK_RIGHT)
                {
                    textzip.requestFocus();
                }
            }
        });
      
        textzip.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_RIGHT)
                {
                    textcitizen.requestFocus();
                }
            }
        });
      
        textcitizen.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_RIGHT)
                {
                    textdatebirth.requestFocus();
                }
            }
        });
      
        textdatebirth.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_RIGHT)
                {
                    textplacebirth.requestFocus();
                }
            }
        });
      
        textplacebirth.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_RIGHT)
                {
                    textreligion.requestFocus();
                }
            }
        });
      
        textreligion.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_RIGHT)
                {
                    combobox1.requestFocus();
                }
            }
        });
      
        combobox1.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_RIGHT)
                {
                    textcontact.requestFocus();
                }
            }
        });
     
        textcontact.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                 int key = evt.getKeyCode();
                 if (key == KeyEvent.VK_RIGHT)
                 {
                     textemail.requestFocus();
                 }
            }
        });
      
        textemail.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_RIGHT)
                {
                    textpwd.requestFocus();
                }
            }
        });
      
        textpwd.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                 int key = evt.getKeyCode();
                 if (key == KeyEvent.VK_RIGHT)
                 {
                     textffname.requestFocus();
                     
                 }
            }
        });
      
        textffname.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_RIGHT)
                {
                     textfgname.requestFocus();
                }
            }
        });
      
        textfgname.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_RIGHT)
                {
                    textfmname.requestFocus();
                }
            }
        });
      
        textfmname.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_RIGHT)
                {
                    textfext.requestFocus();
                }
            }
        });
      
        textfext.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_RIGHT)
                {
                    textmfname.requestFocus();
                }
            }
        });  
      
        textmfname.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_RIGHT)
                {
                    textmgname.requestFocus();
                }
            }
        });
      
        textmgname.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_RIGHT)
                {
                    textmmname.requestFocus();
                }
            }
        });
      
        textmmname.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_RIGHT)
                {
                    textmext.requestFocus();
                }
            }
        });
      
        textmext.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_RIGHT)
                {
                    textparentcontact.requestFocus();
                }
            }
        });
      
        /*textparentcontact.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_DOWN)
                {
                    textschool1.requestFocus();
                }
            }
        });
      
        textschool1.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_DOWN)
                {
                    textschool2.requestFocus();
                    
                }
            } 
        });
      
        textschool2.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_DOWN)
                {
                    textschool3.requestFocus();
                }
            }
        });
      
        textschool3.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_DOWN) 
                {
                    textschool4.requestFocus();
                }
            }
        });*/
         
        /*textschool4.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_UP) 
                {
                    textschool3.requestFocus();
                }
            }
        });
        textschool3.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_UP)
                {
                    textschool2.requestFocus();
                }
            }
        });
      
        textschool2.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_UP)
                {
                    textschool1.requestFocus();
                }
            }
        });
      
        textschool1.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_UP)
                {
                    textparentcontact.requestFocus();
                }
            }
        });*/
      
        textparentcontact.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_LEFT) 
                {
                    textmext.requestFocus();
                }
            }
        });
      
        textmext.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_LEFT) 
                {
                    textmmname.requestFocus();
                }
            }
        });
      
        textmmname.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_LEFT)
                {
                    textmgname.requestFocus();
                }
            }
        });
      
        textmgname.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_LEFT)
                {
                    textmfname.requestFocus();
                }
            }
        });
      
        textmfname.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_LEFT)
                {
                    textfext.requestFocus();
                }
            }
        });
      
        textfext.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_LEFT)
                {
                    textfmname.requestFocus();                   
                }
            }
        });
      
        textfmname.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_LEFT)
                {
                    textfgname.requestFocus();
                }
            }
        });
      
        textfgname.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_LEFT)
                {
                    textffname.requestFocus();
                }
            }
        });
       
        textffname.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_LEFT)
                {
                    textpwd.requestFocus();
                }
            }
        });
      
        textpwd.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_LEFT)
                {
                    textemail.requestFocus();
                }
            }
        });
      
        textemail.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_LEFT)
                {
                    textcontact.requestFocus();
                }
            }
        });
      
        textcontact.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_LEFT)
                {
                    combobox1.requestFocus();
                }
            }
        });
      
        combobox1.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_LEFT)
                {
                     textreligion.requestFocus();
                }
            }
        });
      
        textreligion.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_LEFT)
                {
                    textplacebirth.requestFocus();
                }
            }
        });
      
        textplacebirth.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_LEFT)
                {
                    textdatebirth.requestFocus();
                }
            }
        });
      
        textdatebirth.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_LEFT)
                {
                    textcitizen.requestFocus();
                }
            }
        });
      
        textcitizen.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_LEFT)
                {
                    textzip.requestFocus();
                }
            }
        });
      
        textzip.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_LEFT)
                {
                    textprov.requestFocus();
                }
            }
        });
      
        textprov.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_LEFT)
                {
                    textctmun.requestFocus();
                }
            }
        });
       
        textctmun.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_LEFT)
                {
                    textbrgy.requestFocus();
                }
            }
        });
       
        textbrgy.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_LEFT)
                {
                    textgender.requestFocus();
                }
            }
        });
      
        textgender.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_LEFT)
                {
                    textstudext.requestFocus();
                } 
            }
        });
      
        textstudext.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_LEFT)
                {
                    textmiddlename.requestFocus();
                }
            }
        });
       
        textmiddlename.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_LEFT)
                {
                    textgivenname.requestFocus();
                }
            }
        });
      
        textgivenname.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_LEFT)
                {
                    textfamilyname.requestFocus();
                }
            }
        });
      
        textfamilyname.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_LEFT)
                {
                    combobox.requestFocus();
                }
            }
        });
      
        combobox.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_LEFT)
                {
                    textschoolyear1.requestFocus();
                }
            }
        });
      
        textschoolyear1.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_LEFT)
                {
                    textschoolyear.requestFocus();
                }
            }
        });
      
        textschoolyear.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_LEFT)
                {
                    textid.requestFocus();
                }
            }
        });
      
        textid.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_LEFT) 
                {
                    textlrn.requestFocus();
                }
            }
        });        
        //////save button
        save.addActionListener(new ActionListener(){               
            public void actionPerformed(ActionEvent ae)
            {
                String  read;
                int     a=0,b=1,c=2,d=3,ee=4,f=5,g=6,h=7,i=8,j=9,k=10,
                        l=11,m=12,n=13,o=14,p=15,q=16,r=17,s=18,t=19,u=20,                 
                        v=21,w=22,x=23,y=24,z=25,az=26,bz=27,cz=28,dz=29,ez=30,                  
                        countf=0,index=0;
                try{
                    BufferedReader out2=new BufferedReader(new FileReader(filename));  
                    if(!out2.ready())
                    {
                        throw new IOException();
                    }
                    while((read=out2.readLine())!=null)
                    {
                        if(countf==a) 
                        {
                            lrna.add(read);
                            countf++;                                          
                        }  
                        else if(countf==b)
                        {
                            ida.add(read);
                            countf++;                                       
                        }
                        else if(countf==c)
                        {
                            schyra.add(read); 
                            countf++;                                       
                        } 
                        else if(countf==d) 
                        {
                            schyr1a.add(read);
                            countf++;                                       
                        } 
                        else if(countf==ee)
                        {
                            csyra.add(read); 
                            countf++;                                       
                        }
                        else if(countf==f)
                        {
                            fnamea.add(read);
                            countf++;                                       
                        } 
                        else if(countf==g)
                        {
                            gnamea.add(read);
                            countf++;                                       
                        } 
                        else if(countf==h)
                        {
                            mnamea.add(read); 
                            countf++;                                      
                        }  
                        else if(countf==i)
                        {
                            studexta.add(read); 
                            countf++;                                      
                        } 
                        else if(countf==j)
                        {
                            gena.add(read);
                            countf++;                                      
                        }
                        else if(countf==k)
                        {
                            addra.add(read); 
                            countf++;                                      
                        }
                        else if(countf==l) 
                        {
                            addrcitya.add(read);
                            countf++;                                      
                        }
                        else if(countf==m) 
                        {
                            addrprova.add(read); 
                            countf++;                                      
                        }
                        else if(countf==n)
                        {
                            addrzipa.add(read); 
                            countf++;                                      
                        }
                        else if(countf==o)
                        {
                            ctza.add(read); 
                            countf++;                                      
                        }
                        else if(countf==p)
                        {
                            dateba.add(read); 
                            countf++;                                      
                        }  
                        else if(countf==q)
                        {
                            placeba.add(read); 
                            countf++;                                       
                        }
                        else if(countf==r)
                        {
                            rela.add(read);
                            countf++;                                       
                        }
                        else if(countf==s)
                        {
                            civila.add(read);
                            countf++;                                      
                        }
                        else if(countf==t)
                        {
                            contca.add(read); 
                            countf++;                                      
                        }
                        else if(countf==u)
                        {
                            emaila.add(read);
                            countf++;                                      
                        }
                        else if(countf==v)
                        {
                            pwda.add(read);
                            countf++;                                       
                        }
                        else if(countf==w)
                        {
                            fathera.add(read); 
                            countf++;                                     
                        }
                        else if(countf==x)
                        {
                            fatherga.add(read);
                            countf++;                                       
                        }
                        else if(countf==y)
                        {
                            fatherma.add(read);
                            countf++;                                      
                        }
                        else if(countf==z)
                        {
                            fatherexta.add(read);
                            countf++;                                       
                        }
                        else if(countf==az)
                        {
                            mothera.add(read); 
                            countf++;                                      
                        }
                        else if(countf==bz)
                        {
                            motherga.add(read);
                            countf++;                                       
                        }
                        else if(countf==cz)
                        {
                            motherma.add(read); 
                            countf++;                                      
                        }
                        else if(countf==dz)
                        {
                            motherexta.add(read); 
                            countf++;                                      
                        }
                        else if(countf==ez)
                        {
                            pcontca.add(read);
                            countf++;
                            index++;
                        }
                        else{
                            //idnumaa.add(Integer.parseInt((read)));
                            countf++;
                            a=a+31;
                            b=b+31;
                            c=c+31;
                            d=d+31;
                            ee=ee+31;
                            f=f+31;
                            g=g+31;
                            h=h+31;
                            i=i+31;
                            j=j+31;
                            k=k+31;
                            l=l+31;
                            m=m+31;
                            n=n+31;
                            o=o+31;
                            p=p+31;
                            q=q+31;
                            r=r+31;
                            s=s+31;
                            t=t+31;
                            u=u+31;
                            v=v+31;
                            w=w+31;                                                                             
                            x=x+31;
                            y=y+31;
                            z=z+31;
                            az=az+31;
                            bz=bz+31;
                            cz=cz+31;
                            dz=dz+31;
                            ez=ez+31;                                                                                                                                                                                           
                        }                  
                    }
                    out2.close();             
                }catch(IOException e){ 
                    java.lang.System.out.println(e);  
                }                   
                lrn = textlrn.getText(); 
                id = textid.getText();
                schyr = textschoolyear.getText();  
                schyr1 = textschoolyear1.getText();
                csyr = combobox.getSelectedItem().toString();  
                fname = textfamilyname.getText(); 
                gname = textgivenname.getText();  
                mname = textmiddlename.getText(); 
                studext = textstudext.getText();
                gen = textgender.getText();
                addr = textbrgy.getText();
                addrcity = textctmun.getText();
                addrprov = textprov.getText();
                addrzip = textzip.getText();
                ctz = textcitizen.getText();
                dateb = textdatebirth.getText();
                placeb = textplacebirth.getText();
                rel = textreligion.getText();
                civil =combobox1.getSelectedItem().toString();      
                contc = textcontact.getText();
                email = textemail.getText();
                pwd = textpwd.getText();
                father = textffname.getText();
                fatherg = textfgname.getText();
                fatherm = textfmname.getText();
                fatherext = textfext.getText();
                mother = textmfname.getText(); 
                motherg = textmgname.getText();
                motherm = textmmname.getText();
                motherext= textmext.getText(); 
                pcontc = textparentcontact.getText();
                if(!lrn.equals("")) 
                {
                    lrna.add(lrn);
                }
                    else  
                    {
                        lrna.add("N");
                    }                   
                if(!id.equals("")) 
                {
                    ida.add(id);
                }
                else
                {
                    ida.add("N");
                }
                if(!schyr.equals("")) 
                {
                    schyra.add(schyr);
                }
                else
                {
                    schyra.add("N");                   
                }
                if(!schyr1.equals(""))
                {
                    schyr1a.add(schyr1);
                }
                else
                { 
                    schyr1a.add("N");
                }
                if(!csyr.equals("SELECT"))
                {
                    csyra.add(csyr);
                }
                else
                {
                    csyra.add("N");
                }                   
                if(!fname.equals(""))
                {
                    fnamea.add(fname); 
                }
                else
                {                       
                    fnamea.add("N");
                }
                if(!gname.equals(""))
                {
                    gnamea.add(gname);
                }
                else
                {                       
                    gnamea.add("N");
                }
                if(!mname.equals(""))
                {
                    mnamea.add(mname);
                }
                else
                {                       
                    mnamea.add("N");
                }
                if(!studext.equals(""))
                {
                    studexta.add(studext);
                }
                else
                {                       
                    studexta.add("N");
                }
                if(!gen.equals(""))
                {
                    gena.add(gen);
                }
                else
                {                       
                    gena.add("N");
                }
                if(!addr.equals(""))
                {
                    addra.add(addr);
                }
                else
                {                       
                    addra.add("N");
                }
                if(!addrcity.equals(""))
                {
                    addrcitya.add(addrcity);
                }
                else
                {                       
                    addrcitya.add("N");
                }
                if(!addrprov.equals(""))
                {
                    addrprova.add(addrprov);
                }
                else
                {                       
                    addrprova.add("N");
                }
                if(!addrzip.equals(""))
                {
                    addrzipa.add(addrzip);
                }
                else
                {                       
                    addrzipa.add("N");
                }
                if(!ctz.equals(""))
                {
                    ctza.add(ctz);
                }
                else
                {                       
                    ctza.add("N");
                }
                if(!dateb.equals(""))
                {
                    dateba.add(dateb);
                }
                else
                {                       
                    dateba.add("N");
                }
                if(!placeb.equals(""))
                {
                    placeba.add(placeb);  
                }
                else
                {                       
                    placeba.add("N");
                }
                if(!rel.equals(""))
                {
                    rela.add(rel);
                }
                else
                {                       
                    rela.add("N");
                }
                if(!civil.equals("SELECT"))
                {
                    civila.add(civil);
                }
                else
                {
                    civila.add("N");
                }
                if(!contc.equals(""))
                {
                    contca.add(contc);
                }
                else
                {                       
                    contca.add("N");
                }                   
                if(!email.equals(""))
                {
                    emaila.add(email);
                }
                else
                {                       
                    emaila.add("N");
                }
                if(!pwd.equals(""))
                {
                    pwda.add(pwd);
                }
                else
                {                       
                    pwda.add("N");
                }   
                if(!father.equals(""))
                {
                    fathera.add(father);
                }
                else
                {                       
                    fathera.add("N");
                }
                if(!fatherg.equals(""))
                {
                    fatherga.add(fatherg);
                }
                else
                {                       
                    fatherga.add("N");
                }
                if(!fatherm.equals(""))
                {
                    fatherma.add(fatherm);
                }
                else
                {                       
                    fatherma.add("N");
                }
                if(!fatherext.equals(""))
                {
                    fatherexta.add(fatherext);
                } 
                else
                {                       
                    fatherexta.add("N");
                }
                if(!mother.equals(""))
                {
                    mothera.add(mother);
                }
                else
                {                       
                    mothera.add("N");
                }
                if(!motherg.equals(""))
                {
                    motherga.add(motherg);
                }
                else
                {                       
                    motherga.add("N");
                }
                if(!motherm.equals(""))
                {
                    motherma.add(motherm);
                }
                else
                {                       
                    motherma.add("N");
                }
                if(!motherext.equals(""))
                {
                    motherexta.add(motherext);
                }
                else
                {                       
                    motherexta.add("N"); 
                }
                if(!pcontc.equals(""))
                {
                    pcontca.add(pcontc);
                }
                else
                {                       
                    pcontca.add("N");
                }                    
                try{                                          
                    FileWriter filewriter = new FileWriter(filename);
                    Writer in = new BufferedWriter(filewriter); 
                    for(int c2=0;c2<fnamea.size();c2++)
                    {                                
                        in.write(lrna.get(c2)+"\n");     
                        in.write(ida.get(c2)+"\n");
                        in.write(schyra.get(c2).toString()+"\n");                                                                                             
                        in.write(schyr1a.get(c2).toString()+"\n");
                        in.write(csyra.get(c2).toString()+"\n");                                             
                        in.write(fnamea.get(c2).toString()+"\n");
                        in.write(gnamea.get(c2).toString()+"\n");
                        in.write(mnamea.get(c2).toString()+"\n");
                        in.write(studexta.get(c2).toString()+"\n");
                        in.write(gena.get(c2).toString()+"\n");
                        in.write(addra.get(c2).toString()+"\n");
                        in.write(addrcitya.get(c2).toString()+"\n");
                        in.write(addrprova.get(c2).toString()+"\n"); 
                        in.write(addrzipa.get(c2).toString()+"\n");
                        in.write(ctza.get(c2).toString()+"\n");
                        in.write(dateba.get(c2).toString()+"\n");
                        in.write(placeba.get(c2).toString()+"\n");
                        in.write(rela.get(c2).toString()+"\n");
                        in.write(civila.get(c2).toString()+"\n");
                        in.write(contca.get(c2).toString()+"\n");
                        in.write(emaila.get(c2).toString()+"\n");
                        in.write(pwda.get(c2).toString()+"\n");
                        in.write(fathera.get(c2).toString()+"\n");
                        in.write(fatherga.get(c2).toString()+"\n");
                        in.write(fatherma.get(c2).toString()+"\n");
                        in.write(fatherexta.get(c2).toString()+"\n");
                        in.write(mothera.get(c2).toString()+"\n");
                        in.write(motherga.get(c2).toString()+"\n");
                        in.write(motherma.get(c2).toString()+"\n");
                        in.write(motherexta.get(c2).toString()+"\n");
                        in.write(pcontca.get(c2).toString()+"\n");                                                                                                                                                                                                                                                                 
                    }  
                    in.close();            
                }catch(Exception e){                            
                    java.lang.System.out.print("Can not find the file TO BE SAVE HUHUHU");
                }
                JOptionPane.showMessageDialog(null,"Student record save"," Message",
                JOptionPane.INFORMATION_MESSAGE);
                combobox.setSelectedItem("SELECT");combobox1.setSelectedItem("SELECT");
                combobox2.setSelectedItem("SELECT");
                textlrn.setText("");textid.setText(""); 
                textschoolyear.setText("");textschoolyear1.setText("");
                textfamilyname.setText("");textgivenname.setText(""); 
                textmiddlename.setText("");textstudext.setText("");
                textgender.setText("");textbrgy.setText("");
                textctmun.setText("");textprov.setText("");
                textzip.setText("");textcitizen.setText("");
                textdatebirth.setText("");textplacebirth.setText("");
                textreligion.setText("");textcontact.setText("");
                textemail.setText("");textpwd.setText("");textffname.setText("");
                textfgname.setText("");textfmname.setText("");textfext.setText("");
                textmfname.setText("");textmgname.setText("");
                textmmname.setText("");textmext.setText("");
                textparentcontact.setText("");
                searchb.setText("Search by ID number or familyname");
                textlrn.requestFocus();
                /*if(same.equals("same")) 
                {  
                    JOptionPane.showMessageDialog(null,"Student No. :"+id1+" is already use by \n"+name1+","+name2+","+name3+""," Message",JOptionPane.INFORMATION_MESSAGE);
                    combobox.setSelectedItem("SELECT");combobox1.setSelectedItem("SELECT");
                    textlrn.setText("");textid.setText("");
                    textschoolyear.setText("");textschoolyear1.setText("");
                    textfamilyname.setText("");textgivenname.setText(""); 
                    textmiddlename.setText("");textstudext.setText("");
                    textgender.setText("");textbrgy.setText("");
                    textctmun.setText("");textprov.setText("");
                    textzip.setText("");textcitizen.setText("");
                    textdatebirth.setText("");textplacebirth.setText("");
                    textreligion.setText("");textcontact.setText("");
                    textemail.setText("");textpwd.setText("");textffname.setText("");
                    textfgname.setText("");textfmname.setText("");textfext.setText("");
                    textmfname.setText("");textmgname.setText("");
                    textmmname.setText("");textmext.setText("");
                    textparentcontact.setText("");textschool1.setText("");
                    textschool2.setText("");textschool3.setText("");
                    textschool4.setText("");textsearchb.setText("");  
                    textlrn.requestFocus();                  
                }
                else if(same.equals("same1"))
                {
                    JOptionPane.showMessageDialog(null,"Student "+name1+","+name2+","+name3+"\n with student no. "+id1+" already in the records",
                    " Message",JOptionPane.INFORMATION_MESSAGE);
                    combobox.setSelectedItem("SELECT");combobox1.setSelectedItem("SELECT");                              
                    textlrn.setText("");textid.setText("");
                    textschoolyear.setText("");textschoolyear1.setText("");
                    textfamilyname.setText("");textgivenname.setText(""); 
                    textmiddlename.setText("");textstudext.setText("");
                    textgender.setText("");textbrgy.setText("");
                    textctmun.setText("");textprov.setText("");
                    textzip.setText("");textcitizen.setText("");
                    textdatebirth.setText("");textplacebirth.setText("");
                    textreligion.setText("");textcontact.setText("");
                    textemail.setText("");textpwd.setText("");textffname.setText("");
                    textfgname.setText("");textfmname.setText("");textfext.setText("");
                    textmfname.setText("");textmgname.setText("");
                    textmmname.setText("");textmext.setText("");
                    textparentcontact.setText("");textschool1.setText("");
                    textschool2.setText("");textschool3.setText("");
                    textschool4.setText("");textsearchb.setText("");  
                    textlrn.requestFocus();
                }
                else if(same.equals("correct"))
                {
                    JOptionPane.showMessageDialog(null,"Student record save"," Message",JOptionPane.INFORMATION_MESSAGE);
                    combobox.setSelectedItem("SELECT");combobox1.setSelectedItem("SELECT");
                    textlrn.setText("");textid.setText("");
                    textschoolyear.setText("");textschoolyear1.setText("");
                    textfamilyname.setText("");textgivenname.setText(""); 
                    textmiddlename.setText("");textstudext.setText("");
                    textgender.setText("");textbrgy.setText("");
                    textctmun.setText("");textprov.setText("");
                    textzip.setText("");textcitizen.setText("");
                    textdatebirth.setText("");textplacebirth.setText("");
                    textreligion.setText("");textcontact.setText("");
                    textemail.setText("");textpwd.setText("");textffname.setText("");
                    textfgname.setText("");textfmname.setText("");textfext.setText("");
                    textmfname.setText("");textmgname.setText("");
                    textmmname.setText("");textmext.setText("");
                    textparentcontact.setText("");textschool1.setText("");
                    textschool2.setText("");textschool3.setText("");
                    textschool4.setText("");textsearchb.setText("");  
                    textlrn.requestFocus();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Lacking important information\n"+"can not save record"," Message",JOptionPane.INFORMATION_MESSAGE);
                }*/
            }
        }); //save button
        
        ////seach button 
        search.addActionListener(new ActionListener(){               
            public void actionPerformed(ActionEvent ae)
            {
                String  read;
                int     a=0,b=1,c=2,d=3,ee=4,f=5,g=6,h=7,i=8,j=9,k=10,
                        l=11,m=12,n=13,o=14,p=15,q=16,r=17,s=18,t=19,u=20,                 
                        v=21,w=22,x=23,y=24,z=25,az=26,bz=27,cz=28,dz=29,ez=30,                  
                        countf=0,index=0;
                try{
                    BufferedReader out2=new BufferedReader(new FileReader(filename));  
                    if(!out2.ready())
                    {
                        throw new IOException();
                    }
                    while((read=out2.readLine())!=null)
                    {
                        if(countf==a) 
                        {
                            lrna.add(read);
                            countf++;                                          
                        }  
                        else if(countf==b)
                        {
                            ida.add(read);
                            countf++;                                       
                        }
                        else if(countf==c)
                        {
                            schyra.add(read); 
                            countf++;                                       
                        } 
                        else if(countf==d) 
                        {
                            schyr1a.add(read);
                            countf++;                                       
                        } 
                        else if(countf==ee)
                        {
                            csyra.add(read); 
                            countf++;                                       
                        }
                        else if(countf==f)
                        {
                            fnamea.add(read);
                            countf++;                                       
                        } 
                        else if(countf==g)
                        {
                            gnamea.add(read);
                            countf++;                                       
                        } 
                        else if(countf==h)
                        {
                            mnamea.add(read); 
                            countf++;                                      
                        }  
                        else if(countf==i)
                        {
                            studexta.add(read); 
                            countf++;                                      
                        } 
                        else if(countf==j)
                        {
                            gena.add(read);
                            countf++;                                      
                        }
                        else if(countf==k)
                        {
                            addra.add(read); 
                            countf++;                                      
                        }
                        else if(countf==l) 
                        {
                            addrcitya.add(read);
                            countf++;                                      
                        }
                        else if(countf==m) 
                        {
                            addrprova.add(read); 
                            countf++;                                      
                        }
                        else if(countf==n)
                        {
                            addrzipa.add(read); 
                            countf++;                                      
                        }
                        else if(countf==o)
                        {
                            ctza.add(read); 
                            countf++;                                      
                        }
                        else if(countf==p)
                        {
                            dateba.add(read); 
                            countf++;                                      
                        }  
                        else if(countf==q)
                        {
                            placeba.add(read); 
                            countf++;                                       
                        }
                        else if(countf==r)
                        {
                            rela.add(read);
                            countf++;                                       
                        }
                        else if(countf==s)
                        {
                            civila.add(read);
                            countf++;                                      
                        }
                        else if(countf==t)
                        {
                            contca.add(read); 
                            countf++;                                      
                        }
                        else if(countf==u)
                        {
                            emaila.add(read);
                            countf++;                                      
                        }
                        else if(countf==v)
                        {
                            pwda.add(read);
                            countf++;                                       
                        }
                        else if(countf==w)
                        {
                            fathera.add(read); 
                            countf++;                                     
                        }
                        else if(countf==x)
                        {
                            fatherga.add(read);
                            countf++;                                       
                        }
                        else if(countf==y)
                        {
                            fatherma.add(read);
                            countf++;                                      
                        }
                        else if(countf==z)
                        {
                            fatherexta.add(read);
                            countf++;                                       
                        }
                        else if(countf==az)
                        {
                            mothera.add(read); 
                            countf++;                                      
                        }
                        else if(countf==bz)
                        {
                            motherga.add(read);
                            countf++;                                       
                        }
                        else if(countf==cz)
                        {
                            motherma.add(read); 
                            countf++;                                      
                        }
                        else if(countf==dz)
                        {
                            motherexta.add(read); 
                            countf++;                                      
                        }
                        else if(countf==ez)
                        {
                            pcontca.add(read);
                            countf++;
                            index++;
                        }
                        else{
                            countf++;a=a+31;b=b+31;c=c+31;d=d+31;ee=ee+31;f=f+31;g=g+31;
                            h=h+31;i=i+31;j=j+31;k=k+31;l=l+31;m=m+31;n=n+31;o=o+31;
                            p=p+31;q=q+31;r=r+31;s=s+31;t=t+31;u=u+31;v=v+31;w=w+31;                                                                             
                            x=x+31;y=y+31;z=z+31;az=az+31;bz=bz+31;cz=cz+31;dz=dz+31;
                            ez=ez+31;                                                                                                                                                                                           
                        }                  
                    }
                    out2.close();             
                }catch(IOException e){ 
                    java.lang.System.out.println(e);  
                }
                String search1 = searchb.getText();
                    int cnt = 1,fnamesize = 0,grdtemp=0,found=0;  
                    fnamesize = fnamea.size();  
                    fnamesize = fnamesize + 1;
                    java.lang.System.out.println("Size of file : "+fnamea.size());
                    java.lang.System.out.println("Size of file + 1 : "+fnamesize);
                    for(int grd=0;grd<fnamea.size();grd++)
                    {
                        if(search1.equals(fnamea.get(grd).replaceAll("\\s","")))  
                        {
                            found = 1; 
                            grdtemp = grd;
                            grd = fnamea.size();
                        }
                        else if(cnt == fnamea.size())
                        {
                            found = 2;
                            grd = fnamea.size();
                        }
                        else
                        {
                            cnt++;
                        }
                    }
                    if(found == 1)
                    {
                        textlrn.setText(lrna.get(grdtemp));
                            textid.setText(ida.get(grdtemp)); 
                            textschoolyear.setText(schyra.get(grdtemp));
                            textschoolyear1.setText(schyr1a.get(grdtemp));
                            combobox.setSelectedItem(csyra.get(grdtemp));
                            textfamilyname.setText(fnamea.get(grdtemp));  
                            textgivenname.setText(gnamea.get(grdtemp)); 
                            textmiddlename.setText(mnamea.get(grdtemp)); 
                            textstudext.setText(studexta.get(grdtemp));
                            textgender.setText(gena.get(grdtemp));
                            textbrgy.setText(addra.get(grdtemp));
                            textctmun.setText(addrcitya.get(grdtemp));
                            textprov.setText(addrprova.get(grdtemp));
                            textzip.setText(addrzipa.get(grdtemp)); 
                            textcitizen.setText(ctza.get(grdtemp));
                            textdatebirth.setText(dateba.get(grdtemp));
                            textplacebirth.setText(placeba.get(grdtemp));
                            textreligion.setText(rela.get(grdtemp));
                            combobox1.setSelectedItem(civila.get(grdtemp));
                            textcontact.setText(contca.get(grdtemp));
                            textemail.setText(emaila.get(grdtemp));
                            textpwd.setText(pwda.get(grdtemp));
                            textffname.setText(fathera.get(grdtemp));
                            textfgname.setText(fatherga.get(grdtemp));
                            textfmname.setText(fatherma.get(grdtemp));
                            textfext.setText(fatherexta.get(grdtemp));
                            textmfname.setText(mothera.get(grdtemp));
                            textmgname.setText(motherga.get(grdtemp));
                            textmmname.setText(motherma.get(grdtemp));
                            textmext.setText(motherexta.get(grdtemp)); 
                            textparentcontact.setText(pcontca.get(grdtemp));
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Your search is not found\n"+
                            "Try again check spelling"," Message",JOptionPane.INFORMATION_MESSAGE);
                            searchb.setText("Search by ID number or familyname");
                    }
                    fnamea.clear();gnamea.clear();
            }                
        });         
        
        searchb.addKeyListener(new KeyAdapter() { 
            public void keyPressed(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_ENTER)
                {   java.lang.System.out.println("Search using enter key ");
                    String  read;
                    int     a=0,b=1,c=2,d=3,ee=4,f=5,g=6,h=7,i=8,j=9,k=10,
                            l=11,m=12,n=13,o=14,p=15,q=16,r=17,s=18,t=19,u=20,                 
                            v=21,w=22,x=23,y=24,z=25,az=26,bz=27,cz=28,dz=29,ez=30,                  
                            countf=0,index=0;
                    try{
                        BufferedReader out2=new BufferedReader(new FileReader(filename));  
                        if(!out2.ready())
                        {
                            throw new IOException();
                        }
                        while((read=out2.readLine())!=null)
                        {
                            if(countf==a) 
                            {
                                lrna.add(read);
                                countf++;                                          
                            }  
                            else if(countf==b)
                            {
                                ida.add(read);
                                countf++;                                       
                            }
                            else if(countf==c)
                            {
                                schyra.add(read); 
                                countf++;                                       
                            } 
                            else if(countf==d) 
                            {
                                schyr1a.add(read);
                                countf++;                                       
                            } 
                            else if(countf==ee)
                            {
                                csyra.add(read); 
                                countf++;                                       
                            }
                            else if(countf==f)
                            {
                                fnamea.add(read);
                                countf++;                                       
                            } 
                            else if(countf==g)
                            {
                                gnamea.add(read);
                                countf++;                                       
                            } 
                            else if(countf==h)
                            {
                                mnamea.add(read); 
                                countf++;                                      
                            }  
                            else if(countf==i)
                            {
                                studexta.add(read); 
                                countf++;                                      
                            } 
                            else if(countf==j)
                            {
                                gena.add(read);
                                countf++;                                      
                            }
                            else if(countf==k)
                            {
                                addra.add(read); 
                                countf++;                                      
                            }
                            else if(countf==l) 
                            {
                                addrcitya.add(read);
                                countf++;                                      
                            }
                            else if(countf==m) 
                            {
                                addrprova.add(read); 
                                countf++;                                      
                            }
                            else if(countf==n)
                            {
                                addrzipa.add(read); 
                                countf++;                                      
                            }
                            else if(countf==o)
                            { 
                                ctza.add(read); 
                                countf++;                                      
                            }
                            else if(countf==p)
                            {
                                dateba.add(read); 
                                countf++;                                      
                            }   
                            else if(countf==q)
                            {
                                placeba.add(read); 
                                countf++;                                       
                            }
                            else if(countf==r)
                            {
                                rela.add(read);
                                countf++;                                       
                            }
                            else if(countf==s)
                            {
                                civila.add(read);
                                countf++;                                      
                            }
                            else if(countf==t)
                            {
                                contca.add(read); 
                                countf++;                                      
                            }
                            else if(countf==u)
                            {
                                emaila.add(read);
                                countf++;                                      
                            }
                            else if(countf==v)
                            {
                                pwda.add(read);
                                countf++;                                       
                            }
                            else if(countf==w)
                            {
                                fathera.add(read); 
                                countf++;                                     
                            }
                            else if(countf==x)
                            {
                                fatherga.add(read);
                                countf++;                                       
                            }
                            else if(countf==y)
                            {
                                fatherma.add(read);
                                countf++;                                      
                            }
                            else if(countf==z)
                            {
                                fatherexta.add(read);
                                countf++;                                       
                            }
                            else if(countf==az)
                            {
                                mothera.add(read); 
                                countf++;                                      
                            }
                            else if(countf==bz)
                            {
                                motherga.add(read);
                                countf++;                                       
                            }
                            else if(countf==cz)
                            {
                                motherma.add(read); 
                                countf++;                                      
                            }
                            else if(countf==dz)
                            {
                                motherexta.add(read); 
                                countf++;                                      
                            }
                            else if(countf==ez)
                            {
                                pcontca.add(read);
                                countf++;
                                index++;
                            }
                            else{
                                countf++;a=a+31;b=b+31;c=c+31;d=d+31;ee=ee+31;f=f+31;g=g+31;
                                h=h+31;i=i+31;j=j+31;k=k+31;l=l+31;m=m+31;n=n+31;o=o+31;
                                p=p+31;q=q+31;r=r+31;s=s+31;t=t+31;u=u+31;v=v+31;w=w+31;                                                                             
                                x=x+31;y=y+31;z=z+31;az=az+31;bz=bz+31;cz=cz+31;dz=dz+31;
                                ez=ez+31;                                                                                                                                                                                           
                            }                  
                        }
                        out2.close();             
                    }catch(IOException e){ 
                        java.lang.System.out.println(e);  
                    }
                    String search1 = searchb.getText();
                    int cnt = 1,fnamesize = 0,grdtemp=0,found=0;  
                    fnamesize = fnamea.size();  
                    fnamesize = fnamesize + 1;
                    java.lang.System.out.println("Size of file : "+fnamea.size());
                    java.lang.System.out.println("Size of file + 1 : "+fnamesize);
                    for(int grd=0;grd<fnamea.size();grd++)
                    {
                        if(search1.equals(fnamea.get(grd).replaceAll("\\s","")))  
                        {
                            found = 1; 
                            grdtemp = grd;
                            grd = fnamea.size();
                        }
                        else if(cnt == fnamea.size())
                        {
                            found = 2;
                            grd = fnamea.size();
                        }
                        else
                        {
                            cnt++;
                        }
                    }
                    if(found == 1)
                    {
                        textlrn.setText(lrna.get(grdtemp));
                            textid.setText(ida.get(grdtemp)); 
                            textschoolyear.setText(schyra.get(grdtemp));
                            textschoolyear1.setText(schyr1a.get(grdtemp));
                            combobox.setSelectedItem(csyra.get(grdtemp));
                            textfamilyname.setText(fnamea.get(grdtemp));  
                            textgivenname.setText(gnamea.get(grdtemp)); 
                            textmiddlename.setText(mnamea.get(grdtemp)); 
                            textstudext.setText(studexta.get(grdtemp));
                            textgender.setText(gena.get(grdtemp));
                            textbrgy.setText(addra.get(grdtemp));
                            textctmun.setText(addrcitya.get(grdtemp));
                            textprov.setText(addrprova.get(grdtemp));
                            textzip.setText(addrzipa.get(grdtemp)); 
                            textcitizen.setText(ctza.get(grdtemp));
                            textdatebirth.setText(dateba.get(grdtemp));
                            textplacebirth.setText(placeba.get(grdtemp));
                            textreligion.setText(rela.get(grdtemp));
                            combobox1.setSelectedItem(civila.get(grdtemp));
                            textcontact.setText(contca.get(grdtemp));
                            textemail.setText(emaila.get(grdtemp));
                            textpwd.setText(pwda.get(grdtemp));
                            textffname.setText(fathera.get(grdtemp));
                            textfgname.setText(fatherga.get(grdtemp));
                            textfmname.setText(fatherma.get(grdtemp));
                            textfext.setText(fatherexta.get(grdtemp));
                            textmfname.setText(mothera.get(grdtemp));
                            textmgname.setText(motherga.get(grdtemp));
                            textmmname.setText(motherma.get(grdtemp));
                            textmext.setText(motherexta.get(grdtemp)); 
                            textparentcontact.setText(pcontca.get(grdtemp));
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Your search is not found\n"+
                            "Try again check spelling"," Message",JOptionPane.INFORMATION_MESSAGE);
                            searchb.setText("Search by ID number or familyname");
                    }
                    fnamea.clear();gnamea.clear();
                }
            }
        });
                
                
                
                
                
                /*int key = evt.getKeyCode();
                if (key == KeyEvent.VK_ENTER)
                {
                    String    search="",
                              lrns="",ids="",schyrs="",schyr1s="",csyrs="",fnames="",gnames="",
                              mnames="",studexts="",gens="",addrs="",addrcitys="",addrprovs="",
                              addrzips="",ctzs="",datebs="",placebs="",rels="",civils="",                  
                              contcs="",emails="",pwds="",fathers="",fathergs="",fatherms="",
                              fatherexts="",mothers="",mothergs="",motherms="",           
                              motherexts="",pcontcs="",schl1s="",schl2s="", schl3s="",        
                              schl4s="";
                    //try
                    //{
                    String  gname = "",mname = "",bdate = "";
                    int     find = 0,cnt = 0,index1 = 0,stop = 0;
                    //while(stop == 1)
                    //{
                        search = textsearchb.getText(); 
                        for(int i=0;i<fnamea.size();i++) 
                        {
                            if(search.equals(fnamea.get(i))) 
                            {
                                find++;
                            }
                            else if(search.equals(""))
                            {
                                JOptionPane.showMessageDialog(null, "You have not enter anything \n"+
                                "in the search box","  Message ",JOptionPane.INFORMATION_MESSAGE);
                                i = fnamea.size();
                                textsearchb.setText("");
                            }
                            else if(cnt == fnamea.size()-1)
                            {
                                find = 0;
                            }
                            else
                            {
                                cnt++;
                            }
                        }
                    //}
                        if(find == 1)
                        {                          
                            if(lrns.equals("N")) 
                                {
                                    textlrn.setText("");
                                }
                                else
                                {
                                    textlrn.setText(lrns);
                                }
                                if(ids.equals("N"))
                                {
                                    textid.setText("");
                                }
                                else
                                {
                                    textid.setText(ids);
                                }
                                if(schyrs.equals("N"))
                                {
                                    textschoolyear.setText("");
                                }
                                else
                                {
                                    textschoolyear.setText(schyrs);
                                } 
                                if(schyr1s.equals("N"))
                                {
                                    textschoolyear1.setText("");
                                }
                                else
                                {
                                    textschoolyear1.setText(schyr1s);
                                } 
                                if(csyrs.equals("SELECT"))
                                {
                                    combobox.setSelectedItem("SELECT");
                                }
                                else
                                {
                                    combobox.setSelectedItem(csyrs);
                                }
                                if(fnames.equals("N"))
                                {
                                    textfamilyname.setText("");
                                }
                                else
                                {
                                    textfamilyname.setText(fnames);
                                } 
                                if(gnames.equals("N"))
                                {
                                    textgivenname.setText("");
                                }
                                else
                                {
                                    textgivenname.setText(gnames);
                                } 
                                if(mnames.equals("N"))
                                {
                                    textmiddlename.setText("");
                                }
                                else
                                {
                                    textmiddlename.setText(mnames);
                                } 
                                if(studexts.equals("N"))
                                {
                                    textstudext.setText("");
                                }
                                else
                                {
                                    textstudext.setText(studexts);
                                }  
                                if(gens.equals("N"))
                                {
                                    textgender.setText("");
                                }
                                else
                                {
                                    textgender.setText(gens);
                                }
                                if(addrs.equals("N"))
                                {
                                    textbrgy.setText("");
                                }
                                else
                                {
                                    textbrgy.setText(addrs);
                                }
                                if(addrcitys.equals("N"))
                                {
                                    textctmun.setText("");
                                }
                                else
                                {
                                    textctmun.setText(addrcitys);
                                }
                                if(addrprovs.equals("N"))
                                {
                                    textprov.setText("");
                                }
                                else
                                {
                                    textprov.setText(addrprovs);
                                } 
                                if(addrzips.equals("N"))
                                {
                                    textzip.setText("");
                                }
                                else
                                {
                                    textzip.setText(addrzips);
                                }  
                                if(ctzs.equals("N"))
                                {
                                    textcitizen.setText("");
                                }
                                else
                                {
                                    textcitizen.setText(ctzs);
                                }
                                if(datebs.equals("N"))
                                {
                                    textdatebirth.setText("");
                                }
                                else
                                {
                                    textdatebirth.setText(datebs);
                                }
                                if(placebs.equals("N"))
                                {
                                    textplacebirth.setText("");
                                }
                                else
                                {
                                    textplacebirth.setText(placebs);
                                }
                                if(rels.equals("N"))
                                {
                                    textreligion.setText("");
                                }
                                else
                                {
                                    textreligion.setText(rels);
                                }
                                if(civils.equals("SELECT"))
                                {
                                    combobox1.setSelectedItem("SELECT");
                                }
                                else
                                {
                                    combobox1.setSelectedItem(civils);
                                }
                                if(contcs.equals("N"))
                                {
                                    textcontact.setText("");
                                }
                                else
                                {
                                    textcontact.setText(contcs);
                                }  
                                if(emails.equals("N"))
                                {
                                    textemail.setText("");
                                }
                                else
                                {
                                    textemail.setText(emails);
                                }
                                if(pwds.equals("N"))
                                {
                                    textpwd.setText(""); 
                                }
                                else
                                {
                                    textpwd.setText(pwds);
                                }
                                if(fathers.equals("N"))
                                {
                                    textffname.setText("");
                                }
                                else
                                {
                                    textffname.setText(fathers);
                                }
                                if(fathergs.equals("N"))
                                {
                                    textfgname.setText("");
                                }
                                else
                                {
                                    textfgname.setText(fathergs);
                                }
                                if(fatherms.equals("N"))
                                {
                                    textfmname.setText("");
                                }
                                else
                                {
                                    textfmname.setText(fatherms);
                                } 
                                if(fatherexts.equals("N"))
                                {
                                    textfext.setText("");
                                }
                                else
                                {
                                    textfext.setText(fatherexts);
                                }
                                if(mothers.equals("N"))
                                {
                                    textmfname.setText("");
                                }
                                else
                                {
                                    textmfname.setText(mothers);
                                }
                                if(mothergs.equals("N"))
                                {
                                    textmgname.setText("");
                                }
                                else
                                {
                                    textmgname.setText(mothergs);
                                }
                                if(motherms.equals("N"))
                                {
                                    textmmname.setText("");
                                }
                                else
                                {
                                    textmmname.setText(motherms);
                                }
                                if(motherexts.equals("N"))
                                {
                                    textmext.setText("");
                                }
                                else
                                {
                                    textmext.setText(motherexts);
                                }
                                if(pcontcs.equals("N"))
                                {
                                    textparentcontact.setText("");
                                }
                                else
                                {
                                    textparentcontact.setText(pcontcs);
                                }
                                if(schl1s.equals("N"))
                                {
                                    textschool1.setText("");
                                }
                                else
                                {
                                    textschool1.setText(schl1s);
                                }                           
                                if(schl2s.equals("N"))
                                {
                                    textschool2.setText("");
                                }
                                else
                                {
                                    textschool2.setText(schl2s);
                                }
                                if(schl3s.equals("N"))
                                {
                                    textschool3.setText("");
                                }
                                else
                                {
                                    textschool3.setText(schl3s);
                                }
                                if(schl4s.equals("N"))
                                {
                                    textschool4.setText("");
                                }
                                else
                                {
                                    textschool4.setText(schl4s);
                                }                                                        
                            break;
                            case "gname":                           
                            gname=JOptionPane.showInputDialog(null,"Enter Student Given Name","2 Family Name",JOptionPane.INFORMATION_MESSAGE);                             
                            if(gname != null )
                            {                                                                                           
                                if(search.equals("wrong"))
                                {
                                    JOptionPane.showMessageDialog(null, "Incorrect given name: \n "+"\nCheck Spelling type again the family name","  Message ",JOptionPane.INFORMATION_MESSAGE);
                                    stop=1;
                                    //textsearchb.setText("");
                                    //textlrn.setText("");textid.setText("");
                                    //textschoolyear.setText("");textschoolyear1.setText("");
                                    //textfamilyname.setText("");textgivenname.setText(""); 
                                    //textmiddlename.setText("");textstudext.setText("");
                                    //textgender.setText("");textbrgy.setText("");
                                    //textctmun.setText("");textprov.setText("");
                                    //textzip.setText("");textcitizen.setText("");
                                    //textdatebirth.setText("");textplacebirth.setText("");
                                    //textreligion.setText("");textcontact.setText("");
                                    //textemail.setText("");textpwd.setText("");textffname.setText("");
                                    //textfgname.setText("");textfmname.setText("");textfext.setText("");
                                    //textmfname.setText("");textmgname.setText("");
                                    //textmmname.setText("");textmext.setText("");
                                    //textparentcontact.setText("");textschool1.setText("N");
                                    //textschool2.setText("N");textschool3.setText("N");
                                    //textschool4.setText("N");textsearchb.setText("");
                                    //textsearchb.requestFocus();
                                }
                                else if(search.equals("find"))
                                {                                                                                      
                                    
                                    if(lrns.equals("N"))
                                    {
                                        textlrn.setText("");
                                    }
                                    else
                                    {
                                        textlrn.setText(lrns);
                                    }
                                    if(ids.equals("N"))
                                    {
                                        textid.setText("");
                                    }
                                    else
                                    {
                                        textid.setText(ids);
                                    }
                                    if(schyrs.equals("N"))
                                    {
                                        textschoolyear.setText("");
                                    }
                                    else
                                    {
                                        textschoolyear.setText(schyrs);
                                    }
                                    if(schyr1s.equals("N"))
                                    {
                                        textschoolyear1.setText("");
                                    }
                                    else
                                    {
                                        textschoolyear1.setText(schyr1s);
                                    }  
                                    if(csyrs.equals("SELECT"))
                                    {
                                        combobox.setSelectedItem("SELECT");
                                    }
                                    else
                                    {
                                        combobox.setSelectedItem(csyrs);
                                    } 
                                    if(fnames.equals("N"))
                                    {
                                        textfamilyname.setText("");
                                    }
                                    else
                                    {
                                        textfamilyname.setText(fnames);
                                    }
                                    if(gnames.equals("N"))
                                    {
                                        textgivenname.setText("");
                                    }
                                    else
                                    {
                                        textgivenname.setText(gnames);
                                    } 
                                    if(mnames.equals("N"))
                                    {
                                        textmiddlename.setText("");
                                    }
                                    else
                                    {
                                        textmiddlename.setText(mnames);
                                    } 
                                    if(studexts.equals("N"))
                                    {
                                        textstudext.setText("");
                                    }
                                    else
                                    {
                                        textstudext.setText(studexts);
                                    }
                                    if(gens.equals("N"))
                                    {
                                        textgender.setText("");
                                    }
                                    else
                                    {
                                        textgender.setText(gens);
                                    }
                                    if(addrs.equals("N"))
                                    {
                                        textbrgy.setText("");
                                    }
                                    else
                                    {
                                        textbrgy.setText(addrs);
                                    }
                                    if(addrcitys.equals("N"))
                                    {
                                        textctmun.setText("");
                                    }
                                    else
                                    {
                                        textctmun.setText(addrcitys);
                                    }
                                    if(addrprovs.equals("N"))
                                    {
                                        textprov.setText("");
                                    }
                                    else
                                    {
                                        textprov.setText(addrprovs);
                                    }
                                    if(addrzips.equals("N"))
                                    {
                                        textzip.setText("");
                                    }
                                    else
                                    {
                                        textzip.setText(addrzips);
                                    }
                                    if(ctzs.equals("N"))
                                    {
                                        textcitizen.setText("");
                                    }
                                    else
                                    {
                                        textcitizen.setText(ctzs);
                                    }
                                    if(datebs.equals("N"))
                                    {
                                        textdatebirth.setText("");
                                    }
                                    else
                                    {
                                        textdatebirth.setText(datebs);
                                    }
                                    if(placebs.equals("N"))
                                    {
                                        textplacebirth.setText("");
                                    }
                                    else
                                    {
                                        textplacebirth.setText(placebs);
                                    }
                                    if(rels.equals("N"))
                                    {
                                        textreligion.setText("");
                                    }
                                    else
                                    {
                                        textreligion.setText(rels);
                                    }
                                    if(civils.equals("SELECT"))
                                    {
                                        combobox1.setSelectedItem("SELECT");
                                    }
                                    else
                                    {
                                        combobox1.setSelectedItem(civils);
                                    }
                                    if(contcs.equals("N"))
                                    {
                                        textcontact.setText("");
                                    }
                                    else
                                    {
                                        textcontact.setText(contcs);
                                    }  
                                    if(emails.equals("N"))
                                    {
                                        textemail.setText("");
                                    }
                                    else
                                    {
                                        textemail.setText(emails);
                                    }
                                    if(pwds.equals("N"))
                                    {
                                        textpwd.setText(""); 
                                    }
                                    else
                                    {
                                        textpwd.setText(pwds);
                                    }
                                    if(fathers.equals("N"))
                                    {
                                        textffname.setText("");
                                    }
                                    else
                                    {
                                        textffname.setText(fathers);
                                    }
                                    if(fathergs.equals("N"))
                                    {
                                        textfgname.setText("");
                                    } 
                                    else
                                    {
                                        textfgname.setText(fathergs);
                                    }
                                    if(fatherms.equals("N"))
                                    {
                                        textfmname.setText("");
                                    }
                                    else
                                    {
                                        textfmname.setText(fatherms);
                                    }
                                    if(fatherexts.equals("N"))
                                    {
                                        textfext.setText("");
                                    }
                                    else
                                    {
                                        textfext.setText(fatherexts);
                                    }
                                    if(mothers.equals("N"))
                                    {
                                        textmfname.setText("");
                                    }
                                    else
                                    {
                                        textmfname.setText(mothers);
                                    }
                                    if(mothergs.equals("N"))
                                    {
                                        textmgname.setText("");
                                    }
                                    else
                                    {
                                        textmgname.setText(mothergs);
                                    }
                                    if(motherms.equals("N"))
                                    {
                                        textmmname.setText("");
                                    }
                                    else
                                    {
                                        textmmname.setText(motherms);
                                    }
                                    if(motherexts.equals("N"))
                                    {
                                        textmext.setText("");
                                    }
                                    else
                                    {
                                        textmext.setText(motherexts);
                                    }
                                    if(pcontcs.equals("N"))
                                    {
                                        textparentcontact.setText("");
                                    }
                                    else
                                    {
                                        textparentcontact.setText(pcontcs);
                                    }
                                    if(schl1s.equals("N"))
                                    {
                                        textschool1.setText("");
                                    }
                                    else
                                    {
                                        textschool1.setText(schl1s);
                                    }                           
                                    if(schl2s.equals("N"))
                                    {
                                        textschool2.setText("");
                                    }
                                    else
                                    {
                                        textschool2.setText(schl2s);
                                    }
                                    if(schl3s.equals("N"))
                                    {
                                        textschool3.setText("");
                                    }
                                    else
                                    {
                                        textschool3.setText(schl3s);
                                    }
                                    if(schl4s.equals("N"))
                                    {
                                        textschool4.setText("");
                                    }
                                    else
                                    { 
                                        textschool4.setText(schl4s);
                                    }                                                                                                    
                                }
                                else if(search.equals("mname")) 
                                {   
                                    System.out.println("IM HERE MNAME CLIENT");
                                    mname=JOptionPane.showInputDialog(null,"Enter Student Middle Name","2 Family Name",JOptionPane.INFORMATION_MESSAGE);                           
                                     
                                    if(search.equals("find"))
                                    {
                                        if(lrns.equals("N"))
                                        {
                                            textlrn.setText("");
                                        }
                                        else
                                        {
                                            textlrn.setText(lrns);
                                        }
                                        if(ids.equals("N"))
                                        {
                                            textid.setText("");
                                        }
                                        else
                                        {
                                            textid.setText(ids);
                                        }
                                        if(schyrs.equals("N"))
                                        {
                                            textschoolyear.setText("");
                                        }
                                        else
                                        {
                                            textschoolyear.setText(schyrs);
                                        }
                                        if(schyr1s.equals("N"))
                                        {
                                            textschoolyear1.setText("");
                                        }
                                        else
                                        {
                                            textschoolyear1.setText(schyr1s);
                                        }  
                                        if(csyrs.equals("SELECT"))
                                        {
                                            combobox.setSelectedItem("SELECT");
                                        }
                                        else
                                        {
                                            combobox.setSelectedItem(csyrs);
                                        } 
                                        if(fnames.equals("N"))
                                        {
                                            textfamilyname.setText("");
                                        }
                                        else
                                        {
                                            textfamilyname.setText(fnames);
                                        }
                                        if(gnames.equals("N"))
                                        {
                                            textgivenname.setText("");
                                        }
                                        else
                                        {
                                            textgivenname.setText(gnames);
                                        } 
                                        if(mnames.equals("N"))
                                        {
                                            textmiddlename.setText("");
                                        }
                                        else
                                        {
                                            textmiddlename.setText(mnames);
                                        } 
                                        if(studexts.equals("N"))
                                        {
                                            textstudext.setText("");
                                        }
                                        else
                                        {
                                            textstudext.setText(studexts);
                                        }
                                        if(gens.equals("N"))
                                        {
                                            textgender.setText("");
                                        }
                                        else
                                        {
                                            textgender.setText(gens);
                                        }
                                        if(addrs.equals("N"))
                                        {
                                            textbrgy.setText("");
                                        }
                                        else
                                        {
                                            textbrgy.setText(addrs);
                                        }
                                        if(addrcitys.equals("N"))
                                        {
                                            textctmun.setText("");
                                        }
                                        else
                                        {
                                            textctmun.setText(addrcitys);
                                        }
                                        if(addrprovs.equals("N"))
                                        {
                                            textprov.setText("");
                                        }
                                        else
                                        {
                                            textprov.setText(addrprovs);
                                        }
                                        if(addrzips.equals("N"))
                                        {
                                            textzip.setText("");
                                        }
                                        else
                                        {
                                            textzip.setText(addrzips);
                                        }
                                        if(ctzs.equals("N"))
                                        {
                                            textcitizen.setText("");
                                        }
                                        else
                                        {
                                            textcitizen.setText(ctzs);
                                        }
                                        if(datebs.equals("N"))
                                        {
                                            textdatebirth.setText("");
                                        }
                                        else
                                        {
                                            textdatebirth.setText(datebs);
                                        }
                                        if(placebs.equals("N"))
                                        {
                                            textplacebirth.setText("");
                                        }
                                        else
                                        {
                                            textplacebirth.setText(placebs);
                                        }
                                        if(rels.equals("N"))
                                        {
                                            textreligion.setText("");
                                        }
                                        else
                                        {
                                            textreligion.setText(rels);
                                        }
                                        if(civils.equals("SELECT"))
                                        {
                                            combobox1.setSelectedItem("SELECT");
                                        }
                                        else
                                        {
                                            combobox1.setSelectedItem(civils);
                                        }
                                        if(contcs.equals("N"))
                                        {
                                            textcontact.setText("");
                                        }
                                        else
                                        {
                                            textcontact.setText(contcs);
                                        }  
                                        if(emails.equals("N"))
                                        {
                                            textemail.setText("");
                                        }
                                        else
                                        {
                                            textemail.setText(emails);
                                        }
                                        if(pwds.equals("N"))
                                        {
                                            textpwd.setText(""); 
                                        }
                                        else
                                        {
                                            textpwd.setText(pwds);
                                        }
                                        if(fathers.equals("N"))
                                        {
                                            textffname.setText("");
                                        } 
                                        else
                                        {
                                            textffname.setText(fathers);
                                        }
                                        if(fathergs.equals("N"))
                                        {
                                            textfgname.setText("");
                                        } 
                                        else
                                        {
                                            textfgname.setText(fathergs);
                                        }
                                        if(fatherms.equals("N"))
                                        {
                                            textfmname.setText("");
                                        }
                                        else
                                        {
                                            textfmname.setText(fatherms);
                                        }
                                        if(fatherexts.equals("N"))
                                        {
                                            textfext.setText("");
                                        }
                                        else
                                        {
                                            textfext.setText(fatherexts);
                                        }
                                        if(mothers.equals("N"))
                                        {
                                            textmfname.setText("");
                                        }
                                        else
                                        {
                                            textmfname.setText(mothers);
                                        }
                                        if(mothergs.equals("N"))
                                        {
                                            textmgname.setText("");
                                        }
                                        else
                                        {
                                            textmgname.setText(mothergs);
                                        }
                                        if(motherms.equals("N"))
                                        {
                                            textmmname.setText("");
                                        }   
                                        else
                                        {
                                            textmmname.setText(motherms);
                                        }
                                        if(motherexts.equals("N"))
                                        {
                                            textmext.setText("");
                                        }
                                        else
                                        {
                                            textmext.setText(motherexts);
                                        }    
                                        if(pcontcs.equals("N"))
                                        {
                                            textparentcontact.setText("");
                                        }
                                        else
                                        {
                                            textparentcontact.setText(pcontcs);
                                        }
                                        if(schl1s.equals("N"))
                                        {
                                            textschool1.setText("");
                                        }  
                                        else
                                        {
                                            textschool1.setText(schl1s);
                                        }                           
                                        if(schl2s.equals("N"))
                                        {
                                            textschool2.setText("");
                                        }
                                        else
                                        {
                                            textschool2.setText(schl2s);
                                        }
                                        if(schl3s.equals("N"))
                                        {
                                            textschool3.setText("");
                                        }
                                        else
                                        {
                                            textschool3.setText(schl3s);
                                        }
                                        if(schl4s.equals("N"))
                                        {
                                            textschool4.setText("");
                                        }
                                        else
                                        {
                                            textschool4.setText(schl4s);
                                        }                                                                                                             
                                    } 
                                    else
                                    { 
                                        JOptionPane.showMessageDialog(null, "Cannot Find :  "+searchup+", "+gname+" "+"\nCheck Spelling","  Message ",JOptionPane.INFORMATION_MESSAGE);                                        
                                        textsearch1a.setText("");
                                    }
                                }
                            }   
                            else
                            {
                                System.out.println("SEARCH CANCEL ---"+gname);                                
                                JOptionPane.showMessageDialog(null,"Search cancel","Message ",JOptionPane.INFORMATION_MESSAGE);
                                gname = "null"; 
                                textsearchb.setText("");
                                textsearchb.requestFocus();                                 
                            }
                            break; 
                            case "wrong1":
                            JOptionPane.showMessageDialog(null, "You have not enter anything \n"+"in the search box","  Message ",JOptionPane.INFORMATION_MESSAGE);
                            break;
                            default:
                            JOptionPane.showMessageDialog(null, "Cannot Find : \n"+searchup+"\nCheck Spelling or Student No.","  Message ",JOptionPane.INFORMATION_MESSAGE);                           
                            textsearchb.setText("");                           
                            textsearchb.requestFocus();                            
                            stop=1;
                            break;                            
                        } // SWITCH CASE           
                    //}
                    //catch(IOException i)
                    //{
                    //    i.printStackTrace();             
                    //}                     
                }
            }
        });////search button*/
        
        
      
        /*buttona.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent ae)   
            { 
                String    searchup="",searchval="",
                          lrns="",ids="",schyrs="",schyr1s="",csyrs="",fnames="",gnames="",
                          mnames="",studexts="",gens="",addrs="",addrcitys="",addrprovs="",
                          addrzips="",ctzs="",datebs="",placebs="",rels="",civils="",                  
                          contcs="",emails="",pwds="",fathers="",fathergs="",fatherms="",
                          fatherexts="",mothers="",mothergs="",motherms="",           
                          motherexts="",pcontcs="",schl1s="",schl2s="", schl3s="",        
                          schl4s="";
                try
                {                
                    searchup=textsearchb.getText();                                   
                    String gname="",mname="",bdate="",search;                  
                    switch(searchval)
                    {                        
                        case "find":                       
                            lrns=clientinput.readUTF(); 
                            ids=clientinput.readUTF();
                            schyrs=clientinput.readUTF();
                            schyr1s=clientinput.readUTF();
                            csyrs=clientinput.readUTF();
                            fnames=clientinput.readUTF(); 
                            gnames=clientinput.readUTF();
                            mnames=clientinput.readUTF();
                            studexts=clientinput.readUTF();
                            gens=clientinput.readUTF();
                            addrs=clientinput.readUTF();
                            addrcitys=clientinput.readUTF(); 
                            addrprovs=clientinput.readUTF(); 
                            addrzips=clientinput.readUTF();
                            ctzs=clientinput.readUTF();
                            datebs=clientinput.readUTF();
                            placebs=clientinput.readUTF();
                            rels=clientinput.readUTF();
                            civils=clientinput.readUTF();
                            contcs=clientinput.readUTF();
                            emails=clientinput.readUTF();
                            pwds=clientinput.readUTF();
                            fathers=clientinput.readUTF();
                            fathergs=clientinput.readUTF();
                            fatherms=clientinput.readUTF();
                            fatherexts=clientinput.readUTF();
                            mothers=clientinput.readUTF();
                            mothergs=clientinput.readUTF();
                            motherms=clientinput.readUTF();
                            motherexts=clientinput.readUTF();
                            pcontcs=clientinput.readUTF();                            
                            schl1s=clientinput.readUTF();
                            schl2s=clientinput.readUTF();
                            schl3s=clientinput.readUTF();
                            schl4s=clientinput.readUTF();                            
                            if(lrns.equals("N"))
                            {
                                textlrn.setText("");
                            }
                            else
                            {
                                textlrn.setText(lrns);
                            }
                            if(ids.equals("N"))
                            {
                                textid.setText("");
                            }
                            else
                            {
                                textid.setText(ids);
                            }
                            if(schyrs.equals("N"))
                            {
                                textschoolyear.setText("");
                            }
                            else
                            {
                                textschoolyear.setText(schyrs);
                            }
                            if(schyr1s.equals("N"))
                            {
                                textschoolyear1.setText("");
                            }
                            else
                            {
                                textschoolyear1.setText(schyr1s);
                            } 
                            if(csyrs.equals("SELECT"))
                            {
                                combobox.setSelectedItem("SELECT");
                            }
                            else
                            {
                                combobox.setSelectedItem(csyrs);
                            }
                            if(fnames.equals("N"))
                            {
                                textfamilyname.setText("");
                            }
                            else
                            {
                                textfamilyname.setText(fnames);
                            }
                            if(gnames.equals("N"))
                            {
                                textgivenname.setText("");
                            }
                            else
                            {
                                textgivenname.setText(gnames);
                            } 
                            if(mnames.equals("N"))
                            {
                                textmiddlename.setText("");
                            }
                            else
                            {
                                textmiddlename.setText(mnames);
                            } 
                            if(studexts.equals("N"))
                            {
                                textstudext.setText("");
                            }
                            else
                            {
                                textstudext.setText(studexts);
                            }
                            if(gens.equals("N"))
                            {
                                textgender.setText("");
                            }
                            else
                            {
                                textgender.setText(gens);
                            }
                            if(addrs.equals("N"))
                            {
                                textbrgy.setText("");
                            }
                            else
                            {
                                textbrgy.setText(addrs);
                            }
                            if(addrcitys.equals("N"))
                            {
                                textctmun.setText("");
                            }
                            else
                            {
                                textctmun.setText(addrcitys);
                            }
                            if(addrprovs.equals("N"))
                            {  
                                textprov.setText("");
                            }
                            else
                            {
                                textprov.setText(addrprovs);
                            }
                            if(addrzips.equals("N"))
                            {
                                textzip.setText("");
                            }
                            else
                            {
                                textzip.setText(addrzips);
                            }
                            if(ctzs.equals("N"))
                            {
                                textcitizen.setText("");
                            }
                            else
                            {
                                textcitizen.setText(ctzs);
                            }
                            if(datebs.equals("N"))
                            {
                                textdatebirth.setText("");
                            }
                            else
                            {
                                textdatebirth.setText(datebs);
                            }
                            if(placebs.equals("N"))
                            {
                                textplacebirth.setText("");
                            }
                            else
                            {
                                textplacebirth.setText(placebs);
                            }
                            if(rels.equals("N"))
                            {
                                textreligion.setText("");
                            }
                            else
                            {
                                textreligion.setText(rels);
                            }
                            if(civils.equals("SELECT"))
                            {
                                combobox1.setSelectedItem("SELECT");
                            }
                            else
                            {
                                combobox1.setSelectedItem(civils);
                            }
                            if(contcs.equals("N"))
                            {   
                                textcontact.setText("");
                            }
                            else
                            {
                                 textcontact.setText(contcs);
                             }  
                            if(emails.equals("N"))
                            {
                                textemail.setText("");
                            }
                            else
                            {
                                textemail.setText(emails);
                            }
                            if(pwds.equals("N"))
                            {
                                textpwd.setText(""); 
                            }
                            else
                            {
                                textpwd.setText(pwds);
                            }
                            if(fathers.equals("N"))
                            {
                                textffname.setText("");
                            }
                            else
                            {
                                textffname.setText(fathers);
                            }
                            if(fathergs.equals("N"))
                            {
                                textfgname.setText("");
                            }
                            else
                            {
                                textfgname.setText(fathergs);
                            }
                            if(fatherms.equals("N"))
                            {
                                textfmname.setText("");
                            }
                            else
                            {
                                textfmname.setText(fatherms);
                            }
                            if(fatherexts.equals("N"))
                            {
                                textfext.setText("");
                            }
                            else
                            {
                                textfext.setText(fatherexts);
                            }
                            if(mothers.equals("N"))
                            { 
                                textmfname.setText("");
                            }
                            else
                            {
                                textmfname.setText(mothers);
                            }
                            if(mothergs.equals("N"))
                            {
                                 textmgname.setText("");
                            }
                            else
                            {
                                textmgname.setText(mothergs);
                            }
                            if(motherms.equals("N"))
                            {
                                textmmname.setText("");
                            }
                            else
                            {
                                textmmname.setText(motherms);
                            }
                            if(motherexts.equals("N"))
                            {
                                textmext.setText("");
                            }
                            else
                            {
                                textmext.setText(motherexts);
                            }
                            if(pcontcs.equals("N"))
                            {
                                textparentcontact.setText("");
                            }
                            else
                            {
                                textparentcontact.setText(pcontcs);
                            }
                            if(schl1s.equals("N"))
                            {
                                textschool1.setText("");
                            }
                            else
                            {
                                textschool1.setText(schl1s);
                            }                           
                            if(schl2s.equals("N"))
                            {
                                textschool2.setText("");
                            }
                            else
                            {
                                textschool2.setText(schl2s);
                            }
                            if(schl3s.equals("N"))
                            {
                                textschool3.setText("");
                            }
                            else
                            {
                                textschool3.setText(schl3s);
                            }
                            if(schl4s.equals("N"))
                            {
                                textschool4.setText("");
                            }
                            else
                            {
                                textschool4.setText(schl4s);
                            }                                                         
                        break;
                        case "gname":                           
                            gname=JOptionPane.showInputDialog(null,"Enter Student Given Name","2 Family Name",JOptionPane.INFORMATION_MESSAGE);                             
                            if(gname != null )
                            {                                
                                clientoutput.writeUTF(gname.toUpperCase().replaceAll("\\s","")); 
                                clientoutput.flush(); 
                                                             
                                search = clientinput.readUTF();
                                                                                            
                                if(search.equals("wrong"))
                                { 
                                    String hm=clientinput.readUTF();
                                    hm.toUpperCase();
                                    JOptionPane.showMessageDialog(null, "Incorrect given name: \n "+hm+"\nCheck Spelling type again the family name","  Message ",JOptionPane.INFORMATION_MESSAGE);
                                    stop=1;
                                    //textsearchb.setText("");
                                    //textlrn.setText("");textid.setText("");
                                    //textschoolyear.setText("");textschoolyear1.setText("");
                                    //textfamilyname.setText("");textgivenname.setText(""); 
                                    //textmiddlename.setText("");textstudext.setText("");
                                    //textgender.setText("");textbrgy.setText("");
                                    //textctmun.setText("");textprov.setText("");
                                    //textzip.setText("");textcitizen.setText("");
                                    //textdatebirth.setText("");textplacebirth.setText("");
                                    //textreligion.setText("");textcontact.setText("");
                                    //textemail.setText("");textpwd.setText("");textffname.setText("");
                                    //textfgname.setText("");textfmname.setText("");textfext.setText("");
                                    //textmfname.setText("");textmgname.setText("");
                                    //textmmname.setText("");textmext.setText("");
                                    //textparentcontact.setText("");textschool1.setText("N");
                                    //textschool2.setText("N");textschool3.setText("N");
                                    //textschool4.setText("N");textsearchb.setText("");
                                    //textsearchb.requestFocus();
                                }
                                else if(search.equals("find"))
                                {                                        
                                    lrns=clientinput.readUTF(); 
                                    ids=clientinput.readUTF();
                                    schyrs=clientinput.readUTF();
                                    schyr1s=clientinput.readUTF();
                                    csyrs=clientinput.readUTF();
                                    fnames=clientinput.readUTF(); 
                                    gnames=clientinput.readUTF();
                                    mnames=clientinput.readUTF();
                                    studexts=clientinput.readUTF();
                                    gens=clientinput.readUTF();
                                    addrs=clientinput.readUTF();
                                    addrcitys=clientinput.readUTF(); 
                                    addrprovs=clientinput.readUTF(); 
                                    addrzips=clientinput.readUTF();
                                    ctzs=clientinput.readUTF();
                                    datebs=clientinput.readUTF();
                                    placebs=clientinput.readUTF();
                                    rels=clientinput.readUTF();
                                    civils=clientinput.readUTF();
                                    contcs=clientinput.readUTF();
                                    emails=clientinput.readUTF();
                                    pwds=clientinput.readUTF();
                                    fathers=clientinput.readUTF();
                                    fathergs=clientinput.readUTF();
                                    fatherms=clientinput.readUTF();
                                    fatherexts=clientinput.readUTF();
                                    mothers=clientinput.readUTF();
                                    mothergs=clientinput.readUTF();
                                    motherms=clientinput.readUTF();
                                    motherexts=clientinput.readUTF();
                                    pcontcs=clientinput.readUTF();                            
                                    schl1s=clientinput.readUTF();
                                    schl2s=clientinput.readUTF();
                                    schl3s=clientinput.readUTF();
                                    schl4s=clientinput.readUTF();                                                                                      
                                     
                                    if(lrns.equals("N"))
                                    {
                                        textlrn.setText("");
                                    }
                                    else
                                    { 
                                        textlrn.setText(lrns);
                                    }
                                    if(ids.equals("N"))
                                    {
                                        textid.setText("");
                                    }
                                    else
                                    {
                                        textid.setText(ids);
                                    }
                                    if(schyrs.equals("N"))
                                    {
                                        textschoolyear.setText("");
                                    }
                                    else
                                    {
                                        textschoolyear.setText(schyrs);
                                    }
                                    if(schyr1s.equals("N"))
                                    {
                                        textschoolyear1.setText("");
                                    }
                                    else
                                    {
                                        textschoolyear1.setText(schyr1s);
                                    }  
                                    if(csyrs.equals("SELECT"))
                                    {
                                        combobox.setSelectedItem("SELECT");
                                    }
                                    else
                                    {
                                        combobox.setSelectedItem(csyrs);
                                    } 
                                    if(fnames.equals("N"))
                                    {
                                        textfamilyname.setText("");
                                    }
                                    else
                                    {
                                        textfamilyname.setText(fnames);
                                    }
                                    if(gnames.equals("N"))
                                    {
                                        textgivenname.setText("");
                                    }
                                    else
                                    {
                                        textgivenname.setText(gnames);
                                    } 
                                    if(mnames.equals("N"))
                                    {
                                        textmiddlename.setText("");
                                    }
                                    else
                                    {
                                        textmiddlename.setText(mnames);
                                    } 
                                    if(studexts.equals("N"))
                                    { 
                                        textstudext.setText("");
                                    }
                                    else
                                    {
                                        textstudext.setText(studexts);
                                    }
                                    if(gens.equals("N"))
                                    {
                                        textgender.setText("");
                                    }
                                    else
                                    {
                                        textgender.setText(gens);
                                    }
                                    if(addrs.equals("N"))
                                    {
                                        textbrgy.setText("");
                                    }
                                    else
                                    {
                                        textbrgy.setText(addrs);
                                    }
                                    if(addrcitys.equals("N"))
                                    {
                                        textctmun.setText("");
                                    }
                                    else
                                    {
                                        textctmun.setText(addrcitys);
                                    }
                                    if(addrprovs.equals("N"))
                                    {
                                        textprov.setText("");
                                    }
                                    else
                                    {
                                        textprov.setText(addrprovs);
                                    }
                                    if(addrzips.equals("N"))
                                    {
                                        textzip.setText("");
                                    }
                                    else
                                    {
                                        textzip.setText(addrzips);
                                    }
                                    if(ctzs.equals("N"))
                                    {
                                        textcitizen.setText("");
                                    }
                                    else
                                    {
                                        textcitizen.setText(ctzs);
                                    }
                                    if(datebs.equals("N"))
                                    {
                                        textdatebirth.setText("");
                                    }
                                    else
                                    {
                                        textdatebirth.setText(datebs);
                                    }
                                    if(placebs.equals("N"))
                                    {
                                        textplacebirth.setText("");
                                    }
                                    else
                                    {
                                        textplacebirth.setText(placebs);
                                    }
                                    if(rels.equals("N"))
                                    {
                                        textreligion.setText("");
                                    }
                                    else
                                    {
                                        textreligion.setText(rels);
                                    }
                                    if(civils.equals("SELECT"))
                                    {
                                        combobox1.setSelectedItem("SELECT");
                                    }
                                    else
                                    {
                                        combobox1.setSelectedItem(civils);
                                    }
                                    if(contcs.equals("N"))
                                    {
                                        textcontact.setText("");
                                    }
                                    else
                                    {
                                        textcontact.setText(contcs);
                                    }   
                                    if(emails.equals("N"))
                                    {
                                        textemail.setText("");
                                    }
                                    else
                                    {
                                        textemail.setText(emails);
                                    }
                                    if(pwds.equals("N"))
                                    {
                                        textpwd.setText(""); 
                                    }
                                    else
                                    {
                                        textpwd.setText(pwds);
                                    }
                                    if(fathers.equals("N"))
                                    {
                                        textffname.setText("");
                                    }
                                    else
                                    {
                                        textffname.setText(fathers);
                                    }
                                    if(fathergs.equals("N"))
                                    {
                                        textfgname.setText("");
                                    }  
                                    else
                                    {
                                        textfgname.setText(fathergs);
                                    }
                                    if(fatherms.equals("N"))
                                    {
                                        textfmname.setText("");
                                    }
                                    else
                                    {
                                        textfmname.setText(fatherms);
                                    }
                                    if(fatherexts.equals("N"))
                                    {
                                        textfext.setText("");
                                    }
                                    else
                                    {
                                        textfext.setText(fatherexts);
                                    }
                                    if(mothers.equals("N"))
                                    { 
                                        textmfname.setText("");
                                    }
                                    else
                                    {
                                        textmfname.setText(mothers);
                                    }
                                    if(mothergs.equals("N"))
                                    {
                                        textmgname.setText("");
                                    }
                                    else
                                    {
                                        textmgname.setText(mothergs);
                                    }
                                    if(motherms.equals("N"))
                                    {
                                        textmmname.setText("");
                                    }
                                    else
                                    {
                                        textmmname.setText(motherms);
                                    }
                                    if(motherexts.equals("N"))
                                    {
                                        textmext.setText("");
                                    }
                                    else
                                    {
                                        textmext.setText(motherexts);
                                    }
                                    if(pcontcs.equals("N"))
                                    {
                                        textparentcontact.setText("");
                                    }
                                    else
                                    {      
                                        textparentcontact.setText(pcontcs);
                                    }
                                    if(schl1s.equals("N"))
                                    {
                                        textschool1.setText("");
                                    }
                                    else
                                    {
                                        textschool1.setText(schl1s);
                                    }                           
                                    if(schl2s.equals("N"))
                                    {
                                        textschool2.setText("");
                                    }
                                    else
                                    {
                                        textschool2.setText(schl2s);
                                    }
                                    if(schl3s.equals("N"))
                                    {
                                        textschool3.setText("");
                                    }
                                    else
                                    {
                                        textschool3.setText(schl3s);
                                    }
                                    if(schl4s.equals("N"))
                                    {
                                        textschool4.setText("");
                                    }
                                    else
                                    {
                                        textschool4.setText(schl4s);
                                    }                                                                
                                }
                                else if(search.equals("mname")) 
                                {   
                                    System.out.println("IM HERE MNAME CLIENT");
                                    mname=JOptionPane.showInputDialog(null,"Enter Student Middle Name","2 Family Name",JOptionPane.INFORMATION_MESSAGE);                           
                                    clientoutput.writeUTF(mname.toUpperCase().replaceAll("\\s",""));
                                    clientoutput.flush(); 
                                                             
                                    search = clientinput.readUTF();
                                    
                                    if(search.equals("find"))
                                    {                                    
                                        lrns=clientinput.readUTF(); 
                                        ids=clientinput.readUTF();
                                        schyrs=clientinput.readUTF();
                                        schyr1s=clientinput.readUTF();
                                        csyrs=clientinput.readUTF();
                                        fnames=clientinput.readUTF(); 
                                        gnames=clientinput.readUTF();
                                        mnames=clientinput.readUTF();
                                        studexts=clientinput.readUTF();
                                        gens=clientinput.readUTF();
                                        addrs=clientinput.readUTF();
                                        addrcitys=clientinput.readUTF(); 
                                        addrprovs=clientinput.readUTF(); 
                                        addrzips=clientinput.readUTF();
                                        ctzs=clientinput.readUTF();
                                        datebs=clientinput.readUTF();
                                        placebs=clientinput.readUTF();
                                        rels=clientinput.readUTF();
                                        civils=clientinput.readUTF();
                                        contcs=clientinput.readUTF();
                                        emails=clientinput.readUTF();
                                        pwds=clientinput.readUTF();
                                        fathers=clientinput.readUTF();
                                        fathergs=clientinput.readUTF();
                                        fatherms=clientinput.readUTF();
                                        fatherexts=clientinput.readUTF();
                                        mothers=clientinput.readUTF();
                                        mothergs=clientinput.readUTF();
                                        motherms=clientinput.readUTF();
                                        motherexts=clientinput.readUTF();
                                        pcontcs=clientinput.readUTF();                            
                                        schl1s=clientinput.readUTF();
                                        schl2s=clientinput.readUTF();
                                        schl3s=clientinput.readUTF();
                                        schl4s=clientinput.readUTF();                              
                                        
                                        if(lrns.equals("N"))
                                        {
                                            textlrn.setText("");
                                        }
                                        else
                                        {
                                            textlrn.setText(lrns);
                                        }
                                        if(ids.equals("N"))
                                        {
                                            textid.setText("");
                                        }     
                                        else
                                        {
                                            textid.setText(ids);
                                        }
                                        if(schyrs.equals("N"))
                                        {
                                            textschoolyear.setText("");
                                        }
                                        else
                                        {
                                            textschoolyear.setText(schyrs);
                                        }
                                        if(schyr1s.equals("N"))
                                        {
                                            textschoolyear1.setText("");
                                        }
                                        else
                                        {
                                            textschoolyear1.setText(schyr1s);
                                        }  
                                        if(csyrs.equals("SELECT"))
                                        {
                                            combobox.setSelectedItem("SELECT");
                                        }
                                        else
                                        {
                                            combobox.setSelectedItem(csyrs);
                                        } 
                                        if(fnames.equals("N"))
                                        {
                                            textfamilyname.setText("");
                                        }
                                        else
                                        {
                                            textfamilyname.setText(fnames);
                                        }
                                        if(gnames.equals("N"))
                                        {
                                            textgivenname.setText("");
                                        }
                                        else
                                        {
                                            textgivenname.setText(gnames);
                                        } 
                                        if(mnames.equals("N"))
                                        {
                                            textmiddlename.setText("");
                                        }
                                        else
                                        {
                                            textmiddlename.setText(mnames);
                                        } 
                                        if(studexts.equals("N"))
                                        {
                                            textstudext.setText("");
                                        }
                                        else
                                        {
                                            textstudext.setText(studexts);
                                        }
                                        if(gens.equals("N"))
                                        {
                                            textgender.setText("");
                                        }
                                        else
                                        {
                                            textgender.setText(gens);
                                        }
                                        if(addrs.equals("N"))
                                        {
                                            textbrgy.setText("");
                                        }
                                        else
                                        {
                                            textbrgy.setText(addrs);
                                        }
                                        if(addrcitys.equals("N"))
                                        {
                                            textctmun.setText("");
                                        }
                                        else
                                        {
                                            textctmun.setText(addrcitys);
                                        }
                                        if(addrprovs.equals("N"))
                                        {
                                            textprov.setText("");
                                        }
                                        else
                                        {
                                            textprov.setText(addrprovs);
                                        }
                                        if(addrzips.equals("N"))
                                        {
                                            textzip.setText("");
                                        }
                                        else
                                        {
                                            textzip.setText(addrzips);
                                        }
                                        if(ctzs.equals("N"))
                                        {
                                            textcitizen.setText("");
                                        }
                                        else
                                        {
                                            textcitizen.setText(ctzs);
                                        }
                                        if(datebs.equals("N"))
                                        {
                                            textdatebirth.setText("");
                                        }
                                        else
                                        {
                                            textdatebirth.setText(datebs);
                                        }
                                        if(placebs.equals("N"))
                                        {
                                            textplacebirth.setText("");
                                        }
                                        else
                                        {
                                            textplacebirth.setText(placebs);
                                        }
                                        if(rels.equals("N"))
                                        {
                                            textreligion.setText("");
                                        }
                                        else
                                        {
                                            textreligion.setText(rels);
                                        }
                                        if(civils.equals("SELECT"))
                                        {
                                            combobox1.setSelectedItem("SELECT");
                                        }
                                        else
                                        {
                                            combobox1.setSelectedItem(civils);
                                        }
                                        if(contcs.equals("N"))
                                        {
                                            textcontact.setText("");
                                        }
                                        else
                                        {
                                            textcontact.setText(contcs);
                                        }  
                                        if(emails.equals("N"))
                                        {
                                            textemail.setText("");
                                        }
                                        else
                                        {
                                            textemail.setText(emails);
                                        }
                                        if(pwds.equals("N"))
                                        {
                                            textpwd.setText(""); 
                                        }
                                        else
                                        {
                                            textpwd.setText(pwds);
                                        }
                                        if(fathers.equals("N"))
                                        {
                                            textffname.setText("");
                                        } 
                                        else
                                        {
                                            textffname.setText(fathers);
                                        }
                                        if(fathergs.equals("N"))
                                        {
                                            textfgname.setText("");
                                        } 
                                        else
                                        {
                                            textfgname.setText(fathergs);
                                        }
                                        if(fatherms.equals("N"))
                                        {
                                            textfmname.setText("");
                                        }
                                        else
                                        {
                                            textfmname.setText(fatherms);
                                        }
                                        if(fatherexts.equals("N"))
                                        {
                                            textfext.setText("");
                                        }
                                        else
                                        {
                                            textfext.setText(fatherexts);
                                        }
                                        if(mothers.equals("N"))
                                        {
                                            textmfname.setText("");
                                        }
                                        else
                                        {
                                            textmfname.setText(mothers);
                                        }
                                        if(mothergs.equals("N"))
                                        {
                                            textmgname.setText("");
                                        }
                                        else
                                        {
                                            textmgname.setText(mothergs);
                                        }
                                        if(motherms.equals("N"))
                                        {
                                            textmmname.setText("");
                                        }   
                                        else
                                        {
                                            textmmname.setText(motherms);
                                        }
                                        if(motherexts.equals("N"))
                                        {
                                            textmext.setText("");
                                        }
                                        else
                                        {
                                            textmext.setText(motherexts);
                                        }     
                                        if(pcontcs.equals("N"))
                                        {
                                            textparentcontact.setText("");
                                        }
                                        else
                                        {
                                            textparentcontact.setText(pcontcs);
                                        }
                                        if(schl1s.equals("N"))
                                        {
                                            textschool1.setText("");
                                        }  
                                        else
                                        {
                                            textschool1.setText(schl1s);
                                        }                           
                                        if(schl2s.equals("N"))
                                        {
                                            textschool2.setText("");
                                        }
                                        else
                                        {
                                            textschool2.setText(schl2s);
                                        }
                                        if(schl3s.equals("N"))
                                        {
                                            textschool3.setText("");
                                        }
                                        else
                                        {
                                            textschool3.setText(schl3s);
                                        }
                                        if(schl4s.equals("N"))
                                        {
                                            textschool4.setText("");
                                        }
                                        else
                                        {
                                            textschool4.setText(schl4s);
                                        }                                                                     
                                    } 
                                    else
                                    {   
                                        String hms=clientinput.readUTF(); 
                                        JOptionPane.showMessageDialog(null, "Cannot Find :  "+searchup+", "+gname+" "+hms+"\nCheck Spelling","  Message ",JOptionPane.INFORMATION_MESSAGE);                                        
                                        textsearch1a.setText("");
                                    }
                                }
                            }  
                            else
                            {                                
                                JOptionPane.showMessageDialog(null,"Search cancel","Message ",JOptionPane.INFORMATION_MESSAGE);
                                gname = "null";
                                clientoutput.writeUTF(gname);
                                clientoutput.flush(); 
                                textsearchb.setText("");
                                textsearchb.requestFocus();
                                //textlrn.setText("");textid.setText("");
                                //textschoolyear.setText("");textschoolyear1.setText("");
                                //textfamilyname.setText("");textgivenname.setText(""); 
                                //textmiddlename.setText("");textstudext.setText("");
                                //textgender.setText("");textbrgy.setText("");
                                //textctmun.setText("");textprov.setText("");
                                //textzip.setText("");textcitizen.setText("");
                                //textdatebirth.setText("");textplacebirth.setText("");
                                //textreligion.setText("");textcontact.setText("");
                                //textemail.setText("");textpwd.setText("");textffname.setText("");
                                //textfgname.setText("");textfmname.setText("");textfext.setText("");
                                //textmfname.setText("");textmgname.setText("");
                                //textmmname.setText("");textmext.setText("");
                                //textparentcontact.setText("");textschool1.setText("N");
                                //textschool2.setText("N");textschool3.setText("N");
                                //textschool4.setText("N");textsearchb.setText("");
                                //combobox.setSelectedItem("SELECT");combobox1.setSelectedItem("SELECT");
                                
                                //stop=1;                                 
                            }
                        break; 
                        case "wrong1":
                            JOptionPane.showMessageDialog(null, "You have not enter anything \n"+"in the search box","  Message ",JOptionPane.INFORMATION_MESSAGE);
                        break;
                        default:
                            JOptionPane.showMessageDialog(null, "Cannot Find : \n"+searchup+"\nCheck Spelling or Student No.","  Message ",JOptionPane.INFORMATION_MESSAGE);
                            textsearchb.setText("");
                            textsearchb.requestFocus();                            
                            stop=1;
                        break;                                 
                    } // SWITCH CASE           
                }
                catch(IOException i)
                {
                    i.printStackTrace();             
                }            
            } 
        });*/        
        /*buttonb.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent ae)   
            { 
                String   lrn1="",id1="",schyr1="",schyr11="",csyr1="",fname1="",gname1="",
                         mname1="",studext1="",gen1="",addr1="",addrcity1="",addrprov1="",
                         addrzip1="",ctz1="",dateb1="",placeb1="",rel1="",civil1="",                  
                         contc1="",email1="",pwd1="",father1="",fatherg1="",fatherm1="",
                         fatherext1="",mother1="",motherg1="",motherm1="",           
                         motherext1="",pcontc1="",schl11="",schl21="", schl31="",        
                         schl41="";
                try
                {                                       
                    lrn1 = textlrn.getText(); 
                    id1= textid.getText(); 
                    schyr1 = textschoolyear.getText();  
                    schyr11 = textschoolyear1.getText();
                    csyr1 =combobox.getSelectedItem().toString();            
                    fname1 = textfamilyname.getText(); 
                    gname1 = textgivenname.getText();  
                    mname1 = textmiddlename.getText();
                    studext1 = textstudext.getText();
                    gen1 = textgender.getText();
                    addr1 = textbrgy.getText();
                    addrcity1= textctmun.getText();
                    addrprov1= textprov.getText();
                    addrzip1= textzip.getText();
                    ctz1 = textcitizen.getText();
                    dateb1 = textdatebirth.getText();
                    placeb1 = textplacebirth.getText();
                    rel1 = textreligion.getText();
                    civil1 =combobox1.getSelectedItem().toString();                                      
                    contc1 = textcontact.getText();
                    email1 = textemail.getText();
                    pwd1 = textpwd.getText();
                    father1 = textffname.getText();
                    fatherg1 = textfgname.getText();
                    fatherm1 = textfmname.getText();
                    fatherext1 = textfext.getText();
                    mother1 = textmfname.getText();
                    motherg1 = textmgname.getText();
                    motherm1 = textmmname.getText();
                    motherext1 = textmext.getText();
                    pcontc1 = textparentcontact.getText();                  
                    schl11 = textschool1.getText();
                    schl21 = textschool2.getText();
                    schl31 = textschool3.getText();
                    schl41 = textschool4.getText();
                    if(lrn1.equals(""))
                    {
                        lrn1 = "N";
                    }
                    else
                    {
                        lrn1 = textlrn.getText();
                    }
                    if(id1.equals(""))
                    {
                        id1 = "N";
                    }
                    else
                    {
                        id1= textid.getText();
                    }
                    if(schyr1.equals(""))
                    {
                        schyr1 = "N";
                    }
                    else
                    {
                        schyr1 = textschoolyear.getText();
                    }
                    if(schyr11.equals(""))
                    {
                        schyr11 = "N";
                    }
                    else
                    {
                        schyr11 = textschoolyear1.getText();
                    }
                    if(csyr1.equals(""))
                    {
                        csyr1 = "N";
                    }
                    else
                    {
                        csyr1 =combobox.getSelectedItem().toString();
                    }
                    if(fname1.equals(""))
                    {
                        fname1 = "N";
                    }
                    else
                    {
                        fname1 = textfamilyname.getText();
                    }
                    if(gname1.equals(""))
                    {
                        gname1 = "N";
                    }
                    else
                    {
                        gname1 = textgivenname.getText();
                    }
                    if(mname1.equals(""))
                    {
                        mname1 = "N";
                    }
                    else
                    {
                        mname1 = textmiddlename.getText();
                    }
                    if(studext1.equals(""))
                    {
                        studext1 = "N";
                    }
                    else
                    {
                         studext1 = textstudext.getText();
                    }
                    if(gen1.equals(""))
                    {
                        gen1 = "N";
                    }
                    else
                    {
                        gen1 = textgender.getText(); 
                    }
                    if(addr1.equals(""))
                    {
                        addr1 = "N";
                    }
                    else
                    {
                        addr1 = textbrgy.getText(); 
                    }
                    if(addrcity1.equals(""))
                    {
                        addrcity1 = "N";
                    }
                    else
                    {
                        addrcity1= textctmun.getText(); 
                    }
                    if(addrprov1.equals(""))
                    {
                        addrprov1 = "N";
                    }
                    else
                    {
                        addrprov1= textprov.getText(); 
                    }
                    if(addrzip1.equals(""))
                    {
                        addrzip1 = "N";
                    }
                    else
                    {
                        addrzip1= textzip.getText(); 
                    }
                    if(ctz1.equals(""))
                    {
                        ctz1 = "N";
                    }
                    else
                    {
                        ctz1 = textcitizen.getText(); 
                    }
                    if(dateb1.equals(""))
                    {
                        dateb1 = "N";
                    }
                    else
                    {
                        dateb1 = textdatebirth.getText(); 
                    }
                    if(placeb1.equals(""))
                    {
                        placeb1 = "N";
                    }
                    else
                    {
                        placeb1 = textplacebirth.getText(); 
                    }
                    if(rel1.equals(""))
                    {
                        rel1 = "N";
                    }
                    else
                    {
                        rel1 = textreligion.getText(); 
                    }
                    if(civil1.equals(""))
                    {
                        civil1 = "N";
                    }
                    else
                    {
                        civil1 =combobox1.getSelectedItem().toString(); 
                    }
                    if(contc1.equals(""))
                    {
                        contc1 = "N";
                    }
                    else
                    {
                        contc1 = textcontact.getText(); 
                    }
                    if(email1.equals(""))
                    {
                        email1 = "N";
                    }
                    else
                    {
                        email1 = textemail.getText(); 
                    }
                    if(pwd1.equals(""))
                    {
                        pwd1 = "N";
                    }
                    else
                    {
                        pwd1 = textpwd.getText(); 
                    }
                    if(father1.equals(""))
                    {
                        father1 = "N";
                    }
                    else
                    {
                        father1 = textffname.getText(); 
                    }
                    if(fatherg1.equals(""))
                    {
                        fatherg1 = "N";
                    }
                    else
                    {
                        fatherg1 = textfgname.getText(); 
                    }
                    if(fatherm1.equals(""))
                    {
                        fatherm1 = "N";
                    }
                    else
                    {
                        fatherm1 = textfmname.getText(); 
                    }
                    if(fatherext1.equals(""))
                    {
                        fatherext1 = "N";
                    }
                    else
                    {
                        fatherext1 = textfext.getText(); 
                    }
                    if(mother1.equals(""))
                    {
                        mother1 = "N";
                    }
                    else
                    {
                        mother1 = textmfname.getText(); 
                    }
                    if(motherg1.equals(""))
                    {
                        motherg1 = "N";
                    }
                    else
                    {
                        motherg1 = textmgname.getText(); 
                    }
                    if(motherm1.equals(""))
                    {
                        motherm1 = "N";
                    }
                    else
                    {
                        motherm1 = textmmname.getText(); 
                    }
                    if(motherext1.equals(""))
                    {
                        motherext1 = "N";
                    }
                    else
                    {
                        motherext1 = textmext.getText(); 
                    }
                    if(pcontc1.equals(""))
                    {
                        pcontc1 = "N";
                    }
                    else
                    {
                        pcontc1 = textparentcontact.getText(); 
                    }
                    if(schl11.equals(""))
                    {
                        schl11 = "N";
                    }
                    else
                    { 
                        schl11 = textschool1.getText(); 
                    }
                    if(schl21.equals(""))
                    {
                        schl21 = "N";
                    }
                    else
                    {
                        schl21 = textschool2.getText(); 
                    }
                    if(schl31.equals(""))
                    {
                        schl31 = "N";
                    }
                    else
                    {
                        schl31 = textschool3.getText(); 
                    }
                    if(schl41.equals(""))
                    {
                        schl41 = "N";
                    }
                    else
                    {
                       schl41 = textschool4.getText(); 
                    }
                    if(!id1.equals("") || !fname1.equals(""))
                    {                       
                        clientoutput.writeUTF("update1");  
                        clientoutput.flush(); 
                     
                        clientoutput.writeUTF(lrn1);
                        clientoutput.writeUTF(id1);
                        clientoutput.writeUTF(schyr1);
                        clientoutput.writeUTF(schyr11);
                        clientoutput.writeUTF(csyr1);
                        clientoutput.writeUTF(fname1);
                        clientoutput.writeUTF(gname1);
                        clientoutput.writeUTF(mname1);
                        clientoutput.writeUTF(studext1);
                        clientoutput.writeUTF(gen1);
                        clientoutput.writeUTF(addr1);
                        clientoutput.writeUTF(addrcity1);
                        clientoutput.writeUTF(addrprov1);
                        clientoutput.writeUTF(addrzip1);
                        clientoutput.writeUTF(ctz1);
                        clientoutput.writeUTF(dateb1);
                        clientoutput.writeUTF(placeb1);
                        clientoutput.writeUTF(rel1);
                        clientoutput.writeUTF(civil1);
                        clientoutput.writeUTF(contc1);
                        clientoutput.writeUTF(email1);
                        clientoutput.writeUTF(pwd1);
                        clientoutput.writeUTF(father1);
                        clientoutput.writeUTF(fatherg1);
                        clientoutput.writeUTF(fatherm1);
                        clientoutput.writeUTF(fatherext1);
                        clientoutput.writeUTF(mother1);
                        clientoutput.writeUTF(motherg1);
                        clientoutput.writeUTF(motherm1);
                        clientoutput.writeUTF(motherext1);
                        clientoutput.writeUTF(pcontc1);      
                        clientoutput.writeUTF(schl11);
                        clientoutput.writeUTF(schl21);
                        clientoutput.writeUTF(schl31);
                        clientoutput.writeUTF(schl41);
                        
                        clientoutput.flush(); 
                       
                        JOptionPane.showMessageDialog(null,"Student record updated"," Message",JOptionPane.INFORMATION_MESSAGE);
                        combobox.setSelectedItem("SELECT");combobox1.setSelectedItem("SELECT");
                        textlrn.setText("");textid.setText("");
                        textschoolyear.setText("");textschoolyear1.setText("");
                        textfamilyname.setText("");textgivenname.setText(""); 
                        textmiddlename.setText("");textstudext.setText("");
                        textgender.setText("");textbrgy.setText("");
                        textctmun.setText("");textprov.setText("");
                        textzip.setText("");textcitizen.setText("");
                        textdatebirth.setText("");textplacebirth.setText("");
                        textreligion.setText("");textcontact.setText("");
                        textemail.setText("");textpwd.setText("");textffname.setText("");
                        textfgname.setText("");textfmname.setText("");textfext.setText("");
                        textmfname.setText("");textmgname.setText("");
                        textmmname.setText("");textmext.setText("");
                        textparentcontact.setText("");textschool1.setText("");
                        textschool2.setText("");textschool3.setText("");
                        textschool4.setText("");textsearchb.setText("");  
                        textsearchb.requestFocus(); 
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"You have not search for record to be updated"," Message",JOptionPane.INFORMATION_MESSAGE);
                        combobox.setSelectedItem("SELECT");combobox1.setSelectedItem("SELECT");
                        textlrn.setText("");textid.setText("");
                        textschoolyear.setText("");textschoolyear1.setText("");
                        textfamilyname.setText("");textgivenname.setText(""); 
                        textmiddlename.setText("");textstudext.setText("");
                        textgender.setText("");textbrgy.setText("");
                        textctmun.setText("");textprov.setText("");
                        textzip.setText("");textcitizen.setText("");
                        textdatebirth.setText("");textplacebirth.setText("");
                        textreligion.setText("");textcontact.setText("");
                        textemail.setText("");textpwd.setText("");textffname.setText("");
                        textfgname.setText("");textfmname.setText("");textfext.setText("");
                        textmfname.setText("");textmgname.setText("");
                        textmmname.setText("");textmext.setText("");
                        textparentcontact.setText("");textschool1.setText("");
                        textschool2.setText("");textschool3.setText("");
                        textschool4.setText("");textsearchb.setText("");  
                        textsearchb.requestFocus();
                    }
                }
                catch(IOException i)
                {
                    System.out.println(i);
                }
            } 
        });*//// student profile
        
        /// BUTTON TO CLEAR ALL WINDOW//////
        button3.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent ae)
            {
                combobox.setSelectedItem("SELECT");combobox1.setSelectedItem("SELECT");
                combobox2.setSelectedItem("SELECT");
                textlrn.setText("");textid.setText(""); 
                textschoolyear.setText("");textschoolyear1.setText("");
                textfamilyname.setText("");textgivenname.setText(""); 
                textmiddlename.setText("");textstudext.setText("");
                textgender.setText("");textbrgy.setText("");
                textctmun.setText("");textprov.setText("");
                textzip.setText("");textcitizen.setText("");
                textdatebirth.setText("");textplacebirth.setText("");
                textreligion.setText("");textcontact.setText("");
                textemail.setText("");textpwd.setText("");textffname.setText("");
                textfgname.setText("");textfmname.setText("");textfext.setText("");
                textmfname.setText("");textmgname.setText("");
                textmmname.setText("");textmext.setText("");
                textparentcontact.setText("");
                searchb.setText("Search by ID number or familyname"); 
                textlrn.requestFocus();
            }   
        });
     
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                java.lang.System.exit(0);                  
            }// WINDOW LISTENER
        });// WINDOW LISTENER  
    }// PUBLIC WINDOW      
}// CLASS WINDOW
       
    }
    

