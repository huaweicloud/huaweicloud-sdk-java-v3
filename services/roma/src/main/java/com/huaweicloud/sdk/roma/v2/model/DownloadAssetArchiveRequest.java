package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class DownloadAssetArchiveRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "archive_id")

    private String archiveId;

    public DownloadAssetArchiveRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /** 实例ID
     * 
     * @return instanceId */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public DownloadAssetArchiveRequest withArchiveId(String archiveId) {
        this.archiveId = archiveId;
        return this;
    }

    /** 作业执行成功后，查询作业进度返回的entities.archive_id字段
     * 
     * @return archiveId */
    public String getArchiveId() {
        return archiveId;
    }

    public void setArchiveId(String archiveId) {
        this.archiveId = archiveId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DownloadAssetArchiveRequest downloadAssetArchiveRequest = (DownloadAssetArchiveRequest) o;
        return Objects.equals(this.instanceId, downloadAssetArchiveRequest.instanceId)
            && Objects.equals(this.archiveId, downloadAssetArchiveRequest.archiveId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, archiveId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DownloadAssetArchiveRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    archiveId: ").append(toIndentedString(archiveId)).append("\n");
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
