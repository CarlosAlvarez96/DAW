
public class Empleado implements Comparable<Empleado>{
    private String nombre;
    private String puesto; 
    private int sueldo;
    
    public Empleado(String s, String p, int n){
        this.nombre=s;
        this.puesto=p;
        this.sueldo=n;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    @Override
    public int compareTo(Empleado o){
        return this.sueldo-o.sueldo;
    }
    @Override
    public String toString(){
        return nombre;
    }
}
