package com.huaweicloud.sdk.iam.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.DomainInfo;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * project信息
 */
public class ProjectInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain")
    
    private DomainInfo domain;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;

    public ProjectInfo withDomain(DomainInfo domain) {
        this.domain = domain;
        return this;
    }

    public ProjectInfo withDomain(Consumer<DomainInfo> domainSetter) {
        if(this.domain == null ){
            this.domain = new DomainInfo();
            domainSetter.accept(this.domain);
        }
        
        return this;
    }


    /**
     * Get domain
     * @return domain
     */
    public DomainInfo getDomain() {
        return domain;
    }

    public void setDomain(DomainInfo domain) {
        this.domain = domain;
    }

    

    public ProjectInfo withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * project id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public ProjectInfo withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * project name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProjectInfo projectInfo = (ProjectInfo) o;
        return Objects.equals(this.domain, projectInfo.domain) &&
            Objects.equals(this.id, projectInfo.id) &&
            Objects.equals(this.name, projectInfo.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(domain, id, name);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectInfo {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

