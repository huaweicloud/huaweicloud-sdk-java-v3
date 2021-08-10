package com.huaweicloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListVolumesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private String sortKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private String sortDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private String metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multiattach")

    private Boolean multiattach;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    private String serviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated_storage_id")

    private String dedicatedStorageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated_storage_name")

    private String dedicatedStorageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_type_id")

    private String volumeTypeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ids")

    private String ids;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    public ListVolumesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /** 通过云硬盘ID进行分页查询。默认为查询第一页数据。
     * 
     * @return marker */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListVolumesRequest withName(String name) {
        this.name = name;
        return this;
    }

    /** 磁盘名称。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListVolumesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 返回结果个数限制。默认值为1000。 minimum: 1 maximum: 1000
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListVolumesRequest withSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /** 返回结果按该关键字排序，支持id，status，size，created_at等关键字，默认为“created_at”。
     * 
     * @return sortKey */
    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public ListVolumesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /** 偏移量（偏移量为一个大于0小于磁盘总个数的整数，表示查询该偏移量后面的所有的磁盘）。
     * 
     * @return offset */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListVolumesRequest withSortDir(String sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /** 返回结果按照降序或升序排列，默认为“desc”。 降序：desc 升序：asc
     * 
     * @return sortDir */
    public String getSortDir() {
        return sortDir;
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
    }

    public ListVolumesRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 云硬盘状态，取值可参考：\"[云硬盘状态](https://support.huaweicloud.com/api-evs/evs_04_0040.html)\"。
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListVolumesRequest withMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /** 云硬盘元数据。
     * 
     * @return metadata */
    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public ListVolumesRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /** 可用区信息。
     * 
     * @return availabilityZone */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public ListVolumesRequest withMultiattach(Boolean multiattach) {
        this.multiattach = multiattach;
        return this;
    }

    /** 是否为共享云硬盘。 true：表示为共享云硬盘。 false：表示为非共享云硬盘。
     * 
     * @return multiattach */
    public Boolean getMultiattach() {
        return multiattach;
    }

    public void setMultiattach(Boolean multiattach) {
        this.multiattach = multiattach;
    }

    public ListVolumesRequest withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /** 服务类型，仅支持EVS、DSS、DESS。
     * 
     * @return serviceType */
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public ListVolumesRequest withDedicatedStorageId(String dedicatedStorageId) {
        this.dedicatedStorageId = dedicatedStorageId;
        return this;
    }

    /** 专属存储池ID，可过滤出该专属存储池下的所有云硬盘，必须精确匹配。
     * 
     * @return dedicatedStorageId */
    public String getDedicatedStorageId() {
        return dedicatedStorageId;
    }

    public void setDedicatedStorageId(String dedicatedStorageId) {
        this.dedicatedStorageId = dedicatedStorageId;
    }

    public ListVolumesRequest withDedicatedStorageName(String dedicatedStorageName) {
        this.dedicatedStorageName = dedicatedStorageName;
        return this;
    }

    /** 专属存储池的名字，可过滤出该专属存储池下的所有云硬盘，支持模糊匹配。
     * 
     * @return dedicatedStorageName */
    public String getDedicatedStorageName() {
        return dedicatedStorageName;
    }

    public void setDedicatedStorageName(String dedicatedStorageName) {
        this.dedicatedStorageName = dedicatedStorageName;
    }

    public ListVolumesRequest withVolumeTypeId(String volumeTypeId) {
        this.volumeTypeId = volumeTypeId;
        return this;
    }

    /** 云硬盘类型id。
     * 通过\"[查询云硬盘类型列表](https://support.huaweicloud.com/api-evs/evs_04_3035.html)\"可以查到，即volume_types参数说明表格中的“id”
     * 
     * @return volumeTypeId */
    public String getVolumeTypeId() {
        return volumeTypeId;
    }

    public void setVolumeTypeId(String volumeTypeId) {
        this.volumeTypeId = volumeTypeId;
    }

    public ListVolumesRequest withId(String id) {
        this.id = id;
        return this;
    }

    /** 云硬盘ID。
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListVolumesRequest withIds(String ids) {
        this.ids = ids;
        return this;
    }

    /** 云硬盘id列表，格式为ids=['id1','id2',...,'idx']，返回“ids”中有效id的云硬盘详情，无效的id会被忽略。 支持查询最多60个id对应的云硬盘详情。
     * 如果“id”和“ids”查询参数同时存在，“id”会被忽略。
     * 
     * @return ids */
    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public ListVolumesRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /** 指定企业项目id进行过滤。 传入“all_granted_eps”，代表查询权限范围内的所有企业项目下的云硬盘。 > 说明： > >
     * 关于企业项目ID的获取及企业项目特性的详细信息，请参考：\"[企业管理用户指南](https://support.huaweicloud.com/usermanual-em/zh-cn_topic_0123692049.html)\"。
     * 
     * @return enterpriseProjectId */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListVolumesRequest withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /** 云服务器id
     * 
     * @return serverId */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListVolumesRequest listVolumesRequest = (ListVolumesRequest) o;
        return Objects.equals(this.marker, listVolumesRequest.marker)
            && Objects.equals(this.name, listVolumesRequest.name)
            && Objects.equals(this.limit, listVolumesRequest.limit)
            && Objects.equals(this.sortKey, listVolumesRequest.sortKey)
            && Objects.equals(this.offset, listVolumesRequest.offset)
            && Objects.equals(this.sortDir, listVolumesRequest.sortDir)
            && Objects.equals(this.status, listVolumesRequest.status)
            && Objects.equals(this.metadata, listVolumesRequest.metadata)
            && Objects.equals(this.availabilityZone, listVolumesRequest.availabilityZone)
            && Objects.equals(this.multiattach, listVolumesRequest.multiattach)
            && Objects.equals(this.serviceType, listVolumesRequest.serviceType)
            && Objects.equals(this.dedicatedStorageId, listVolumesRequest.dedicatedStorageId)
            && Objects.equals(this.dedicatedStorageName, listVolumesRequest.dedicatedStorageName)
            && Objects.equals(this.volumeTypeId, listVolumesRequest.volumeTypeId)
            && Objects.equals(this.id, listVolumesRequest.id) && Objects.equals(this.ids, listVolumesRequest.ids)
            && Objects.equals(this.enterpriseProjectId, listVolumesRequest.enterpriseProjectId)
            && Objects.equals(this.serverId, listVolumesRequest.serverId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marker,
            name,
            limit,
            sortKey,
            offset,
            sortDir,
            status,
            metadata,
            availabilityZone,
            multiattach,
            serviceType,
            dedicatedStorageId,
            dedicatedStorageName,
            volumeTypeId,
            id,
            ids,
            enterpriseProjectId,
            serverId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVolumesRequest {\n");
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
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
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
