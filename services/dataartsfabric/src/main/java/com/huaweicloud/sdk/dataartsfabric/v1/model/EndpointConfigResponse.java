package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：端点的配置。 **约束限制**：不涉及。 
 */
public class EndpointConfigResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ray_service_config")

    private RayServiceConfigResponse rayServiceConfig;

    public EndpointConfigResponse withRayServiceConfig(RayServiceConfigResponse rayServiceConfig) {
        this.rayServiceConfig = rayServiceConfig;
        return this;
    }

    public EndpointConfigResponse withRayServiceConfig(Consumer<RayServiceConfigResponse> rayServiceConfigSetter) {
        if (this.rayServiceConfig == null) {
            this.rayServiceConfig = new RayServiceConfigResponse();
            rayServiceConfigSetter.accept(this.rayServiceConfig);
        }

        return this;
    }

    /**
     * Get rayServiceConfig
     * @return rayServiceConfig
     */
    public RayServiceConfigResponse getRayServiceConfig() {
        return rayServiceConfig;
    }

    public void setRayServiceConfig(RayServiceConfigResponse rayServiceConfig) {
        this.rayServiceConfig = rayServiceConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EndpointConfigResponse that = (EndpointConfigResponse) obj;
        return Objects.equals(this.rayServiceConfig, that.rayServiceConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rayServiceConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EndpointConfigResponse {\n");
        sb.append("    rayServiceConfig: ").append(toIndentedString(rayServiceConfig)).append("\n");
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
