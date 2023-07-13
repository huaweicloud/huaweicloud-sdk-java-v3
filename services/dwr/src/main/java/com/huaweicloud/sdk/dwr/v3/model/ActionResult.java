package com.huaweicloud.sdk.dwr.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 节点错误处理的定义
 */
public class ActionResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match")

    private String match;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retry_interval")

    private Integer retryInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_retry")

    private Integer maxRetry;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_state")

    private String nextState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_terminal")

    private Boolean isTerminal;

    public ActionResult withMatch(String match) {
        this.match = match;
        return this;
    }

    /**
     * 触发错误处理需符合的条件
     * @return match
     */
    public String getMatch() {
        return match;
    }

    public void setMatch(String match) {
        this.match = match;
    }

    public ActionResult withRetryInterval(Integer retryInterval) {
        this.retryInterval = retryInterval;
        return this;
    }

    /**
     * 每次重试间隔时间
     * @return retryInterval
     */
    public Integer getRetryInterval() {
        return retryInterval;
    }

    public void setRetryInterval(Integer retryInterval) {
        this.retryInterval = retryInterval;
    }

    public ActionResult withMaxRetry(Integer maxRetry) {
        this.maxRetry = maxRetry;
        return this;
    }

    /**
     * 最多重试次数
     * @return maxRetry
     */
    public Integer getMaxRetry() {
        return maxRetry;
    }

    public void setMaxRetry(Integer maxRetry) {
        this.maxRetry = maxRetry;
    }

    public ActionResult withNextState(String nextState) {
        this.nextState = nextState;
        return this;
    }

    /**
     * 下一个状态
     * @return nextState
     */
    public String getNextState() {
        return nextState;
    }

    public void setNextState(String nextState) {
        this.nextState = nextState;
    }

    public ActionResult withIsTerminal(Boolean isTerminal) {
        this.isTerminal = isTerminal;
        return this;
    }

    /**
     * 是否为结束状态
     * @return isTerminal
     */
    public Boolean getIsTerminal() {
        return isTerminal;
    }

    public void setIsTerminal(Boolean isTerminal) {
        this.isTerminal = isTerminal;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActionResult that = (ActionResult) obj;
        return Objects.equals(this.match, that.match) && Objects.equals(this.retryInterval, that.retryInterval)
            && Objects.equals(this.maxRetry, that.maxRetry) && Objects.equals(this.nextState, that.nextState)
            && Objects.equals(this.isTerminal, that.isTerminal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(match, retryInterval, maxRetry, nextState, isTerminal);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionResult {\n");
        sb.append("    match: ").append(toIndentedString(match)).append("\n");
        sb.append("    retryInterval: ").append(toIndentedString(retryInterval)).append("\n");
        sb.append("    maxRetry: ").append(toIndentedString(maxRetry)).append("\n");
        sb.append("    nextState: ").append(toIndentedString(nextState)).append("\n");
        sb.append("    isTerminal: ").append(toIndentedString(isTerminal)).append("\n");
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
