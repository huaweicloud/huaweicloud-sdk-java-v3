package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListCustomerselfResourceRecordsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    private String xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cycle")

    private String cycle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_type")

    private String cloudServiceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_mode")

    private String chargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bill_type")

    private Integer billType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "include_zero_record")

    private Boolean includeZeroRecord;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "method")

    private String method;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_customer_id")

    private String subCustomerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trade_id")

    private String tradeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bill_date_begin")

    private String billDateBegin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bill_date_end")

    private String billDateEnd;

    public ListCustomerselfResourceRecordsRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /** |参数名称：语言| |参数的约束及描述：中文：zh_CN 英文：en_US。缺省为zh_CN|
     * 
     * @return xLanguage */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public ListCustomerselfResourceRecordsRequest withCycle(String cycle) {
        this.cycle = cycle;
        return this;
    }

    /** |参数名称：开始时间，格式：yyyy-MM| |参数的约束及描述：|
     * 
     * @return cycle */
    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public ListCustomerselfResourceRecordsRequest withCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
        return this;
    }

    /** |参数名称：云服务类型编码，例如OBS的云服务类型编码为“hws.service.type.obs”。具体请参见云服务类型云服务类型云服务类型云服务类型。| |参数的约束及描述：|
     * 
     * @return cloudServiceType */
    public String getCloudServiceType() {
        return cloudServiceType;
    }

    public void setCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
    }

    public ListCustomerselfResourceRecordsRequest withRegion(String region) {
        this.region = region;
        return this;
    }

    /** |参数名称：云服务区编码，例如：“cn-north-1”。具体请参见地区和终端节点地区和终端节点对应云服务的“区域”列的值。| |参数的约束及描述：|
     * 
     * @return region */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ListCustomerselfResourceRecordsRequest withChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /** |参数名称：支付方式。1 : 包周期；3: 按需。10: 预留实例。| |参数的约束及描述：|
     * 
     * @return chargeMode */
    public String getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
    }

    public ListCustomerselfResourceRecordsRequest withBillType(Integer billType) {
        this.billType = billType;
        return this;
    }

    /** |参数名称：账单类型。1：消费-新购2：消费-续订3：消费-变更4：退款-退订5：消费-使用8：消费-自动续订9：调账-补偿12：消费-按时计费13：消费-退订手续费14：消费-服务支持计划月末扣费 15消费-税金
     * 16：调账-扣费 17：消费-保底差额 100：退款-退订税金 101：调账-补偿税金 102：调账-扣费税金| |参数的约束及描述：| minimum: 0 maximum: 127
     * 
     * @return billType */
    public Integer getBillType() {
        return billType;
    }

    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    public ListCustomerselfResourceRecordsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /** |参数名称：偏移量，从0开始| |参数的约束及描述：| minimum: 0 maximum: 2147483647
     * 
     * @return offset */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListCustomerselfResourceRecordsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** |参数名称：每次查询的限制| |参数的约束及描述：| minimum: 1 maximum: 1000
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListCustomerselfResourceRecordsRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /** |参数名称：资源ID。| |参数的约束及描述：|
     * 
     * @return resourceId */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ListCustomerselfResourceRecordsRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /** |参数名称：企业项目ID。| |参数的约束及描述：|
     * 
     * @return enterpriseProjectId */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListCustomerselfResourceRecordsRequest withIncludeZeroRecord(Boolean includeZeroRecord) {
        this.includeZeroRecord = includeZeroRecord;
        return this;
    }

    /** |参数名称：返回是否包含应付金额为0的记录。| |参数的约束及描述：|
     * 
     * @return includeZeroRecord */
    public Boolean getIncludeZeroRecord() {
        return includeZeroRecord;
    }

    public void setIncludeZeroRecord(Boolean includeZeroRecord) {
        this.includeZeroRecord = includeZeroRecord;
    }

    public ListCustomerselfResourceRecordsRequest withMethod(String method) {
        this.method = method;
        return this;
    }

    /** |参数名称：查询方式。oneself：自身sub_customer: 企业子客户all:自己和企业子客户| |参数的约束及描述：oneself：自身sub_customer: 企业子客户all:自己和企业子客户|
     * 
     * @return method */
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public ListCustomerselfResourceRecordsRequest withSubCustomerId(String subCustomerId) {
        this.subCustomerId = subCustomerId;
        return this;
    }

    /** |参数名称：企业子账号ID。| |参数的约束及描述：注意：method不等于sub_customer的时候，该参数无效，如果method等于sub_customer，该参数不能为空|
     * 
     * @return subCustomerId */
    public String getSubCustomerId() {
        return subCustomerId;
    }

    public void setSubCustomerId(String subCustomerId) {
        this.subCustomerId = subCustomerId;
    }

    public ListCustomerselfResourceRecordsRequest withTradeId(String tradeId) {
        this.tradeId = tradeId;
        return this;
    }

    /** |参数名称：订单ID 或 交易ID1，2，3，4，8时为订单ID，其它场景下为： 交易ID(非月末扣费：应收ID；月末扣费：账单ID)，扣费维度的唯一标识| |参数的约束及描述：|
     * 
     * @return tradeId */
    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public ListCustomerselfResourceRecordsRequest withBillDateBegin(String billDateBegin) {
        this.billDateBegin = billDateBegin;
        return this;
    }

    /** |参数名称：计费日期，格式为YYYY-MM-DD| |参数的约束及描述：必须和cycle，即资源的消费账期在同一个月。|
     * 
     * @return billDateBegin */
    public String getBillDateBegin() {
        return billDateBegin;
    }

    public void setBillDateBegin(String billDateBegin) {
        this.billDateBegin = billDateBegin;
    }

    public ListCustomerselfResourceRecordsRequest withBillDateEnd(String billDateEnd) {
        this.billDateEnd = billDateEnd;
        return this;
    }

    /** |参数名称：计费日期，格式为YYYY-MM-DD| |参数的约束及描述：必须和cycle，即资源的消费账期在同一个月。 begin和end必须同时出现，否则忽略这两个参数。仅仅按照cycle进行查询。|
     * 
     * @return billDateEnd */
    public String getBillDateEnd() {
        return billDateEnd;
    }

    public void setBillDateEnd(String billDateEnd) {
        this.billDateEnd = billDateEnd;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCustomerselfResourceRecordsRequest listCustomerselfResourceRecordsRequest =
            (ListCustomerselfResourceRecordsRequest) o;
        return Objects.equals(this.xLanguage, listCustomerselfResourceRecordsRequest.xLanguage)
            && Objects.equals(this.cycle, listCustomerselfResourceRecordsRequest.cycle)
            && Objects.equals(this.cloudServiceType, listCustomerselfResourceRecordsRequest.cloudServiceType)
            && Objects.equals(this.region, listCustomerselfResourceRecordsRequest.region)
            && Objects.equals(this.chargeMode, listCustomerselfResourceRecordsRequest.chargeMode)
            && Objects.equals(this.billType, listCustomerselfResourceRecordsRequest.billType)
            && Objects.equals(this.offset, listCustomerselfResourceRecordsRequest.offset)
            && Objects.equals(this.limit, listCustomerselfResourceRecordsRequest.limit)
            && Objects.equals(this.resourceId, listCustomerselfResourceRecordsRequest.resourceId)
            && Objects.equals(this.enterpriseProjectId, listCustomerselfResourceRecordsRequest.enterpriseProjectId)
            && Objects.equals(this.includeZeroRecord, listCustomerselfResourceRecordsRequest.includeZeroRecord)
            && Objects.equals(this.method, listCustomerselfResourceRecordsRequest.method)
            && Objects.equals(this.subCustomerId, listCustomerselfResourceRecordsRequest.subCustomerId)
            && Objects.equals(this.tradeId, listCustomerselfResourceRecordsRequest.tradeId)
            && Objects.equals(this.billDateBegin, listCustomerselfResourceRecordsRequest.billDateBegin)
            && Objects.equals(this.billDateEnd, listCustomerselfResourceRecordsRequest.billDateEnd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xLanguage,
            cycle,
            cloudServiceType,
            region,
            chargeMode,
            billType,
            offset,
            limit,
            resourceId,
            enterpriseProjectId,
            includeZeroRecord,
            method,
            subCustomerId,
            tradeId,
            billDateBegin,
            billDateEnd);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCustomerselfResourceRecordsRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    cycle: ").append(toIndentedString(cycle)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    billType: ").append(toIndentedString(billType)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    includeZeroRecord: ").append(toIndentedString(includeZeroRecord)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    subCustomerId: ").append(toIndentedString(subCustomerId)).append("\n");
        sb.append("    tradeId: ").append(toIndentedString(tradeId)).append("\n");
        sb.append("    billDateBegin: ").append(toIndentedString(billDateBegin)).append("\n");
        sb.append("    billDateEnd: ").append(toIndentedString(billDateEnd)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
