package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateRepoDomainsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    @JacksonXmlProperty(localName = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository")

    @JacksonXmlProperty(localName = "repository")

    private String repository;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_domain")

    @JacksonXmlProperty(localName = "access_domain")

    private String accessDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private UpdateRepoDomainsRequestBody body;

    public UpdateRepoDomainsRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 组织名称。小写字母开头，后面跟小写字母、数字、小数点、下划线或中划线（其中下划线最多允许连续两个，小数点、下划线、中划线不能直接相连），小写字母或数字结尾，1-64个字符。
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public UpdateRepoDomainsRequest withRepository(String repository) {
        this.repository = repository;
        return this;
    }

    /**
     * 镜像仓库名称
     * @return repository
     */
    public String getRepository() {
        return repository;
    }

    public void setRepository(String repository) {
        this.repository = repository;
    }

    public UpdateRepoDomainsRequest withAccessDomain(String accessDomain) {
        this.accessDomain = accessDomain;
        return this;
    }

    /**
     * 共享帐号
     * @return accessDomain
     */
    public String getAccessDomain() {
        return accessDomain;
    }

    public void setAccessDomain(String accessDomain) {
        this.accessDomain = accessDomain;
    }

    public UpdateRepoDomainsRequest withBody(UpdateRepoDomainsRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateRepoDomainsRequest withBody(Consumer<UpdateRepoDomainsRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateRepoDomainsRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateRepoDomainsRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateRepoDomainsRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateRepoDomainsRequest updateRepoDomainsRequest = (UpdateRepoDomainsRequest) o;
        return Objects.equals(this.namespace, updateRepoDomainsRequest.namespace)
            && Objects.equals(this.repository, updateRepoDomainsRequest.repository)
            && Objects.equals(this.accessDomain, updateRepoDomainsRequest.accessDomain)
            && Objects.equals(this.body, updateRepoDomainsRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namespace, repository, accessDomain, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRepoDomainsRequest {\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    accessDomain: ").append(toIndentedString(accessDomain)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
