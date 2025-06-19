package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SysRuleParam
 */
public class SysRuleParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max")

    private Long max;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min")

    private Long min;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defaultValue")

    private Long defaultValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    private String desc;

    public SysRuleParam withMax(Long max) {
        this.max = max;
        return this;
    }

    /**
     * 阀值上限
     * @return max
     */
    public Long getMax() {
        return max;
    }

    public void setMax(Long max) {
        this.max = max;
    }

    public SysRuleParam withMin(Long min) {
        this.min = min;
        return this;
    }

    /**
     * 阀值下限
     * @return min
     */
    public Long getMin() {
        return min;
    }

    public void setMin(Long min) {
        this.min = min;
    }

    public SysRuleParam withDefaultValue(Long defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * 阀值默认值
     * @return defaultValue
     */
    public Long getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(Long defaultValue) {
        this.defaultValue = defaultValue;
    }

    public SysRuleParam withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * 描述
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SysRuleParam that = (SysRuleParam) obj;
        return Objects.equals(this.max, that.max) && Objects.equals(this.min, that.min)
            && Objects.equals(this.defaultValue, that.defaultValue) && Objects.equals(this.desc, that.desc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(max, min, defaultValue, desc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SysRuleParam {\n");
        sb.append("    max: ").append(toIndentedString(max)).append("\n");
        sb.append("    min: ").append(toIndentedString(min)).append("\n");
        sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
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
