package patients;
public class Patient {
  
    //Instance Variables
    public int pid;
    public String pname;
    private String history;
    private String medicines;

    //User Defined Constructor
    public Patient(int pid, String pname){
        this.pid = pid;
        this.pname = pname;
    }

    //User Defined Contructor
    public Patient(int pid, String pname, String history){
        this.pid = pid;
        this.pname = pname;
    }

    //Getter method for history
    public String getHistory(int pid){
        if(pid == this.pid) {
            return this.history;
        }else{
            //Return null if pid doesn't match with object variable
            return null;
        }
    }

    public void setHistory(int pid, String history){
        if(pid == this.pid) {
            //If pid matches with object pid, set history variable
            this.history = history;
        }
    }

    //Getter method for medicines
    public String getMedicines(int pid){
        if(pid == this.pid) {
            return this.medicines;
        }else{
            return null;
        }
    }

    //Setter method for medicines
    public void setMedicines(int pid, String medicines){
        if(pid == this.pid) {
            this.medicines = medicines;
        }
    }
}
