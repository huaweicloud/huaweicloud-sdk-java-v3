package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 租户信息。
 */
public class SpTenantInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_project_id")

    private String customerProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_name")

    private String customerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_count")

    private Integer resourceCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<AllocateSpResourceInfo> resources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources_overview")

    private List<AllocateSpResourceSummaryInfo> resourcesOverview = null;

    public SpTenantInfo withCustomerProjectId(String customerProjectId) {
        this.customerProjectId = customerProjectId;
        return this;
    }

    /**
     * 租户ID
     * @return customerProjectId
     */
    public String getCustomerProjectId() {
        return customerProjectId;
    }

    public void setCustomerProjectId(String customerProjectId) {
        this.customerProjectId = customerProjectId;
    }

    public SpTenantInfo withCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    /**
     * 被关联租户的名称。
     * @return customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public SpTenantInfo withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 租户的可用区。
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public SpTenantInfo withResourceCount(Integer resourceCount) {
        this.resourceCount = resourceCount;
        return this;
    }

    /**
     * 分配表记录总数，用于分页。
     * minimum: 0
     * maximum: 2147483647
     * @return resourceCount
     */
    public Integer getResourceCount() {
        return resourceCount;
    }

    public void setResourceCount(Integer resourceCount) {
        this.resourceCount = resourceCount;
    }

    public SpTenantInfo withResources(List<AllocateSpResourceInfo> resources) {
        this.resources = resources;
        return this;
    }

    public SpTenantInfo addResourcesItem(AllocateSpResourceInfo resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public SpTenantInfo withResources(Consumer<List<AllocateSpResourceInfo>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 分配给租户的资源。
     * @return resources
     */
    public List<AllocateSpResourceInfo> getResources() {
        return resources;
    }

    public void setResources(List<AllocateSpResourceInfo> resources) {
        this.resources = resources;
    }

    public SpTenantInfo withResourcesOverview(List<AllocateSpResourceSummaryInfo> resourcesOverview) {
        this.resourcesOverview = resourcesOverview;
        return this;
    }

    public SpTenantInfo addResourcesOverviewItem(AllocateSpResourceSummaryInfo resourcesOverviewItem) {
        if (this.resourcesOverview == null) {
            this.resourcesOverview = new ArrayList<>();
        }
        this.resourcesOverview.add(resourcesOverviewItem);
        return this;
    }

    public SpTenantInfo withResourcesOverview(Consumer<List<AllocateSpResourceSummaryInfo>> resourcesOverviewSetter) {
        if (this.resourcesOverview == null) {
            this.resourcesOverview = new ArrayList<>();
        }
        resourcesOverviewSetter.accept(this.resourcesOverview);
        return this;
    }

    /**
     * 分配给租户的资源总览。
     * @return resourcesOverview
     */
    public List<AllocateSpResourceSummaryInfo> getResourcesOverview() {
        return resourcesOverview;
    }

    public void setResourcesOverview(List<AllocateSpResourceSummaryInfo> resourcesOverview) {
        this.resourcesOverview = resourcesOverview;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SpTenantInfo that = (SpTenantInfo) obj;
        return Objects.equals(this.customerProjectId, that.customerProjectId)
            && Objects.equals(this.customerName, that.customerName) && Objects.equals(this.regionId, that.regionId)
            && Objects.equals(this.resourceCount, that.resourceCount) && Objects.equals(this.resources, that.resources)
            && Objects.equals(this.resourcesOverview, that.resourcesOverview);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerProjectId, customerName, regionId, resourceCount, resources, resourcesOverview);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SpTenantInfo {\n");
        sb.append("    customerProjectId: ").append(toIndentedString(customerProjectId)).append("\n");
        sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    resourceCount: ").append(toIndentedString(resourceCount)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    resourcesOverview: ").append(toIndentedString(resourcesOverview)).append("\n");
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
