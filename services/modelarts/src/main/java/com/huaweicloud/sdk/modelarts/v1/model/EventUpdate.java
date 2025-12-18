package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * EventUpdate
 */
public class EventUpdate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notBefore")

    private String notBefore;

    public EventUpdate withNotBefore(String notBefore) {
        this.notBefore = notBefore;
        return this;
    }

    /**
     * **参数解释**：计划执行开始时间，格式为yyyy-MM-ddTHH:mm:ssZ。 **约束限制**：不涉及。 **取值范围**：大于当前时间。 **默认取值**：不填表示立即执行。
     * @return notBefore
     */
    public String getNotBefore() {
        return notBefore;
    }

    public void setNotBefore(String notBefore) {
        this.notBefore = notBefore;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventUpdate that = (EventUpdate) obj;
        return Objects.equals(this.notBefore, that.notBefore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notBefore);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventUpdate {\n");
        sb.append("    notBefore: ").append(toIndentedString(notBefore)).append("\n");
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
