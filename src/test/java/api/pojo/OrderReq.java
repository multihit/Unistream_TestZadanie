package api.pojo;

public class OrderReq {

    private Integer senderBankId;
    private String recipientBankId;
    private String countryCode;
    private String acceptedCurrency;
    private String withdrawCurrency;
    private Double amount;
    private String operationType;
    private String amountType;
    private String feeCurrency;
    private Integer values;

    public Integer getSenderBankId() {
        return senderBankId;
    }

    public void setSenderBankId(Integer senderBankId) {
        this.senderBankId = senderBankId;
    }

    public String getRecipientBankId() {
        return recipientBankId;
    }

    public void setRecipientBankId(String recipientBankId) {
        this.recipientBankId = recipientBankId;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getAcceptedCurrency() {
        return acceptedCurrency;
    }

    public void setAcceptedCurrency(String acceptedCurrency) {
        this.acceptedCurrency = acceptedCurrency;
    }

    public String getWithdrawCurrency() {
        return withdrawCurrency;
    }

    public void setWithdrawCurrency(String withdrawCurrency) {
        this.withdrawCurrency = withdrawCurrency;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getAmountType() {
        return amountType;
    }

    public void setAmountType(String amountType) {
        this.amountType = amountType;
    }

    public String getFeeCurrency() {
        return feeCurrency;
    }

    public void setFeeCurrency(String feeCurrency) {
        this.feeCurrency = feeCurrency;
    }

    public Integer getValues() {
        return values;
    }

    public void setValues(Integer values) {
        this.values = values;
    }
}


