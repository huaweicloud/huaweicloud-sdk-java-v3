package com.huaweicloud.sdk.evs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Request Object
 */
public class ListVolumesDetailsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="marker")
    
    private String marker;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit = 1000;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sort_key")
    
    private String sortKey;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sort_dir")
    
    private String sortDir;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metadata")
    
    private String metadata;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="availability_zone")
    
    private String availabilityZone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="multiattach")
    
    private Boolean multiattach;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service_type")
    
    private String serviceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dedicated_storage_id")
    
    private String dedicatedStorageId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dedicated_storage_name")
    
    private String dedicatedStorageName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volume_type_id")
    
    private String volumeTypeId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ids")
    
    private String ids;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;

    public ListVolumesDetailsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    


    /**
     * Get marker
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListVolumesDetailsRequest withName(String name) {
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

    public ListVolumesDetailsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListVolumesDetailsRequest withSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    


    /**
     * Get sortKey
     * @return sortKey
     */
    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public ListVolumesDetailsRequest withOffset(Integer offset) {
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

    public ListVolumesDetailsRequest withSortDir(String sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    


    /**
     * Get sortDir
     * @return sortDir
     */
    public String getSortDir() {
        return sortDir;
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
    }

    public ListVolumesDetailsRequest withStatus(String status) {
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

    public ListVolumesDetailsRequest withMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    


    /**
     * Get metadata
     * @return metadata
     */
    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public ListVolumesDetailsRequest withAvailabilityZone(String availabilityZone) {
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

    public ListVolumesDetailsRequest withMultiattach(Boolean multiattach) {
        this.multiattach = multiattach;
        return this;
    }

    


    /**
     * Get multiattach
     * @return multiattach
     */
    public Boolean getMultiattach() {
        return multiattach;
    }

    public void setMultiattach(Boolean multiattach) {
        this.multiattach = multiattach;
    }

    public ListVolumesDetailsRequest withServiceType(String serviceType) {
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

    public ListVolumesDetailsRequest withDedicatedStorageId(String dedicatedStorageId) {
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

    public ListVolumesDetailsRequest withDedicatedStorageName(String dedicatedStorageName) {
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

    public ListVolumesDetailsRequest withVolumeTypeId(String volumeTypeId) {
        this.volumeTypeId = volumeTypeId;
        return this;
    }

    


    /**
     * Get volumeTypeId
     * @return volumeTypeId
     */
    public String getVolumeTypeId() {
        return volumeTypeId;
    }

    public void setVolumeTypeId(String volumeTypeId) {
        this.volumeTypeId = volumeTypeId;
    }

    public ListVolumesDetailsRequest withId(String id) {
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

    public ListVolumesDetailsRequest withIds(String ids) {
        this.ids = ids;
        return this;
    }

    


    /**
     * Get ids
     * @return ids
     */
    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public ListVolumesDetailsRequest withEnterpriseProjectId(String enterpriseProjectId) {
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
        ListVolumesDetailsRequest listVolumesDetailsRequest = (ListVolumesDetailsRequest) o;
        return Objects.equals(this.marker, listVolumesDetailsRequest.marker) &&
            Objects.equals(this.name, listVolumesDetailsRequest.name) &&
            Objects.equals(this.limit, listVolumesDetailsRequest.limit) &&
            Objects.equals(this.sortKey, listVolumesDetailsRequest.sortKey) &&
            Objects.equals(this.offset, listVolumesDetailsRequest.offset) &&
            Objects.equals(this.sortDir, listVolumesDetailsRequest.sortDir) &&
            Objects.equals(this.status, listVolumesDetailsRequest.status) &&
            Objects.equals(this.metadata, listVolumesDetailsRequest.metadata) &&
            Objects.equals(this.availabilityZone, listVolumesDetailsRequest.availabilityZone) &&
            Objects.equals(this.multiattach, listVolumesDetailsRequest.multiattach) &&
            Objects.equals(this.serviceType, listVolumesDetailsRequest.serviceType) &&
            Objects.equals(this.dedicatedStorageId, listVolumesDetailsRequest.dedicatedStorageId) &&
            Objects.equals(this.dedicatedStorageName, listVolumesDetailsRequest.dedicatedStorageName) &&
            Objects.equals(this.volumeTypeId, listVolumesDetailsRequest.volumeTypeId) &&
            Objects.equals(this.id, listVolumesDetailsRequest.id) &&
            Objects.equals(this.ids, listVolumesDetailsRequest.ids) &&
            Objects.equals(this.enterpriseProjectId, listVolumesDetailsRequest.enterpriseProjectId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(marker, name, limit, sortKey, offset, sortDir, status, metadata, availabilityZone, multiattach, serviceType, dedicatedStorageId, dedicatedStorageName, volumeTypeId, id, ids, enterpriseProjectId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVolumesDetailsRequest {\n");
            sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
            sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
            sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
            sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
            sb.append("    status: ").append(toIndentedString(status)).append("\n");
            sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
            sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
            sb.append("    multiattach: ").append(toIndentedString(multiattach)).append("\n");
            sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
            sb.append("    dedicatedStorageId: ").append(toIndentedString(dedicatedStorageId)).append("\n");
            sb.append("    dedicatedStorageName: ").append(toIndentedString(dedicatedStorageName)).append("\n");
            sb.append("    volumeTypeId: ").append(toIndentedString(volumeTypeId)).append("\n");
            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
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

