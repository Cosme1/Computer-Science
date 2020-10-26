package Author;

public class author {
    String name;
    String email;
    char gender;

	public author(String n, char g){
        this.name = n;
        this.gender = g;
        this.email = "Please provide your email";
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public char getGender(){
        return gender;
    }

    public void setEmail(String e){
        this.email = e;
    }

    public String toString(){
        return ("Author's name is " + getName() + ", with gender " + getGender() + ", and email " + getEmail());
    }
}
