package entities;

public class SubCategory{

    private String title;
    private Double value;

    public SubCategory(String title, Double value){
        this.title = title;
        this.value = value;
    }

    @Override
    public String toString(){
        return "   > " + title + " - Value: " + value;
    }
    public String getTitle() {
        return title;
    }

    public void setValue(double value){
        this.value = value;
    }

    public double getValue(){
        return value;
    }
}
