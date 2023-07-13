package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ImageHighresolutionMattingInput
 */
public class ImageHighresolutionMattingInput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private List<ImageHighresolutionMattingInputData> data = null;

    public ImageHighresolutionMattingInput withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 任务的输入类型。可选类型为url（指定的文件地址）
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ImageHighresolutionMattingInput withData(List<ImageHighresolutionMattingInputData> data) {
        this.data = data;
        return this;
    }

    public ImageHighresolutionMattingInput addDataItem(ImageHighresolutionMattingInputData dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public ImageHighresolutionMattingInput withData(Consumer<List<ImageHighresolutionMattingInputData>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * 任务的输入详情。针对不同的输入类型有不同的配置。高清图像抠图服务目前只支持识别PNG、JPEG、BMP、JPG、TIF格式的图片，只支持单张图片的url输入方式，图像各边的像素大小在1px至10000px之间， URL提供的图片大小不超过20MB
     * @return data
     */
    public List<ImageHighresolutionMattingInputData> getData() {
        return data;
    }

    public void setData(List<ImageHighresolutionMattingInputData> data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageHighresolutionMattingInput that = (ImageHighresolutionMattingInput) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageHighresolutionMattingInput {\n");
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
