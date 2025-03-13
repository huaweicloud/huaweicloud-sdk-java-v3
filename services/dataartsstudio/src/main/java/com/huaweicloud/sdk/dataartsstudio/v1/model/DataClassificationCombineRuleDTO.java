package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DataClassificationCombineRuleDTO
 */
public class DataClassificationCombineRuleDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secrecy_level_id")

    private String secrecyLevelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "combine_expression")

    private String combineExpression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_id")

    private String categoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "single_expressions")

    private List<DataClassificationSingleRuleDTO> singleExpressions = null;

    public DataClassificationCombineRuleDTO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 规则名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DataClassificationCombineRuleDTO withSecrecyLevelId(String secrecyLevelId) {
        this.secrecyLevelId = secrecyLevelId;
        return this;
    }

    /**
     * 密级ID
     * @return secrecyLevelId
     */
    public String getSecrecyLevelId() {
        return secrecyLevelId;
    }

    public void setSecrecyLevelId(String secrecyLevelId) {
        this.secrecyLevelId = secrecyLevelId;
    }

    public DataClassificationCombineRuleDTO withCombineExpression(String combineExpression) {
        this.combineExpression = combineExpression;
        return this;
    }

    /**
     * 条件表达式
     * @return combineExpression
     */
    public String getCombineExpression() {
        return combineExpression;
    }

    public void setCombineExpression(String combineExpression) {
        this.combineExpression = combineExpression;
    }

    public DataClassificationCombineRuleDTO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 规则描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DataClassificationCombineRuleDTO withCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    /**
     * 分类ID
     * @return categoryId
     */
    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public DataClassificationCombineRuleDTO withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 使能状态。
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public DataClassificationCombineRuleDTO withSingleExpressions(
        List<DataClassificationSingleRuleDTO> singleExpressions) {
        this.singleExpressions = singleExpressions;
        return this;
    }

    public DataClassificationCombineRuleDTO addSingleExpressionsItem(
        DataClassificationSingleRuleDTO singleExpressionsItem) {
        if (this.singleExpressions == null) {
            this.singleExpressions = new ArrayList<>();
        }
        this.singleExpressions.add(singleExpressionsItem);
        return this;
    }

    public DataClassificationCombineRuleDTO withSingleExpressions(
        Consumer<List<DataClassificationSingleRuleDTO>> singleExpressionsSetter) {
        if (this.singleExpressions == null) {
            this.singleExpressions = new ArrayList<>();
        }
        singleExpressionsSetter.accept(this.singleExpressions);
        return this;
    }

    /**
     * 条件单规则
     * @return singleExpressions
     */
    public List<DataClassificationSingleRuleDTO> getSingleExpressions() {
        return singleExpressions;
    }

    public void setSingleExpressions(List<DataClassificationSingleRuleDTO> singleExpressions) {
        this.singleExpressions = singleExpressions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataClassificationCombineRuleDTO that = (DataClassificationCombineRuleDTO) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.secrecyLevelId, that.secrecyLevelId)
            && Objects.equals(this.combineExpression, that.combineExpression)
            && Objects.equals(this.description, that.description) && Objects.equals(this.categoryId, that.categoryId)
            && Objects.equals(this.enable, that.enable)
            && Objects.equals(this.singleExpressions, that.singleExpressions);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(name, secrecyLevelId, combineExpression, description, categoryId, enable, singleExpressions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataClassificationCombineRuleDTO {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    secrecyLevelId: ").append(toIndentedString(secrecyLevelId)).append("\n");
        sb.append("    combineExpression: ").append(toIndentedString(combineExpression)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    singleExpressions: ").append(toIndentedString(singleExpressions)).append("\n");
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
