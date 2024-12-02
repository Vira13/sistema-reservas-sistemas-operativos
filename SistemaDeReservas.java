import java.time.LocalTime;
import java.util.Date;

// Clase Administrador
class Administrador {
    private int id;
    private String nombre;
    private String email;

    // Constructor
    public Administrador(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }
}

// Clase GestorSalas
class GestorSalas {
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;
    private String semanaHabil;

    // Constructor
    public GestorSalas(LocalTime horarioApertura, LocalTime horarioCierre, String semanaHabil) {
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
        this.semanaHabil = semanaHabil;
    }
}

// Clase Sala
class Sala {
    private int id;
    private String nombre;
    private int capacidad;
    private String tipo;

    // Constructor
    public Sala(int id, String nombre, int capacidad, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.tipo = tipo;
    }
}

// Clase Reserva
class Reserva {
    private int id;
    private Date fecha;
    private LocalTime horarioInicio;
    private LocalTime horarioFin;
    private String estado;

    // Constructor
    public Reserva(int id, Date fecha, LocalTime horarioInicio, LocalTime horarioFin, String estado) {
        this.id = id;
        this.fecha = fecha;
        this.horarioInicio = horarioInicio;
        this.horarioFin = horarioFin;
        this.estado = estado;
    }
}

// Clase Empleado
class Empleado {
    private int id;
    private String nombre;
    private String email;

    // Constructor
    public Empleado(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }
}