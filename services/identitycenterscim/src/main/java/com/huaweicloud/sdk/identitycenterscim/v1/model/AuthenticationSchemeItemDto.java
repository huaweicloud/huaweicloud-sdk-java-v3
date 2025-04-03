package com.huaweicloud.sdk.identitycenterscim.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AuthenticationSchemeItemDto
 */
public class AuthenticationSchemeItemDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specUri")

    private String specUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "documentationUri")

    private String documentationUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary")

    private Boolean primary;

    public AuthenticationSchemeItemDto withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 认证类型，指定鉴权的方式
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AuthenticationSchemeItemDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 认证概要名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AuthenticationSchemeItemDto withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 认证概要的描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AuthenticationSchemeItemDto withSpecUri(String specUri) {
        this.specUri = specUri;
        return this;
    }

    /**
     * 规范链接
     * @return specUri
     */
    public String getSpecUri() {
        return specUri;
    }

    public void setSpecUri(String specUri) {
        this.specUri = specUri;
    }

    public AuthenticationSchemeItemDto withDocumentationUri(String documentationUri) {
        this.documentationUri = documentationUri;
        return this;
    }

    /**
     * 帮助文档链接
     * @return documentationUri
     */
    public String getDocumentationUri() {
        return documentationUri;
    }

    public void setDocumentationUri(String documentationUri) {
        this.documentationUri = documentationUri;
    }

    public AuthenticationSchemeItemDto withPrimary(Boolean primary) {
        this.primary = primary;
        return this;
    }

    /**
     * 是否为主要的认证方式
     * @return primary
     */
    public Boolean getPrimary() {
        return primary;
    }

    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AuthenticationSchemeItemDto that = (AuthenticationSchemeItemDto) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.specUri, that.specUri)
            && Objects.equals(this.documentationUri, that.documentationUri)
            && Objects.equals(this.primary, that.primary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, name, description, specUri, documentationUri, primary);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthenticationSchemeItemDto {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    specUri: ").append(toIndentedString(specUri)).append("\n");
        sb.append("    documentationUri: ").append(toIndentedString(documentationUri)).append("\n");
        sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
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
