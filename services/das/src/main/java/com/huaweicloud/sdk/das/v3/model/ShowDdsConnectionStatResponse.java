package com.huaweicloud.sdk.das.v3.model;

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
public class ShowDdsConnectionStatResponse extends SdkResponse {

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

    private List<ConnectionDetail> innerConnections = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outer_connections")

    private List<ConnectionDetail> outerConnections = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inner_connections_size")

    private Integer innerConnectionsSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outer_connections_size")

    private Integer outerConnectionsSize;

    public ShowDdsConnectionStatResponse withTotalConnections(Integer totalConnections) {
        this.totalConnections = totalConnections;
        return this;
    }

    /**
     * 总连接数
     * @return totalConnections
     */
    public Integer getTotalConnections() {
        return totalConnections;
    }

    public void setTotalConnections(Integer totalConnections) {
        this.totalConnections = totalConnections;
    }

    public ShowDdsConnectionStatResponse withTotalInnerConnections(Integer totalInnerConnections) {
        this.totalInnerConnections = totalInnerConnections;
        return this;
    }

    /**
     * 内部连接总数
     * @return totalInnerConnections
     */
    public Integer getTotalInnerConnections() {
        return totalInnerConnections;
    }

    public void setTotalInnerConnections(Integer totalInnerConnections) {
        this.totalInnerConnections = totalInnerConnections;
    }

    public ShowDdsConnectionStatResponse withTotalOuterConnections(Integer totalOuterConnections) {
        this.totalOuterConnections = totalOuterConnections;
        return this;
    }

    /**
     * 外部连接总数
     * @return totalOuterConnections
     */
    public Integer getTotalOuterConnections() {
        return totalOuterConnections;
    }

    public void setTotalOuterConnections(Integer totalOuterConnections) {
        this.totalOuterConnections = totalOuterConnections;
    }

    public ShowDdsConnectionStatResponse withInnerConnections(List<ConnectionDetail> innerConnections) {
        this.innerConnections = innerConnections;
        return this;
    }

    public ShowDdsConnectionStatResponse addInnerConnectionsItem(ConnectionDetail innerConnectionsItem) {
        if (this.innerConnections == null) {
            this.innerConnections = new ArrayList<>();
        }
        this.innerConnections.add(innerConnectionsItem);
        return this;
    }

    public ShowDdsConnectionStatResponse withInnerConnections(Consumer<List<ConnectionDetail>> innerConnectionsSetter) {
        if (this.innerConnections == null) {
            this.innerConnections = new ArrayList<>();
        }
        innerConnectionsSetter.accept(this.innerConnections);
        return this;
    }

    /**
     * 内部连接详情
     * @return innerConnections
     */
    public List<ConnectionDetail> getInnerConnections() {
        return innerConnections;
    }

    public void setInnerConnections(List<ConnectionDetail> innerConnections) {
        this.innerConnections = innerConnections;
    }

    public ShowDdsConnectionStatResponse withOuterConnections(List<ConnectionDetail> outerConnections) {
        this.outerConnections = outerConnections;
        return this;
    }

    public ShowDdsConnectionStatResponse addOuterConnectionsItem(ConnectionDetail outerConnectionsItem) {
        if (this.outerConnections == null) {
            this.outerConnections = new ArrayList<>();
        }
        this.outerConnections.add(outerConnectionsItem);
        return this;
    }

    public ShowDdsConnectionStatResponse withOuterConnections(Consumer<List<ConnectionDetail>> outerConnectionsSetter) {
        if (this.outerConnections == null) {
            this.outerConnections = new ArrayList<>();
        }
        outerConnectionsSetter.accept(this.outerConnections);
        return this;
    }

    /**
     * 外部连接详情
     * @return outerConnections
     */
    public List<ConnectionDetail> getOuterConnections() {
        return outerConnections;
    }

    public void setOuterConnections(List<ConnectionDetail> outerConnections) {
        this.outerConnections = outerConnections;
    }

    public ShowDdsConnectionStatResponse withInnerConnectionsSize(Integer innerConnectionsSize) {
        this.innerConnectionsSize = innerConnectionsSize;
        return this;
    }

    /**
     * 内部连接详情总数
     * @return innerConnectionsSize
     */
    public Integer getInnerConnectionsSize() {
        return innerConnectionsSize;
    }

    public void setInnerConnectionsSize(Integer innerConnectionsSize) {
        this.innerConnectionsSize = innerConnectionsSize;
    }

    public ShowDdsConnectionStatResponse withOuterConnectionsSize(Integer outerConnectionsSize) {
        this.outerConnectionsSize = outerConnectionsSize;
        return this;
    }

    /**
     * 外部连接详情总数
     * @return outerConnectionsSize
     */
    public Integer getOuterConnectionsSize() {
        return outerConnectionsSize;
    }

    public void setOuterConnectionsSize(Integer outerConnectionsSize) {
        this.outerConnectionsSize = outerConnectionsSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDdsConnectionStatResponse that = (ShowDdsConnectionStatResponse) obj;
        return Objects.equals(this.totalConnections, that.totalConnections)
            && Objects.equals(this.totalInnerConnections, that.totalInnerConnections)
            && Objects.equals(this.totalOuterConnections, that.totalOuterConnections)
            && Objects.equals(this.innerConnections, that.innerConnections)
            && Objects.equals(this.outerConnections, that.outerConnections)
            && Objects.equals(this.innerConnectionsSize, that.innerConnectionsSize)
            && Objects.equals(this.outerConnectionsSize, that.outerConnectionsSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalConnections,
            totalInnerConnections,
            totalOuterConnections,
            innerConnections,
            outerConnections,
            innerConnectionsSize,
            outerConnectionsSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDdsConnectionStatResponse {\n");
        sb.append("    totalConnections: ").append(toIndentedString(totalConnections)).append("\n");
        sb.append("    totalInnerConnections: ").append(toIndentedString(totalInnerConnections)).append("\n");
        sb.append("    totalOuterConnections: ").append(toIndentedString(totalOuterConnections)).append("\n");
        sb.append("    innerConnections: ").append(toIndentedString(innerConnections)).append("\n");
        sb.append("    outerConnections: ").append(toIndentedString(outerConnections)).append("\n");
        sb.append("    innerConnectionsSize: ").append(toIndentedString(innerConnectionsSize)).append("\n");
        sb.append("    outerConnectionsSize: ").append(toIndentedString(outerConnectionsSize)).append("\n");
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
