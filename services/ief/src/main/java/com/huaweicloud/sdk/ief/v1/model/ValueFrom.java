package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ValueFrom
 */
public class ValueFrom {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret")

    private Secrets secret;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configmap")

    private ConfigsMap configmap;

    public ValueFrom withSecret(Secrets secret) {
        this.secret = secret;
        return this;
    }

    public ValueFrom withSecret(Consumer<Secrets> secretSetter) {
        if (this.secret == null) {
            this.secret = new Secrets();
            secretSetter.accept(this.secret);
        }

        return this;
    }

    /**
     * Get secret
     * @return secret
     */
    public Secrets getSecret() {
        return secret;
    }

    public void setSecret(Secrets secret) {
        this.secret = secret;
    }

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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ValueFrom valueFrom = (ValueFrom) o;
        return Objects.equals(this.secret, valueFrom.secret) && Objects.equals(this.configmap, valueFrom.configmap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(secret, configmap);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValueFrom {\n");
        sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
        sb.append("    configmap: ").append(toIndentedString(configmap)).append("\n");
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
