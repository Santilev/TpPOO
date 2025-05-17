package logica ;

public class PacientePediatrico extends Paciente implements iDA, iDN {
    private double peso;
    private String celular;
    private String tutor;
    private String dieta;

   public PacientePediatrico(String dni, String nombre, String obraSocial,
                              double peso, String celular,
                              String tutor, String dieta) {
        super(dni, nombre, obraSocial);
        this.peso = peso;
        this.celular = celular;
        this.tutor = tutor;
        this.dieta = dieta;
    }
    @Override
    public String getCobertura() {     
        return null;
    }

    @Override
    public double getDescuento() {
       
        return 0;
       
    }

    @Override
    public String getVademecum() {
        return null;
    }

    @Override
    public String getDieta() {
        return null;
    }
          
    
    }