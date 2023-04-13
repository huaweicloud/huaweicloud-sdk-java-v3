package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ImageTranslateTaskInput
 */
public class ImageTranslateTaskInput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private List<ImageTranslateTaskInputData> data = null;

    public ImageTranslateTaskInput withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 任务的输入类型。可选类型有obs（对象存储服务存储的文件），url（指定的文件地址）
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ImageTranslateTaskInput withData(List<ImageTranslateTaskInputData> data) {
        this.data = data;
        return this;
    }

    public ImageTranslateTaskInput addDataItem(ImageTranslateTaskInputData dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public ImageTranslateTaskInput withData(Consumer<List<ImageTranslateTaskInputData>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * 任务的输入详情。针对不同的输入类型有不同的配置。图像翻译服务只支持识别PNG、JPEG、BMP、JPG格式的图片。只支持单张图片输入，,分辨率范围为1px-10000px，且长短边比例不能高于100
     * @return data
     */
    public List<ImageTranslateTaskInputData> getData() {
        return data;
    }

    public void setData(List<ImageTranslateTaskInputData> data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImageTranslateTaskInput imageTranslateTaskInput = (ImageTranslateTaskInput) o;
        return Objects.equals(this.type, imageTranslateTaskInput.type)
            && Objects.equals(this.data, imageTranslateTaskInput.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageTranslateTaskInput {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
