public class strings {
    public static void main(String[] args) {
        String name="        Harry       ";
        System.out.println(name);

        // int value = name.length();
        // System.out.println(value);

        String upper=name.toUpperCase();
        System.out.println(upper);

        String lower=name.toLowerCase();
        System.out.println(lower);

        String trimmed=name.trim();
        System.out.println(trimmed);

        String sub=trimmed.substring(1, 3);
        System.out.println(sub);

        String repl=name.replace('r', 'p');
        System.out.println(repl);

        String repl1=name.replace("r", "abc");
        System.out.println(repl1);

        System.out.println(trimmed.startsWith("Har"));
        System.out.println(trimmed.endsWith("Har"));

        System.out.println(trimmed.charAt(4));
        System.out.println(trimmed.indexOf("ry"));
        System.out.println(trimmed.indexOf("h", 3));

        System.out.println(trimmed.equals("harry"));
        System.out.println(trimmed.equalsIgnoreCase("haRry"));
        System.out.println(trimmed.equalsIgnoreCase("happy"));

        System.out.println("I am an escape sequence character \" \n \\ \t \\");
    }
}

