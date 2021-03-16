package com.huaweicloud.sdk.evs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListSnapshotsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volume_id")
    
    private String volumeId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="availability_zone")
    
    private String availabilityZone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dedicated_storage_name")
    
    private String dedicatedStorageName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dedicated_storage_id")
    
    private String dedicatedStorageId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service_type")
    
    private String serviceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;

    public ListSnapshotsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * Get offset
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    

    public ListSnapshotsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public ListSnapshotsRequest withName(String name) {
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

    

    public ListSnapshotsRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * Get status
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public ListSnapshotsRequest withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    


    /**
     * Get volumeId
     * @return volumeId
     */
    public String getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    

    public ListSnapshotsRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    


    /**
     * Get availabilityZone
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    

    public ListSnapshotsRequest withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * Get id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public ListSnapshotsRequest withDedicatedStorageName(String dedicatedStorageName) {
        this.dedicatedStorageName = dedicatedStorageName;
        return this;
    }

    


    /**
     * Get dedicatedStorageName
     * @return dedicatedStorageName
     */
    public String getDedicatedStorageName() {
        return dedicatedStorageName;
    }

    public void setDedicatedStorageName(String dedicatedStorageName) {
        this.dedicatedStorageName = dedicatedStorageName;
    }

    

    public ListSnapshotsRequest withDedicatedStorageId(String dedicatedStorageId) {
        this.dedicatedStorageId = dedicatedStorageId;
        return this;
    }

    


    /**
     * Get dedicatedStorageId
     * @return dedicatedStorageId
     */
    public String getDedicatedStorageId() {
        return dedicatedStorageId;
    }

    public void setDedicatedStorageId(String dedicatedStorageId) {
        this.dedicatedStorageId = dedicatedStorageId;
    }

    

    public ListSnapshotsRequest withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    


    /**
     * Get serviceType
     * @return serviceType
     */
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    

    public ListSnapshotsRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * Get enterpriseProjectId
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSnapshotsRequest listSnapshotsRequest = (ListSnapshotsRequest) o;
        return Objects.equals(this.offset, listSnapshotsRequest.offset) &&
            Objects.equals(this.limit, listSnapshotsRequest.limit) &&
            Objects.equals(this.name, listSnapshotsRequest.name) &&
            Objects.equals(this.status, listSnapshotsRequest.status) &&
            Objects.equals(this.volumeId, listSnapshotsRequest.volumeId) &&
            Objects.equals(this.availabilityZone, listSnapshotsRequest.availabilityZone) &&
            Objects.equals(this.id, listSnapshotsRequest.id) &&
            Objects.equals(this.dedicatedStorageName, listSnapshotsRequest.dedicatedStorageName) &&
            Objects.equals(this.dedicatedStorageId, listSnapshotsRequest.dedicatedStorageId) &&
            Objects.equals(this.serviceType, listSnapshotsRequest.serviceType) &&
            Objects.equals(this.enterpriseProjectId, listSnapshotsRequest.enterpriseProjectId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, name, status, volumeId, availabilityZone, id, dedicatedStorageName, dedicatedStorageId, serviceType, enterpriseProjectId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSnapshotsRequest {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    dedicatedStorageName: ").append(toIndentedString(dedicatedStorageName)).append("\n");
        sb.append("    dedicatedStorageId: ").append(toIndentedString(dedicatedStorageId)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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

