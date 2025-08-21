package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ChangedVO
 */
public class ChangedVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "changed")

    private Integer changed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private Integer value;

    public ChangedVO withChanged(Integer changed) {
        this.changed = changed;
        return this;
    }

    /**
     * **参数解释**： 变化数量 **取值范围**： 不涉及
     * @return changed
     */
    public Integer getChanged() {
        return changed;
    }

    public void setChanged(Integer changed) {
        this.changed = changed;
    }

    public ChangedVO withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**： 变化数量 **取值范围**： 不涉及
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ChangedVO withValue(Integer value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释**： 数量 **取值范围**： 不涉及
     * @return value
     */
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
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
        ChangedVO that = (ChangedVO) obj;
        return Objects.equals(this.changed, that.changed) && Objects.equals(this.total, that.total)
            && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(changed, total, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangedVO {\n");
        sb.append("    changed: ").append(toIndentedString(changed)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
