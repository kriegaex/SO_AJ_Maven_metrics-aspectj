package de.scrum_master.app;

/**
 *
 * http://stackoverflow.com/questions/33852919/metrics-aspectj-timed-method-on-base-class-throws-nullpointerexception-when-cla
 *
 */
public class Application {
    public static void main(String[] args) {
        Base base = new Base();
        base.something_not_timed();
        base.method1();
        Derived derived = new Derived();
        derived.something_not_timed();
        derived.method1();
    }
}
