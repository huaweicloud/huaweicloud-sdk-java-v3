package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 配置 nas 后端信息
 */
public class ConfigNasTarget {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Object type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private Object url;

    public ConfigNasTarget withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * nas 配置名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ConfigNasTarget withType(Object type) {
        this.type = type;
        return this;
    }

    /**
     * nas 配置协议类型
     * @return type
     */
    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public ConfigNasTarget withUrl(Object url) {
        this.url = url;
        return this;
    }

    /**
     * nas 配置 ip
     * @return url
     */
    public Object getUrl() {
        return url;
    }

    public void setUrl(Object url) {
        this.url = url;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfigNasTarget that = (ConfigNasTarget) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigNasTarget {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
