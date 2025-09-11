package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 组合比较查询条件，可针对某个给定过滤字段，进行区间范围、大小、小于等条件合并查询。
 */
public class CompareConditionOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_equal")

    private Boolean enableEqual;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min")

    private Long min;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max")

    private Long max;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private Long value;

    public CompareConditionOption withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**: 查询字段名称，当前仅支持特定的数值字段。 **约束限制**: 不涉及。 **取值范围**: - total_sql_time: 总SQL耗时。 - sql_time：SQL执行次数。  **默认取值**: 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CompareConditionOption withEnableEqual(Boolean enableEqual) {
        this.enableEqual = enableEqual;
        return this;
    }

    /**
     * **参数解释**: 是否使能包含等于，如果为true，则表示包含边界条件（min或max）的取值。 **约束限制**: 不涉及。 **取值范围**: - true - false  **默认取值**: 不涉及。
     * @return enableEqual
     */
    public Boolean getEnableEqual() {
        return enableEqual;
    }

    public void setEnableEqual(Boolean enableEqual) {
        this.enableEqual = enableEqual;
    }

    public CompareConditionOption withMin(Long min) {
        this.min = min;
        return this;
    }

    /**
     * **参数解释**: 最小值判断条件对应取值（大于条件）。 **约束限制**: 不涉及。 **取值范围**: [0, 2^63-1] **默认取值**: 不涉及。
     * @return min
     */
    public Long getMin() {
        return min;
    }

    public void setMin(Long min) {
        this.min = min;
    }

    public CompareConditionOption withMax(Long max) {
        this.max = max;
        return this;
    }

    /**
     * **参数解释**: 最大值判断条件对应取值（小于条件）。 **约束限制**: 不涉及。 **取值范围**: [0, 2^63-1] **默认取值**: 不涉及。
     * @return max
     */
    public Long getMax() {
        return max;
    }

    public void setMax(Long max) {
        this.max = max;
    }

    public CompareConditionOption withValue(Long value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释**: 等值判断条件对应取值（等于条件）。value的优先级最高，如果value不为空，则忽略min和max的取值设置；value为空时，才使能min和max的条件过滤。 **约束限制**: 不涉及。 **取值范围**: [0, 2^63-1] **默认取值**: 不涉及。
     * @return value
     */
    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CompareConditionOption that = (CompareConditionOption) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.enableEqual, that.enableEqual)
            && Objects.equals(this.min, that.min) && Objects.equals(this.max, that.max)
            && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, enableEqual, min, max, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompareConditionOption {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    enableEqual: ").append(toIndentedString(enableEqual)).append("\n");
        sb.append("    min: ").append(toIndentedString(min)).append("\n");
        sb.append("    max: ").append(toIndentedString(max)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
