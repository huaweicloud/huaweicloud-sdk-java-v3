package com.huaweicloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 匹配的实例标记列表。
 */
public class CreateRouteTags {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "&lt;tag&gt;")

    private String lessThanTagGreaterThan;

    public CreateRouteTags withLessThanTagGreaterThan(String lessThanTagGreaterThan) {
        this.lessThanTagGreaterThan = lessThanTagGreaterThan;
        return this;
    }

    /**
     * 实例标记。满足标记条件的实例放到这一组。
     * @return lessThanTagGreaterThan
     */
    public String getLessThanTagGreaterThan() {
        return lessThanTagGreaterThan;
    }

    public void setLessThanTagGreaterThan(String lessThanTagGreaterThan) {
        this.lessThanTagGreaterThan = lessThanTagGreaterThan;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateRouteTags that = (CreateRouteTags) obj;
        return Objects.equals(this.lessThanTagGreaterThan, that.lessThanTagGreaterThan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lessThanTagGreaterThan);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRouteTags {\n");
        sb.append("    lessThanTagGreaterThan: ").append(toIndentedString(lessThanTagGreaterThan)).append("\n");
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
