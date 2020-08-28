package com.huaweicloud.sdk.codehub.v3.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * RepoMemberInfo
 */
public class RepoMemberInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_id")
    
    private String domainId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_name")
    
    private String domainName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="role")
    
    private String role;

    public RepoMemberInfo withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    


    /**
     * 用户的租户ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public RepoMemberInfo withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    


    /**
     * 用户的租户名称
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public RepoMemberInfo withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 添加的用户ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RepoMemberInfo withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 添加的用户名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RepoMemberInfo withRole(String role) {
        this.role = role;
        return this;
    }

    


    /**
     * 添加的用户权限，取值范围：30->普通成员，40->管理员
     * @return role
     */
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepoMemberInfo repoMemberInfo = (RepoMemberInfo) o;
        return Objects.equals(this.domainId, repoMemberInfo.domainId) &&
            Objects.equals(this.domainName, repoMemberInfo.domainName) &&
            Objects.equals(this.id, repoMemberInfo.id) &&
            Objects.equals(this.name, repoMemberInfo.name) &&
            Objects.equals(this.role, repoMemberInfo.role);
    }
    @Override
    public int hashCode() {
        return Objects.hash(domainId, domainName, id, name, role);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepoMemberInfo {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

