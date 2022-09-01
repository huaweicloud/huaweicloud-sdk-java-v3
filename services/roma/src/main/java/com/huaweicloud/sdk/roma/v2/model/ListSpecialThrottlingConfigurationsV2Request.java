package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListSpecialThrottlingConfigurationsV2Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    @JacksonXmlProperty(localName = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "throttle_id")

    @JacksonXmlProperty(localName = "throttle_id")

    private String throttleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Long offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_type")

    @JacksonXmlProperty(localName = "object_type")

    private String objectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    @JacksonXmlProperty(localName = "app_name")

    private String appName;

    public ListSpecialThrottlingConfigurationsV2Request withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListSpecialThrottlingConfigurationsV2Request withThrottleId(String throttleId) {
        this.throttleId = throttleId;
        return this;
    }

    /**
     * 流控策略的编号
     * @return throttleId
     */
    public String getThrottleId() {
        return throttleId;
    }

    public void setThrottleId(String throttleId) {
        this.throttleId = throttleId;
    }

    public ListSpecialThrottlingConfigurationsV2Request withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，表示从此偏移量开始查询，偏移量小于0时，自动转换为0
     * @return offset
     */
    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public ListSpecialThrottlingConfigurationsV2Request withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量
     * minimum: 1
     * maximum: 500
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListSpecialThrottlingConfigurationsV2Request withObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * 特殊流控类型：APP, USER
     * @return objectType
     */
    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public ListSpecialThrottlingConfigurationsV2Request withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * 筛选的特殊应用名称
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSpecialThrottlingConfigurationsV2Request listSpecialThrottlingConfigurationsV2Request =
            (ListSpecialThrottlingConfigurationsV2Request) o;
        return Objects.equals(this.instanceId, listSpecialThrottlingConfigurationsV2Request.instanceId)
            && Objects.equals(this.throttleId, listSpecialThrottlingConfigurationsV2Request.throttleId)
            && Objects.equals(this.offset, listSpecialThrottlingConfigurationsV2Request.offset)
            && Objects.equals(this.limit, listSpecialThrottlingConfigurationsV2Request.limit)
            && Objects.equals(this.objectType, listSpecialThrottlingConfigurationsV2Request.objectType)
            && Objects.equals(this.appName, listSpecialThrottlingConfigurationsV2Request.appName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, throttleId, offset, limit, objectType, appName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSpecialThrottlingConfigurationsV2Request {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    throttleId: ").append(toIndentedString(throttleId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
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
