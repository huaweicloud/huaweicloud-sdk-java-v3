package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改定时扩缩容策略请求体
 */
public class UpdateHpaRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hpa_rules")

    private List<HpaRules> hpaRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    public UpdateHpaRequestBody withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 自动扩缩容策略绑定的目标ID **取值范围：** 实例组ID **约束限制：** 不涉及。 **默认取值：** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateHpaRequestBody withHpaRules(List<HpaRules> hpaRules) {
        this.hpaRules = hpaRules;
        return this;
    }

    public UpdateHpaRequestBody addHpaRulesItem(HpaRules hpaRulesItem) {
        if (this.hpaRules == null) {
            this.hpaRules = new ArrayList<>();
        }
        this.hpaRules.add(hpaRulesItem);
        return this;
    }

    public UpdateHpaRequestBody withHpaRules(Consumer<List<HpaRules>> hpaRulesSetter) {
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

    public UpdateHpaRequestBody withWorkspaceId(String workspaceId) {
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
        UpdateHpaRequestBody that = (UpdateHpaRequestBody) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.hpaRules, that.hpaRules)
            && Objects.equals(this.workspaceId, that.workspaceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, hpaRules, workspaceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateHpaRequestBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
