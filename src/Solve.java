import java.util.Scanner;
public class Solve {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int opcionMenu = 0;
        int opcionSubmenu = 0;
        boolean salir = false;

        while (!salir) {
            Main.mostrarMenuPrincipal();
            opcionMenu = scanner.nextInt();
            boolean salirSubmenu = false;

            switch (opcionMenu) {
                case 1:
                    System.out.println("1. Casteo");


                    while (!salirSubmenu) {
                        Main.mostrarSubmenuCasteo();
                        opcionSubmenu = scanner.nextInt();

                        switch (opcionSubmenu) {
                            case 1:
                                // ¿Cuál será el resultado de la siguiente operación?
                                Main.casteoUno();
                                break;
                            case 2:
                                //2.  Dado char c = 'A';, ¿cómo convertirías c a su valor ASCII como un int?
                                Main.casteoDos();
                                break;
                            case 3:
                                // 3. ¿Qué valor se imprimirá?
                                Main.casteoTres();
                                break;
                            case 4:
                                // 4. Escribe código para convertir un String que contiene un número a un int.
                                Main.casteoCuatro();
                                break;
                            case 5:
                                // 5. ¿Cuál es el resultado de (int) (char) (byte) -1?
                                Main.casteoCinco();
                                break;
                            case 6:
                                // 6. Convierte el número 65 a un char. ¿Qué carácter obtienes?
                                Main.casteoSeis();
                                break;
                            case 7:
                                // 7. ¿Qué sucede si intentas asignar un long a un int sin casteo explícito?
                                Main.casteoSiete();
                                break;
                            case 8:
                                //8. Escribe código para convertir un float a un String.
                                Main.casteoOcho();
                                break;
                            case 9:
                                // 9. ¿Cuál es el resultado de (int) Math.round(3.7)?
                                Main.casteoNueve();
                                break;
                            case 10:
                                //10. Dado byte b = 50;, ¿cómo lo convertirías a short?
                                Main.casteoDiez();
                                break;
                            case 11:
                                System.out.println("Volviendo al menú principal.");
                                salirSubmenu = true;
                                break;
                            default:
                                System.out.println("Opción no válida. Inténtalo de nuevo.");
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("2. Operadores de Asignacion");

                    while (!salirSubmenu) {
                        Main.mostrarSubmenuAsignacion();
                        opcionSubmenu = scanner.nextInt();

                        switch (opcionSubmenu) {
                            case 1:
                                // 1. ¿Cuál es el valor de x después de la siguiente operación?
                                Main.asignacionUno();
                                break;
                            case 2:
                                // 2. Simplifica la siguiente expresión usando un operador de asignación compuesta:
                                //y = y (s + 5);
                                Main.asignacionDos();
                                break;
                            case 3:
                                // 3. ¿Cuál es el valor de a después de estas operaciones?
                                //int a = 15; a %= 4;
                                Main.asignacionTres();
                                break;
                            case 4:
                                // 4. Escribe una expresión equivalente a x = x + y usando un operador de asignación compuesta.
                                Main.asignacionCuatro();
                                break;
                            case 5:
                                // 5. Qué hace la siguiente operación? x ^= 2;
                                Main.asignacionCinco();
                                break;
                            case 6:
                                System.out.println("Volviendo al menú principal.");
                                salirSubmenu = true;
                                break;
                            default:
                                System.out.println("Opción no válida. Inténtalo de nuevo.");
                                break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("3. Operadores de Incremento y Decremento");

                    while (!salirSubmenu) {
                        Main.mostrarSubmenuID();
                        opcionSubmenu = scanner.nextInt();

                        switch (opcionSubmenu) {
                            case 1:
                                //1. ¿Cuál es el valor de x e y después de estas operaciones?
                                //int x = 5; int y = ++x;
                                Main.IDuno();
                                break;
                            case 2:
                                // 2. ¿Qué se imprimirá en la consola?
                                //int a = 5; System.out.println(a++); System.out.println(a);
                                Main.IDdos();
                                break;
                            case 3:
                                // 3. Escribe código que use el operador de decremento para disminuir una variable count en 1.
                                Main.IDtres();
                                break;
                            case 4:
                                // 4. ¿Cuál es la diferencia entre ++i y i++?
                                Main.IDcuatro();
                                break;
                            case 5:
                                // 5. ¿Qué valor tendrá xf después de esta operación?
                                Main.IDcinco();
                                break;
                            case 6:
                                System.out.println("Volviendo al menú principal.");
                                salirSubmenu = true;
                                break;
                            default:
                                System.out.println("Opción no válida. Inténtalo de nuevo.");
                                break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("4. Ejercicios Combinados");
                    while (!salirSubmenu) {
                        Main.mostrarSubmenuCombinados();
                        opcionSubmenu = scanner.nextInt();

                        switch (opcionSubmenu) {
                            case 1:
                                Main.combinadosUno();
                                break;
                            case 2:
                                Main.combinadosDos();
                                break;
                            case 3:
                                Main.combinadosTres();
                                break;
                            case 4:
                                Main.combinadosCuatro();
                                break;
                            case 5:
                                Main.combinadosCinco();
                                break;
                            case 6:
                                Main.combinadosSeis();
                                break;
                            case 7:
                                Main.combinadosSiete();
                                break;
                            case 8:
                                Main.combinadosOcho();
                                break;
                            case 9:
                                Main.combinadosNueve();
                                break;
                            case 10:
                                Main.combinadosDiez();
                                break;
                            case 11:
                                System.out.println("Volviendo al menú principal.");
                                salirSubmenu = true;
                                break;
                            default:
                                System.out.println("Opción no válida. Inténtalo de nuevo.");
                                break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        }
        scanner.close();
    }
}