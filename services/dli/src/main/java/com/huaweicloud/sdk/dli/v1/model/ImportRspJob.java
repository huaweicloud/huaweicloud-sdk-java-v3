package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 导入job作业结果的模型。
 */
public class ImportRspJob {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "old_job_id")

    private Long oldJobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_job_id")

    private Long newJobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    private String remark;

    public ImportRspJob withOldJobId(Long oldJobId) {
        this.oldJobId = oldJobId;
        return this;
    }

    /**
     * 导入文件中的作业ID。
     * @return oldJobId
     */
    public Long getOldJobId() {
        return oldJobId;
    }

    public void setOldJobId(Long oldJobId) {
        this.oldJobId = oldJobId;
    }

    public ImportRspJob withNewJobId(Long newJobId) {
        this.newJobId = newJobId;
        return this;
    }

    /**
     * 导入完成后作业ID，若is_cover=false，服务中已有同名的作业，则为-1。
     * @return newJobId
     */
    public Long getNewJobId() {
        return newJobId;
    }

    public void setNewJobId(Long newJobId) {
        this.newJobId = newJobId;
    }

    public ImportRspJob withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /**
     * 导入作业结果信息。
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImportRspJob importRspJob = (ImportRspJob) o;
        return Objects.equals(this.oldJobId, importRspJob.oldJobId)
            && Objects.equals(this.newJobId, importRspJob.newJobId) && Objects.equals(this.remark, importRspJob.remark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oldJobId, newJobId, remark);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportRspJob {\n");
        sb.append("    oldJobId: ").append(toIndentedString(oldJobId)).append("\n");
        sb.append("    newJobId: ").append(toIndentedString(newJobId)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
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
