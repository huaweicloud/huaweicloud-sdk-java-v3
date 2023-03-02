package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 智能设计图像修复结果信息
 */
public class ImageWisedesignInpaintingResponseResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_base64")

    private String imageBase64;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    public ImageWisedesignInpaintingResponseResult withImageBase64(String imageBase64) {
        this.imageBase64 = imageBase64;
        return this;
    }

    /**
     * 修复结果图片base64
     * @return imageBase64
     */
    public String getImageBase64() {
        return imageBase64;
    }

    public void setImageBase64(String imageBase64) {
        this.imageBase64 = imageBase64;
    }

    public ImageWisedesignInpaintingResponseResult withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 请求类型
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public ImageWisedesignInpaintingResponseResult withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 请求的任务id
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImageWisedesignInpaintingResponseResult imageWisedesignInpaintingResponseResult =
            (ImageWisedesignInpaintingResponseResult) o;
        return Objects.equals(this.imageBase64, imageWisedesignInpaintingResponseResult.imageBase64)
            && Objects.equals(this.action, imageWisedesignInpaintingResponseResult.action)
            && Objects.equals(this.taskId, imageWisedesignInpaintingResponseResult.taskId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageBase64, action, taskId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageWisedesignInpaintingResponseResult {\n");
        sb.append("    imageBase64: ").append(toIndentedString(imageBase64)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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
