package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class DebugOpsThirdPartyAgentRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private DebugOpsThirdPartyAgentRequestBody body;

    public DebugOpsThirdPartyAgentRequest withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * **参数解释：** 合成任务的唯一标识符（ID），该参数用于在路径中指定特定的合成任务，以便执行查询、停止或删除等操作。获取方式：可通过创建合成任务接口返回的id获取，或通过查询合成任务列表接口获取。 **约束限制：** 不涉及。 **取值范围：** 1~36个字符，通常采用标准UUID格式。 **默认取值：** 不涉及。
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public DebugOpsThirdPartyAgentRequest withBody(DebugOpsThirdPartyAgentRequestBody body) {
        this.body = body;
        return this;
    }

    public DebugOpsThirdPartyAgentRequest withBody(Consumer<DebugOpsThirdPartyAgentRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new DebugOpsThirdPartyAgentRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public DebugOpsThirdPartyAgentRequestBody getBody() {
        return body;
    }

    public void setBody(DebugOpsThirdPartyAgentRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DebugOpsThirdPartyAgentRequest that = (DebugOpsThirdPartyAgentRequest) obj;
        return Objects.equals(this.agentId, that.agentId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agentId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DebugOpsThirdPartyAgentRequest {\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
