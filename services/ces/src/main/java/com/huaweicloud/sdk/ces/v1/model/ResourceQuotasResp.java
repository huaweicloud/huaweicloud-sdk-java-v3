package com.huaweicloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 资源配额。 
 */
public class ResourceQuotasResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used")

    private Long used;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private String unit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota")

    private Long quota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min")

    private Long min;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max")

    private Long max;

    public ResourceQuotasResp withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 配额类型。 **取值范围**： 枚举值说明：   - alarm：告警规则 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ResourceQuotasResp withUsed(Long used) {
        this.used = used;
        return this;
    }

    /**
     * **参数解释**： 已使用配额数。 **取值范围**： 不涉及。 
     * @return used
     */
    public Long getUsed() {
        return used;
    }

    public void setUsed(Long used) {
        this.used = used;
    }

    public ResourceQuotasResp withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * **参数解释**： 单位。 **取值范围**： 长度为[0,32]个字符。 
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public ResourceQuotasResp withQuota(Long quota) {
        this.quota = quota;
        return this;
    }

    /**
     * **参数解释**： 配额总数。 **取值范围**： 不涉及。 
     * @return quota
     */
    public Long getQuota() {
        return quota;
    }

    public void setQuota(Long quota) {
        this.quota = quota;
    }

    public ResourceQuotasResp withMin(Long min) {
        this.min = min;
        return this;
    }

    /**
     * **参数解释**： 最小值。 **取值范围**： 不涉及。 
     * @return min
     */
    public Long getMin() {
        return min;
    }

    public void setMin(Long min) {
        this.min = min;
    }

    public ResourceQuotasResp withMax(Long max) {
        this.max = max;
        return this;
    }

    /**
     * **参数解释**： 最大值。 **取值范围**： 不涉及。 
     * @return max
     */
    public Long getMax() {
        return max;
    }

    public void setMax(Long max) {
        this.max = max;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceQuotasResp that = (ResourceQuotasResp) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.used, that.used)
            && Objects.equals(this.unit, that.unit) && Objects.equals(this.quota, that.quota)
            && Objects.equals(this.min, that.min) && Objects.equals(this.max, that.max);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, used, unit, quota, min, max);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceQuotasResp {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    used: ").append(toIndentedString(used)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
