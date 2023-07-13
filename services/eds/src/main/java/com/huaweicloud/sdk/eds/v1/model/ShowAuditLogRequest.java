package com.huaweicloud.sdk.eds.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowAuditLogRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connector_id")

    private String connectorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connector_keywords")

    private String connectorKeywords;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_keywords")

    private String userKeywords;

    /**
     * 执行动作过滤
     */
    public static final class ActionEnum {

        /**
         * Enum VIEW for value: "VIEW"
         */
        public static final ActionEnum VIEW = new ActionEnum("VIEW");

        /**
         * Enum PROCESS for value: "PROCESS"
         */
        public static final ActionEnum PROCESS = new ActionEnum("PROCESS");

        /**
         * Enum MODIFY for value: "MODIFY"
         */
        public static final ActionEnum MODIFY = new ActionEnum("MODIFY");

        /**
         * Enum NOTIFY for value: "NOTIFY"
         */
        public static final ActionEnum NOTIFY = new ActionEnum("NOTIFY");

        /**
         * Enum VERIFY for value: "VERIFY"
         */
        public static final ActionEnum VERIFY = new ActionEnum("VERIFY");

        /**
         * Enum DELETE for value: "DELETE"
         */
        public static final ActionEnum DELETE = new ActionEnum("DELETE");

        /**
         * Enum FORWARD for value: "FORWARD"
         */
        public static final ActionEnum FORWARD = new ActionEnum("FORWARD");

        /**
         * Enum DOWNLOAD for value: "DOWNLOAD"
         */
        public static final ActionEnum DOWNLOAD = new ActionEnum("DOWNLOAD");

        /**
         * Enum APPROVE for value: "APPROVE"
         */
        public static final ActionEnum APPROVE = new ActionEnum("APPROVE");

        /**
         * Enum TERMINATE for value: "TERMINATE"
         */
        public static final ActionEnum TERMINATE = new ActionEnum("TERMINATE");

        /**
         * Enum NONE for value: "NONE"
         */
        public static final ActionEnum NONE = new ActionEnum("NONE");

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("VIEW", VIEW);
            map.put("PROCESS", PROCESS);
            map.put("MODIFY", MODIFY);
            map.put("NOTIFY", NOTIFY);
            map.put("VERIFY", VERIFY);
            map.put("DELETE", DELETE);
            map.put("FORWARD", FORWARD);
            map.put("DOWNLOAD", DOWNLOAD);
            map.put("APPROVE", APPROVE);
            map.put("TERMINATE", TERMINATE);
            map.put("NONE", NONE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ActionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ActionEnum(value));
        }

        public static ActionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionEnum) {
                return this.value.equals(((ActionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private ActionEnum action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ShowAuditLogRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID,开通的数据交换平台实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowAuditLogRequest withConnectorId(String connectorId) {
        this.connectorId = connectorId;
        return this;
    }

    /**
     * 连接器ID,指定数据交换平台下连接器的ID
     * @return connectorId
     */
    public String getConnectorId() {
        return connectorId;
    }

    public void setConnectorId(String connectorId) {
        this.connectorId = connectorId;
    }

    public ShowAuditLogRequest withConnectorKeywords(String connectorKeywords) {
        this.connectorKeywords = connectorKeywords;
        return this;
    }

    /**
     * 连接器名称过滤关键字
     * @return connectorKeywords
     */
    public String getConnectorKeywords() {
        return connectorKeywords;
    }

    public void setConnectorKeywords(String connectorKeywords) {
        this.connectorKeywords = connectorKeywords;
    }

    public ShowAuditLogRequest withUserKeywords(String userKeywords) {
        this.userKeywords = userKeywords;
        return this;
    }

    /**
     * 用户名称过滤关键字
     * @return userKeywords
     */
    public String getUserKeywords() {
        return userKeywords;
    }

    public void setUserKeywords(String userKeywords) {
        this.userKeywords = userKeywords;
    }

    public ShowAuditLogRequest withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * 执行动作过滤
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public ShowAuditLogRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 发生时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ShowAuditLogRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ShowAuditLogRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，表示从此偏移量开始查询， offset大于等于0
     * minimum: 0
     * maximum: 999999
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ShowAuditLogRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示条目数量，最大数量999，超过999后只返回999<br>（当前华为云规范防止单页返回过大）
     * minimum: 0
     * maximum: 999999
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAuditLogRequest that = (ShowAuditLogRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.connectorId, that.connectorId)
            && Objects.equals(this.connectorKeywords, that.connectorKeywords)
            && Objects.equals(this.userKeywords, that.userKeywords) && Objects.equals(this.action, that.action)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(instanceId, connectorId, connectorKeywords, userKeywords, action, startTime, endTime, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAuditLogRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    connectorId: ").append(toIndentedString(connectorId)).append("\n");
        sb.append("    connectorKeywords: ").append(toIndentedString(connectorKeywords)).append("\n");
        sb.append("    userKeywords: ").append(toIndentedString(userKeywords)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
