package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** ConfigMaps */
public class ConfigMaps {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configmap")

    private ConfigMap configmap;

    public ConfigMaps withConfigmap(ConfigMap configmap) {
        this.configmap = configmap;
        return this;
    }

    public ConfigMaps withConfigmap(Consumer<ConfigMap> configmapSetter) {
        if (this.configmap == null) {
            this.configmap = new ConfigMap();
            configmapSetter.accept(this.configmap);
        }

        return this;
    }

    /** Get configmap
     * 
     * @return configmap */
    public ConfigMap getConfigmap() {
        return configmap;
    }

    public void setConfigmap(ConfigMap configmap) {
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
        ConfigMaps configMaps = (ConfigMaps) o;
        return Objects.equals(this.configmap, configMaps.configmap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configmap);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigMaps {\n");
        sb.append("    configmap: ").append(toIndentedString(configmap)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
