package pastExams.y2018.autumn;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
//This program manages a collection of buses, holding the info in an LinkedList
public class TransportSystem extends JFrame implements ActionListener{
    JMenu fileMenu,BusMenu;
    ArrayList <Bus> buses;
    public static void main( String[] args ) {
        TransportSystem frame = new TransportSystem();
        frame.setVisible(true); }
    public TransportSystem( ) {
        newSystem();
        setTitle( "TransportSystem" );
        setSize( 400,200 );
        setLocation( 100,100 );
        Container pane = getContentPane();
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        createFileMenu();
        createBusMenu();
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.add(fileMenu);
        menuBar.add(BusMenu);
    } // end

    public void newSystem() {
        //creates Arraylist
    } // end new system

    public void save() {
        //code removed
    } //end save

    public void open(ArrayList<Bus> buses) throws Exception {

        File outfile = new File("buses.dat");
        FileOutputStream outstream = new FileOutputStream(outfile);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outstream);

        for(Bus b:buses){
            objectOutputStream.writeObject(b);
        }

        objectOutputStream.close();
        outstream.close();

    } // end open()

    public void addBus(){
        ///adds bus to ArrayList
    } // end addBus
    public void display (){
        JTextArea textArea = new JTextArea(10,30);
        for(Bus b:buses){
            textArea.append(b.toString());
        }

        JOptionPane.showMessageDialog(null,textArea,"Display",JOptionPane.INFORMATION_MESSAGE);
    }
 // end display

    public void maxPassengers(){
        Bus max = new Bus("","",0,0);

        for(int i=0; i<buses.size(); i++){
            if(i ==0)
                max = buses.get(i);
            else if(buses.get(i).getMaxPassengers() > max.getMaxPassengers()){
                max = buses.get(i);
            }
        }

        JOptionPane.showMessageDialog(null,max,"Bust with largest Capacity",JOptionPane.INFORMATION_MESSAGE);

    } // end addBus
    private void createFileMenu(){
        // create the menu
        fileMenu = new JMenu("File");
        // declare a menu item (re-usable)
        JMenuItem item;
        item = new JMenuItem("Save");
        item.addActionListener(this);
        fileMenu.add(item);
        item = new JMenuItem("Open");
        item.addActionListener(this);
        fileMenu.add(item);
        item = new JMenuItem("New File");
        item.addActionListener(this);
        fileMenu.add(item);
        // create the 'quit' option
        fileMenu.addSeparator();
        item = new JMenuItem("Quit");
        item.addActionListener(this);
        fileMenu.add(item);
    }

    private void createBusMenu(){
        // create the menu
        BusMenu = new JMenu("Bus");
        // declare a menu item (re-usable)
        JMenuItem item;

        item = new JMenuItem("Add Bus");
        item.addActionListener(this);
        BusMenu.add(item);

        item = new JMenuItem("Display Bus List");
        item.addActionListener(this);
        BusMenu.add(item);
        item = new JMenuItem("Most Valuable Bus");
        item.addActionListener(this);
        BusMenu.add(item);
    }
    /** utility methods to make the code simpler */
    public void showMessage (String s){
        JOptionPane.showMessageDialog(null,s);
    }

    public void showMessage (JTextArea s){
        JOptionPane.showMessageDialog(null,s);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(fileMenu.getItem(1))){
            try {
                open(buses);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        else if(e.getSource().equals(fileMenu.getItem(0))){
            save();
        }

    }

//*** actionPerformed method***

// code required for this method
        }
