package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 边缘节点参数
 */
public class EdgeNodeUpdate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_configs")

    private List<LogConfigs> logConfigs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ntp_servers")

    private List<String> ntpServers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attributes")

    private List<Attributes> attributes = null;

    public EdgeNodeUpdate withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 边缘节点描述，最大长度255，不允许^ ~ # $ % & * < > ( ) [ ] { } ' \" \\
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EdgeNodeUpdate withLogConfigs(List<LogConfigs> logConfigs) {
        this.logConfigs = logConfigs;
        return this;
    }

    public EdgeNodeUpdate addLogConfigsItem(LogConfigs logConfigsItem) {
        if (this.logConfigs == null) {
            this.logConfigs = new ArrayList<>();
        }
        this.logConfigs.add(logConfigsItem);
        return this;
    }

    public EdgeNodeUpdate withLogConfigs(Consumer<List<LogConfigs>> logConfigsSetter) {
        if (this.logConfigs == null) {
            this.logConfigs = new ArrayList<>();
        }
        logConfigsSetter.accept(this.logConfigs);
        return this;
    }

    /**
     * 边缘节点日志配置，当用户未配置日志相关字段时，将默认打开日志上传到云端功能。
     * @return logConfigs
     */
    public List<LogConfigs> getLogConfigs() {
        return logConfigs;
    }

    public void setLogConfigs(List<LogConfigs> logConfigs) {
        this.logConfigs = logConfigs;
    }

    public EdgeNodeUpdate withNtpServers(List<String> ntpServers) {
        this.ntpServers = ntpServers;
        return this;
    }

    public EdgeNodeUpdate addNtpServersItem(String ntpServersItem) {
        if (this.ntpServers == null) {
            this.ntpServers = new ArrayList<>();
        }
        this.ntpServers.add(ntpServersItem);
        return this;
    }

    public EdgeNodeUpdate withNtpServers(Consumer<List<String>> ntpServersSetter) {
        if (this.ntpServers == null) {
            this.ntpServers = new ArrayList<>();
        }
        ntpServersSetter.accept(this.ntpServers);
        return this;
    }

    /**
     * NTP服务器地址，每个节点最多仅能配置两个。
     * @return ntpServers
     */
    public List<String> getNtpServers() {
        return ntpServers;
    }

    public void setNtpServers(List<String> ntpServers) {
        this.ntpServers = ntpServers;
    }

    public EdgeNodeUpdate withAttributes(List<Attributes> attributes) {
        this.attributes = attributes;
        return this;
    }

    public EdgeNodeUpdate addAttributesItem(Attributes attributesItem) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.add(attributesItem);
        return this;
    }

    public EdgeNodeUpdate withAttributes(Consumer<List<Attributes>> attributesSetter) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        attributesSetter.accept(this.attributes);
        return this;
    }

    /**
     * 边缘节点属性，关联属性个数最多为32个
     * @return attributes
     */
    public List<Attributes> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attributes> attributes) {
        this.attributes = attributes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EdgeNodeUpdate that = (EdgeNodeUpdate) obj;
        return Objects.equals(this.description, that.description) && Objects.equals(this.logConfigs, that.logConfigs)
            && Objects.equals(this.ntpServers, that.ntpServers) && Objects.equals(this.attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, logConfigs, ntpServers, attributes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EdgeNodeUpdate {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    logConfigs: ").append(toIndentedString(logConfigs)).append("\n");
        sb.append("    ntpServers: ").append(toIndentedString(ntpServers)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
