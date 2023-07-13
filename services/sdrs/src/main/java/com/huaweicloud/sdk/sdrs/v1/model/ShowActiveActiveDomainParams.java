package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询双活域响应体结构
 */
public class ShowActiveActiveDomainParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sold_out")

    private Boolean soldOut;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_replication_cluster")

    private ReplicationClusterParams localReplicationCluster;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_replication_cluster")

    private ReplicationClusterParams remoteReplicationCluster;

    public ShowActiveActiveDomainParams withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 双活域ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowActiveActiveDomainParams withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 双活域名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowActiveActiveDomainParams withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 双活域描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowActiveActiveDomainParams withSoldOut(Boolean soldOut) {
        this.soldOut = soldOut;
        return this;
    }

    /**
     * 表示该双活域下的资源是否售罄。
     * @return soldOut
     */
    public Boolean getSoldOut() {
        return soldOut;
    }

    public void setSoldOut(Boolean soldOut) {
        this.soldOut = soldOut;
    }

    public ShowActiveActiveDomainParams withLocalReplicationCluster(ReplicationClusterParams localReplicationCluster) {
        this.localReplicationCluster = localReplicationCluster;
        return this;
    }

    public ShowActiveActiveDomainParams withLocalReplicationCluster(
        Consumer<ReplicationClusterParams> localReplicationClusterSetter) {
        if (this.localReplicationCluster == null) {
            this.localReplicationCluster = new ReplicationClusterParams();
            localReplicationClusterSetter.accept(this.localReplicationCluster);
        }

        return this;
    }

    /**
     * Get localReplicationCluster
     * @return localReplicationCluster
     */
    public ReplicationClusterParams getLocalReplicationCluster() {
        return localReplicationCluster;
    }

    public void setLocalReplicationCluster(ReplicationClusterParams localReplicationCluster) {
        this.localReplicationCluster = localReplicationCluster;
    }

    public ShowActiveActiveDomainParams withRemoteReplicationCluster(
        ReplicationClusterParams remoteReplicationCluster) {
        this.remoteReplicationCluster = remoteReplicationCluster;
        return this;
    }

    public ShowActiveActiveDomainParams withRemoteReplicationCluster(
        Consumer<ReplicationClusterParams> remoteReplicationClusterSetter) {
        if (this.remoteReplicationCluster == null) {
            this.remoteReplicationCluster = new ReplicationClusterParams();
            remoteReplicationClusterSetter.accept(this.remoteReplicationCluster);
        }

        return this;
    }

    /**
     * Get remoteReplicationCluster
     * @return remoteReplicationCluster
     */
    public ReplicationClusterParams getRemoteReplicationCluster() {
        return remoteReplicationCluster;
    }

    public void setRemoteReplicationCluster(ReplicationClusterParams remoteReplicationCluster) {
        this.remoteReplicationCluster = remoteReplicationCluster;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowActiveActiveDomainParams that = (ShowActiveActiveDomainParams) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.soldOut, that.soldOut)
            && Objects.equals(this.localReplicationCluster, that.localReplicationCluster)
            && Objects.equals(this.remoteReplicationCluster, that.remoteReplicationCluster);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, soldOut, localReplicationCluster, remoteReplicationCluster);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowActiveActiveDomainParams {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    soldOut: ").append(toIndentedString(soldOut)).append("\n");
        sb.append("    localReplicationCluster: ").append(toIndentedString(localReplicationCluster)).append("\n");
        sb.append("    remoteReplicationCluster: ").append(toIndentedString(remoteReplicationCluster)).append("\n");
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
