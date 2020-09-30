package com.huaweicloud.sdk.mpc.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.AuditReport;
import com.huaweicloud.sdk.mpc.v1.model.ObsObjInfo;
import com.huaweicloud.sdk.mpc.v1.model.PicInfo;
import com.huaweicloud.sdk.mpc.v1.model.TranscodeDetail;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * QueryTranscodingsTaskResponse
 */
public class QueryTranscodingsTaskResponse  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_id")
    
    private String taskId;
    /**
     * 任务执行状态。 
     */
    public static final class StatusEnum {

        
        /**
         * Enum NO_TASK for value: "NO_TASK"
         */
        public static final StatusEnum NO_TASK = new StatusEnum("NO_TASK");
        
        /**
         * Enum WAITING for value: "WAITING"
         */
        public static final StatusEnum WAITING = new StatusEnum("WAITING");
        
        /**
         * Enum TRANSCODING for value: "TRANSCODING"
         */
        public static final StatusEnum TRANSCODING = new StatusEnum("TRANSCODING");
        
        /**
         * Enum SUCCEEDED for value: "SUCCEEDED"
         */
        public static final StatusEnum SUCCEEDED = new StatusEnum("SUCCEEDED");
        
        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final StatusEnum FAILED = new StatusEnum("FAILED");
        
        /**
         * Enum CANCELED for value: "CANCELED"
         */
        public static final StatusEnum CANCELED = new StatusEnum("CANCELED");
        
        /**
         * Enum NEED_TO_BE_AUDIT for value: "NEED_TO_BE_AUDIT"
         */
        public static final StatusEnum NEED_TO_BE_AUDIT = new StatusEnum("NEED_TO_BE_AUDIT");
        

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("NO_TASK", NO_TASK);
            map.put("WAITING", WAITING);
            map.put("TRANSCODING", TRANSCODING);
            map.put("SUCCEEDED", SUCCEEDED);
            map.put("FAILED", FAILED);
            map.put("CANCELED", CANCELED);
            map.put("NEED_TO_BE_AUDIT", NEED_TO_BE_AUDIT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private StatusEnum status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    private String createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    private String endTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="trans_template_id")
    
    private List<Integer> transTemplateId = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="input")
    
    private ObsObjInfo input = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="output")
    
    private ObsObjInfo output = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="output_file_name")
    
    private List<String> outputFileName = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_code")
    
    private String errorCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tips")
    
    private String tips;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="output_url")
    
    private String outputUrl;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="transcode_detail")
    
    private TranscodeDetail transcodeDetail = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="thumbnail_output")
    
    private ObsObjInfo thumbnailOutput = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="thumbnail_outputname")
    
    private String thumbnailOutputname;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pic_info")
    
    private List<PicInfo> picInfo = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="audit_report")
    
    private AuditReport auditReport = null;

    public QueryTranscodingsTaskResponse withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    


    /**
     * 任务ID。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public QueryTranscodingsTaskResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 任务执行状态。 
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public QueryTranscodingsTaskResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 转码任务启动时间 
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public QueryTranscodingsTaskResponse withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * 转码任务结束时间 
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public QueryTranscodingsTaskResponse withTransTemplateId(List<Integer> transTemplateId) {
        this.transTemplateId = transTemplateId;
        return this;
    }

    
    public QueryTranscodingsTaskResponse addTransTemplateIdItem(Integer transTemplateIdItem) {
        if (this.transTemplateId == null) {
            this.transTemplateId = new ArrayList<>();
        }
        this.transTemplateId.add(transTemplateIdItem);
        return this;
    }

    public QueryTranscodingsTaskResponse withTransTemplateId(Consumer<List<Integer>> transTemplateIdSetter) {
        if(this.transTemplateId == null ){
            this.transTemplateId = new ArrayList<>();
        }
        transTemplateIdSetter.accept(this.transTemplateId);
        return this;
    }

    /**
     * 转码任务对应的转码模板ID 
     * @return transTemplateId
     */
    public List<Integer> getTransTemplateId() {
        return transTemplateId;
    }

    public void setTransTemplateId(List<Integer> transTemplateId) {
        this.transTemplateId = transTemplateId;
    }

    public QueryTranscodingsTaskResponse withInput(ObsObjInfo input) {
        this.input = input;
        return this;
    }

    public QueryTranscodingsTaskResponse withInput(Consumer<ObsObjInfo> inputSetter) {
        if(this.input == null ){
            this.input = new ObsObjInfo();
            inputSetter.accept(this.input);
        }
        
        return this;
    }


    /**
     * Get input
     * @return input
     */
    public ObsObjInfo getInput() {
        return input;
    }

    public void setInput(ObsObjInfo input) {
        this.input = input;
    }

    public QueryTranscodingsTaskResponse withOutput(ObsObjInfo output) {
        this.output = output;
        return this;
    }

    public QueryTranscodingsTaskResponse withOutput(Consumer<ObsObjInfo> outputSetter) {
        if(this.output == null ){
            this.output = new ObsObjInfo();
            outputSetter.accept(this.output);
        }
        
        return this;
    }


    /**
     * Get output
     * @return output
     */
    public ObsObjInfo getOutput() {
        return output;
    }

    public void setOutput(ObsObjInfo output) {
        this.output = output;
    }

    public QueryTranscodingsTaskResponse withOutputFileName(List<String> outputFileName) {
        this.outputFileName = outputFileName;
        return this;
    }

    
    public QueryTranscodingsTaskResponse addOutputFileNameItem(String outputFileNameItem) {
        if (this.outputFileName == null) {
            this.outputFileName = new ArrayList<>();
        }
        this.outputFileName.add(outputFileNameItem);
        return this;
    }

    public QueryTranscodingsTaskResponse withOutputFileName(Consumer<List<String>> outputFileNameSetter) {
        if(this.outputFileName == null ){
            this.outputFileName = new ArrayList<>();
        }
        outputFileNameSetter.accept(this.outputFileName);
        return this;
    }

    /**
     * 转码生成的文件名，数组类型，可能包含多个，包含截图文件名。 
     * @return outputFileName
     */
    public List<String> getOutputFileName() {
        return outputFileName;
    }

    public void setOutputFileName(List<String> outputFileName) {
        this.outputFileName = outputFileName;
    }

    public QueryTranscodingsTaskResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    


    /**
     * 转码任务的返回码。 
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public QueryTranscodingsTaskResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 转码任务描述，当转码出现异常时，此字段为异常的原因。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public QueryTranscodingsTaskResponse withTips(String tips) {
        this.tips = tips;
        return this;
    }

    


    /**
     * 转码成功，但音频采样率过低时的提示。 
     * @return tips
     */
    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }

    public QueryTranscodingsTaskResponse withOutputUrl(String outputUrl) {
        this.outputUrl = outputUrl;
        return this;
    }

    


    /**
     * 质检文件输出路径 
     * @return outputUrl
     */
    public String getOutputUrl() {
        return outputUrl;
    }

    public void setOutputUrl(String outputUrl) {
        this.outputUrl = outputUrl;
    }

    public QueryTranscodingsTaskResponse withTranscodeDetail(TranscodeDetail transcodeDetail) {
        this.transcodeDetail = transcodeDetail;
        return this;
    }

    public QueryTranscodingsTaskResponse withTranscodeDetail(Consumer<TranscodeDetail> transcodeDetailSetter) {
        if(this.transcodeDetail == null ){
            this.transcodeDetail = new TranscodeDetail();
            transcodeDetailSetter.accept(this.transcodeDetail);
        }
        
        return this;
    }


    /**
     * Get transcodeDetail
     * @return transcodeDetail
     */
    public TranscodeDetail getTranscodeDetail() {
        return transcodeDetail;
    }

    public void setTranscodeDetail(TranscodeDetail transcodeDetail) {
        this.transcodeDetail = transcodeDetail;
    }

    public QueryTranscodingsTaskResponse withThumbnailOutput(ObsObjInfo thumbnailOutput) {
        this.thumbnailOutput = thumbnailOutput;
        return this;
    }

    public QueryTranscodingsTaskResponse withThumbnailOutput(Consumer<ObsObjInfo> thumbnailOutputSetter) {
        if(this.thumbnailOutput == null ){
            this.thumbnailOutput = new ObsObjInfo();
            thumbnailOutputSetter.accept(this.thumbnailOutput);
        }
        
        return this;
    }


    /**
     * Get thumbnailOutput
     * @return thumbnailOutput
     */
    public ObsObjInfo getThumbnailOutput() {
        return thumbnailOutput;
    }

    public void setThumbnailOutput(ObsObjInfo thumbnailOutput) {
        this.thumbnailOutput = thumbnailOutput;
    }

    public QueryTranscodingsTaskResponse withThumbnailOutputname(String thumbnailOutputname) {
        this.thumbnailOutputname = thumbnailOutputname;
        return this;
    }

    


    /**
     * 截图压缩包名。 
     * @return thumbnailOutputname
     */
    public String getThumbnailOutputname() {
        return thumbnailOutputname;
    }

    public void setThumbnailOutputname(String thumbnailOutputname) {
        this.thumbnailOutputname = thumbnailOutputname;
    }

    public QueryTranscodingsTaskResponse withPicInfo(List<PicInfo> picInfo) {
        this.picInfo = picInfo;
        return this;
    }

    
    public QueryTranscodingsTaskResponse addPicInfoItem(PicInfo picInfoItem) {
        if (this.picInfo == null) {
            this.picInfo = new ArrayList<>();
        }
        this.picInfo.add(picInfoItem);
        return this;
    }

    public QueryTranscodingsTaskResponse withPicInfo(Consumer<List<PicInfo>> picInfoSetter) {
        if(this.picInfo == null ){
            this.picInfo = new ArrayList<>();
        }
        picInfoSetter.accept(this.picInfo);
        return this;
    }

    /**
     * 截图文件信息。 
     * @return picInfo
     */
    public List<PicInfo> getPicInfo() {
        return picInfo;
    }

    public void setPicInfo(List<PicInfo> picInfo) {
        this.picInfo = picInfo;
    }

    public QueryTranscodingsTaskResponse withAuditReport(AuditReport auditReport) {
        this.auditReport = auditReport;
        return this;
    }

    public QueryTranscodingsTaskResponse withAuditReport(Consumer<AuditReport> auditReportSetter) {
        if(this.auditReport == null ){
            this.auditReport = new AuditReport();
            auditReportSetter.accept(this.auditReport);
        }
        
        return this;
    }


    /**
     * Get auditReport
     * @return auditReport
     */
    public AuditReport getAuditReport() {
        return auditReport;
    }

    public void setAuditReport(AuditReport auditReport) {
        this.auditReport = auditReport;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryTranscodingsTaskResponse queryTranscodingsTaskResponse = (QueryTranscodingsTaskResponse) o;
        return Objects.equals(this.taskId, queryTranscodingsTaskResponse.taskId) &&
            Objects.equals(this.status, queryTranscodingsTaskResponse.status) &&
            Objects.equals(this.createTime, queryTranscodingsTaskResponse.createTime) &&
            Objects.equals(this.endTime, queryTranscodingsTaskResponse.endTime) &&
            Objects.equals(this.transTemplateId, queryTranscodingsTaskResponse.transTemplateId) &&
            Objects.equals(this.input, queryTranscodingsTaskResponse.input) &&
            Objects.equals(this.output, queryTranscodingsTaskResponse.output) &&
            Objects.equals(this.outputFileName, queryTranscodingsTaskResponse.outputFileName) &&
            Objects.equals(this.errorCode, queryTranscodingsTaskResponse.errorCode) &&
            Objects.equals(this.description, queryTranscodingsTaskResponse.description) &&
            Objects.equals(this.tips, queryTranscodingsTaskResponse.tips) &&
            Objects.equals(this.outputUrl, queryTranscodingsTaskResponse.outputUrl) &&
            Objects.equals(this.transcodeDetail, queryTranscodingsTaskResponse.transcodeDetail) &&
            Objects.equals(this.thumbnailOutput, queryTranscodingsTaskResponse.thumbnailOutput) &&
            Objects.equals(this.thumbnailOutputname, queryTranscodingsTaskResponse.thumbnailOutputname) &&
            Objects.equals(this.picInfo, queryTranscodingsTaskResponse.picInfo) &&
            Objects.equals(this.auditReport, queryTranscodingsTaskResponse.auditReport);
    }
    @Override
    public int hashCode() {
        return Objects.hash(taskId, status, createTime, endTime, transTemplateId, input, output, outputFileName, errorCode, description, tips, outputUrl, transcodeDetail, thumbnailOutput, thumbnailOutputname, picInfo, auditReport);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryTranscodingsTaskResponse {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    transTemplateId: ").append(toIndentedString(transTemplateId)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    outputFileName: ").append(toIndentedString(outputFileName)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    tips: ").append(toIndentedString(tips)).append("\n");
        sb.append("    outputUrl: ").append(toIndentedString(outputUrl)).append("\n");
        sb.append("    transcodeDetail: ").append(toIndentedString(transcodeDetail)).append("\n");
        sb.append("    thumbnailOutput: ").append(toIndentedString(thumbnailOutput)).append("\n");
        sb.append("    thumbnailOutputname: ").append(toIndentedString(thumbnailOutputname)).append("\n");
        sb.append("    picInfo: ").append(toIndentedString(picInfo)).append("\n");
        sb.append("    auditReport: ").append(toIndentedString(auditReport)).append("\n");
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

