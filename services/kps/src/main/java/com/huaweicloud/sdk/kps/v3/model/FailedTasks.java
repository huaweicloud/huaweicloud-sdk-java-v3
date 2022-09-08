package com.huaweicloud.sdk.kps.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 失败的任务详细信息。
 */
public class FailedTasks {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    /**
     * 任务的操作类型。 - FAILED_RESET 重置 - FAILED_REPLACE 替换 - FAILED_UNBIND 解绑
     */
    public static final class OperateTypeEnum {

        /**
         * Enum FAILED_RESET for value: "FAILED_RESET"
         */
        public static final OperateTypeEnum FAILED_RESET = new OperateTypeEnum("FAILED_RESET");

        /**
         * Enum FAILED_REPLACE for value: "FAILED_REPLACE"
         */
        public static final OperateTypeEnum FAILED_REPLACE = new OperateTypeEnum("FAILED_REPLACE");

        /**
         * Enum FAILED_UNBIND for value: "FAILED_UNBIND"
         */
        public static final OperateTypeEnum FAILED_UNBIND = new OperateTypeEnum("FAILED_UNBIND");

        private static final Map<String, OperateTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperateTypeEnum> createStaticFields() {
            Map<String, OperateTypeEnum> map = new HashMap<>();
            map.put("FAILED_RESET", FAILED_RESET);
            map.put("FAILED_REPLACE", FAILED_REPLACE);
            map.put("FAILED_UNBIND", FAILED_UNBIND);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OperateTypeEnum(String value) {
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
        public static OperateTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            OperateTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OperateTypeEnum(value);
            }
            return result;
        }

        public static OperateTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            OperateTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OperateTypeEnum) {
                return this.value.equals(((OperateTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_type")

    private OperateTypeEnum operateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_time")

    private String taskTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_error_code")

    private String taskErrorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_error_msg")

    private String taskErrorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_name")

    private String serverName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keypair_name")

    private String keypairName;

    public FailedTasks withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 虚拟机ID
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public FailedTasks withOperateType(OperateTypeEnum operateType) {
        this.operateType = operateType;
        return this;
    }

    /**
     * 任务的操作类型。 - FAILED_RESET 重置 - FAILED_REPLACE 替换 - FAILED_UNBIND 解绑
     * @return operateType
     */
    public OperateTypeEnum getOperateType() {
        return operateType;
    }

    public void setOperateType(OperateTypeEnum operateType) {
        this.operateType = operateType;
    }

    public FailedTasks withTaskTime(String taskTime) {
        this.taskTime = taskTime;
        return this;
    }

    /**
     * 任务时间
     * @return taskTime
     */
    public String getTaskTime() {
        return taskTime;
    }

    public void setTaskTime(String taskTime) {
        this.taskTime = taskTime;
    }

    public FailedTasks withTaskErrorCode(String taskErrorCode) {
        this.taskErrorCode = taskErrorCode;
        return this;
    }

    /**
     * 任务失败错误码
     * @return taskErrorCode
     */
    public String getTaskErrorCode() {
        return taskErrorCode;
    }

    public void setTaskErrorCode(String taskErrorCode) {
        this.taskErrorCode = taskErrorCode;
    }

    public FailedTasks withTaskErrorMsg(String taskErrorMsg) {
        this.taskErrorMsg = taskErrorMsg;
        return this;
    }

    /**
     * 任务失败错误码
     * @return taskErrorMsg
     */
    public String getTaskErrorMsg() {
        return taskErrorMsg;
    }

    public void setTaskErrorMsg(String taskErrorMsg) {
        this.taskErrorMsg = taskErrorMsg;
    }

    public FailedTasks withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * 虚拟机名称
     * @return serverName
     */
    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public FailedTasks withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * 虚拟机ID
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public FailedTasks withKeypairName(String keypairName) {
        this.keypairName = keypairName;
        return this;
    }

    /**
     * 密钥对名称
     * @return keypairName
     */
    public String getKeypairName() {
        return keypairName;
    }

    public void setKeypairName(String keypairName) {
        this.keypairName = keypairName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FailedTasks failedTasks = (FailedTasks) o;
        return Objects.equals(this.taskId, failedTasks.taskId)
            && Objects.equals(this.operateType, failedTasks.operateType)
            && Objects.equals(this.taskTime, failedTasks.taskTime)
            && Objects.equals(this.taskErrorCode, failedTasks.taskErrorCode)
            && Objects.equals(this.taskErrorMsg, failedTasks.taskErrorMsg)
            && Objects.equals(this.serverName, failedTasks.serverName)
            && Objects.equals(this.serverId, failedTasks.serverId)
            && Objects.equals(this.keypairName, failedTasks.keypairName);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(taskId, operateType, taskTime, taskErrorCode, taskErrorMsg, serverName, serverId, keypairName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FailedTasks {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    operateType: ").append(toIndentedString(operateType)).append("\n");
        sb.append("    taskTime: ").append(toIndentedString(taskTime)).append("\n");
        sb.append("    taskErrorCode: ").append(toIndentedString(taskErrorCode)).append("\n");
        sb.append("    taskErrorMsg: ").append(toIndentedString(taskErrorMsg)).append("\n");
        sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    keypairName: ").append(toIndentedString(keypairName)).append("\n");
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
