/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livescorebound;

import java.util.Scanner;

/**
 *
 * @author sarun
 */
public class LiveScoreUsingBound {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       LiveScoreBean livescorebean = new LiveScoreBean();
       Subscriber obj1 = new Subscriber();
       Subscriber obj2 = new Subscriber();
       livescorebean.addPropertyChangeListener(obj1);
       livescorebean.addPropertyChangeListener(obj2);
       Scanner inp = new Scanner(System.in);
       String scoreLine;
       System.out.print("Enter Score ");
       scoreLine = inp.nextLine();
       while(!scoreLine.equals("")) {
           livescorebean.setScoreLine(scoreLine);
           System.out.print("Enter Score ");
           scoreLine = inp.nextLine();
       }
    }
}
    
