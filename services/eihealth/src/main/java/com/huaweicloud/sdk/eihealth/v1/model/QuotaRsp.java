package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 配额信息
 */
public class QuotaRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private String unit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage")

    private Integer usage;

    public QuotaRsp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 配额项名称，支持USER,PROJECT,USER_PROJECT,STORAGE,PROJECT_APP,PROJECT_NOTEBOOK,PROJECT_WORKFLOW,PROJECT_IMAGE
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public QuotaRsp withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 配额
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public QuotaRsp withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * 配额项单位
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public QuotaRsp withUsage(Integer usage) {
        this.usage = usage;
        return this;
    }

    /**
     * 配额使用量
     * @return usage
     */
    public Integer getUsage() {
        return usage;
    }

    public void setUsage(Integer usage) {
        this.usage = usage;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QuotaRsp quotaRsp = (QuotaRsp) o;
        return Objects.equals(this.name, quotaRsp.name) && Objects.equals(this.total, quotaRsp.total)
            && Objects.equals(this.unit, quotaRsp.unit) && Objects.equals(this.usage, quotaRsp.usage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, total, unit, usage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuotaRsp {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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
