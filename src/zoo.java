public class zoo {
    public Animal[] animal;
    public String name;
    public String city;
    public int nbrCages=25;

    public zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animal = new Animal[nbrCages];

    }
 public void displayZoo(){
        System.out.println("Name:" + name);
     System.out.println("City:" + city);
        System.out.println("Nbr Cages:" + nbrCages);

 }
    public String tostring(){
        return "name" + name +", city" + city +",nbrCages " + nbrCages;
    }



}
