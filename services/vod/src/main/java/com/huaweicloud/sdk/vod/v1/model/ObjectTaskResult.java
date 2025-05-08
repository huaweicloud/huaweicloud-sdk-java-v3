package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ObjectTaskResult
 */
public class ObjectTaskResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private String taskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transcode_task")

    private TranscodeTask transcodeTask;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thumbnail_task")

    private ThumbnailTask thumbnailTask;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_sprite_task")

    private ImageSpriteTask imageSpriteTask;

    public ObjectTaskResult withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 工作流中任务类型
     * @return taskType
     */
    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public ObjectTaskResult withTranscodeTask(TranscodeTask transcodeTask) {
        this.transcodeTask = transcodeTask;
        return this;
    }

    public ObjectTaskResult withTranscodeTask(Consumer<TranscodeTask> transcodeTaskSetter) {
        if (this.transcodeTask == null) {
            this.transcodeTask = new TranscodeTask();
            transcodeTaskSetter.accept(this.transcodeTask);
        }

        return this;
    }

    /**
     * Get transcodeTask
     * @return transcodeTask
     */
    public TranscodeTask getTranscodeTask() {
        return transcodeTask;
    }

    public void setTranscodeTask(TranscodeTask transcodeTask) {
        this.transcodeTask = transcodeTask;
    }

    public ObjectTaskResult withThumbnailTask(ThumbnailTask thumbnailTask) {
        this.thumbnailTask = thumbnailTask;
        return this;
    }

    public ObjectTaskResult withThumbnailTask(Consumer<ThumbnailTask> thumbnailTaskSetter) {
        if (this.thumbnailTask == null) {
            this.thumbnailTask = new ThumbnailTask();
            thumbnailTaskSetter.accept(this.thumbnailTask);
        }

        return this;
    }

    /**
     * Get thumbnailTask
     * @return thumbnailTask
     */
    public ThumbnailTask getThumbnailTask() {
        return thumbnailTask;
    }

    public void setThumbnailTask(ThumbnailTask thumbnailTask) {
        this.thumbnailTask = thumbnailTask;
    }

    public ObjectTaskResult withImageSpriteTask(ImageSpriteTask imageSpriteTask) {
        this.imageSpriteTask = imageSpriteTask;
        return this;
    }

    public ObjectTaskResult withImageSpriteTask(Consumer<ImageSpriteTask> imageSpriteTaskSetter) {
        if (this.imageSpriteTask == null) {
            this.imageSpriteTask = new ImageSpriteTask();
            imageSpriteTaskSetter.accept(this.imageSpriteTask);
        }

        return this;
    }

    /**
     * Get imageSpriteTask
     * @return imageSpriteTask
     */
    public ImageSpriteTask getImageSpriteTask() {
        return imageSpriteTask;
    }

    public void setImageSpriteTask(ImageSpriteTask imageSpriteTask) {
        this.imageSpriteTask = imageSpriteTask;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ObjectTaskResult that = (ObjectTaskResult) obj;
        return Objects.equals(this.taskType, that.taskType) && Objects.equals(this.transcodeTask, that.transcodeTask)
            && Objects.equals(this.thumbnailTask, that.thumbnailTask)
            && Objects.equals(this.imageSpriteTask, that.imageSpriteTask);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskType, transcodeTask, thumbnailTask, imageSpriteTask);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObjectTaskResult {\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    transcodeTask: ").append(toIndentedString(transcodeTask)).append("\n");
        sb.append("    thumbnailTask: ").append(toIndentedString(thumbnailTask)).append("\n");
        sb.append("    imageSpriteTask: ").append(toIndentedString(imageSpriteTask)).append("\n");
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
