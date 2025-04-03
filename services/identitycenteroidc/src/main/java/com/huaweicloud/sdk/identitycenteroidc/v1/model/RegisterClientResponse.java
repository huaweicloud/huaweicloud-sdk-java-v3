package com.huaweicloud.sdk.identitycenteroidc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class RegisterClientResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_info")

    private ClientInfoDto clientInfo;

    public RegisterClientResponse withClientInfo(ClientInfoDto clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }

    public RegisterClientResponse withClientInfo(Consumer<ClientInfoDto> clientInfoSetter) {
        if (this.clientInfo == null) {
            this.clientInfo = new ClientInfoDto();
            clientInfoSetter.accept(this.clientInfo);
        }

        return this;
    }

    /**
     * Get clientInfo
     * @return clientInfo
     */
    public ClientInfoDto getClientInfo() {
        return clientInfo;
    }

    public void setClientInfo(ClientInfoDto clientInfo) {
        this.clientInfo = clientInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RegisterClientResponse that = (RegisterClientResponse) obj;
        return Objects.equals(this.clientInfo, that.clientInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RegisterClientResponse {\n");
        sb.append("    clientInfo: ").append(toIndentedString(clientInfo)).append("\n");
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
