/**
 * Created with IntelliJ IDEA.
 * User: arun
 * Date: 10/9/12
 * Time: 3:35 PM
 * To change this template use File | Settings | File Templates.
 */




public class Start {


    public static class DisplayPanels{

        public void SquareDisp(){

            System.out.println("Called Sqre Display");
        }
        public void RectDisplay(String param){
            int p=Integer.parseInt(param);

            System.out.println("Called "+p+" Display");
        }
        public void RoundDisplay(){
            System.out.println("Called Round Display");
        }


    }


    public static void main(String ar[]){

        System.out.println("Display Call");
        DisplayPanels disp=new DisplayPanels();
        disp.RoundDisplay();


    }





}
