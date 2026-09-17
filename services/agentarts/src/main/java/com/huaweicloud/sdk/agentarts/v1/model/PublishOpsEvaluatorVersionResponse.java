package com.huaweicloud.sdk.agentarts.v1.model;

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
public class PublishOpsEvaluatorVersionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_type")

    private Integer evaluatorType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_version")

    private EvaluationOpsCurrentVersion currentVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<OpsTmsTag> tags = null;

    public PublishOpsEvaluatorVersionResponse withEvaluatorType(Integer evaluatorType) {
        this.evaluatorType = evaluatorType;
        return this;
    }

    /**
     * **参数解释：** 评估器的核心执行模式。 **约束限制：** 不涉及。 **取值范围：** - 1: 模型评估器（模型评估器，基于大语言模型进行智能评判） - 2: 代码评估器（代码评估器，基于预设脚本逻辑进行规则判定） - 3: 自适应评估器（自适应评估模式，可根据上下文与历史结果动态调整评判规则） **默认取值：** 不涉及。 
     * @return evaluatorType
     */
    public Integer getEvaluatorType() {
        return evaluatorType;
    }

    public void setEvaluatorType(Integer evaluatorType) {
        this.evaluatorType = evaluatorType;
    }

    public PublishOpsEvaluatorVersionResponse withCurrentVersion(EvaluationOpsCurrentVersion currentVersion) {
        this.currentVersion = currentVersion;
        return this;
    }

    public PublishOpsEvaluatorVersionResponse withCurrentVersion(
        Consumer<EvaluationOpsCurrentVersion> currentVersionSetter) {
        if (this.currentVersion == null) {
            this.currentVersion = new EvaluationOpsCurrentVersion();
            currentVersionSetter.accept(this.currentVersion);
        }

        return this;
    }

    /**
     * Get currentVersion
     * @return currentVersion
     */
    public EvaluationOpsCurrentVersion getCurrentVersion() {
        return currentVersion;
    }

    public void setCurrentVersion(EvaluationOpsCurrentVersion currentVersion) {
        this.currentVersion = currentVersion;
    }

    public PublishOpsEvaluatorVersionResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 评估器的业务名称。 **约束限制：** 不涉及。 **取值范围：** 由中英文、数字、下划线（_）、中划线（-）组成的字符串，长度为0~10000个字符。 **默认取值：** 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PublishOpsEvaluatorVersionResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 对该评估器的功能逻辑和判定准则的详细文字补充。 **约束限制：** 不涉及。 **取值范围：** 任意字符串，长度为0~10000个字符。 **默认取值：** 不涉及。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PublishOpsEvaluatorVersionResponse withTags(List<OpsTmsTag> tags) {
        this.tags = tags;
        return this;
    }

    public PublishOpsEvaluatorVersionResponse addTagsItem(OpsTmsTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public PublishOpsEvaluatorVersionResponse withTags(Consumer<List<OpsTmsTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释：** 创建评估器时绑定的TMS标签列表。数组内每个元素为OpsTmsTag对象，包含标签的键值信息。 **约束限制：** 数组元素最小数量为0，最大数量为50。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
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
        PublishOpsEvaluatorVersionResponse that = (PublishOpsEvaluatorVersionResponse) obj;
        return Objects.equals(this.evaluatorType, that.evaluatorType)
            && Objects.equals(this.currentVersion, that.currentVersion) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(evaluatorType, currentVersion, name, description, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublishOpsEvaluatorVersionResponse {\n");
        sb.append("    evaluatorType: ").append(toIndentedString(evaluatorType)).append("\n");
        sb.append("    currentVersion: ").append(toIndentedString(currentVersion)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
