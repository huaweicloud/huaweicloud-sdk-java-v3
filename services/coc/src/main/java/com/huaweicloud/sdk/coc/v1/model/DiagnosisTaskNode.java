package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 单诊断步骤结果对象
 */
public class DiagnosisTaskNode {

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

    public DiagnosisTaskNode withId(String id) {
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

    public DiagnosisTaskNode withCode(String code) {
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

    public DiagnosisTaskNode withName(String name) {
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

    public DiagnosisTaskNode withNameZh(String nameZh) {
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

    public DiagnosisTaskNode withDiagnosisTaskId(String diagnosisTaskId) {
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

    public DiagnosisTaskNode withStatus(String status) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DiagnosisTaskNode that = (DiagnosisTaskNode) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.code, that.code)
            && Objects.equals(this.name, that.name) && Objects.equals(this.nameZh, that.nameZh)
            && Objects.equals(this.diagnosisTaskId, that.diagnosisTaskId) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, name, nameZh, diagnosisTaskId, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiagnosisTaskNode {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nameZh: ").append(toIndentedString(nameZh)).append("\n");
        sb.append("    diagnosisTaskId: ").append(toIndentedString(diagnosisTaskId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
