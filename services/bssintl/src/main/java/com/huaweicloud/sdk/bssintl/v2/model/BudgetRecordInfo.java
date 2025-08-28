package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * BudgetRecordInfo
 */
public class BudgetRecordInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "budget_amount")

    private BigDecimal budgetAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_type")

    private String operationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_time")

    private String operationTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    private String operator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "budget_type")

    private String budgetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partner_corp_name")

    private String partnerCorpName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partner_account_name")

    private String partnerAccountName;

    public BudgetRecordInfo withBudgetAmount(BigDecimal budgetAmount) {
        this.budgetAmount = budgetAmount;
        return this;
    }

    /**
     * |参数名称：预算金额||参数的约束及描述：单位：元，精确至小数点后2位。范围限制:0-2147483647|
     * minimum: 0
     * maximum: 2147483647
     * @return budgetAmount
     */
    public BigDecimal getBudgetAmount() {
        return budgetAmount;
    }

    public void setBudgetAmount(BigDecimal budgetAmount) {
        this.budgetAmount = budgetAmount;
    }

    public BudgetRecordInfo withOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }

    /**
     * |参数名称：操作类别| |参数的约束及描述：范围限制：0-10。SETTING：设置 DELETE：解除关联关系。|
     * @return operationType
     */
    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public BudgetRecordInfo withOperationTime(String operationTime) {
        this.operationTime = operationTime;
        return this;
    }

    /**
     * |参数名称：操作时间| |参数的约束及描述：UTC时间，格式为：yyyy-MM-ddTHH:mm:ssZ。|
     * @return operationTime
     */
    public String getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(String operationTime) {
        this.operationTime = operationTime;
    }

    public BudgetRecordInfo withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * |参数名称：操作员或系统system| |参数的约束及描述：范围限制：0-64|
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public BudgetRecordInfo withBudgetType(String budgetType) {
        this.budgetType = budgetType;
        return this;
    }

    /**
     * |参数名称：预算模式| |参数的约束及描述：范围限制：0-10。MONTHLY：月度预算 PACKAGE：一次性预算|
     * @return budgetType
     */
    public String getBudgetType() {
        return budgetType;
    }

    public void setBudgetType(String budgetType) {
        this.budgetType = budgetType;
    }

    public BudgetRecordInfo withPartnerCorpName(String partnerCorpName) {
        this.partnerCorpName = partnerCorpName;
        return this;
    }

    /**
     * |参数名称：伙伴名称| |参数的约束及描述：范围限制：0-256|
     * @return partnerCorpName
     */
    public String getPartnerCorpName() {
        return partnerCorpName;
    }

    public void setPartnerCorpName(String partnerCorpName) {
        this.partnerCorpName = partnerCorpName;
    }

    public BudgetRecordInfo withPartnerAccountName(String partnerAccountName) {
        this.partnerAccountName = partnerAccountName;
        return this;
    }

    /**
     * |参数名称：伙伴账号名| |参数的约束及描述：范围限制：0-128|
     * @return partnerAccountName
     */
    public String getPartnerAccountName() {
        return partnerAccountName;
    }

    public void setPartnerAccountName(String partnerAccountName) {
        this.partnerAccountName = partnerAccountName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BudgetRecordInfo that = (BudgetRecordInfo) obj;
        return Objects.equals(this.budgetAmount, that.budgetAmount)
            && Objects.equals(this.operationType, that.operationType)
            && Objects.equals(this.operationTime, that.operationTime) && Objects.equals(this.operator, that.operator)
            && Objects.equals(this.budgetType, that.budgetType)
            && Objects.equals(this.partnerCorpName, that.partnerCorpName)
            && Objects.equals(this.partnerAccountName, that.partnerAccountName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(budgetAmount,
            operationType,
            operationTime,
            operator,
            budgetType,
            partnerCorpName,
            partnerAccountName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BudgetRecordInfo {\n");
        sb.append("    budgetAmount: ").append(toIndentedString(budgetAmount)).append("\n");
        sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
        sb.append("    operationTime: ").append(toIndentedString(operationTime)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    budgetType: ").append(toIndentedString(budgetType)).append("\n");
        sb.append("    partnerCorpName: ").append(toIndentedString(partnerCorpName)).append("\n");
        sb.append("    partnerAccountName: ").append(toIndentedString(partnerAccountName)).append("\n");
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
