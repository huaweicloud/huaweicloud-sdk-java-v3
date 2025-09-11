package com.huaweicloud.sdk.ga.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 配额资源。
 */
public class QuotaOuterResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min")

    private Integer min;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max")

    private Integer max;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota")

    private Integer quota;

    public QuotaOuterResource withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 配额标识。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public QuotaOuterResource withMin(Integer min) {
        this.min = min;
        return this;
    }

    /**
     * 配额的最小阈值。
     * @return min
     */
    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public QuotaOuterResource withMax(Integer max) {
        this.max = max;
        return this;
    }

    /**
     * 配额的最大阈值。
     * @return max
     */
    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public QuotaOuterResource withQuota(Integer quota) {
        this.quota = quota;
        return this;
    }

    /**
     * 配额大小。
     * @return quota
     */
    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QuotaOuterResource that = (QuotaOuterResource) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.min, that.min)
            && Objects.equals(this.max, that.max) && Objects.equals(this.quota, that.quota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, min, max, quota);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuotaOuterResource {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    min: ").append(toIndentedString(min)).append("\n");
        sb.append("    max: ").append(toIndentedString(max)).append("\n");
        sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
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
