package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 配额资源数据结构
 */
public class QuotaResourceParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used")

    private Integer used;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota")

    private Integer quota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min")

    private Integer min;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max")

    private Integer max;

    public QuotaResourceParams withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 资源类型server_groups：表示保护组资源类型。replications：表示复制对资源类型。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public QuotaResourceParams withUsed(Integer used) {
        this.used = used;
        return this;
    }

    /**
     * 已经使用的资源个数。
     * @return used
     */
    public Integer getUsed() {
        return used;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }

    public QuotaResourceParams withQuota(Integer quota) {
        this.quota = quota;
        return this;
    }

    /**
     * 资源配额。-1：表示无穷大。
     * @return quota
     */
    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    public QuotaResourceParams withMin(Integer min) {
        this.min = min;
        return this;
    }

    /**
     * 设置该资源配额允许的最小值。
     * @return min
     */
    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public QuotaResourceParams withMax(Integer max) {
        this.max = max;
        return this;
    }

    /**
     * 设置该资源配额允许的最大值。-1：表示无穷大。
     * @return max
     */
    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QuotaResourceParams quotaResourceParams = (QuotaResourceParams) o;
        return Objects.equals(this.type, quotaResourceParams.type)
            && Objects.equals(this.used, quotaResourceParams.used)
            && Objects.equals(this.quota, quotaResourceParams.quota)
            && Objects.equals(this.min, quotaResourceParams.min) && Objects.equals(this.max, quotaResourceParams.max);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, used, quota, min, max);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuotaResourceParams {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    used: ").append(toIndentedString(used)).append("\n");
        sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
        sb.append("    min: ").append(toIndentedString(min)).append("\n");
        sb.append("    max: ").append(toIndentedString(max)).append("\n");
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
