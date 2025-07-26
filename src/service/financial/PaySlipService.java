package service.financial;

import model.Employee;
import model.financial.DailyFees;
import model.financial.MonthlyFees;
public class PaySlipService {
//    ဝန်ထမ်းအတွက် ထုတ်ပေးစာရင်းများကို စီမံခန့်ခွဲရန် ဝန်ဆောင်မှုတစ်ခုဖြစ်သည်။
    public double calcPaySlip(Employee employee){
        return switch (employee.getJobType()) {
            case DAILY -> calcDailyFees(employee); // ဘယ်လက ဟာလဲဆိုတာပါထည့်ပေးဖို့လို
            case MONTHLY -> calcMonthlyFees(employee);
            default -> throw new IllegalArgumentException("Invalid job type: " + employee.getJobType());
        };

    }
}
