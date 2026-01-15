package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DomainQuotaResponseQuotas
 */
public class DomainQuotaResponseQuotas {

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

    public DomainQuotaResponseQuotas withQuotaKey(String quotaKey) {
        this.quotaKey = quotaKey;
        return this;
    }

    /**
     * **参数解释：** 资源类型。 **取值范围：** - zone：公网域名配额 - private_zone：内网域名配额 - record_set：记录集配额 - url_record：显性/隐性URL记录集配额 - ptr_record：反向解析配额 - custom_line：自定义线路配额 - line_group：线路分组配额 - inbound_endpoint：入站终端节点配额 - outbound_endpoint：出站终端节点配额 - resolver_rule：转发规则配额
     * @return quotaKey
     */
    public String getQuotaKey() {
        return quotaKey;
    }

    public void setQuotaKey(String quotaKey) {
        this.quotaKey = quotaKey;
    }

    public DomainQuotaResponseQuotas withQuotaLimit(Integer quotaLimit) {
        this.quotaLimit = quotaLimit;
        return this;
    }

    /**
     * 资源配额的最大值。
     * @return quotaLimit
     */
    public Integer getQuotaLimit() {
        return quotaLimit;
    }

    public void setQuotaLimit(Integer quotaLimit) {
        this.quotaLimit = quotaLimit;
    }

    public DomainQuotaResponseQuotas withUsed(Integer used) {
        this.used = used;
        return this;
    }

    /**
     * 配额已使用数量。
     * @return used
     */
    public Integer getUsed() {
        return used;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }

    public DomainQuotaResponseQuotas withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * 配额统计单位，取固定值“count”。
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
        DomainQuotaResponseQuotas that = (DomainQuotaResponseQuotas) obj;
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
        sb.append("class DomainQuotaResponseQuotas {\n");
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
