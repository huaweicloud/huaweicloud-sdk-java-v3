package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 
 */
public class RetryInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    @JacksonXmlProperty(localName = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_sync_re_edit")

    @JacksonXmlProperty(localName = "is_sync_re_edit")

    private Boolean isSyncReEdit;

    public RetryInfo withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务ID
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public RetryInfo withIsSyncReEdit(Boolean isSyncReEdit) {
        this.isSyncReEdit = isSyncReEdit;
        return this;
    }

    /**
     * 再编辑之后启动，必填为true。
     * @return isSyncReEdit
     */
    public Boolean getIsSyncReEdit() {
        return isSyncReEdit;
    }

    public void setIsSyncReEdit(Boolean isSyncReEdit) {
        this.isSyncReEdit = isSyncReEdit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RetryInfo retryInfo = (RetryInfo) o;
        return Objects.equals(this.jobId, retryInfo.jobId) && Objects.equals(this.isSyncReEdit, retryInfo.isSyncReEdit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, isSyncReEdit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RetryInfo {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    isSyncReEdit: ").append(toIndentedString(isSyncReEdit)).append("\n");
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
