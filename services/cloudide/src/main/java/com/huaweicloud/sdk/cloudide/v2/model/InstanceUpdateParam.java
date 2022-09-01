package com.huaweicloud.sdk.cloudide.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * InstanceUpdateParam
 */
public class InstanceUpdateParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    @JacksonXmlProperty(localName = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "refresh_interval")

    @JacksonXmlProperty(localName = "refresh_interval")

    private String refreshInterval;

    public InstanceUpdateParam withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public InstanceUpdateParam withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 实例名。 可以输入中文、数字、字母、下划线、点、破折号。长度介于3-100之间
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public InstanceUpdateParam withRefreshInterval(String refreshInterval) {
        this.refreshInterval = refreshInterval;
        return this;
    }

    /**
     * 自动休眠时长。 arm架构,自动休眠时长只能设置成30，60。x86架构可取值为30，60，240，1440和-1。除-1外，其它值的单位为“分钟”。实例无操作超过自动休眠时长后，将会被暂停（已保存的数据不会被删除）。-1表示实例不会自动停止
     * @return refreshInterval
     */
    public String getRefreshInterval() {
        return refreshInterval;
    }

    public void setRefreshInterval(String refreshInterval) {
        this.refreshInterval = refreshInterval;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InstanceUpdateParam instanceUpdateParam = (InstanceUpdateParam) o;
        return Objects.equals(this.description, instanceUpdateParam.description)
            && Objects.equals(this.displayName, instanceUpdateParam.displayName)
            && Objects.equals(this.refreshInterval, instanceUpdateParam.refreshInterval);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, displayName, refreshInterval);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceUpdateParam {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    refreshInterval: ").append(toIndentedString(refreshInterval)).append("\n");
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
