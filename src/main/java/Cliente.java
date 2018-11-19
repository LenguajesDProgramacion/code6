public abstract class Cliente {
    private String key;
    private String nombre;

    public Cliente (String key, String nombre){
        this.key = key;
        this.nombre = nombre;

    }

    public String getKey() {
        return key;
    }
    public void setKey(String key){
        this.key = key;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



}
