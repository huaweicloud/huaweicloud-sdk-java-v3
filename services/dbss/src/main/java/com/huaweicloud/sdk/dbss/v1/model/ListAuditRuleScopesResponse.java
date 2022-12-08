package com.huaweicloud.sdk.dbss.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dbss.v1.model.RuleScopeInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListAuditRuleScopesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scopes")
    
    
    private List<RuleScopeInfo> scopes = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    
    private Integer total;

    public ListAuditRuleScopesResponse withScopes(List<RuleScopeInfo> scopes) {
        this.scopes = scopes;
        return this;
    }

    
    public ListAuditRuleScopesResponse addScopesItem(RuleScopeInfo scopesItem) {
        if(this.scopes == null) {
            this.scopes = new ArrayList<>();
        }
        this.scopes.add(scopesItem);
        return this;
    }

    public ListAuditRuleScopesResponse withScopes(Consumer<List<RuleScopeInfo>> scopesSetter) {
        if(this.scopes == null) {
            this.scopes = new ArrayList<>();
        }
        scopesSetter.accept(this.scopes);
        return this;
    }

    /**
     * 审计范围规则列表
     * @return scopes
     */
    public List<RuleScopeInfo> getScopes() {
        return scopes;
    }

    public void setScopes(List<RuleScopeInfo> scopes) {
        this.scopes = scopes;
    }

    

    public ListAuditRuleScopesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAuditRuleScopesResponse listAuditRuleScopesResponse = (ListAuditRuleScopesResponse) o;
        return Objects.equals(this.scopes, listAuditRuleScopesResponse.scopes) &&
            Objects.equals(this.total, listAuditRuleScopesResponse.total);
    }
    @Override
    public int hashCode() {
        return Objects.hash(scopes, total);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAuditRuleScopesResponse {\n");
        sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

