package com.huaweicloud.sdk.classroom.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 测试用例信息
 */
public class ExerciseCaseResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "polymeric_resource_id")

    private String polymericResourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_file")

    private String inputFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_file")

    private String outputFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index")

    private Integer index;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_type")

    private String inputType;

    public ExerciseCaseResource withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 测试用例存储id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ExerciseCaseResource withPolymericResourceId(String polymericResourceId) {
        this.polymericResourceId = polymericResourceId;
        return this;
    }

    /**
     * 资源聚合id
     * @return polymericResourceId
     */
    public String getPolymericResourceId() {
        return polymericResourceId;
    }

    public void setPolymericResourceId(String polymericResourceId) {
        this.polymericResourceId = polymericResourceId;
    }

    public ExerciseCaseResource withInputFile(String inputFile) {
        this.inputFile = inputFile;
        return this;
    }

    /**
     * 用例输入
     * @return inputFile
     */
    public String getInputFile() {
        return inputFile;
    }

    public void setInputFile(String inputFile) {
        this.inputFile = inputFile;
    }

    public ExerciseCaseResource withOutputFile(String outputFile) {
        this.outputFile = outputFile;
        return this;
    }

    /**
     * 用例输出
     * @return outputFile
     */
    public String getOutputFile() {
        return outputFile;
    }

    public void setOutputFile(String outputFile) {
        this.outputFile = outputFile;
    }

    public ExerciseCaseResource withIndex(Integer index) {
        this.index = index;
        return this;
    }

    /**
     * 用例顺序位置
     * @return index
     */
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public ExerciseCaseResource withInputType(String inputType) {
        this.inputType = inputType;
        return this;
    }

    /**
     * 用例类型
     * @return inputType
     */
    public String getInputType() {
        return inputType;
    }

    public void setInputType(String inputType) {
        this.inputType = inputType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExerciseCaseResource that = (ExerciseCaseResource) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.polymericResourceId, that.polymericResourceId)
            && Objects.equals(this.inputFile, that.inputFile) && Objects.equals(this.outputFile, that.outputFile)
            && Objects.equals(this.index, that.index) && Objects.equals(this.inputType, that.inputType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, polymericResourceId, inputFile, outputFile, index, inputType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExerciseCaseResource {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    polymericResourceId: ").append(toIndentedString(polymericResourceId)).append("\n");
        sb.append("    inputFile: ").append(toIndentedString(inputFile)).append("\n");
        sb.append("    outputFile: ").append(toIndentedString(outputFile)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    inputType: ").append(toIndentedString(inputType)).append("\n");
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
