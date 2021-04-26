# Project Report

Kyler Hudson

## Markdown Tips

If you are unfamiliar with MarkDown, check out 
[the official documentation](https://guides.github.com/features/mastering-markdown/).

Note that IntelliJ IDEA has a Markdown preview that you can access in 
the upper-right of the editor. Also, since Markdown documents&mdash;like
source code&mdash;should be human-readable, make sure you keep your lines
short, as you can see I have done in my Markdown files.

Please remove this subsection before submitting your report. 

## Challenge #1 Complete

Replaced the FakeQueryEngine with the WikipediaQueryEngine. Using the
Wikipedia query in order to establish a proper connection to Wikipedia
instead of a simulated one.

## Challenge #2 Complete

First, I started by creating an interface which I named "InterfaceFormatter".
I then created the "FormatterModule" class which works the same the "QueryEngineModule".
Then using the @Inject putting it into "WikipediaAnalyzer". Finally, to format the datetime
I used .replace to replace T and Z with something more readable to the user

## Challenge #3 Complete

Using stream() as well as map() to complete this challenge maps was used to store the elements.
Collect() then collected all the elements in respose and revisions() where they were then put into
one string.

## Reflection Question #1: Functional vs OO

functional programming is a programming paradigm where programs are constructed
by applying and composing functions. Functional can use mapping values to other values, rather 
than a sequence of imperative statements which update the running state of the program. 
The iterative approach requires having to manage a StringBuilder object, which requires
 multiple different calls for "append" in a for loop. Overall I prefer the functional approach.
 Mostly because I find it easier as well as the it being easier for me in the readability aspect.



## Reflection Question #2: Polymorphism and Dependency Inversion

In this application if we look at "FakeQueryEngine" and "WikipediaQueryEngine" they are essentially
both query engines. However, they do not give the same result as one is a simulation and the other
connects to Wikipedia. This is polymorphism shown in this application. For Depedency Inversion we can
look at the "QueryEngine" which connected to both of the classes. You could run either the "FakeQueryEngine"
or the "WikipediaQueryEngine" by just using the interface.

