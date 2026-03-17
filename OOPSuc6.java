public class OOPSuc6 {
    public static String[] getOPattern() {
        return new String[] {
            "   ***     ",
            " **   **   ",
            "**     **  ",
            "**     **  ",
            "**     **  ",
            "**     **  ",
            "**     **  ",
            " **   **   ",
            "   ***     "
        };
    }
    public static String[] getO2Pattern() {
        return new String[] {
            "   ***     ",
            " **   **   ",
            "**     **  ",
            "**     **  ",
            "**     **  ",
            "**     **  ",
            "**     **  ",
            " **   **   ",
            "   ***     "
        };
    }
    public static String[] getPPattern() {
        return new String[] {
            " ******    ",
            "**    **   ",
            "**     **  ",
            "**     **  ",
            " ******    ",
            "**         ",
            "**         ",
            "**         ",
            "**         "
        };
    }
    public static String[] getSPattern() {
        return new String[] {
             "     ***** ",
            "  **       ",
            "**         ",
            "  *****    ",
            "      **   ",
            "        ** ",
            "       **  ",
            "       **  ",
            "  *****    "
        };
    }
    
    public static void main(String[] args) {
        String[] o1 = getOPattern();
        String[] o2 = getO2Pattern();
        String[] p = getPPattern();
        String[] s = getSPattern();
        for(int i = 0; i < 9; i++) {
            System.out.println(o1[i] + o2[i] + p[i] + s[i]);
        }
    }
}