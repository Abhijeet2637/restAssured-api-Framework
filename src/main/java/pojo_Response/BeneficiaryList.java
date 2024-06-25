package pojo_Response;

public class BeneficiaryList {
    private int ifiID;
    private boolean isVerified;

    public int getIfiID() {
        return ifiID;
    }

    public void setIfiID(int ifiID) {
        this.ifiID = ifiID;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean verified) {
        isVerified = verified;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBeneficiaryID() {
        return beneficiaryID;
    }

    public void setBeneficiaryID(String beneficiaryID) {
        this.beneficiaryID = beneficiaryID;
    }

    public String getParentAccountHolderID() {
        return parentAccountHolderID;
    }

    public void setParentAccountHolderID(String parentAccountHolderID) {
        this.parentAccountHolderID = parentAccountHolderID;
    }

    public String getParentAccountID() {
        return parentAccountID;
    }

    public void setParentAccountID(String parentAccountID) {
        this.parentAccountID = parentAccountID;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BeneficiaryAccount getBeneficiaryAccount() {
        return beneficiaryAccount;
    }

    public void setBeneficiaryAccount(BeneficiaryAccount beneficiaryAccount) {
        this.beneficiaryAccount = beneficiaryAccount;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean aDefault) {
        isDefault = aDefault;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getActivationStatus() {
        return activationStatus;
    }

    public void setActivationStatus(String activationStatus) {
        this.activationStatus = activationStatus;
    }

    private String status;
    private String beneficiaryID;
    private String parentAccountHolderID;
    private String parentAccountID;
    private String nickname;
    private String type;
    private BeneficiaryAccount beneficiaryAccount;
    private boolean isDefault;
    private String createdAt;
    private String updatedAt;
    private String activationStatus;

}

