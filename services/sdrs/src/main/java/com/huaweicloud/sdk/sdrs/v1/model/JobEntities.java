package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class JobEntities {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replication_pair_id")

    @JacksonXmlProperty(localName = "replication_pair_id")

    private String replicationPairId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_ids")

    @JacksonXmlProperty(localName = "volume_ids")

    private String volumeIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_group_id")

    @JacksonXmlProperty(localName = "server_group_id")

    private String serverGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protected_instance_id")

    @JacksonXmlProperty(localName = "protected_instance_id")

    private String protectedInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "native_server_id")

    @JacksonXmlProperty(localName = "native_server_id")

    private String nativeServerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nic_id")

    @JacksonXmlProperty(localName = "nic_id")

    private String nicId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_jobs")

    @JacksonXmlProperty(localName = "sub_jobs")

    private List<SubJobParams> subJobs = null;

    public JobEntities withReplicationPairId(String replicationPairId) {
        this.replicationPairId = replicationPairId;
        return this;
    }

    /**
     * 复制对ID
     * @return replicationPairId
     */
    public String getReplicationPairId() {
        return replicationPairId;
    }

    public void setReplicationPairId(String replicationPairId) {
        this.replicationPairId = replicationPairId;
    }

    public JobEntities withVolumeIds(String volumeIds) {
        this.volumeIds = volumeIds;
        return this;
    }

    /**
     * 组成复制对的云硬盘ID
     * @return volumeIds
     */
    public String getVolumeIds() {
        return volumeIds;
    }

    public void setVolumeIds(String volumeIds) {
        this.volumeIds = volumeIds;
    }

    public JobEntities withServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }

    /**
     * 保护组ID
     * @return serverGroupId
     */
    public String getServerGroupId() {
        return serverGroupId;
    }

    public void setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
    }

    public JobEntities withProtectedInstanceId(String protectedInstanceId) {
        this.protectedInstanceId = protectedInstanceId;
        return this;
    }

    /**
     * 保护实例ID
     * @return protectedInstanceId
     */
    public String getProtectedInstanceId() {
        return protectedInstanceId;
    }

    public void setProtectedInstanceId(String protectedInstanceId) {
        this.protectedInstanceId = protectedInstanceId;
    }

    public JobEntities withNativeServerId(String nativeServerId) {
        this.nativeServerId = nativeServerId;
        return this;
    }

    /**
     * 容灾站点服务器ID
     * @return nativeServerId
     */
    public String getNativeServerId() {
        return nativeServerId;
    }

    public void setNativeServerId(String nativeServerId) {
        this.nativeServerId = nativeServerId;
    }

    public JobEntities withNicId(String nicId) {
        this.nicId = nicId;
        return this;
    }

    /**
     * 网卡ID
     * @return nicId
     */
    public String getNicId() {
        return nicId;
    }

    public void setNicId(String nicId) {
        this.nicId = nicId;
    }

    public JobEntities withSubJobs(List<SubJobParams> subJobs) {
        this.subJobs = subJobs;
        return this;
    }

    public JobEntities addSubJobsItem(SubJobParams subJobsItem) {
        if (this.subJobs == null) {
            this.subJobs = new ArrayList<>();
        }
        this.subJobs.add(subJobsItem);
        return this;
    }

    public JobEntities withSubJobs(Consumer<List<SubJobParams>> subJobsSetter) {
        if (this.subJobs == null) {
            this.subJobs = new ArrayList<>();
        }
        subJobsSetter.accept(this.subJobs);
        return this;
    }

    /**
     * 子Job信息
     * @return subJobs
     */
    public List<SubJobParams> getSubJobs() {
        return subJobs;
    }

    public void setSubJobs(List<SubJobParams> subJobs) {
        this.subJobs = subJobs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobEntities jobEntities = (JobEntities) o;
        return Objects.equals(this.replicationPairId, jobEntities.replicationPairId)
            && Objects.equals(this.volumeIds, jobEntities.volumeIds)
            && Objects.equals(this.serverGroupId, jobEntities.serverGroupId)
            && Objects.equals(this.protectedInstanceId, jobEntities.protectedInstanceId)
            && Objects.equals(this.nativeServerId, jobEntities.nativeServerId)
            && Objects.equals(this.nicId, jobEntities.nicId) && Objects.equals(this.subJobs, jobEntities.subJobs);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(replicationPairId, volumeIds, serverGroupId, protectedInstanceId, nativeServerId, nicId, subJobs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobEntities {\n");
        sb.append("    replicationPairId: ").append(toIndentedString(replicationPairId)).append("\n");
        sb.append("    volumeIds: ").append(toIndentedString(volumeIds)).append("\n");
        sb.append("    serverGroupId: ").append(toIndentedString(serverGroupId)).append("\n");
        sb.append("    protectedInstanceId: ").append(toIndentedString(protectedInstanceId)).append("\n");
        sb.append("    nativeServerId: ").append(toIndentedString(nativeServerId)).append("\n");
        sb.append("    nicId: ").append(toIndentedString(nicId)).append("\n");
        sb.append("    subJobs: ").append(toIndentedString(subJobs)).append("\n");
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
