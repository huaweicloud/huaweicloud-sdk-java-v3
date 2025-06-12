package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 任务状态返回体
 */
public class JobStatusBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abort_status")

    private String abortStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    private String label;

    public JobStatusBody withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 任务状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public JobStatusBody withAbortStatus(String abortStatus) {
        this.abortStatus = abortStatus;
        return this;
    }

    /**
     * 任务终止状态
     * @return abortStatus
     */
    public String getAbortStatus() {
        return abortStatus;
    }

    public void setAbortStatus(String abortStatus) {
        this.abortStatus = abortStatus;
    }

    public JobStatusBody withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * 标签
     * @return label
     */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobStatusBody that = (JobStatusBody) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.abortStatus, that.abortStatus)
            && Objects.equals(this.label, that.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, abortStatus, label);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobStatusBody {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    abortStatus: ").append(toIndentedString(abortStatus)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
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
