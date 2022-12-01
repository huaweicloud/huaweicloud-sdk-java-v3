package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 产品详情返回体
 */
public class ProductResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attributes")

    private Map<String, ProductAttributes> attributes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private Integer createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Attributes> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_key")

    private String privateKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate")

    private String certificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ca")

    private String ca;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package")

    private String _package;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identifier")

    private String identifier;

    public ProductResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 产品id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ProductResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 产品名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 产品描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductResponse withAttributes(Map<String, ProductAttributes> attributes) {
        this.attributes = attributes;
        return this;
    }

    public ProductResponse putAttributesItem(String key, ProductAttributes attributesItem) {
        if (this.attributes == null) {
            this.attributes = new HashMap<>();
        }
        this.attributes.put(key, attributesItem);
        return this;
    }

    public ProductResponse withAttributes(Consumer<Map<String, ProductAttributes>> attributesSetter) {
        if (this.attributes == null) {
            this.attributes = new HashMap<>();
        }
        attributesSetter.accept(this.attributes);
        return this;
    }

    /**
     * 产品属性值
     * @return attributes
     */
    public Map<String, ProductAttributes> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, ProductAttributes> attributes) {
        this.attributes = attributes;
    }

    public ProductResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 产品所属账号的项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ProductResponse withCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 产品创建时间戳
     * @return createdAt
     */
    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public ProductResponse withTags(List<Attributes> tags) {
        this.tags = tags;
        return this;
    }

    public ProductResponse addTagsItem(Attributes tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ProductResponse withTags(Consumer<List<Attributes>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 产品标签
     * @return tags
     */
    public List<Attributes> getTags() {
        return tags;
    }

    public void setTags(List<Attributes> tags) {
        this.tags = tags;
    }

    public ProductResponse withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    /**
     * 产品私钥
     * @return privateKey
     */
    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public ProductResponse withCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * 产品证书
     * @return certificate
     */
    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public ProductResponse withCa(String ca) {
        this.ca = ca;
        return this;
    }

    /**
     * 产品根证书
     * @return ca
     */
    public String getCa() {
        return ca;
    }

    public void setCa(String ca) {
        this.ca = ca;
    }

    public ProductResponse withPackage(String _package) {
        this._package = _package;
        return this;
    }

    /**
     * 将产品证书文件certificate/ca/private_key打成.tar.gz包后用base64编码的字符串。 使用时请使用base64解码成.tar.gz包。
     * @return _package
     */
    public String getPackage() {
        return _package;
    }

    public void setPackage(String _package) {
        this._package = _package;
    }

    public ProductResponse withIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * 产品使用token注册时的凭证
     * @return identifier
     */
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductResponse productResponse = (ProductResponse) o;
        return Objects.equals(this.id, productResponse.id) && Objects.equals(this.name, productResponse.name)
            && Objects.equals(this.description, productResponse.description)
            && Objects.equals(this.attributes, productResponse.attributes)
            && Objects.equals(this.projectId, productResponse.projectId)
            && Objects.equals(this.createdAt, productResponse.createdAt)
            && Objects.equals(this.tags, productResponse.tags)
            && Objects.equals(this.privateKey, productResponse.privateKey)
            && Objects.equals(this.certificate, productResponse.certificate)
            && Objects.equals(this.ca, productResponse.ca) && Objects.equals(this._package, productResponse._package)
            && Objects.equals(this.identifier, productResponse.identifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            attributes,
            projectId,
            createdAt,
            tags,
            privateKey,
            certificate,
            ca,
            _package,
            identifier);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
        sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
        sb.append("    ca: ").append(toIndentedString(ca)).append("\n");
        sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
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
