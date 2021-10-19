class _18 {

    public static void main(String[] args) throws InterruptedException {
        int a = 1, b = 1, p = 0;

        for (a = 1; a <= 5; a++) {
            for (b = 1; b <= a; b++) {
                p++;
                print(p + " ");
            }
            System.out.println();
        }
    }

    public static void println(String st) throws InterruptedException {
        print(st);
        System.out.println();
        Thread.sleep(200);
    }

    public static void print(String st) throws InterruptedException {

        // Could use this, but it is unoptimized!:
        /*
         * char[] ch = st.toCharArray();
         * 
         * for (char c : ch) {
         * 
         * System.out.print(c);
         * 
         * Thread.sleep(10); }
         */

        for (int i = 0; i < st.length(); i++) {
            char c = st.charAt(i);
            System.out.print(c);

            switch (c) {
                case ',':
                    Thread.sleep(350);
                    break;
                case '.':
                    Thread.sleep(150);
                    break;
                case '!':
                    Thread.sleep(550);
                    break;
                default:
                    Thread.sleep(20);
                    break;
            }
        }

    }

}
