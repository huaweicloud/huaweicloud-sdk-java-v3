package com.huaweicloud.sdk.drs.v5.model;

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
public class ShowProgressDataResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow_compare_data")

    private List<FlowCompareData> flowCompareData = null;

    public ShowProgressDataResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 总数。
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ShowProgressDataResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 数据生成时间，UTC时间，例如：2020-09-01T18:50:20.200Z
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowProgressDataResponse withFlowCompareData(List<FlowCompareData> flowCompareData) {
        this.flowCompareData = flowCompareData;
        return this;
    }

    public ShowProgressDataResponse addFlowCompareDataItem(FlowCompareData flowCompareDataItem) {
        if (this.flowCompareData == null) {
            this.flowCompareData = new ArrayList<>();
        }
        this.flowCompareData.add(flowCompareDataItem);
        return this;
    }

    public ShowProgressDataResponse withFlowCompareData(Consumer<List<FlowCompareData>> flowCompareDataSetter) {
        if (this.flowCompareData == null) {
            this.flowCompareData = new ArrayList<>();
        }
        flowCompareDataSetter.accept(this.flowCompareData);
        return this;
    }

    /**
     * 对比结果。
     * @return flowCompareData
     */
    public List<FlowCompareData> getFlowCompareData() {
        return flowCompareData;
    }

    public void setFlowCompareData(List<FlowCompareData> flowCompareData) {
        this.flowCompareData = flowCompareData;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowProgressDataResponse that = (ShowProgressDataResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.flowCompareData, that.flowCompareData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, createTime, flowCompareData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProgressDataResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    flowCompareData: ").append(toIndentedString(flowCompareData)).append("\n");
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
