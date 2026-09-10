package com.huaweicloud.sdk.agentarts.v1.model;

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
public class ListOpsModelDeploymentsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    /**
     * **参数解释：** 部署状态，用于根据状态筛选任务。  **约束限制：** 不涉及  **取值范围：** deploying：部署中，running：运行中，stopping：停止中，stopped：已停止，starting：启动中，fail：部署失败，deleting：删除中，access_fail：接入失败。  **默认取值：** 无
     */
    public static final class StatusEnum {

        /**
         * Enum DEPLOYING for value: "deploying"
         */
        public static final StatusEnum DEPLOYING = new StatusEnum("deploying");

        /**
         * Enum RUNNING for value: "running"
         */
        public static final StatusEnum RUNNING = new StatusEnum("running");

        /**
         * Enum STOPPING for value: "stopping"
         */
        public static final StatusEnum STOPPING = new StatusEnum("stopping");

        /**
         * Enum STOPPED for value: "stopped"
         */
        public static final StatusEnum STOPPED = new StatusEnum("stopped");

        /**
         * Enum STARTING for value: "starting"
         */
        public static final StatusEnum STARTING = new StatusEnum("starting");

        /**
         * Enum FAIL for value: "fail"
         */
        public static final StatusEnum FAIL = new StatusEnum("fail");

        /**
         * Enum DELETING for value: "deleting"
         */
        public static final StatusEnum DELETING = new StatusEnum("deleting");

        /**
         * Enum ACCESS_FAIL for value: "access_fail"
         */
        public static final StatusEnum ACCESS_FAIL = new StatusEnum("access_fail");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("deploying", DEPLOYING);
            map.put("running", RUNNING);
            map.put("stopping", STOPPING);
            map.put("stopped", STOPPED);
            map.put("starting", STARTING);
            map.put("fail", FAIL);
            map.put("deleting", DELETING);
            map.put("access_fail", ACCESS_FAIL);
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
    @JsonProperty(value = "model_service_name")

    private String modelServiceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_name")

    private String modelName;

    public ListOpsModelDeploymentsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释：** 返回结果偏移量。 **约束限制：** 必须为非负整数。 **取值范围：** 0-100000。 **默认取值：** 0。 
     * minimum: 0
     * maximum: 100000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListOpsModelDeploymentsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释：** 限制数量。 **约束限制：** 不涉及。 **取值范围：** 正整数，最大值100。 **默认取值：** 100。
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListOpsModelDeploymentsRequest withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * **参数解释：** 模型优化任务ID，标识任务的唯一标识符。获取方法请参考查询模型优化任务列表。  **约束限制：** 不涉及  **取值范围：** 真实存在的模型优化任务ID字符串。  **默认取值：** 无
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ListOpsModelDeploymentsRequest withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 部署状态，用于根据状态筛选任务。  **约束限制：** 不涉及  **取值范围：** deploying：部署中，running：运行中，stopping：停止中，stopped：已停止，starting：启动中，fail：部署失败，deleting：删除中，access_fail：接入失败。  **默认取值：** 无
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ListOpsModelDeploymentsRequest withModelServiceName(String modelServiceName) {
        this.modelServiceName = modelServiceName;
        return this;
    }

    /**
     * **参数解释：** 模型服务名称。  **约束限制：** 选填参数，支持模糊匹配。  **取值范围：** 模型服务名称字符串。  **默认取值：** 无
     * @return modelServiceName
     */
    public String getModelServiceName() {
        return modelServiceName;
    }

    public void setModelServiceName(String modelServiceName) {
        this.modelServiceName = modelServiceName;
    }

    public ListOpsModelDeploymentsRequest withModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    /**
     * **参数解释：** 模型名称。  **约束限制：** 选填参数，支持模糊匹配。  **取值范围：** 模型名称字符串。  **默认取值：** 无
     * @return modelName
     */
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOpsModelDeploymentsRequest that = (ListOpsModelDeploymentsRequest) obj;
        return Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.taskId, that.taskId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.modelServiceName, that.modelServiceName)
            && Objects.equals(this.modelName, that.modelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, taskId, status, modelServiceName, modelName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsModelDeploymentsRequest {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    modelServiceName: ").append(toIndentedString(modelServiceName)).append("\n");
        sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
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
