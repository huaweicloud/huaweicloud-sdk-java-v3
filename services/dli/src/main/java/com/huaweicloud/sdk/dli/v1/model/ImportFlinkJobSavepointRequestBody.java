package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 导入savepoint接口的请求体
 */
public class ImportFlinkJobSavepointRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private Long jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "savepoint_path")

    private String savepointPath;

    public ImportFlinkJobSavepointRequestBody withJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * Flink作业的id
     * @return jobId
     */
    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public ImportFlinkJobSavepointRequestBody withSavepointPath(String savepointPath) {
        this.savepointPath = savepointPath;
        return this;
    }

    /**
     * Savepoint路径。需指定到_metaData文件的上级目录 例：\"obs://bucket_name/file_name/\"
     * @return savepointPath
     */
    public String getSavepointPath() {
        return savepointPath;
    }

    public void setSavepointPath(String savepointPath) {
        this.savepointPath = savepointPath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImportFlinkJobSavepointRequestBody that = (ImportFlinkJobSavepointRequestBody) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.savepointPath, that.savepointPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, savepointPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportFlinkJobSavepointRequestBody {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    savepointPath: ").append(toIndentedString(savepointPath)).append("\n");
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
