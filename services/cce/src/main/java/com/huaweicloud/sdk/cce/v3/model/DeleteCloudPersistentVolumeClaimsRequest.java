package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteCloudPersistentVolumeClaimsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deleteVolume")

    private String deleteVolume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storageType")

    private String storageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Cluster-ID")

    private String xClusterID;

    public DeleteCloudPersistentVolumeClaimsRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 需要删除的PersistentVolumClaim的名称。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeleteCloudPersistentVolumeClaimsRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 指定PersistentVolumeClaim所在的命名空间。 
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public DeleteCloudPersistentVolumeClaimsRequest withDeleteVolume(String deleteVolume) {
        this.deleteVolume = deleteVolume;
        return this;
    }

    /**
     * 删除PersistentVolumeClaim后是否保留后端关联的云存储。false表示不删除，true表示删除，默认为false。 
     * @return deleteVolume
     */
    public String getDeleteVolume() {
        return deleteVolume;
    }

    public void setDeleteVolume(String deleteVolume) {
        this.deleteVolume = deleteVolume;
    }

    public DeleteCloudPersistentVolumeClaimsRequest withStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    /**
     * 云存储的类型，和deleteVolume搭配使用。即deleteVolume和storageType必须同时配置。 - bs：EVS云硬盘存储 - nfs：SFS弹性文件存储 - obs：OBS对象存储 - efs：SFS Turbo极速文件存储 
     * @return storageType
     */
    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public DeleteCloudPersistentVolumeClaimsRequest withXClusterID(String xClusterID) {
        this.xClusterID = xClusterID;
        return this;
    }

    /**
     * 集群ID，使用**https://Endpoint/uri**这种URL格式时必须指定此参数。获取方式请参见[如何获取接口URI中参数](cce_02_0271.xml)。 
     * @return xClusterID
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Cluster-ID")
    public String getXClusterID() {
        return xClusterID;
    }

    public void setXClusterID(String xClusterID) {
        this.xClusterID = xClusterID;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteCloudPersistentVolumeClaimsRequest deleteCloudPersistentVolumeClaimsRequest =
            (DeleteCloudPersistentVolumeClaimsRequest) o;
        return Objects.equals(this.name, deleteCloudPersistentVolumeClaimsRequest.name)
            && Objects.equals(this.namespace, deleteCloudPersistentVolumeClaimsRequest.namespace)
            && Objects.equals(this.deleteVolume, deleteCloudPersistentVolumeClaimsRequest.deleteVolume)
            && Objects.equals(this.storageType, deleteCloudPersistentVolumeClaimsRequest.storageType)
            && Objects.equals(this.xClusterID, deleteCloudPersistentVolumeClaimsRequest.xClusterID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, namespace, deleteVolume, storageType, xClusterID);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteCloudPersistentVolumeClaimsRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    deleteVolume: ").append(toIndentedString(deleteVolume)).append("\n");
        sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
        sb.append("    xClusterID: ").append(toIndentedString(xClusterID)).append("\n");
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
