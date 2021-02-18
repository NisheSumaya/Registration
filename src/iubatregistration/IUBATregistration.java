package iubatregistration;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class IUBATregistration extends Application {
      Label l ;
      TextField t ;
       Label l2 ;
      TextField t2 ;
       Label l3 ;
      TextField t3 ;
       Label l4 ;
      TextField t4 ;
       Label l5 ;
      TextField t5;
       Label l6 ;
      TextArea t6 ;
       Label l7 ;
      TextField t7 ;
      Label l8 ;
      TextField t8 ;
      Label l9;
      TextField t9;
      Button B;
      Button b1;
       TextArea t10 ;
       String s,s1; int a,b;
    @Override
    public void start(Stage primaryStage) {
       l=new Label("First Name :") ;
       t = new TextField();
       l2=new Label("Last Name :") ;
       t2 = new TextField();
    l3=new Label("Date of birth :") ;
     t3 = new TextField();
       l4=new Label("Blood Group :") ;
      t4 = new TextField();
      l5=new Label("Gender :") ;
    t5 = new TextField();
      l6=new Label("Adress:") ;
   t6 = new TextArea();
   l7=new Label("Program :") ;
      t7 = new TextField();
       l8=new Label(" Mobile Number :") ;
   t8 = new TextField();
       l9=new Label("Email :") ;
    t9 = new TextField();
    B= new Button("OK");
   b1= new Button("CLEAR");
  t10 = new TextArea();
      GridPane d= new GridPane();
     d.setMinSize(900, 700); 
      d.setVgap(10); 
     d.setHgap(10);    
     d.setAlignment(Pos.CENTER);
     d.addColumn(0, l,l2,l3,l4,l5,l6,l7,l8,l9,B);
     d.addColumn(1, t,t2,t3,t4,t5,t6,t7,t8,t9,b1,t10);
      EventHandler<ActionEvent> eh;
        eh = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                if(event.getSource()==B){
                     s=t3.getText();
         int a=Integer.parseInt(s);
        int b=2019-a;
         s1=Integer.toString(b);
                    t10.setText("Thank you"+t.getText()+" "+t2.getText()+" for getting admission into "+t7.getText()+" . Wow!You are "+s1+" years old,your blood group is "+t4.getText()+" you are a "+t5.getText()+" . please donate to needy people living close to "+t6.getText()+" !"+"\n"+" We can contact you at "+t8.getText()+" and "+t9.getText()+"."+"\n"+"Thank you"+"\n\n"+"Bye Bye");
                }
                if(event.getSource()==b1)
                {
                    t.setText(" ");
                    t2.setText(" ");
                    t3.setText(" ");
                    t4.setText(" ");
                    t5.setText(" ");
                    t6.setText(" ");
                    t7.setText(" ");
                    t8.setText(" ");
                    t9.setText(" ");
                } }};
        B.setOnAction(eh);
       b1.setOnAction(eh);
     Scene scene=new Scene(d);
        primaryStage.setTitle(" Please Fill in your Personal Details Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
