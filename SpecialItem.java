public class SpecialItem {

    private String item;
    private String textColor;
    private int delay;

   // connstructor with parameters

    public SpecialItem(String item, int delay, String textColor){
         this.item = item;
         this.delay = delay;
         this.textColor = textColor;
    }

    public String getItem(){
        return item;
    }

    public String getTextColor(){
        return textColor;
    }

    public int getDelay(){
        return delay;
    }

}
