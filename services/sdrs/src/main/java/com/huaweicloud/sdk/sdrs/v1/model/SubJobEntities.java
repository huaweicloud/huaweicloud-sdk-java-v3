package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 
 */
public class SubJobEntities {

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

    public SubJobEntities withReplicationPairId(String replicationPairId) {
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

    public SubJobEntities withVolumeIds(String volumeIds) {
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

    public SubJobEntities withServerGroupId(String serverGroupId) {
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

    public SubJobEntities withProtectedInstanceId(String protectedInstanceId) {
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

    public SubJobEntities withNativeServerId(String nativeServerId) {
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

    public SubJobEntities withNicId(String nicId) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubJobEntities subJobEntities = (SubJobEntities) o;
        return Objects.equals(this.replicationPairId, subJobEntities.replicationPairId)
            && Objects.equals(this.volumeIds, subJobEntities.volumeIds)
            && Objects.equals(this.serverGroupId, subJobEntities.serverGroupId)
            && Objects.equals(this.protectedInstanceId, subJobEntities.protectedInstanceId)
            && Objects.equals(this.nativeServerId, subJobEntities.nativeServerId)
            && Objects.equals(this.nicId, subJobEntities.nicId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(replicationPairId, volumeIds, serverGroupId, protectedInstanceId, nativeServerId, nicId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubJobEntities {\n");
        sb.append("    replicationPairId: ").append(toIndentedString(replicationPairId)).append("\n");
        sb.append("    volumeIds: ").append(toIndentedString(volumeIds)).append("\n");
        sb.append("    serverGroupId: ").append(toIndentedString(serverGroupId)).append("\n");
        sb.append("    protectedInstanceId: ").append(toIndentedString(protectedInstanceId)).append("\n");
        sb.append("    nativeServerId: ").append(toIndentedString(nativeServerId)).append("\n");
        sb.append("    nicId: ").append(toIndentedString(nicId)).append("\n");
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
