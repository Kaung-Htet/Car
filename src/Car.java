public class Car {

    //variables ကို field လို့ခေါ်တယ်
    private int doors;
    private int wheels;
    private String model;
    private String colour;

    //အပေါ်က field model နဲ့ အောက်က parameter model နဲ့မတူဘူး
    //အောက်က parameter model က method နဲ့ဆိုင်တဲ့ model
    public void setModel (String model){
        //အပေါ်က field model ဖြစ်ကြောင်းသိအောင် this keyword ကိုသုံးတယ်
        //ညာဘက်က model က parameter model
        this.model = model;
    }

    public String getModel (){
        return this.model;
    }

}
