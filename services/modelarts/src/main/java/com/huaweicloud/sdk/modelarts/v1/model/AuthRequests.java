package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AuthRequests
 */
public class AuthRequests {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_id")

    private String actionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource")

    private String resource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_attributes")

    private Map<String, String> serviceAttributes = null;

    public AuthRequests withActionId(String actionId) {
        this.actionId = actionId;
        return this;
    }

    /**
     * **参数解释**：随机UUID，用来定位使用。 **取值范围**不涉及。
     * @return actionId
     */
    public String getActionId() {
        return actionId;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    public AuthRequests withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * **参数解释**：细粒度action。 **取值范围**不涉及。
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public AuthRequests withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * **参数解释**：资源。 **取值范围**不涉及。
     * @return resource
     */
    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public AuthRequests withServiceAttributes(Map<String, String> serviceAttributes) {
        this.serviceAttributes = serviceAttributes;
        return this;
    }

    public AuthRequests putServiceAttributesItem(String key, String serviceAttributesItem) {
        if (this.serviceAttributes == null) {
            this.serviceAttributes = new HashMap<>();
        }
        this.serviceAttributes.put(key, serviceAttributesItem);
        return this;
    }

    public AuthRequests withServiceAttributes(Consumer<Map<String, String>> serviceAttributesSetter) {
        if (this.serviceAttributes == null) {
            this.serviceAttributes = new HashMap<>();
        }
        serviceAttributesSetter.accept(this.serviceAttributes);
        return this;
    }

    /**
     * **参数解释**：操作对象。 **取值范围**不涉及。
     * @return serviceAttributes
     */
    public Map<String, String> getServiceAttributes() {
        return serviceAttributes;
    }

    public void setServiceAttributes(Map<String, String> serviceAttributes) {
        this.serviceAttributes = serviceAttributes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AuthRequests that = (AuthRequests) obj;
        return Objects.equals(this.actionId, that.actionId) && Objects.equals(this.action, that.action)
            && Objects.equals(this.resource, that.resource)
            && Objects.equals(this.serviceAttributes, that.serviceAttributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actionId, action, resource, serviceAttributes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthRequests {\n");
        sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("    serviceAttributes: ").append(toIndentedString(serviceAttributes)).append("\n");
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
