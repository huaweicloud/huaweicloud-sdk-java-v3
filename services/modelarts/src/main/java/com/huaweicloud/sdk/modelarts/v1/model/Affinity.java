package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 节点亲和类型。 **约束限制：** AFFINITY/ANTI_AFFINITY
 */
public class Affinity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affinity_type")

    private String affinityType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "required")

    private Boolean required;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "selection_mode")

    private String selectionMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "targets")

    private Map<String, String> targets = null;

    public Affinity withAffinityType(String affinityType) {
        this.affinityType = affinityType;
        return this;
    }

    /**
     * **参数解释：** 节点亲和类型。 **约束限制：** 不涉及。 **取值范围：** - AFFINITY：亲和。 - ANTI_AFFINITY：反亲和。 **默认取值：** 不涉及。
     * @return affinityType
     */
    public String getAffinityType() {
        return affinityType;
    }

    public void setAffinityType(String affinityType) {
        this.affinityType = affinityType;
    }

    public Affinity withRequired(Boolean required) {
        this.required = required;
        return this;
    }

    /**
     * **参数解释：** 是否设置强亲和。 **约束限制：** 不涉及。 **取值范围：** - true：设置强亲和。 - false：不设置强亲和。 **默认取值：** 不涉及。
     * @return required
     */
    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public Affinity withSelectionMode(String selectionMode) {
        this.selectionMode = selectionMode;
        return this;
    }

    /**
     * **参数解释：** 选择节点方式。 **约束限制：** 不涉及。 **取值范围：** IP **默认取值：** 不涉及。
     * @return selectionMode
     */
    public String getSelectionMode() {
        return selectionMode;
    }

    public void setSelectionMode(String selectionMode) {
        this.selectionMode = selectionMode;
    }

    public Affinity withTargets(Map<String, String> targets) {
        this.targets = targets;
        return this;
    }

    public Affinity putTargetsItem(String key, String targetsItem) {
        if (this.targets == null) {
            this.targets = new HashMap<>();
        }
        this.targets.put(key, targetsItem);
        return this;
    }

    public Affinity withTargets(Consumer<Map<String, String>> targetsSetter) {
        if (this.targets == null) {
            this.targets = new HashMap<>();
        }
        targetsSetter.accept(this.targets);
        return this;
    }

    /**
     * **参数解释：** 通过上述方式选择的列表，长度不能超过20。 **约束限制：** 不涉及。
     * @return targets
     */
    public Map<String, String> getTargets() {
        return targets;
    }

    public void setTargets(Map<String, String> targets) {
        this.targets = targets;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Affinity that = (Affinity) obj;
        return Objects.equals(this.affinityType, that.affinityType) && Objects.equals(this.required, that.required)
            && Objects.equals(this.selectionMode, that.selectionMode) && Objects.equals(this.targets, that.targets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(affinityType, required, selectionMode, targets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Affinity {\n");
        sb.append("    affinityType: ").append(toIndentedString(affinityType)).append("\n");
        sb.append("    required: ").append(toIndentedString(required)).append("\n");
        sb.append("    selectionMode: ").append(toIndentedString(selectionMode)).append("\n");
        sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
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
