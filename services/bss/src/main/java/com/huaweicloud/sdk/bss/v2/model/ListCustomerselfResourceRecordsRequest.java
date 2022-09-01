package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListCustomerselfResourceRecordsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    @JacksonXmlProperty(localName = "X-Language")

    private String xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cycle")

    @JacksonXmlProperty(localName = "cycle")

    private String cycle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_type")

    @JacksonXmlProperty(localName = "cloud_service_type")

    private String cloudServiceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    @JacksonXmlProperty(localName = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_mode")

    @JacksonXmlProperty(localName = "charge_mode")

    private String chargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bill_type")

    @JacksonXmlProperty(localName = "bill_type")

    private Integer billType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    @JacksonXmlProperty(localName = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    @JacksonXmlProperty(localName = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "include_zero_record")

    @JacksonXmlProperty(localName = "include_zero_record")

    private Boolean includeZeroRecord;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "method")

    @JacksonXmlProperty(localName = "method")

    private String method;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_customer_id")

    @JacksonXmlProperty(localName = "sub_customer_id")

    private String subCustomerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trade_id")

    @JacksonXmlProperty(localName = "trade_id")

    private String tradeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bill_date_begin")

    @JacksonXmlProperty(localName = "bill_date_begin")

    private String billDateBegin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bill_date_end")

    @JacksonXmlProperty(localName = "bill_date_end")

    private String billDateEnd;

    public ListCustomerselfResourceRecordsRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * 语言：中文：zh_CN 英文：en_US。缺省为zh_CN
     * @return xLanguage
     */
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

    /**
     * 查询的资源消费记录所在账期，东八区时间，格式：YYYY-MM。
     * @return cycle
     */
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

    /**
     * 云服务类型编码，例如OBS的云服务类型编码为“hws.service.type.obs”。您可以调用[查询云服务类型列表](https://support.huaweicloud.com/api-oce/zh-cn_topic_0000001256679455.html)接口获取。此参数不携带时，不作为筛选条件；携带值为空或携带值为空串时，作为筛选条件。
     * @return cloudServiceType
     */
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

    /**
     * 云服务区编码，例如：“cn-north-1”。具体请参见[地区和终端节点](https://developer.huaweicloud.com/endpoint)对应云服务的“区域”列的值。此参数不携带时，不作为筛选条件；携带值为空或携带值为空串时，作为筛选条件。
     * @return region
     */
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

    /**
     * 计费模式。1：包年/包月3：按需10：预留实例 此参数不携带时，不作为筛选条件。
     * @return chargeMode
     */
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

    /**
     * 账单类型。1：消费-新购2：消费-续订3：消费-变更4：退款-退订5：消费-使用8：消费-自动续订9：调账-补偿14：消费-服务支持计划月末扣费16：调账-扣费18：消费-按月付费20：退款-变更此参数不携带或携带值为空时，不作为筛选条件。
     * minimum: 0
     * maximum: 127
     * @return billType
     */
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

    /**
     * 偏移量，从0开始。默认值为0。 说明： offset用于分页处理，如不涉及分页，请使用默认值0。offset表示相对于满足条件的第一个数据的偏移量。如offset = 1，则返回满足条件的第二个数据至最后一个数据。例如，满足查询条件的结果共10条数据，limit取值为10，offset取值为1，则返回的数据为2~10，第一条数据不返回。
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

    public ListCustomerselfResourceRecordsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每次查询的数量限制。默认值为10。
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
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

    /**
     * 资源ID。此参数不携带时，不作为筛选条件；携带值为空或携带值为空串时，作为筛选条件。
     * @return resourceId
     */
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

    /**
     * 企业项目标识（企业项目ID）。default项目对应ID：0未归集（表示该云服务不支持企业项目管理能力）项目对应ID：-1其余项目对应ID获取方法请参见[如何获取企业项目ID](https://support.huaweicloud.com/usermanual-em/zh-cn_topic_0126101490.html)。此参数不携带时，不作为筛选条件；携带值为空或携带值为空串时，作为筛选条件。
     * @return enterpriseProjectId
     */
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

    /**
     * 返回是否包含应付金额为0的记录。true：包含false：不包含 此参数不携带或携带值为空时，不作为筛选条件。
     * @return includeZeroRecord
     */
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

    /**
     * 查询资源消费记录的方式。oneself：客户自己sub_customer：企业子客户all：客户自己和企业子客户 此参数不携带或携带值为空时，默认值为“all”，如果没有企业子客户，取值为all时查询的是客户自己的资源消费记录。
     * @return method
     */
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

    /**
     * 企业子账号ID。此参数携带值为空串时，不作为筛选条件。 说明： 如果method取值不为sub_customer，则该参数无效。如果method取值为sub_customer，则该参数不能为空。
     * @return subCustomerId
     */
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

    /**
     * 订单ID或交易ID。账单类型为1、2、3、4和8时此处为订单ID。账单类型为其它场景时此处为交易ID，为扣费维度的唯一标识。例如非月末扣费时为应收ID；月末扣费时为账单ID。此参数不携带时，不作为筛选条件；携带值为空或携带值为空串时，作为筛选条件。
     * @return tradeId
     */
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

    /**
     * 查询的资源消费记录的开始日期，东八区时间，格式为YYYY-MM-DD。此参数不携带或携带值为空或携带值为空串时，默认值取cycle月份的第一天。 说明： 必须和cycle（即资源的消费账期）在同一个月。bill_date_begin和bill_date_end两个参数必须同时出现，否则仅按照cycle（即资源的消费账期）进行查询。
     * @return billDateBegin
     */
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

    /**
     * 查询的资源消费记录的结束日期，东八区时间，格式为YYYY-MM-DD。此参数不携带或携带值为空或携带值为空串时，默认值取cycle月份的最后一天。 说明： 必须和cycle（即资源的消费账期）在同一个月。bill_date_begin和bill_date_end两个参数必须同时出现，否则仅按照cycle（即资源的消费账期）进行查询。
     * @return billDateEnd
     */
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
