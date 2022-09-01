package com.huaweicloud.sdk.devstar.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TemplateQuery
 */
public class TemplateQuery {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    @JacksonXmlProperty(localName = "category")

    private List<String> category = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyword")

    @JacksonXmlProperty(localName = "keyword")

    private String keyword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    @JacksonXmlProperty(localName = "sort_key")

    private List<String> sortKey = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    @JacksonXmlProperty(localName = "sort_dir")

    private List<String> sortDir = null;

    /**
    * 标签： - all：全部 - new：最新 - hot：热门 - recommend：推荐 
    */
    public static final class LabelEnum {

        /**
         * Enum ALL for value: "all"
         */
        public static final LabelEnum ALL = new LabelEnum("all");

        /**
         * Enum NEW for value: "new"
         */
        public static final LabelEnum NEW = new LabelEnum("new");

        /**
         * Enum HOT for value: "hot"
         */
        public static final LabelEnum HOT = new LabelEnum("hot");

        /**
         * Enum RECOMMEND for value: "recommend"
         */
        public static final LabelEnum RECOMMEND = new LabelEnum("recommend");

        private static final Map<String, LabelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LabelEnum> createStaticFields() {
            Map<String, LabelEnum> map = new HashMap<>();
            map.put("all", ALL);
            map.put("new", NEW);
            map.put("hot", HOT);
            map.put("recommend", RECOMMEND);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LabelEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static LabelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            LabelEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new LabelEnum(value);
            }
            return result;
        }

