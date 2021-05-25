package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListCustomerBillsFeeRecordsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    
    private String xLanguage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bill_cycle")
    
    private String billCycle;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="provider_type")
    
    private Integer providerType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service_type_code")
    
    private String serviceTypeCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_type_code")
    
    private String resourceTypeCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region_code")
    
    private String regionCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="charging_mode")
    
    private Integer chargingMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bill_type")
    
    private Integer billType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="trade_id")
    
    private String tradeId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="include_zero_record")
    
    private Boolean includeZeroRecord;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Integer status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="method")
    
    private String method;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sub_customer_id")
    
    private String subCustomerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;

    public ListCustomerBillsFeeRecordsRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    


    /**
     * |忽略大小写，默认 zh_cn：中文 en_us：英文|
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    

    public ListCustomerBillsFeeRecordsRequest withBillCycle(String billCycle) {
        this.billCycle = billCycle;
        return this;
    }

    


    /**
     * 查询的流水账单所在账期，格式为YYYY-MM。
     * @return billCycle
     */
    public String getBillCycle() {
        return billCycle;
    }

    public void setBillCycle(String billCycle) {
        this.billCycle = billCycle;
    }

    

    public ListCustomerBillsFeeRecordsRequest withProviderType(Integer providerType) {
        this.providerType = providerType;
        return this;
    }

    


    /**
     * 服务商。1：华为云2：云市场为空时查询包含华为云和云市场在内的全部服务商。
     * minimum: 1
     * maximum: 2
     * @return providerType
     */
    public Integer getProviderType() {
        return providerType;
    }

    public void setProviderType(Integer providerType) {
        this.providerType = providerType;
    }

    

    public ListCustomerBillsFeeRecordsRequest withServiceTypeCode(String serviceTypeCode) {
        this.serviceTypeCode = serviceTypeCode;
        return this;
    }

    


    /**
     * 云服务类型编码，例如ECS的云服务类型编码为“hws.service.type.ec2”。您可以调用查询云服务类型列表接口获取。
     * @return serviceTypeCode
     */
    public String getServiceTypeCode() {
        return serviceTypeCode;
    }

    public void setServiceTypeCode(String serviceTypeCode) {
        this.serviceTypeCode = serviceTypeCode;
    }

    

    public ListCustomerBillsFeeRecordsRequest withResourceTypeCode(String resourceTypeCode) {
        this.resourceTypeCode = resourceTypeCode;
        return this;
    }

    


    /**
     * 资源类型编码，例如ECS的VM为“hws.resource.type.vm”。您可以调用查询资源类型列表接口获取。
     * @return resourceTypeCode
     */
    public String getResourceTypeCode() {
        return resourceTypeCode;
    }

    public void setResourceTypeCode(String resourceTypeCode) {
        this.resourceTypeCode = resourceTypeCode;
    }

    

    public ListCustomerBillsFeeRecordsRequest withRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }

    


    /**
     * 云服务区编码，例如：“cn-north-1”。具体请参见地区和终端节点对应云服务的“区域”列的值。
     * @return regionCode
     */
    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    

    public ListCustomerBillsFeeRecordsRequest withChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    


    /**
     * 计费模式：1 : 包年/包月3：按需10：预留实例
     * minimum: 1
     * maximum: 10
     * @return chargingMode
     */
    public Integer getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
    }

    

    public ListCustomerBillsFeeRecordsRequest withBillType(Integer billType) {
        this.billType = billType;
        return this;
    }

    


    /**
     * 账单类型：1：消费-新购2：消费-续订3：消费-变更4：退款-退订5：消费-使用8：消费-自动续订9：调账-补偿14：消费-服务支持计划月末扣费16：调账-扣费
     * minimum: 1
     * maximum: 17
     * @return billType
     */
    public Integer getBillType() {
        return billType;
    }

    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    

    public ListCustomerBillsFeeRecordsRequest withTradeId(String tradeId) {
        this.tradeId = tradeId;
        return this;
    }

    


    /**
     * 订单ID或交易ID。账单类型为1、2、3、4和8时此处为订单ID。账单类型为其它场景时此处为交易ID，为扣费维度的唯一标识。例如非月末扣费时为应收ID；月末扣费时为账单ID。
     * @return tradeId
     */
    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    

    public ListCustomerBillsFeeRecordsRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 企业项目标识（企业项目ID）。default项目对应ID：0未归集（表示该云服务不支持企业项目管理能力）项目对应ID：-1其余项目对应ID获取方法请参见如何获取企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    

    public ListCustomerBillsFeeRecordsRequest withIncludeZeroRecord(Boolean includeZeroRecord) {
        this.includeZeroRecord = includeZeroRecord;
        return this;
    }

    


    /**
     * 返回是否包含应付金额为0的记录。true：包含false：不包含
     * @return includeZeroRecord
     */
    public Boolean getIncludeZeroRecord() {
        return includeZeroRecord;
    }

    public void setIncludeZeroRecord(Boolean includeZeroRecord) {
        this.includeZeroRecord = includeZeroRecord;
    }

    

    public ListCustomerBillsFeeRecordsRequest withStatus(Integer status) {
        this.status = status;
        return this;
    }

    


    /**
     * 支付状态。1：已支付2：未结清3：未出账
     * minimum: 1
     * maximum: 3
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    

    public ListCustomerBillsFeeRecordsRequest withMethod(String method) {
        this.method = method;
        return this;
    }

    


    /**
     * 查询流水账单的方式。oneself：客户自己sub_customer：企业子客户all：客户自己和企业子客户默认为all，如果没有企业子客户，取值为all时查询的是客户自己的流水账单。
     * @return method
     */
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    

    public ListCustomerBillsFeeRecordsRequest withSubCustomerId(String subCustomerId) {
        this.subCustomerId = subCustomerId;
        return this;
    }

    


    /**
     * 企业子账号ID。 说明： 如果method取值不为sub_customer，则该参数无效。如果method取值为sub_customer，则该参数不能为空。
     * @return subCustomerId
     */
    public String getSubCustomerId() {
        return subCustomerId;
    }

    public void setSubCustomerId(String subCustomerId) {
        this.subCustomerId = subCustomerId;
    }

    

    public ListCustomerBillsFeeRecordsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * 偏移量，从0开始。默认值为0。
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

    

    public ListCustomerBillsFeeRecordsRequest withLimit(Integer limit) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCustomerBillsFeeRecordsRequest listCustomerBillsFeeRecordsRequest = (ListCustomerBillsFeeRecordsRequest) o;
        return Objects.equals(this.xLanguage, listCustomerBillsFeeRecordsRequest.xLanguage) &&
            Objects.equals(this.billCycle, listCustomerBillsFeeRecordsRequest.billCycle) &&
            Objects.equals(this.providerType, listCustomerBillsFeeRecordsRequest.providerType) &&
            Objects.equals(this.serviceTypeCode, listCustomerBillsFeeRecordsRequest.serviceTypeCode) &&
            Objects.equals(this.resourceTypeCode, listCustomerBillsFeeRecordsRequest.resourceTypeCode) &&
            Objects.equals(this.regionCode, listCustomerBillsFeeRecordsRequest.regionCode) &&
            Objects.equals(this.chargingMode, listCustomerBillsFeeRecordsRequest.chargingMode) &&
            Objects.equals(this.billType, listCustomerBillsFeeRecordsRequest.billType) &&
            Objects.equals(this.tradeId, listCustomerBillsFeeRecordsRequest.tradeId) &&
            Objects.equals(this.enterpriseProjectId, listCustomerBillsFeeRecordsRequest.enterpriseProjectId) &&
            Objects.equals(this.includeZeroRecord, listCustomerBillsFeeRecordsRequest.includeZeroRecord) &&
            Objects.equals(this.status, listCustomerBillsFeeRecordsRequest.status) &&
            Objects.equals(this.method, listCustomerBillsFeeRecordsRequest.method) &&
            Objects.equals(this.subCustomerId, listCustomerBillsFeeRecordsRequest.subCustomerId) &&
            Objects.equals(this.offset, listCustomerBillsFeeRecordsRequest.offset) &&
            Objects.equals(this.limit, listCustomerBillsFeeRecordsRequest.limit);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, billCycle, providerType, serviceTypeCode, resourceTypeCode, regionCode, chargingMode, billType, tradeId, enterpriseProjectId, includeZeroRecord, status, method, subCustomerId, offset, limit);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCustomerBillsFeeRecordsRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    billCycle: ").append(toIndentedString(billCycle)).append("\n");
        sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
        sb.append("    serviceTypeCode: ").append(toIndentedString(serviceTypeCode)).append("\n");
        sb.append("    resourceTypeCode: ").append(toIndentedString(resourceTypeCode)).append("\n");
        sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    billType: ").append(toIndentedString(billType)).append("\n");
        sb.append("    tradeId: ").append(toIndentedString(tradeId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    includeZeroRecord: ").append(toIndentedString(includeZeroRecord)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    subCustomerId: ").append(toIndentedString(subCustomerId)).append("\n");
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

