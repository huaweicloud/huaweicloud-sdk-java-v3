package com.huaweicloud.sdk.orgid.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 业务响应
 */
public class ServiceResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authenticationFailure")

    private CasServiceResponseAuthenticationFailure authenticationFailure;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authenticationSuccess")

    private CasServiceResponseAuthenticationSuccess authenticationSuccess;

    public ServiceResponse withAuthenticationFailure(CasServiceResponseAuthenticationFailure authenticationFailure) {
        this.authenticationFailure = authenticationFailure;
        return this;
    }

    public ServiceResponse withAuthenticationFailure(
        Consumer<CasServiceResponseAuthenticationFailure> authenticationFailureSetter) {
        if (this.authenticationFailure == null) {
            this.authenticationFailure = new CasServiceResponseAuthenticationFailure();
            authenticationFailureSetter.accept(this.authenticationFailure);
        }

        return this;
    }

    /**
     * Get authenticationFailure
     * @return authenticationFailure
     */
    public CasServiceResponseAuthenticationFailure getAuthenticationFailure() {
        return authenticationFailure;
    }

    public void setAuthenticationFailure(CasServiceResponseAuthenticationFailure authenticationFailure) {
        this.authenticationFailure = authenticationFailure;
    }

    public ServiceResponse withAuthenticationSuccess(CasServiceResponseAuthenticationSuccess authenticationSuccess) {
        this.authenticationSuccess = authenticationSuccess;
        return this;
    }

    public ServiceResponse withAuthenticationSuccess(
        Consumer<CasServiceResponseAuthenticationSuccess> authenticationSuccessSetter) {
        if (this.authenticationSuccess == null) {
            this.authenticationSuccess = new CasServiceResponseAuthenticationSuccess();
            authenticationSuccessSetter.accept(this.authenticationSuccess);
        }

        return this;
    }

    /**
     * Get authenticationSuccess
     * @return authenticationSuccess
     */
    public CasServiceResponseAuthenticationSuccess getAuthenticationSuccess() {
        return authenticationSuccess;
    }

    public void setAuthenticationSuccess(CasServiceResponseAuthenticationSuccess authenticationSuccess) {
        this.authenticationSuccess = authenticationSuccess;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServiceResponse that = (ServiceResponse) obj;
        return Objects.equals(this.authenticationFailure, that.authenticationFailure)
            && Objects.equals(this.authenticationSuccess, that.authenticationSuccess);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authenticationFailure, authenticationSuccess);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceResponse {\n");
        sb.append("    authenticationFailure: ").append(toIndentedString(authenticationFailure)).append("\n");
        sb.append("    authenticationSuccess: ").append(toIndentedString(authenticationSuccess)).append("\n");
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
