package com.huaweicloud.sdk.waf.v1.model;

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
public class ShowBotMRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "features")

    private List<String> features = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private Integer category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_category")

    private Integer subCategory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defense_action")

    private Integer defenseAction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private Long createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_time")

    private Long modifiedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Boolean status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interaction_confidence")

    private Integer interactionConfidence;

    public ShowBotMRuleResponse withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 规则ID，唯一标识当前BotM规则。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ShowBotMRuleResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 规则名称，用于标识当前BotM规则的名称。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowBotMRuleResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 规则描述，对当前BotM规则的功能说明。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowBotMRuleResponse withFeatures(List<String> features) {
        this.features = features;
        return this;
    }

    public ShowBotMRuleResponse addFeaturesItem(String featuresItem) {
        if (this.features == null) {
            this.features = new ArrayList<>();
        }
        this.features.add(featuresItem);
        return this;
    }

    public ShowBotMRuleResponse withFeatures(Consumer<List<String>> featuresSetter) {
        if (this.features == null) {
            this.features = new ArrayList<>();
        }
        featuresSetter.accept(this.features);
        return this;
    }

    /**
     * **参数解释：** 规则列表，当前BotM规则包含的具体检测特征。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return features
     */
    public List<String> getFeatures() {
        return features;
    }

    public void setFeatures(List<String> features) {
        this.features = features;
    }

    public ShowBotMRuleResponse withCategory(Integer category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释：** 规则所属类别，标识规则的一级分类（如0表示基础检测类）。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return category
     */
    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public ShowBotMRuleResponse withSubCategory(Integer subCategory) {
        this.subCategory = subCategory;
        return this;
    }

    /**
     * **参数解释：** 规则所属子类别，标识规则的二级分类（如0表示已知Bot子类）。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return subCategory
     */
    public Integer getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(Integer subCategory) {
        this.subCategory = subCategory;
    }

    public ShowBotMRuleResponse withDefenseAction(Integer defenseAction) {
        this.defenseAction = defenseAction;
        return this;
    }

    /**
     * **参数解释：** 规则对应的防护动作，标识触发规则后执行的动作（如0表示放行）。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return defenseAction
     */
    public Integer getDefenseAction() {
        return defenseAction;
    }

    public void setDefenseAction(Integer defenseAction) {
        this.defenseAction = defenseAction;
    }

    public ShowBotMRuleResponse withCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * **参数解释：** 规则创建的时间，时间戳（毫秒级）。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return createdTime
     */
    public Long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
    }

    public ShowBotMRuleResponse withModifiedTime(Long modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }

    /**
     * **参数解释：** 规则更新的时间，时间戳（毫秒级）。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return modifiedTime
     */
    public Long getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Long modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public ShowBotMRuleResponse withStatus(Boolean status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 规则目前是否被启用（true表示启用，false表示禁用）。 **约束限制：** 不涉及 **取值范围：** 仅支持true、false两个布尔值 **默认取值：** true
     * @return status
     */
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public ShowBotMRuleResponse withInteractionConfidence(Integer interactionConfidence) {
        this.interactionConfidence = interactionConfidence;
        return this;
    }

    /**
     * **参数解释：** 交互置信度，标识主动交互检测的置信度阈值。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return interactionConfidence
     */
    public Integer getInteractionConfidence() {
        return interactionConfidence;
    }

    public void setInteractionConfidence(Integer interactionConfidence) {
        this.interactionConfidence = interactionConfidence;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowBotMRuleResponse that = (ShowBotMRuleResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.features, that.features)
            && Objects.equals(this.category, that.category) && Objects.equals(this.subCategory, that.subCategory)
            && Objects.equals(this.defenseAction, that.defenseAction)
            && Objects.equals(this.createdTime, that.createdTime)
            && Objects.equals(this.modifiedTime, that.modifiedTime) && Objects.equals(this.status, that.status)
            && Objects.equals(this.interactionConfidence, that.interactionConfidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            features,
            category,
            subCategory,
            defenseAction,
            createdTime,
            modifiedTime,
            status,
            interactionConfidence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBotMRuleResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    features: ").append(toIndentedString(features)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    subCategory: ").append(toIndentedString(subCategory)).append("\n");
        sb.append("    defenseAction: ").append(toIndentedString(defenseAction)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    modifiedTime: ").append(toIndentedString(modifiedTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    interactionConfidence: ").append(toIndentedString(interactionConfidence)).append("\n");
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
