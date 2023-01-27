# Set Exercise
The purpose of this exercise is to create an implementation of the `Set<E>` class, a data structure, while pretending that the `java.util.Set<E>` interface does not exist (nor anything in `java.util.*` implementing that interface).

A __set__ contains only distinct elements. It should be possible to add the same element more than once, but the set should not change in size upon adds of an element that is already there.

Therefore, it should be possible to add and remove elements from `Set` and get those elements back, as well as to query the size of the set.

Using the principles of test-driven development (TDD), one is to create `Set<E>` from scratch within a given time-frame, such as 1 hour. You might be surprised how much you can get done of this in the given time-frame using TDD.

The first draft of `Set.java` should do nothing more than make sure there are zero errors, though perhaps plenty of warnings. The first draft of `SetTest.java` should probably only have imports and maybe one test.

## Project setup

### Setup SDK
Make sure you set up your Java SDK. The IDE may prompt you to set it up in the upper right corner of the screen but if it doesn't follow the directions below.
1. Open **Project Structure** by pressing `⌘ + ;`
2. Under **Project Settings** -> **Project** -> **SDK**, Select a Java version, preferrably something higher than 8. ie. 1.8 OpenJDK

### Importing JUnit for tests
When importing JUnit with the `@Test` annotation, add **JUnit5.8.1** to the classpath.

### Troubleshooting
If you can't find project files (src directory) within the Project Files pane after pulling the repo, follow the steps below:
1. Open **Project Structure** by pressing `⌘ + ;`
2. Under **Project Settings** -> **Modules** hit the `+` button to add a new Module.
3. Select the project **set-exercise-java**, click Apply and OK.
