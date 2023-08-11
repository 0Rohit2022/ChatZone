package chatting.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.border.EmptyBorder;
import java.net.*;
public class Server  implements ActionListener {
    JTextField text;
    JPanel al;
   static Box vertical = Box.createVerticalBox();
   static JFrame f = new JFrame();
   static DataOutputStream dos;
    Server()
    {
        //For Setting the layout of the frame
        f.setLayout(null);
        
        //For setting the panel on the frame
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(7,94,84));
        //For viewing this on the frame then use setBounds
        p1.setBounds(0, 0, 450,70);
        p1.setLayout(null);
        //For adding panel above the frame then we'll use add function
        f.add(p1);
        
        //If you want to setimages in your project then use ImageIcon
        // Creating an object of image icon
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/3.png"));
        //For setting or scaling the image
        Image i2 = i1.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
        
        //It Jlabel won't take direct images first we have to convert it into ImageIcon
        ImageIcon i3 = new ImageIcon(i2);
        //For setting these image on the frame we use JLabel
        JLabel back = new JLabel(i3);
        back.setBounds(5,20,25,25);
        //For adding this function on the frame use add() method
        //So, By adding only add(back) the image set on the top of the
        //frame but for setting on the top of panel we'll use p1.add(back)
        p1.add(back);
        
        
        //Now We want whenever we click on the back image then immediately it close the page
        //For that we have to create some methods and pass some functions.
        back.addMouseListener(new MouseAdapter(){
           public void mouseClicked(MouseEvent ae) 
                {
                    //We'are saying that we are enclosing our whole project with a single click on the back
                    System.exit(0);
                }
                
        });
        
        
        
        
         //If you want to setimages in your project then use ImageIcon
//        // Creating an object of image icon
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/1.jpg"));
//        //For setting or scaling the image
        Image i5 = i4.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT);
//        
//        //It Jlabel won't take direct images first we have to convert it into ImageIcon
        ImageIcon i6 = new ImageIcon(i5);
//        //For setting these image on the frame we use JLabel
        JLabel profile = new JLabel(i6);
        profile.setBounds(40,10,50,50);
