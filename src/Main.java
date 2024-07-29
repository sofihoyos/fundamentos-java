public class Main {
        public static void mostrarMenuPrincipal() {
            System.out.println("----- MENÚ PRINCIPAL -----");
            System.out.println("1. Casteo");
            System.out.println("2. Operadores de Asignacion");
            System.out.println("3. Operadores de Incremento y Decremento");
            System.out.println("4. Ejercicios Combinados");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
        }

        public static void mostrarSubmenuCasteo() {
            System.out.println("----- CASTEO -----");
            System.out.println("1. Ejercicio");
            System.out.println("2. Ejercicio");
            System.out.println("3. Ejercicio");
            System.out.println("4. Ejercicio");
            System.out.println("5. Ejercicio");
            System.out.println("6. Ejercicio");
            System.out.println("7. Ejercicio");
            System.out.println("8. Ejercicio");
            System.out.println("9. Ejercicio");
            System.out.println("10. Ejercicio");
            System.out.println("11. Volver al menú principal");
            System.out.print("Selecciona una opción: ");
        }

        public static void mostrarSubmenuAsignacion() {
            System.out.println("----- OPERADORES DE ASIGNACION -----");
            System.out.println("1. Ejercicio");
            System.out.println("2. Ejercicio");
            System.out.println("3. Ejercicio");
            System.out.println("4. Ejercicio");
            System.out.println("5. Ejercicio");
            System.out.println("6. Volver al menú principal");
            System.out.print("Selecciona una opción: ");
        }

        public static void mostrarSubmenuID() {
            System.out.println("----- OPERADORES DE INCREMENTO Y DECREMENTO -----");
            System.out.println("1. Ejercicio");
            System.out.println("2. Ejercicio");
            System.out.println("3. Ejercicio");
            System.out.println("4. Ejercicio");
            System.out.println("5. Ejercicio");
            System.out.println("6. Volver al menú principal");
            System.out.print("Selecciona una opción: ");
        }

        public static void mostrarSubmenuCombinados() {
            System.out.println("----- EJERCICIOS COMBINADOS -----");
            System.out.println("1. Ejercicio");
            System.out.println("2. Ejercicio");
            System.out.println("3. Ejercicio");
            System.out.println("4. Ejercicio");
            System.out.println("5. Ejercicio");
            System.out.println("6. Ejercicio");
            System.out.println("7. Ejercicio");
            System.out.println("8. Ejercicio");
            System.out.println("9. Ejercicio");
            System.out.println("10. Ejercicio");
            System.out.println("11. Volver al menú principal");
            System.out.print("Selecciona una opción: ");
        }
        //

        public static void casteoUno(){
            int x = (int) 5.89 + (int) 3.45;
            System.out.println("El resultado es: " +x);
        }

        public static void casteoDos(){
            char c = 'A';
            int n = (int) c;
            System.out.println("El resultado es: " +n);
        }

        public static void casteoTres(){
            double d = 100.04;
            long l = (long)d;
            int i = (int)l;
            System.out.println("El resultado es: " +i);
        }

        public static void casteoCuatro(){
            char myChar = 'E';
            int myInt = (int) myChar;
            System.out.println("El resultado es: " +myInt);
        }

        public static void casteoCinco(){
            int result =  (char) (byte) -1;
            System.out.println("Resultado: " + result);
        }

        public static void casteoSeis(){
            int numero = 65;
            char caracter = (char) numero;
            System.out.println("El resultado es: " +caracter);
        }

        public static void casteoSiete(){
            long s = 180;
            int h = (int)s;
            System.out.println("El resultado es: " +h);
        }

        public static void casteoOcho(){
            float v = 17;
            String m ="" + v;
            System.out.println("El resultado es: " +m);
        }

        public static void casteoNueve(){
            int resultado = (int) Math.round(3.7);
            System.out.println("El resultado es: " +resultado);
        }

        public static void casteoDiez(){
            byte b = 50;
            short w = (short) b;
            System.out.println("El resultado es: " +w);
        }
        //
        public static void asignacionUno(){
            int x = 10;
            x += 5;
            System.out.println("El resultado es: " +x);
        }

        public static void asignacionDos(){
            int s = 2;
            int y = 25;
            y *= (s + 5);
            System.out.println("El resultado es: " +y);
        }

        public static void asignacionTres(){
            int a = 15;
            a %= 4;
            System.out.println("El resultado es: " +a);
        }

        public static void asignacionCuatro(){
            int h = 19;
            int b = 17;
            h+=b;
            System.out.println("El resultado es: " +h);
        }

        public static void asignacionCinco(){
            int m =5;
            m^=2;
            System.out.println("El resultado es: " +m);
        }

        //
        public static void IDuno(){
            int x = 5;
            int y = ++x;
            System.out.println(x);
            System.out.println(y);
        }

        public static void IDdos(){
            int a = 5;
            System.out.println(a++);
            System.out.println(a);
        }

        public static void IDtres(){
            int count = 3;
            count--;
            System.out.println("El resultado es: " +count);
        }

        public static void IDcuatro(){
            int i = 7;
            ++i;
            System.out.println("Operacion antes de usar el valor"+i);
            int i2 = 7;
            i2++;
            System.out.println("Operacion despues de usar el valor"+i2);
        }

        public static void IDcinco(){
            int xf = 3;
            xf++;
            System.out.println("El resultado es: " +xf);
        }

        //
        public static void combinadosUno(){
            int i = 5;
            i += ++i + i++ + ++i;
            System.out.println("El resultado es: " +i);
        }

        public static void combinadosDos(){
            double myDouble = 1.9;
            int myInt = (int) myDouble;
            System.out.println(myInt);
            System.out.println(++myInt);
        }

        public static void combinadosTres(){
            double d = 5.7;
            int i = (int)d;
            i *= 2;
            System.out.println(i--);
        }

        public static void combinadosCuatro(){
            int i = 10;
            double d = i;
            d /= 2.0;
            System.out.println("El resultado es: " +d);
        }

        public static void combinadosCinco(){
            char c = 'X';
            c += 32;
            System.out.println("El resultado es: " +c);
        }

        public static void combinadosSeis(){
            long l = 12345L;
            short s = (short) l;
            s*= 3;
            System.out.println("El resultado es: " +s);
        }

        public static void combinadosSiete(){
            int x = 10;
            x += (x++) + (++x);
            System.out.println("El resultado es: " + x);
        }

        public static void combinadosOcho(){
            float f = 10.5f;
            byte b = (byte) f;
            b = (byte) (--b);
            System.out.println("El resultado es: " + b);
        }

        public static void combinadosNueve(){
            int i = 257;
            byte b = (byte) i;
            System.out.println("El resultado es: " + b);
        }

        public static void combinadosDiez(){
            double d = 7.8;
            int i = (int) d;
            i += 5;
            i++;
            System.out.println("El resultado es: " + i);
        }
    }