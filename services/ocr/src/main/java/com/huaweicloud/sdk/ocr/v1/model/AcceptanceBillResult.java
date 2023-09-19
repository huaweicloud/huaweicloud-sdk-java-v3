package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AcceptanceBillResult
 */
public class AcceptanceBillResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_date")

    private String issueDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "due_date")

    private String dueDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bill_status")

    private String billStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bill_number")

    private String billNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issuer_full_name")

    private String issuerFullName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issuer_account")

    private String issuerAccount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issuer_bank_name")

    private String issuerBankName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issuer_bank_number")

    private String issuerBankNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "payee_full_name")

    private String payeeFullName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "payee_account")

    private String payeeAccount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "payee_bank_name")

    private String payeeBankName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "payee_bank_number")

    private String payeeBankNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issuance_guarantor_name")

    private String issuanceGuarantorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issuance_guarantor_address")

    private String issuanceGuarantorAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issuance_guarantor_account")

    private String issuanceGuarantorAccount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issuance_guarantee_date")

    private String issuanceGuaranteeDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issuance_guarantor_bank_number")

    private String issuanceGuarantorBankNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issuance_guarantor_bank_name")

    private String issuanceGuarantorBankName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amount_in_words")

    private String amountInWords;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amount_in_figures")

    private String amountInFigures;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "acceptor_full_name")

    private String acceptorFullName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "acceptor_account")

    private String acceptorAccount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "acceptor_bank_number")

    private String acceptorBankNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "acceptor_bank_name")

    private String acceptorBankName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contract_number")

    private String contractNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assignability")

    private String assignability;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issuer_commitment")

    private String issuerCommitment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "acceptor_commitment")

    private String acceptorCommitment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "acceptance_date")

    private String acceptanceDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "acceptance_guarantor_name")

    private String acceptanceGuarantorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "acceptance_guarantor_address")

    private String acceptanceGuarantorAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "acceptance_guarantor_account")

    private String acceptanceGuarantorAccount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "acceptance_guarantee_date")

    private String acceptanceGuaranteeDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "acceptance_guarantor_bank_number")

    private String acceptanceGuarantorBankNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "acceptance_guarantor_bank_name")

    private String acceptanceGuarantorBankName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issuer_rating_entity")

    private String issuerRatingEntity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issuer_credit_rating")

    private String issuerCreditRating;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issuer_rating_due_date")

    private String issuerRatingDueDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "acceptor_rating_entity")

    private String acceptorRatingEntity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "acceptor_credit_rating")

    private String acceptorCreditRating;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "acceptor_rating_due_date")

    private String acceptorRatingDueDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bill_package_number")

    private String billPackageNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remarks")

    private String remarks;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private Object confidence;

    public AcceptanceBillResult withIssueDate(String issueDate) {
        this.issueDate = issueDate;
        return this;
    }

    /**
     * 出票日期。 
     * @return issueDate
     */
    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public AcceptanceBillResult withDueDate(String dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    /**
     * 汇票到期日。 
     * @return dueDate
     */
    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public AcceptanceBillResult withBillStatus(String billStatus) {
        this.billStatus = billStatus;
        return this;
    }

    /**
     * 票据状态。 
     * @return billStatus
     */
    public String getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(String billStatus) {
        this.billStatus = billStatus;
    }

    public AcceptanceBillResult withBillNumber(String billNumber) {
        this.billNumber = billNumber;
        return this;
    }

    /**
     * 票据号码。 
     * @return billNumber
     */
    public String getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber;
    }

    public AcceptanceBillResult withIssuerFullName(String issuerFullName) {
        this.issuerFullName = issuerFullName;
        return this;
    }

    /**
     * 出票人全称。 
     * @return issuerFullName
     */
    public String getIssuerFullName() {
        return issuerFullName;
    }

    public void setIssuerFullName(String issuerFullName) {
        this.issuerFullName = issuerFullName;
    }

    public AcceptanceBillResult withIssuerAccount(String issuerAccount) {
        this.issuerAccount = issuerAccount;
        return this;
    }

    /**
     * 出票人账号。 
     * @return issuerAccount
     */
    public String getIssuerAccount() {
        return issuerAccount;
    }

    public void setIssuerAccount(String issuerAccount) {
        this.issuerAccount = issuerAccount;
    }

    public AcceptanceBillResult withIssuerBankName(String issuerBankName) {
        this.issuerBankName = issuerBankName;
        return this;
    }

    /**
     * 出票人开户银行。 
     * @return issuerBankName
     */
    public String getIssuerBankName() {
        return issuerBankName;
    }

    public void setIssuerBankName(String issuerBankName) {
        this.issuerBankName = issuerBankName;
    }

    public AcceptanceBillResult withIssuerBankNumber(String issuerBankNumber) {
        this.issuerBankNumber = issuerBankNumber;
        return this;
    }

    /**
     * 出票人开户行号。 
     * @return issuerBankNumber
     */
    public String getIssuerBankNumber() {
        return issuerBankNumber;
    }

    public void setIssuerBankNumber(String issuerBankNumber) {
        this.issuerBankNumber = issuerBankNumber;
    }

    public AcceptanceBillResult withPayeeFullName(String payeeFullName) {
        this.payeeFullName = payeeFullName;
        return this;
    }

    /**
     * 收款人全称。 
     * @return payeeFullName
     */
    public String getPayeeFullName() {
        return payeeFullName;
    }

    public void setPayeeFullName(String payeeFullName) {
        this.payeeFullName = payeeFullName;
    }

    public AcceptanceBillResult withPayeeAccount(String payeeAccount) {
        this.payeeAccount = payeeAccount;
        return this;
    }

    /**
     * 收款人账号。 
     * @return payeeAccount
     */
    public String getPayeeAccount() {
        return payeeAccount;
    }

    public void setPayeeAccount(String payeeAccount) {
        this.payeeAccount = payeeAccount;
    }

    public AcceptanceBillResult withPayeeBankName(String payeeBankName) {
        this.payeeBankName = payeeBankName;
        return this;
    }

    /**
     * 收款人开户银行。 
     * @return payeeBankName
     */
    public String getPayeeBankName() {
        return payeeBankName;
    }

    public void setPayeeBankName(String payeeBankName) {
        this.payeeBankName = payeeBankName;
    }

    public AcceptanceBillResult withPayeeBankNumber(String payeeBankNumber) {
        this.payeeBankNumber = payeeBankNumber;
        return this;
    }

    /**
     * 收款人开户行号。 
     * @return payeeBankNumber
     */
    public String getPayeeBankNumber() {
        return payeeBankNumber;
    }

    public void setPayeeBankNumber(String payeeBankNumber) {
        this.payeeBankNumber = payeeBankNumber;
    }

    public AcceptanceBillResult withIssuanceGuarantorName(String issuanceGuarantorName) {
        this.issuanceGuarantorName = issuanceGuarantorName;
        return this;
    }

    /**
     * 出票保证人名称。 
     * @return issuanceGuarantorName
     */
    public String getIssuanceGuarantorName() {
        return issuanceGuarantorName;
    }

    public void setIssuanceGuarantorName(String issuanceGuarantorName) {
        this.issuanceGuarantorName = issuanceGuarantorName;
    }

    public AcceptanceBillResult withIssuanceGuarantorAddress(String issuanceGuarantorAddress) {
        this.issuanceGuarantorAddress = issuanceGuarantorAddress;
        return this;
    }

    /**
     * 出票保证人地址。 
     * @return issuanceGuarantorAddress
     */
    public String getIssuanceGuarantorAddress() {
        return issuanceGuarantorAddress;
    }

    public void setIssuanceGuarantorAddress(String issuanceGuarantorAddress) {
        this.issuanceGuarantorAddress = issuanceGuarantorAddress;
    }

    public AcceptanceBillResult withIssuanceGuarantorAccount(String issuanceGuarantorAccount) {
        this.issuanceGuarantorAccount = issuanceGuarantorAccount;
        return this;
    }

    /**
     * 出票保证人账号。 
     * @return issuanceGuarantorAccount
     */
    public String getIssuanceGuarantorAccount() {
        return issuanceGuarantorAccount;
    }

    public void setIssuanceGuarantorAccount(String issuanceGuarantorAccount) {
        this.issuanceGuarantorAccount = issuanceGuarantorAccount;
    }

    public AcceptanceBillResult withIssuanceGuaranteeDate(String issuanceGuaranteeDate) {
        this.issuanceGuaranteeDate = issuanceGuaranteeDate;
        return this;
    }

    /**
     * 出票保证日期。 
     * @return issuanceGuaranteeDate
     */
    public String getIssuanceGuaranteeDate() {
        return issuanceGuaranteeDate;
    }

    public void setIssuanceGuaranteeDate(String issuanceGuaranteeDate) {
        this.issuanceGuaranteeDate = issuanceGuaranteeDate;
    }

    public AcceptanceBillResult withIssuanceGuarantorBankNumber(String issuanceGuarantorBankNumber) {
        this.issuanceGuarantorBankNumber = issuanceGuarantorBankNumber;
        return this;
    }

    /**
     * 出票保证人开户行行号。 
     * @return issuanceGuarantorBankNumber
     */
    public String getIssuanceGuarantorBankNumber() {
        return issuanceGuarantorBankNumber;
    }

    public void setIssuanceGuarantorBankNumber(String issuanceGuarantorBankNumber) {
        this.issuanceGuarantorBankNumber = issuanceGuarantorBankNumber;
    }

    public AcceptanceBillResult withIssuanceGuarantorBankName(String issuanceGuarantorBankName) {
        this.issuanceGuarantorBankName = issuanceGuarantorBankName;
        return this;
    }

    /**
     * 出票保证人开户行名称。 
     * @return issuanceGuarantorBankName
     */
    public String getIssuanceGuarantorBankName() {
        return issuanceGuarantorBankName;
    }

    public void setIssuanceGuarantorBankName(String issuanceGuarantorBankName) {
        this.issuanceGuarantorBankName = issuanceGuarantorBankName;
    }

    public AcceptanceBillResult withAmountInWords(String amountInWords) {
        this.amountInWords = amountInWords;
        return this;
    }

    /**
     * 大写票据金额。 
     * @return amountInWords
     */
    public String getAmountInWords() {
        return amountInWords;
    }

    public void setAmountInWords(String amountInWords) {
        this.amountInWords = amountInWords;
    }

    public AcceptanceBillResult withAmountInFigures(String amountInFigures) {
        this.amountInFigures = amountInFigures;
        return this;
    }

    /**
     * 小写票据金额。 
     * @return amountInFigures
     */
    public String getAmountInFigures() {
        return amountInFigures;
    }

    public void setAmountInFigures(String amountInFigures) {
        this.amountInFigures = amountInFigures;
    }

    public AcceptanceBillResult withAcceptorFullName(String acceptorFullName) {
        this.acceptorFullName = acceptorFullName;
        return this;
    }

    /**
     * 承兑人全称。 
     * @return acceptorFullName
     */
    public String getAcceptorFullName() {
        return acceptorFullName;
    }

    public void setAcceptorFullName(String acceptorFullName) {
        this.acceptorFullName = acceptorFullName;
    }

    public AcceptanceBillResult withAcceptorAccount(String acceptorAccount) {
        this.acceptorAccount = acceptorAccount;
        return this;
    }

    /**
     * 承兑人账号。 
     * @return acceptorAccount
     */
    public String getAcceptorAccount() {
        return acceptorAccount;
    }

    public void setAcceptorAccount(String acceptorAccount) {
        this.acceptorAccount = acceptorAccount;
    }

    public AcceptanceBillResult withAcceptorBankNumber(String acceptorBankNumber) {
        this.acceptorBankNumber = acceptorBankNumber;
        return this;
    }

    /**
     * 承兑人开户行行号。 
     * @return acceptorBankNumber
     */
    public String getAcceptorBankNumber() {
        return acceptorBankNumber;
    }

    public void setAcceptorBankNumber(String acceptorBankNumber) {
        this.acceptorBankNumber = acceptorBankNumber;
    }

    public AcceptanceBillResult withAcceptorBankName(String acceptorBankName) {
        this.acceptorBankName = acceptorBankName;
        return this;
    }

    /**
     * 承兑人开户行名称。 
     * @return acceptorBankName
     */
    public String getAcceptorBankName() {
        return acceptorBankName;
    }

    public void setAcceptorBankName(String acceptorBankName) {
        this.acceptorBankName = acceptorBankName;
    }

    public AcceptanceBillResult withContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
        return this;
    }

    /**
     * 交易合同号。 
     * @return contractNumber
     */
    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public AcceptanceBillResult withAssignability(String assignability) {
        this.assignability = assignability;
        return this;
    }

    /**
     * 能否转让。 
     * @return assignability
     */
    public String getAssignability() {
        return assignability;
    }

    public void setAssignability(String assignability) {
        this.assignability = assignability;
    }

    public AcceptanceBillResult withIssuerCommitment(String issuerCommitment) {
        this.issuerCommitment = issuerCommitment;
        return this;
    }

    /**
     * 出票人承诺。 
     * @return issuerCommitment
     */
    public String getIssuerCommitment() {
        return issuerCommitment;
    }

    public void setIssuerCommitment(String issuerCommitment) {
        this.issuerCommitment = issuerCommitment;
    }

    public AcceptanceBillResult withAcceptorCommitment(String acceptorCommitment) {
        this.acceptorCommitment = acceptorCommitment;
        return this;
    }

    /**
     * 承兑人承诺。 
     * @return acceptorCommitment
     */
    public String getAcceptorCommitment() {
        return acceptorCommitment;
    }

    public void setAcceptorCommitment(String acceptorCommitment) {
        this.acceptorCommitment = acceptorCommitment;
    }

    public AcceptanceBillResult withAcceptanceDate(String acceptanceDate) {
        this.acceptanceDate = acceptanceDate;
        return this;
    }

    /**
     * 承兑日期。 
     * @return acceptanceDate
     */
    public String getAcceptanceDate() {
        return acceptanceDate;
    }

    public void setAcceptanceDate(String acceptanceDate) {
        this.acceptanceDate = acceptanceDate;
    }

    public AcceptanceBillResult withAcceptanceGuarantorName(String acceptanceGuarantorName) {
        this.acceptanceGuarantorName = acceptanceGuarantorName;
        return this;
    }

    /**
     * 承兑保证人名称。 
     * @return acceptanceGuarantorName
     */
    public String getAcceptanceGuarantorName() {
        return acceptanceGuarantorName;
    }

    public void setAcceptanceGuarantorName(String acceptanceGuarantorName) {
        this.acceptanceGuarantorName = acceptanceGuarantorName;
    }

    public AcceptanceBillResult withAcceptanceGuarantorAddress(String acceptanceGuarantorAddress) {
        this.acceptanceGuarantorAddress = acceptanceGuarantorAddress;
        return this;
    }

    /**
     * 承兑保证人地址。 
     * @return acceptanceGuarantorAddress
     */
    public String getAcceptanceGuarantorAddress() {
        return acceptanceGuarantorAddress;
    }

    public void setAcceptanceGuarantorAddress(String acceptanceGuarantorAddress) {
        this.acceptanceGuarantorAddress = acceptanceGuarantorAddress;
    }

    public AcceptanceBillResult withAcceptanceGuarantorAccount(String acceptanceGuarantorAccount) {
        this.acceptanceGuarantorAccount = acceptanceGuarantorAccount;
        return this;
    }

    /**
     * 承兑保证人账号。 
     * @return acceptanceGuarantorAccount
     */
    public String getAcceptanceGuarantorAccount() {
        return acceptanceGuarantorAccount;
    }

    public void setAcceptanceGuarantorAccount(String acceptanceGuarantorAccount) {
        this.acceptanceGuarantorAccount = acceptanceGuarantorAccount;
    }

    public AcceptanceBillResult withAcceptanceGuaranteeDate(String acceptanceGuaranteeDate) {
        this.acceptanceGuaranteeDate = acceptanceGuaranteeDate;
        return this;
    }

    /**
     * 承兑保证日期。 
     * @return acceptanceGuaranteeDate
     */
    public String getAcceptanceGuaranteeDate() {
        return acceptanceGuaranteeDate;
    }

    public void setAcceptanceGuaranteeDate(String acceptanceGuaranteeDate) {
        this.acceptanceGuaranteeDate = acceptanceGuaranteeDate;
    }

    public AcceptanceBillResult withAcceptanceGuarantorBankNumber(String acceptanceGuarantorBankNumber) {
        this.acceptanceGuarantorBankNumber = acceptanceGuarantorBankNumber;
        return this;
    }

    /**
     * 承兑保证人开户行行号。 
     * @return acceptanceGuarantorBankNumber
     */
    public String getAcceptanceGuarantorBankNumber() {
        return acceptanceGuarantorBankNumber;
    }

    public void setAcceptanceGuarantorBankNumber(String acceptanceGuarantorBankNumber) {
        this.acceptanceGuarantorBankNumber = acceptanceGuarantorBankNumber;
    }

    public AcceptanceBillResult withAcceptanceGuarantorBankName(String acceptanceGuarantorBankName) {
        this.acceptanceGuarantorBankName = acceptanceGuarantorBankName;
        return this;
    }

    /**
     * 承兑保证人开户行名称。 
     * @return acceptanceGuarantorBankName
     */
    public String getAcceptanceGuarantorBankName() {
        return acceptanceGuarantorBankName;
    }

    public void setAcceptanceGuarantorBankName(String acceptanceGuarantorBankName) {
        this.acceptanceGuarantorBankName = acceptanceGuarantorBankName;
    }

    public AcceptanceBillResult withIssuerRatingEntity(String issuerRatingEntity) {
        this.issuerRatingEntity = issuerRatingEntity;
        return this;
    }

    /**
     * 出票人评级主体。 
     * @return issuerRatingEntity
     */
    public String getIssuerRatingEntity() {
        return issuerRatingEntity;
    }

    public void setIssuerRatingEntity(String issuerRatingEntity) {
        this.issuerRatingEntity = issuerRatingEntity;
    }

    public AcceptanceBillResult withIssuerCreditRating(String issuerCreditRating) {
        this.issuerCreditRating = issuerCreditRating;
        return this;
    }

    /**
     * 出票人信用等级。 
     * @return issuerCreditRating
     */
    public String getIssuerCreditRating() {
        return issuerCreditRating;
    }

    public void setIssuerCreditRating(String issuerCreditRating) {
        this.issuerCreditRating = issuerCreditRating;
    }

    public AcceptanceBillResult withIssuerRatingDueDate(String issuerRatingDueDate) {
        this.issuerRatingDueDate = issuerRatingDueDate;
        return this;
    }

    /**
     * 出票人评级到期日。 
     * @return issuerRatingDueDate
     */
    public String getIssuerRatingDueDate() {
        return issuerRatingDueDate;
    }

    public void setIssuerRatingDueDate(String issuerRatingDueDate) {
        this.issuerRatingDueDate = issuerRatingDueDate;
    }

    public AcceptanceBillResult withAcceptorRatingEntity(String acceptorRatingEntity) {
        this.acceptorRatingEntity = acceptorRatingEntity;
        return this;
    }

    /**
     * 承兑人评级主体。 
     * @return acceptorRatingEntity
     */
    public String getAcceptorRatingEntity() {
        return acceptorRatingEntity;
    }

    public void setAcceptorRatingEntity(String acceptorRatingEntity) {
        this.acceptorRatingEntity = acceptorRatingEntity;
    }

    public AcceptanceBillResult withAcceptorCreditRating(String acceptorCreditRating) {
        this.acceptorCreditRating = acceptorCreditRating;
        return this;
    }

    /**
     * 承兑人信用等级。 
     * @return acceptorCreditRating
     */
    public String getAcceptorCreditRating() {
        return acceptorCreditRating;
    }

    public void setAcceptorCreditRating(String acceptorCreditRating) {
        this.acceptorCreditRating = acceptorCreditRating;
    }

    public AcceptanceBillResult withAcceptorRatingDueDate(String acceptorRatingDueDate) {
        this.acceptorRatingDueDate = acceptorRatingDueDate;
        return this;
    }

    /**
     * 承兑人评级到期日。 
     * @return acceptorRatingDueDate
     */
    public String getAcceptorRatingDueDate() {
        return acceptorRatingDueDate;
    }

    public void setAcceptorRatingDueDate(String acceptorRatingDueDate) {
        this.acceptorRatingDueDate = acceptorRatingDueDate;
    }

    public AcceptanceBillResult withBillPackageNumber(String billPackageNumber) {
        this.billPackageNumber = billPackageNumber;
        return this;
    }

    /**
     * 票据包号。 
     * @return billPackageNumber
     */
    public String getBillPackageNumber() {
        return billPackageNumber;
    }

    public void setBillPackageNumber(String billPackageNumber) {
        this.billPackageNumber = billPackageNumber;
    }

    public AcceptanceBillResult withRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }

    /**
     * 备注。   
     * @return remarks
     */
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public AcceptanceBillResult withConfidence(Object confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * 各个字段的置信度。 
     * @return confidence
     */
    public Object getConfidence() {
        return confidence;
    }

    public void setConfidence(Object confidence) {
        this.confidence = confidence;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AcceptanceBillResult that = (AcceptanceBillResult) obj;
        return Objects.equals(this.issueDate, that.issueDate) && Objects.equals(this.dueDate, that.dueDate)
            && Objects.equals(this.billStatus, that.billStatus) && Objects.equals(this.billNumber, that.billNumber)
            && Objects.equals(this.issuerFullName, that.issuerFullName)
            && Objects.equals(this.issuerAccount, that.issuerAccount)
            && Objects.equals(this.issuerBankName, that.issuerBankName)
            && Objects.equals(this.issuerBankNumber, that.issuerBankNumber)
            && Objects.equals(this.payeeFullName, that.payeeFullName)
            && Objects.equals(this.payeeAccount, that.payeeAccount)
            && Objects.equals(this.payeeBankName, that.payeeBankName)
            && Objects.equals(this.payeeBankNumber, that.payeeBankNumber)
            && Objects.equals(this.issuanceGuarantorName, that.issuanceGuarantorName)
            && Objects.equals(this.issuanceGuarantorAddress, that.issuanceGuarantorAddress)
            && Objects.equals(this.issuanceGuarantorAccount, that.issuanceGuarantorAccount)
            && Objects.equals(this.issuanceGuaranteeDate, that.issuanceGuaranteeDate)
            && Objects.equals(this.issuanceGuarantorBankNumber, that.issuanceGuarantorBankNumber)
            && Objects.equals(this.issuanceGuarantorBankName, that.issuanceGuarantorBankName)
            && Objects.equals(this.amountInWords, that.amountInWords)
            && Objects.equals(this.amountInFigures, that.amountInFigures)
            && Objects.equals(this.acceptorFullName, that.acceptorFullName)
            && Objects.equals(this.acceptorAccount, that.acceptorAccount)
            && Objects.equals(this.acceptorBankNumber, that.acceptorBankNumber)
            && Objects.equals(this.acceptorBankName, that.acceptorBankName)
            && Objects.equals(this.contractNumber, that.contractNumber)
            && Objects.equals(this.assignability, that.assignability)
            && Objects.equals(this.issuerCommitment, that.issuerCommitment)
            && Objects.equals(this.acceptorCommitment, that.acceptorCommitment)
            && Objects.equals(this.acceptanceDate, that.acceptanceDate)
            && Objects.equals(this.acceptanceGuarantorName, that.acceptanceGuarantorName)
            && Objects.equals(this.acceptanceGuarantorAddress, that.acceptanceGuarantorAddress)
            && Objects.equals(this.acceptanceGuarantorAccount, that.acceptanceGuarantorAccount)
            && Objects.equals(this.acceptanceGuaranteeDate, that.acceptanceGuaranteeDate)
            && Objects.equals(this.acceptanceGuarantorBankNumber, that.acceptanceGuarantorBankNumber)
            && Objects.equals(this.acceptanceGuarantorBankName, that.acceptanceGuarantorBankName)
            && Objects.equals(this.issuerRatingEntity, that.issuerRatingEntity)
            && Objects.equals(this.issuerCreditRating, that.issuerCreditRating)
            && Objects.equals(this.issuerRatingDueDate, that.issuerRatingDueDate)
            && Objects.equals(this.acceptorRatingEntity, that.acceptorRatingEntity)
            && Objects.equals(this.acceptorCreditRating, that.acceptorCreditRating)
            && Objects.equals(this.acceptorRatingDueDate, that.acceptorRatingDueDate)
            && Objects.equals(this.billPackageNumber, that.billPackageNumber)
            && Objects.equals(this.remarks, that.remarks) && Objects.equals(this.confidence, that.confidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(issueDate,
            dueDate,
            billStatus,
            billNumber,
            issuerFullName,
            issuerAccount,
            issuerBankName,
            issuerBankNumber,
            payeeFullName,
            payeeAccount,
            payeeBankName,
            payeeBankNumber,
            issuanceGuarantorName,
            issuanceGuarantorAddress,
            issuanceGuarantorAccount,
            issuanceGuaranteeDate,
            issuanceGuarantorBankNumber,
            issuanceGuarantorBankName,
            amountInWords,
            amountInFigures,
            acceptorFullName,
            acceptorAccount,
            acceptorBankNumber,
            acceptorBankName,
            contractNumber,
            assignability,
            issuerCommitment,
            acceptorCommitment,
            acceptanceDate,
            acceptanceGuarantorName,
            acceptanceGuarantorAddress,
            acceptanceGuarantorAccount,
            acceptanceGuaranteeDate,
            acceptanceGuarantorBankNumber,
            acceptanceGuarantorBankName,
            issuerRatingEntity,
            issuerCreditRating,
            issuerRatingDueDate,
            acceptorRatingEntity,
            acceptorCreditRating,
            acceptorRatingDueDate,
            billPackageNumber,
            remarks,
            confidence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AcceptanceBillResult {\n");
        sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
        sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
        sb.append("    billStatus: ").append(toIndentedString(billStatus)).append("\n");
        sb.append("    billNumber: ").append(toIndentedString(billNumber)).append("\n");
        sb.append("    issuerFullName: ").append(toIndentedString(issuerFullName)).append("\n");
        sb.append("    issuerAccount: ").append(toIndentedString(issuerAccount)).append("\n");
        sb.append("    issuerBankName: ").append(toIndentedString(issuerBankName)).append("\n");
        sb.append("    issuerBankNumber: ").append(toIndentedString(issuerBankNumber)).append("\n");
        sb.append("    payeeFullName: ").append(toIndentedString(payeeFullName)).append("\n");
        sb.append("    payeeAccount: ").append(toIndentedString(payeeAccount)).append("\n");
        sb.append("    payeeBankName: ").append(toIndentedString(payeeBankName)).append("\n");
        sb.append("    payeeBankNumber: ").append(toIndentedString(payeeBankNumber)).append("\n");
        sb.append("    issuanceGuarantorName: ").append(toIndentedString(issuanceGuarantorName)).append("\n");
        sb.append("    issuanceGuarantorAddress: ").append(toIndentedString(issuanceGuarantorAddress)).append("\n");
        sb.append("    issuanceGuarantorAccount: ").append(toIndentedString(issuanceGuarantorAccount)).append("\n");
        sb.append("    issuanceGuaranteeDate: ").append(toIndentedString(issuanceGuaranteeDate)).append("\n");
        sb.append("    issuanceGuarantorBankNumber: ")
            .append(toIndentedString(issuanceGuarantorBankNumber))
            .append("\n");
        sb.append("    issuanceGuarantorBankName: ").append(toIndentedString(issuanceGuarantorBankName)).append("\n");
        sb.append("    amountInWords: ").append(toIndentedString(amountInWords)).append("\n");
        sb.append("    amountInFigures: ").append(toIndentedString(amountInFigures)).append("\n");
        sb.append("    acceptorFullName: ").append(toIndentedString(acceptorFullName)).append("\n");
        sb.append("    acceptorAccount: ").append(toIndentedString(acceptorAccount)).append("\n");
        sb.append("    acceptorBankNumber: ").append(toIndentedString(acceptorBankNumber)).append("\n");
        sb.append("    acceptorBankName: ").append(toIndentedString(acceptorBankName)).append("\n");
        sb.append("    contractNumber: ").append(toIndentedString(contractNumber)).append("\n");
        sb.append("    assignability: ").append(toIndentedString(assignability)).append("\n");
        sb.append("    issuerCommitment: ").append(toIndentedString(issuerCommitment)).append("\n");
        sb.append("    acceptorCommitment: ").append(toIndentedString(acceptorCommitment)).append("\n");
        sb.append("    acceptanceDate: ").append(toIndentedString(acceptanceDate)).append("\n");
        sb.append("    acceptanceGuarantorName: ").append(toIndentedString(acceptanceGuarantorName)).append("\n");
        sb.append("    acceptanceGuarantorAddress: ").append(toIndentedString(acceptanceGuarantorAddress)).append("\n");
        sb.append("    acceptanceGuarantorAccount: ").append(toIndentedString(acceptanceGuarantorAccount)).append("\n");
        sb.append("    acceptanceGuaranteeDate: ").append(toIndentedString(acceptanceGuaranteeDate)).append("\n");
        sb.append("    acceptanceGuarantorBankNumber: ")
            .append(toIndentedString(acceptanceGuarantorBankNumber))
            .append("\n");
        sb.append("    acceptanceGuarantorBankName: ")
            .append(toIndentedString(acceptanceGuarantorBankName))
            .append("\n");
        sb.append("    issuerRatingEntity: ").append(toIndentedString(issuerRatingEntity)).append("\n");
        sb.append("    issuerCreditRating: ").append(toIndentedString(issuerCreditRating)).append("\n");
        sb.append("    issuerRatingDueDate: ").append(toIndentedString(issuerRatingDueDate)).append("\n");
        sb.append("    acceptorRatingEntity: ").append(toIndentedString(acceptorRatingEntity)).append("\n");
        sb.append("    acceptorCreditRating: ").append(toIndentedString(acceptorCreditRating)).append("\n");
        sb.append("    acceptorRatingDueDate: ").append(toIndentedString(acceptorRatingDueDate)).append("\n");
        sb.append("    billPackageNumber: ").append(toIndentedString(billPackageNumber)).append("\n");
        sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
