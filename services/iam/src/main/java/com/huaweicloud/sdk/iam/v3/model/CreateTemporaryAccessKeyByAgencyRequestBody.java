package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class CreateTemporaryAccessKeyByAgencyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth")

    private AgencyAuth auth;

    public CreateTemporaryAccessKeyByAgencyRequestBody withAuth(AgencyAuth auth) {
        this.auth = auth;
        return this;
    }

    public CreateTemporaryAccessKeyByAgencyRequestBody withAuth(Consumer<AgencyAuth> authSetter) {
        if (this.auth == null) {
            this.auth = new AgencyAuth();
            authSetter.accept(this.auth);
        }

        return this;
    }

    /** Get auth
     * 
     * @return auth */
    public AgencyAuth getAuth() {
        return auth;
    }

    public void setAuth(AgencyAuth auth) {
        this.auth = auth;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateTemporaryAccessKeyByAgencyRequestBody createTemporaryAccessKeyByAgencyRequestBody =
            (CreateTemporaryAccessKeyByAgencyRequestBody) o;
        return Objects.equals(this.auth, createTemporaryAccessKeyByAgencyRequestBody.auth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(auth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTemporaryAccessKeyByAgencyRequestBody {\n");
        sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
