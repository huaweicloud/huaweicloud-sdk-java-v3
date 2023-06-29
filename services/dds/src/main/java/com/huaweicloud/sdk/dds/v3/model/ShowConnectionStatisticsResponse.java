package com.huaweicloud.sdk.dds.v3.model;

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
public class ShowConnectionStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_connections")

    private Integer totalConnections;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_inner_connections")

    private Integer totalInnerConnections;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_outer_connections")

    private Integer totalOuterConnections;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inner_connections")

    private List<QueryConnectionsResponse> innerConnections = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outer_connections")

    private List<QueryConnectionsResponse> outerConnections = null;

    public ShowConnectionStatisticsResponse withTotalConnections(Integer totalConnections) {
        this.totalConnections = totalConnections;
        return this;
    }

    /**
     * 总连接数，包括内部连接与外部连接。
     * @return totalConnections
     */
    public Integer getTotalConnections() {
        return totalConnections;
    }

    public void setTotalConnections(Integer totalConnections) {
        this.totalConnections = totalConnections;
    }

    public ShowConnectionStatisticsResponse withTotalInnerConnections(Integer totalInnerConnections) {
        this.totalInnerConnections = totalInnerConnections;
        return this;
    }

    /**
     * 内部总连接数。
     * @return totalInnerConnections
     */
    public Integer getTotalInnerConnections() {
        return totalInnerConnections;
    }

    public void setTotalInnerConnections(Integer totalInnerConnections) {
        this.totalInnerConnections = totalInnerConnections;
    }

    public ShowConnectionStatisticsResponse withTotalOuterConnections(Integer totalOuterConnections) {
        this.totalOuterConnections = totalOuterConnections;
        return this;
    }

    /**
     * 外部总连接数。
     * @return totalOuterConnections
     */
    public Integer getTotalOuterConnections() {
        return totalOuterConnections;
    }

    public void setTotalOuterConnections(Integer totalOuterConnections) {
        this.totalOuterConnections = totalOuterConnections;
    }

    public ShowConnectionStatisticsResponse withInnerConnections(List<QueryConnectionsResponse> innerConnections) {
        this.innerConnections = innerConnections;
        return this;
    }

    public ShowConnectionStatisticsResponse addInnerConnectionsItem(QueryConnectionsResponse innerConnectionsItem) {
        if (this.innerConnections == null) {
            this.innerConnections = new ArrayList<>();
        }
        this.innerConnections.add(innerConnectionsItem);
        return this;
    }

    public ShowConnectionStatisticsResponse withInnerConnections(
        Consumer<List<QueryConnectionsResponse>> innerConnectionsSetter) {
        if (this.innerConnections == null) {
            this.innerConnections = new ArrayList<>();
        }
        innerConnectionsSetter.accept(this.innerConnections);
        return this;
    }

    /**
     * 内部连接统计信息数组，最大记录数为200条。
     * @return innerConnections
     */
    public List<QueryConnectionsResponse> getInnerConnections() {
        return innerConnections;
    }

    public void setInnerConnections(List<QueryConnectionsResponse> innerConnections) {
        this.innerConnections = innerConnections;
    }

    public ShowConnectionStatisticsResponse withOuterConnections(List<QueryConnectionsResponse> outerConnections) {
        this.outerConnections = outerConnections;
        return this;
    }

    public ShowConnectionStatisticsResponse addOuterConnectionsItem(QueryConnectionsResponse outerConnectionsItem) {
        if (this.outerConnections == null) {
            this.outerConnections = new ArrayList<>();
        }
        this.outerConnections.add(outerConnectionsItem);
        return this;
    }

    public ShowConnectionStatisticsResponse withOuterConnections(
        Consumer<List<QueryConnectionsResponse>> outerConnectionsSetter) {
        if (this.outerConnections == null) {
            this.outerConnections = new ArrayList<>();
        }
        outerConnectionsSetter.accept(this.outerConnections);
        return this;
    }

    /**
     * 外部连接统计信息数组，最大记录数为200条。
     * @return outerConnections
     */
    public List<QueryConnectionsResponse> getOuterConnections() {
        return outerConnections;
    }

    public void setOuterConnections(List<QueryConnectionsResponse> outerConnections) {
        this.outerConnections = outerConnections;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowConnectionStatisticsResponse that = (ShowConnectionStatisticsResponse) obj;
        return Objects.equals(this.totalConnections, that.totalConnections)
            && Objects.equals(this.totalInnerConnections, that.totalInnerConnections)
            && Objects.equals(this.totalOuterConnections, that.totalOuterConnections)
            && Objects.equals(this.innerConnections, that.innerConnections)
            && Objects.equals(this.outerConnections, that.outerConnections);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(totalConnections, totalInnerConnections, totalOuterConnections, innerConnections, outerConnections);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowConnectionStatisticsResponse {\n");
        sb.append("    totalConnections: ").append(toIndentedString(totalConnections)).append("\n");
        sb.append("    totalInnerConnections: ").append(toIndentedString(totalInnerConnections)).append("\n");
        sb.append("    totalOuterConnections: ").append(toIndentedString(totalOuterConnections)).append("\n");
        sb.append("    innerConnections: ").append(toIndentedString(innerConnections)).append("\n");
        sb.append("    outerConnections: ").append(toIndentedString(outerConnections)).append("\n");
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
