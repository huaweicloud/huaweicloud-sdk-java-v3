package com.huaweicloud.sdk.dgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * JobApprover
 */
public class JobApprover {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approverName")

    private String approverName;

    public JobApprover withApproverName(String approverName) {
        this.approverName = approverName;
        return this;
    }

    /**
     * 审批人名称
     * @return approverName
     */
    public String getApproverName() {
        return approverName;
    }

    public void setApproverName(String approverName) {
        this.approverName = approverName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobApprover that = (JobApprover) obj;
        return Objects.equals(this.approverName, that.approverName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(approverName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobApprover {\n");
        sb.append("    approverName: ").append(toIndentedString(approverName)).append("\n");
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
