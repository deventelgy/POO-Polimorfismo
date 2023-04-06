public abstract class Animal {
    private String nombre;
    private String tipo_alimentacion;
    private int edad;

    //Constructor con parámetro
    public Animal(String _nombre, String _tipo_alimentacion, int _edad) {
        this.nombre = _nombre;
        this.tipo_alimentacion = _tipo_alimentacion;
        this.edad = _edad;
    }

    //Constructor sin parametro
    public Animal() {

    }

    //Método de acceso
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String _nombre){
        this.nombre = _nombre;
    }
    public String getTipo_alimentacion(){
        return tipo_alimentacion;
    }
    public void setTipo_alimentacion(String _tipo_alimentacion){
        this.tipo_alimentacion = _tipo_alimentacion;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int _edad){
        this.edad = _edad;
    }
    public abstract void alimentarse();
        //cómo defino el método alimentarse para que se comporte de diferente manera según el objeto que le instancie?.
    public void moverse(){
        System.out.println("El animal se está moviendo");
    }

}
