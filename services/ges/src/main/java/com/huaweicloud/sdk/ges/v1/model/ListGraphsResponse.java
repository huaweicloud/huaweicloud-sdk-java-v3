package com.huaweicloud.sdk.ges.v1.model;

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
public class ListGraphsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "graphCount")

    private Integer graphCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "graphs")

    private List<Graph1> graphs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "errorMessage")

    private String errorMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "errorCode")

    private String errorCode;

    public ListGraphsResponse withGraphCount(Integer graphCount) {
        this.graphCount = graphCount;
        return this;
    }

    /**
     * 图总个数。请求失败时为空。
     * @return graphCount
     */
    public Integer getGraphCount() {
        return graphCount;
    }

    public void setGraphCount(Integer graphCount) {
        this.graphCount = graphCount;
    }

    public ListGraphsResponse withGraphs(List<Graph1> graphs) {
        this.graphs = graphs;
        return this;
    }

    public ListGraphsResponse addGraphsItem(Graph1 graphsItem) {
        if (this.graphs == null) {
            this.graphs = new ArrayList<>();
        }
        this.graphs.add(graphsItem);
        return this;
    }

    public ListGraphsResponse withGraphs(Consumer<List<Graph1>> graphsSetter) {
        if (this.graphs == null) {
            this.graphs = new ArrayList<>();
        }
        graphsSetter.accept(this.graphs);
        return this;
    }

    /**
     * 图列表。请求失败时为空。
     * @return graphs
     */
    public List<Graph1> getGraphs() {
        return graphs;
    }

    public void setGraphs(List<Graph1> graphs) {
        this.graphs = graphs;
    }

    public ListGraphsResponse withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * 系统提示信息，执行成功时，字段可能为空。执行失败时，用于显示错误信息。
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public ListGraphsResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 系统提示信息，执行成功时，字段可能为空。执行失败时，用于显示错误码。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListGraphsResponse that = (ListGraphsResponse) obj;
        return Objects.equals(this.graphCount, that.graphCount) && Objects.equals(this.graphs, that.graphs)
            && Objects.equals(this.errorMessage, that.errorMessage) && Objects.equals(this.errorCode, that.errorCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(graphCount, graphs, errorMessage, errorCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGraphsResponse {\n");
        sb.append("    graphCount: ").append(toIndentedString(graphCount)).append("\n");
        sb.append("    graphs: ").append(toIndentedString(graphs)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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
