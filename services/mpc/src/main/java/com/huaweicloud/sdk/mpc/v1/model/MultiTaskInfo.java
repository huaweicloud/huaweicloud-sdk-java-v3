package com.huaweicloud.sdk.mpc.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.ErrorResponse;
import com.huaweicloud.sdk.mpc.v1.model.SourceInfo;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * MultiTaskInfo
 */
public class MultiTaskInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="template_id")
    
    private Integer templateId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error")
    
    private ErrorResponse error;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="output_file")
    
    private SourceInfo outputFile;

    public MultiTaskInfo withTemplateId(Integer templateId) {
        this.templateId = templateId;
        return this;
    }

    


    /**
     * 转码模板ID。
     * @return templateId
     */
    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    

    public MultiTaskInfo withError(ErrorResponse error) {
        this.error = error;
        return this;
    }

    public MultiTaskInfo withError(Consumer<ErrorResponse> errorSetter) {
        if(this.error == null ){
            this.error = new ErrorResponse();
            errorSetter.accept(this.error);
        }
        
        return this;
    }


    /**
     * Get error
     * @return error
     */
    public ErrorResponse getError() {
        return error;
    }

    public void setError(ErrorResponse error) {
        this.error = error;
    }

    

    public MultiTaskInfo withOutputFile(SourceInfo outputFile) {
        this.outputFile = outputFile;
        return this;
    }

    public MultiTaskInfo withOutputFile(Consumer<SourceInfo> outputFileSetter) {
        if(this.outputFile == null ){
            this.outputFile = new SourceInfo();
            outputFileSetter.accept(this.outputFile);
        }
        
        return this;
    }


    /**
     * Get outputFile
     * @return outputFile
     */
    public SourceInfo getOutputFile() {
        return outputFile;
    }

    public void setOutputFile(SourceInfo outputFile) {
        this.outputFile = outputFile;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MultiTaskInfo multiTaskInfo = (MultiTaskInfo) o;
        return Objects.equals(this.templateId, multiTaskInfo.templateId) &&
            Objects.equals(this.error, multiTaskInfo.error) &&
            Objects.equals(this.outputFile, multiTaskInfo.outputFile);
    }
    @Override
    public int hashCode() {
        return Objects.hash(templateId, error, outputFile);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MultiTaskInfo {\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    outputFile: ").append(toIndentedString(outputFile)).append("\n");
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

