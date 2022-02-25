package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 批量创建后端服务器响应结果 */
public class BatchDeleteMemberState {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ret_status")

    private String retStatus;

    public BatchDeleteMemberState withId(String id) {
        this.id = id;
        return this;
    }

    /** 后端服务器ID。
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BatchDeleteMemberState withRetStatus(String retStatus) {
        this.retStatus = retStatus;
        return this;
    }

    /** 当前后端服务器删除结果状态。取值： - successful：删除成功。 - not found：member不存在。
     * 
     * @return retStatus */
    public String getRetStatus() {
        return retStatus;
    }

    public void setRetStatus(String retStatus) {
        this.retStatus = retStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchDeleteMemberState batchDeleteMemberState = (BatchDeleteMemberState) o;
        return Objects.equals(this.id, batchDeleteMemberState.id)
            && Objects.equals(this.retStatus, batchDeleteMemberState.retStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, retStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteMemberState {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    retStatus: ").append(toIndentedString(retStatus)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
