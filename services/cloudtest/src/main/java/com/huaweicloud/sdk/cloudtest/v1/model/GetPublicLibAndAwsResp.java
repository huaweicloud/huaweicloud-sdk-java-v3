package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GetPublicLibAndAwsResp
 */
public class GetPublicLibAndAwsResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aw_tag")

    private String awTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "document_link")

    private String documentLink;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_favorite")

    private Integer isFavorite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_aw_description")

    private String publicAwDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_aw_id")

    private String publicAwId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_aw_lib_id")

    private String publicAwLibId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_aw_lib_name")

    private String publicAwLibName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_aw_mark")

    private Integer publicAwMark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_aw_name")

    private String publicAwName;

    public GetPublicLibAndAwsResp withAwTag(String awTag) {
        this.awTag = awTag;
        return this;
    }

    /**
     * 公共关键字分组信息
     * @return awTag
     */
    public String getAwTag() {
        return awTag;
    }

    public void setAwTag(String awTag) {
        this.awTag = awTag;
    }

    public GetPublicLibAndAwsResp withDocumentLink(String documentLink) {
        this.documentLink = documentLink;
        return this;
    }

    /**
     * 公共关键字帮助文档链接
     * @return documentLink
     */
    public String getDocumentLink() {
        return documentLink;
    }

    public void setDocumentLink(String documentLink) {
        this.documentLink = documentLink;
    }

    public GetPublicLibAndAwsResp withIsFavorite(Integer isFavorite) {
        this.isFavorite = isFavorite;
        return this;
    }

    /**
     * 保留字段
     * @return isFavorite
     */
    public Integer getIsFavorite() {
        return isFavorite;
    }

    public void setIsFavorite(Integer isFavorite) {
        this.isFavorite = isFavorite;
    }

    public GetPublicLibAndAwsResp withPublicAwDescription(String publicAwDescription) {
        this.publicAwDescription = publicAwDescription;
        return this;
    }

    /**
     * 公共关键字描述
     * @return publicAwDescription
     */
    public String getPublicAwDescription() {
        return publicAwDescription;
    }

    public void setPublicAwDescription(String publicAwDescription) {
        this.publicAwDescription = publicAwDescription;
    }

    public GetPublicLibAndAwsResp withPublicAwId(String publicAwId) {
        this.publicAwId = publicAwId;
        return this;
    }

    /**
     * 公共关键字唯一ID
     * @return publicAwId
     */
    public String getPublicAwId() {
        return publicAwId;
    }

    public void setPublicAwId(String publicAwId) {
        this.publicAwId = publicAwId;
    }

    public GetPublicLibAndAwsResp withPublicAwLibId(String publicAwLibId) {
        this.publicAwLibId = publicAwLibId;
        return this;
    }

    /**
     * 公共关键库唯一ID
     * @return publicAwLibId
     */
    public String getPublicAwLibId() {
        return publicAwLibId;
    }

    public void setPublicAwLibId(String publicAwLibId) {
        this.publicAwLibId = publicAwLibId;
    }

    public GetPublicLibAndAwsResp withPublicAwLibName(String publicAwLibName) {
        this.publicAwLibName = publicAwLibName;
        return this;
    }

    /**
     * 公共关键字库名称
     * @return publicAwLibName
     */
    public String getPublicAwLibName() {
        return publicAwLibName;
    }

    public void setPublicAwLibName(String publicAwLibName) {
        this.publicAwLibName = publicAwLibName;
    }

    public GetPublicLibAndAwsResp withPublicAwMark(Integer publicAwMark) {
        this.publicAwMark = publicAwMark;
        return this;
    }

    /**
     * 保留字段
     * @return publicAwMark
     */
    public Integer getPublicAwMark() {
        return publicAwMark;
    }

    public void setPublicAwMark(Integer publicAwMark) {
        this.publicAwMark = publicAwMark;
    }

    public GetPublicLibAndAwsResp withPublicAwName(String publicAwName) {
        this.publicAwName = publicAwName;
        return this;
    }

    /**
     * 公共关键字名称
     * @return publicAwName
     */
    public String getPublicAwName() {
        return publicAwName;
    }

    public void setPublicAwName(String publicAwName) {
        this.publicAwName = publicAwName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetPublicLibAndAwsResp that = (GetPublicLibAndAwsResp) obj;
        return Objects.equals(this.awTag, that.awTag) && Objects.equals(this.documentLink, that.documentLink)
            && Objects.equals(this.isFavorite, that.isFavorite)
            && Objects.equals(this.publicAwDescription, that.publicAwDescription)
            && Objects.equals(this.publicAwId, that.publicAwId)
            && Objects.equals(this.publicAwLibId, that.publicAwLibId)
            && Objects.equals(this.publicAwLibName, that.publicAwLibName)
            && Objects.equals(this.publicAwMark, that.publicAwMark)
            && Objects.equals(this.publicAwName, that.publicAwName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(awTag,
            documentLink,
            isFavorite,
            publicAwDescription,
            publicAwId,
            publicAwLibId,
            publicAwLibName,
            publicAwMark,
            publicAwName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetPublicLibAndAwsResp {\n");
        sb.append("    awTag: ").append(toIndentedString(awTag)).append("\n");
        sb.append("    documentLink: ").append(toIndentedString(documentLink)).append("\n");
        sb.append("    isFavorite: ").append(toIndentedString(isFavorite)).append("\n");
        sb.append("    publicAwDescription: ").append(toIndentedString(publicAwDescription)).append("\n");
        sb.append("    publicAwId: ").append(toIndentedString(publicAwId)).append("\n");
        sb.append("    publicAwLibId: ").append(toIndentedString(publicAwLibId)).append("\n");
        sb.append("    publicAwLibName: ").append(toIndentedString(publicAwLibName)).append("\n");
        sb.append("    publicAwMark: ").append(toIndentedString(publicAwMark)).append("\n");
        sb.append("    publicAwName: ").append(toIndentedString(publicAwName)).append("\n");
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
