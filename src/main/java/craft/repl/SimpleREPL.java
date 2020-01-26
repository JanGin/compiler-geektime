package craft.repl;

import craft.base.ASTNode;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SimpleREPL {


    private static final String USER = System.getProperty("user.name");

    private static final String LINE = System.getProperty("line.separator");

    public static void main(String[] args) {
        boolean verbose = false;
        if (args.length > 0 && args[0].equals("-v")) {
            verbose = true;
        }

        System.out.println("Welcome to simple script command.");
        String bash = LINE+USER+">";
        SimpleParser parser = new SimpleParser(verbose);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(bash);
        String script = "";
        while (true) {

            try {
                String line = reader.readLine().trim();
                if ("exit()".equals(line)) {
                    System.out.println("good bye!");
                    break;
                }

                script += line + LINE;
                ASTNode tree = parser.parse(script);
                if (verbose) {
                    parser.dumpText(tree, "");
                }
                parser.eval(tree, "");          //will print result to standard in
                System.out.print(bash);

                script = "";

            } catch (Exception e) {
                System.out.println(e.getLocalizedMessage());
                script = "";
                System.out.print(bash);
            }
        }


    }

}
