package com.huaweicloud.sdk.config.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 合规规则包详情。
 */
public class ConformancePack {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stack_id")

    private String stackId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stack_name")

    private String stackName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deployment_id")

    private String deploymentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    /**
     * 合规规则包部署状态。
     */
    public static final class StatusEnum {

        /**
         * Enum CREATE_SUCCESSFUL for value: "CREATE_SUCCESSFUL"
         */
        public static final StatusEnum CREATE_SUCCESSFUL = new StatusEnum("CREATE_SUCCESSFUL");

        /**
         * Enum CREATE_IN_PROGRESS for value: "CREATE_IN_PROGRESS"
         */
        public static final StatusEnum CREATE_IN_PROGRESS = new StatusEnum("CREATE_IN_PROGRESS");

        /**
         * Enum CREATE_FAILED for value: "CREATE_FAILED"
         */
        public static final StatusEnum CREATE_FAILED = new StatusEnum("CREATE_FAILED");

        /**
         * Enum DELETE_IN_PROGRESS for value: "DELETE_IN_PROGRESS"
         */
        public static final StatusEnum DELETE_IN_PROGRESS = new StatusEnum("DELETE_IN_PROGRESS");

        /**
         * Enum DELETE_FAILED for value: "DELETE_FAILED"
         */
        public static final StatusEnum DELETE_FAILED = new StatusEnum("DELETE_FAILED");

        /**
         * Enum ROLLBACK_SUCCESSFUL for value: "ROLLBACK_SUCCESSFUL"
         */
        public static final StatusEnum ROLLBACK_SUCCESSFUL = new StatusEnum("ROLLBACK_SUCCESSFUL");

        /**
         * Enum ROLLBACK_IN_PROGRESS for value: "ROLLBACK_IN_PROGRESS"
         */
        public static final StatusEnum ROLLBACK_IN_PROGRESS = new StatusEnum("ROLLBACK_IN_PROGRESS");

        /**
         * Enum ROLLBACK_FAILED for value: "ROLLBACK_FAILED"
         */
        public static final StatusEnum ROLLBACK_FAILED = new StatusEnum("ROLLBACK_FAILED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("CREATE_SUCCESSFUL", CREATE_SUCCESSFUL);
            map.put("CREATE_IN_PROGRESS", CREATE_IN_PROGRESS);
            map.put("CREATE_FAILED", CREATE_FAILED);
            map.put("DELETE_IN_PROGRESS", DELETE_IN_PROGRESS);
            map.put("DELETE_FAILED", DELETE_FAILED);
            map.put("ROLLBACK_SUCCESSFUL", ROLLBACK_SUCCESSFUL);
            map.put("ROLLBACK_IN_PROGRESS", ROLLBACK_IN_PROGRESS);
            map.put("ROLLBACK_FAILED", ROLLBACK_FAILED);
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
    @JsonProperty(value = "error_message")

    private String errorMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vars_structure")

    private List<VarsStructure> varsStructure = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private String createdBy;

    public ConformancePack withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 合规规则包ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ConformancePack withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 合规规则包名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ConformancePack withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    /**
     * 资源栈（stack）的唯一ID。
     * @return stackId
     */
    public String getStackId() {
        return stackId;
    }

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    public ConformancePack withStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }

    /**
     * 资源栈（stack）的名称。
     * @return stackName
     */
    public String getStackName() {
        return stackName;
    }

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    public ConformancePack withDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * 部署ID。
     * @return deploymentId
     */
    public String getDeploymentId() {
        return deploymentId;
    }

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    public ConformancePack withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 合规规则包创建时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ConformancePack withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 合规规则包更新时间。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ConformancePack withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 合规规则包部署状态。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ConformancePack withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * 部署或删除合规规则包错误时的错误信息
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public ConformancePack withVarsStructure(List<VarsStructure> varsStructure) {
        this.varsStructure = varsStructure;
        return this;
    }

    public ConformancePack addVarsStructureItem(VarsStructure varsStructureItem) {
        if (this.varsStructure == null) {
            this.varsStructure = new ArrayList<>();
        }
        this.varsStructure.add(varsStructureItem);
        return this;
    }

    public ConformancePack withVarsStructure(Consumer<List<VarsStructure>> varsStructureSetter) {
        if (this.varsStructure == null) {
            this.varsStructure = new ArrayList<>();
        }
        varsStructureSetter.accept(this.varsStructure);
        return this;
    }

    /**
     * 合规规则包参数。
     * @return varsStructure
     */
    public List<VarsStructure> getVarsStructure() {
        return varsStructure;
    }

    public void setVarsStructure(List<VarsStructure> varsStructure) {
        this.varsStructure = varsStructure;
    }

    public ConformancePack withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * 创建者
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConformancePack that = (ConformancePack) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.stackId, that.stackId) && Objects.equals(this.stackName, that.stackName)
            && Objects.equals(this.deploymentId, that.deploymentId) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.status, that.status)
            && Objects.equals(this.errorMessage, that.errorMessage)
            && Objects.equals(this.varsStructure, that.varsStructure) && Objects.equals(this.createdBy, that.createdBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            stackId,
            stackName,
            deploymentId,
            createdAt,
            updatedAt,
            status,
            errorMessage,
            varsStructure,
            createdBy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConformancePack {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    stackId: ").append(toIndentedString(stackId)).append("\n");
        sb.append("    stackName: ").append(toIndentedString(stackName)).append("\n");
        sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    varsStructure: ").append(toIndentedString(varsStructure)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
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
