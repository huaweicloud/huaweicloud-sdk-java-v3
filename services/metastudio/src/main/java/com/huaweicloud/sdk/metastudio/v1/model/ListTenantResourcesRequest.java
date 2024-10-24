package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListTenantResourcesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Authorization")

    private String authorization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Sdk-Date")

    private String xSdkDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Project-Id")

    private String xProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource")

    private String resource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business")

    private String business;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_source")

    private String resourceSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private String chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_expire_start_time")

    private String resourceExpireStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_expire_end_time")

    private String resourceExpireEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_resource")

    private String subResource;

    public ListTenantResourcesRequest withAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }

    /**
     * 使用AK/SK方式认证时必选，携带的鉴权信息。
     * @return authorization
     */
    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public ListTenantResourcesRequest withXSdkDate(String xSdkDate) {
        this.xSdkDate = xSdkDate;
        return this;
    }

    /**
     * 使用AK/SK方式认证时必选，请求的发生时间。  格式为(YYYYMMDD'T'HHMMSS'Z')。
     * @return xSdkDate
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Sdk-Date")
    public String getXSdkDate() {
        return xSdkDate;
    }

    public void setXSdkDate(String xSdkDate) {
        this.xSdkDate = xSdkDate;
    }

    public ListTenantResourcesRequest withXProjectId(String xProjectId) {
        this.xProjectId = xProjectId;
        return this;
    }

    /**
     * 使用AK/SK方式认证时必选，携带项目ID信息。
     * @return xProjectId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Project-Id")
    public String getXProjectId() {
        return xProjectId;
    }

    public void setXProjectId(String xProjectId) {
        this.xProjectId = xProjectId;
    }

    public ListTenantResourcesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量。
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

    public ListTenantResourcesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，表示从此偏移量开始查询。
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

    public ListTenantResourcesRequest withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * 资源类型。
     * @return resource
     */
    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public ListTenantResourcesRequest withBusiness(String business) {
        this.business = business;
        return this;
    }

    /**
     * 业务类型。
     * @return business
     */
    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public ListTenantResourcesRequest withResourceSource(String resourceSource) {
        this.resourceSource = resourceSource;
        return this;
    }

    /**
     * 资源来源。
     * @return resourceSource
     */
    public String getResourceSource() {
        return resourceSource;
    }

    public void setResourceSource(String resourceSource) {
        this.resourceSource = resourceSource;
    }

    public ListTenantResourcesRequest withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 资源名称。
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public ListTenantResourcesRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源id。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ListTenantResourcesRequest withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 订单id。
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public ListTenantResourcesRequest withChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * 计费模式。
     * @return chargingMode
     */
    public String getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
    }

    public ListTenantResourcesRequest withResourceExpireStartTime(String resourceExpireStartTime) {
        this.resourceExpireStartTime = resourceExpireStartTime;
        return this;
    }

    /**
     * 资源过期时间段 开始时间。格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"
     * @return resourceExpireStartTime
     */
    public String getResourceExpireStartTime() {
        return resourceExpireStartTime;
    }

    public void setResourceExpireStartTime(String resourceExpireStartTime) {
        this.resourceExpireStartTime = resourceExpireStartTime;
    }

    public ListTenantResourcesRequest withResourceExpireEndTime(String resourceExpireEndTime) {
        this.resourceExpireEndTime = resourceExpireEndTime;
        return this;
    }

    /**
     * 资源过期时间段 结束时间。格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"
     * @return resourceExpireEndTime
     */
    public String getResourceExpireEndTime() {
        return resourceExpireEndTime;
    }

    public void setResourceExpireEndTime(String resourceExpireEndTime) {
        this.resourceExpireEndTime = resourceExpireEndTime;
    }

    public ListTenantResourcesRequest withSubResource(String subResource) {
        this.subResource = subResource;
        return this;
    }

    /**
     * 子资源类型。
     * @return subResource
     */
    public String getSubResource() {
        return subResource;
    }

    public void setSubResource(String subResource) {
        this.subResource = subResource;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTenantResourcesRequest that = (ListTenantResourcesRequest) obj;
        return Objects.equals(this.authorization, that.authorization) && Objects.equals(this.xSdkDate, that.xSdkDate)
            && Objects.equals(this.xProjectId, that.xProjectId) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.resource, that.resource)
            && Objects.equals(this.business, that.business) && Objects.equals(this.resourceSource, that.resourceSource)
            && Objects.equals(this.resourceName, that.resourceName) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.orderId, that.orderId) && Objects.equals(this.chargingMode, that.chargingMode)
            && Objects.equals(this.resourceExpireStartTime, that.resourceExpireStartTime)
            && Objects.equals(this.resourceExpireEndTime, that.resourceExpireEndTime)
            && Objects.equals(this.subResource, that.subResource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorization,
            xSdkDate,
            xProjectId,
            limit,
            offset,
            resource,
            business,
            resourceSource,
            resourceName,
            resourceId,
            orderId,
            chargingMode,
            resourceExpireStartTime,
            resourceExpireEndTime,
            subResource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTenantResourcesRequest {\n");
        sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
        sb.append("    xSdkDate: ").append(toIndentedString(xSdkDate)).append("\n");
        sb.append("    xProjectId: ").append(toIndentedString(xProjectId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("    business: ").append(toIndentedString(business)).append("\n");
        sb.append("    resourceSource: ").append(toIndentedString(resourceSource)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    resourceExpireStartTime: ").append(toIndentedString(resourceExpireStartTime)).append("\n");
        sb.append("    resourceExpireEndTime: ").append(toIndentedString(resourceExpireEndTime)).append("\n");
        sb.append("    subResource: ").append(toIndentedString(subResource)).append("\n");
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
