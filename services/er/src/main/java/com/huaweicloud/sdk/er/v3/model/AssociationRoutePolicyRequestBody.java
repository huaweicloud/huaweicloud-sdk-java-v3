package com.huaweicloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * AssociationRoutePolicyRequestBody
 */
public class AssociationRoutePolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "route_policy")

    private ExportRoutePolicy routePolicy;

    public AssociationRoutePolicyRequestBody withRoutePolicy(ExportRoutePolicy routePolicy) {
        this.routePolicy = routePolicy;
        return this;
    }

    public AssociationRoutePolicyRequestBody withRoutePolicy(Consumer<ExportRoutePolicy> routePolicySetter) {
        if (this.routePolicy == null) {
            this.routePolicy = new ExportRoutePolicy();
            routePolicySetter.accept(this.routePolicy);
        }

        return this;
    }

    /**
     * Get routePolicy
     * @return routePolicy
     */
    public ExportRoutePolicy getRoutePolicy() {
        return routePolicy;
    }

    public void setRoutePolicy(ExportRoutePolicy routePolicy) {
        this.routePolicy = routePolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssociationRoutePolicyRequestBody that = (AssociationRoutePolicyRequestBody) obj;
        return Objects.equals(this.routePolicy, that.routePolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routePolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociationRoutePolicyRequestBody {\n");
        sb.append("    routePolicy: ").append(toIndentedString(routePolicy)).append("\n");
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
