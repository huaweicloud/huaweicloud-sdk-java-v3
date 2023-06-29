package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateConfigMaps
 */
public class UpdateConfigMaps {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configmap")

    private UpdateConfigMap configmap;

    public UpdateConfigMaps withConfigmap(UpdateConfigMap configmap) {
        this.configmap = configmap;
        return this;
    }

    public UpdateConfigMaps withConfigmap(Consumer<UpdateConfigMap> configmapSetter) {
        if (this.configmap == null) {
            this.configmap = new UpdateConfigMap();
            configmapSetter.accept(this.configmap);
        }

        return this;
    }

    /**
     * Get configmap
     * @return configmap
     */
    public UpdateConfigMap getConfigmap() {
        return configmap;
    }

    public void setConfigmap(UpdateConfigMap configmap) {
        this.configmap = configmap;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateConfigMaps that = (UpdateConfigMaps) obj;
        return Objects.equals(this.configmap, that.configmap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configmap);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateConfigMaps {\n");
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
