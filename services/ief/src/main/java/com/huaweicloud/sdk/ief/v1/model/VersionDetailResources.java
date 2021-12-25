package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 资源配额 */
public class VersionDetailResources {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limits")

    private VersionDetailResourcesLimits limits;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "requests")

    private VersionDetailResourcesRequests requests;

    public VersionDetailResources withLimits(VersionDetailResourcesLimits limits) {
        this.limits = limits;
        return this;
    }

    public VersionDetailResources withLimits(Consumer<VersionDetailResourcesLimits> limitsSetter) {
        if (this.limits == null) {
            this.limits = new VersionDetailResourcesLimits();
            limitsSetter.accept(this.limits);
        }

        return this;
    }

    /** Get limits
     * 
     * @return limits */
    public VersionDetailResourcesLimits getLimits() {
        return limits;
    }

    public void setLimits(VersionDetailResourcesLimits limits) {
        this.limits = limits;
    }

    public VersionDetailResources withRequests(VersionDetailResourcesRequests requests) {
        this.requests = requests;
        return this;
    }

    public VersionDetailResources withRequests(Consumer<VersionDetailResourcesRequests> requestsSetter) {
        if (this.requests == null) {
            this.requests = new VersionDetailResourcesRequests();
            requestsSetter.accept(this.requests);
        }

        return this;
    }

    /** Get requests
     * 
     * @return requests */
    public VersionDetailResourcesRequests getRequests() {
        return requests;
    }

    public void setRequests(VersionDetailResourcesRequests requests) {
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
        VersionDetailResources versionDetailResources = (VersionDetailResources) o;
        return Objects.equals(this.limits, versionDetailResources.limits)
            && Objects.equals(this.requests, versionDetailResources.requests);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limits, requests);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionDetailResources {\n");
        sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
        sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
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
