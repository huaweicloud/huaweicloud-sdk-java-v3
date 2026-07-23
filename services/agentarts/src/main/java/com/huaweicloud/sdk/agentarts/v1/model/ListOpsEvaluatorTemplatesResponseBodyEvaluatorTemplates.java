package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 单个评估器模板的详细定义。 **取值范围：** 不涉及。 
 */
public class ListOpsEvaluatorTemplatesResponseBodyEvaluatorTemplates {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_type")

    private Integer evaluatorType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "popularity")

    private String popularity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_info")

    private OpsEvaluatorBaseInfo baseInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_info")

    private ListOpsEvaluatorTemplatesResponseBodyEvaluatorInfo evaluatorInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_content")

    private ListOpsEvaluatorTemplatesResponseBodyEvaluatorContent evaluatorContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private ListOpsEvaluatorTemplatesResponseBodyTags tags;

    public ListOpsEvaluatorTemplatesResponseBodyEvaluatorTemplates withEvaluatorType(Integer evaluatorType) {
        this.evaluatorType = evaluatorType;
        return this;
    }

    /**
     * **参数解释：** 评估器类型标识。 **取值范围：** 0到2,147,483,647。 
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

    public ListOpsEvaluatorTemplatesResponseBodyEvaluatorTemplates withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * **参数解释：** 评估器模板的唯一ID。 **取值范围：** 由系统生成的数字字符串。 
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public ListOpsEvaluatorTemplatesResponseBodyEvaluatorTemplates withPopularity(String popularity) {
        this.popularity = popularity;
        return this;
    }

    /**
     * **参数解释：** 流行度表示评估器在用户中的受欢迎程度和使用频率。 **取值范围：** 数字形式的字符串。 
     * @return popularity
     */
    public String getPopularity() {
        return popularity;
    }

    public void setPopularity(String popularity) {
        this.popularity = popularity;
    }

    public ListOpsEvaluatorTemplatesResponseBodyEvaluatorTemplates withBaseInfo(OpsEvaluatorBaseInfo baseInfo) {
        this.baseInfo = baseInfo;
        return this;
    }

    public ListOpsEvaluatorTemplatesResponseBodyEvaluatorTemplates withBaseInfo(
        Consumer<OpsEvaluatorBaseInfo> baseInfoSetter) {
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

    public ListOpsEvaluatorTemplatesResponseBodyEvaluatorTemplates withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 评估器描述用于说明评估器的功能、用途和使用场景。 **取值范围：** 描述性文本。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ListOpsEvaluatorTemplatesResponseBodyEvaluatorTemplates withEvaluatorInfo(
        ListOpsEvaluatorTemplatesResponseBodyEvaluatorInfo evaluatorInfo) {
        this.evaluatorInfo = evaluatorInfo;
        return this;
    }

    public ListOpsEvaluatorTemplatesResponseBodyEvaluatorTemplates withEvaluatorInfo(
        Consumer<ListOpsEvaluatorTemplatesResponseBodyEvaluatorInfo> evaluatorInfoSetter) {
        if (this.evaluatorInfo == null) {
            this.evaluatorInfo = new ListOpsEvaluatorTemplatesResponseBodyEvaluatorInfo();
            evaluatorInfoSetter.accept(this.evaluatorInfo);
        }

        return this;
    }

    /**
     * Get evaluatorInfo
     * @return evaluatorInfo
     */
    public ListOpsEvaluatorTemplatesResponseBodyEvaluatorInfo getEvaluatorInfo() {
        return evaluatorInfo;
    }

    public void setEvaluatorInfo(ListOpsEvaluatorTemplatesResponseBodyEvaluatorInfo evaluatorInfo) {
        this.evaluatorInfo = evaluatorInfo;
    }

    public ListOpsEvaluatorTemplatesResponseBodyEvaluatorTemplates withEvaluatorContent(
        ListOpsEvaluatorTemplatesResponseBodyEvaluatorContent evaluatorContent) {
        this.evaluatorContent = evaluatorContent;
        return this;
    }

    public ListOpsEvaluatorTemplatesResponseBodyEvaluatorTemplates withEvaluatorContent(
        Consumer<ListOpsEvaluatorTemplatesResponseBodyEvaluatorContent> evaluatorContentSetter) {
        if (this.evaluatorContent == null) {
            this.evaluatorContent = new ListOpsEvaluatorTemplatesResponseBodyEvaluatorContent();
            evaluatorContentSetter.accept(this.evaluatorContent);
        }

        return this;
    }

    /**
     * Get evaluatorContent
     * @return evaluatorContent
     */
    public ListOpsEvaluatorTemplatesResponseBodyEvaluatorContent getEvaluatorContent() {
        return evaluatorContent;
    }

    public void setEvaluatorContent(ListOpsEvaluatorTemplatesResponseBodyEvaluatorContent evaluatorContent) {
        this.evaluatorContent = evaluatorContent;
    }

    public ListOpsEvaluatorTemplatesResponseBodyEvaluatorTemplates withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 评估器显示名称。 **取值范围：** 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListOpsEvaluatorTemplatesResponseBodyEvaluatorTemplates withTags(
        ListOpsEvaluatorTemplatesResponseBodyTags tags) {
        this.tags = tags;
        return this;
    }

    public ListOpsEvaluatorTemplatesResponseBodyEvaluatorTemplates withTags(
        Consumer<ListOpsEvaluatorTemplatesResponseBodyTags> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ListOpsEvaluatorTemplatesResponseBodyTags();
            tagsSetter.accept(this.tags);
        }

        return this;
    }

    /**
     * Get tags
     * @return tags
     */
    public ListOpsEvaluatorTemplatesResponseBodyTags getTags() {
        return tags;
    }

    public void setTags(ListOpsEvaluatorTemplatesResponseBodyTags tags) {
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
        ListOpsEvaluatorTemplatesResponseBodyEvaluatorTemplates that =
            (ListOpsEvaluatorTemplatesResponseBodyEvaluatorTemplates) obj;
        return Objects.equals(this.evaluatorType, that.evaluatorType)
            && Objects.equals(this.templateId, that.templateId) && Objects.equals(this.popularity, that.popularity)
            && Objects.equals(this.baseInfo, that.baseInfo) && Objects.equals(this.description, that.description)
            && Objects.equals(this.evaluatorInfo, that.evaluatorInfo)
            && Objects.equals(this.evaluatorContent, that.evaluatorContent) && Objects.equals(this.name, that.name)
            && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(evaluatorType,
            templateId,
            popularity,
            baseInfo,
            description,
            evaluatorInfo,
            evaluatorContent,
            name,
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsEvaluatorTemplatesResponseBodyEvaluatorTemplates {\n");
        sb.append("    evaluatorType: ").append(toIndentedString(evaluatorType)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    popularity: ").append(toIndentedString(popularity)).append("\n");
        sb.append("    baseInfo: ").append(toIndentedString(baseInfo)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    evaluatorInfo: ").append(toIndentedString(evaluatorInfo)).append("\n");
        sb.append("    evaluatorContent: ").append(toIndentedString(evaluatorContent)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
