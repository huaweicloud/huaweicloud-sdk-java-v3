package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 删除复制对请求数据结构 */
public class DeleteReplicationRequestParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_group_id")

    private String serverGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_target_volume")

    private Boolean deleteTargetVolume;

    public DeleteReplicationRequestParams withServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }

    /** 保护组的ID。
     * 
     * @return serverGroupId */
    public String getServerGroupId() {
        return serverGroupId;
    }

    public void setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
    }

    public DeleteReplicationRequestParams withDeleteTargetVolume(Boolean deleteTargetVolume) {
        this.deleteTargetVolume = deleteTargetVolume;
        return this;
    }

    /** 是否删除容灾站点磁盘，默认值为false。
     * 
     * @return deleteTargetVolume */
    public Boolean getDeleteTargetVolume() {
        return deleteTargetVolume;
    }

    public void setDeleteTargetVolume(Boolean deleteTargetVolume) {
        this.deleteTargetVolume = deleteTargetVolume;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteReplicationRequestParams deleteReplicationRequestParams = (DeleteReplicationRequestParams) o;
        return Objects.equals(this.serverGroupId, deleteReplicationRequestParams.serverGroupId)
            && Objects.equals(this.deleteTargetVolume, deleteReplicationRequestParams.deleteTargetVolume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverGroupId, deleteTargetVolume);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteReplicationRequestParams {\n");
        sb.append("    serverGroupId: ").append(toIndentedString(serverGroupId)).append("\n");
        sb.append("    deleteTargetVolume: ").append(toIndentedString(deleteTargetVolume)).append("\n");
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
