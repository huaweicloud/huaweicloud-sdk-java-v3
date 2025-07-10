package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class UpdateWorkspaceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_id")

    private String enterpriseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dc_vnc_ip")

    private String dcVncIp;

    public UpdateWorkspaceResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 修改云办公服务属性的任务ID。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public UpdateWorkspaceResponse withEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }

    /**
     * 企业ID。
     * @return enterpriseId
     */
    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public UpdateWorkspaceResponse withDcVncIp(String dcVncIp) {
        this.dcVncIp = dcVncIp;
        return this;
    }

    /**
     * 专线vnc访问的ip。
     * @return dcVncIp
     */
    public String getDcVncIp() {
        return dcVncIp;
    }

    public void setDcVncIp(String dcVncIp) {
        this.dcVncIp = dcVncIp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateWorkspaceResponse that = (UpdateWorkspaceResponse) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.enterpriseId, that.enterpriseId)
            && Objects.equals(this.dcVncIp, that.dcVncIp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, enterpriseId, dcVncIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateWorkspaceResponse {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
        sb.append("    dcVncIp: ").append(toIndentedString(dcVncIp)).append("\n");
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
