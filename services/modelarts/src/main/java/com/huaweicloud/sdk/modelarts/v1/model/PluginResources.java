package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 插件占用的资源量。
 */
public class PluginResources {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "involvedObject")

    private ObjectReference involvedObject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replicas")

    private Integer replicas;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limits")

    private Map<String, String> limits = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "requests")

    private Map<String, String> requests = null;

    public PluginResources withInvolvedObject(ObjectReference involvedObject) {
        this.involvedObject = involvedObject;
        return this;
    }

    public PluginResources withInvolvedObject(Consumer<ObjectReference> involvedObjectSetter) {
        if (this.involvedObject == null) {
            this.involvedObject = new ObjectReference();
            involvedObjectSetter.accept(this.involvedObject);
        }

        return this;
    }

    /**
     * Get involvedObject
     * @return involvedObject
     */
    public ObjectReference getInvolvedObject() {
        return involvedObject;
    }

    public void setInvolvedObject(ObjectReference involvedObject) {
        this.involvedObject = involvedObject;
    }

    public PluginResources withReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }

    /**
     * **参数解释**： 资源对象的副本数。 **取值范围**： 不涉及。
     * @return replicas
     */
    public Integer getReplicas() {
        return replicas;
    }

    public void setReplicas(Integer replicas) {
        this.replicas = replicas;
    }

    public PluginResources withLimits(Map<String, String> limits) {
        this.limits = limits;
        return this;
    }

    public PluginResources putLimitsItem(String key, String limitsItem) {
        if (this.limits == null) {
            this.limits = new HashMap<>();
        }
        this.limits.put(key, limitsItem);
        return this;
    }

    public PluginResources withLimits(Consumer<Map<String, String>> limitsSetter) {
        if (this.limits == null) {
            this.limits = new HashMap<>();
        }
        limitsSetter.accept(this.limits);
        return this;
    }

    /**
     * **参数解释**： 申请的资源限制。
     * @return limits
     */
    public Map<String, String> getLimits() {
        return limits;
    }

    public void setLimits(Map<String, String> limits) {
        this.limits = limits;
    }

    public PluginResources withRequests(Map<String, String> requests) {
        this.requests = requests;
        return this;
    }

    public PluginResources putRequestsItem(String key, String requestsItem) {
        if (this.requests == null) {
            this.requests = new HashMap<>();
        }
        this.requests.put(key, requestsItem);
        return this;
    }

    public PluginResources withRequests(Consumer<Map<String, String>> requestsSetter) {
        if (this.requests == null) {
            this.requests = new HashMap<>();
        }
        requestsSetter.accept(this.requests);
        return this;
    }

    /**
     * **参数解释**： 申请的资源需求。
     * @return requests
     */
    public Map<String, String> getRequests() {
        return requests;
    }

    public void setRequests(Map<String, String> requests) {
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
        PluginResources that = (PluginResources) obj;
        return Objects.equals(this.involvedObject, that.involvedObject) && Objects.equals(this.replicas, that.replicas)
            && Objects.equals(this.limits, that.limits) && Objects.equals(this.requests, that.requests);
    }

    @Override
    public int hashCode() {
        return Objects.hash(involvedObject, replicas, limits, requests);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PluginResources {\n");
        sb.append("    involvedObject: ").append(toIndentedString(involvedObject)).append("\n");
        sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
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
