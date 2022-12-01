package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class DeleteConfigMapResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configmap")

    private ConfigMapId configmap;

    public DeleteConfigMapResponse withConfigmap(ConfigMapId configmap) {
        this.configmap = configmap;
        return this;
    }

    public DeleteConfigMapResponse withConfigmap(Consumer<ConfigMapId> configmapSetter) {
        if (this.configmap == null) {
            this.configmap = new ConfigMapId();
            configmapSetter.accept(this.configmap);
        }

        return this;
    }

    /**
     * Get configmap
     * @return configmap
     */
    public ConfigMapId getConfigmap() {
        return configmap;
    }

    public void setConfigmap(ConfigMapId configmap) {
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
        DeleteConfigMapResponse deleteConfigMapResponse = (DeleteConfigMapResponse) o;
        return Objects.equals(this.configmap, deleteConfigMapResponse.configmap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configmap);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteConfigMapResponse {\n");
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
