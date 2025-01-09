package com.huaweicloud.sdk.workspaceapp.v1.model;

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
public class ListAppGroupAuthorizationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorizations")

    private List<Authorization> authorizations = null;

    public ListAppGroupAuthorizationResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 总数。
     * minimum: 0
     * maximum: 2147483647
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListAppGroupAuthorizationResponse withAuthorizations(List<Authorization> authorizations) {
        this.authorizations = authorizations;
        return this;
    }

    public ListAppGroupAuthorizationResponse addAuthorizationsItem(Authorization authorizationsItem) {
        if (this.authorizations == null) {
            this.authorizations = new ArrayList<>();
        }
        this.authorizations.add(authorizationsItem);
        return this;
    }

    public ListAppGroupAuthorizationResponse withAuthorizations(Consumer<List<Authorization>> authorizationsSetter) {
        if (this.authorizations == null) {
            this.authorizations = new ArrayList<>();
        }
        authorizationsSetter.accept(this.authorizations);
        return this;
    }

    /**
     * 授权信息。
     * @return authorizations
     */
    public List<Authorization> getAuthorizations() {
        return authorizations;
    }

    public void setAuthorizations(List<Authorization> authorizations) {
        this.authorizations = authorizations;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAppGroupAuthorizationResponse that = (ListAppGroupAuthorizationResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.authorizations, that.authorizations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, authorizations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAppGroupAuthorizationResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    authorizations: ").append(toIndentedString(authorizations)).append("\n");
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
