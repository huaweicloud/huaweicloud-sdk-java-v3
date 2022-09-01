package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * UpdateCertificateRequestBody
 */
public class UpdateCertificateRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    @JacksonXmlProperty(localName = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    @JacksonXmlProperty(localName = "key")

    private String key;

    public UpdateCertificateRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 证书名称，证书名称只能由数字、字母、中划线、下划线和英文句点组成，长度不能超过64位字符
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateCertificateRequestBody withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 证书文件，仅支持PEM格式的证书和私钥文件，且文件中的换行符应以\\n替换
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public UpdateCertificateRequestBody withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 证书私钥，仅支持PEM格式的证书和私钥文件，且文件中的换行符应以\\n替换
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateCertificateRequestBody updateCertificateRequestBody = (UpdateCertificateRequestBody) o;
        return Objects.equals(this.name, updateCertificateRequestBody.name)
            && Objects.equals(this.content, updateCertificateRequestBody.content)
            && Objects.equals(this.key, updateCertificateRequestBody.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, content, key);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCertificateRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
