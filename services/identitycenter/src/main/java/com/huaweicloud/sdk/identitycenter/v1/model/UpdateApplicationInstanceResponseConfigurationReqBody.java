package com.huaweicloud.sdk.identitycenter.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateApplicationInstanceResponseConfiguration的请求体
 */
public class UpdateApplicationInstanceResponseConfigurationReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_config")

    private ResponseConfigDto responseConfig;

    public UpdateApplicationInstanceResponseConfigurationReqBody withResponseConfig(ResponseConfigDto responseConfig) {
        this.responseConfig = responseConfig;
        return this;
    }

    public UpdateApplicationInstanceResponseConfigurationReqBody withResponseConfig(
        Consumer<ResponseConfigDto> responseConfigSetter) {
        if (this.responseConfig == null) {
            this.responseConfig = new ResponseConfigDto();
            responseConfigSetter.accept(this.responseConfig);
        }

        return this;
    }

    /**
     * Get responseConfig
     * @return responseConfig
     */
    public ResponseConfigDto getResponseConfig() {
        return responseConfig;
    }

    public void setResponseConfig(ResponseConfigDto responseConfig) {
        this.responseConfig = responseConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateApplicationInstanceResponseConfigurationReqBody that =
            (UpdateApplicationInstanceResponseConfigurationReqBody) obj;
        return Objects.equals(this.responseConfig, that.responseConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(responseConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateApplicationInstanceResponseConfigurationReqBody {\n");
        sb.append("    responseConfig: ").append(toIndentedString(responseConfig)).append("\n");
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
