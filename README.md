# set-exercise-java

The purpose of this exercise is to create an implementation of the `Set<E>` class, a data structure, while pretending that the `java.util.Set<E>` interface does not exist (nor anything in `java.util.*` implementing that interface).

A __set__ contains only distinct elements. It should be possible to add the same element more than once, but the set should not change in size upon adds of an element that is already there.

Therefore, it should be possible to add and remove elements from `Set` and get those elements back, as well as to query the size of the set.

Using the principles of test-driven development (TDD), one is to create `Set<E>` from scratch within a given time-frame, such as 1 hour. You might be surprised how much you can get done of this in the given time-frame using TDD.

The first draft of `Set.java` should do nothing more than make sure there are zero errors, though perhaps plenty of warnings. The first draft of `SetTest.java` should probably only have one test.