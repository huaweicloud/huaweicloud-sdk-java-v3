package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * QuotaRecord
 */
public class QuotaRecord {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    private String operator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_type")

    private String operationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_id")

    private String quotaId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_quota_id")

    private String parentQuotaId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amount")

    private BigDecimal amount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_time")

    private String operationTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private String result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indirect_partner_account_name")

    private String indirectPartnerAccountName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indirect_partner_id")

    private String indirectPartnerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indirect_partner_name")

    private String indirectPartnerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    private String remark;

    public QuotaRecord withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 记录ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public QuotaRecord withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * 操作员的账号名称。
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public QuotaRecord withOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }

    /**
     * 操作类型。 10：发放额度11：回收额度
     * @return operationType
     */
    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public QuotaRecord withQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }

    /**
     * 云经销商的代金券额度ID。 即华为云总经销商给云经销商发放代金券额度时，产生的云经销商的代金券额度ID，或者从云经销商回收代金券额度时，云经销商的代金券额度ID。
     * @return quotaId
     */
    public String getQuotaId() {
        return quotaId;
    }

    public void setQuotaId(String quotaId) {
        this.quotaId = quotaId;
    }

    public QuotaRecord withParentQuotaId(String parentQuotaId) {
        this.parentQuotaId = parentQuotaId;
        return this;
    }

    /**
     * 父额度ID。 这即华为云总经销商给云经销商发放代金券额度时，华为云总经销商的额度ID，或者从云经销商回收代金券额度时，回收的华为云总经销商的额度ID。
     * @return parentQuotaId
     */
    public String getParentQuotaId() {
        return parentQuotaId;
    }

    public void setParentQuotaId(String parentQuotaId) {
        this.parentQuotaId = parentQuotaId;
    }

    public QuotaRecord withAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    /**
     * 发放回收的金额。 取值大于0且精确到小数点后2位，单位：元。
     * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public QuotaRecord withOperationTime(String operationTime) {
        this.operationTime = operationTime;
        return this;
    }

    /**
     * 操作时间，UTC时间，UTC时间，格式：yyyy-MM-dd'T'HH:mm:ss'Z'，如“2019-05-06T08:05:01Z”。其中，HH范围是0～23，mm和ss范围是0～59。
     * @return operationTime
     */
    public String getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(String operationTime) {
        this.operationTime = operationTime;
    }

    public QuotaRecord withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * 操作结果。 0：成功-1：失败
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public QuotaRecord withIndirectPartnerAccountName(String indirectPartnerAccountName) {
        this.indirectPartnerAccountName = indirectPartnerAccountName;
        return this;
    }

    /**
     * 云经销商的账号名。
     * @return indirectPartnerAccountName
     */
    public String getIndirectPartnerAccountName() {
        return indirectPartnerAccountName;
    }

    public void setIndirectPartnerAccountName(String indirectPartnerAccountName) {
        this.indirectPartnerAccountName = indirectPartnerAccountName;
    }

    public QuotaRecord withIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
        return this;
    }

    /**
     * 云经销商ID。
     * @return indirectPartnerId
     */
    public String getIndirectPartnerId() {
        return indirectPartnerId;
    }

    public void setIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
    }

    public QuotaRecord withIndirectPartnerName(String indirectPartnerName) {
        this.indirectPartnerName = indirectPartnerName;
        return this;
    }

    /**
     * 云经销商的公司名称。
     * @return indirectPartnerName
     */
    public String getIndirectPartnerName() {
        return indirectPartnerName;
    }

    public void setIndirectPartnerName(String indirectPartnerName) {
        this.indirectPartnerName = indirectPartnerName;
    }

    public QuotaRecord withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /**
     * 备注。
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QuotaRecord quotaRecord = (QuotaRecord) o;
        return Objects.equals(this.id, quotaRecord.id) && Objects.equals(this.operator, quotaRecord.operator)
            && Objects.equals(this.operationType, quotaRecord.operationType)
            && Objects.equals(this.quotaId, quotaRecord.quotaId)
            && Objects.equals(this.parentQuotaId, quotaRecord.parentQuotaId)
            && Objects.equals(this.amount, quotaRecord.amount)
            && Objects.equals(this.operationTime, quotaRecord.operationTime)
            && Objects.equals(this.result, quotaRecord.result)
            && Objects.equals(this.indirectPartnerAccountName, quotaRecord.indirectPartnerAccountName)
            && Objects.equals(this.indirectPartnerId, quotaRecord.indirectPartnerId)
            && Objects.equals(this.indirectPartnerName, quotaRecord.indirectPartnerName)
            && Objects.equals(this.remark, quotaRecord.remark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            operator,
            operationType,
            quotaId,
            parentQuotaId,
            amount,
            operationTime,
            result,
            indirectPartnerAccountName,
            indirectPartnerId,
            indirectPartnerName,
            remark);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuotaRecord {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
        sb.append("    quotaId: ").append(toIndentedString(quotaId)).append("\n");
        sb.append("    parentQuotaId: ").append(toIndentedString(parentQuotaId)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    operationTime: ").append(toIndentedString(operationTime)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    indirectPartnerAccountName: ").append(toIndentedString(indirectPartnerAccountName)).append("\n");
        sb.append("    indirectPartnerId: ").append(toIndentedString(indirectPartnerId)).append("\n");
        sb.append("    indirectPartnerName: ").append(toIndentedString(indirectPartnerName)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
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
