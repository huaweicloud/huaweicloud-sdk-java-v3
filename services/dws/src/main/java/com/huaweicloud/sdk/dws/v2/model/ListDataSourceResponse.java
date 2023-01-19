package com.huaweicloud.sdk.dws.v2.model;

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
public class ListDataSourceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_sources")

    private List<ExtDataSource> dataSources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListDataSourceResponse withDataSources(List<ExtDataSource> dataSources) {
        this.dataSources = dataSources;
        return this;
    }

    public ListDataSourceResponse addDataSourcesItem(ExtDataSource dataSourcesItem) {
        if (this.dataSources == null) {
            this.dataSources = new ArrayList<>();
        }
        this.dataSources.add(dataSourcesItem);
        return this;
    }

    public ListDataSourceResponse withDataSources(Consumer<List<ExtDataSource>> dataSourcesSetter) {
        if (this.dataSources == null) {
            this.dataSources = new ArrayList<>();
        }
        dataSourcesSetter.accept(this.dataSources);
        return this;
    }

    /**
     * 数据源列表。
     * @return dataSources
     */
    public List<ExtDataSource> getDataSources() {
        return dataSources;
    }

    public void setDataSources(List<ExtDataSource> dataSources) {
        this.dataSources = dataSources;
    }

    public ListDataSourceResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ListDataSourceResponse withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群ID。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ListDataSourceResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 数据源类型。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ListDataSourceResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 总数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListDataSourceResponse listDataSourceResponse = (ListDataSourceResponse) o;
        return Objects.equals(this.dataSources, listDataSourceResponse.dataSources)
            && Objects.equals(this.projectId, listDataSourceResponse.projectId)
            && Objects.equals(this.clusterId, listDataSourceResponse.clusterId)
            && Objects.equals(this.type, listDataSourceResponse.type)
            && Objects.equals(this.count, listDataSourceResponse.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataSources, projectId, clusterId, type, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDataSourceResponse {\n");
        sb.append("    dataSources: ").append(toIndentedString(dataSources)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
