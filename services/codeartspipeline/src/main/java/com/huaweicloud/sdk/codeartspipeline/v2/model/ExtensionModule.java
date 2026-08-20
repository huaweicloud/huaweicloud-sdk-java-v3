package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 扩展模块信息
 */
public class ExtensionModule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_url")

    private String baseUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private String location;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_id")

    private String moduleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private ExtensionModuleProperties properties;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publisher")

    private String publisher;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url_relative")

    private String urlRelative;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties_list")

    private List<Object> propertiesList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manifest_version")

    private String manifestVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "categories")

    private List<String> categories = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target")

    private String target;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_line")

    private String productLine;

    public ExtensionModule withBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }

    /**
     * 基础url
     * @return baseUrl
     */
    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public ExtensionModule withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ExtensionModule withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ExtensionModule withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * 扩展点
     * @return location
     */
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ExtensionModule withModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }

    /**
     * 模块id
     * @return moduleId
     */
    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public ExtensionModule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ExtensionModule withProperties(ExtensionModuleProperties properties) {
        this.properties = properties;
        return this;
    }

    public ExtensionModule withProperties(Consumer<ExtensionModuleProperties> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new ExtensionModuleProperties();
            propertiesSetter.accept(this.properties);
        }

        return this;
    }

    /**
     * Get properties
     * @return properties
     */
    public ExtensionModuleProperties getProperties() {
        return properties;
    }

    public void setProperties(ExtensionModuleProperties properties) {
        this.properties = properties;
    }

    public ExtensionModule withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * 发布商
     * @return publisher
     */
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public ExtensionModule withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ExtensionModule withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ExtensionModule withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public ExtensionModule addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ExtensionModule withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签。
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public ExtensionModule withUrlRelative(String urlRelative) {
        this.urlRelative = urlRelative;
        return this;
    }

    /**
     * 插件链接地址
     * @return urlRelative
     */
    public String getUrlRelative() {
        return urlRelative;
    }

    public void setUrlRelative(String urlRelative) {
        this.urlRelative = urlRelative;
    }

    public ExtensionModule withPropertiesList(List<Object> propertiesList) {
        this.propertiesList = propertiesList;
        return this;
    }

    public ExtensionModule addPropertiesListItem(Object propertiesListItem) {
        if (this.propertiesList == null) {
            this.propertiesList = new ArrayList<>();
        }
        this.propertiesList.add(propertiesListItem);
        return this;
    }

    public ExtensionModule withPropertiesList(Consumer<List<Object>> propertiesListSetter) {
        if (this.propertiesList == null) {
            this.propertiesList = new ArrayList<>();
        }
        propertiesListSetter.accept(this.propertiesList);
        return this;
    }

    /**
     * 多版本属性列表
     * @return propertiesList
     */
    public List<Object> getPropertiesList() {
        return propertiesList;
    }

    public void setPropertiesList(List<Object> propertiesList) {
        this.propertiesList = propertiesList;
    }

    public ExtensionModule withManifestVersion(String manifestVersion) {
        this.manifestVersion = manifestVersion;
        return this;
    }

    /**
     * 摘要版本号
     * @return manifestVersion
     */
    public String getManifestVersion() {
        return manifestVersion;
    }

    public void setManifestVersion(String manifestVersion) {
        this.manifestVersion = manifestVersion;
    }

    public ExtensionModule withCategories(List<String> categories) {
        this.categories = categories;
        return this;
    }

    public ExtensionModule addCategoriesItem(String categoriesItem) {
        if (this.categories == null) {
            this.categories = new ArrayList<>();
        }
        this.categories.add(categoriesItem);
        return this;
    }

    public ExtensionModule withCategories(Consumer<List<String>> categoriesSetter) {
        if (this.categories == null) {
            this.categories = new ArrayList<>();
        }
        categoriesSetter.accept(this.categories);
        return this;
    }

    /**
     * 分类。
     * @return categories
     */
    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public ExtensionModule withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * 目标。预留字段，通常为空。
     * @return target
     */
    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public ExtensionModule withProductLine(String productLine) {
        this.productLine = productLine;
        return this;
    }

    /**
     * 产品线。预留字段，通常为空。
     * @return productLine
     */
    public String getProductLine() {
        return productLine;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExtensionModule that = (ExtensionModule) obj;
        return Objects.equals(this.baseUrl, that.baseUrl) && Objects.equals(this.description, that.description)
            && Objects.equals(this.id, that.id) && Objects.equals(this.location, that.location)
            && Objects.equals(this.moduleId, that.moduleId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.properties, that.properties) && Objects.equals(this.publisher, that.publisher)
            && Objects.equals(this.type, that.type) && Objects.equals(this.version, that.version)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.urlRelative, that.urlRelative)
            && Objects.equals(this.propertiesList, that.propertiesList)
            && Objects.equals(this.manifestVersion, that.manifestVersion)
            && Objects.equals(this.categories, that.categories) && Objects.equals(this.target, that.target)
            && Objects.equals(this.productLine, that.productLine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baseUrl,
            description,
            id,
            location,
            moduleId,
            name,
            properties,
            publisher,
            type,
            version,
            tags,
            urlRelative,
            propertiesList,
            manifestVersion,
            categories,
            target,
            productLine);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtensionModule {\n");
        sb.append("    baseUrl: ").append(toIndentedString(baseUrl)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    urlRelative: ").append(toIndentedString(urlRelative)).append("\n");
        sb.append("    propertiesList: ").append(toIndentedString(propertiesList)).append("\n");
        sb.append("    manifestVersion: ").append(toIndentedString(manifestVersion)).append("\n");
        sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
        sb.append("    productLine: ").append(toIndentedString(productLine)).append("\n");
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
