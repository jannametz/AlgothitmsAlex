public class Main {
    public static void main(String[] args) {

        String s1 = "abcd";
        String s2 = "cbdae";
        System.out.println(findCharcterXY(s1, s2));

    }
            static char findCharcterXY(String s1,
                                        String s2)
        {
             int resultat = 0, i;
                for (i = 0; i < s1.length(); i++)
                {
                    resultat ^= s1.charAt(i);//Ein Exklusiv-Oder-Gatter, auch XOR-Gatter
                }
                for (i = 0; i < s2.length(); i++)
                {
                    resultat ^= s2.charAt(i); //XOR , Ein Exklusiv-Oder-Gatter, auch XOR-Gatter
                }
                return ((char)(resultat));
            }
}