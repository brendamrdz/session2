public class Perro extends Animal{
    private String raza;
    public Perro (String nombre, String tipo_alimentacion,Integer edad){
        super(nombre, tipo_alimentacion, edad);
        this.raza= "";
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public void mostrar() {
        System.out.println ("Nombre del animal: " + getNombre() + " \nTipo de Alimentación: " +  getTipoAlimentacionString() + "\nEdad del Animal: " + getEdad() + "\nRaza del Animal: "+getRaza() ); }

} 