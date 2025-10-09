package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ClusterQuotaResource
 */
public class ClusterQuotaResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota")

    private Integer quota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used")

    private Integer used;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private String unit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min")

    private Integer min;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max")

    private Integer max;

    public ClusterQuotaResource withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 资源类型 **约束限制**： 不涉及 **取值范围**： - cluster：Standard/Turbo集群 - autopilot_cluster：Autopilot集群  **默认取值**： 不涉及 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ClusterQuotaResource withQuota(Integer quota) {
        this.quota = quota;
        return this;
    }

    /**
     * **参数解释**： 总配额 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return quota
     */
    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    public ClusterQuotaResource withUsed(Integer used) {
        this.used = used;
        return this;
    }

    /**
     * **参数解释**： 配额已使用数量 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return used
     */
    public Integer getUsed() {
        return used;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }

    public ClusterQuotaResource withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * **参数解释**： 单位 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public ClusterQuotaResource withMin(Integer min) {
        this.min = min;
        return this;
    }

    /**
     * **参数解释**： 配额最小值 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return min
     */
    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public ClusterQuotaResource withMax(Integer max) {
        this.max = max;
        return this;
    }

    /**
     * **参数解释**： 配额最大值 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return max
     */
    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
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
        ClusterQuotaResource that = (ClusterQuotaResource) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.quota, that.quota)
            && Objects.equals(this.used, that.used) && Objects.equals(this.unit, that.unit)
            && Objects.equals(this.min, that.min) && Objects.equals(this.max, that.max);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, quota, used, unit, min, max);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterQuotaResource {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
        sb.append("    used: ").append(toIndentedString(used)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
