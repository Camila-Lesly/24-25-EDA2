public class Main {
    public static void main(String[] args) {
        Persona primeraPersona = new Persona("Juan", 25);
        Empleado primerEmpleado = new Empleado("Maria", 30, 70.0, 165, 'F', 9000, 50, 180, 10, "Recursos Humanos");

        System.out.println(primeraPersona.toString());
        System.out.println(primerEmpleado.toString());

        Persona segundaPersona = new Empleado("Pedro", 35, 75.0, 175, 'M', 12000, 60, 190, 15, "TI");

        if (segundaPersona instanceof Empleado) {
            Empleado empleadoDesdePersona = (Empleado) segundaPersona;
            empleadoDesdePersona.trabajar();
        }

        Persona[] personas = new Empleado[2];
        personas[0] = new Empleado();

        if (segundaPersona instanceof Empleado) {
            System.out.println(segundaPersona.getNombre() + " es un Empleado.");
        }

        Empleado segundoEmpleado = new Empleado("Carlos", 40, 80.0, 180, 'M', 15000, 65, 200, 20, "Ventas");
        Persona personaDesdeEmpleado = segundoEmpleado;
        System.out.println(segundoEmpleado.equals(personaDesdeEmpleado));

        System.out.println(primerEmpleado.toString());

        Trabajador trabajador = new Empleado();
        trabajador.trabajar();
    }
}
