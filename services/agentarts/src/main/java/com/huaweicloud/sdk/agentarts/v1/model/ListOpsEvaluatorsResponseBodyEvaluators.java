package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListOpsEvaluatorsResponseBodyEvaluators
 */
public class ListOpsEvaluatorsResponseBodyEvaluators {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_id")

    private String evaluatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_type")

    private Integer evaluatorType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "box_type")

    private String boxType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "builtin")

    private Boolean builtin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_version")

    private String latestVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "draft_submitted")

    private Boolean draftSubmitted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<OpsTmsTag> tags = null;

    public ListOpsEvaluatorsResponseBodyEvaluators withEvaluatorId(String evaluatorId) {
        this.evaluatorId = evaluatorId;
        return this;
    }

    /**
     * **参数解释** 评估器的唯一标识符。 **取值范围** 系统生成的ID字符串。 
     * @return evaluatorId
     */
    public String getEvaluatorId() {
        return evaluatorId;
    }

    public void setEvaluatorId(String evaluatorId) {
        this.evaluatorId = evaluatorId;
    }

    public ListOpsEvaluatorsResponseBodyEvaluators withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释** 评估器的名称，用于界面展示和检索。 **取值范围** 任意字符串。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListOpsEvaluatorsResponseBodyEvaluators withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释** 评估器的功能描述或业务用途说明。 **取值范围** 任意字符串。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ListOpsEvaluatorsResponseBodyEvaluators withEvaluatorType(Integer evaluatorType) {
        this.evaluatorType = evaluatorType;
        return this;
    }

    /**
     * **参数解释** 评估器的类型编码，用于区分不同的逻辑实现（如自定义评估器或系统评估器）。 **取值范围** 整型编码。 
     * minimum: 0
     * maximum: 2147483647
     * @return evaluatorType
     */
    public Integer getEvaluatorType() {
        return evaluatorType;
    }

    public void setEvaluatorType(Integer evaluatorType) {
        this.evaluatorType = evaluatorType;
    }

    public ListOpsEvaluatorsResponseBodyEvaluators withBoxType(String boxType) {
        this.boxType = boxType;
        return this;
    }

    /**
     * **参数解释** 评估器的可见性或黑白盒属性。 **取值范围** White (白盒), Black (黑盒)。 
     * @return boxType
     */
    public String getBoxType() {
        return boxType;
    }

    public void setBoxType(String boxType) {
        this.boxType = boxType;
    }

    public ListOpsEvaluatorsResponseBodyEvaluators withBuiltin(Boolean builtin) {
        this.builtin = builtin;
        return this;
    }

    /**
     * **参数解释** 标识该评估器是否为系统预置。 **取值范围** true (是), false (否)。 
     * @return builtin
     */
    public Boolean getBuiltin() {
        return builtin;
    }

    public void setBuiltin(Boolean builtin) {
        this.builtin = builtin;
    }

    public ListOpsEvaluatorsResponseBodyEvaluators withLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }

    /**
     * **参数解释** 评估器的最新发布的版本号。 **取值范围** 如 0.0.2 格式的版本字符串。 
     * @return latestVersion
     */
    public String getLatestVersion() {
        return latestVersion;
    }

    public void setLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
    }

    public ListOpsEvaluatorsResponseBodyEvaluators withDraftSubmitted(Boolean draftSubmitted) {
        this.draftSubmitted = draftSubmitted;
        return this;
    }

    /**
     * **参数解释** 标识当前的草稿内容是否已经提交。 **取值范围** true (已提交), false (未提交)。 
     * @return draftSubmitted
     */
    public Boolean getDraftSubmitted() {
        return draftSubmitted;
    }

    public void setDraftSubmitted(Boolean draftSubmitted) {
        this.draftSubmitted = draftSubmitted;
    }

    public ListOpsEvaluatorsResponseBodyEvaluators withTags(List<OpsTmsTag> tags) {
        this.tags = tags;
        return this;
    }

    public ListOpsEvaluatorsResponseBodyEvaluators addTagsItem(OpsTmsTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ListOpsEvaluatorsResponseBodyEvaluators withTags(Consumer<List<OpsTmsTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释** 评估器绑定的TMS标签列表。数组元素引用OpsTmsTag对象。 **约束限制** 不涉及。 **取值范围** 不涉及。 
     * @return tags
     */
    public List<OpsTmsTag> getTags() {
        return tags;
    }

    public void setTags(List<OpsTmsTag> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOpsEvaluatorsResponseBodyEvaluators that = (ListOpsEvaluatorsResponseBodyEvaluators) obj;
        return Objects.equals(this.evaluatorId, that.evaluatorId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.evaluatorType, that.evaluatorType) && Objects.equals(this.boxType, that.boxType)
            && Objects.equals(this.builtin, that.builtin) && Objects.equals(this.latestVersion, that.latestVersion)
            && Objects.equals(this.draftSubmitted, that.draftSubmitted) && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(evaluatorId, name, description, evaluatorType, boxType, builtin, latestVersion, draftSubmitted, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsEvaluatorsResponseBodyEvaluators {\n");
        sb.append("    evaluatorId: ").append(toIndentedString(evaluatorId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    evaluatorType: ").append(toIndentedString(evaluatorType)).append("\n");
        sb.append("    boxType: ").append(toIndentedString(boxType)).append("\n");
        sb.append("    builtin: ").append(toIndentedString(builtin)).append("\n");
        sb.append("    latestVersion: ").append(toIndentedString(latestVersion)).append("\n");
        sb.append("    draftSubmitted: ").append(toIndentedString(draftSubmitted)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
