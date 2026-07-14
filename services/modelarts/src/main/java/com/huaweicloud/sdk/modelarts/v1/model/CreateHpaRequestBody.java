package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建定时扩缩容策略请求体
 */
public class CreateHpaRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_resource_id")

    private String targetResourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_resource_type")

    private String targetResourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hpa_rules")

    private List<HpaRules> hpaRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    public CreateHpaRequestBody withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 自动扩缩容类型。 **取值范围：** - CRON_HPA：定时扩缩容策略 - METRIC_HPA：指标扩缩容策略 **约束限制：** 不涉及。 **默认取值：** 不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CreateHpaRequestBody withTargetResourceId(String targetResourceId) {
        this.targetResourceId = targetResourceId;
        return this;
    }

    /**
     * **参数解释：** 自动扩缩容策略绑定的目标ID **取值范围：** 实例组ID **约束限制：** 不涉及。 **默认取值：** 不涉及。
     * @return targetResourceId
     */
    public String getTargetResourceId() {
        return targetResourceId;
    }

    public void setTargetResourceId(String targetResourceId) {
        this.targetResourceId = targetResourceId;
    }

    public CreateHpaRequestBody withTargetResourceType(String targetResourceType) {
        this.targetResourceType = targetResourceType;
        return this;
    }

    /**
     * **参数解释：** 自动扩缩容策略绑定的目标类型。 **取值范围：** - GROUP：实例组 **约束限制：** 不涉及。 **默认取值：** 不涉及。
     * @return targetResourceType
     */
    public String getTargetResourceType() {
        return targetResourceType;
    }

    public void setTargetResourceType(String targetResourceType) {
        this.targetResourceType = targetResourceType;
    }

    public CreateHpaRequestBody withHpaRules(List<HpaRules> hpaRules) {
        this.hpaRules = hpaRules;
        return this;
    }

    public CreateHpaRequestBody addHpaRulesItem(HpaRules hpaRulesItem) {
        if (this.hpaRules == null) {
            this.hpaRules = new ArrayList<>();
        }
        this.hpaRules.add(hpaRulesItem);
        return this;
    }

    public CreateHpaRequestBody withHpaRules(Consumer<List<HpaRules>> hpaRulesSetter) {
        if (this.hpaRules == null) {
            this.hpaRules = new ArrayList<>();
        }
        hpaRulesSetter.accept(this.hpaRules);
        return this;
    }

    /**
     * **参数解释：** 自动扩缩容规则。 **约束限制：** 不涉及。
     * @return hpaRules
     */
    public List<HpaRules> getHpaRules() {
        return hpaRules;
    }

    public void setHpaRules(List<HpaRules> hpaRules) {
        this.hpaRules = hpaRules;
    }

    public CreateHpaRequestBody withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * **参数解释：** 工作空间ID。 **取值范围：** - 0：默认空间ID - 由数字和小写字母组成的32位字符：其他空间ID，可参考[工作空间创建](CreateWorkspace.xml) **约束限制：** 不涉及。 **默认取值：** 不涉及。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateHpaRequestBody that = (CreateHpaRequestBody) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.targetResourceId, that.targetResourceId)
            && Objects.equals(this.targetResourceType, that.targetResourceType)
            && Objects.equals(this.hpaRules, that.hpaRules) && Objects.equals(this.workspaceId, that.workspaceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, targetResourceId, targetResourceType, hpaRules, workspaceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateHpaRequestBody {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    targetResourceId: ").append(toIndentedString(targetResourceId)).append("\n");
        sb.append("    targetResourceType: ").append(toIndentedString(targetResourceType)).append("\n");
        sb.append("    hpaRules: ").append(toIndentedString(hpaRules)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
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
