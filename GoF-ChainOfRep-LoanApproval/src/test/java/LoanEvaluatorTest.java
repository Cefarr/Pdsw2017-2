
import junit.framework.TestCase;
import edu.eci.arsw.gof.chainofrep.loanapproval.Main;
import edu.eci.arsw.gof.chainofrep.loanapproval.model.ApplicationDetails;
import edu.eci.arsw.gof.chainofrep.loanapproval.model.AutomatedLoanEvaluator;
import java.text.ParseException;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hcadavid
 */
public class LoanEvaluatorTest extends TestCase{
    @Test
    public void testisApplicationDeclined() throws ParseException{
        String outcome[]=new String[1];
        AutomatedLoanEvaluator primero = new AutomatedLoanEvaluator();
        ApplicationDetails p=new ApplicationDetails("Oscar", "Alejandro", "Boll", "2000-01-01",
                "Committed", "22210", 1, "Home Improvement Loan", "742 de Evergreen Terrace", 
                "", "Springfield", "CA", 0, 0, 0, 0, "john123@hotmail.com", 
                "Loan description", "IBM", 30000, 10, 2, 
                "Officer", "342 SouthLake Av", "", "Yorktown", 
                "VA", 3242323);
        assertTrue("NO puede ser procesado", primero.isApplicationDeclined(p, outcome));
        
        ApplicationDetails s=new ApplicationDetails("John", "", "Connor", "1951-01-01",
                "Single", "11101", 0, "Home Improvement Loan", "742 de Evergreen Terrace", 
                "", "Springfield", "CA", 0, 0, 0, 0, "john123@hotmail.com", 
                "Loan description", "IBM", 30000, 10, 2, 
                "Officer", "342 SouthLake Av", "", "Yorktown", 
                "VA", 3242323);//lIMITE EDAD
        assertTrue("NO puede ser procesado", primero.isApplicationDeclined(s, outcome));
        ApplicationDetails p2=new ApplicationDetails("Erick", "Alejandro", "Boll", "2000-01-01",
                "Committed", "22210", 1, "Home Improvement Loan", "742 de Evergreen Terrace", 
                "", "Springfield", "CA", 0, 0, 0, 0, "john123@hotmail.com", 
                "Loan description", "IBM", 9999, 5, 12, 
                "Officer", "342 SouthLake Av", "", "Yorktown", 
                "VA", 3242323);
        assertTrue("NO puede ser procesado", primero.isApplicationDeclined(p2, outcome));
        
        
        
        
        

    
    }
}
