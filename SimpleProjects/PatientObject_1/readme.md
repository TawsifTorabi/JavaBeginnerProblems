It was a exam question on my OOP course.

## Question:
Suppose you have to develop a java class  **Patient**  for your client. Inside of the  **src**  package  
there is a package named  **patients**.  The  **Patient**  class is located inside of the  **patients**  
package.  The  **Patient**  class does have instance variables  **pid, pname, history** and  
**medicines**. The  **history**  data field contains the patients’ previous medical records. And the  
**medicines**  data field contains the prescribed medicines provided by a doctor. Your client  
asked to keep  **history** and **medicines**  directly inaccessible from other classes. Those  
variables have to be accessed by some  **String getter()**  and  **setter**  methods. The  **Patient**  
class  also  have  two  parameterized  constructors  **[Patient(int  pid,  String  pname),  
Patient(int  pid,  String  pname,  String  history)].**  
You also have to create a class named  **Main**  inside of the  **src**  package where you will be  
writing the  main method. Inside of the main method create an array of object of  **Patient**  
class. The number of objects will be user defined.

The  **pid, pname, history** and **medicines**  of each object will be also user defined as well.  
Take these information before creating each object and initialize the instance variables of  
the objects by calling the  **Patient(int pid, String pname, String history)** constructor.  
Also set all of the patients’ prescribed medicines by calling a  **setter**  method of the  **Patient**  
class. Finally print the  **medicines**  for all of the patients by using  **getter**  method of  **Patient**  
class.
