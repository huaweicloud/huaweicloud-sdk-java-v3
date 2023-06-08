package com.huaweicloud.sdk.obs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.Objects;

/**
 * 定义过滤规则键值对的元素。 
 */
@JacksonXmlRootElement(localName = "FilterRule")
public class FilterRule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Name")

    @JacksonXmlProperty(localName = "Name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Value")

    @JacksonXmlProperty(localName = "Value")

    private String value;

    public FilterRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 指定规则按对象名前缀或后缀进行过滤。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FilterRule withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 指定的对象名关键字，根据Name元素定义的前缀或后缀，输入需要过滤的对象的关键字信息，字符越长匹配精度越高，最大可支持1024个字符。 
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FilterRule filterRule = (FilterRule) o;
        return Objects.equals(this.name, filterRule.name) && Objects.equals(this.value, filterRule.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FilterRule {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
