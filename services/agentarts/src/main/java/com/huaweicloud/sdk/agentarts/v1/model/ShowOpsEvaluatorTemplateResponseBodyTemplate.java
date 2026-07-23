package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 模板信息包含完整评估器模板的所有详细属性和数据。 **取值范围：** 不涉及。 
 */
public class ShowOpsEvaluatorTemplateResponseBodyTemplate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_info")

    private OpsEvaluatorBaseInfo baseInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_content")

    private ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContent evaluatorContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_info")

    private ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorInfo evaluatorInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_type")

    private Integer evaluatorType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "popularity")

    private String popularity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private ShowOpsEvaluatorTemplateResponseBodyTemplateTags tags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    public ShowOpsEvaluatorTemplateResponseBodyTemplate withBaseInfo(OpsEvaluatorBaseInfo baseInfo) {
        this.baseInfo = baseInfo;
        return this;
    }

    public ShowOpsEvaluatorTemplateResponseBodyTemplate withBaseInfo(Consumer<OpsEvaluatorBaseInfo> baseInfoSetter) {
        if (this.baseInfo == null) {
            this.baseInfo = new OpsEvaluatorBaseInfo();
            baseInfoSetter.accept(this.baseInfo);
        }

        return this;
    }

    /**
     * Get baseInfo
     * @return baseInfo
     */
    public OpsEvaluatorBaseInfo getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(OpsEvaluatorBaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }

    public ShowOpsEvaluatorTemplateResponseBodyTemplate withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 描述用于详细说明评估器的功能、用途和应用场景。 **取值范围：** 描述性字符串。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowOpsEvaluatorTemplateResponseBodyTemplate withEvaluatorContent(
        ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContent evaluatorContent) {
        this.evaluatorContent = evaluatorContent;
        return this;
    }

    public ShowOpsEvaluatorTemplateResponseBodyTemplate withEvaluatorContent(
        Consumer<ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContent> evaluatorContentSetter) {
        if (this.evaluatorContent == null) {
            this.evaluatorContent = new ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContent();
            evaluatorContentSetter.accept(this.evaluatorContent);
        }

        return this;
    }

    /**
     * Get evaluatorContent
     * @return evaluatorContent
     */
    public ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContent getEvaluatorContent() {
        return evaluatorContent;
    }

    public void setEvaluatorContent(ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContent evaluatorContent) {
        this.evaluatorContent = evaluatorContent;
    }

    public ShowOpsEvaluatorTemplateResponseBodyTemplate withEvaluatorInfo(
        ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorInfo evaluatorInfo) {
        this.evaluatorInfo = evaluatorInfo;
        return this;
    }

    public ShowOpsEvaluatorTemplateResponseBodyTemplate withEvaluatorInfo(
        Consumer<ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorInfo> evaluatorInfoSetter) {
        if (this.evaluatorInfo == null) {
            this.evaluatorInfo = new ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorInfo();
            evaluatorInfoSetter.accept(this.evaluatorInfo);
        }

        return this;
    }

    /**
     * Get evaluatorInfo
     * @return evaluatorInfo
     */
    public ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorInfo getEvaluatorInfo() {
        return evaluatorInfo;
    }

    public void setEvaluatorInfo(ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorInfo evaluatorInfo) {
        this.evaluatorInfo = evaluatorInfo;
    }

    public ShowOpsEvaluatorTemplateResponseBodyTemplate withEvaluatorType(Integer evaluatorType) {
        this.evaluatorType = evaluatorType;
        return this;
    }

    /**
     * **参数解释：** 评估器的分类类型。 **取值范围：** 不涉及。 
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

    public ShowOpsEvaluatorTemplateResponseBodyTemplate withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 评估器的名字。 **取值范围：** 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowOpsEvaluatorTemplateResponseBodyTemplate withPopularity(String popularity) {
        this.popularity = popularity;
        return this;
    }

    /**
     * **参数解释：** 受欢迎程度分值。 **取值范围：** 字符串形式的数字。 
     * @return popularity
     */
    public String getPopularity() {
        return popularity;
    }

    public void setPopularity(String popularity) {
        this.popularity = popularity;
    }

    public ShowOpsEvaluatorTemplateResponseBodyTemplate withTags(
        ShowOpsEvaluatorTemplateResponseBodyTemplateTags tags) {
        this.tags = tags;
        return this;
    }

    public ShowOpsEvaluatorTemplateResponseBodyTemplate withTags(
        Consumer<ShowOpsEvaluatorTemplateResponseBodyTemplateTags> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ShowOpsEvaluatorTemplateResponseBodyTemplateTags();
            tagsSetter.accept(this.tags);
        }

        return this;
    }

    /**
     * Get tags
     * @return tags
     */
    public ShowOpsEvaluatorTemplateResponseBodyTemplateTags getTags() {
        return tags;
    }

    public void setTags(ShowOpsEvaluatorTemplateResponseBodyTemplateTags tags) {
        this.tags = tags;
    }

    public ShowOpsEvaluatorTemplateResponseBodyTemplate withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * **参数解释：** 评估器模板的唯一ID。 **取值范围：** 不涉及。 
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOpsEvaluatorTemplateResponseBodyTemplate that = (ShowOpsEvaluatorTemplateResponseBodyTemplate) obj;
        return Objects.equals(this.baseInfo, that.baseInfo) && Objects.equals(this.description, that.description)
            && Objects.equals(this.evaluatorContent, that.evaluatorContent)
            && Objects.equals(this.evaluatorInfo, that.evaluatorInfo)
            && Objects.equals(this.evaluatorType, that.evaluatorType) && Objects.equals(this.name, that.name)
            && Objects.equals(this.popularity, that.popularity) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.templateId, that.templateId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baseInfo,
            description,
            evaluatorContent,
            evaluatorInfo,
            evaluatorType,
            name,
            popularity,
            tags,
            templateId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOpsEvaluatorTemplateResponseBodyTemplate {\n");
        sb.append("    baseInfo: ").append(toIndentedString(baseInfo)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    evaluatorContent: ").append(toIndentedString(evaluatorContent)).append("\n");
        sb.append("    evaluatorInfo: ").append(toIndentedString(evaluatorInfo)).append("\n");
        sb.append("    evaluatorType: ").append(toIndentedString(evaluatorType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    popularity: ").append(toIndentedString(popularity)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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
