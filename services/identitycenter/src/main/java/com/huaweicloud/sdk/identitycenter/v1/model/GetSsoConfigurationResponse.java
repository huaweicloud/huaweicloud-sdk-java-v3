package com.huaweicloud.sdk.identitycenter.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class GetSsoConfigurationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sso_configuration")

    private SSOConfigurationDto ssoConfiguration;

    public GetSsoConfigurationResponse withSsoConfiguration(SSOConfigurationDto ssoConfiguration) {
        this.ssoConfiguration = ssoConfiguration;
        return this;
    }

    public GetSsoConfigurationResponse withSsoConfiguration(Consumer<SSOConfigurationDto> ssoConfigurationSetter) {
        if (this.ssoConfiguration == null) {
            this.ssoConfiguration = new SSOConfigurationDto();
            ssoConfigurationSetter.accept(this.ssoConfiguration);
        }

        return this;
    }

    /**
     * Get ssoConfiguration
     * @return ssoConfiguration
     */
    public SSOConfigurationDto getSsoConfiguration() {
        return ssoConfiguration;
    }

    public void setSsoConfiguration(SSOConfigurationDto ssoConfiguration) {
        this.ssoConfiguration = ssoConfiguration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetSsoConfigurationResponse that = (GetSsoConfigurationResponse) obj;
        return Objects.equals(this.ssoConfiguration, that.ssoConfiguration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ssoConfiguration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetSsoConfigurationResponse {\n");
        sb.append("    ssoConfiguration: ").append(toIndentedString(ssoConfiguration)).append("\n");
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
