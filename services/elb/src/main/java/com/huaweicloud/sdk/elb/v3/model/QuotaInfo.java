package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 配额信息，包括总配额和已使用配额。
 */
public class QuotaInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_key")

    private String quotaKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_limit")

    private Integer quotaLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used")

    private Integer used;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private String unit;

    public QuotaInfo withQuotaKey(String quotaKey) {
        this.quotaKey = quotaKey;
        return this;
    }

    /**
     * 资源类型。  取值：loadbalancer、listener、ipgroup、pool、member、members_per_pool、 healthmonitor、l7policy、certificate、security_policy，  其中members_per_pool表示一个pool下最多可关联的member数量。
     * @return quotaKey
     */
    public String getQuotaKey() {
        return quotaKey;
    }

    public void setQuotaKey(String quotaKey) {
        this.quotaKey = quotaKey;
    }

    public QuotaInfo withQuotaLimit(Integer quotaLimit) {
        this.quotaLimit = quotaLimit;
        return this;
    }

    /**
     * 总配额。  取值： - 大于等于0：表示当前配额数量。 - -1：表示无配额限制。
     * @return quotaLimit
     */
    public Integer getQuotaLimit() {
        return quotaLimit;
    }

    public void setQuotaLimit(Integer quotaLimit) {
        this.quotaLimit = quotaLimit;
    }

    public QuotaInfo withUsed(Integer used) {
        this.used = used;
        return this;
    }

    /**
     * 已使用配额。
     * @return used
     */
    public Integer getUsed() {
        return used;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }

    public QuotaInfo withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * 配额单位。  取值：count，表示个数。
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QuotaInfo quotaInfo = (QuotaInfo) o;
        return Objects.equals(this.quotaKey, quotaInfo.quotaKey)
            && Objects.equals(this.quotaLimit, quotaInfo.quotaLimit) && Objects.equals(this.used, quotaInfo.used)
            && Objects.equals(this.unit, quotaInfo.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quotaKey, quotaLimit, used, unit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuotaInfo {\n");
        sb.append("    quotaKey: ").append(toIndentedString(quotaKey)).append("\n");
        sb.append("    quotaLimit: ").append(toIndentedString(quotaLimit)).append("\n");
        sb.append("    used: ").append(toIndentedString(used)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
