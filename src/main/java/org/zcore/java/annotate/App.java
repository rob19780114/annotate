package org.zcore.java.annotate;

/**
 * sample app class, which prints out
 * an annotation value
 * @author rob <rob@zcore.org>
 */
@Todo("Document this")
final public class App {

    /**
     * Using a field here
     */
    private final static Todo TODO =
            App.class.getAnnotation(Todo.class);

    /**
     * Construct is not needed here,
     * Simply here to shut up pmd ;)
     */
    private App() {}

    /**
     * main method
     * @param args command line arguments (not handled here)
     */
    public static void main(final String[] args) {
        System.out.println(TODO.value());
    }
}
