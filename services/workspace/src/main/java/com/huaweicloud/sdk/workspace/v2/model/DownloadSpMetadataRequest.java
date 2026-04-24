package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DownloadSpMetadataRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identity_provider")

    private String identityProvider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_server_address")

    private String accessServerAddress;

    public DownloadSpMetadataRequest withIdentityProvider(String identityProvider) {
        this.identityProvider = identityProvider;
        return this;
    }

    /**
     * 身份提供者名称。
     * @return identityProvider
     */
    public String getIdentityProvider() {
        return identityProvider;
    }

    public void setIdentityProvider(String identityProvider) {
        this.identityProvider = identityProvider;
    }

    public DownloadSpMetadataRequest withAccessServerAddress(String accessServerAddress) {
        this.accessServerAddress = accessServerAddress;
        return this;
    }

    /**
     * 接入服务器地址。
     * @return accessServerAddress
     */
    public String getAccessServerAddress() {
        return accessServerAddress;
    }

    public void setAccessServerAddress(String accessServerAddress) {
        this.accessServerAddress = accessServerAddress;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DownloadSpMetadataRequest that = (DownloadSpMetadataRequest) obj;
        return Objects.equals(this.identityProvider, that.identityProvider)
            && Objects.equals(this.accessServerAddress, that.accessServerAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identityProvider, accessServerAddress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DownloadSpMetadataRequest {\n");
        sb.append("    identityProvider: ").append(toIndentedString(identityProvider)).append("\n");
        sb.append("    accessServerAddress: ").append(toIndentedString(accessServerAddress)).append("\n");
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