        public static LabelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            LabelEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LabelEnum) {
                return this.value.equals(((LabelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    @JacksonXmlProperty(localName = "label")

    private LabelEnum label;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "my_templates")

    @JacksonXmlProperty(localName = "my_templates")

    private Boolean myTemplates;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_array")

    @JacksonXmlProperty(localName = "status_array")

    private List<Integer> statusArray = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_notices")

    @JacksonXmlProperty(localName = "has_notices")

    private Boolean hasNotices;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "productshorts")

    @JacksonXmlProperty(localName = "productshorts")

    private List<String> productshorts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_ids")

    @JacksonXmlProperty(localName = "tag_ids")

    private List<String> tagIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "types")

    @JacksonXmlProperty(localName = "types")

    private List<Integer> types = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_static")

    @JacksonXmlProperty(localName = "is_static")

    private Integer isStatic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform_source")

    @JacksonXmlProperty(localName = "platform_source")

    private List<Integer> platformSource = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_names")

    @JacksonXmlProperty(localName = "tag_names")

    private List<String> tagNames = null;

    public TemplateQuery withCategory(List<String> category) {
        this.category = category;
        return this;
    }

    public TemplateQuery addCategoryItem(String categoryItem) {
        if (this.category == null) {
            this.category = new ArrayList<>();
        }
        this.category.add(categoryItem);
        return this;
    }

    public TemplateQuery withCategory(Consumer<List<String>> categorySetter) {
        if (this.category == null) {
            this.category = new ArrayList<>();
        }
        categorySetter.accept(this.category);
        return this;
    }

    /**
     * 模板分类数组。
     * @return category
     */
    public List<String> getCategory() {
        return category;
    }

    public void setCategory(List<String> category) {
        this.category = category;
    }

    public TemplateQuery withKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    /**
     * 搜索关键字，支持按名称和描述搜索，默认null。
     * @return keyword
     */
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public TemplateQuery withSortKey(List<String> sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    public TemplateQuery addSortKeyItem(String sortKeyItem) {
        if (this.sortKey == null) {
            this.sortKey = new ArrayList<>();
        }
        this.sortKey.add(sortKeyItem);
        return this;
    }

    public TemplateQuery withSortKey(Consumer<List<String>> sortKeySetter) {
        if (this.sortKey == null) {
            this.sortKey = new ArrayList<>();
        }
        sortKeySetter.accept(this.sortKey);
        return this;
    }

    /**
     * 排序字段。
     * @return sortKey
     */
    public List<String> getSortKey() {
        return sortKey;
    }

    public void setSortKey(List<String> sortKey) {
        this.sortKey = sortKey;
    }

    public TemplateQuery withSortDir(List<String> sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    public TemplateQuery addSortDirItem(String sortDirItem) {
        if (this.sortDir == null) {
            this.sortDir = new ArrayList<>();
        }
        this.sortDir.add(sortDirItem);
        return this;
    }

    public TemplateQuery withSortDir(Consumer<List<String>> sortDirSetter) {
        if (this.sortDir == null) {
            this.sortDir = new ArrayList<>();
        }
        sortDirSetter.accept(this.sortDir);
        return this;
    }

    /**
     * 指定排序使用升序还是降序。 - asc 升序 - desc 降序 
     * @return sortDir
     */
    public List<String> getSortDir() {
        return sortDir;
    }

    public void setSortDir(List<String> sortDir) {
        this.sortDir = sortDir;
    }

    public TemplateQuery withLabel(LabelEnum label) {
        this.label = label;
        return this;
    }

    /**
     * 标签： - all：全部 - new：最新 - hot：热门 - recommend：推荐 
     * @return label
     */
    public LabelEnum getLabel() {
        return label;
    }

    public void setLabel(LabelEnum label) {
        this.label = label;
    }

    public TemplateQuery withMyTemplates(Boolean myTemplates) {
        this.myTemplates = myTemplates;
        return this;
    }

    /**
     * 是否查询用户自己创建的模板，默认查所有模板。
     * @return myTemplates
     */
    public Boolean getMyTemplates() {
        return myTemplates;
    }

    public void setMyTemplates(Boolean myTemplates) {
        this.myTemplates = myTemplates;
    }

    public TemplateQuery withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 查所有模板时只处理上架的；查用户模板，需支持按状态查询，状态： - 0：审核中 - 1：上架 - 2：下架 不传表示查所有的（默认） 
     * minimum: 0
     * maximum: 2
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public TemplateQuery withStatusArray(List<Integer> statusArray) {
        this.statusArray = statusArray;
        return this;
    }

    public TemplateQuery addStatusArrayItem(Integer statusArrayItem) {
        if (this.statusArray == null) {
            this.statusArray = new ArrayList<>();
        }
        this.statusArray.add(statusArrayItem);
        return this;
    }

    public TemplateQuery withStatusArray(Consumer<List<Integer>> statusArraySetter) {
        if (this.statusArray == null) {
            this.statusArray = new ArrayList<>();
        }
        statusArraySetter.accept(this.statusArray);
        return this;
    }

    /**
     * 模板状态数组。
     * @return statusArray
     */
    public List<Integer> getStatusArray() {
        return statusArray;
    }

    public void setStatusArray(List<Integer> statusArray) {
        this.statusArray = statusArray;
    }

    public TemplateQuery withHasNotices(Boolean hasNotices) {
        this.hasNotices = hasNotices;
        return this;
    }

    /**
     * 是否查询有消息的模板，默认查所有模板。
     * @return hasNotices
     */
    public Boolean getHasNotices() {
        return hasNotices;
    }

    public void setHasNotices(Boolean hasNotices) {
        this.hasNotices = hasNotices;
    }

    public TemplateQuery withProductshorts(List<String> productshorts) {
        this.productshorts = productshorts;
        return this;
    }

    public TemplateQuery addProductshortsItem(String productshortsItem) {
        if (this.productshorts == null) {
            this.productshorts = new ArrayList<>();
        }
        this.productshorts.add(productshortsItem);
        return this;
    }

    public TemplateQuery withProductshorts(Consumer<List<String>> productshortsSetter) {
        if (this.productshorts == null) {
            this.productshorts = new ArrayList<>();
        }
        productshortsSetter.accept(this.productshorts);
        return this;
    }

    /**
     * 模板关联的云产品(产品短名)列表。
     * @return productshorts
     */
    public List<String> getProductshorts() {
        return productshorts;
    }

    public void setProductshorts(List<String> productshorts) {
        this.productshorts = productshorts;
    }

    public TemplateQuery withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，表示从此偏移量开始查询，offset大于等于0。
     * minimum: 0
     * maximum: 100000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public TemplateQuery withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页的模板条数。
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public TemplateQuery withTagIds(List<String> tagIds) {
        this.tagIds = tagIds;
        return this;
    }

    public TemplateQuery addTagIdsItem(String tagIdsItem) {
        if (this.tagIds == null) {
            this.tagIds = new ArrayList<>();
        }
        this.tagIds.add(tagIdsItem);
        return this;
    }

    public TemplateQuery withTagIds(Consumer<List<String>> tagIdsSetter) {
        if (this.tagIds == null) {
            this.tagIds = new ArrayList<>();
        }
        tagIdsSetter.accept(this.tagIds);
        return this;
    }

    /**
     * 模板关联的自定义标签列表。
     * @return tagIds
     */
    public List<String> getTagIds() {
        return tagIds;
    }

    public void setTagIds(List<String> tagIds) {
        this.tagIds = tagIds;
    }

    public TemplateQuery withTypes(List<Integer> types) {
        this.types = types;
        return this;
    }

    public TemplateQuery addTypesItem(Integer typesItem) {
        if (this.types == null) {
            this.types = new ArrayList<>();
        }
        this.types.add(typesItem);
        return this;
    }

    public TemplateQuery withTypes(Consumer<List<Integer>> typesSetter) {
        if (this.types == null) {
            this.types = new ArrayList<>();
        }
        typesSetter.accept(this.types);
        return this;
    }

    /**
     * 模板类型： - 0：doc - 1：code - 2：pipeline - 3：devops 
     * @return types
     */
    public List<Integer> getTypes() {
        return types;
    }

    public void setTypes(List<Integer> types) {
        this.types = types;
    }

    public TemplateQuery withIsStatic(Integer isStatic) {
        this.isStatic = isStatic;
        return this;
    }

    /**
     * 动、静态代码模板标识： - 0：动态模板codetemplate - 1：静态模板codesample 
     * minimum: 0
     * maximum: 1
     * @return isStatic
     */
    public Integer getIsStatic() {
        return isStatic;
    }

    public void setIsStatic(Integer isStatic) {
        this.isStatic = isStatic;
    }

    public TemplateQuery withPlatformSource(List<Integer> platformSource) {
        this.platformSource = platformSource;
        return this;
    }

    public TemplateQuery addPlatformSourceItem(Integer platformSourceItem) {
        if (this.platformSource == null) {
            this.platformSource = new ArrayList<>();
        }
        this.platformSource.add(platformSourceItem);
        return this;
    }

    public TemplateQuery withPlatformSource(Consumer<List<Integer>> platformSourceSetter) {
        if (this.platformSource == null) {
            this.platformSource = new ArrayList<>();
        }
        platformSourceSetter.accept(this.platformSource);
        return this;
    }

    /**
     * 平台来源： - 0：codelabs - 1：devstar 
     * @return platformSource
     */
    public List<Integer> getPlatformSource() {
        return platformSource;
    }

    public void setPlatformSource(List<Integer> platformSource) {
        this.platformSource = platformSource;
    }

    public TemplateQuery withTagNames(List<String> tagNames) {
        this.tagNames = tagNames;
        return this;
    }

    public TemplateQuery addTagNamesItem(String tagNamesItem) {
        if (this.tagNames == null) {
            this.tagNames = new ArrayList<>();
        }
        this.tagNames.add(tagNamesItem);
        return this;
    }

    public TemplateQuery withTagNames(Consumer<List<String>> tagNamesSetter) {
        if (this.tagNames == null) {
            this.tagNames = new ArrayList<>();
        }
        tagNamesSetter.accept(this.tagNames);
        return this;
    }

    /**
     * 模板关联的标签名称列表。
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
        TemplateQuery templateQuery = (TemplateQuery) o;
        return Objects.equals(this.category, templateQuery.category)
            && Objects.equals(this.keyword, templateQuery.keyword)
            && Objects.equals(this.sortKey, templateQuery.sortKey)
            && Objects.equals(this.sortDir, templateQuery.sortDir) && Objects.equals(this.label, templateQuery.label)
            && Objects.equals(this.myTemplates, templateQuery.myTemplates)
            && Objects.equals(this.status, templateQuery.status)
            && Objects.equals(this.statusArray, templateQuery.statusArray)
            && Objects.equals(this.hasNotices, templateQuery.hasNotices)
            && Objects.equals(this.productshorts, templateQuery.productshorts)
            && Objects.equals(this.offset, templateQuery.offset) && Objects.equals(this.limit, templateQuery.limit)
            && Objects.equals(this.tagIds, templateQuery.tagIds) && Objects.equals(this.types, templateQuery.types)
            && Objects.equals(this.isStatic, templateQuery.isStatic)
            && Objects.equals(this.platformSource, templateQuery.platformSource)
            && Objects.equals(this.tagNames, templateQuery.tagNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category,
            keyword,
            sortKey,
            sortDir,
            label,
            myTemplates,
            status,
            statusArray,
            hasNotices,
            productshorts,
            offset,
            limit,
            tagIds,
            types,
            isStatic,
            platformSource,
            tagNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateQuery {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    myTemplates: ").append(toIndentedString(myTemplates)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusArray: ").append(toIndentedString(statusArray)).append("\n");
        sb.append("    hasNotices: ").append(toIndentedString(hasNotices)).append("\n");
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
