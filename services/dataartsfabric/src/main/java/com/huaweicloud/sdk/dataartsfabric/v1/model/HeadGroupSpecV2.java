package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：HeadGroup的配置。 **约束限制**：不涉及。 
 */
public class HeadGroupSpecV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limits")

    private ResourceSpec limits;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "requests")

    private ResourceSpec requests;

    public HeadGroupSpecV2 withLimits(ResourceSpec limits) {
        this.limits = limits;
        return this;
    }

    public HeadGroupSpecV2 withLimits(Consumer<ResourceSpec> limitsSetter) {
        if (this.limits == null) {
            this.limits = new ResourceSpec();
            limitsSetter.accept(this.limits);
        }

        return this;
    }

    /**
     * Get limits
     * @return limits
     */
    public ResourceSpec getLimits() {
        return limits;
    }

    public void setLimits(ResourceSpec limits) {
        this.limits = limits;
    }

    public HeadGroupSpecV2 withRequests(ResourceSpec requests) {
        this.requests = requests;
        return this;
    }

    public HeadGroupSpecV2 withRequests(Consumer<ResourceSpec> requestsSetter) {
        if (this.requests == null) {
            this.requests = new ResourceSpec();
            requestsSetter.accept(this.requests);
        }

        return this;
    }

    /**
     * Get requests
     * @return requests
     */
    public ResourceSpec getRequests() {
        return requests;
    }

    public void setRequests(ResourceSpec requests) {
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
        HeadGroupSpecV2 that = (HeadGroupSpecV2) obj;
        return Objects.equals(this.limits, that.limits) && Objects.equals(this.requests, that.requests);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limits, requests);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HeadGroupSpecV2 {\n");
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
