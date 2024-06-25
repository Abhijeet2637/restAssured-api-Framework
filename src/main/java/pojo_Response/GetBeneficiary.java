package pojo_Response;

import java.util.List;

public class GetBeneficiary {
    private List<BeneficiaryList> beneficiaryList;
    private CoolingPeriodLimits coolingPeriodLimits;
    private SubCoolingPeriodLimits subCoolingPeriodLimits;
    private TransactionLimits transactionLimits;
    private String chronoUnit;

    public List<BeneficiaryList> getBeneficiaryList() {
        return beneficiaryList;
    }

    public void setBeneficiaryList(List<BeneficiaryList> beneficiaryList) {
        this.beneficiaryList = beneficiaryList;
    }
    public CoolingPeriodLimits getCoolingPeriodLimits() {
        return coolingPeriodLimits;
    }

    public void setCoolingPeriodLimits(CoolingPeriodLimits coolingPeriodLimits) {
        this.coolingPeriodLimits = coolingPeriodLimits;
    }

    public SubCoolingPeriodLimits getSubCoolingPeriodLimits() {
        return subCoolingPeriodLimits;
    }

    public void setSubCoolingPeriodLimits(SubCoolingPeriodLimits subCoolingPeriodLimits) {
        this.subCoolingPeriodLimits = subCoolingPeriodLimits;
    }

    public TransactionLimits getTransactionLimits() {
        return transactionLimits;
    }

    public void setTransactionLimits(TransactionLimits transactionLimits) {
        this.transactionLimits = transactionLimits;
    }

    public String getChronoUnit() {
        return chronoUnit;
    }

    public void setChronoUnit(String chronoUnit) {
        this.chronoUnit = chronoUnit;
    }

}
