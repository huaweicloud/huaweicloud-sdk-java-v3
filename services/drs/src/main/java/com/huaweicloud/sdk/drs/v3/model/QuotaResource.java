package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 配额信息
 */
public class QuotaResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    @JacksonXmlProperty(localName = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min")

    @JacksonXmlProperty(localName = "min")

    private Integer min;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max")

    @JacksonXmlProperty(localName = "max")

    private Integer max;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota")

    @JacksonXmlProperty(localName = "quota")

    private Integer quota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used")

    @JacksonXmlProperty(localName = "used")

    private Integer used;

    public QuotaResource withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 配额类型信息
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public QuotaResource withMin(Integer min) {
        this.min = min;
        return this;
    }

    /**
     * 配额最小取值
     * @return min
     */
    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public QuotaResource withMax(Integer max) {
        this.max = max;
        return this;
    }

    /**
     * 配额最大取值
     * @return max
     */
    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public QuotaResource withQuota(Integer quota) {
        this.quota = quota;
        return this;
    }

    /**
     * 用户配额的实际值
     * @return quota
     */
    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    public QuotaResource withUsed(Integer used) {
        this.used = used;
        return this;
    }

    /**
     * 已使用的配额值
     * @return used
     */
    public Integer getUsed() {
        return used;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QuotaResource quotaResource = (QuotaResource) o;
        return Objects.equals(this.type, quotaResource.type) && Objects.equals(this.min, quotaResource.min)
            && Objects.equals(this.max, quotaResource.max) && Objects.equals(this.quota, quotaResource.quota)
            && Objects.equals(this.used, quotaResource.used);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, min, max, quota, used);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuotaResource {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    min: ").append(toIndentedString(min)).append("\n");
        sb.append("    max: ").append(toIndentedString(max)).append("\n");
        sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
        sb.append("    used: ").append(toIndentedString(used)).append("\n");
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
