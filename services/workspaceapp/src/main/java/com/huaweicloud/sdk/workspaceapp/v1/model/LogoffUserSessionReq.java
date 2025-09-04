package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 注销会话请求。
 */
public class LogoffUserSessionReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_ids")

    private List<String> sessionIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_type")

    private Integer messageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delay_time")

    private Integer delayTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transaction_id")

    private String transactionId;

    public LogoffUserSessionReq withSessionIds(List<String> sessionIds) {
        this.sessionIds = sessionIds;
        return this;
    }

    public LogoffUserSessionReq addSessionIdsItem(String sessionIdsItem) {
        if (this.sessionIds == null) {
            this.sessionIds = new ArrayList<>();
        }
        this.sessionIds.add(sessionIdsItem);
        return this;
    }

    public LogoffUserSessionReq withSessionIds(Consumer<List<String>> sessionIdsSetter) {
        if (this.sessionIds == null) {
            this.sessionIds = new ArrayList<>();
        }
        sessionIdsSetter.accept(this.sessionIds);
        return this;
    }

    /**
     * 会话信息id列表。
     * @return sessionIds
     */
    public List<String> getSessionIds() {
        return sessionIds;
    }

    public void setSessionIds(List<String> sessionIds) {
        this.sessionIds = sessionIds;
    }

    public LogoffUserSessionReq withMessageType(Integer messageType) {
        this.messageType = messageType;
        return this;
    }

    /**
     * 客户端弹框级别，代表给会话发消息时的严重程度（比如info、warning、error级别） 0->info; 1-> warn; 2->serious。
     * minimum: 0
     * maximum: 4
     * @return messageType
     */
    public Integer getMessageType() {
        return messageType;
    }

    public void setMessageType(Integer messageType) {
        this.messageType = messageType;
    }

    public LogoffUserSessionReq withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 客户端弹框内容。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LogoffUserSessionReq withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 弹框标题。
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LogoffUserSessionReq withDelayTime(Integer delayTime) {
        this.delayTime = delayTime;
        return this;
    }

    /**
     * 延迟多长时间注销会话， 单位：秒。
     * minimum: 0
     * maximum: 999999
     * @return delayTime
     */
    public Integer getDelayTime() {
        return delayTime;
    }

    public void setDelayTime(Integer delayTime) {
        this.delayTime = delayTime;
    }

    public LogoffUserSessionReq withTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * 事务id，用作客户端日志定位跟踪。
     * @return transactionId
     */
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LogoffUserSessionReq that = (LogoffUserSessionReq) obj;
        return Objects.equals(this.sessionIds, that.sessionIds) && Objects.equals(this.messageType, that.messageType)
            && Objects.equals(this.message, that.message) && Objects.equals(this.title, that.title)
            && Objects.equals(this.delayTime, that.delayTime) && Objects.equals(this.transactionId, that.transactionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sessionIds, messageType, message, title, delayTime, transactionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogoffUserSessionReq {\n");
        sb.append("    sessionIds: ").append(toIndentedString(sessionIds)).append("\n");
        sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    delayTime: ").append(toIndentedString(delayTime)).append("\n");
        sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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
