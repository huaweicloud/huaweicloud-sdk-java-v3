package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListSubCustomerBudgetRecordsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_id")

    private String customerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indirect_partner_id")

    private String indirectPartnerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_type")

    private String operationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "budget_type")

    private String budgetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListSubCustomerBudgetRecordsRequest withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     * |参数名称：客户ID| |参数的约束及描述：该参数必填，范围限制：1-64|
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public ListSubCustomerBudgetRecordsRequest withIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
        return this;
    }

    /**
     * |参数名称：云经销商ID| |参数的约束及描述：该参数非必填，范围限制：0-64，如果华为云总经销商（一级经销商）需要查询云经销商的子客户预算调整记录，必须携带该字段|
     * @return indirectPartnerId
     */
    public String getIndirectPartnerId() {
        return indirectPartnerId;
    }

    public void setIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
    }

    public ListSubCustomerBudgetRecordsRequest withOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }

    /**
     * |参数名称：操作类别| |参数的约束及描述：该参数非必填，SETTING：设置，DELETE：解除关联关系，此参数不携带时，查询所有类型数据。此参数携带值不支持为空或者空串。|
     * @return operationType
     */
    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public ListSubCustomerBudgetRecordsRequest withBudgetType(String budgetType) {
        this.budgetType = budgetType;
        return this;
    }

    /**
     * |参数名称：预算模式| |参数的约束及描述：该参数非必填，MONTHLY：月度预算，PACKAGE：一次性预算，此参数不携带时，查询所有类型数据。此参数携带值不支持为空或者空串。|
     * @return budgetType
     */
    public String getBudgetType() {
        return budgetType;
    }

    public void setBudgetType(String budgetType) {
        this.budgetType = budgetType;
    }

    public ListSubCustomerBudgetRecordsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * |参数名称：偏移量| |参数的约束及描述：该参数非必填，范围限制：0-2147483647，从0开始，默认值为0。|
     * minimum: 0
     * maximum: 2147483647
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListSubCustomerBudgetRecordsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * |参数名称：每次查询的数量| |参数的约束及描述：该参数非必填，范围限制：1-100，默认值为10。|
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSubCustomerBudgetRecordsRequest that = (ListSubCustomerBudgetRecordsRequest) obj;
        return Objects.equals(this.customerId, that.customerId)
            && Objects.equals(this.indirectPartnerId, that.indirectPartnerId)
            && Objects.equals(this.operationType, that.operationType)
            && Objects.equals(this.budgetType, that.budgetType) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, indirectPartnerId, operationType, budgetType, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSubCustomerBudgetRecordsRequest {\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    indirectPartnerId: ").append(toIndentedString(indirectPartnerId)).append("\n");
        sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
        sb.append("    budgetType: ").append(toIndentedString(budgetType)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
