public class Animal {
   
        String nombre;
        String tipo_alimentacion;
        Integer edad;
    public Animal(String nombre, String tipo_alimentacion,Integer edad) {
        this.nombre = nombre;
        this.tipo_alimentacion = tipo_alimentacion;
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoAlimentacionString() {
        return tipo_alimentacion;
    }
    public void setTipoAlimentacionString(String tipo_alimentacion) {
        this.tipo_alimentacion = tipo_alimentacion;
    }

    public Integer getEdad() {
        return edad;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    
    
    public static void main(String[] args) throws Exception {
        Perro perro1 = new Perro("pedro", "croquetas",5);
        perro1.setRaza("labrador");
        perro1.mostrar();
    }
}
    
    