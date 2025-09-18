package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class SwitchStrategyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Boolean status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_set_id")

    private String ruleSetId;

    public SwitchStrategyResponse withStatus(Boolean status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 更新状态是否成功。 **取值范围**： - true：状态更新成功。 - false：状态更新失败。 
     * @return status
     */
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public SwitchStrategyResponse withRuleSetId(String ruleSetId) {
        this.ruleSetId = ruleSetId;
        return this;
    }

    /**
     * **参数解释**： 更新的策略ID。 **取值范围**： 不涉及。 
     * @return ruleSetId
     */
    public String getRuleSetId() {
        return ruleSetId;
    }

    public void setRuleSetId(String ruleSetId) {
        this.ruleSetId = ruleSetId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SwitchStrategyResponse that = (SwitchStrategyResponse) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.ruleSetId, that.ruleSetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, ruleSetId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchStrategyResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    ruleSetId: ").append(toIndentedString(ruleSetId)).append("\n");
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
