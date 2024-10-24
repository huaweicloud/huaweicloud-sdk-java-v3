package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class CountTenantResourcesRequest {

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
    @JsonProperty(value = "business")

    private String business;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_expire_start_time")

    private String resourceExpireStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_expire_end_time")

    private String resourceExpireEndTime;

    public CountTenantResourcesRequest withAuthorization(String authorization) {
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

    public CountTenantResourcesRequest withXSdkDate(String xSdkDate) {
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

    public CountTenantResourcesRequest withXProjectId(String xProjectId) {
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

    public CountTenantResourcesRequest withBusiness(String business) {
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

    public CountTenantResourcesRequest withResourceExpireStartTime(String resourceExpireStartTime) {
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

    public CountTenantResourcesRequest withResourceExpireEndTime(String resourceExpireEndTime) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CountTenantResourcesRequest that = (CountTenantResourcesRequest) obj;
        return Objects.equals(this.authorization, that.authorization) && Objects.equals(this.xSdkDate, that.xSdkDate)
            && Objects.equals(this.xProjectId, that.xProjectId) && Objects.equals(this.business, that.business)
            && Objects.equals(this.resourceExpireStartTime, that.resourceExpireStartTime)
            && Objects.equals(this.resourceExpireEndTime, that.resourceExpireEndTime);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(authorization, xSdkDate, xProjectId, business, resourceExpireStartTime, resourceExpireEndTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CountTenantResourcesRequest {\n");
        sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
        sb.append("    xSdkDate: ").append(toIndentedString(xSdkDate)).append("\n");
        sb.append("    xProjectId: ").append(toIndentedString(xProjectId)).append("\n");
        sb.append("    business: ").append(toIndentedString(business)).append("\n");
        sb.append("    resourceExpireStartTime: ").append(toIndentedString(resourceExpireStartTime)).append("\n");
        sb.append("    resourceExpireEndTime: ").append(toIndentedString(resourceExpireEndTime)).append("\n");
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
