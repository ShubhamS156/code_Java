import java.awt.*;
class FirstGUI extends Frame{
  FirstGUI(){
    Button b=new Button("Click Me");
    b.setBounds(30,100,80,30);
    add(b);
    setSize(300,300);
    setLayout(null);
    setVisible(true);
  }
public static void main(String[] args) {


  FirstGUI f=new FirstGUI();
}
}
