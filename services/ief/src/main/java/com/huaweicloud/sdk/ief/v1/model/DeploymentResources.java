package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** 创建容器时使用的资源 */
public class DeploymentResources {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limits")

    private Map<String, String> limits = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "requests")

    private Map<String, String> requests = null;

    public DeploymentResources withLimits(Map<String, String> limits) {
        this.limits = limits;
        return this;
    }

    public DeploymentResources putLimitsItem(String key, String limitsItem) {
        if (this.limits == null) {
            this.limits = new HashMap<>();
        }
        this.limits.put(key, limitsItem);
        return this;
    }

    public DeploymentResources withLimits(Consumer<Map<String, String>> limitsSetter) {
        if (this.limits == null) {
            this.limits = new HashMap<>();
        }
        limitsSetter.accept(this.limits);
        return this;
    }

    /** 允许容器使用的最大资源
     * 
     * @return limits */
    public Map<String, String> getLimits() {
        return limits;
    }

    public void setLimits(Map<String, String> limits) {
        this.limits = limits;
    }

    public DeploymentResources withRequests(Map<String, String> requests) {
        this.requests = requests;
        return this;
    }

    public DeploymentResources putRequestsItem(String key, String requestsItem) {
        if (this.requests == null) {
            this.requests = new HashMap<>();
        }
        this.requests.put(key, requestsItem);
        return this;
    }

    public DeploymentResources withRequests(Consumer<Map<String, String>> requestsSetter) {
        if (this.requests == null) {
            this.requests = new HashMap<>();
        }
        requestsSetter.accept(this.requests);
        return this;
    }

    /** 容器需要使用的最小资源
     * 
     * @return requests */
    public Map<String, String> getRequests() {
        return requests;
    }

    public void setRequests(Map<String, String> requests) {
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
        DeploymentResources deploymentResources = (DeploymentResources) o;
        return Objects.equals(this.limits, deploymentResources.limits)
            && Objects.equals(this.requests, deploymentResources.requests);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limits, requests);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeploymentResources {\n");
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
