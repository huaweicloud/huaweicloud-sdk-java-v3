package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowOpenIdConnectConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "openid_connect_config")

    private OpenIdConnectConfig openidConnectConfig;

    public ShowOpenIdConnectConfigResponse withOpenidConnectConfig(OpenIdConnectConfig openidConnectConfig) {
        this.openidConnectConfig = openidConnectConfig;
        return this;
    }

    public ShowOpenIdConnectConfigResponse withOpenidConnectConfig(
        Consumer<OpenIdConnectConfig> openidConnectConfigSetter) {
        if (this.openidConnectConfig == null) {
            this.openidConnectConfig = new OpenIdConnectConfig();
            openidConnectConfigSetter.accept(this.openidConnectConfig);
        }

        return this;
    }

    /**
     * Get openidConnectConfig
     * @return openidConnectConfig
     */
    public OpenIdConnectConfig getOpenidConnectConfig() {
        return openidConnectConfig;
    }

    public void setOpenidConnectConfig(OpenIdConnectConfig openidConnectConfig) {
        this.openidConnectConfig = openidConnectConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOpenIdConnectConfigResponse that = (ShowOpenIdConnectConfigResponse) obj;
        return Objects.equals(this.openidConnectConfig, that.openidConnectConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(openidConnectConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOpenIdConnectConfigResponse {\n");
        sb.append("    openidConnectConfig: ").append(toIndentedString(openidConnectConfig)).append("\n");
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
