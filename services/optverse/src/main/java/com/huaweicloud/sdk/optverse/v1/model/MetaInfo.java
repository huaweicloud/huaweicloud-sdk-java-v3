package com.huaweicloud.sdk.optverse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 补充元信息。 **约束限制**： 不涉及 **取值范围**： 不涉及。 **默认取值**： 不涉及 
 */
public class MetaInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cost_time")

    private Long costTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_time")

    private Long currentTime;

    public MetaInfo withCostTime(Long costTime) {
        this.costTime = costTime;
        return this;
    }

    /**
     * **参数解释**： 请求用时。 **约束限制**： 不涉及 **取值范围**： 取值范围[0,9999999999999]。 **默认取值**： 不涉及 
     * minimum: 0
     * maximum: 9999999999999
     * @return costTime
     */
    public Long getCostTime() {
        return costTime;
    }

    public void setCostTime(Long costTime) {
        this.costTime = costTime;
    }

    public MetaInfo withCurrentTime(Long currentTime) {
        this.currentTime = currentTime;
        return this;
    }

    /**
     * **参数解释**： 请求结束时间。 **约束限制**： 不涉及 **取值范围**： 取值范围[0,9999999999999]。 **默认取值**： 不涉及 
     * minimum: 0
     * maximum: 9999999999999
     * @return currentTime
     */
    public Long getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(Long currentTime) {
        this.currentTime = currentTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MetaInfo that = (MetaInfo) obj;
        return Objects.equals(this.costTime, that.costTime) && Objects.equals(this.currentTime, that.currentTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(costTime, currentTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetaInfo {\n");
        sb.append("    costTime: ").append(toIndentedString(costTime)).append("\n");
        sb.append("    currentTime: ").append(toIndentedString(currentTime)).append("\n");
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
