
public class ArrayAleatorio {

  public static void main(String[] args) {
    final int LONGITUD_ARRAY = 20;
    final int MAX_ARRAY = 20;
    final int MIN_ARRAY = 10;
    int[] arrayAleatorio = new int[LONGITUD_ARRAY];
    
    System.out.print("[");
    generaArray(MAX_ARRAY, MIN_ARRAY, arrayAleatorio);
    imprimeArray(arrayAleatorio);
    System.out.print("]");

  }

  private static void imprimeArray(int[] arrayAleatorio) {
    for (int i = 0; i < arrayAleatorio.length; i++) {
      System.out.print(arrayAleatorio[i]);
      if (i != (arrayAleatorio.length - 1)) {
        System.out.print(", ");
      }
    }
  }

  private static void generaArray(final int MAXIMO_ARRAY, final int MINIMO_ARRAY,
      int[] arrayAleatorio) {
    for (int i = 0; i < arrayAleatorio.length; i++) {
      arrayAleatorio[i] = (int) (Math.random() * (MAXIMO_ARRAY - MINIMO_ARRAY + 1) + MINIMO_ARRAY);
    }
  }

}
