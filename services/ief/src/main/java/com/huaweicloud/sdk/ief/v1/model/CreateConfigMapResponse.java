package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateConfigMapResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configmap")

    private ConfigMapResp configmap;

    public CreateConfigMapResponse withConfigmap(ConfigMapResp configmap) {
        this.configmap = configmap;
        return this;
    }

    public CreateConfigMapResponse withConfigmap(Consumer<ConfigMapResp> configmapSetter) {
        if (this.configmap == null) {
            this.configmap = new ConfigMapResp();
            configmapSetter.accept(this.configmap);
        }

        return this;
    }

    /**
     * Get configmap
     * @return configmap
     */
    public ConfigMapResp getConfigmap() {
        return configmap;
    }

    public void setConfigmap(ConfigMapResp configmap) {
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
        CreateConfigMapResponse that = (CreateConfigMapResponse) obj;
        return Objects.equals(this.configmap, that.configmap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configmap);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateConfigMapResponse {\n");
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
