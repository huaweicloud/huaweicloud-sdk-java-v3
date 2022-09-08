package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowGetLogSettingResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logConfiguration")

    private LogConfiguration logConfiguration;

    public ShowGetLogSettingResponse withLogConfiguration(LogConfiguration logConfiguration) {
        this.logConfiguration = logConfiguration;
        return this;
    }

    public ShowGetLogSettingResponse withLogConfiguration(Consumer<LogConfiguration> logConfigurationSetter) {
        if (this.logConfiguration == null) {
            this.logConfiguration = new LogConfiguration();
            logConfigurationSetter.accept(this.logConfiguration);
        }

        return this;
    }

    /**
     * Get logConfiguration
     * @return logConfiguration
     */
    public LogConfiguration getLogConfiguration() {
        return logConfiguration;
    }

    public void setLogConfiguration(LogConfiguration logConfiguration) {
        this.logConfiguration = logConfiguration;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowGetLogSettingResponse showGetLogSettingResponse = (ShowGetLogSettingResponse) o;
        return Objects.equals(this.logConfiguration, showGetLogSettingResponse.logConfiguration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logConfiguration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowGetLogSettingResponse {\n");
        sb.append("    logConfiguration: ").append(toIndentedString(logConfiguration)).append("\n");
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
