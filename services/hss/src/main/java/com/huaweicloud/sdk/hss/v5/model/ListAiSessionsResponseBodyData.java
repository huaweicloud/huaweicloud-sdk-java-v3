package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AI会话响应数据项
 */
public class ListAiSessionsResponseBodyData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_id")

    private String sessionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_name")

    private String agentName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime_name")

    private String runtimeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime_id")

    private String runtimeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_url")

    private String imageUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sdk_status")

    private String sdkStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_chat_time")

    private Long lastChatTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_duration")

    private Integer runDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_tokens")

    private Integer securityTokens;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    public ListAiSessionsResponseBodyData withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * **参数解释**： 会话ID **取值范围**： 字符长度为1-128位 
     * @return sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public ListAiSessionsResponseBodyData withAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }

    /**
     * **参数解释**： 智能体名字 **取值范围**： 字符长度为1-128位 
     * @return agentName
     */
    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public ListAiSessionsResponseBodyData withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * **参数解释**： 智能体ID **取值范围**： 字符长度为1-128位 
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public ListAiSessionsResponseBodyData withRuntimeName(String runtimeName) {
        this.runtimeName = runtimeName;
        return this;
    }

    /**
     * **参数解释**： 智能体运行时名字 **取值范围**： 字符长度为1-128位 
     * @return runtimeName
     */
    public String getRuntimeName() {
        return runtimeName;
    }

    public void setRuntimeName(String runtimeName) {
        this.runtimeName = runtimeName;
    }

    public ListAiSessionsResponseBodyData withRuntimeId(String runtimeId) {
        this.runtimeId = runtimeId;
        return this;
    }

    /**
     * **参数解释**： 智能体运行时ID **取值范围**： 字符长度为1-128位 
     * @return runtimeId
     */
    public String getRuntimeId() {
        return runtimeId;
    }

    public void setRuntimeId(String runtimeId) {
        this.runtimeId = runtimeId;
    }

    public ListAiSessionsResponseBodyData withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     * **参数解释**： 运行镜像地址 **取值范围**： 字符长度为1-128位 
     * @return imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public ListAiSessionsResponseBodyData withSdkStatus(String sdkStatus) {
        this.sdkStatus = sdkStatus;
        return this;
    }

    /**
     * **参数解释**： SDK检测状态 **取值范围**： - open：开启 - close：关闭 
     * @return sdkStatus
     */
    public String getSdkStatus() {
        return sdkStatus;
    }

    public void setSdkStatus(String sdkStatus) {
        this.sdkStatus = sdkStatus;
    }

    public ListAiSessionsResponseBodyData withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**： 会话开启时间，毫秒时间戳 **取值范围**： 0~9223372036854775807 
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ListAiSessionsResponseBodyData withLastChatTime(Long lastChatTime) {
        this.lastChatTime = lastChatTime;
        return this;
    }

    /**
     * **参数解释**： 会话上次对话时间，毫秒时间戳 **取值范围**： 0~9223372036854775807 
     * @return lastChatTime
     */
    public Long getLastChatTime() {
        return lastChatTime;
    }

    public void setLastChatTime(Long lastChatTime) {
        this.lastChatTime = lastChatTime;
    }

    public ListAiSessionsResponseBodyData withRunDuration(Integer runDuration) {
        this.runDuration = runDuration;
        return this;
    }

    /**
     * **参数解释**： 会话运行时长，单位为秒 **取值范围**： 0~2147483647 
     * @return runDuration
     */
    public Integer getRunDuration() {
        return runDuration;
    }

    public void setRunDuration(Integer runDuration) {
        this.runDuration = runDuration;
    }

    public ListAiSessionsResponseBodyData withSecurityTokens(Integer securityTokens) {
        this.securityTokens = securityTokens;
        return this;
    }

    /**
     * **参数解释**： 消耗的token数量 **取值范围**： 0~2147483647 
     * @return securityTokens
     */
    public Integer getSecurityTokens() {
        return securityTokens;
    }

    public void setSecurityTokens(Integer securityTokens) {
        this.securityTokens = securityTokens;
    }

    public ListAiSessionsResponseBodyData withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * **参数解释**： 智能体的来源 **取值范围**： - AgentArts - OfficeClaw 
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAiSessionsResponseBodyData that = (ListAiSessionsResponseBodyData) obj;
        return Objects.equals(this.sessionId, that.sessionId) && Objects.equals(this.agentName, that.agentName)
            && Objects.equals(this.agentId, that.agentId) && Objects.equals(this.runtimeName, that.runtimeName)
            && Objects.equals(this.runtimeId, that.runtimeId) && Objects.equals(this.imageUrl, that.imageUrl)
            && Objects.equals(this.sdkStatus, that.sdkStatus) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.lastChatTime, that.lastChatTime)
            && Objects.equals(this.runDuration, that.runDuration)
            && Objects.equals(this.securityTokens, that.securityTokens) && Objects.equals(this.source, that.source);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sessionId,
            agentName,
            agentId,
            runtimeName,
            runtimeId,
            imageUrl,
            sdkStatus,
            startTime,
            lastChatTime,
            runDuration,
            securityTokens,
            source);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAiSessionsResponseBodyData {\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    agentName: ").append(toIndentedString(agentName)).append("\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    runtimeName: ").append(toIndentedString(runtimeName)).append("\n");
        sb.append("    runtimeId: ").append(toIndentedString(runtimeId)).append("\n");
        sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
        sb.append("    sdkStatus: ").append(toIndentedString(sdkStatus)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    lastChatTime: ").append(toIndentedString(lastChatTime)).append("\n");
        sb.append("    runDuration: ").append(toIndentedString(runDuration)).append("\n");
        sb.append("    securityTokens: ").append(toIndentedString(securityTokens)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
