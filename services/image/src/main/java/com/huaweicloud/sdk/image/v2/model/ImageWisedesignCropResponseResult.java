package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 智能设计商品图像裁剪结果信息
 */
public class ImageWisedesignCropResponseResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "box")

    private List<Integer> box = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_base64")

    private String imageBase64;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    public ImageWisedesignCropResponseResult withBox(List<Integer> box) {
        this.box = box;
        return this;
    }

    public ImageWisedesignCropResponseResult addBoxItem(Integer boxItem) {
        if (this.box == null) {
            this.box = new ArrayList<>();
        }
        this.box.add(boxItem);
        return this;
    }

    public ImageWisedesignCropResponseResult withBox(Consumer<List<Integer>> boxSetter) {
        if (this.box == null) {
            this.box = new ArrayList<>();
        }
        boxSetter.accept(this.box);
        return this;
    }

    /**
     * 裁剪结果框，有四个整型数值，分别代表左上角横坐标、左上角纵坐标、右下角横坐标、右下角纵坐标，示例：[x_min, y_min, x_max, y_max]
     * @return box
     */
    public List<Integer> getBox() {
        return box;
    }

    public void setBox(List<Integer> box) {
        this.box = box;
    }

    public ImageWisedesignCropResponseResult withImageBase64(String imageBase64) {
        this.imageBase64 = imageBase64;
        return this;
    }

    /**
     * 裁剪后图像的64位编码
     * @return imageBase64
     */
    public String getImageBase64() {
        return imageBase64;
    }

    public void setImageBase64(String imageBase64) {
        this.imageBase64 = imageBase64;
    }

    public ImageWisedesignCropResponseResult withTaskId(String taskId) {
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
        ImageWisedesignCropResponseResult imageWisedesignCropResponseResult = (ImageWisedesignCropResponseResult) o;
        return Objects.equals(this.box, imageWisedesignCropResponseResult.box)
            && Objects.equals(this.imageBase64, imageWisedesignCropResponseResult.imageBase64)
            && Objects.equals(this.taskId, imageWisedesignCropResponseResult.taskId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(box, imageBase64, taskId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageWisedesignCropResponseResult {\n");
        sb.append("    box: ").append(toIndentedString(box)).append("\n");
        sb.append("    imageBase64: ").append(toIndentedString(imageBase64)).append("\n");
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