//        //For adding this function on the frame use add() method
//        //So, By adding only add(back) the image set on the top of the
//        //frame but for setting on the top of panel we'll use p1.add(back)
        p1.add(profile);


        
        
        
          //If you want to setimages in your project then use ImageIcon
        // Creating an object of image icon
        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icons/video.png"));
        //For setting or scaling the image
        Image i8 = i7.getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT);
        
        //It Jlabel won't take direct images first we have to convert it into ImageIcon
        ImageIcon i9 = new ImageIcon(i8);
        //For setting these image on the frame we use JLabel
        JLabel video = new JLabel(i9);
        video.setBounds(300,20,30,30);
        //For adding this function on the frame use add() method
        //So, By adding only add(back) the image set on the top of the
        //frame but for setting on the top of panel we'll use p1.add(back)
        p1.add(video);
        
        
        
        
        
            //If you want to setimages in your project then use ImageIcon
        // Creating an object of image icon
        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("icons/phone.png"));
        //For setting or scaling the image
        Image i11 = i10.getImage().getScaledInstance(35,30,Image.SCALE_DEFAULT);
        
        //It Jlabel won't take direct images first we have to convert it into ImageIcon
        ImageIcon i12 = new ImageIcon(i11);
        //For setting these image on the frame we use JLabel
        JLabel phone = new JLabel(i12);
        phone.setBounds(360,20,35,30);
        //For adding this function on the frame use add() method
        //So, By adding only add(back) the image set on the top of the
        //frame but for setting on the top of panel we'll use p1.add(back)
        p1.add(phone);
        
        
        
        
        
        
            //If you want to setimages in your project then use ImageIcon
        // Creating an object of image icon
        ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource("icons/3icon.png"));
        //For setting or scaling the image
        Image i14 = i13.getImage().getScaledInstance(10,25,Image.SCALE_DEFAULT);
        
        //It Jlabel won't take direct images first we have to convert it into ImageIcon
        ImageIcon i15 = new ImageIcon(i14);
        //For setting these image on the frame we use JLabel
        JLabel dots = new JLabel(i15);
        dots.setBounds(420,20,10,25);
        //For adding this function on the frame use add() method
        //So, By adding only add(back) the image set on the top of the
        //frame but for setting on the top of panel we'll use p1.add(back)
        p1.add(dots);
        
        
        
        
        
        //If you want to write something on the frame then we have to use Jlabel
        // The main function of jlabel is to write something on the frame
        JLabel name = new JLabel("Neymar");
        name.setBounds(110,15,100,18);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("SAN_SERIF", Font.ITALIC, 18));
        p1.add(name);
        
        
        
        JLabel status = new JLabel("Active now");
        status.setBounds(110,35,100,14);
        status.setForeground(Color.WHITE);
        status.setFont(new Font("SAN_SERIF", Font.ITALIC, 18));
        p1.add(status);
        
        //Our Header part is done. 
        
        
        
        //This Area is a TextArea. It's the part after the header
        
         al = new JPanel();
        al.setBounds(5,75,440,570);
        f.add(al);
        
        
        
        //If writing messages by the user in the app we use JTextField
         text = new JTextField();
        text.setBounds(5,600,310,40);
        text.setFont(new Font("SAN_SERIF", Font.PLAIN, 16));
        f.add(text);
        
        
        
        //For putting button in the frame we use JButton
        JButton send = new JButton("Send");
        send.setBounds(320,600,123,40);
        send.setFont(new Font("SAN_SERIF", Font.PLAIN, 19));
        //We're telling that whenever we clicked on the send button then some operations will be performed and what action will be perfromed that we'll write in the actionPerformed method
        send.addActionListener(this);
        send.setBackground(new Color(7,94,84));
        send.setForeground(Color.WHITE);
        f.add(send);
        
        //For Setting the height and width of the frame
        f.setSize(450,650);
        //For setting the location of the frame
        f.setLocation(200, 50);
        //For removing the minimize, or close symbol or you want that no-one increase or decrease the size of your application then use this
        // we write 
        f.setUndecorated(true);
        //For changing the background of the frame 
        f.getContentPane().setBackground(Color.WHITE);
        
        
        
        //For visibility we have to pass the function for visibility of frame
        f.setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) 
           
    {
         try
         {
        
        //In this method, Firstly we are getting text with the help of text.getText() emthod 
        String out = text.getText();
        System.out.println(out);
        
       
        
        
        JPanel p2 = formatLabel(out);
        //Then JPanel add the text which means that our text will add after the header with the help of the jpanel
        al.setLayout(new BorderLayout());
        
        
        //With the help of this we're saying that our message will be printed on the right side
        JPanel right = new JPanel(new BorderLayout());
        
        //Right side means at the end of the line
        right.add(p2, BorderLayout.LINE_END);
        
        // With the help of this method we are adding our message in a vertical way
        vertical.add(right);
        
        //This method will create the gap between two messages
        vertical.add(Box.createVerticalStrut(15));
        
        
        //This method will print at the start of the panel
        al.add(vertical, BorderLayout.PAGE_START);
        
        
        //For making the text area after clicking the send button
        text.setText("");
        
        //For Sending messages we use dos (DataOutputstream)
        dos.writeUTF(out);
        
        f.repaint();
        f.invalidate();
        f.validate();
        
         }
         catch(Exception e)
         {
             e.printStackTrace();
         }
    }
    
    
    
    public static JPanel formatLabel(String out)
    {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        
        
        JLabel output = new JLabel(out);
        output.setFont(new Font("Tahoma", Font.PLAIN, 16));
        output.setBackground(new Color(37,211,102));
        output.setOpaque(true);
        output.setBorder(new EmptyBorder(15, 15, 15, 15));
        panel.add(output);
        
        
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH/mm");
        
        JLabel time = new JLabel();
        time.setText(sdf.format(cal.getTime()));
        
        panel.add(time);
        
        
        return panel;
    }
    
    
        public static void main(String[] args)
        {
            //Anonymous Objects
            new Server();
            
            
            
            try
            {
                //If you build this object then you can run this server on port no.6001
                ServerSocket message = new ServerSocket(6001);
                
                //We're giving here a condition that we're accepting the message infinitely
                while(true)
                {
                    //We're storing the message inside the socket
                    Socket storage = message.accept();
                    
                    //For receiving the message
                    DataInputStream dis = new DataInputStream(storage.getInputStream());
                    
                    //For Sending the message
                    dos = new DataOutputStream(storage.getOutputStream());
                    
                    //This while(true) loop is where the server reads messages from the client and displays them in the GUI. As long as the client is sending messages, this loop keeps running.
                    while(true)
                    {
                        //Client sent me msg which is inside the readMsg and now I want to display it 
                        String readMsg = dis.readUTF();
                        
                        // So, for displaying message we use...
                        JPanel panel = formatLabel(readMsg);
                        
                        
                        //left means that whatever msg we receieved that msg I want to display it on the left side of the panel or frame
                        JPanel left = new JPanel(new BorderLayout());
                        left.add(panel, BorderLayout.LINE_START);
                        
                        //This means that i want to see my msgs line by line
                        vertical.add(left);
                        f.validate();
                        
                    }
                    
                    
                    
                    
                }
                
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    
}
