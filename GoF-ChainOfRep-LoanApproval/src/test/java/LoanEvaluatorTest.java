
import junit.framework.TestCase;
import edu.eci.arsw.gof.chainofrep.loanapproval.Main;
import edu.eci.arsw.gof.chainofrep.loanapproval.model.ApplicationDetails;
import edu.eci.arsw.gof.chainofrep.loanapproval.model.AutomatedLoanEvaluator;

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
    
    public class TestisApplicationDeclined{
        ApplicationDetails primero=new ApplicationDetails("Oscar", "Alejandro", "Boll", "1080-01-01",
                "Committed", "22210", 1, "Home Improvement Loan", "742 de Evergreen Terrace", 
                "", "Springfield", "CA", 0, 0, 0, 0, "john123@hotmail.com", 
                "Loan description", "IBM", 30000, 10, 2, 
                "Officer", "342 SouthLake Av", "", "Yorktown", 
                "VA", 3242323);
        ApplicationDetails segundo=new ApplicationDetails("John", "", "Connor", "1980-01-01",
                "Single", "11101", 0, "Home Improvement Loan", "742 de Evergreen Terrace", 
                "", "Springfield", "CA", 0, 0, 0, 0, "john123@hotmail.com", 
                "Loan description", "IBM", 30000, 10, 2, 
                "Officer", "342 SouthLake Av", "", "Yorktown", 
                "VA", 3242323);
        





    } 
    
    
}
