package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 集群配额 **约束限制**： 不涉及 
 */
public class GetClusterQuotaBodyQuotas {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<ClusterQuotaResource> resources = null;

    public GetClusterQuotaBodyQuotas withResources(List<ClusterQuotaResource> resources) {
        this.resources = resources;
        return this;
    }

    public GetClusterQuotaBodyQuotas addResourcesItem(ClusterQuotaResource resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public GetClusterQuotaBodyQuotas withResources(Consumer<List<ClusterQuotaResource>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * **参数解释**： 集群配额 **约束限制**： 不涉及 
     * @return resources
     */
    public List<ClusterQuotaResource> getResources() {
        return resources;
    }

    public void setResources(List<ClusterQuotaResource> resources) {
        this.resources = resources;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetClusterQuotaBodyQuotas that = (GetClusterQuotaBodyQuotas) obj;
        return Objects.equals(this.resources, that.resources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetClusterQuotaBodyQuotas {\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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
