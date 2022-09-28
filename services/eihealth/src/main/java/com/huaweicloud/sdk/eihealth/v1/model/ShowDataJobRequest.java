package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowDataJobRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_job_id")

    private String dataJobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eihealth_project_id")

    private String eihealthProjectId;

    public ShowDataJobRequest withDataJobId(String dataJobId) {
        this.dataJobId = dataJobId;
        return this;
    }

    /**
     * 数据作业id
     * @return dataJobId
     */
    public String getDataJobId() {
        return dataJobId;
    }

    public void setDataJobId(String dataJobId) {
        this.dataJobId = dataJobId;
    }

    public ShowDataJobRequest withEihealthProjectId(String eihealthProjectId) {
        this.eihealthProjectId = eihealthProjectId;
        return this;
    }

    /**
     * 医疗智能体平台项目ID，您可以在EIHealth平台单击所需的项目名称，进入项目设置页面查看。
     * @return eihealthProjectId
     */
    public String getEihealthProjectId() {
        return eihealthProjectId;
    }

    public void setEihealthProjectId(String eihealthProjectId) {
        this.eihealthProjectId = eihealthProjectId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDataJobRequest showDataJobRequest = (ShowDataJobRequest) o;
        return Objects.equals(this.dataJobId, showDataJobRequest.dataJobId)
            && Objects.equals(this.eihealthProjectId, showDataJobRequest.eihealthProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataJobId, eihealthProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDataJobRequest {\n");
        sb.append("    dataJobId: ").append(toIndentedString(dataJobId)).append("\n");
        sb.append("    eihealthProjectId: ").append(toIndentedString(eihealthProjectId)).append("\n");
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
