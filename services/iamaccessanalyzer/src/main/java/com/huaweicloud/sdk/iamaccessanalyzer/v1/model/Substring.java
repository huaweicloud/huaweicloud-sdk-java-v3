package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * json反序列化后的字符串的子串。
 */
public class Substring {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start")

    private Integer start;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "length")

    private Integer length;

    public Substring withStart(Integer start) {
        this.start = start;
        return this;
    }

    /**
     * 子字符串的起始索引，从0开始。0表示第一个字符。
     * @return start
     */
    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Substring withLength(Integer length) {
        this.length = length;
        return this;
    }

    /**
     * 子字符串的长度。
     * @return length
     */
    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Substring that = (Substring) obj;
        return Objects.equals(this.start, that.start) && Objects.equals(this.length, that.length);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, length);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Substring {\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    length: ").append(toIndentedString(length)).append("\n");
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
