package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BaseQuotaInfo
 */
public class BaseQuotaInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min")

    private Integer min;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max")

    private Integer max;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota")

    private Integer quota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used")

    private Integer used;

    public BaseQuotaInfo withMin(Integer min) {
        this.min = min;
        return this;
    }

    /**
     * **参数解释：** 最小允许值。 **取值范围：** 1~10000 
     * minimum: 1
     * maximum: 10000
     * @return min
     */
    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public BaseQuotaInfo withMax(Integer max) {
        this.max = max;
        return this;
    }

    /**
     * **参数解释：** 最大允许值。 **取值范围：** 1~10000 
     * minimum: 1
     * maximum: 10000
     * @return max
     */
    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public BaseQuotaInfo withQuota(Integer quota) {
        this.quota = quota;
        return this;
    }

    /**
     * **参数解释：** 当前配置的配额值。 **取值范围：** 1~10000 
     * minimum: 1
     * maximum: 10000
     * @return quota
     */
    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    public BaseQuotaInfo withUsed(Integer used) {
        this.used = used;
        return this;
    }

    /**
     * **参数解释：** 已使用数量（实时计算）。 **取值范围：** 0~10000 
     * minimum: 0
     * maximum: 10000
     * @return used
     */
    public Integer getUsed() {
        return used;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BaseQuotaInfo that = (BaseQuotaInfo) obj;
        return Objects.equals(this.min, that.min) && Objects.equals(this.max, that.max)
            && Objects.equals(this.quota, that.quota) && Objects.equals(this.used, that.used);
    }

    @Override
    public int hashCode() {
        return Objects.hash(min, max, quota, used);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BaseQuotaInfo {\n");
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
