class PrintArray {
    public static void main(String[] args) {	       

        int[] a = new int[10];	

        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}