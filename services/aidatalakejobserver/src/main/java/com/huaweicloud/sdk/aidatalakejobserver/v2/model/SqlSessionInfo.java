package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SqlSessionInfo
 */
public class SqlSessionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_id")

    private String sessionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private SqlSessionStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_info")

    private Object endpointInfo;

    public SqlSessionInfo withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * **参数解释**：Session的ID。 **取值范围**：长度为1~36个字符，支持大小写英文字母、数字、连字符。
     * @return sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public SqlSessionInfo withStatus(SqlSessionStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public SqlSessionStatus getStatus() {
        return status;
    }

    public void setStatus(SqlSessionStatus status) {
        this.status = status;
    }

    public SqlSessionInfo withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**：session创建时间。 **取值范围**：不涉及。
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public SqlSessionInfo withEndpointInfo(Object endpointInfo) {
        this.endpointInfo = endpointInfo;
        return this;
    }

    public SqlSessionInfo withEndpointInfo(Consumer<Object> endpointInfoSetter) {
        if (this.endpointInfo == null) {
            this.endpointInfo = new Object();
            endpointInfoSetter.accept(this.endpointInfo);
        }

        return this;
    }

    /**
     * **参数解释**：端点信息。
     * @return endpointInfo
     */
    public Object getEndpointInfo() {
        return endpointInfo;
    }

    public void setEndpointInfo(Object endpointInfo) {
        this.endpointInfo = endpointInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SqlSessionInfo that = (SqlSessionInfo) obj;
        return Objects.equals(this.sessionId, that.sessionId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.endpointInfo, that.endpointInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sessionId, status, createTime, endpointInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SqlSessionInfo {\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    endpointInfo: ").append(toIndentedString(endpointInfo)).append("\n");
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
