package com.huaweicloud.sdk.scm.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RegionResourceDetail
 */
public class RegionResourceDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_error")

    private Boolean isError;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<ResourceDetail> resources = null;

    public RegionResourceDetail withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 局点ID。当服务为全局服务时，region_id为global，其余按照IAM的标准命名。
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public RegionResourceDetail withIsError(Boolean isError) {
        this.isError = isError;
        return this;
    }

    /**
     * 请求当前region资源信息过程中，响应是否存在异常的标志。 - true : 存在异常，当前region所统计数据不准确 - false: 无异常，当前region所统计数据准确 
     * @return isError
     */
    public Boolean getIsError() {
        return isError;
    }

    public void setIsError(Boolean isError) {
        this.isError = isError;
    }

    public RegionResourceDetail withResources(List<ResourceDetail> resources) {
        this.resources = resources;
        return this;
    }

    public RegionResourceDetail addResourcesItem(ResourceDetail resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public RegionResourceDetail withResources(Consumer<List<ResourceDetail>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 资源集合，每个资源的标识：资源ID + “:” + 资源名称，详情请参见ResourceDetail字段数据结构说明。
     * @return resources
     */
    public List<ResourceDetail> getResources() {
        return resources;
    }

    public void setResources(List<ResourceDetail> resources) {
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
        RegionResourceDetail that = (RegionResourceDetail) obj;
        return Objects.equals(this.regionId, that.regionId) && Objects.equals(this.isError, that.isError)
            && Objects.equals(this.resources, that.resources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionId, isError, resources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RegionResourceDetail {\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    isError: ").append(toIndentedString(isError)).append("\n");
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
