package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 分支网络租户配额详情。
 */
public class SiteNetworkQuota {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_key")

    private SiteNetworkQuotaKeyEnum quotaKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_limit")

    private Integer quotaLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used")

    private Integer used;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private String unit;

    public SiteNetworkQuota withQuotaKey(SiteNetworkQuotaKeyEnum quotaKey) {
        this.quotaKey = quotaKey;
        return this;
    }

    /**
     * Get quotaKey
     * @return quotaKey
     */
    public SiteNetworkQuotaKeyEnum getQuotaKey() {
        return quotaKey;
    }

    public void setQuotaKey(SiteNetworkQuotaKeyEnum quotaKey) {
        this.quotaKey = quotaKey;
    }

    public SiteNetworkQuota withQuotaLimit(Integer quotaLimit) {
        this.quotaLimit = quotaLimit;
        return this;
    }

    /**
     * 配额大小。
     * minimum: 0
     * maximum: 2147483647
     * @return quotaLimit
     */
    public Integer getQuotaLimit() {
        return quotaLimit;
    }

    public void setQuotaLimit(Integer quotaLimit) {
        this.quotaLimit = quotaLimit;
    }

    public SiteNetworkQuota withUsed(Integer used) {
        this.used = used;
        return this;
    }

    /**
     * 已使用配额。
     * minimum: 0
     * maximum: 2147483647
     * @return used
     */
    public Integer getUsed() {
        return used;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }

    public SiteNetworkQuota withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * 配额值的单位。
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SiteNetworkQuota that = (SiteNetworkQuota) obj;
        return Objects.equals(this.quotaKey, that.quotaKey) && Objects.equals(this.quotaLimit, that.quotaLimit)
            && Objects.equals(this.used, that.used) && Objects.equals(this.unit, that.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quotaKey, quotaLimit, used, unit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SiteNetworkQuota {\n");
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
