package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowTaskListResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_records")

    private Integer totalRecords;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_records")

    private Integer maxRecords;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<MetadataCollectionTask> resources = null;

    public ShowTaskListResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 查询采集任务数量
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ShowTaskListResponse withTotalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
        return this;
    }

    /**
     * 同一projectId下已创建采集任务数量
     * @return totalRecords
     */
    public Integer getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
    }

    public ShowTaskListResponse withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * 同一projectId下允许创建采集任务数量
     * @return maxRecords
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    public ShowTaskListResponse withResources(List<MetadataCollectionTask> resources) {
        this.resources = resources;
        return this;
    }

    public ShowTaskListResponse addResourcesItem(MetadataCollectionTask resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public ShowTaskListResponse withResources(Consumer<List<MetadataCollectionTask>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 采集任务列表
     * @return resources
     */
    public List<MetadataCollectionTask> getResources() {
        return resources;
    }

    public void setResources(List<MetadataCollectionTask> resources) {
        this.resources = resources;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowTaskListResponse showTaskListResponse = (ShowTaskListResponse) o;
        return Objects.equals(this.count, showTaskListResponse.count)
            && Objects.equals(this.totalRecords, showTaskListResponse.totalRecords)
            && Objects.equals(this.maxRecords, showTaskListResponse.maxRecords)
            && Objects.equals(this.resources, showTaskListResponse.resources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, totalRecords, maxRecords, resources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTaskListResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    totalRecords: ").append(toIndentedString(totalRecords)).append("\n");
        sb.append("    maxRecords: ").append(toIndentedString(maxRecords)).append("\n");
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
