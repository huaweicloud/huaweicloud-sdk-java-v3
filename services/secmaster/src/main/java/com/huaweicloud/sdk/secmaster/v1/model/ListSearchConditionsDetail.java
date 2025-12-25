package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListSearchConditionsDetail
 */
public class ListSearchConditionsDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition_id")

    private String conditionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition_name")

    private String conditionName;

    public ListSearchConditionsDetail withConditionId(String conditionId) {
        this.conditionId = conditionId;
        return this;
    }

    /**
     * 检索条件ID
     * @return conditionId
     */
    public String getConditionId() {
        return conditionId;
    }

    public void setConditionId(String conditionId) {
        this.conditionId = conditionId;
    }

    public ListSearchConditionsDetail withConditionName(String conditionName) {
        this.conditionName = conditionName;
        return this;
    }

    /**
     * 检索条件名称
     * @return conditionName
     */
    public String getConditionName() {
        return conditionName;
    }

    public void setConditionName(String conditionName) {
        this.conditionName = conditionName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSearchConditionsDetail that = (ListSearchConditionsDetail) obj;
        return Objects.equals(this.conditionId, that.conditionId)
            && Objects.equals(this.conditionName, that.conditionName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conditionId, conditionName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSearchConditionsDetail {\n");
        sb.append("    conditionId: ").append(toIndentedString(conditionId)).append("\n");
        sb.append("    conditionName: ").append(toIndentedString(conditionName)).append("\n");
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
