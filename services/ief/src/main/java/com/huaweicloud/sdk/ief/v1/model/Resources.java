package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 容器使用的资源
 */
public class Resources {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limits")

    private ResourcesLimits limits;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "requests")

    private ResourcesRequests requests;

    public Resources withLimits(ResourcesLimits limits) {
        this.limits = limits;
        return this;
    }

    public Resources withLimits(Consumer<ResourcesLimits> limitsSetter) {
        if (this.limits == null) {
            this.limits = new ResourcesLimits();
            limitsSetter.accept(this.limits);
        }

        return this;
    }

    /**
     * Get limits
     * @return limits
     */
    public ResourcesLimits getLimits() {
        return limits;
    }

    public void setLimits(ResourcesLimits limits) {
        this.limits = limits;
    }

    public Resources withRequests(ResourcesRequests requests) {
        this.requests = requests;
        return this;
    }

    public Resources withRequests(Consumer<ResourcesRequests> requestsSetter) {
        if (this.requests == null) {
            this.requests = new ResourcesRequests();
            requestsSetter.accept(this.requests);
        }

        return this;
    }

    /**
     * Get requests
     * @return requests
     */
    public ResourcesRequests getRequests() {
        return requests;
    }

    public void setRequests(ResourcesRequests requests) {
        this.requests = requests;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Resources resources = (Resources) o;
        return Objects.equals(this.limits, resources.limits) && Objects.equals(this.requests, resources.requests);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limits, requests);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Resources {\n");
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
