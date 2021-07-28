import javax.swing.JOptionPane;
public class vehiculo {
    
    String color,marca,modelo;
    int odometro;
   public static void main(String[] args){
vehiculo carro1=new vehiculo();

carro1.color="Gris";
carro1.marca="Gris";
carro1.modelo="Gris";
carro1.odometro=100;

System.out.println("El color es :"+carro1.color);
System.out.println("La marca es :"+carro1.marca);
System.out.println("El modelo es :"+carro1.modelo);
System.out.println("El odometro es :"+carro1.odometro);

System.out.println("______________________________________________________________");

vehiculo taxi =new vehiculo();
taxi.color =JOptionPane.showInputDialog("Digite el color del taxi");
taxi.marca =JOptionPane.showInputDialog("Digite la marca del taxi");
taxi.modelo =JOptionPane.showInputDialog("Digite el modelo del taxi");
taxi.odometro=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el odometro del Taxi"));


JOptionPane.showMessageDialog(null,"El color del taxi es :"+taxi.color);
JOptionPane.showMessageDialog(null,"El modelo del taxi es :"+taxi.modelo);
JOptionPane.showMessageDialog(null,"La marca del taxi es :"+taxi.marca);
JOptionPane.showMessageDialog(null,"El odometro del taxi es :"+taxi.odometro);




} 
}
