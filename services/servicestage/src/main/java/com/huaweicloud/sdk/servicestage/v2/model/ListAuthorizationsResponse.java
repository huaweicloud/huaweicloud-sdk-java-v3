package com.huaweicloud.sdk.servicestage.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.servicestage.v2.model.AuthorizationVO;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListAuthorizationsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="authorizations")
    
    private List<AuthorizationVO> authorizations = null;
    
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
        if(this.authorizations == null ){
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
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAuthorizationsResponse listAuthorizationsResponse = (ListAuthorizationsResponse) o;
        return Objects.equals(this.authorizations, listAuthorizationsResponse.authorizations);
    }
    @Override
    public int hashCode() {
        return Objects.hash(authorizations);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAuthorizationsResponse {\n");
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

