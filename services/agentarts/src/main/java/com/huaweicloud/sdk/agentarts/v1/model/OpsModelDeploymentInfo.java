package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 调优信息。
 */
public class OpsModelDeploymentInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent")

    private OpsTuningTargetAgent agent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_name")

    private String modelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ma_service_id")

    private String maServiceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_provider_id")

    private String modelProviderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_service_id")

    private String modelServiceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_service_name")

    private String modelServiceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_url")

    private String apiUrl;

    /**
     * **参数解释：** 部署服务状态。  **取值范围：** deploying：部署中，running：运行中，stopping：停止中，stopped：已停止，starting：启动中，fail：部署失败，deleting：删除中，access_fail：接入失败。
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
    @JsonProperty(value = "created_at")

    private Long createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_reason")

    private String failReason;

    public OpsModelDeploymentInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 部署任务ID，标识部署任务的唯一标识符。  **取值范围：** UUID格式字符串。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OpsModelDeploymentInfo withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * **参数解释：** 关联的模型优化任务ID。  **取值范围：** 任务ID字符串。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public OpsModelDeploymentInfo withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * **参数解释：** 模型优化任务产物ID。  **取值范围：** 产物ID字符串。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public OpsModelDeploymentInfo withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * **参数解释：** 模型优化任务名称。  **取值范围：** 任务名称字符串。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public OpsModelDeploymentInfo withAgent(OpsTuningTargetAgent agent) {
        this.agent = agent;
        return this;
    }

    public OpsModelDeploymentInfo withAgent(Consumer<OpsTuningTargetAgent> agentSetter) {
        if (this.agent == null) {
            this.agent = new OpsTuningTargetAgent();
            agentSetter.accept(this.agent);
        }

        return this;
    }

    /**
     * Get agent
     * @return agent
     */
    public OpsTuningTargetAgent getAgent() {
        return agent;
    }

    public void setAgent(OpsTuningTargetAgent agent) {
        this.agent = agent;
    }

    public OpsModelDeploymentInfo withModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    /**
     * **参数解释：** 被调优的模型名称。  **取值范围：** 模型名称字符串。
     * @return modelName
     */
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public OpsModelDeploymentInfo withMaServiceId(String maServiceId) {
        this.maServiceId = maServiceId;
        return this;
    }

    /**
     * **参数解释：** ModelArts服务ID，关联底层ModelArts平台的服务实例。  **取值范围：** ModelArts侧的服务ID字符串。
     * @return maServiceId
     */
    public String getMaServiceId() {
        return maServiceId;
    }

    public void setMaServiceId(String maServiceId) {
        this.maServiceId = maServiceId;
    }

    public OpsModelDeploymentInfo withModelProviderId(String modelProviderId) {
        this.modelProviderId = modelProviderId;
        return this;
    }

    /**
     * **参数解释：** 模型提供商ID，标识模型来源的服务商。  **取值范围：** 提供商标识字符串。
     * @return modelProviderId
     */
    public String getModelProviderId() {
        return modelProviderId;
    }

    public void setModelProviderId(String modelProviderId) {
        this.modelProviderId = modelProviderId;
    }

    public OpsModelDeploymentInfo withModelServiceId(String modelServiceId) {
        this.modelServiceId = modelServiceId;
        return this;
    }

    /**
     * **参数解释：** 模型服务ID，本平台生成的服务唯一标识。  **取值范围：** 模型服务唯一标识字符串。
     * @return modelServiceId
     */
    public String getModelServiceId() {
        return modelServiceId;
    }

    public void setModelServiceId(String modelServiceId) {
        this.modelServiceId = modelServiceId;
    }

    public OpsModelDeploymentInfo withModelServiceName(String modelServiceName) {
        this.modelServiceName = modelServiceName;
        return this;
    }

    /**
     * **参数解释：** 模型服务名称。  **取值范围：** 模型服务显示名称
     * @return modelServiceName
     */
    public String getModelServiceName() {
        return modelServiceName;
    }

    public void setModelServiceName(String modelServiceName) {
        this.modelServiceName = modelServiceName;
    }

    public OpsModelDeploymentInfo withApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
        return this;
    }

    /**
     * **参数解释：** 部署服务API地址。  **取值范围：** 合法的URL字符串。
     * @return apiUrl
     */
    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public OpsModelDeploymentInfo withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 部署服务状态。  **取值范围：** deploying：部署中，running：运行中，stopping：停止中，stopped：已停止，starting：启动中，fail：部署失败，deleting：删除中，access_fail：接入失败。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public OpsModelDeploymentInfo withCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 创建时间，单位：毫秒（13位时间戳）。  **取值范围：** 13位毫秒级时间戳。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return createdAt
     */
    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public OpsModelDeploymentInfo withFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }

    /**
     * **参数解释：** 部署错误信息。  **取值范围：** 无。
     * @return failReason
     */
    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsModelDeploymentInfo that = (OpsModelDeploymentInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.taskId, that.taskId)
            && Objects.equals(this.productId, that.productId) && Objects.equals(this.taskName, that.taskName)
            && Objects.equals(this.agent, that.agent) && Objects.equals(this.modelName, that.modelName)
            && Objects.equals(this.maServiceId, that.maServiceId)
            && Objects.equals(this.modelProviderId, that.modelProviderId)
            && Objects.equals(this.modelServiceId, that.modelServiceId)
            && Objects.equals(this.modelServiceName, that.modelServiceName) && Objects.equals(this.apiUrl, that.apiUrl)
            && Objects.equals(this.status, that.status) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.failReason, that.failReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            taskId,
            productId,
            taskName,
            agent,
            modelName,
            maServiceId,
            modelProviderId,
            modelServiceId,
            modelServiceName,
            apiUrl,
            status,
            createdAt,
            failReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsModelDeploymentInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
        sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
        sb.append("    maServiceId: ").append(toIndentedString(maServiceId)).append("\n");
        sb.append("    modelProviderId: ").append(toIndentedString(modelProviderId)).append("\n");
        sb.append("    modelServiceId: ").append(toIndentedString(modelServiceId)).append("\n");
        sb.append("    modelServiceName: ").append(toIndentedString(modelServiceName)).append("\n");
        sb.append("    apiUrl: ").append(toIndentedString(apiUrl)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
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
