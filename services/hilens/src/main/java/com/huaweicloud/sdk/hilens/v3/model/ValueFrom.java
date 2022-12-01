package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ValueFrom
 */
public class ValueFrom {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configmap")

    private ConfigsMap configmap;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret")

    private DeploymentSecrets secret;

    public ValueFrom withConfigmap(ConfigsMap configmap) {
        this.configmap = configmap;
        return this;
    }

    public ValueFrom withConfigmap(Consumer<ConfigsMap> configmapSetter) {
        if (this.configmap == null) {
            this.configmap = new ConfigsMap();
            configmapSetter.accept(this.configmap);
        }

        return this;
    }

    /**
     * Get configmap
     * @return configmap
     */
    public ConfigsMap getConfigmap() {
        return configmap;
    }

    public void setConfigmap(ConfigsMap configmap) {
        this.configmap = configmap;
    }

    public ValueFrom withSecret(DeploymentSecrets secret) {
        this.secret = secret;
        return this;
    }

    public ValueFrom withSecret(Consumer<DeploymentSecrets> secretSetter) {
        if (this.secret == null) {
            this.secret = new DeploymentSecrets();
            secretSetter.accept(this.secret);
        }

        return this;
    }

    /**
     * Get secret
     * @return secret
     */
    public DeploymentSecrets getSecret() {
        return secret;
    }

    public void setSecret(DeploymentSecrets secret) {
        this.secret = secret;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ValueFrom valueFrom = (ValueFrom) o;
        return Objects.equals(this.configmap, valueFrom.configmap) && Objects.equals(this.secret, valueFrom.secret);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configmap, secret);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValueFrom {\n");
        sb.append("    configmap: ").append(toIndentedString(configmap)).append("\n");
        sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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
