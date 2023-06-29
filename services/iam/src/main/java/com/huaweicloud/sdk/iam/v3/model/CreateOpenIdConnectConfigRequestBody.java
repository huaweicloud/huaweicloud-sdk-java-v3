package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 请求体
 */
public class CreateOpenIdConnectConfigRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "openid_connect_config")

    private CreateOpenIdConnectConfig openidConnectConfig;

    public CreateOpenIdConnectConfigRequestBody withOpenidConnectConfig(CreateOpenIdConnectConfig openidConnectConfig) {
        this.openidConnectConfig = openidConnectConfig;
        return this;
    }

    public CreateOpenIdConnectConfigRequestBody withOpenidConnectConfig(
        Consumer<CreateOpenIdConnectConfig> openidConnectConfigSetter) {
        if (this.openidConnectConfig == null) {
            this.openidConnectConfig = new CreateOpenIdConnectConfig();
            openidConnectConfigSetter.accept(this.openidConnectConfig);
        }

        return this;
    }

    /**
     * Get openidConnectConfig
     * @return openidConnectConfig
     */
    public CreateOpenIdConnectConfig getOpenidConnectConfig() {
        return openidConnectConfig;
    }

    public void setOpenidConnectConfig(CreateOpenIdConnectConfig openidConnectConfig) {
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
        CreateOpenIdConnectConfigRequestBody that = (CreateOpenIdConnectConfigRequestBody) obj;
        return Objects.equals(this.openidConnectConfig, that.openidConnectConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(openidConnectConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateOpenIdConnectConfigRequestBody {\n");
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
