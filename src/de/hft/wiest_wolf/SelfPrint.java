package de.hft.wiest_wolf;

/**
 *
 * @author Lukas Wiest
 * @author Erik Wolf
 */
public class SelfPrint
{
    public static void main(String[] args)
    {
        System.out.print(getText());
    }
    // Ab hier einfügen erlaubt
    private static final char c = 34;
    private static final char n = 10;

    private static String programText[] =
    {
        "package de.hft.wiest_wolf;" + n,
        "" + n,
        "/**" + n,
        " *" + n,
        " * @author Lukas Wiest" + n,
        " * @author Erik Wolf" + n,
        " */" + n,
        "public class SelfPrint" + n,
        "{" + n,
        "    public static void main(String[] args)" + n,
        "    {" + n,
        "        System.out.print(getText());" + n,
        "    }" + n,
        "    // Ab hier einfügen erlaubt" + n,
        "    private static final char c = 34;" + n,
        "    private static final char n = 10;" + n,
        "" + n,
        "    private static String programText[] =" + n,
        "    {" + n,
        "    };" + n,
        "" + n,
        "    private static String getText()" + n,
        "    {" + n,
        "        StringBuilder buf = new StringBuilder();" + n,
        "        String[] firstHalf = new String[19];" + n,
        "        String[] secondHalf = new String[programText.length - firstHalf.length];" + n,
        "        System.arraycopy(programText, 0, firstHalf, 0, firstHalf.length);" + n,
        "        System.arraycopy(programText, firstHalf.length, secondHalf, 0, secondHalf.length);" + n,
        "        for (String s: firstHalf)" + n,
        "            buf.append(s);" + n,
        "        for (String s: programText)" + n,
        "        {" + n,
        "            buf.append((char) 32);" + n,
        "            buf.append((char) 32);" + n,
        "            buf.append((char) 32);" + n,
        "            buf.append((char) 32);" + n,
        "            buf.append((char) 32);" + n,
        "            buf.append((char) 32);" + n,
        "            buf.append((char) 32);" + n,
        "            buf.append((char) 32);" + n,
        "            buf.append(c);" + n,
        "            buf.append(s.substring(0, s.length()-1));" + n,
        "            buf.append(c);" + n,
        "            buf.append((char) 32);" + n,
        "            buf.append((char) 43);" + n,
        "            buf.append((char) 32);" + n,
        "            buf.append((char) 110);" + n,
        "            buf.append((char) 44);" + n,
        "            buf.append(n);" + n,
        "        }" + n,
        "        buf.deleteCharAt(buf.length()-2);" + n,
        "        for (String s: secondHalf)" + n,
        "            buf.append(s);" + n,
        "        return buf.toString();" + n,
        "    }" + n,
        "// Ab hier einfügen verboten" + n,
        "}" + n
    };

    private static String getText()
    {
        StringBuilder buf = new StringBuilder();
        String[] firstHalf = new String[19];
        String[] secondHalf = new String[programText.length - firstHalf.length];
        System.arraycopy(programText, 0, firstHalf, 0, firstHalf.length);
        System.arraycopy(programText, firstHalf.length, secondHalf, 0, secondHalf.length);
        for (String s: firstHalf)
            buf.append(s);
        for (String s: programText)
        {
            buf.append((char) 32);
            buf.append((char) 32);
            buf.append((char) 32);
            buf.append((char) 32);
            buf.append((char) 32);
            buf.append((char) 32);
            buf.append((char) 32);
            buf.append((char) 32);
            buf.append(c);
            buf.append(s.substring(0, s.length()-1));
            buf.append(c);
            buf.append((char) 32);
            buf.append((char) 43);
            buf.append((char) 32);
            buf.append((char) 110);
            buf.append((char) 44);
            buf.append(n);
        }
        buf.deleteCharAt(buf.length()-2);
        for (String s: secondHalf)
            buf.append(s);
        return buf.toString();
    }
// Ab hier einfügen verboten
}
