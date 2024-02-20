package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 策略的json表示的路径的单个元素。
 */
public class PathElement {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index")

    private Integer index;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "substring")

    private Substring substring;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public PathElement withIndex(Integer index) {
        this.index = index;
        return this;
    }

    /**
     * 数组中的索引，从0开始。
     * @return index
     */
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public PathElement withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 对象中的键。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public PathElement withSubstring(Substring substring) {
        this.substring = substring;
        return this;
    }

    public PathElement withSubstring(Consumer<Substring> substringSetter) {
        if (this.substring == null) {
            this.substring = new Substring();
            substringSetter.accept(this.substring);
        }

        return this;
    }

    /**
     * Get substring
     * @return substring
     */
    public Substring getSubstring() {
        return substring;
    }

    public void setSubstring(Substring substring) {
        this.substring = substring;
    }

    public PathElement withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 与对象中给定键关联的值。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PathElement that = (PathElement) obj;
        return Objects.equals(this.index, that.index) && Objects.equals(this.key, that.key)
            && Objects.equals(this.substring, that.substring) && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, key, substring, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PathElement {\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    substring: ").append(toIndentedString(substring)).append("\n");
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
