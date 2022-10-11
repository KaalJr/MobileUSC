public class MySql extends BDatos implements Operaciones{



        @Override
        public void conectar() {

            System.out.println("Se conecto a la clase MySql");
        }

        @Override
        public void consultar() {

            System.out.println("Se consulto en la clase MySql");
        }

        @Override
        public void insertar() {

            System.out.println("Se inserto en la clase MySql");
        }

        @Override
        public void eliminar() {

            System.out.println("Se elimino de la clase MySql");
        }
    }

