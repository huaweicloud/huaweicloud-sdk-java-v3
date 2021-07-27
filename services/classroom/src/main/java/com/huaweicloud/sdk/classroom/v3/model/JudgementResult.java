package com.huaweicloud.sdk.classroom.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 任务执行结果
 */
public class JudgementResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="output")
    
    private String output;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="file_id")
    
    private String fileId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="image_id")
    
    private String imageId;

    public JudgementResult withOutput(String output) {
        this.output = output;
        return this;
    }

    


    /**
     * 标准类型输出结果
     * @return output
     */
    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    

    public JudgementResult withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    


    /**
     * 文件形式输出的文件id，可根据文件id下载详情
     * @return fileId
     */
    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    

    public JudgementResult withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    


    /**
     * 图片形式输出的图片id，可根据图片id下载详情
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JudgementResult judgementResult = (JudgementResult) o;
        return Objects.equals(this.output, judgementResult.output) &&
            Objects.equals(this.fileId, judgementResult.fileId) &&
            Objects.equals(this.imageId, judgementResult.imageId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(output, fileId, imageId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JudgementResult {\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
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

