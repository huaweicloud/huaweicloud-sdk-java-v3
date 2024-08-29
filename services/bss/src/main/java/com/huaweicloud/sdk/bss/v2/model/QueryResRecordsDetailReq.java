package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * QueryResRecordsDetailReq
 */
public class QueryResRecordsDetailReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cycle")

    private String cycle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_type")

    private String cloudServiceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "res_instance_id")

    private String resInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_mode")

    private Integer chargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bill_type")

    private Integer billType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "include_zero_record")

    private Boolean includeZeroRecord;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "method")

    private String method;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_customer_id")

    private String subCustomerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statistic_type")

    private Integer statisticType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_type")

    private String queryType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bill_cycle_begin")

    private String billCycleBegin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bill_cycle_end")

    private String billCycleEnd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "payer_account_id")

    private String payerAccountId;

    public QueryResRecordsDetailReq withCycle(String cycle) {
        this.cycle = cycle;
        return this;
    }

    /**
     * 查询的资源详单所在账期，东八区时间，格式为YYYY-MM。 示例：2019-01。  说明： 不支持2019年1月份之前的资源详单。
     * @return cycle
     */
    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public QueryResRecordsDetailReq withCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
        return this;
    }

    /**
     * 云服务类型编码，例如OBS的云服务类型编码为“hws.service.type.obs”。您可以调用查询云服务类型列表接口获取。 此参数不携带或携带值为空串或携带值为null时，不作为筛选条件。
     * @return cloudServiceType
     */
    public String getCloudServiceType() {
        return cloudServiceType;
    }

    public void setCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
    }

    public QueryResRecordsDetailReq withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型编码，例如ECS的VM为“hws.resource.type.vm”。您可以调用查询资源类型列表接口获取。 此参数不携带或携带值为空串或携带值为null时，不作为筛选条件。
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public QueryResRecordsDetailReq withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 云服务区编码，例如：“cn-north-1”。具体请参见地区和终端节点对应云服务的“区域”列的值。 此参数不携带或携带值为空串或携带值为null时，不作为筛选条件。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public QueryResRecordsDetailReq withResInstanceId(String resInstanceId) {
        this.resInstanceId = resInstanceId;
        return this;
    }

    /**
     * 资源实例ID。 此参数不携带或携带值为空串或携带值为null时，不作为筛选条件。
     * @return resInstanceId
     */
    public String getResInstanceId() {
        return resInstanceId;
    }

    public void setResInstanceId(String resInstanceId) {
        this.resInstanceId = resInstanceId;
    }

    public QueryResRecordsDetailReq withChargeMode(Integer chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * 计费模式。 1 : 包年/包月3：按需10：预留实例11：节省计划 此参数不携带或者携带值为null时，返回所有计费模式的资源详单数据记录。
     * minimum: 1
     * maximum: 11
     * @return chargeMode
     */
    public Integer getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(Integer chargeMode) {
        this.chargeMode = chargeMode;
    }

    public QueryResRecordsDetailReq withBillType(Integer billType) {
        this.billType = billType;
        return this;
    }

    /**
     * 账单类型： 1：消费-新购2：消费-续订3：消费-变更4：退款-退订5：消费-使用8：消费-自动续订9：调账-补偿14：消费-服务支持计划月末扣费16：调账-扣费18：消费-按月付费20：退款-变更23：消费-节省计划抵扣24：退款-包年/包月转按需 此参数不携带或者携带值为null时，返回所有账单类型的资源详单数据记录。
     * minimum: 1
     * maximum: 127
     * @return billType
     */
    public Integer getBillType() {
        return billType;
    }

    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    public QueryResRecordsDetailReq withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目标识（企业项目ID）。 default项目对应ID：0未归集（表示该云服务不支持企业项目管理能力）项目对应ID：null其余项目对应ID获取方法请参见[如何获取企业项目ID](https://support.huaweicloud.com/usermanual-em/zh-cn_topic_0126101490.html)。此参数不携带或携带值为空串或携带值为null时，不作为筛选条件。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public QueryResRecordsDetailReq withIncludeZeroRecord(Boolean includeZeroRecord) {
        this.includeZeroRecord = includeZeroRecord;
        return this;
    }

    /**
     * 返回是否包含应付金额为0的记录。 true: 包含false: 不包含 此参数不携带或携带值为空串或携带值为null时，不作为筛选条件。
     * @return includeZeroRecord
     */
    public Boolean getIncludeZeroRecord() {
        return includeZeroRecord;
    }

    public void setIncludeZeroRecord(Boolean includeZeroRecord) {
        this.includeZeroRecord = includeZeroRecord;
    }

    public QueryResRecordsDetailReq withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，从0开始。默认值为0。  说明： offset用于分页处理，如不涉及分页，请使用默认值0。offset表示相对于满足条件的第一个数据的偏移量。如offset = 1，则返回满足条件的第二个数据至最后一个数据。 例如，满足查询条件的结果共10条数据，limit取值为10，offset取值为1，则返回的数据为2~10，第一条数据不返回。
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

    public QueryResRecordsDetailReq withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 页面大小。默认值为10。
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

    public QueryResRecordsDetailReq withMethod(String method) {
        this.method = method;
        return this;
    }

    /**
     * 查询方式。 oneself：客户自己sub_customer：企业子客户all：客户自己和企业子客户 此参数不携带或携带值为空串或携带值为null时，默认值为“all”，如果没有企业子客户，all的时候也是查询客户自己的数据。  说明： 若需要查询财务独立企业子的账单信息，前提是子账号已经接受了企业主账号的“允许查看子账号消费信息”的申请。申请方法见“变更子账号权限”。
     * @return method
     */
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public QueryResRecordsDetailReq withSubCustomerId(String subCustomerId) {
        this.subCustomerId = subCustomerId;
        return this;
    }

    /**
     * 企业子账号ID。  说明： 如果method取值不为sub_customer，则该参数无效。如果method取值为sub_customer，则该参数不能为空。
     * @return subCustomerId
     */
    public String getSubCustomerId() {
        return subCustomerId;
    }

    public void setSubCustomerId(String subCustomerId) {
        this.subCustomerId = subCustomerId;
    }

    public QueryResRecordsDetailReq withStatisticType(Integer statisticType) {
        this.statisticType = statisticType;
        return this;
    }

    /**
     * 统计类型。默认值为1。 1：按账期2：按天
     * minimum: 1
     * maximum: 2
     * @return statisticType
     */
    public Integer getStatisticType() {
        return statisticType;
    }

    public void setStatisticType(Integer statisticType) {
        this.statisticType = statisticType;
    }

    public QueryResRecordsDetailReq withQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }

    /**
     * 查询类型。默认值为BILLCYCLE。 BILLCYCLE：按月DAILY：按天仅当statistic_type=2时，支持传递query_type=DAILY。该参数不携带或携带值为null或携带为空串时，取默认值BILLCYCLE。
     * @return queryType
     */
    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public QueryResRecordsDetailReq withBillCycleBegin(String billCycleBegin) {
        this.billCycleBegin = billCycleBegin;
        return this;
    }

    /**
     * 账期开始时间。格式为YYYY-MM-DD。 仅当query_type=DAILY时，必须传递账期开始时间。该参数不携带或携带值为null或携带为空串时，不作为筛选条件。
     * @return billCycleBegin
     */
    public String getBillCycleBegin() {
        return billCycleBegin;
    }

    public void setBillCycleBegin(String billCycleBegin) {
        this.billCycleBegin = billCycleBegin;
    }

    public QueryResRecordsDetailReq withBillCycleEnd(String billCycleEnd) {
        this.billCycleEnd = billCycleEnd;
        return this;
    }

    /**
     * 账期结束时间。格式为YYYY-MM-DD。 仅当query_type=DAILY时，必须传递账期结束时间。该参数不携带或携带值为null或携带为空串时，不作为筛选条件。
     * @return billCycleEnd
     */
    public String getBillCycleEnd() {
        return billCycleEnd;
    }

    public void setBillCycleEnd(String billCycleEnd) {
        this.billCycleEnd = billCycleEnd;
    }

    public QueryResRecordsDetailReq withPayerAccountId(String payerAccountId) {
        this.payerAccountId = payerAccountId;
        return this;
    }

    /**
     * |参数名称：支付账号ID。| |参数的约束及描述：普通客户、财务独立企业子客户查询消费记录，只能查询到客户自己的消费记录，该参数不携带或携带为自身ID时，查询的都只是自身的消费记录； 企业主客户查询消费记录，不携带时，查询的是自身的、财务托管企业子、财务独立企业子的消费记录；入参自身ID时，查询的是自身的、财务托管企业子的消费记录；也可入参其名下财务独立企业子的客户ID，只查询该财务独立企业子的消费记录； 财务托管企业子查询消费记录，入参自身ID时，查询的是未与企业主关联时的消费记录；入参企业主客户ID时，查询的是与企业主关联后的消费记录；不携带时查询以上全部消费记录|
     * @return payerAccountId
     */
    public String getPayerAccountId() {
        return payerAccountId;
    }

    public void setPayerAccountId(String payerAccountId) {
        this.payerAccountId = payerAccountId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryResRecordsDetailReq that = (QueryResRecordsDetailReq) obj;
        return Objects.equals(this.cycle, that.cycle) && Objects.equals(this.cloudServiceType, that.cloudServiceType)
            && Objects.equals(this.resourceType, that.resourceType) && Objects.equals(this.region, that.region)
            && Objects.equals(this.resInstanceId, that.resInstanceId)
            && Objects.equals(this.chargeMode, that.chargeMode) && Objects.equals(this.billType, that.billType)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.includeZeroRecord, that.includeZeroRecord)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.method, that.method) && Objects.equals(this.subCustomerId, that.subCustomerId)
            && Objects.equals(this.statisticType, that.statisticType) && Objects.equals(this.queryType, that.queryType)
            && Objects.equals(this.billCycleBegin, that.billCycleBegin)
            && Objects.equals(this.billCycleEnd, that.billCycleEnd)
            && Objects.equals(this.payerAccountId, that.payerAccountId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cycle,
            cloudServiceType,
            resourceType,
            region,
            resInstanceId,
            chargeMode,
            billType,
            enterpriseProjectId,
            includeZeroRecord,
            offset,
            limit,
            method,
            subCustomerId,
            statisticType,
            queryType,
            billCycleBegin,
            billCycleEnd,
            payerAccountId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryResRecordsDetailReq {\n");
        sb.append("    cycle: ").append(toIndentedString(cycle)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    resInstanceId: ").append(toIndentedString(resInstanceId)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    billType: ").append(toIndentedString(billType)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    includeZeroRecord: ").append(toIndentedString(includeZeroRecord)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    subCustomerId: ").append(toIndentedString(subCustomerId)).append("\n");
        sb.append("    statisticType: ").append(toIndentedString(statisticType)).append("\n");
        sb.append("    queryType: ").append(toIndentedString(queryType)).append("\n");
        sb.append("    billCycleBegin: ").append(toIndentedString(billCycleBegin)).append("\n");
        sb.append("    billCycleEnd: ").append(toIndentedString(billCycleEnd)).append("\n");
        sb.append("    payerAccountId: ").append(toIndentedString(payerAccountId)).append("\n");
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
