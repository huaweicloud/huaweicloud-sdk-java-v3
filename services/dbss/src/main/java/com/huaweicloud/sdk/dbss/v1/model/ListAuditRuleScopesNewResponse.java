package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListAuditRuleScopesNewResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scopes")

    private List<RuleScopeInfo> scopes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListAuditRuleScopesNewResponse withScopes(List<RuleScopeInfo> scopes) {
        this.scopes = scopes;
        return this;
    }

    public ListAuditRuleScopesNewResponse addScopesItem(RuleScopeInfo scopesItem) {
        if (this.scopes == null) {
            this.scopes = new ArrayList<>();
        }
        this.scopes.add(scopesItem);
        return this;
    }

    public ListAuditRuleScopesNewResponse withScopes(Consumer<List<RuleScopeInfo>> scopesSetter) {
        if (this.scopes == null) {
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

    public ListAuditRuleScopesNewResponse withTotal(Integer total) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAuditRuleScopesNewResponse that = (ListAuditRuleScopesNewResponse) obj;
        return Objects.equals(this.scopes, that.scopes) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scopes, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAuditRuleScopesNewResponse {\n");
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
