package com.huaweicloud.sdk.swr.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowAccessDomainRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="namespace")
    
    private String namespace;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="repository")
    
    private String repository;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="access_domain")
    
    private String accessDomain;

    public ShowAccessDomainRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    


    /**
     * 组织名称
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    

    public ShowAccessDomainRequest withRepository(String repository) {
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

    

    public ShowAccessDomainRequest withAccessDomain(String accessDomain) {
        this.accessDomain = accessDomain;
        return this;
    }

    


    /**
     * 共享账号
     * @return accessDomain
     */
    public String getAccessDomain() {
        return accessDomain;
    }

    public void setAccessDomain(String accessDomain) {
        this.accessDomain = accessDomain;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowAccessDomainRequest showAccessDomainRequest = (ShowAccessDomainRequest) o;
        return Objects.equals(this.namespace, showAccessDomainRequest.namespace) &&
            Objects.equals(this.repository, showAccessDomainRequest.repository) &&
            Objects.equals(this.accessDomain, showAccessDomainRequest.accessDomain);
    }
    @Override
    public int hashCode() {
        return Objects.hash(namespace, repository, accessDomain);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAccessDomainRequest {\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    accessDomain: ").append(toIndentedString(accessDomain)).append("\n");
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

