package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateInferDeploymentHpaResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_resource_id")

    private String targetResourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_resource_type")

    private String targetResourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_replicas")

    private Integer minReplicas;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_replicas")

    private Integer maxReplicas;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hpa_rules")

    private List<HpaRule> hpaRules = null;

    public UpdateInferDeploymentHpaResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 自动扩缩容策略ID **取值范围：** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateInferDeploymentHpaResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 自动扩缩容策略名称 **取值范围：** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateInferDeploymentHpaResponse withTargetResourceId(String targetResourceId) {
        this.targetResourceId = targetResourceId;
        return this;
    }

    /**
     * **参数解释：** 自动扩缩容策略绑定的目标ID **取值范围：** 实例组ID
     * @return targetResourceId
     */
    public String getTargetResourceId() {
        return targetResourceId;
    }

    public void setTargetResourceId(String targetResourceId) {
        this.targetResourceId = targetResourceId;
    }

    public UpdateInferDeploymentHpaResponse withTargetResourceType(String targetResourceType) {
        this.targetResourceType = targetResourceType;
        return this;
    }

    /**
     * **参数解释：** 自动扩缩容策略绑定的目标类型。 **取值范围：** - GROUP：实例组
     * @return targetResourceType
     */
    public String getTargetResourceType() {
        return targetResourceType;
    }

    public void setTargetResourceType(String targetResourceType) {
        this.targetResourceType = targetResourceType;
    }

    public UpdateInferDeploymentHpaResponse withMinReplicas(Integer minReplicas) {
        this.minReplicas = minReplicas;
        return this;
    }

    /**
     * **参数解释：** 自动扩缩容最小实例数。 **取值范围：** 1-128
     * minimum: 1
     * maximum: 128
     * @return minReplicas
     */
    public Integer getMinReplicas() {
        return minReplicas;
    }

    public void setMinReplicas(Integer minReplicas) {
        this.minReplicas = minReplicas;
    }

    public UpdateInferDeploymentHpaResponse withMaxReplicas(Integer maxReplicas) {
        this.maxReplicas = maxReplicas;
        return this;
    }

    /**
     * **参数解释：** 自动扩缩容最大实例数。 **取值范围：** 1-128
     * minimum: 1
     * maximum: 128
     * @return maxReplicas
     */
    public Integer getMaxReplicas() {
        return maxReplicas;
    }

    public void setMaxReplicas(Integer maxReplicas) {
        this.maxReplicas = maxReplicas;
    }

    public UpdateInferDeploymentHpaResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 参数解释：** 自动扩缩容策略状态。 **取值范围：** - INACTIVE：不启用 - ACTIVE：配置成功 - DELETED：已删除
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UpdateInferDeploymentHpaResponse withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * **参数解释：** 工作空间ID。 **取值范围：** - 0：默认空间ID - 由数字和小写字母组成的32位字符：其他空间ID，可参考[工作空间创建](CreateWorkspace.xml)
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public UpdateInferDeploymentHpaResponse withHpaRules(List<HpaRule> hpaRules) {
        this.hpaRules = hpaRules;
        return this;
    }

    public UpdateInferDeploymentHpaResponse addHpaRulesItem(HpaRule hpaRulesItem) {
        if (this.hpaRules == null) {
            this.hpaRules = new ArrayList<>();
        }
        this.hpaRules.add(hpaRulesItem);
        return this;
    }

    public UpdateInferDeploymentHpaResponse withHpaRules(Consumer<List<HpaRule>> hpaRulesSetter) {
        if (this.hpaRules == null) {
            this.hpaRules = new ArrayList<>();
        }
        hpaRulesSetter.accept(this.hpaRules);
        return this;
    }

    /**
     * **参数解释：** 自动扩缩容规则列表
     * @return hpaRules
     */
    public List<HpaRule> getHpaRules() {
        return hpaRules;
    }

    public void setHpaRules(List<HpaRule> hpaRules) {
        this.hpaRules = hpaRules;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateInferDeploymentHpaResponse that = (UpdateInferDeploymentHpaResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.targetResourceId, that.targetResourceId)
            && Objects.equals(this.targetResourceType, that.targetResourceType)
            && Objects.equals(this.minReplicas, that.minReplicas) && Objects.equals(this.maxReplicas, that.maxReplicas)
            && Objects.equals(this.status, that.status) && Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.hpaRules, that.hpaRules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            targetResourceId,
            targetResourceType,
            minReplicas,
            maxReplicas,
            status,
            workspaceId,
            hpaRules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateInferDeploymentHpaResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    targetResourceId: ").append(toIndentedString(targetResourceId)).append("\n");
        sb.append("    targetResourceType: ").append(toIndentedString(targetResourceType)).append("\n");
        sb.append("    minReplicas: ").append(toIndentedString(minReplicas)).append("\n");
        sb.append("    maxReplicas: ").append(toIndentedString(maxReplicas)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    hpaRules: ").append(toIndentedString(hpaRules)).append("\n");
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
