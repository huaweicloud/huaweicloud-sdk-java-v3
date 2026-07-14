package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建hra策略请求体
 */
public class CreateHraRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hra_rules")

    private List<HraRuleCreateRequest> hraRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disable")

    private Boolean disable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_replicas")

    private Integer minReplicas;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_replicas")

    private Integer maxReplicas;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scale_window")

    private Integer scaleWindow;

    public CreateHraRequestBody withWorkspaceId(String workspaceId) {
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

    public CreateHraRequestBody withHraRules(List<HraRuleCreateRequest> hraRules) {
        this.hraRules = hraRules;
        return this;
    }

    public CreateHraRequestBody addHraRulesItem(HraRuleCreateRequest hraRulesItem) {
        if (this.hraRules == null) {
            this.hraRules = new ArrayList<>();
        }
        this.hraRules.add(hraRulesItem);
        return this;
    }

    public CreateHraRequestBody withHraRules(Consumer<List<HraRuleCreateRequest>> hraRulesSetter) {
        if (this.hraRules == null) {
            this.hraRules = new ArrayList<>();
        }
        hraRulesSetter.accept(this.hraRules);
        return this;
    }

    /**
     * **参数解释：** HRA规则列表。 **约束限制：** 不涉及。
     * @return hraRules
     */
    public List<HraRuleCreateRequest> getHraRules() {
        return hraRules;
    }

    public void setHraRules(List<HraRuleCreateRequest> hraRules) {
        this.hraRules = hraRules;
    }

    public CreateHraRequestBody withDisable(Boolean disable) {
        this.disable = disable;
        return this;
    }

    /**
     * **参数解释：** 用户控制的启用/禁用开关。 **取值范围：** true表示禁用，false表示启用 **约束限制：** 不涉及。 **默认取值：** 不涉及。
     * @return disable
     */
    public Boolean getDisable() {
        return disable;
    }

    public void setDisable(Boolean disable) {
        this.disable = disable;
    }

    public CreateHraRequestBody withMinReplicas(Integer minReplicas) {
        this.minReplicas = minReplicas;
        return this;
    }

    /**
     * **参数解释：** 最小副本数，由于当前版本不会进行实质扩缩，因此该配置值无效。 **取值范围：** 1~128。
     * @return minReplicas
     */
    public Integer getMinReplicas() {
        return minReplicas;
    }

    public void setMinReplicas(Integer minReplicas) {
        this.minReplicas = minReplicas;
    }

    public CreateHraRequestBody withMaxReplicas(Integer maxReplicas) {
        this.maxReplicas = maxReplicas;
        return this;
    }

    /**
     * **参数解释：** 最大副本数，由于当前版本不会进行实质扩缩，因此该配置值无效。 **取值范围：** 1~128。
     * @return maxReplicas
     */
    public Integer getMaxReplicas() {
        return maxReplicas;
    }

    public void setMaxReplicas(Integer maxReplicas) {
        this.maxReplicas = maxReplicas;
    }

    public CreateHraRequestBody withScaleWindow(Integer scaleWindow) {
        this.scaleWindow = scaleWindow;
        return this;
    }

    /**
     * **参数解释：** 扩缩容时间窗，由于当前版本不会进行实质扩缩，因此该配置值无效。 **取值范围：** 不涉及。
     * @return scaleWindow
     */
    public Integer getScaleWindow() {
        return scaleWindow;
    }

    public void setScaleWindow(Integer scaleWindow) {
        this.scaleWindow = scaleWindow;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateHraRequestBody that = (CreateHraRequestBody) obj;
        return Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.hraRules, that.hraRules)
            && Objects.equals(this.disable, that.disable) && Objects.equals(this.minReplicas, that.minReplicas)
            && Objects.equals(this.maxReplicas, that.maxReplicas) && Objects.equals(this.scaleWindow, that.scaleWindow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId, hraRules, disable, minReplicas, maxReplicas, scaleWindow);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateHraRequestBody {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    hraRules: ").append(toIndentedString(hraRules)).append("\n");
        sb.append("    disable: ").append(toIndentedString(disable)).append("\n");
        sb.append("    minReplicas: ").append(toIndentedString(minReplicas)).append("\n");
        sb.append("    maxReplicas: ").append(toIndentedString(maxReplicas)).append("\n");
        sb.append("    scaleWindow: ").append(toIndentedString(scaleWindow)).append("\n");
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
