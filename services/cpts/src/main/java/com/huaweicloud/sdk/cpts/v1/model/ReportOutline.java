package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ReportOutline
 */
public class ReportOutline {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "core_index")

    private CoreIndex coreIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exception_response_sum")

    private ExceptionResponseSum exceptionResponseSum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_traffic")

    private NetworkTraffic networkTraffic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_code_sum")

    private ResponseCodeSum responseCodeSum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_basic_attribute")

    private TaskBasicAttribute taskBasicAttribute;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_basic_execution_data")

    private TaskBasicExecutionData taskBasicExecutionData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_code_details")

    private List<Object> responseCodeDetails = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sla_statistic")

    private Object slaStatistic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "streaming_media")

    private Object streamingMedia;

    public ReportOutline withCoreIndex(CoreIndex coreIndex) {
        this.coreIndex = coreIndex;
        return this;
    }

    public ReportOutline withCoreIndex(Consumer<CoreIndex> coreIndexSetter) {
        if (this.coreIndex == null) {
            this.coreIndex = new CoreIndex();
            coreIndexSetter.accept(this.coreIndex);
        }

        return this;
    }

    /**
     * Get coreIndex
     * @return coreIndex
     */
    public CoreIndex getCoreIndex() {
        return coreIndex;
    }

    public void setCoreIndex(CoreIndex coreIndex) {
        this.coreIndex = coreIndex;
    }

    public ReportOutline withExceptionResponseSum(ExceptionResponseSum exceptionResponseSum) {
        this.exceptionResponseSum = exceptionResponseSum;
        return this;
    }

    public ReportOutline withExceptionResponseSum(Consumer<ExceptionResponseSum> exceptionResponseSumSetter) {
        if (this.exceptionResponseSum == null) {
            this.exceptionResponseSum = new ExceptionResponseSum();
            exceptionResponseSumSetter.accept(this.exceptionResponseSum);
        }

        return this;
    }

    /**
     * Get exceptionResponseSum
     * @return exceptionResponseSum
     */
    public ExceptionResponseSum getExceptionResponseSum() {
        return exceptionResponseSum;
    }

    public void setExceptionResponseSum(ExceptionResponseSum exceptionResponseSum) {
        this.exceptionResponseSum = exceptionResponseSum;
    }

    public ReportOutline withNetworkTraffic(NetworkTraffic networkTraffic) {
        this.networkTraffic = networkTraffic;
        return this;
    }

    public ReportOutline withNetworkTraffic(Consumer<NetworkTraffic> networkTrafficSetter) {
        if (this.networkTraffic == null) {
            this.networkTraffic = new NetworkTraffic();
            networkTrafficSetter.accept(this.networkTraffic);
        }

        return this;
    }

    /**
     * Get networkTraffic
     * @return networkTraffic
     */
    public NetworkTraffic getNetworkTraffic() {
        return networkTraffic;
    }

    public void setNetworkTraffic(NetworkTraffic networkTraffic) {
        this.networkTraffic = networkTraffic;
    }

    public ReportOutline withResponseCodeSum(ResponseCodeSum responseCodeSum) {
        this.responseCodeSum = responseCodeSum;
        return this;
    }

    public ReportOutline withResponseCodeSum(Consumer<ResponseCodeSum> responseCodeSumSetter) {
        if (this.responseCodeSum == null) {
            this.responseCodeSum = new ResponseCodeSum();
            responseCodeSumSetter.accept(this.responseCodeSum);
        }

        return this;
    }

    /**
     * Get responseCodeSum
     * @return responseCodeSum
     */
    public ResponseCodeSum getResponseCodeSum() {
        return responseCodeSum;
    }

    public void setResponseCodeSum(ResponseCodeSum responseCodeSum) {
        this.responseCodeSum = responseCodeSum;
    }

    public ReportOutline withTaskBasicAttribute(TaskBasicAttribute taskBasicAttribute) {
        this.taskBasicAttribute = taskBasicAttribute;
        return this;
    }

    public ReportOutline withTaskBasicAttribute(Consumer<TaskBasicAttribute> taskBasicAttributeSetter) {
        if (this.taskBasicAttribute == null) {
            this.taskBasicAttribute = new TaskBasicAttribute();
            taskBasicAttributeSetter.accept(this.taskBasicAttribute);
        }

        return this;
    }

    /**
     * Get taskBasicAttribute
     * @return taskBasicAttribute
     */
    public TaskBasicAttribute getTaskBasicAttribute() {
        return taskBasicAttribute;
    }

    public void setTaskBasicAttribute(TaskBasicAttribute taskBasicAttribute) {
        this.taskBasicAttribute = taskBasicAttribute;
    }

    public ReportOutline withTaskBasicExecutionData(TaskBasicExecutionData taskBasicExecutionData) {
        this.taskBasicExecutionData = taskBasicExecutionData;
        return this;
    }

    public ReportOutline withTaskBasicExecutionData(Consumer<TaskBasicExecutionData> taskBasicExecutionDataSetter) {
        if (this.taskBasicExecutionData == null) {
            this.taskBasicExecutionData = new TaskBasicExecutionData();
            taskBasicExecutionDataSetter.accept(this.taskBasicExecutionData);
        }

        return this;
    }

    /**
     * Get taskBasicExecutionData
     * @return taskBasicExecutionData
     */
    public TaskBasicExecutionData getTaskBasicExecutionData() {
        return taskBasicExecutionData;
    }

    public void setTaskBasicExecutionData(TaskBasicExecutionData taskBasicExecutionData) {
        this.taskBasicExecutionData = taskBasicExecutionData;
    }

    public ReportOutline withResponseCodeDetails(List<Object> responseCodeDetails) {
        this.responseCodeDetails = responseCodeDetails;
        return this;
    }

    public ReportOutline addResponseCodeDetailsItem(Object responseCodeDetailsItem) {
        if (this.responseCodeDetails == null) {
            this.responseCodeDetails = new ArrayList<>();
        }
        this.responseCodeDetails.add(responseCodeDetailsItem);
        return this;
    }

    public ReportOutline withResponseCodeDetails(Consumer<List<Object>> responseCodeDetailsSetter) {
        if (this.responseCodeDetails == null) {
            this.responseCodeDetails = new ArrayList<>();
        }
        responseCodeDetailsSetter.accept(this.responseCodeDetails);
        return this;
    }

    /**
     * 响应码详细信息
     * @return responseCodeDetails
     */
    public List<Object> getResponseCodeDetails() {
        return responseCodeDetails;
    }

    public void setResponseCodeDetails(List<Object> responseCodeDetails) {
        this.responseCodeDetails = responseCodeDetails;
    }

    public ReportOutline withSlaStatistic(Object slaStatistic) {
        this.slaStatistic = slaStatistic;
        return this;
    }

    /**
     * SLA数据
     * @return slaStatistic
     */
    public Object getSlaStatistic() {
        return slaStatistic;
    }

    public void setSlaStatistic(Object slaStatistic) {
        this.slaStatistic = slaStatistic;
    }

    public ReportOutline withStreamingMedia(Object streamingMedia) {
        this.streamingMedia = streamingMedia;
        return this;
    }

    /**
     * 流媒体相关数据
     * @return streamingMedia
     */
    public Object getStreamingMedia() {
        return streamingMedia;
    }

    public void setStreamingMedia(Object streamingMedia) {
        this.streamingMedia = streamingMedia;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReportOutline that = (ReportOutline) obj;
        return Objects.equals(this.coreIndex, that.coreIndex)
            && Objects.equals(this.exceptionResponseSum, that.exceptionResponseSum)
            && Objects.equals(this.networkTraffic, that.networkTraffic)
            && Objects.equals(this.responseCodeSum, that.responseCodeSum)
            && Objects.equals(this.taskBasicAttribute, that.taskBasicAttribute)
            && Objects.equals(this.taskBasicExecutionData, that.taskBasicExecutionData)
            && Objects.equals(this.responseCodeDetails, that.responseCodeDetails)
            && Objects.equals(this.slaStatistic, that.slaStatistic)
            && Objects.equals(this.streamingMedia, that.streamingMedia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coreIndex,
            exceptionResponseSum,
            networkTraffic,
            responseCodeSum,
            taskBasicAttribute,
            taskBasicExecutionData,
            responseCodeDetails,
            slaStatistic,
            streamingMedia);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReportOutline {\n");
        sb.append("    coreIndex: ").append(toIndentedString(coreIndex)).append("\n");
        sb.append("    exceptionResponseSum: ").append(toIndentedString(exceptionResponseSum)).append("\n");
        sb.append("    networkTraffic: ").append(toIndentedString(networkTraffic)).append("\n");
        sb.append("    responseCodeSum: ").append(toIndentedString(responseCodeSum)).append("\n");
        sb.append("    taskBasicAttribute: ").append(toIndentedString(taskBasicAttribute)).append("\n");
        sb.append("    taskBasicExecutionData: ").append(toIndentedString(taskBasicExecutionData)).append("\n");
        sb.append("    responseCodeDetails: ").append(toIndentedString(responseCodeDetails)).append("\n");
        sb.append("    slaStatistic: ").append(toIndentedString(slaStatistic)).append("\n");
        sb.append("    streamingMedia: ").append(toIndentedString(streamingMedia)).append("\n");
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
