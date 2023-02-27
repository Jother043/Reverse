public class Main {
    public static void main(String[] args) {
        Reverse obj = new Reverse();
        Reverse<Integer> listaReverse = new Reverse<>();
        listaReverse.add(1);
        listaReverse.add(2);
        listaReverse.add(3);
        listaReverse.add(4);
        listaReverse.add(5);
        listaReverse.add(6);
        listaReverse.add(7);
        listaReverse.add(8);
        System.out.println("Lista de origen: " + listaReverse);
        System.out.println("Lista después del método reverse: " + listaReverse.reverse(listaReverse));

    }
}