package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowAiFeatureStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ai_defender")

    private String aiDefender;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agentarts")

    private String agentarts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "officeace")

    private String officeace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "openclaw")

    private String openclaw;

    public ShowAiFeatureStatusResponse withAiDefender(String aiDefender) {
        this.aiDefender = aiDefender;
        return this;
    }

    /**
     * **参数解释**: AI Defender白名单开关状态 **取值范围**: - not_enabled：该Region已上线AI Defender，但该客户未开通，需显示引导页面 - enabled：该Region已上线AI Defender，并且该客户已开通 
     * @return aiDefender
     */
    public String getAiDefender() {
        return aiDefender;
    }

    public void setAiDefender(String aiDefender) {
        this.aiDefender = aiDefender;
    }

    public ShowAiFeatureStatusResponse withAgentarts(String agentarts) {
        this.agentarts = agentarts;
        return this;
    }

    /**
     * **参数解释**: AgentArts开关状态 **取值范围**: - not_available：该Region未上线AgentArts，不显示AgentArts任何内容 - not_enabled：该Region已上线AgentArts，但该客户未开通 - enabled：该Region已上线AgentArts，并且该客户已开通 
     * @return agentarts
     */
    public String getAgentarts() {
        return agentarts;
    }

    public void setAgentarts(String agentarts) {
        this.agentarts = agentarts;
    }

    public ShowAiFeatureStatusResponse withOfficeace(String officeace) {
        this.officeace = officeace;
        return this;
    }

    /**
     * **参数解释**: OfficeAce开关状态 **取值范围**: - not_available：该Region未上线OfficeAce，不显示OfficeAce任何内容 - not_enabled：该Region已上线OfficeAce，但该客户未开通 - enabled：该Region已上线OfficeAce，并且该客户已开通 
     * @return officeace
     */
    public String getOfficeace() {
        return officeace;
    }

    public void setOfficeace(String officeace) {
        this.officeace = officeace;
    }

    public ShowAiFeatureStatusResponse withOpenclaw(String openclaw) {
        this.openclaw = openclaw;
        return this;
    }

    /**
     * **参数解释**: OpenClaw开关状态 **取值范围**: - not_available：该Region未上线OpenClaw - enabled：该Region已上线OpenClaw 
     * @return openclaw
     */
    public String getOpenclaw() {
        return openclaw;
    }

    public void setOpenclaw(String openclaw) {
        this.openclaw = openclaw;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAiFeatureStatusResponse that = (ShowAiFeatureStatusResponse) obj;
        return Objects.equals(this.aiDefender, that.aiDefender) && Objects.equals(this.agentarts, that.agentarts)
            && Objects.equals(this.officeace, that.officeace) && Objects.equals(this.openclaw, that.openclaw);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aiDefender, agentarts, officeace, openclaw);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAiFeatureStatusResponse {\n");
        sb.append("    aiDefender: ").append(toIndentedString(aiDefender)).append("\n");
        sb.append("    agentarts: ").append(toIndentedString(agentarts)).append("\n");
        sb.append("    officeace: ").append(toIndentedString(officeace)).append("\n");
        sb.append("    openclaw: ").append(toIndentedString(openclaw)).append("\n");
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
