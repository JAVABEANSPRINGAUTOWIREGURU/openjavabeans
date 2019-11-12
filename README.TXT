OpenJavaBeans - JavaBeans-Compliant Java Implementation

This compiler implements the JavaBeans.

USAGE

You need to compile the source code into an OpenJavaBean-compliant Bean:

./Compiler/javac <path-to-java-file>.java

This step is optional as the javac executable is only provided for compatibility purposes
and does nothing.

Next, you execute the compiled java file, provided it is written in JavaBeans-compliant Java:

./Compiler/java <path-to-java-file>.java

ENVIRONMENT VARIABLES

  OPENJAVABEANS_CLASSPATH
    Path to runtime OpenJavaBean classes (defaults to Compiler/Classpath)

EXAMPLES

./Compiler/java ./Examples/Main.java