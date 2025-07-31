package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowAppWhitelistAgentStaticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_num")

    private Integer agentNum;

    public ShowAppWhitelistAgentStaticsResponse withAgentNum(Integer agentNum) {
        this.agentNum = agentNum;
        return this;
    }

    /**
     * **参数解释**: 总数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return agentNum
     */
    public Integer getAgentNum() {
        return agentNum;
    }

    public void setAgentNum(Integer agentNum) {
        this.agentNum = agentNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAppWhitelistAgentStaticsResponse that = (ShowAppWhitelistAgentStaticsResponse) obj;
        return Objects.equals(this.agentNum, that.agentNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agentNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAppWhitelistAgentStaticsResponse {\n");
        sb.append("    agentNum: ").append(toIndentedString(agentNum)).append("\n");
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
