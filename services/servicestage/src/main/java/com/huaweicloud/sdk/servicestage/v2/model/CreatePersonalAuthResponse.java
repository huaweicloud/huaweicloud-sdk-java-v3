package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreatePersonalAuthResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorization")

    @JacksonXmlProperty(localName = "authorization")

    private AuthorizationVO authorization;

    public CreatePersonalAuthResponse withAuthorization(AuthorizationVO authorization) {
        this.authorization = authorization;
        return this;
    }

    public CreatePersonalAuthResponse withAuthorization(Consumer<AuthorizationVO> authorizationSetter) {
        if (this.authorization == null) {
            this.authorization = new AuthorizationVO();
            authorizationSetter.accept(this.authorization);
        }

        return this;
    }

    /**
     * Get authorization
     * @return authorization
     */
    public AuthorizationVO getAuthorization() {
        return authorization;
    }

    public void setAuthorization(AuthorizationVO authorization) {
        this.authorization = authorization;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreatePersonalAuthResponse createPersonalAuthResponse = (CreatePersonalAuthResponse) o;
        return Objects.equals(this.authorization, createPersonalAuthResponse.authorization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorization);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePersonalAuthResponse {\n");
        sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
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
