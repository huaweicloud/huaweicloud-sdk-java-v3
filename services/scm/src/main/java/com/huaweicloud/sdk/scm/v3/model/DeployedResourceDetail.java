package com.huaweicloud.sdk.scm.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeployedResourceDetail
 */
public class DeployedResourceDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service")

    private String service;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_num")

    private Integer resourceNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_location")

    private String resourceLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_resources")

    private List<RegionResourceDetail> regionResources = null;

    public DeployedResourceDetail withService(String service) {
        this.service = service;
        return this;
    }

    /**
     * 证书已部署资源服务名称。 - WAF：证书关联Web应用防火墙的资源。 - CDN：证书关联内容分发网络的资源。 - ELB：证书关联弹性负载均衡（经典型）的资源。
     * @return service
     */
    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public DeployedResourceDetail withResourceNum(Integer resourceNum) {
        this.resourceNum = resourceNum;
        return this;
    }

    /**
     * 证书在当前服务已部署资源数量。
     * minimum: 0
     * maximum: 1000
     * @return resourceNum
     */
    public Integer getResourceNum() {
        return resourceNum;
    }

    public void setResourceNum(Integer resourceNum) {
        this.resourceNum = resourceNum;
    }

    public DeployedResourceDetail withResourceLocation(String resourceLocation) {
        this.resourceLocation = resourceLocation;
        return this;
    }

    /**
     * 全局服务或Region级服务。
     * @return resourceLocation
     */
    public String getResourceLocation() {
        return resourceLocation;
    }

    public void setResourceLocation(String resourceLocation) {
        this.resourceLocation = resourceLocation;
    }

    public DeployedResourceDetail withRegionResources(List<RegionResourceDetail> regionResources) {
        this.regionResources = regionResources;
        return this;
    }

    public DeployedResourceDetail addRegionResourcesItem(RegionResourceDetail regionResourcesItem) {
        if (this.regionResources == null) {
            this.regionResources = new ArrayList<>();
        }
        this.regionResources.add(regionResourcesItem);
        return this;
    }

    public DeployedResourceDetail withRegionResources(Consumer<List<RegionResourceDetail>> regionResourcesSetter) {
        if (this.regionResources == null) {
            this.regionResources = new ArrayList<>();
        }
        regionResourcesSetter.accept(this.regionResources);
        return this;
    }

    /**
     * 局点资源列表，详情请参见RegionResourceDetail字段数据结构说明。
     * @return regionResources
     */
    public List<RegionResourceDetail> getRegionResources() {
        return regionResources;
    }

    public void setRegionResources(List<RegionResourceDetail> regionResources) {
        this.regionResources = regionResources;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeployedResourceDetail that = (DeployedResourceDetail) obj;
        return Objects.equals(this.service, that.service) && Objects.equals(this.resourceNum, that.resourceNum)
            && Objects.equals(this.resourceLocation, that.resourceLocation)
            && Objects.equals(this.regionResources, that.regionResources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(service, resourceNum, resourceLocation, regionResources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeployedResourceDetail {\n");
        sb.append("    service: ").append(toIndentedString(service)).append("\n");
        sb.append("    resourceNum: ").append(toIndentedString(resourceNum)).append("\n");
        sb.append("    resourceLocation: ").append(toIndentedString(resourceLocation)).append("\n");
        sb.append("    regionResources: ").append(toIndentedString(regionResources)).append("\n");
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
