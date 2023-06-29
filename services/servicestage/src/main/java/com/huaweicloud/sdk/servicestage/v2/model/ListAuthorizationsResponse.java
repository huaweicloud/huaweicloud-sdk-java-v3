package com.huaweicloud.sdk.servicestage.v2.model;

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
public class ListAuthorizationsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorizations")

    private List<AuthorizationVO> authorizations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListAuthorizationsResponse withAuthorizations(List<AuthorizationVO> authorizations) {
        this.authorizations = authorizations;
        return this;
    }

    public ListAuthorizationsResponse addAuthorizationsItem(AuthorizationVO authorizationsItem) {
        if (this.authorizations == null) {
            this.authorizations = new ArrayList<>();
        }
        this.authorizations.add(authorizationsItem);
        return this;
    }

    public ListAuthorizationsResponse withAuthorizations(Consumer<List<AuthorizationVO>> authorizationsSetter) {
        if (this.authorizations == null) {
            this.authorizations = new ArrayList<>();
        }
        authorizationsSetter.accept(this.authorizations);
        return this;
    }

    /**
     * 授权列表。
     * @return authorizations
     */
    public List<AuthorizationVO> getAuthorizations() {
        return authorizations;
    }

    public void setAuthorizations(List<AuthorizationVO> authorizations) {
        this.authorizations = authorizations;
    }

    public ListAuthorizationsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 仓库授权数量。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAuthorizationsResponse that = (ListAuthorizationsResponse) obj;
        return Objects.equals(this.authorizations, that.authorizations) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorizations, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAuthorizationsResponse {\n");
        sb.append("    authorizations: ").append(toIndentedString(authorizations)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
