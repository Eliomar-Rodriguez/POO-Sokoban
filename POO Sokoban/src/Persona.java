public class Persona {

    private String nombre;

    private String cedula;

    private String correo;

    private String contra;

    private String fechaRegistro;

    private String foto;

    public Persona(String n, String id, String cor, String contra, String fechaReg, String foto) {
    }
    
    
    public void setNombre(String n) {
        this.nombre = n;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCedula(String id) {
        this.cedula = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCorreo(String corr) {
        this.correo = corr;
    }

    public String getCorreo() {
        return correo;
    }

    public void setContra(String cont) {
        this.contra = cont;
    }

    public String getContra() {
        return contra;
    }

    public void setFechaReg(String fReg) {
        this.fechaRegistro = fReg;
    }

    public String getFechaReg() {
       return fechaRegistro;
    }

    public void setFoto(String f) {
        this.foto = f;
    }

    public String getFoto() {
       return foto;
    }

    public void agregarNombre() {
    }

    public void agregarCorreo() {
    }

    public void agregarCedula() {
    }

    public void agregarContra() {
    }

    public void agregarFechaReg() {
    }

    public void agregarFoto() {
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", cedula=" + cedula + ", correo=" + correo + ", contra=" + contra + ", fechaRegistro=" + fechaRegistro + ", foto=" + foto + '}';
    }
    
    
}
