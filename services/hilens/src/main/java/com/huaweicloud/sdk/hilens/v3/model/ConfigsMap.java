package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ConfigsMap
 */
public class ConfigsMap {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public ConfigsMap withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 配置项的名称，以英文字母或中划线开头，由英文字母、数字、点号、中划线和下划线组成，长度1到63个字符。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ConfigsMap withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 配置项的属性名，以英文小写字母开头，由中文字符，英文字母，数字，下划线和中划线组成，不能以中划线结尾，长度4-64位。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConfigsMap configsMap = (ConfigsMap) o;
        return Objects.equals(this.key, configsMap.key) && Objects.equals(this.name, configsMap.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigsMap {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
