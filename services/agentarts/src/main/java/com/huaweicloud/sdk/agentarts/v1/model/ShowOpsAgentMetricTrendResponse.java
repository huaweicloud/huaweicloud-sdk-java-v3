package com.huaweicloud.sdk.agentarts.v1.model;

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
public class ShowOpsAgentMetricTrendResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_list")

    private List<FrontLine> lineList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step")

    private String step;

    public ShowOpsAgentMetricTrendResponse withLineList(List<FrontLine> lineList) {
        this.lineList = lineList;
        return this;
    }

    public ShowOpsAgentMetricTrendResponse addLineListItem(FrontLine lineListItem) {
        if (this.lineList == null) {
            this.lineList = new ArrayList<>();
        }
        this.lineList.add(lineListItem);
        return this;
    }

    public ShowOpsAgentMetricTrendResponse withLineList(Consumer<List<FrontLine>> lineListSetter) {
        if (this.lineList == null) {
            this.lineList = new ArrayList<>();
        }
        lineListSetter.accept(this.lineList);
        return this;
    }

    /**
     * 趋势图数据
     * @return lineList
     */
    public List<FrontLine> getLineList() {
        return lineList;
    }

    public void setLineList(List<FrontLine> lineList) {
        this.lineList = lineList;
    }

    public ShowOpsAgentMetricTrendResponse withStep(String step) {
        this.step = step;
        return this;
    }

    /**
     * 步长 
     * @return step
     */
    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOpsAgentMetricTrendResponse that = (ShowOpsAgentMetricTrendResponse) obj;
        return Objects.equals(this.lineList, that.lineList) && Objects.equals(this.step, that.step);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lineList, step);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOpsAgentMetricTrendResponse {\n");
        sb.append("    lineList: ").append(toIndentedString(lineList)).append("\n");
        sb.append("    step: ").append(toIndentedString(step)).append("\n");
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
