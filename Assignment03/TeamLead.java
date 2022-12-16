package Assignment03;

public class TeamLead  extends Employee
{
    void hello2()
    {
        System.out.println("Enter the Basic Pay(BP) of the Employee: ");
        BP = s.nextDouble();
        DA = 0.97*BP;
        HRA = 0.1*BP;
        PF = 0.12*BP;
        staffclubfund = 0.0001*BP;
        GS = BP + (0.97)*BP + (0.1)*BP;
        NS = GS - 0.12*BP - 0.0001*BP;
    }
    void display()
    {
        System.out.println("""
                ======================================
                SALARY SLIP
                ======================================""");
        System.out.println("Designation: TEAM LEAD");
        System.out.println("Basic Pay: "+BP);
        System.out.println("Dearness Allowance(HRA): "+DA);
        System.out.println("Home Rent Allowance(HRA): "+HRA);
        System.out.println("Provident Fund(PF): "+PF);
        System.out.println("Staff Club Fund: "+staffclubfund);
        System.out.println("Net Salary(NS): "+NS);
        System.out.println("Gross Salary(GS): "+GS);
    }
}
