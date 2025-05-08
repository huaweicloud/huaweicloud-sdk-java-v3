package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * obs桶取回请求消息
 */
public class CreateRealTimeClipRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeshift_domain")

    private String timeshiftDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app")

    private String app;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream")

    private String stream;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trans_template_name")

    private String transTemplateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_persistence")

    private Integer isPersistence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_bucket")

    private String outputBucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_object")

    private String outputObject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "media_process_task")

    private AdditionalObjectProcessReq mediaProcessTask;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "callback_url")

    private String callbackUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_context")

    private String sessionContext;

    public CreateRealTimeClipRequestBody withTimeshiftDomain(String timeshiftDomain) {
        this.timeshiftDomain = timeshiftDomain;
        return this;
    }

    /**
     * 时移域名 
     * @return timeshiftDomain
     */
    public String getTimeshiftDomain() {
        return timeshiftDomain;
    }

    public void setTimeshiftDomain(String timeshiftDomain) {
        this.timeshiftDomain = timeshiftDomain;
    }

    public CreateRealTimeClipRequestBody withApp(String app) {
        this.app = app;
        return this;
    }

    /**
     * live的应用名，默认可填写live 
     * @return app
     */
    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public CreateRealTimeClipRequestBody withStream(String stream) {
        this.stream = stream;
        return this;
    }

    /**
     * 截取的流名 
     * @return stream
     */
    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public CreateRealTimeClipRequestBody withTransTemplateName(String transTemplateName) {
        this.transTemplateName = transTemplateName;
        return this;
    }

    /**
     * 直播时移的转码模板，空表示截取源流 
     * @return transTemplateName
     */
    public String getTransTemplateName() {
        return transTemplateName;
    }

    public void setTransTemplateName(String transTemplateName) {
        this.transTemplateName = transTemplateName;
    }

    public CreateRealTimeClipRequestBody withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 截取流的开始时间，格式为：YYYY-MM-DDTHH:mm:ssZ（UTC时间）,开始时间与结束时间的间隔最大为12小时 
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public CreateRealTimeClipRequestBody withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 截取流的开始时间，格式为：YYYY-MM-DDTHH:mm:ssZ（UTC时间）,开始时间与结束时间的间隔最大为12小时 
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public CreateRealTimeClipRequestBody withIsPersistence(Integer isPersistence) {
        this.isPersistence = isPersistence;
        return this;
    }

    /**
     * 0 非固化，1 固化。默认非固化 
     * minimum: 0
     * maximum: 1
     * @return isPersistence
     */
    public Integer getIsPersistence() {
        return isPersistence;
    }

    public void setIsPersistence(Integer isPersistence) {
        this.isPersistence = isPersistence;
    }

    public CreateRealTimeClipRequestBody withOutputBucket(String outputBucket) {
        this.outputBucket = outputBucket;
        return this;
    }

    /**
     * 非固化场景为空，固化场景必填，复制到该桶中。 
     * @return outputBucket
     */
    public String getOutputBucket() {
        return outputBucket;
    }

    public void setOutputBucket(String outputBucket) {
        this.outputBucket = outputBucket;
    }

    public CreateRealTimeClipRequestBody withOutputObject(String outputObject) {
        this.outputObject = outputObject;
        return this;
    }

    /**
     * 截取指定的m3u8文件路径名，仅支持HLS 
     * @return outputObject
     */
    public String getOutputObject() {
        return outputObject;
    }

    public void setOutputObject(String outputObject) {
        this.outputObject = outputObject;
    }

    public CreateRealTimeClipRequestBody withMediaProcessTask(AdditionalObjectProcessReq mediaProcessTask) {
        this.mediaProcessTask = mediaProcessTask;
        return this;
    }

    public CreateRealTimeClipRequestBody withMediaProcessTask(
        Consumer<AdditionalObjectProcessReq> mediaProcessTaskSetter) {
        if (this.mediaProcessTask == null) {
            this.mediaProcessTask = new AdditionalObjectProcessReq();
            mediaProcessTaskSetter.accept(this.mediaProcessTask);
        }

        return this;
    }

    /**
     * Get mediaProcessTask
     * @return mediaProcessTask
     */
    public AdditionalObjectProcessReq getMediaProcessTask() {
        return mediaProcessTask;
    }

    public void setMediaProcessTask(AdditionalObjectProcessReq mediaProcessTask) {
        this.mediaProcessTask = mediaProcessTask;
    }

    public CreateRealTimeClipRequestBody withCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }

    /**
     * 回调地址，为空则不回调 
     * @return callbackUrl
     */
    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public CreateRealTimeClipRequestBody withSessionContext(String sessionContext) {
        this.sessionContext = sessionContext;
        return this;
    }

    /**
     * 自定义上下文，回调时会回调给用户，透传信息 
     * @return sessionContext
     */
    public String getSessionContext() {
        return sessionContext;
    }

    public void setSessionContext(String sessionContext) {
        this.sessionContext = sessionContext;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateRealTimeClipRequestBody that = (CreateRealTimeClipRequestBody) obj;
        return Objects.equals(this.timeshiftDomain, that.timeshiftDomain) && Objects.equals(this.app, that.app)
            && Objects.equals(this.stream, that.stream)
            && Objects.equals(this.transTemplateName, that.transTemplateName)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.isPersistence, that.isPersistence)
            && Objects.equals(this.outputBucket, that.outputBucket)
            && Objects.equals(this.outputObject, that.outputObject)
            && Objects.equals(this.mediaProcessTask, that.mediaProcessTask)
            && Objects.equals(this.callbackUrl, that.callbackUrl)
            && Objects.equals(this.sessionContext, that.sessionContext);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeshiftDomain,
            app,
            stream,
            transTemplateName,
            startTime,
            endTime,
            isPersistence,
            outputBucket,
            outputObject,
            mediaProcessTask,
            callbackUrl,
            sessionContext);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRealTimeClipRequestBody {\n");
        sb.append("    timeshiftDomain: ").append(toIndentedString(timeshiftDomain)).append("\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
        sb.append("    transTemplateName: ").append(toIndentedString(transTemplateName)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    isPersistence: ").append(toIndentedString(isPersistence)).append("\n");
        sb.append("    outputBucket: ").append(toIndentedString(outputBucket)).append("\n");
        sb.append("    outputObject: ").append(toIndentedString(outputObject)).append("\n");
        sb.append("    mediaProcessTask: ").append(toIndentedString(mediaProcessTask)).append("\n");
        sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
        sb.append("    sessionContext: ").append(toIndentedString(sessionContext)).append("\n");
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
