package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class StartAutoJobRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eihealth_project_id")

    private String eihealthProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_job_id")

    private String autoJobId;

    public StartAutoJobRequest withEihealthProjectId(String eihealthProjectId) {
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

    public StartAutoJobRequest withAutoJobId(String autoJobId) {
        this.autoJobId = autoJobId;
        return this;
    }

    /**
     * 自动作业id
     * @return autoJobId
     */
    public String getAutoJobId() {
        return autoJobId;
    }

    public void setAutoJobId(String autoJobId) {
        this.autoJobId = autoJobId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StartAutoJobRequest startAutoJobRequest = (StartAutoJobRequest) o;
        return Objects.equals(this.eihealthProjectId, startAutoJobRequest.eihealthProjectId)
            && Objects.equals(this.autoJobId, startAutoJobRequest.autoJobId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eihealthProjectId, autoJobId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartAutoJobRequest {\n");
        sb.append("    eihealthProjectId: ").append(toIndentedString(eihealthProjectId)).append("\n");
        sb.append("    autoJobId: ").append(toIndentedString(autoJobId)).append("\n");
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
