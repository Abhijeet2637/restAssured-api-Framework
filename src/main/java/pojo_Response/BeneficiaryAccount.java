package pojo_Response;

public class BeneficiaryAccount {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountProvider() {
        return accountProvider;
    }

    public void setAccountProvider(String accountProvider) {
        this.accountProvider = accountProvider;
    }

    public String getNameAtAccountProvider() {
        return nameAtAccountProvider;
    }

    public void setNameAtAccountProvider(String nameAtAccountProvider) {
        this.nameAtAccountProvider = nameAtAccountProvider;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    private String accountNumber;
    private String accountProvider;
    private String nameAtAccountProvider;
    private String ifscCode;
    private String bankName;
}
