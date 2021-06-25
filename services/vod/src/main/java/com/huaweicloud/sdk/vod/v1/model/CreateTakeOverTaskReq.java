package com.huaweicloud.sdk.vod.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CreateTakeOverTaskReq
 */
public class CreateTakeOverTaskReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bucket")
    
    private String bucket;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="object")
    
    private String _object;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="suffix")
    
    private List<String> suffix = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="template_group_name")
    
    private String templateGroupName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="workflow_name")
    
    private String workflowName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="host_type")
    
    private Integer hostType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="output_bucket")
    
    private String outputBucket;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="output_path")
    
    private String outputPath;

    public CreateTakeOverTaskReq withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    


    /**
     * 桶 <br/> 
     * @return bucket
     */
    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    

    public CreateTakeOverTaskReq withObject(String _object) {
        this._object = _object;
        return this;
    }

    


    /**
     * 目录 
     * @return _object
     */
    public String getObject() {
        return _object;
    }

    public void setObject(String _object) {
        this._object = _object;
    }

    

    public CreateTakeOverTaskReq withSuffix(List<String> suffix) {
        this.suffix = suffix;
        return this;
    }

    
    public CreateTakeOverTaskReq addSuffixItem(String suffixItem) {
        if(this.suffix == null) {
            this.suffix = new ArrayList<>();
        }
        this.suffix.add(suffixItem);
        return this;
    }

    public CreateTakeOverTaskReq withSuffix(Consumer<List<String>> suffixSetter) {
        if(this.suffix == null) {
            this.suffix = new ArrayList<>();
        }
        suffixSetter.accept(this.suffix);
        return this;
    }

    /**
     * 指定托管文件后缀名 - 如果不传，或传空数组，则不会进行文件后缀名过滤。 
     * @return suffix
     */
    public List<String> getSuffix() {
        return suffix;
    }

    public void setSuffix(List<String> suffix) {
        this.suffix = suffix;
    }

    

    public CreateTakeOverTaskReq withTemplateGroupName(String templateGroupName) {
        this.templateGroupName = templateGroupName;
        return this;
    }

    


    /**
     * 转码模板组 <br/> 若未设置template_group_name和workflow_name，则不进行转码动作。 若同时设置了“template_group_name”和“workflow_name”字段，则“template_group_name”字段生效。 
     * @return templateGroupName
     */
    public String getTemplateGroupName() {
        return templateGroupName;
    }

    public void setTemplateGroupName(String templateGroupName) {
        this.templateGroupName = templateGroupName;
    }

    

    public CreateTakeOverTaskReq withWorkflowName(String workflowName) {
        this.workflowName = workflowName;
        return this;
    }

    


    /**
     * '工作流ID' 若同时设置了“template_group_name”和“workflow_name”字段，则“template_group_name”字段生效。 
     * @return workflowName
     */
    public String getWorkflowName() {
        return workflowName;
    }

    public void setWorkflowName(String workflowName) {
        this.workflowName = workflowName;
    }

    

    public CreateTakeOverTaskReq withHostType(Integer hostType) {
        this.hostType = hostType;
        return this;
    }

    


    /**
     * 托管类型：0表示存储到点播桶 1表示存储在租户桶  2表示存储到租户桶，并且存储路径与源文件一致。<br/> 
     * @return hostType
     */
    public Integer getHostType() {
        return hostType;
    }

    public void setHostType(Integer hostType) {
        this.hostType = hostType;
    }

    

    public CreateTakeOverTaskReq withOutputBucket(String outputBucket) {
        this.outputBucket = outputBucket;
        return this;
    }

    


    /**
     * 输出桶 <br/> 约束： - host_type为1时，必选 
     * @return outputBucket
     */
    public String getOutputBucket() {
        return outputBucket;
    }

    public void setOutputBucket(String outputBucket) {
        this.outputBucket = outputBucket;
    }

    

    public CreateTakeOverTaskReq withOutputPath(String outputPath) {
        this.outputPath = outputPath;
        return this;
    }

    


    /**
     * 输出路径 <br/> 约束： - host_type为1时，必选 
     * @return outputPath
     */
    public String getOutputPath() {
        return outputPath;
    }

    public void setOutputPath(String outputPath) {
        this.outputPath = outputPath;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateTakeOverTaskReq createTakeOverTaskReq = (CreateTakeOverTaskReq) o;
        return Objects.equals(this.bucket, createTakeOverTaskReq.bucket) &&
            Objects.equals(this._object, createTakeOverTaskReq._object) &&
            Objects.equals(this.suffix, createTakeOverTaskReq.suffix) &&
            Objects.equals(this.templateGroupName, createTakeOverTaskReq.templateGroupName) &&
            Objects.equals(this.workflowName, createTakeOverTaskReq.workflowName) &&
            Objects.equals(this.hostType, createTakeOverTaskReq.hostType) &&
            Objects.equals(this.outputBucket, createTakeOverTaskReq.outputBucket) &&
            Objects.equals(this.outputPath, createTakeOverTaskReq.outputPath);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bucket, _object, suffix, templateGroupName, workflowName, hostType, outputBucket, outputPath);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTakeOverTaskReq {\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
        sb.append("    templateGroupName: ").append(toIndentedString(templateGroupName)).append("\n");
        sb.append("    workflowName: ").append(toIndentedString(workflowName)).append("\n");
        sb.append("    hostType: ").append(toIndentedString(hostType)).append("\n");
        sb.append("    outputBucket: ").append(toIndentedString(outputBucket)).append("\n");
        sb.append("    outputPath: ").append(toIndentedString(outputPath)).append("\n");
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

