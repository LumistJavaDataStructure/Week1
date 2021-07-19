public class BankAccount {
    private String aName;
    private int aAge;
    private String aPassword;
    private String aTelephone;

    public BankAccount(String pName, int pAge, String pPassword, String pTelephone){
        this.aName = pName;
        this.aAge = pAge;
        this.aPassword = pPassword;
        this.aTelephone = pTelephone;
    }

    public String getName(){
        return this.aName;
    }

    public void setName(String pName){
        this.aName = pName;
    }

    public int getAge(){
        return this.aAge;
    }

    public void setAge(int pAge){
        this.aAge = pAge;
    }

    public void setPassword(String oldPassword, String newPassword){
        if(this.aPassword.equals(oldPassword)){
            this.aPassword = newPassword;
        }
        else{
            System.out.println("The old password is not correct");
        }
    }

    public String getTelephone(){
        return this.aTelephone;
    }

    public void setTelephone(String pTelephone){
        this.aTelephone = pTelephone;
    }
}
