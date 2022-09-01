package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class KeystoneShowSecurityComplianceByOptionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config")

    @JacksonXmlProperty(localName = "config")

    private ConfigByOption config;

    public KeystoneShowSecurityComplianceByOptionResponse withConfig(ConfigByOption config) {
        this.config = config;
        return this;
    }

    public KeystoneShowSecurityComplianceByOptionResponse withConfig(Consumer<ConfigByOption> configSetter) {
        if (this.config == null) {
            this.config = new ConfigByOption();
            configSetter.accept(this.config);
        }

        return this;
    }

    /**
     * Get config
     * @return config
     */
    public ConfigByOption getConfig() {
        return config;
    }

    public void setConfig(ConfigByOption config) {
        this.config = config;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneShowSecurityComplianceByOptionResponse keystoneShowSecurityComplianceByOptionResponse =
            (KeystoneShowSecurityComplianceByOptionResponse) o;
        return Objects.equals(this.config, keystoneShowSecurityComplianceByOptionResponse.config);
    }

    @Override
    public int hashCode() {
        return Objects.hash(config);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneShowSecurityComplianceByOptionResponse {\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
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
