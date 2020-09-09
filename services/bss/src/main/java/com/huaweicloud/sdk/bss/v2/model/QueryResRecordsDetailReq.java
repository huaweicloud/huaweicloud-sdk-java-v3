package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * QueryResRecordsDetailReq
 */
public class QueryResRecordsDetailReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bill_type")
    
    private Integer billType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="charge_mode")
    
    private Integer chargeMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cloud_service_type")
    
    private String cloudServiceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cycle")
    
    private String cycle;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="include_zero_record")
    
    private Boolean includeZeroRecord;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit = 10;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset = 0;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region")
    
    private String region;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="res_instance_id")
    
    private String resInstanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_type")
    
    private String resourceType;

    public QueryResRecordsDetailReq withBillType(Integer billType) {
        this.billType = billType;
        return this;
    }

    


    /**
     * |参数名称：账单类型| |参数的约束及描述：该参数非必填，且只允许整数,1：消费-新购；2：消费-续订；3：消费-变更；4：退款-退订；5：消费-使用；8：消费-自动续订；9：调账-补偿；12：消费-按时计费；13：消费-退订手续费；14：消费-服务支持计划月末扣费；16：调账-扣费|
     * minimum: 1
     * maximum: 16
     * @return billType
     */
    public Integer getBillType() {
        return billType;
    }

    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    public QueryResRecordsDetailReq withChargeMode(Integer chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    


    /**
     * |参数名称：支付方式| |参数的约束及描述：该参数非必填，且只允许整数,1 : 包周期；3: 按需。10: 预留实例|
     * minimum: 1
     * maximum: 10
     * @return chargeMode
     */
    public Integer getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(Integer chargeMode) {
        this.chargeMode = chargeMode;
    }

    public QueryResRecordsDetailReq withCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
        return this;
    }

    


    /**
     * |参数名称：云服务类型编码| |参数的约束及描述：该参数非必填，最大长度：64，且只允许字符串，例如ECS的云服务类型编码为“hws.service.type.ec2”|
     * @return cloudServiceType
     */
    public String getCloudServiceType() {
        return cloudServiceType;
    }

    public void setCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
    }

    public QueryResRecordsDetailReq withCycle(String cycle) {
        this.cycle = cycle;
        return this;
    }

    


    /**
     * |参数名称：消费月份| |参数的约束及描述：该参数必填，最大长度：8，比如2018-12|
     * @return cycle
     */
    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public QueryResRecordsDetailReq withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * |参数名称：企业项目ID| |参数的约束及描述：该参数非必，最大长度：64，且只允许字符串|
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
     * |参数名称：返回是否包含应付金额为0的记录| |参数的约束及描述：该参数非必填，且只允许布尔型，true: 包含；false: 不包含|
     * @return includeZeroRecord
     */
    public Boolean getIncludeZeroRecord() {
        return includeZeroRecord;
    }

    public void setIncludeZeroRecord(Boolean includeZeroRecord) {
        this.includeZeroRecord = includeZeroRecord;
    }

    public QueryResRecordsDetailReq withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * |参数名称：页面大小| |参数的约束及描述：该参数非必填，且只允许1-100的数字，默认10|
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

    public QueryResRecordsDetailReq withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * |参数名称：偏移量| |参数的约束及描述：该参数非必填，且只允许数字，默认为1|
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

    public QueryResRecordsDetailReq withRegion(String region) {
        this.region = region;
        return this;
    }

    


    /**
     * |参数名称：云服务区编码| |参数的约束及描述：该参数非必填，最大长度：64，且只允许字符串，例如：“cn-north-1”|
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
     * |参数名称：资源实例ID| |参数的约束及描述：该参数非必填，最大长度：64，且只允字符串|
     * @return resInstanceId
     */
    public String getResInstanceId() {
        return resInstanceId;
    }

    public void setResInstanceId(String resInstanceId) {
        this.resInstanceId = resInstanceId;
    }

    public QueryResRecordsDetailReq withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    


    /**
     * |参数名称：资源类型编码| |参数的约束及描述：该参数非必填，最大长度：64，且只允许字符串，例如ECS的VM为“hws.resource.type.vm”|
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryResRecordsDetailReq queryResRecordsDetailReq = (QueryResRecordsDetailReq) o;
        return Objects.equals(this.billType, queryResRecordsDetailReq.billType) &&
            Objects.equals(this.chargeMode, queryResRecordsDetailReq.chargeMode) &&
            Objects.equals(this.cloudServiceType, queryResRecordsDetailReq.cloudServiceType) &&
            Objects.equals(this.cycle, queryResRecordsDetailReq.cycle) &&
            Objects.equals(this.enterpriseProjectId, queryResRecordsDetailReq.enterpriseProjectId) &&
            Objects.equals(this.includeZeroRecord, queryResRecordsDetailReq.includeZeroRecord) &&
            Objects.equals(this.limit, queryResRecordsDetailReq.limit) &&
            Objects.equals(this.offset, queryResRecordsDetailReq.offset) &&
            Objects.equals(this.region, queryResRecordsDetailReq.region) &&
            Objects.equals(this.resInstanceId, queryResRecordsDetailReq.resInstanceId) &&
            Objects.equals(this.resourceType, queryResRecordsDetailReq.resourceType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(billType, chargeMode, cloudServiceType, cycle, enterpriseProjectId, includeZeroRecord, limit, offset, region, resInstanceId, resourceType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryResRecordsDetailReq {\n");
        sb.append("    billType: ").append(toIndentedString(billType)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    cycle: ").append(toIndentedString(cycle)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    includeZeroRecord: ").append(toIndentedString(includeZeroRecord)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    resInstanceId: ").append(toIndentedString(resInstanceId)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
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

