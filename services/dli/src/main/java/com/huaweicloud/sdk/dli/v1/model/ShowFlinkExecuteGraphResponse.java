package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowFlinkExecuteGraphResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_success")

    @JacksonXmlProperty(localName = "is_success")

    private Boolean isSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    @JacksonXmlProperty(localName = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_graph")

    @JacksonXmlProperty(localName = "execute_graph")

    private ShowJobPlanRespPlan executeGraph;

    public ShowFlinkExecuteGraphResponse withIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    /**
     * 请求是否成功
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public ShowFlinkExecuteGraphResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 消息内容。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ShowFlinkExecuteGraphResponse withExecuteGraph(ShowJobPlanRespPlan executeGraph) {
        this.executeGraph = executeGraph;
        return this;
    }

    public ShowFlinkExecuteGraphResponse withExecuteGraph(Consumer<ShowJobPlanRespPlan> executeGraphSetter) {
        if (this.executeGraph == null) {
            this.executeGraph = new ShowJobPlanRespPlan();
            executeGraphSetter.accept(this.executeGraph);
        }

        return this;
    }

    /**
     * Get executeGraph
     * @return executeGraph
     */
    public ShowJobPlanRespPlan getExecuteGraph() {
        return executeGraph;
    }

    public void setExecuteGraph(ShowJobPlanRespPlan executeGraph) {
        this.executeGraph = executeGraph;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowFlinkExecuteGraphResponse showFlinkExecuteGraphResponse = (ShowFlinkExecuteGraphResponse) o;
        return Objects.equals(this.isSuccess, showFlinkExecuteGraphResponse.isSuccess)
            && Objects.equals(this.message, showFlinkExecuteGraphResponse.message)
            && Objects.equals(this.executeGraph, showFlinkExecuteGraphResponse.executeGraph);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSuccess, message, executeGraph);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFlinkExecuteGraphResponse {\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    executeGraph: ").append(toIndentedString(executeGraph)).append("\n");
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
