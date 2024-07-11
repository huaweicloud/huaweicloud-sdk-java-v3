package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TOP100 Referer数据明细
 */
public class TopReferSummary {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "refer")

    private String refer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private Long value;

    public TopReferSummary withRefer(String refer) {
        this.refer = refer;
        return this;
    }

    /**
     * referer值。
     * @return refer
     */
    public String getRefer() {
        return refer;
    }

    public void setRefer(String refer) {
        this.refer = refer;
    }

    public TopReferSummary withValue(Long value) {
        this.value = value;
        return this;
    }

    /**
     * 对应查询类型的值。（流量单位：Byte）
     * @return value
     */
    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
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
        TopReferSummary that = (TopReferSummary) obj;
        return Objects.equals(this.refer, that.refer) && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(refer, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TopReferSummary {\n");
        sb.append("    refer: ").append(toIndentedString(refer)).append("\n");
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
