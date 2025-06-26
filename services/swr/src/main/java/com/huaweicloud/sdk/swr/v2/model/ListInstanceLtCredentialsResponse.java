package com.huaweicloud.sdk.swr.v2.model;

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
public class ListInstanceLtCredentialsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_tokens")

    private List<AuthToken> authTokens = null;

    public ListInstanceLtCredentialsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 长期访问凭据总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListInstanceLtCredentialsResponse withAuthTokens(List<AuthToken> authTokens) {
        this.authTokens = authTokens;
        return this;
    }

    public ListInstanceLtCredentialsResponse addAuthTokensItem(AuthToken authTokensItem) {
        if (this.authTokens == null) {
            this.authTokens = new ArrayList<>();
        }
        this.authTokens.add(authTokensItem);
        return this;
    }

    public ListInstanceLtCredentialsResponse withAuthTokens(Consumer<List<AuthToken>> authTokensSetter) {
        if (this.authTokens == null) {
            this.authTokens = new ArrayList<>();
        }
        authTokensSetter.accept(this.authTokens);
        return this;
    }

    /**
     * 长期访问凭证列表
     * @return authTokens
     */
    public List<AuthToken> getAuthTokens() {
        return authTokens;
    }

    public void setAuthTokens(List<AuthToken> authTokens) {
        this.authTokens = authTokens;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstanceLtCredentialsResponse that = (ListInstanceLtCredentialsResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.authTokens, that.authTokens);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, authTokens);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceLtCredentialsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    authTokens: ").append(toIndentedString(authTokens)).append("\n");
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
