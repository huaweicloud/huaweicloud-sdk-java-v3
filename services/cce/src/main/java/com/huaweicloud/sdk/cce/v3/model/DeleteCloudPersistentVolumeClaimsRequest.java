package com.huaweicloud.sdk.cce.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class DeleteCloudPersistentVolumeClaimsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="namespace")
    
    private String namespace;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="deleteVolume")
    
    private String deleteVolume;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="storageType")
    
    private String storageType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Cluster-ID")
    
    private String xClusterID;

    public DeleteCloudPersistentVolumeClaimsRequest withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * Get name
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
     * Get namespace
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
     * Get deleteVolume
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
     * Get storageType
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
     * Get xClusterID
     * @return xClusterID
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Cluster-ID")
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
        DeleteCloudPersistentVolumeClaimsRequest deleteCloudPersistentVolumeClaimsRequest = (DeleteCloudPersistentVolumeClaimsRequest) o;
        return Objects.equals(this.name, deleteCloudPersistentVolumeClaimsRequest.name) &&
            Objects.equals(this.namespace, deleteCloudPersistentVolumeClaimsRequest.namespace) &&
            Objects.equals(this.deleteVolume, deleteCloudPersistentVolumeClaimsRequest.deleteVolume) &&
            Objects.equals(this.storageType, deleteCloudPersistentVolumeClaimsRequest.storageType) &&
            Objects.equals(this.xClusterID, deleteCloudPersistentVolumeClaimsRequest.xClusterID);
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

