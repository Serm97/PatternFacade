package facadepattern;

import crm.CustomerService;
import crm.Marketing;
import crm.Sales;
import static facadepattern.FacadePattern.mostrarMenu;
import java.util.Scanner;

public class FacadeCRM {
    
    Scanner sc = new Scanner(System.in);

    private CustomerService cservice;
    private Marketing marketing;
    private Sales sales;

    public FacadeCRM() {
        this.cservice = new CustomerService();
        this.marketing = new Marketing();
        this.sales = new Sales();
    }
    
    public void menuFacade(int opcion){
        int opcionFacade;
        switch (opcion) {
            case 1:
                System.out.println("\n----------- Customer Service -----------");
                System.out.println("[1] Create Petition");
                System.out.println("[2] Create Complain");
                System.out.println("[3] Create Claim");
                opcionFacade = sc.nextInt();
                serviceCustomerFacade(opcionFacade);
                break;
            case 2:
                System.out.println("\n----------- Marketing -----------");
                System.out.println("[1] Segmentation Customer");
                System.out.println("[2] Create a Plain Marketing");
                System.out.println("[3] Create a Campaign");
                opcionFacade = sc.nextInt();
                marketingFacade(opcionFacade);
                break;
            case 3:
                System.out.println("\n----------- Sales -----------");
                System.out.println("[1] Create Sale Oportunity");
                System.out.println("[2] Sell Product");
                System.out.println("[3] Sell Service");
                opcionFacade = sc.nextInt();
                salesFacade(opcionFacade);
                break;
            default:
                mostrarMenu();
                break;
        }
        
        
    }
    
    
    
    
    
    

    public void oportunitySaleFacade(){
        sales.createOportunitySale();
    }

    public void historyCreditFacade(){
        cservice.validateHistoryCredit();
    }

    private void serviceCustomerFacade(int opcionFacade) {
        switch(opcionFacade){
            case 1:
                cservice.createPetition();
                break;
            case 2:
                cservice.createComplain();
                break;
            case 3:
                cservice.createClaim();
                break;
        }
    }

    private void marketingFacade(int opcionFacade) {
        switch(opcionFacade){
            case 1:
                marketing.consultSegmentation();
                break;
            case 2:
                marketing.createPlain();
                break;
            case 3:
                marketing.createCampaign();
                break;
        }
    }

    private void salesFacade(int opcionFacade) {
        switch(opcionFacade){
            case 1:
                sales.createOportunitySale();
                break;
            case 2:
                sales.saleProduct();
                break;
            case 3:
                sales.saleServcice();
                break;
        }
    }

    
}
