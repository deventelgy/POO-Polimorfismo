public class Perro extends Animal {
    private String raza;

    public Perro(String _raza, String _nombre, String _tipo_alimentacion, int _edad){
        this.raza = _raza;
    }
   public String getRaza(){
        return raza;
   }

   public void setRaza(String _raza){
        this.raza = _raza;
   }
   public void mostrar(){
        System.out.println(getNombre()+"-"+getTipo_alimentacion()+"-"+getEdad()+"-"+getRaza());
   }

    @Override
    public void alimentarse() {
        System.out.println("Me alimento de Croquetas");
    }
}
