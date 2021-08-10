package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 设置HTTP头参数。取值：\&quot;Content-Disposition\&quot;, \&quot;Content-Language\&quot;,
 * \&quot;Access-Control-Allow-Origin\&quot;,\&quot;Access-Control-Allow-Methods\&quot;,
 * \&quot;Access-Control-Max-Age\&quot;, \&quot;Access-Control-Expose-Headers\&quot;。 */
public class HeaderMap {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Content-Disposition")

    private String contentDisposition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Content-Language")

    private String contentLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Access-Control-Allow-Origin")

    private String accessControlAllowOrigin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Access-Control-Allow-Methods")

    private String accessControlAllowMethods;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Access-Control-Max-Age")

    private String accessControlMaxAge;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Access-Control-Expose-Headers")

    private String accessControlExposeHeaders;

    public HeaderMap withContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
        return this;
    }

    /** 指示回复的内容该以何种形式展示
     * 
     * @return contentDisposition */
    public String getContentDisposition() {
        return contentDisposition;
    }

    public void setContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
    }

    public HeaderMap withContentLanguage(String contentLanguage) {
        this.contentLanguage = contentLanguage;
        return this;
    }

    /** 说明访问者希望采用的语言或语言组合
     * 
     * @return contentLanguage */
    public String getContentLanguage() {
        return contentLanguage;
    }

    public void setContentLanguage(String contentLanguage) {
        this.contentLanguage = contentLanguage;
    }

    public HeaderMap withAccessControlAllowOrigin(String accessControlAllowOrigin) {
        this.accessControlAllowOrigin = accessControlAllowOrigin;
        return this;
    }

    /** 指定了该响应的资源是否被允许与给定的origin共享
     * 
     * @return accessControlAllowOrigin */
    public String getAccessControlAllowOrigin() {
        return accessControlAllowOrigin;
    }

    public void setAccessControlAllowOrigin(String accessControlAllowOrigin) {
        this.accessControlAllowOrigin = accessControlAllowOrigin;
    }

    public HeaderMap withAccessControlAllowMethods(String accessControlAllowMethods) {
        this.accessControlAllowMethods = accessControlAllowMethods;
        return this;
    }

    /** 明确了客户端所要访问的资源允许使用的方法或方法列表
     * 
     * @return accessControlAllowMethods */
    public String getAccessControlAllowMethods() {
        return accessControlAllowMethods;
    }

    public void setAccessControlAllowMethods(String accessControlAllowMethods) {
        this.accessControlAllowMethods = accessControlAllowMethods;
    }

    public HeaderMap withAccessControlMaxAge(String accessControlMaxAge) {
        this.accessControlMaxAge = accessControlMaxAge;
        return this;
    }

    /** Access-Control-Allow-Methods 和Access-Control-Allow-Headers 提供的信息可以被缓存多久
     * 
     * @return accessControlMaxAge */
    public String getAccessControlMaxAge() {
        return accessControlMaxAge;
    }

    public void setAccessControlMaxAge(String accessControlMaxAge) {
        this.accessControlMaxAge = accessControlMaxAge;
    }

    public HeaderMap withAccessControlExposeHeaders(String accessControlExposeHeaders) {
        this.accessControlExposeHeaders = accessControlExposeHeaders;
        return this;
    }

    /** 列出了哪些首部可以作为响应的一部分暴露给外部
     * 
     * @return accessControlExposeHeaders */
    public String getAccessControlExposeHeaders() {
        return accessControlExposeHeaders;
    }

    public void setAccessControlExposeHeaders(String accessControlExposeHeaders) {
        this.accessControlExposeHeaders = accessControlExposeHeaders;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HeaderMap headerMap = (HeaderMap) o;
        return Objects.equals(this.contentDisposition, headerMap.contentDisposition)
            && Objects.equals(this.contentLanguage, headerMap.contentLanguage)
            && Objects.equals(this.accessControlAllowOrigin, headerMap.accessControlAllowOrigin)
            && Objects.equals(this.accessControlAllowMethods, headerMap.accessControlAllowMethods)
            && Objects.equals(this.accessControlMaxAge, headerMap.accessControlMaxAge)
            && Objects.equals(this.accessControlExposeHeaders, headerMap.accessControlExposeHeaders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentDisposition,
            contentLanguage,
            accessControlAllowOrigin,
            accessControlAllowMethods,
            accessControlMaxAge,
            accessControlExposeHeaders);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HeaderMap {\n");
        sb.append("    contentDisposition: ").append(toIndentedString(contentDisposition)).append("\n");
        sb.append("    contentLanguage: ").append(toIndentedString(contentLanguage)).append("\n");
        sb.append("    accessControlAllowOrigin: ").append(toIndentedString(accessControlAllowOrigin)).append("\n");
        sb.append("    accessControlAllowMethods: ").append(toIndentedString(accessControlAllowMethods)).append("\n");
        sb.append("    accessControlMaxAge: ").append(toIndentedString(accessControlMaxAge)).append("\n");
        sb.append("    accessControlExposeHeaders: ").append(toIndentedString(accessControlExposeHeaders)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
