package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListCustomerBillsMonthlyBreakDownRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    private String xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shared_month")

    private String sharedMonth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type_code")

    private String serviceTypeCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type_code")

    private String resourceTypeCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_code")

    private String regionCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private Integer chargingMode;

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
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "method")

    private String method;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_customer_id")

    private String subCustomerId;

    public ListCustomerBillsMonthlyBreakDownRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * 语言。en_US：英文。zh_CN：中文
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

    public ListCustomerBillsMonthlyBreakDownRequest withSharedMonth(String sharedMonth) {
        this.sharedMonth = sharedMonth;
        return this;
    }

    /**
     * 查询分摊成本的月份，格式：YYYY-MM。
     * @return sharedMonth
     */
    public String getSharedMonth() {
        return sharedMonth;
    }

    public void setSharedMonth(String sharedMonth) {
        this.sharedMonth = sharedMonth;
    }

    public ListCustomerBillsMonthlyBreakDownRequest withServiceTypeCode(String serviceTypeCode) {
        this.serviceTypeCode = serviceTypeCode;
        return this;
    }

    /**
     * 云服务类型编码，例如OBS的云服务类型编码为“hws.service.type.obs”。您可以调用[查询云服务类型列表](https://support.huaweicloud.com/api-oce/zh-cn_topic_0000001256679455.html)接口获取。
     * @return serviceTypeCode
     */
    public String getServiceTypeCode() {
        return serviceTypeCode;
    }

    public void setServiceTypeCode(String serviceTypeCode) {
        this.serviceTypeCode = serviceTypeCode;
    }

    public ListCustomerBillsMonthlyBreakDownRequest withResourceTypeCode(String resourceTypeCode) {
        this.resourceTypeCode = resourceTypeCode;
        return this;
    }

    /**
     * 资源类型编码，例如ECS的VM为“hws.resource.type.vm”。您可以调用[查询资源类型列表](https://support.huaweicloud.com/api-oce/zh-cn_topic_0000001256519451.html)接口获取。
     * @return resourceTypeCode
     */
    public String getResourceTypeCode() {
        return resourceTypeCode;
    }

    public void setResourceTypeCode(String resourceTypeCode) {
        this.resourceTypeCode = resourceTypeCode;
    }

    public ListCustomerBillsMonthlyBreakDownRequest withRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }

    /**
     * 云服务区编码，例如：“cn-north-1”。具体请参见[地区和终端节点](https://developer.huaweicloud.com/endpoint)对应云服务的“区域”列的值。
     * @return regionCode
     */
    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public ListCustomerBillsMonthlyBreakDownRequest withChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * 计费模式。1：包年/包月3：按需10：预留实例
     * minimum: 0
     * maximum: 10
     * @return chargingMode
     */
    public Integer getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
    }

    public ListCustomerBillsMonthlyBreakDownRequest withBillType(Integer billType) {
        this.billType = billType;
        return this;
    }

    /**
     * 账单类型。1：消费-新购2：消费-续订3：消费-变更4：退款-退订5：消费-使用8：消费-自动续订9：调账-补偿14：消费-服务支持计划月末扣费16：调账-扣费18：消费-按月付费20：退款-变更
     * minimum: 1
     * maximum: 102
     * @return billType
     */
    public Integer getBillType() {
        return billType;
    }

    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    public ListCustomerBillsMonthlyBreakDownRequest withOffset(Integer offset) {
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

    public ListCustomerBillsMonthlyBreakDownRequest withLimit(Integer limit) {
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

    public ListCustomerBillsMonthlyBreakDownRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源ID。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ListCustomerBillsMonthlyBreakDownRequest withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 资源名称
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public ListCustomerBillsMonthlyBreakDownRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目标识（企业项目ID）。default项目对应ID：0未归集（表示该云服务不支持企业项目管理能力）项目对应ID：-1其余项目对应ID获取方法请参见[如何获取企业项目ID](https://support.huaweicloud.com/usermanual-em/zh-cn_topic_0126101490.html)。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListCustomerBillsMonthlyBreakDownRequest withMethod(String method) {
        this.method = method;
        return this;
    }

    /**
     * 查询资源消费记录的方式。oneself：客户自己sub_customer：企业子客户all：客户自己和企业子客户默认为all，如果没有企业子客户，取值为all时查询的是客户自己的资源消费记录。
     * @return method
     */
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public ListCustomerBillsMonthlyBreakDownRequest withSubCustomerId(String subCustomerId) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCustomerBillsMonthlyBreakDownRequest listCustomerBillsMonthlyBreakDownRequest =
            (ListCustomerBillsMonthlyBreakDownRequest) o;
        return Objects.equals(this.xLanguage, listCustomerBillsMonthlyBreakDownRequest.xLanguage)
            && Objects.equals(this.sharedMonth, listCustomerBillsMonthlyBreakDownRequest.sharedMonth)
            && Objects.equals(this.serviceTypeCode, listCustomerBillsMonthlyBreakDownRequest.serviceTypeCode)
            && Objects.equals(this.resourceTypeCode, listCustomerBillsMonthlyBreakDownRequest.resourceTypeCode)
            && Objects.equals(this.regionCode, listCustomerBillsMonthlyBreakDownRequest.regionCode)
            && Objects.equals(this.chargingMode, listCustomerBillsMonthlyBreakDownRequest.chargingMode)
            && Objects.equals(this.billType, listCustomerBillsMonthlyBreakDownRequest.billType)
            && Objects.equals(this.offset, listCustomerBillsMonthlyBreakDownRequest.offset)
            && Objects.equals(this.limit, listCustomerBillsMonthlyBreakDownRequest.limit)
            && Objects.equals(this.resourceId, listCustomerBillsMonthlyBreakDownRequest.resourceId)
            && Objects.equals(this.resourceName, listCustomerBillsMonthlyBreakDownRequest.resourceName)
            && Objects.equals(this.enterpriseProjectId, listCustomerBillsMonthlyBreakDownRequest.enterpriseProjectId)
            && Objects.equals(this.method, listCustomerBillsMonthlyBreakDownRequest.method)
            && Objects.equals(this.subCustomerId, listCustomerBillsMonthlyBreakDownRequest.subCustomerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xLanguage,
            sharedMonth,
            serviceTypeCode,
            resourceTypeCode,
            regionCode,
            chargingMode,
            billType,
            offset,
            limit,
            resourceId,
            resourceName,
            enterpriseProjectId,
            method,
            subCustomerId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCustomerBillsMonthlyBreakDownRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    sharedMonth: ").append(toIndentedString(sharedMonth)).append("\n");
        sb.append("    serviceTypeCode: ").append(toIndentedString(serviceTypeCode)).append("\n");
        sb.append("    resourceTypeCode: ").append(toIndentedString(resourceTypeCode)).append("\n");
        sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    billType: ").append(toIndentedString(billType)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    subCustomerId: ").append(toIndentedString(subCustomerId)).append("\n");
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
