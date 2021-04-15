package com.huaweicloud.sdk.devstar.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * TemplateQueryV2
 */
public class TemplateQueryV2  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="category")
    
    private List<String> category = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="keyword")
    
    private String keyword;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sort_by")
    
    private String sortBy;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="label")
    
    private String label;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="my_templates")
    
    private Boolean myTemplates;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Integer status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status_array")
    
    private List<Integer> statusArray = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="productshorts")
    
    private List<String> productshorts = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tag_ids")
    
    private List<String> tagIds = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="types")
    
    private List<Integer> types = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_static")
    
    private Integer isStatic;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="platform_source")
    
    private List<Integer> platformSource = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tag_names")
    
    private List<String> tagNames = null;
    
    public TemplateQueryV2 withCategory(List<String> category) {
        this.category = category;
        return this;
    }

    
    public TemplateQueryV2 addCategoryItem(String categoryItem) {
        if(this.category == null) {
            this.category = new ArrayList<>();
        }
        this.category.add(categoryItem);
        return this;
    }

    public TemplateQueryV2 withCategory(Consumer<List<String>> categorySetter) {
        if(this.category == null) {
            this.category = new ArrayList<>();
        }
        categorySetter.accept(this.category);
        return this;
    }

    /**
     * 模板分类数组
     * @return category
     */
    public List<String> getCategory() {
        return category;
    }

    public void setCategory(List<String> category) {
        this.category = category;
    }

    

    public TemplateQueryV2 withKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    


    /**
     * 搜索关键字,支持按名称和描述搜索，默认null
     * @return keyword
     */
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    

    public TemplateQueryV2 withSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    


    /**
     * 排序字段和排序顺序指定. 比如: desc(created_at),desc(usage_count)
     * @return sortBy
     */
    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    

    public TemplateQueryV2 withLabel(String label) {
        this.label = label;
        return this;
    }

    


    /**
     * 标签（all，new，hot，推荐recommend）
     * @return label
     */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    

    public TemplateQueryV2 withMyTemplates(Boolean myTemplates) {
        this.myTemplates = myTemplates;
        return this;
    }

    


    /**
     * 是否查询用户自己创建的模板，默认查所有模板
     * @return myTemplates
     */
    public Boolean getMyTemplates() {
        return myTemplates;
    }

    public void setMyTemplates(Boolean myTemplates) {
        this.myTemplates = myTemplates;
    }

    

    public TemplateQueryV2 withStatus(Integer status) {
        this.status = status;
        return this;
    }

    


    /**
     * 查所有模板时只处理上架的；查用户模板，需支持按状态查询，状态：0审核中，1上架，2下架，不传表示查所有的（默认）
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    

    public TemplateQueryV2 withStatusArray(List<Integer> statusArray) {
        this.statusArray = statusArray;
        return this;
    }

    
    public TemplateQueryV2 addStatusArrayItem(Integer statusArrayItem) {
        if(this.statusArray == null) {
            this.statusArray = new ArrayList<>();
        }
        this.statusArray.add(statusArrayItem);
        return this;
    }

    public TemplateQueryV2 withStatusArray(Consumer<List<Integer>> statusArraySetter) {
        if(this.statusArray == null) {
            this.statusArray = new ArrayList<>();
        }
        statusArraySetter.accept(this.statusArray);
        return this;
    }

    /**
     * 模板状态数组
     * @return statusArray
     */
    public List<Integer> getStatusArray() {
        return statusArray;
    }

    public void setStatusArray(List<Integer> statusArray) {
        this.statusArray = statusArray;
    }

    

    public TemplateQueryV2 withProductshorts(List<String> productshorts) {
        this.productshorts = productshorts;
        return this;
    }

    
    public TemplateQueryV2 addProductshortsItem(String productshortsItem) {
        if(this.productshorts == null) {
            this.productshorts = new ArrayList<>();
        }
        this.productshorts.add(productshortsItem);
        return this;
    }

    public TemplateQueryV2 withProductshorts(Consumer<List<String>> productshortsSetter) {
        if(this.productshorts == null) {
            this.productshorts = new ArrayList<>();
        }
        productshortsSetter.accept(this.productshorts);
        return this;
    }

    /**
     * 模板关联的云产品(产品短名)列表
     * @return productshorts
     */
    public List<String> getProductshorts() {
        return productshorts;
    }

    public void setProductshorts(List<String> productshorts) {
        this.productshorts = productshorts;
    }

    

    public TemplateQueryV2 withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * 偏移量, 表示从此偏移量开始查询, offset大于等于0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    

    public TemplateQueryV2 withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 每页的模板条数
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public TemplateQueryV2 withTagIds(List<String> tagIds) {
        this.tagIds = tagIds;
        return this;
    }

    
    public TemplateQueryV2 addTagIdsItem(String tagIdsItem) {
        if(this.tagIds == null) {
            this.tagIds = new ArrayList<>();
        }
        this.tagIds.add(tagIdsItem);
        return this;
    }

    public TemplateQueryV2 withTagIds(Consumer<List<String>> tagIdsSetter) {
        if(this.tagIds == null) {
            this.tagIds = new ArrayList<>();
        }
        tagIdsSetter.accept(this.tagIds);
        return this;
    }

    /**
     * 模板关联的自定义标签列表
     * @return tagIds
     */
    public List<String> getTagIds() {
        return tagIds;
    }

    public void setTagIds(List<String> tagIds) {
        this.tagIds = tagIds;
    }

    

    public TemplateQueryV2 withTypes(List<Integer> types) {
        this.types = types;
        return this;
    }

    
    public TemplateQueryV2 addTypesItem(Integer typesItem) {
        if(this.types == null) {
            this.types = new ArrayList<>();
        }
        this.types.add(typesItem);
        return this;
    }

    public TemplateQueryV2 withTypes(Consumer<List<Integer>> typesSetter) {
        if(this.types == null) {
            this.types = new ArrayList<>();
        }
        typesSetter.accept(this.types);
        return this;
    }

    /**
     * 模板类型（0:doc、1:code、2:pipeline、3:devops四种）
     * @return types
     */
    public List<Integer> getTypes() {
        return types;
    }

    public void setTypes(List<Integer> types) {
        this.types = types;
    }

    

    public TemplateQueryV2 withIsStatic(Integer isStatic) {
        this.isStatic = isStatic;
        return this;
    }

    


    /**
     * 动、静态代码模板标识（0：动态模板codetemplate，1：静态模板codesample）
     * @return isStatic
     */
    public Integer getIsStatic() {
        return isStatic;
    }

    public void setIsStatic(Integer isStatic) {
        this.isStatic = isStatic;
    }

    

    public TemplateQueryV2 withPlatformSource(List<Integer> platformSource) {
        this.platformSource = platformSource;
        return this;
    }

    
    public TemplateQueryV2 addPlatformSourceItem(Integer platformSourceItem) {
        if(this.platformSource == null) {
            this.platformSource = new ArrayList<>();
        }
        this.platformSource.add(platformSourceItem);
        return this;
    }

    public TemplateQueryV2 withPlatformSource(Consumer<List<Integer>> platformSourceSetter) {
        if(this.platformSource == null) {
            this.platformSource = new ArrayList<>();
        }
        platformSourceSetter.accept(this.platformSource);
        return this;
    }

    /**
     * 平台来源（0:codelabs、1:devstar）
     * @return platformSource
     */
    public List<Integer> getPlatformSource() {
        return platformSource;
    }

    public void setPlatformSource(List<Integer> platformSource) {
        this.platformSource = platformSource;
    }

    

    public TemplateQueryV2 withTagNames(List<String> tagNames) {
        this.tagNames = tagNames;
        return this;
    }

    
    public TemplateQueryV2 addTagNamesItem(String tagNamesItem) {
        if(this.tagNames == null) {
            this.tagNames = new ArrayList<>();
        }
        this.tagNames.add(tagNamesItem);
        return this;
    }

    public TemplateQueryV2 withTagNames(Consumer<List<String>> tagNamesSetter) {
        if(this.tagNames == null) {
            this.tagNames = new ArrayList<>();
        }
        tagNamesSetter.accept(this.tagNames);
        return this;
    }

    /**
     * 模板关联的标签名称列表
     * @return tagNames
     */
    public List<String> getTagNames() {
        return tagNames;
    }

    public void setTagNames(List<String> tagNames) {
        this.tagNames = tagNames;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TemplateQueryV2 templateQueryV2 = (TemplateQueryV2) o;
        return Objects.equals(this.category, templateQueryV2.category) &&
            Objects.equals(this.keyword, templateQueryV2.keyword) &&
            Objects.equals(this.sortBy, templateQueryV2.sortBy) &&
            Objects.equals(this.label, templateQueryV2.label) &&
            Objects.equals(this.myTemplates, templateQueryV2.myTemplates) &&
            Objects.equals(this.status, templateQueryV2.status) &&
            Objects.equals(this.statusArray, templateQueryV2.statusArray) &&
            Objects.equals(this.productshorts, templateQueryV2.productshorts) &&
            Objects.equals(this.offset, templateQueryV2.offset) &&
            Objects.equals(this.limit, templateQueryV2.limit) &&
            Objects.equals(this.tagIds, templateQueryV2.tagIds) &&
            Objects.equals(this.types, templateQueryV2.types) &&
            Objects.equals(this.isStatic, templateQueryV2.isStatic) &&
            Objects.equals(this.platformSource, templateQueryV2.platformSource) &&
            Objects.equals(this.tagNames, templateQueryV2.tagNames);
    }
    @Override
    public int hashCode() {
        return Objects.hash(category, keyword, sortBy, label, myTemplates, status, statusArray, productshorts, offset, limit, tagIds, types, isStatic, platformSource, tagNames);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateQueryV2 {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
        sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    myTemplates: ").append(toIndentedString(myTemplates)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusArray: ").append(toIndentedString(statusArray)).append("\n");
        sb.append("    productshorts: ").append(toIndentedString(productshorts)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    tagIds: ").append(toIndentedString(tagIds)).append("\n");
        sb.append("    types: ").append(toIndentedString(types)).append("\n");
        sb.append("    isStatic: ").append(toIndentedString(isStatic)).append("\n");
        sb.append("    platformSource: ").append(toIndentedString(platformSource)).append("\n");
        sb.append("    tagNames: ").append(toIndentedString(tagNames)).append("\n");
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

