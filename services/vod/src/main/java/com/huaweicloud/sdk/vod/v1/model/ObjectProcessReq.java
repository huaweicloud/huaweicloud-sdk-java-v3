package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ObjectProcessReq
 */
public class ObjectProcessReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    private ObsInfo input;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private ObsInfo output;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transcode_task")

    private List<ObjectTranscodeTask> transcodeTask = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_process")

    private VideoProcess videoProcess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "watermarks")

    private List<WatermarkRequest> watermarks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thumbnail_task")

    private List<ObjectThumbnailTask> thumbnailTask = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_sprite_task")

    private List<ObjectImageSpriteTask> imageSpriteTask = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "callback_url")

    private String callbackUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_context")

    private String sessionContext;

    public ObjectProcessReq withInput(ObsInfo input) {
        this.input = input;
        return this;
    }

    public ObjectProcessReq withInput(Consumer<ObsInfo> inputSetter) {
        if (this.input == null) {
            this.input = new ObsInfo();
            inputSetter.accept(this.input);
        }

        return this;
    }

    /**
     * Get input
     * @return input
     */
    public ObsInfo getInput() {
        return input;
    }

    public void setInput(ObsInfo input) {
        this.input = input;
    }

    public ObjectProcessReq withOutput(ObsInfo output) {
        this.output = output;
        return this;
    }

    public ObjectProcessReq withOutput(Consumer<ObsInfo> outputSetter) {
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

    public ObjectProcessReq withTranscodeTask(List<ObjectTranscodeTask> transcodeTask) {
        this.transcodeTask = transcodeTask;
        return this;
    }

    public ObjectProcessReq addTranscodeTaskItem(ObjectTranscodeTask transcodeTaskItem) {
        if (this.transcodeTask == null) {
            this.transcodeTask = new ArrayList<>();
        }
        this.transcodeTask.add(transcodeTaskItem);
        return this;
    }

    public ObjectProcessReq withTranscodeTask(Consumer<List<ObjectTranscodeTask>> transcodeTaskSetter) {
        if (this.transcodeTask == null) {
            this.transcodeTask = new ArrayList<>();
        }
        transcodeTaskSetter.accept(this.transcodeTask);
        return this;
    }

    /**
     * 转码任务列表 
     * @return transcodeTask
     */
    public List<ObjectTranscodeTask> getTranscodeTask() {
        return transcodeTask;
    }

    public void setTranscodeTask(List<ObjectTranscodeTask> transcodeTask) {
        this.transcodeTask = transcodeTask;
    }

    public ObjectProcessReq withVideoProcess(VideoProcess videoProcess) {
        this.videoProcess = videoProcess;
        return this;
    }

    public ObjectProcessReq withVideoProcess(Consumer<VideoProcess> videoProcessSetter) {
        if (this.videoProcess == null) {
            this.videoProcess = new VideoProcess();
            videoProcessSetter.accept(this.videoProcess);
        }

        return this;
    }

    /**
     * Get videoProcess
     * @return videoProcess
     */
    public VideoProcess getVideoProcess() {
        return videoProcess;
    }

    public void setVideoProcess(VideoProcess videoProcess) {
        this.videoProcess = videoProcess;
    }

    public ObjectProcessReq withWatermarks(List<WatermarkRequest> watermarks) {
        this.watermarks = watermarks;
        return this;
    }

    public ObjectProcessReq addWatermarksItem(WatermarkRequest watermarksItem) {
        if (this.watermarks == null) {
            this.watermarks = new ArrayList<>();
        }
        this.watermarks.add(watermarksItem);
        return this;
    }

    public ObjectProcessReq withWatermarks(Consumer<List<WatermarkRequest>> watermarksSetter) {
        if (this.watermarks == null) {
            this.watermarks = new ArrayList<>();
        }
        watermarksSetter.accept(this.watermarks);
        return this;
    }

    /**
     * 水印设置 
     * @return watermarks
     */
    public List<WatermarkRequest> getWatermarks() {
        return watermarks;
    }

    public void setWatermarks(List<WatermarkRequest> watermarks) {
        this.watermarks = watermarks;
    }

    public ObjectProcessReq withThumbnailTask(List<ObjectThumbnailTask> thumbnailTask) {
        this.thumbnailTask = thumbnailTask;
        return this;
    }

    public ObjectProcessReq addThumbnailTaskItem(ObjectThumbnailTask thumbnailTaskItem) {
        if (this.thumbnailTask == null) {
            this.thumbnailTask = new ArrayList<>();
        }
        this.thumbnailTask.add(thumbnailTaskItem);
        return this;
    }

    public ObjectProcessReq withThumbnailTask(Consumer<List<ObjectThumbnailTask>> thumbnailTaskSetter) {
        if (this.thumbnailTask == null) {
            this.thumbnailTask = new ArrayList<>();
        }
        thumbnailTaskSetter.accept(this.thumbnailTask);
        return this;
    }

    /**
     * 转码任务列表 
     * @return thumbnailTask
     */
    public List<ObjectThumbnailTask> getThumbnailTask() {
        return thumbnailTask;
    }

    public void setThumbnailTask(List<ObjectThumbnailTask> thumbnailTask) {
        this.thumbnailTask = thumbnailTask;
    }

    public ObjectProcessReq withImageSpriteTask(List<ObjectImageSpriteTask> imageSpriteTask) {
        this.imageSpriteTask = imageSpriteTask;
        return this;
    }

    public ObjectProcessReq addImageSpriteTaskItem(ObjectImageSpriteTask imageSpriteTaskItem) {
        if (this.imageSpriteTask == null) {
            this.imageSpriteTask = new ArrayList<>();
        }
        this.imageSpriteTask.add(imageSpriteTaskItem);
        return this;
    }

    public ObjectProcessReq withImageSpriteTask(Consumer<List<ObjectImageSpriteTask>> imageSpriteTaskSetter) {
        if (this.imageSpriteTask == null) {
            this.imageSpriteTask = new ArrayList<>();
        }
        imageSpriteTaskSetter.accept(this.imageSpriteTask);
        return this;
    }

    /**
     * 转码任务列表 
     * @return imageSpriteTask
     */
    public List<ObjectImageSpriteTask> getImageSpriteTask() {
        return imageSpriteTask;
    }

    public void setImageSpriteTask(List<ObjectImageSpriteTask> imageSpriteTask) {
        this.imageSpriteTask = imageSpriteTask;
    }

    public ObjectProcessReq withCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }

    /**
     * 回调url 
     * @return callbackUrl
     */
    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public ObjectProcessReq withSessionContext(String sessionContext) {
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
        ObjectProcessReq that = (ObjectProcessReq) obj;
        return Objects.equals(this.input, that.input) && Objects.equals(this.output, that.output)
            && Objects.equals(this.transcodeTask, that.transcodeTask)
            && Objects.equals(this.videoProcess, that.videoProcess) && Objects.equals(this.watermarks, that.watermarks)
            && Objects.equals(this.thumbnailTask, that.thumbnailTask)
            && Objects.equals(this.imageSpriteTask, that.imageSpriteTask)
            && Objects.equals(this.callbackUrl, that.callbackUrl)
            && Objects.equals(this.sessionContext, that.sessionContext);
    }

    @Override
    public int hashCode() {
        return Objects.hash(input,
            output,
            transcodeTask,
            videoProcess,
            watermarks,
            thumbnailTask,
            imageSpriteTask,
            callbackUrl,
            sessionContext);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObjectProcessReq {\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    transcodeTask: ").append(toIndentedString(transcodeTask)).append("\n");
        sb.append("    videoProcess: ").append(toIndentedString(videoProcess)).append("\n");
        sb.append("    watermarks: ").append(toIndentedString(watermarks)).append("\n");
        sb.append("    thumbnailTask: ").append(toIndentedString(thumbnailTask)).append("\n");
        sb.append("    imageSpriteTask: ").append(toIndentedString(imageSpriteTask)).append("\n");
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
