public class Postgres extends BDatos implements Operaciones{



        @Override
        public void conectar() {

            System.out.println("Se conecto a la clase Postgres");
        }

        @Override
        public void consultar() {

            System.out.println("Se consulto en la clase Postgres");
        }

        @Override
        public void insertar() {

            System.out.println("Se inserto en la clase Postgres");
        }

        @Override
        public void eliminar() {

            System.out.println("Se elimino de la clase Postgres");
        }
    }

