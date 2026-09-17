package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 基线属性信息，指定基线或取消基线操作。 **约束限制**： 不涉及。
 */
public class BaseLineVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baseline")

    private String baseline;

    public BaseLineVO withBaseline(String baseline) {
        this.baseline = baseline;
        return this;
    }

    /**
     * **参数解释**： 基线或取消基线操作类型。 **约束限制**： 不涉及。 **取值范围**： - baselined：基线发布/迭代计划 - unbaseline：取消基线，恢复发布/迭代计划 **默认取值**： 不涉及。
     * @return baseline
     */
    public String getBaseline() {
        return baseline;
    }

    public void setBaseline(String baseline) {
        this.baseline = baseline;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BaseLineVO that = (BaseLineVO) obj;
        return Objects.equals(this.baseline, that.baseline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baseline);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BaseLineVO {\n");
        sb.append("    baseline: ").append(toIndentedString(baseline)).append("\n");
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
