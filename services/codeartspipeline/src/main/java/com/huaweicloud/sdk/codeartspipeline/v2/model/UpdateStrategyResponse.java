package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class UpdateStrategyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Boolean status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_set_id")

    private String ruleSetId;

    public UpdateStrategyResponse withStatus(Boolean status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 是否调用成功。 **取值范围**： - true：调用成功。 - false：调用失败。 
     * @return status
     */
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public UpdateStrategyResponse withRuleSetId(String ruleSetId) {
        this.ruleSetId = ruleSetId;
        return this;
    }

    /**
     * **参数解释**： 策略ID，策略的唯一标识，通过[获取策略列表](ListStrategy.xml)接口获取，data.id即为策略ID。 **约束限制**： 不涉及。 **取值范围**： 32位字符，由数字和字母组成。 **默认取值**： 不涉及。 
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
        UpdateStrategyResponse that = (UpdateStrategyResponse) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.ruleSetId, that.ruleSetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, ruleSetId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateStrategyResponse {\n");
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
