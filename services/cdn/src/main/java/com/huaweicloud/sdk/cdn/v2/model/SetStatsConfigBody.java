package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 设置统计配置请求体
 */
public class SetStatsConfigBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_type")

    private Integer configType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_info")

    private Object configInfo;

    public SetStatsConfigBody withConfigType(Integer configType) {
        this.configType = configType;
        return this;
    }

    /**
     * 配置类别.0：热点统计类
     * minimum: 0
     * maximum: 9
     * @return configType
     */
    public Integer getConfigType() {
        return configType;
    }

    public void setConfigType(Integer configType) {
        this.configType = configType;
    }

    public SetStatsConfigBody withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型。domain:resource_name为域名，account:resource_name为账号
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public SetStatsConfigBody withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 资源名称为账号或域名。多个域名以英文逗号分隔
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public SetStatsConfigBody withConfigInfo(Object configInfo) {
        this.configInfo = configInfo;
        return this;
    }

    public SetStatsConfigBody withConfigInfo(Consumer<Object> configInfoSetter) {
        if (this.configInfo == null) {
            this.configInfo = new Object();
            configInfoSetter.accept(this.configInfo);
        }

        return this;
    }

    /**
     * 配置信息.top指标仅支持ua、refer、url、origin url
     * @return configInfo
     */
    public Object getConfigInfo() {
        return configInfo;
    }

    public void setConfigInfo(Object configInfo) {
        this.configInfo = configInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetStatsConfigBody that = (SetStatsConfigBody) obj;
        return Objects.equals(this.configType, that.configType) && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.resourceName, that.resourceName) && Objects.equals(this.configInfo, that.configInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configType, resourceType, resourceName, configInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetStatsConfigBody {\n");
        sb.append("    configType: ").append(toIndentedString(configType)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    configInfo: ").append(toIndentedString(configInfo)).append("\n");
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
