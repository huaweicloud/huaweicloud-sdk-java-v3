package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 模型配置数据对象
 */
public class ModelConfigDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "categories")

    private List<BaseCategory> categories = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_layer_config")

    private List<CategoryLayerDTO> categoryLayerConfig = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feature_page_link_template")

    private String featurePageLinkTemplate;

    public ModelConfigDTO withCategories(List<BaseCategory> categories) {
        this.categories = categories;
        return this;
    }

    public ModelConfigDTO addCategoriesItem(BaseCategory categoriesItem) {
        if (this.categories == null) {
            this.categories = new ArrayList<>();
        }
        this.categories.add(categoriesItem);
        return this;
    }

    public ModelConfigDTO withCategories(Consumer<List<BaseCategory>> categoriesSetter) {
        if (this.categories == null) {
            this.categories = new ArrayList<>();
        }
        categoriesSetter.accept(this.categories);
        return this;
    }

    /**
     * **参数解释**： 工作项属性。 **取值范围**： 不涉及。
     * @return categories
     */
    public List<BaseCategory> getCategories() {
        return categories;
    }

    public void setCategories(List<BaseCategory> categories) {
        this.categories = categories;
    }

    public ModelConfigDTO withCategoryLayerConfig(List<CategoryLayerDTO> categoryLayerConfig) {
        this.categoryLayerConfig = categoryLayerConfig;
        return this;
    }

    public ModelConfigDTO addCategoryLayerConfigItem(CategoryLayerDTO categoryLayerConfigItem) {
        if (this.categoryLayerConfig == null) {
            this.categoryLayerConfig = new ArrayList<>();
        }
        this.categoryLayerConfig.add(categoryLayerConfigItem);
        return this;
    }

    public ModelConfigDTO withCategoryLayerConfig(Consumer<List<CategoryLayerDTO>> categoryLayerConfigSetter) {
        if (this.categoryLayerConfig == null) {
            this.categoryLayerConfig = new ArrayList<>();
        }
        categoryLayerConfigSetter.accept(this.categoryLayerConfig);
        return this;
    }

    /**
     * **参数解释**： 工作项层级关系。 **取值范围**： 不涉及。
     * @return categoryLayerConfig
     */
    public List<CategoryLayerDTO> getCategoryLayerConfig() {
        return categoryLayerConfig;
    }

    public void setCategoryLayerConfig(List<CategoryLayerDTO> categoryLayerConfig) {
        this.categoryLayerConfig = categoryLayerConfig;
    }

    public ModelConfigDTO withFeaturePageLinkTemplate(String featurePageLinkTemplate) {
        this.featurePageLinkTemplate = featurePageLinkTemplate;
        return this;
    }

    /**
     * **参数解释**： 工作项功能页面跳转链接模板。 **取值范围**： 不涉及。
     * @return featurePageLinkTemplate
     */
    public String getFeaturePageLinkTemplate() {
        return featurePageLinkTemplate;
    }

    public void setFeaturePageLinkTemplate(String featurePageLinkTemplate) {
        this.featurePageLinkTemplate = featurePageLinkTemplate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModelConfigDTO that = (ModelConfigDTO) obj;
        return Objects.equals(this.categories, that.categories)
            && Objects.equals(this.categoryLayerConfig, that.categoryLayerConfig)
            && Objects.equals(this.featurePageLinkTemplate, that.featurePageLinkTemplate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categories, categoryLayerConfig, featurePageLinkTemplate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModelConfigDTO {\n");
        sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
        sb.append("    categoryLayerConfig: ").append(toIndentedString(categoryLayerConfig)).append("\n");
        sb.append("    featurePageLinkTemplate: ").append(toIndentedString(featurePageLinkTemplate)).append("\n");
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
