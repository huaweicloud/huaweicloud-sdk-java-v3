package com.huaweicloud.sdk.tms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 配额
 */
public class TagQuota {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_key")

    @JacksonXmlProperty(localName = "quota_key")

    private String quotaKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_limit")

    @JacksonXmlProperty(localName = "quota_limit")

    private Integer quotaLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used")

    @JacksonXmlProperty(localName = "used")

    private Integer used;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    @JacksonXmlProperty(localName = "unit")

    private String unit;

    public TagQuota withQuotaKey(String quotaKey) {
        this.quotaKey = quotaKey;
        return this;
    }

    /**
     * 配额键
     * @return quotaKey
     */
    public String getQuotaKey() {
        return quotaKey;
    }

    public void setQuotaKey(String quotaKey) {
        this.quotaKey = quotaKey;
    }

    public TagQuota withQuotaLimit(Integer quotaLimit) {
        this.quotaLimit = quotaLimit;
        return this;
    }

    /**
     * 配额值
     * @return quotaLimit
     */
    public Integer getQuotaLimit() {
        return quotaLimit;
    }

    public void setQuotaLimit(Integer quotaLimit) {
        this.quotaLimit = quotaLimit;
    }

    public TagQuota withUsed(Integer used) {
        this.used = used;
        return this;
    }

    /**
     * 已使用
     * @return used
     */
    public Integer getUsed() {
        return used;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }

    public TagQuota withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * 单位
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
        TagQuota tagQuota = (TagQuota) o;
        return Objects.equals(this.quotaKey, tagQuota.quotaKey) && Objects.equals(this.quotaLimit, tagQuota.quotaLimit)
            && Objects.equals(this.used, tagQuota.used) && Objects.equals(this.unit, tagQuota.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quotaKey, quotaLimit, used, unit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TagQuota {\n");
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
