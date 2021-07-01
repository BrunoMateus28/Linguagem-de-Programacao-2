public class P1nX {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.print("Numero de argumentos insuficiente.");
        } else if (args.length > 3) {
            System.out.print("Numero de argumentos excessivo.");
        } else if (args.length == 1) {
            try {
                double r = Double.parseDouble(args[0]);
                if (r < 0) {
                    System.out.println("Numero deve ser positivo.");
                } else {
                    System.out.printf("A area do circulo e: %.2f unidades de area.", calcula(r));
                }
            } catch (Exception e) {
                System.out.println(args[0] + " nao e um numero.");
            }
        } else if (args.length == 2) {
            double a = -1, b = -1;
            try {
                a = Double.parseDouble(args[0]);
                if (a < 0) {
                    throw new Exception("Argumento 1 nao pode ser negativo");
                }
            } catch (Exception e) {
                if (e.getMessage() == "Argumento 1 nao pode ser negativo") {
                    System.out.println(e.getMessage());
                } else {
                    System.out.println("Argumento 1: " + args[0] + " nao e um numero.");

                }
            }
            try {
                b = Double.parseDouble(args[1]);
                if (b < 0) {
                    throw new Exception("Argumento 2 nao pode ser negativo");
                }
            } catch (Exception e) {
                if (e.getMessage() == "Argumento 2 nao pode ser negativo") {
                    System.out.println(e.getMessage());
                } else {
                    System.out.println("Argumento 2: " + args[1] + " nao e um numero.");

                }
            }
            if (a > 0 && b > 0) {
                System.out.printf("A area do retangulo e: %.2f unidades de area.", calcula(a, b));
            }
        } else if (args.length == 3) {
            double l1 = -1, l2 = -1, l3 = -1;
            try {
                l1 = Double.parseDouble(args[0]);
                if (l1 < 0) {
                    throw new Exception("Argumento 1 nao pode ser negativo");
                }
            } catch (Exception e) {
                if (e.getMessage() == "Argumento 1 nao pode ser negativo") {
                    System.out.println(e.getMessage());
                } else {
                    System.out.println("Argumento 1: " + args[0] + " nao e um numero.");

                }
            }
            try {
                l2 = Double.parseDouble(args[1]);
                if (l2 < 0) {
                    throw new Exception("Argumento 2 nao pode ser negativo");
                }
            } catch (Exception e) {
                if (e.getMessage() == "Argumento 2 nao pode ser negativo") {
                    System.out.println(e.getMessage());
                } else {
                    System.out.println("Argumento 2: " + args[1] + " nao e um numero.");

                }
            }
            try {
                l3 = Double.parseDouble(args[2]);
                if (l3 < 0) {
                    throw new Exception("Argumento 3 nao pode ser negativo");
                }
            } catch (Exception e) {
                if (e.getMessage() == "Argumento 3 nao pode ser negativo") {
                    System.out.println(e.getMessage());
                } else {
                    System.out.println("Argumento 3: " + args[2] + " nao e um numero.");

                }
            }
            if (l1 > 0 && l2 > 0 && l3 > 0) {
                String tipoTriangulo = verificaTriangulo(l1, l2, l3);
                if (tipoTriangulo != "Nao e triangulo.") {
                    System.out.printf("A area do triangulo e: %.2f unidades de area.\n", calcula(l1, l2, l3));
                    System.out.print(tipoTriangulo);
                } else {
                    System.out.print("Dados nao formam um triangulo.\n");
                }
            }
        }
    }

    private static double calcula(double r) {
        return 3.14 * r * r;
    }

    private static double calcula(double b, double a) {
        return a * b;
    }

    private static double calcula(double l1, double l2, double l3) {
        double p = (l1 + l2 + l3) / 2;
        return Math.sqrt(p * (p - l1) * (p - l2) * (p - l3));
    }

    private static String verificaTriangulo(double l1, double l2, double l3) {
        if (l1 < l2 + l3 && l2 < l1 + l3 && l3 < l1 + l2) {
            if (l1 == l2 && l1 == l3) {
                return "Triangulo equilatero.";
            } else if (l1 == l2 || l1 == l3 || l2 == l3) {
                return "Triangulo isosceles.";
            } else {
                return "Triangulo escaleno.";
            }
        } else {
            return "Nao e triangulo.";
        }
    }
}
