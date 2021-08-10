package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 需要删除镜像自动同步任务的信息 */
public class DeleteImageSyncRepoRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remoteRegionId")

    private String remoteRegionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remoteNamespace")

    private String remoteNamespace;

    public DeleteImageSyncRepoRequestBody withRemoteRegionId(String remoteRegionId) {
        this.remoteRegionId = remoteRegionId;
        return this;
    }

    /** 目标region ID。
     * 
     * @return remoteRegionId */
    public String getRemoteRegionId() {
        return remoteRegionId;
    }

    public void setRemoteRegionId(String remoteRegionId) {
        this.remoteRegionId = remoteRegionId;
    }

    public DeleteImageSyncRepoRequestBody withRemoteNamespace(String remoteNamespace) {
        this.remoteNamespace = remoteNamespace;
        return this;
    }

    /** 目标组织
     * 
     * @return remoteNamespace */
    public String getRemoteNamespace() {
        return remoteNamespace;
    }

    public void setRemoteNamespace(String remoteNamespace) {
        this.remoteNamespace = remoteNamespace;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteImageSyncRepoRequestBody deleteImageSyncRepoRequestBody = (DeleteImageSyncRepoRequestBody) o;
        return Objects.equals(this.remoteRegionId, deleteImageSyncRepoRequestBody.remoteRegionId)
            && Objects.equals(this.remoteNamespace, deleteImageSyncRepoRequestBody.remoteNamespace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(remoteRegionId, remoteNamespace);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteImageSyncRepoRequestBody {\n");
        sb.append("    remoteRegionId: ").append(toIndentedString(remoteRegionId)).append("\n");
        sb.append("    remoteNamespace: ").append(toIndentedString(remoteNamespace)).append("\n");
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
