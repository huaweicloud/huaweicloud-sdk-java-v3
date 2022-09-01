package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Resource
 */
public class Resource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    @JacksonXmlProperty(localName = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    @JacksonXmlProperty(localName = "unit")

    private String unit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min")

    @JacksonXmlProperty(localName = "min")

    private Long min;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max")

    @JacksonXmlProperty(localName = "max")

    private Long max;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota")

    @JacksonXmlProperty(localName = "quota")

    private Long quota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used")

    @JacksonXmlProperty(localName = "used")

    private Long used;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free")

    @JacksonXmlProperty(localName = "free")

    private Long free;

    public Resource withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 资源类型，包含instance（服务实例数）
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Resource withUnit(String unit) {
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

    public Resource withMin(Long min) {
        this.min = min;
        return this;
    }

    /**
     * 最小值
     * @return min
     */
    public Long getMin() {
        return min;
    }

    public void setMin(Long min) {
        this.min = min;
    }

    public Resource withMax(Long max) {
        this.max = max;
        return this;
    }

    /**
     * 最大值
     * @return max
     */
    public Long getMax() {
        return max;
    }

    public void setMax(Long max) {
        this.max = max;
    }

    public Resource withQuota(Long quota) {
        this.quota = quota;
        return this;
    }

    /**
     * 配额
     * @return quota
     */
    public Long getQuota() {
        return quota;
    }

    public void setQuota(Long quota) {
        this.quota = quota;
    }

    public Resource withUsed(Long used) {
        this.used = used;
        return this;
    }

    /**
     * 已使用配额
     * @return used
     */
    public Long getUsed() {
        return used;
    }

    public void setUsed(Long used) {
        this.used = used;
    }

    public Resource withFree(Long free) {
        this.free = free;
        return this;
    }

    /**
     * 剩余配额
     * @return free
     */
    public Long getFree() {
        return free;
    }

    public void setFree(Long free) {
        this.free = free;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Resource resource = (Resource) o;
        return Objects.equals(this.type, resource.type) && Objects.equals(this.unit, resource.unit)
            && Objects.equals(this.min, resource.min) && Objects.equals(this.max, resource.max)
            && Objects.equals(this.quota, resource.quota) && Objects.equals(this.used, resource.used)
            && Objects.equals(this.free, resource.free);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, unit, min, max, quota, used, free);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Resource {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    min: ").append(toIndentedString(min)).append("\n");
        sb.append("    max: ").append(toIndentedString(max)).append("\n");
        sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
        sb.append("    used: ").append(toIndentedString(used)).append("\n");
        sb.append("    free: ").append(toIndentedString(free)).append("\n");
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
