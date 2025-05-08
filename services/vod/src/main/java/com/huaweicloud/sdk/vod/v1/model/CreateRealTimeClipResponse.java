package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateRealTimeClipResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_domain")

    private String publishDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app")

    private String app;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream")

    private String stream;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Integer startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Integer endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_url")

    private String fileUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private ObsInfo output;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "meta_data")

    private ObjectMetaData metaData;

    public CreateRealTimeClipResponse withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 截取的任务id，回调时会返回该任务id 
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public CreateRealTimeClipResponse withPublishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
        return this;
    }

    /**
     * 直播推流域名 
     * @return publishDomain
     */
    public String getPublishDomain() {
        return publishDomain;
    }

    public void setPublishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
    }

    public CreateRealTimeClipResponse withApp(String app) {
        this.app = app;
        return this;
    }

    /**
     * 应用名 
     * @return app
     */
    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public CreateRealTimeClipResponse withStream(String stream) {
        this.stream = stream;
        return this;
    }

    /**
     * 录制的流名 
     * @return stream
     */
    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public CreateRealTimeClipResponse withStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 录制完成文件对应的启动录制时间，UNIX时间戳 
     * @return startTime
     */
    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public CreateRealTimeClipResponse withEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 录制完成文件对应的完成录制时间，UNIX时间戳 
     * @return endTime
     */
    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public CreateRealTimeClipResponse withFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }

    /**
     * 粉丝截取响应的obs地址 
     * @return fileUrl
     */
    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public CreateRealTimeClipResponse withOutput(ObsInfo output) {
        this.output = output;
        return this;
    }

    public CreateRealTimeClipResponse withOutput(Consumer<ObsInfo> outputSetter) {
        if (this.output == null) {
            this.output = new ObsInfo();
            outputSetter.accept(this.output);
        }

        return this;
    }

    /**
     * Get output
     * @return output
     */
    public ObsInfo getOutput() {
        return output;
    }

    public void setOutput(ObsInfo output) {
        this.output = output;
    }

    public CreateRealTimeClipResponse withMetaData(ObjectMetaData metaData) {
        this.metaData = metaData;
        return this;
    }

    public CreateRealTimeClipResponse withMetaData(Consumer<ObjectMetaData> metaDataSetter) {
        if (this.metaData == null) {
            this.metaData = new ObjectMetaData();
            metaDataSetter.accept(this.metaData);
        }

        return this;
    }

    /**
     * Get metaData
     * @return metaData
     */
    public ObjectMetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(ObjectMetaData metaData) {
        this.metaData = metaData;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateRealTimeClipResponse that = (CreateRealTimeClipResponse) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.publishDomain, that.publishDomain)
            && Objects.equals(this.app, that.app) && Objects.equals(this.stream, that.stream)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.fileUrl, that.fileUrl) && Objects.equals(this.output, that.output)
            && Objects.equals(this.metaData, that.metaData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, publishDomain, app, stream, startTime, endTime, fileUrl, output, metaData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRealTimeClipResponse {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    publishDomain: ").append(toIndentedString(publishDomain)).append("\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    fileUrl: ").append(toIndentedString(fileUrl)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
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
