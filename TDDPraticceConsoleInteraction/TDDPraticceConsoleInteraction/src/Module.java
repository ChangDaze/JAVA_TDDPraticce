// reference
//part 1 : https://www.youtube.com/watch?v=TO5ZsXUP9Mk&list=PLvBh-90IwbPKSQt419BNsBRBkqN0ifho7&index=3
public class Module {
    private final String RECTANGLE_B_SELECTED = "RectangleBSelected";
    private final String RECTANGLE_A_SELECTED = "RectangleASelected";
    private final String RECTANGLE_SELECTED = "RectangleSelected";
    private final String INITIAL = "Initial";
    private int a;
    private int b;

    private String status = INITIAL;

    public String print() {
        if(this.status.equals(RECTANGLE_SELECTED)){
            return "Rectangle side A length?";
        }

        if(this.status.equals(RECTANGLE_A_SELECTED)){
            return "Rectangle side B length?";
        }

        if(this.status.equals(RECTANGLE_B_SELECTED)){
            return "Area=" + (a * b) +  ", Circumference=" + (2 * (a + b));
        }

        return  "C or R";
    }

    public void input(String answer) {
        if(this.status.equals(INITIAL) && answer.equals("R")){
            this.status = RECTANGLE_SELECTED;
        }else  if(this.status.equals(RECTANGLE_SELECTED)){

            try{
                this.a = Integer.parseInt(answer);
                this.status = RECTANGLE_A_SELECTED;
            }catch (Exception e){
                return;
            }

        }else  if(this.status.equals(RECTANGLE_A_SELECTED)){

            try{
                this.b = Integer.parseInt(answer);
                this.status = RECTANGLE_B_SELECTED;
            }catch (Exception e){
                return;
            }

        }

    }
}
