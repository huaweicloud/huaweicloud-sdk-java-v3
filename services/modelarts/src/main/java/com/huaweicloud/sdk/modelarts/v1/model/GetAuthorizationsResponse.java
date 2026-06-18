package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class GetAuthorizationsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private BigDecimal totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth")

    private List<AuthorizationResponse> auth = null;

    public GetAuthorizationsResponse withTotalCount(BigDecimal totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * **参数解释**：授权信息总数。 **取值范围**：不涉及。
     * @return totalCount
     */
    public BigDecimal getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(BigDecimal totalCount) {
        this.totalCount = totalCount;
    }

    public GetAuthorizationsResponse withAuth(List<AuthorizationResponse> auth) {
        this.auth = auth;
        return this;
    }

    public GetAuthorizationsResponse addAuthItem(AuthorizationResponse authItem) {
        if (this.auth == null) {
            this.auth = new ArrayList<>();
        }
        this.auth.add(authItem);
        return this;
    }

    public GetAuthorizationsResponse withAuth(Consumer<List<AuthorizationResponse>> authSetter) {
        if (this.auth == null) {
            this.auth = new ArrayList<>();
        }
        authSetter.accept(this.auth);
        return this;
    }

    /**
     * **参数解释**：授权信息列表。
     * @return auth
     */
    public List<AuthorizationResponse> getAuth() {
        return auth;
    }

    public void setAuth(List<AuthorizationResponse> auth) {
        this.auth = auth;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetAuthorizationsResponse that = (GetAuthorizationsResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.auth, that.auth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, auth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetAuthorizationsResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
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
