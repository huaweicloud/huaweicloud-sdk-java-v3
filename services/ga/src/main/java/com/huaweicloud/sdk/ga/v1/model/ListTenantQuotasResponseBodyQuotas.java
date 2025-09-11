package com.huaweicloud.sdk.ga.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 配额列表对象。
 */
public class ListTenantQuotasResponseBodyQuotas {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<QuotaOuterResource> resources = null;

    public ListTenantQuotasResponseBodyQuotas withResources(List<QuotaOuterResource> resources) {
        this.resources = resources;
        return this;
    }

    public ListTenantQuotasResponseBodyQuotas addResourcesItem(QuotaOuterResource resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public ListTenantQuotasResponseBodyQuotas withResources(Consumer<List<QuotaOuterResource>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 配额资源列表。
     * @return resources
     */
    public List<QuotaOuterResource> getResources() {
        return resources;
    }

    public void setResources(List<QuotaOuterResource> resources) {
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
        ListTenantQuotasResponseBodyQuotas that = (ListTenantQuotasResponseBodyQuotas) obj;
        return Objects.equals(this.resources, that.resources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTenantQuotasResponseBodyQuotas {\n");
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
