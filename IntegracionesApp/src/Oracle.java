public class Oracle extends BDatos implements Operaciones{

        @Override
        public void conectar() {

            System.out.println("Se conecto a la clase Oracle");
        }

        @Override
        public void consultar() {

            System.out.println("Se consulto en la clase Oracle");
        }

        @Override
        public void insertar() {

            System.out.println("Se inserto en la clase Oracle");
        }

        @Override
        public void eliminar() {

            System.out.println("Se elimino de la clase Oracle");

        }
    }


