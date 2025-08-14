package com.huaweicloud.sdk.identitycenterstore.v1.model;

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
public class ListBearerTokensResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bearer_tokens")

    private List<BearerToken> bearerTokens = null;

    public ListBearerTokensResponse withBearerTokens(List<BearerToken> bearerTokens) {
        this.bearerTokens = bearerTokens;
        return this;
    }

    public ListBearerTokensResponse addBearerTokensItem(BearerToken bearerTokensItem) {
        if (this.bearerTokens == null) {
            this.bearerTokens = new ArrayList<>();
        }
        this.bearerTokens.add(bearerTokensItem);
        return this;
    }

    public ListBearerTokensResponse withBearerTokens(Consumer<List<BearerToken>> bearerTokensSetter) {
        if (this.bearerTokens == null) {
            this.bearerTokens = new ArrayList<>();
        }
        bearerTokensSetter.accept(this.bearerTokens);
        return this;
    }

    /**
     * 访问令牌列表
     * @return bearerTokens
     */
    public List<BearerToken> getBearerTokens() {
        return bearerTokens;
    }

    public void setBearerTokens(List<BearerToken> bearerTokens) {
        this.bearerTokens = bearerTokens;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListBearerTokensResponse that = (ListBearerTokensResponse) obj;
        return Objects.equals(this.bearerTokens, that.bearerTokens);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bearerTokens);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBearerTokensResponse {\n");
        sb.append("    bearerTokens: ").append(toIndentedString(bearerTokens)).append("\n");
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
