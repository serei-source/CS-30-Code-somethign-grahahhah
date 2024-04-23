public class GeometryRunner {
    public static void main(String[] args) throws Exception {
        Geometry run = new Geometry();

        int choiceselcted = run.choiceselcted();

        if (choiceselcted == 1){
            run.rectangle();
            }
            else if (choiceselcted == 2){
                run.circle();
        }
        else{
            if (choiceselcted == 3){
                run.cube();
            }
        }

    }

}
