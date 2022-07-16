package AdvanceKotlin;

public class Student {
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String Name){
        this.name = Name;
    }
    //this to methods are getters and setters in java

    /*
    * in kotlin no need to getters and setters need to get and get or set value
    * after the compiling java and kotlin files both files give the .class file which convert into byte code
    * with the help of JVM
    * kotlin also work on JVM
    * we can convert our java code into kotlin in intelij IDE
    * code -> convert java file to kotlin file
    * www.javadecompile.com we can decompile bytecode into source code using this website*/
}
