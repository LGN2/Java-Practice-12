/**
 * Task 433: interface and abstract class explanation.
 */
public class Task433InterfaceVsAbstractClass {
    public static void main(String[] args) {
        System.out.println("An interface defines rules that implementing classes promise to follow.");
        System.out.println("An abstract class can define shared fields, constructors, and both abstract and completed methods.");
        System.out.println("A class can implement many interfaces because interfaces describe capabilities without adding multiple parent states.");
        System.out.println("Java allows only one extended class so an object has one clear class inheritance path.");
        System.out.println("The diamond problem happens when two parents provide the same method and the child cannot know which version to inherit.");
        System.out.println("Java avoids class-based ambiguity by prohibiting multiple class inheritance and requires conflicting interface defaults to be overridden.");
    }
}
