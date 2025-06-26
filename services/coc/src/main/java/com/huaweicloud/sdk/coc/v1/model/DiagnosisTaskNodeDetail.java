package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 诊断步骤结果对象
 */
public class DiagnosisTaskNodeDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_zh")

    private String nameZh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diagnosis_task_id")

    private String diagnosisTaskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diagnosis_record_id")

    private String diagnosisRecordId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    public DiagnosisTaskNodeDetail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DiagnosisTaskNodeDetail withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * code
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public DiagnosisTaskNodeDetail withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 诊断步骤名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DiagnosisTaskNodeDetail withNameZh(String nameZh) {
        this.nameZh = nameZh;
        return this;
    }

    /**
     * 诊断步骤名称(中文)
     * @return nameZh
     */
    public String getNameZh() {
        return nameZh;
    }

    public void setNameZh(String nameZh) {
        this.nameZh = nameZh;
    }

    public DiagnosisTaskNodeDetail withDiagnosisTaskId(String diagnosisTaskId) {
        this.diagnosisTaskId = diagnosisTaskId;
        return this;
    }

    /**
     * 诊断任务ID
     * @return diagnosisTaskId
     */
    public String getDiagnosisTaskId() {
        return diagnosisTaskId;
    }

    public void setDiagnosisTaskId(String diagnosisTaskId) {
        this.diagnosisTaskId = diagnosisTaskId;
    }

    public DiagnosisTaskNodeDetail withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 任务状态，waiting,executing,failed,finish,cancel
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DiagnosisTaskNodeDetail withDiagnosisRecordId(String diagnosisRecordId) {
        this.diagnosisRecordId = diagnosisRecordId;
        return this;
    }

    /**
     * 诊断步骤主键ID
     * @return diagnosisRecordId
     */
    public String getDiagnosisRecordId() {
        return diagnosisRecordId;
    }

    public void setDiagnosisRecordId(String diagnosisRecordId) {
        this.diagnosisRecordId = diagnosisRecordId;
    }

    public DiagnosisTaskNodeDetail withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 诊断步骤开始时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public DiagnosisTaskNodeDetail withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 诊断步骤结束时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public DiagnosisTaskNodeDetail withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 诊断步骤执行结果
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DiagnosisTaskNodeDetail that = (DiagnosisTaskNodeDetail) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.code, that.code)
            && Objects.equals(this.name, that.name) && Objects.equals(this.nameZh, that.nameZh)
            && Objects.equals(this.diagnosisTaskId, that.diagnosisTaskId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.diagnosisRecordId, that.diagnosisRecordId)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, code, name, nameZh, diagnosisTaskId, status, diagnosisRecordId, startTime, endTime, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiagnosisTaskNodeDetail {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nameZh: ").append(toIndentedString(nameZh)).append("\n");
        sb.append("    diagnosisTaskId: ").append(toIndentedString(diagnosisTaskId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    diagnosisRecordId: ").append(toIndentedString(diagnosisRecordId)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
