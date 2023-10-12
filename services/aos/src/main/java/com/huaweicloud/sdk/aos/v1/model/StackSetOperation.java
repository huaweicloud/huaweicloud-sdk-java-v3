package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * StackSetOperation
 */
public class StackSetOperation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_id")

    private String operationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stack_set_id")

    private String stackSetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stack_set_name")

    private String stackSetName;

    /**
     * 用户当前的操作   * `CREATE_STACK_INSTANCES` - 创建资源栈实例   * `DELETE_STACK_INSTANCES` - 删除资源栈实例   * `DEPLOY_STACK_SET` - 部署资源栈集   * `DEPLOY_STACK_INSTANCES` - 部署资源栈实例
     */
    public static final class ActionEnum {

        /**
         * Enum CREATE_STACK_INSTANCES for value: "CREATE_STACK_INSTANCES"
         */
        public static final ActionEnum CREATE_STACK_INSTANCES = new ActionEnum("CREATE_STACK_INSTANCES");

        /**
         * Enum DELETE_STACK_INSTANCES for value: "DELETE_STACK_INSTANCES"
         */
        public static final ActionEnum DELETE_STACK_INSTANCES = new ActionEnum("DELETE_STACK_INSTANCES");

        /**
         * Enum DEPLOY_STACK_SET for value: "DEPLOY_STACK_SET"
         */
        public static final ActionEnum DEPLOY_STACK_SET = new ActionEnum("DEPLOY_STACK_SET");

        /**
         * Enum DEPLOY_STACK_INSTANCES for value: "DEPLOY_STACK_INSTANCES"
         */
        public static final ActionEnum DEPLOY_STACK_INSTANCES = new ActionEnum("DEPLOY_STACK_INSTANCES");

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("CREATE_STACK_INSTANCES", CREATE_STACK_INSTANCES);
            map.put("DELETE_STACK_INSTANCES", DELETE_STACK_INSTANCES);
            map.put("DEPLOY_STACK_SET", DEPLOY_STACK_SET);
            map.put("DEPLOY_STACK_INSTANCES", DEPLOY_STACK_INSTANCES);
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

    /**
     * 资源栈集操作状态   * `QUEUE_IN_PROGRESS` - 正在排队   * `OPERATION_IN_PROGRESS` - 正在操作   * `OPERATION_COMPLETE` - 操作完成   * `OPERATION_FAILED` - 操作失败   * `STOP_IN_PROGRESS` - 正在停止   * `STOP_COMPLETE` - 停止完成   * `STOP_FAILED` - 停止失败
     */
    public static final class StatusEnum {

        /**
         * Enum QUEUE_IN_PROGRESS for value: "QUEUE_IN_PROGRESS"
         */
        public static final StatusEnum QUEUE_IN_PROGRESS = new StatusEnum("QUEUE_IN_PROGRESS");

        /**
         * Enum OPERATION_IN_PROGRESS for value: "OPERATION_IN_PROGRESS"
         */
        public static final StatusEnum OPERATION_IN_PROGRESS = new StatusEnum("OPERATION_IN_PROGRESS");

        /**
         * Enum OPERATION_COMPLETE for value: "OPERATION_COMPLETE"
         */
        public static final StatusEnum OPERATION_COMPLETE = new StatusEnum("OPERATION_COMPLETE");

        /**
         * Enum OPERATION_FAILED for value: "OPERATION_FAILED"
         */
        public static final StatusEnum OPERATION_FAILED = new StatusEnum("OPERATION_FAILED");

        /**
         * Enum STOP_IN_PROGRESS for value: "STOP_IN_PROGRESS"
         */
        public static final StatusEnum STOP_IN_PROGRESS = new StatusEnum("STOP_IN_PROGRESS");

        /**
         * Enum STOP_COMPLETE for value: "STOP_COMPLETE"
         */
        public static final StatusEnum STOP_COMPLETE = new StatusEnum("STOP_COMPLETE");

        /**
         * Enum STOP_FAILED for value: "STOP_FAILED"
         */
        public static final StatusEnum STOP_FAILED = new StatusEnum("STOP_FAILED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("QUEUE_IN_PROGRESS", QUEUE_IN_PROGRESS);
            map.put("OPERATION_IN_PROGRESS", OPERATION_IN_PROGRESS);
            map.put("OPERATION_COMPLETE", OPERATION_COMPLETE);
            map.put("OPERATION_FAILED", OPERATION_FAILED);
            map.put("STOP_IN_PROGRESS", STOP_IN_PROGRESS);
            map.put("STOP_COMPLETE", STOP_COMPLETE);
            map.put("STOP_FAILED", STOP_FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_message")

    private String statusMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public StackSetOperation withOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }

    /**
     * 资源栈集操作Id。  此Id由资源编排服务在生成资源栈集操作的时候生成，为UUID。
     * @return operationId
     */
    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    public StackSetOperation withStackSetId(String stackSetId) {
        this.stackSetId = stackSetId;
        return this;
    }

    /**
     * 资源栈集（stack_set）的唯一ID。  此ID由资源编排服务在生成资源栈的时候生成，为UUID。  由于资源栈集名仅仅在同一时间下唯一，即用户允许先生成一个叫HelloWorld的资源栈集，删除，在重新创建一个同名资源栈集。  对于团队并行开发，用户可能希望确保，当前我操作的资源栈集就是我以为的那个，而不是又其他队友删除后创建的同名资源栈集。因此，使用ID就可以做到强匹配。  资源编排服务保证每次创建的资源栈集所对应的ID都不相同，更新不会影响ID。如果给与的stack_set_id和当前资源栈集的ID不一致，则返回400
     * @return stackSetId
     */
    public String getStackSetId() {
        return stackSetId;
    }

    public void setStackSetId(String stackSetId) {
        this.stackSetId = stackSetId;
    }

    public StackSetOperation withStackSetName(String stackSetName) {
        this.stackSetName = stackSetName;
        return this;
    }

    /**
     * 资源栈集（stack_set）的名字。此名字在domain_id+region下应唯一，可以使用中文、大小写英文、数字、下划线、中划线。首字符需为中文或者英文，区分大小写。
     * @return stackSetName
     */
    public String getStackSetName() {
        return stackSetName;
    }

    public void setStackSetName(String stackSetName) {
        this.stackSetName = stackSetName;
    }

    public StackSetOperation withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * 用户当前的操作   * `CREATE_STACK_INSTANCES` - 创建资源栈实例   * `DELETE_STACK_INSTANCES` - 删除资源栈实例   * `DEPLOY_STACK_SET` - 部署资源栈集   * `DEPLOY_STACK_INSTANCES` - 部署资源栈实例
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public StackSetOperation withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 资源栈集操作状态   * `QUEUE_IN_PROGRESS` - 正在排队   * `OPERATION_IN_PROGRESS` - 正在操作   * `OPERATION_COMPLETE` - 操作完成   * `OPERATION_FAILED` - 操作失败   * `STOP_IN_PROGRESS` - 正在停止   * `STOP_COMPLETE` - 停止完成   * `STOP_FAILED` - 停止失败
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public StackSetOperation withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * 资源栈集操作失败时会展示此次操作失败的原因，例如，资源栈实例部署或删除失败个数超过上限或资源栈集操作超时。  如果需要查看详细失败信息，可通过ListStackInstances API获取查看资源栈实例的status_message。
     * @return statusMessage
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public StackSetOperation withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 资源栈集操作的创建时间，格式为YYYY-MM-DDTHH:mm:ss.SSSZ，精确到毫秒，UTC时区，即，如1970-01-01T00:00:00.000Z。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public StackSetOperation withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 资源栈集操作的更新时间，格式为YYYY-MM-DDTHH:mm:ss.SSSZ，精确到毫秒，UTC时区，即，如1970-01-01T00:00:00.000Z。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StackSetOperation that = (StackSetOperation) obj;
        return Objects.equals(this.operationId, that.operationId) && Objects.equals(this.stackSetId, that.stackSetId)
            && Objects.equals(this.stackSetName, that.stackSetName) && Objects.equals(this.action, that.action)
            && Objects.equals(this.status, that.status) && Objects.equals(this.statusMessage, that.statusMessage)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(operationId, stackSetId, stackSetName, action, status, statusMessage, createTime, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StackSetOperation {\n");
        sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
        sb.append("    stackSetId: ").append(toIndentedString(stackSetId)).append("\n");
        sb.append("    stackSetName: ").append(toIndentedString(stackSetName)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
