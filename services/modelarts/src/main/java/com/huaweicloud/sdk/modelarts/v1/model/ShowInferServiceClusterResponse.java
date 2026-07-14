package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowInferServiceClusterResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logic_cluster_id")

    private String logicClusterId;

    /**
     * **参数解释：** 资源当前状态。 **取值范围：** - ACTIVE ：开启。 - PENDING ：待处理。 - INITIALIZING ：初始化中。 - INITIALIZE_FAILED ：初始化失败。 - DELETED ：已删除。 - DELETING ：删除中。 - DELETE_FAILED ：删除失败。 - MIGRATING : 迁移中。
     */
    public static final class StatusEnum {

        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final StatusEnum ACTIVE = new StatusEnum("ACTIVE");

        /**
         * Enum PENDING for value: "PENDING"
         */
        public static final StatusEnum PENDING = new StatusEnum("PENDING");

        /**
         * Enum INITIALIZING for value: "INITIALIZING"
         */
        public static final StatusEnum INITIALIZING = new StatusEnum("INITIALIZING");

        /**
         * Enum INITIALIZE_FAILED for value: "INITIALIZE_FAILED"
         */
        public static final StatusEnum INITIALIZE_FAILED = new StatusEnum("INITIALIZE_FAILED");

        /**
         * Enum DELETED for value: "DELETED"
         */
        public static final StatusEnum DELETED = new StatusEnum("DELETED");

        /**
         * Enum DELETING for value: "DELETING"
         */
        public static final StatusEnum DELETING = new StatusEnum("DELETING");

        /**
         * Enum DELETE_FAILED for value: "DELETE_FAILED"
         */
        public static final StatusEnum DELETE_FAILED = new StatusEnum("DELETE_FAILED");

        /**
         * Enum MIGRATING for value: "MIGRATING"
         */
        public static final StatusEnum MIGRATING = new StatusEnum("MIGRATING");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("ACTIVE", ACTIVE);
            map.put("PENDING", PENDING);
            map.put("INITIALIZING", INITIALIZING);
            map.put("INITIALIZE_FAILED", INITIALIZE_FAILED);
            map.put("DELETED", DELETED);
            map.put("DELETING", DELETING);
            map.put("DELETE_FAILED", DELETE_FAILED);
            map.put("MIGRATING", MIGRATING);
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
    @JsonProperty(value = "pool_id")

    private String poolId;

    /**
     * **参数解释：** 专属池类型。 **取值范围：** - MANAGED ：公共。 - MANAGED_ROMA ：公共。 - DEDICATED ：专属。 - DEDICATED_ROMA ：专属。
     */
    public static final class TypeEnum {

        /**
         * Enum MANAGED for value: "MANAGED"
         */
        public static final TypeEnum MANAGED = new TypeEnum("MANAGED");

        /**
         * Enum MANAGED_ROMA for value: "MANAGED_ROMA"
         */
        public static final TypeEnum MANAGED_ROMA = new TypeEnum("MANAGED_ROMA");

        /**
         * Enum DEDICATED for value: "DEDICATED"
         */
        public static final TypeEnum DEDICATED = new TypeEnum("DEDICATED");

        /**
         * Enum DEDICATED_ROMA for value: "DEDICATED_ROMA"
         */
        public static final TypeEnum DEDICATED_ROMA = new TypeEnum("DEDICATED_ROMA");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("MANAGED", MANAGED);
            map.put("MANAGED_ROMA", MANAGED_ROMA);
            map.put("DEDICATED", DEDICATED);
            map.put("DEDICATED_ROMA", DEDICATED_ROMA);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_categories")

    private List<String> resourceCategories = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at")

    private Long createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_at")

    private Long updateAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavors")

    private List<InferFlavor> flavors = null;

    public ShowInferServiceClusterResponse withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * **参数解释：** 工作空间ID。未创建工作空间时默认值为“0”，存在创建并使用的工作空间，以实际取值为准。 **取值范围：** 不涉及。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ShowInferServiceClusterResponse withLogicClusterId(String logicClusterId) {
        this.logicClusterId = logicClusterId;
        return this;
    }

    /**
     * **参数解释：** 资源池cceID。 **取值范围：** 不涉及。
     * @return logicClusterId
     */
    public String getLogicClusterId() {
        return logicClusterId;
    }

    public void setLogicClusterId(String logicClusterId) {
        this.logicClusterId = logicClusterId;
    }

    public ShowInferServiceClusterResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 资源当前状态。 **取值范围：** - ACTIVE ：开启。 - PENDING ：待处理。 - INITIALIZING ：初始化中。 - INITIALIZE_FAILED ：初始化失败。 - DELETED ：已删除。 - DELETING ：删除中。 - DELETE_FAILED ：删除失败。 - MIGRATING : 迁移中。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ShowInferServiceClusterResponse withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /**
     * **参数解释：** 专属资源池ID。 **取值范围：** 不涉及。
     * @return poolId
     */
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public ShowInferServiceClusterResponse withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 专属池类型。 **取值范围：** - MANAGED ：公共。 - MANAGED_ROMA ：公共。 - DEDICATED ：专属。 - DEDICATED_ROMA ：专属。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ShowInferServiceClusterResponse withResourceCategories(List<String> resourceCategories) {
        this.resourceCategories = resourceCategories;
        return this;
    }

    public ShowInferServiceClusterResponse addResourceCategoriesItem(String resourceCategoriesItem) {
        if (this.resourceCategories == null) {
            this.resourceCategories = new ArrayList<>();
        }
        this.resourceCategories.add(resourceCategoriesItem);
        return this;
    }

    public ShowInferServiceClusterResponse withResourceCategories(Consumer<List<String>> resourceCategoriesSetter) {
        if (this.resourceCategories == null) {
            this.resourceCategories = new ArrayList<>();
        }
        resourceCategoriesSetter.accept(this.resourceCategories);
        return this;
    }

    /**
     * **参数解释：** 资源池类型。
     * @return resourceCategories
     */
    public List<String> getResourceCategories() {
        return resourceCategories;
    }

    public void setResourceCategories(List<String> resourceCategories) {
        this.resourceCategories = resourceCategories;
    }

    public ShowInferServiceClusterResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释：** [用户项目ID](tag:hws,hws_hk,fcs,fcs_super)[资源空间ID](tag:hcs,hcs_sm)。获取方法请参见[[获取项目ID和名称](modelarts_03_0147.xml)](tag:hws,hws_hk,fcs,fcs_super)[[获取资源空间ID和名称](modelarts_03_0147.xml)](tag:hcs,hcs_sm)。 **取值范围：** 不涉及。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowInferServiceClusterResponse withCreateAt(Long createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * **参数解释：** 资源池启用的时间，UTC毫秒。 **取值范围：** 不涉及。
     * @return createAt
     */
    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public ShowInferServiceClusterResponse withUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /**
     * **参数解释：** 资源池最后更新的时间，UTC毫秒。 **取值范围：** 不涉及。
     * @return updateAt
     */
    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }

    public ShowInferServiceClusterResponse withFlavors(List<InferFlavor> flavors) {
        this.flavors = flavors;
        return this;
    }

    public ShowInferServiceClusterResponse addFlavorsItem(InferFlavor flavorsItem) {
        if (this.flavors == null) {
            this.flavors = new ArrayList<>();
        }
        this.flavors.add(flavorsItem);
        return this;
    }

    public ShowInferServiceClusterResponse withFlavors(Consumer<List<InferFlavor>> flavorsSetter) {
        if (this.flavors == null) {
            this.flavors = new ArrayList<>();
        }
        flavorsSetter.accept(this.flavors);
        return this;
    }

    /**
     * **参数解释：** 当前专属池支持的规格。
     * @return flavors
     */
    public List<InferFlavor> getFlavors() {
        return flavors;
    }

    public void setFlavors(List<InferFlavor> flavors) {
        this.flavors = flavors;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInferServiceClusterResponse that = (ShowInferServiceClusterResponse) obj;
        return Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.logicClusterId, that.logicClusterId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.poolId, that.poolId) && Objects.equals(this.type, that.type)
            && Objects.equals(this.resourceCategories, that.resourceCategories)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.createAt, that.createAt)
            && Objects.equals(this.updateAt, that.updateAt) && Objects.equals(this.flavors, that.flavors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId,
            logicClusterId,
            status,
            poolId,
            type,
            resourceCategories,
            projectId,
            createAt,
            updateAt,
            flavors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInferServiceClusterResponse {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    logicClusterId: ").append(toIndentedString(logicClusterId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    resourceCategories: ").append(toIndentedString(resourceCategories)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
        sb.append("    flavors: ").append(toIndentedString(flavors)).append("\n");
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
