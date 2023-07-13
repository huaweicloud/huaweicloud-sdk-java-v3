package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResourceDTO
 */
public class ResourceDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limits")

    private ResourceConfigDTO limits;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "requests")

    private ResourceConfigDTO requests;

    public ResourceDTO withLimits(ResourceConfigDTO limits) {
        this.limits = limits;
        return this;
    }

    public ResourceDTO withLimits(Consumer<ResourceConfigDTO> limitsSetter) {
        if (this.limits == null) {
            this.limits = new ResourceConfigDTO();
            limitsSetter.accept(this.limits);
        }

        return this;
    }

    /**
     * Get limits
     * @return limits
     */
    public ResourceConfigDTO getLimits() {
        return limits;
    }

    public void setLimits(ResourceConfigDTO limits) {
        this.limits = limits;
    }

    public ResourceDTO withRequests(ResourceConfigDTO requests) {
        this.requests = requests;
        return this;
    }

    public ResourceDTO withRequests(Consumer<ResourceConfigDTO> requestsSetter) {
        if (this.requests == null) {
            this.requests = new ResourceConfigDTO();
            requestsSetter.accept(this.requests);
        }

        return this;
    }

    /**
     * Get requests
     * @return requests
     */
    public ResourceConfigDTO getRequests() {
        return requests;
    }

    public void setRequests(ResourceConfigDTO requests) {
        this.requests = requests;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceDTO that = (ResourceDTO) obj;
        return Objects.equals(this.limits, that.limits) && Objects.equals(this.requests, that.requests);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limits, requests);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceDTO {\n");
        sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
        sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
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
