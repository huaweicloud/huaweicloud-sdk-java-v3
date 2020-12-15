package com.huaweicloud.sdk.mpc.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.AuditReport;
import com.huaweicloud.sdk.mpc.v1.model.ErrorResponse;
import com.huaweicloud.sdk.mpc.v1.model.MediaDetail;
import com.huaweicloud.sdk.mpc.v1.model.ObsObjInfo;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * TaskDetailInfo
 */
public class TaskDetailInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_id")
    
    private String taskId;
    /**
     * 任务执行状态，取值如下。 
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
    @JsonProperty(value="start_time")
    
    private String startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    private String endTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="input")
    
    private ObsObjInfo input = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="output")
    
    private ObsObjInfo output = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_data")
    
    private String userData;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="audit_report")
    
    private AuditReport auditReport = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_code")
    
    private String errorCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="media_detail")
    
    private MediaDetail mediaDetail = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="xcode_error")
    
    private ErrorResponse xcodeError = null;

    public TaskDetailInfo withTaskId(String taskId) {
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

    public TaskDetailInfo withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 任务执行状态，取值如下。 
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public TaskDetailInfo withCreateTime(String createTime) {
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

    public TaskDetailInfo withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 下发xcode任务成功时间 
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public TaskDetailInfo withEndTime(String endTime) {
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

    public TaskDetailInfo withInput(ObsObjInfo input) {
        this.input = input;
        return this;
    }

    public TaskDetailInfo withInput(Consumer<ObsObjInfo> inputSetter) {
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

    public TaskDetailInfo withOutput(ObsObjInfo output) {
        this.output = output;
        return this;
    }

    public TaskDetailInfo withOutput(Consumer<ObsObjInfo> outputSetter) {
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

    public TaskDetailInfo withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    


    /**
     * 用户数据。 
     * @return userData
     */
    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    public TaskDetailInfo withAuditReport(AuditReport auditReport) {
        this.auditReport = auditReport;
        return this;
    }

    public TaskDetailInfo withAuditReport(Consumer<AuditReport> auditReportSetter) {
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

    public TaskDetailInfo withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    


    /**
     * 转码任务错误码。 
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public TaskDetailInfo withDescription(String description) {
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

    public TaskDetailInfo withMediaDetail(MediaDetail mediaDetail) {
        this.mediaDetail = mediaDetail;
        return this;
    }

    public TaskDetailInfo withMediaDetail(Consumer<MediaDetail> mediaDetailSetter) {
        if(this.mediaDetail == null ){
            this.mediaDetail = new MediaDetail();
            mediaDetailSetter.accept(this.mediaDetail);
        }
        
        return this;
    }


    /**
     * Get mediaDetail
     * @return mediaDetail
     */
    public MediaDetail getMediaDetail() {
        return mediaDetail;
    }

    public void setMediaDetail(MediaDetail mediaDetail) {
        this.mediaDetail = mediaDetail;
    }

    public TaskDetailInfo withXcodeError(ErrorResponse xcodeError) {
        this.xcodeError = xcodeError;
        return this;
    }

    public TaskDetailInfo withXcodeError(Consumer<ErrorResponse> xcodeErrorSetter) {
        if(this.xcodeError == null ){
            this.xcodeError = new ErrorResponse();
            xcodeErrorSetter.accept(this.xcodeError);
        }
        
        return this;
    }


    /**
     * Get xcodeError
     * @return xcodeError
     */
    public ErrorResponse getXcodeError() {
        return xcodeError;
    }

    public void setXcodeError(ErrorResponse xcodeError) {
        this.xcodeError = xcodeError;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskDetailInfo taskDetailInfo = (TaskDetailInfo) o;
        return Objects.equals(this.taskId, taskDetailInfo.taskId) &&
            Objects.equals(this.status, taskDetailInfo.status) &&
            Objects.equals(this.createTime, taskDetailInfo.createTime) &&
            Objects.equals(this.startTime, taskDetailInfo.startTime) &&
            Objects.equals(this.endTime, taskDetailInfo.endTime) &&
            Objects.equals(this.input, taskDetailInfo.input) &&
            Objects.equals(this.output, taskDetailInfo.output) &&
            Objects.equals(this.userData, taskDetailInfo.userData) &&
            Objects.equals(this.auditReport, taskDetailInfo.auditReport) &&
            Objects.equals(this.errorCode, taskDetailInfo.errorCode) &&
            Objects.equals(this.description, taskDetailInfo.description) &&
            Objects.equals(this.mediaDetail, taskDetailInfo.mediaDetail) &&
            Objects.equals(this.xcodeError, taskDetailInfo.xcodeError);
    }
    @Override
    public int hashCode() {
        return Objects.hash(taskId, status, createTime, startTime, endTime, input, output, userData, auditReport, errorCode, description, mediaDetail, xcodeError);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskDetailInfo {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
        sb.append("    auditReport: ").append(toIndentedString(auditReport)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    mediaDetail: ").append(toIndentedString(mediaDetail)).append("\n");
        sb.append("    xcodeError: ").append(toIndentedString(xcodeError)).append("\n");
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

