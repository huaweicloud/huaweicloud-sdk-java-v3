package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class SetRdsDBFaultPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "errmsg")

    private String errmsg;

    public SetRdsDBFaultPolicyResponse withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * **参数解释**：  请求状态。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public SetRdsDBFaultPolicyResponse withErrmsg(String errmsg) {
        this.errmsg = errmsg;
        return this;
    }

    /**
     * **参数解释**：  错误信息。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return errmsg
     */
    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetRdsDBFaultPolicyResponse that = (SetRdsDBFaultPolicyResponse) obj;
        return Objects.equals(this.state, that.state) && Objects.equals(this.errmsg, that.errmsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state, errmsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetRdsDBFaultPolicyResponse {\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    errmsg: ").append(toIndentedString(errmsg)).append("\n");
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
