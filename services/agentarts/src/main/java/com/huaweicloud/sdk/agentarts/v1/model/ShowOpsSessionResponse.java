package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowOpsSessionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_id")

    private String sessionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latency")

    private BigDecimal latency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tokens")

    private BigDecimal tokens;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_tokens")

    private BigDecimal inputTokens;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_tokens")

    private BigDecimal outputTokens;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trace_num")

    private BigDecimal traceNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "call_type")

    private String callType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    public ShowOpsSessionResponse withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * 会话id
     * @return sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public ShowOpsSessionResponse withLatency(BigDecimal latency) {
        this.latency = latency;
        return this;
    }

    /**
     * 耗时
     * minimum: 0
     * maximum: 1E+6
     * @return latency
     */
    public BigDecimal getLatency() {
        return latency;
    }

    public void setLatency(BigDecimal latency) {
        this.latency = latency;
    }

    public ShowOpsSessionResponse withTokens(BigDecimal tokens) {
        this.tokens = tokens;
        return this;
    }

    /**
     * tokens消耗
     * minimum: 0
     * maximum: 4.110338427E+12
     * @return tokens
     */
    public BigDecimal getTokens() {
        return tokens;
    }

    public void setTokens(BigDecimal tokens) {
        this.tokens = tokens;
    }

    public ShowOpsSessionResponse withInputTokens(BigDecimal inputTokens) {
        this.inputTokens = inputTokens;
        return this;
    }

    /**
     * input tokens消耗
     * minimum: 0
     * maximum: 4.110338427E+12
     * @return inputTokens
     */
    public BigDecimal getInputTokens() {
        return inputTokens;
    }

    public void setInputTokens(BigDecimal inputTokens) {
        this.inputTokens = inputTokens;
    }

    public ShowOpsSessionResponse withOutputTokens(BigDecimal outputTokens) {
        this.outputTokens = outputTokens;
        return this;
    }

    /**
     * output tokens消耗
     * minimum: 0
     * maximum: 4.110338427E+12
     * @return outputTokens
     */
    public BigDecimal getOutputTokens() {
        return outputTokens;
    }

    public void setOutputTokens(BigDecimal outputTokens) {
        this.outputTokens = outputTokens;
    }

    public ShowOpsSessionResponse withTraceNum(BigDecimal traceNum) {
        this.traceNum = traceNum;
        return this;
    }

    /**
     * trace数
     * minimum: 0
     * maximum: 1E+5
     * @return traceNum
     */
    public BigDecimal getTraceNum() {
        return traceNum;
    }

    public void setTraceNum(BigDecimal traceNum) {
        this.traceNum = traceNum;
    }

    public ShowOpsSessionResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户id
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ShowOpsSessionResponse withCallType(String callType) {
        this.callType = callType;
        return this;
    }

    /**
     * 模式
     * @return callType
     */
    public String getCallType() {
        return callType;
    }

    public void setCallType(String callType) {
        this.callType = callType;
    }

    public ShowOpsSessionResponse withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 时间戳
     * minimum: 0
     * maximum: 4110338427000
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ShowOpsSessionResponse withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 租户domainId
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ShowOpsSessionResponse withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源id
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ShowOpsSessionResponse withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 资源名称
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public ShowOpsSessionResponse withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOpsSessionResponse that = (ShowOpsSessionResponse) obj;
        return Objects.equals(this.sessionId, that.sessionId) && Objects.equals(this.latency, that.latency)
            && Objects.equals(this.tokens, that.tokens) && Objects.equals(this.inputTokens, that.inputTokens)
            && Objects.equals(this.outputTokens, that.outputTokens) && Objects.equals(this.traceNum, that.traceNum)
            && Objects.equals(this.userId, that.userId) && Objects.equals(this.callType, that.callType)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.resourceName, that.resourceName)
            && Objects.equals(this.resourceType, that.resourceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sessionId,
            latency,
            tokens,
            inputTokens,
            outputTokens,
            traceNum,
            userId,
            callType,
            startTime,
            domainId,
            resourceId,
            resourceName,
            resourceType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOpsSessionResponse {\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    latency: ").append(toIndentedString(latency)).append("\n");
        sb.append("    tokens: ").append(toIndentedString(tokens)).append("\n");
        sb.append("    inputTokens: ").append(toIndentedString(inputTokens)).append("\n");
        sb.append("    outputTokens: ").append(toIndentedString(outputTokens)).append("\n");
        sb.append("    traceNum: ").append(toIndentedString(traceNum)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    callType: ").append(toIndentedString(callType)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
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
