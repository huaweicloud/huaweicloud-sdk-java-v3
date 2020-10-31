package com.huaweicloud.sdk.iam.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.TokenCatalog;
import com.huaweicloud.sdk.iam.v3.model.TokenDomainResult;
import com.huaweicloud.sdk.iam.v3.model.TokenProjectResult;
import com.huaweicloud.sdk.iam.v3.model.TokenRole;
import com.huaweicloud.sdk.iam.v3.model.TokenUserResult;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class TokenResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="catalog")
    
    private List<TokenCatalog> catalog = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain")
    
    private TokenDomainResult domain = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="expires_at")
    
    private String expiresAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="issued_at")
    
    private String issuedAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="methods")
    
    private List<String> methods = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project")
    
    private TokenProjectResult project = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="roles")
    
    private List<TokenRole> roles = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user")
    
    private TokenUserResult user = null;

    public TokenResult withCatalog(List<TokenCatalog> catalog) {
        this.catalog = catalog;
        return this;
    }

    
    public TokenResult addCatalogItem(TokenCatalog catalogItem) {
        this.catalog.add(catalogItem);
        return this;
    }

    public TokenResult withCatalog(Consumer<List<TokenCatalog>> catalogSetter) {
        if(this.catalog == null ){
            this.catalog = new ArrayList<>();
        }
        catalogSetter.accept(this.catalog);
        return this;
    }

    /**
     * 服务目录信息。
     * @return catalog
     */
    public List<TokenCatalog> getCatalog() {
        return catalog;
    }

    public void setCatalog(List<TokenCatalog> catalog) {
        this.catalog = catalog;
    }

    public TokenResult withDomain(TokenDomainResult domain) {
        this.domain = domain;
        return this;
    }

    public TokenResult withDomain(Consumer<TokenDomainResult> domainSetter) {
        if(this.domain == null ){
            this.domain = new TokenDomainResult();
            domainSetter.accept(this.domain);
        }
        
        return this;
    }


    /**
     * Get domain
     * @return domain
     */
    public TokenDomainResult getDomain() {
        return domain;
    }

    public void setDomain(TokenDomainResult domain) {
        this.domain = domain;
    }

    public TokenResult withExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    


    /**
     * token过期时间。
     * @return expiresAt
     */
    public String getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
    }

    public TokenResult withIssuedAt(String issuedAt) {
        this.issuedAt = issuedAt;
        return this;
    }

    


    /**
     * token下发时间。
     * @return issuedAt
     */
    public String getIssuedAt() {
        return issuedAt;
    }

    public void setIssuedAt(String issuedAt) {
        this.issuedAt = issuedAt;
    }

    public TokenResult withMethods(List<String> methods) {
        this.methods = methods;
        return this;
    }

    
    public TokenResult addMethodsItem(String methodsItem) {
        this.methods.add(methodsItem);
        return this;
    }

    public TokenResult withMethods(Consumer<List<String>> methodsSetter) {
        if(this.methods == null ){
            this.methods = new ArrayList<>();
        }
        methodsSetter.accept(this.methods);
        return this;
    }

    /**
     * 获取token的方式。
     * @return methods
     */
    public List<String> getMethods() {
        return methods;
    }

    public void setMethods(List<String> methods) {
        this.methods = methods;
    }

    public TokenResult withProject(TokenProjectResult project) {
        this.project = project;
        return this;
    }

    public TokenResult withProject(Consumer<TokenProjectResult> projectSetter) {
        if(this.project == null ){
            this.project = new TokenProjectResult();
            projectSetter.accept(this.project);
        }
        
        return this;
    }


    /**
     * Get project
     * @return project
     */
    public TokenProjectResult getProject() {
        return project;
    }

    public void setProject(TokenProjectResult project) {
        this.project = project;
    }

    public TokenResult withRoles(List<TokenRole> roles) {
        this.roles = roles;
        return this;
    }

    
    public TokenResult addRolesItem(TokenRole rolesItem) {
        this.roles.add(rolesItem);
        return this;
    }

    public TokenResult withRoles(Consumer<List<TokenRole>> rolesSetter) {
        if(this.roles == null ){
            this.roles = new ArrayList<>();
        }
        rolesSetter.accept(this.roles);
        return this;
    }

    /**
     * token的权限信息。
     * @return roles
     */
    public List<TokenRole> getRoles() {
        return roles;
    }

    public void setRoles(List<TokenRole> roles) {
        this.roles = roles;
    }

    public TokenResult withUser(TokenUserResult user) {
        this.user = user;
        return this;
    }

    public TokenResult withUser(Consumer<TokenUserResult> userSetter) {
        if(this.user == null ){
            this.user = new TokenUserResult();
            userSetter.accept(this.user);
        }
        
        return this;
    }


    /**
     * Get user
     * @return user
     */
    public TokenUserResult getUser() {
        return user;
    }

    public void setUser(TokenUserResult user) {
        this.user = user;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TokenResult tokenResult = (TokenResult) o;
        return Objects.equals(this.catalog, tokenResult.catalog) &&
            Objects.equals(this.domain, tokenResult.domain) &&
            Objects.equals(this.expiresAt, tokenResult.expiresAt) &&
            Objects.equals(this.issuedAt, tokenResult.issuedAt) &&
            Objects.equals(this.methods, tokenResult.methods) &&
            Objects.equals(this.project, tokenResult.project) &&
            Objects.equals(this.roles, tokenResult.roles) &&
            Objects.equals(this.user, tokenResult.user);
    }
    @Override
    public int hashCode() {
        return Objects.hash(catalog, domain, expiresAt, issuedAt, methods, project, roles, user);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TokenResult {\n");
        sb.append("    catalog: ").append(toIndentedString(catalog)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
        sb.append("    issuedAt: ").append(toIndentedString(issuedAt)).append("\n");
        sb.append("    methods: ").append(toIndentedString(methods)).append("\n");
        sb.append("    project: ").append(toIndentedString(project)).append("\n");
        sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

