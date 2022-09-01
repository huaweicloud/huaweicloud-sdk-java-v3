package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 按标签过滤资源后返回结果的排序方式
 */
public class Sorted {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    @JacksonXmlProperty(localName = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reverse")

    @JacksonXmlProperty(localName = "reverse")

    private Boolean reverse;

    public Sorted withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 按key值对请求内容进行排序
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Sorted withReverse(Boolean reverse) {
        this.reverse = reverse;
        return this;
    }

    /**
     * 是否采用倒序
     * @return reverse
     */
    public Boolean getReverse() {
        return reverse;
    }

    public void setReverse(Boolean reverse) {
        this.reverse = reverse;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Sorted sorted = (Sorted) o;
        return Objects.equals(this.key, sorted.key) && Objects.equals(this.reverse, sorted.reverse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, reverse);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Sorted {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    reverse: ").append(toIndentedString(reverse)).append("\n");
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
