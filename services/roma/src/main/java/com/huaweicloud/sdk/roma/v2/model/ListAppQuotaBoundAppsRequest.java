package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListAppQuotaBoundAppsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    @JacksonXmlProperty(localName = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_quota_id")

    @JacksonXmlProperty(localName = "app_quota_id")

    private String appQuotaId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Long offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    @JacksonXmlProperty(localName = "app_name")

    private String appName;

    public ListAppQuotaBoundAppsRequest withInstanceId(String instanceId) {
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

    public ListAppQuotaBoundAppsRequest withAppQuotaId(String appQuotaId) {
        this.appQuotaId = appQuotaId;
        return this;
    }

    /**
     * 客户端配额编号
     * @return appQuotaId
     */
    public String getAppQuotaId() {
        return appQuotaId;
    }

    public void setAppQuotaId(String appQuotaId) {
        this.appQuotaId = appQuotaId;
    }

    public ListAppQuotaBoundAppsRequest withOffset(Long offset) {
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

    public ListAppQuotaBoundAppsRequest withLimit(Integer limit) {
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

    public ListAppQuotaBoundAppsRequest withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * 客户端应用名称
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
        ListAppQuotaBoundAppsRequest listAppQuotaBoundAppsRequest = (ListAppQuotaBoundAppsRequest) o;
        return Objects.equals(this.instanceId, listAppQuotaBoundAppsRequest.instanceId)
            && Objects.equals(this.appQuotaId, listAppQuotaBoundAppsRequest.appQuotaId)
            && Objects.equals(this.offset, listAppQuotaBoundAppsRequest.offset)
            && Objects.equals(this.limit, listAppQuotaBoundAppsRequest.limit)
            && Objects.equals(this.appName, listAppQuotaBoundAppsRequest.appName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, appQuotaId, offset, limit, appName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAppQuotaBoundAppsRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    appQuotaId: ").append(toIndentedString(appQuotaId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
