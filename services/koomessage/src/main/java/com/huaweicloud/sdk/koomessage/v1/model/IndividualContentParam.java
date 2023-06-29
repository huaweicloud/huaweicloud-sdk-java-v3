package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 智能信息基础版参数名称。
 */
public class IndividualContentParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_name")

    private String paramName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_type")

    private String contentType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_source")

    private String contentSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_detail")

    private String contentDetail;

    public IndividualContentParam withParamName(String paramName) {
        this.paramName = paramName;
        return this;
    }

    /**
     * 智能信息基础版参数名称。
     * @return paramName
     */
    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public IndividualContentParam withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * 智能信息基础版参数类型。txt：纯文字动参。 
     * @return contentType
     */
    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public IndividualContentParam withContentSource(String contentSource) {
        this.contentSource = contentSource;
        return this;
    }

    /**
     * 智能信息基础版参数源。txt：内容源自纯文字。 
     * @return contentSource
     */
    public String getContentSource() {
        return contentSource;
    }

    public void setContentSource(String contentSource) {
        this.contentSource = contentSource;
    }

    public IndividualContentParam withContentDetail(String contentDetail) {
        this.contentDetail = contentDetail;
        return this;
    }

    /**
     * 智能信息基础版参数内容，填写经过utf-8编码的文字。 
     * @return contentDetail
     */
    public String getContentDetail() {
        return contentDetail;
    }

    public void setContentDetail(String contentDetail) {
        this.contentDetail = contentDetail;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IndividualContentParam that = (IndividualContentParam) obj;
        return Objects.equals(this.paramName, that.paramName) && Objects.equals(this.contentType, that.contentType)
            && Objects.equals(this.contentSource, that.contentSource)
            && Objects.equals(this.contentDetail, that.contentDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paramName, contentType, contentSource, contentDetail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IndividualContentParam {\n");
        sb.append("    paramName: ").append(toIndentedString(paramName)).append("\n");
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
        sb.append("    contentSource: ").append(toIndentedString(contentSource)).append("\n");
        sb.append("    contentDetail: ").append(toIndentedString(contentDetail)).append("\n");
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
