package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class Show3dStructureContentRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eihealth_project_id")

    private String eihealthProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "study_id")

    private String studyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ligand")

    private String ligand;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "receptor")

    private String receptor;

    public Show3dStructureContentRequest withEihealthProjectId(String eihealthProjectId) {
        this.eihealthProjectId = eihealthProjectId;
        return this;
    }

    /**
     * 平台项目ID，您可以在平台单击所需的项目名称，进入项目设置页面查看。
     * @return eihealthProjectId
     */
    public String getEihealthProjectId() {
        return eihealthProjectId;
    }

    public void setEihealthProjectId(String eihealthProjectId) {
        this.eihealthProjectId = eihealthProjectId;
    }

    public Show3dStructureContentRequest withStudyId(String studyId) {
        this.studyId = studyId;
        return this;
    }

    /**
     * study_id
     * @return studyId
     */
    public String getStudyId() {
        return studyId;
    }

    public void setStudyId(String studyId) {
        this.studyId = studyId;
    }

    public Show3dStructureContentRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * study作业id
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public Show3dStructureContentRequest withLigand(String ligand) {
        this.ligand = ligand;
        return this;
    }

    /**
     * 配体名称
     * @return ligand
     */
    public String getLigand() {
        return ligand;
    }

    public void setLigand(String ligand) {
        this.ligand = ligand;
    }

    public Show3dStructureContentRequest withReceptor(String receptor) {
        this.receptor = receptor;
        return this;
    }

    /**
     * 受体名称
     * @return receptor
     */
    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Show3dStructureContentRequest that = (Show3dStructureContentRequest) obj;
        return Objects.equals(this.eihealthProjectId, that.eihealthProjectId)
            && Objects.equals(this.studyId, that.studyId) && Objects.equals(this.jobId, that.jobId)
            && Objects.equals(this.ligand, that.ligand) && Objects.equals(this.receptor, that.receptor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eihealthProjectId, studyId, jobId, ligand, receptor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Show3dStructureContentRequest {\n");
        sb.append("    eihealthProjectId: ").append(toIndentedString(eihealthProjectId)).append("\n");
        sb.append("    studyId: ").append(toIndentedString(studyId)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    ligand: ").append(toIndentedString(ligand)).append("\n");
        sb.append("    receptor: ").append(toIndentedString(receptor)).append("\n");
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
