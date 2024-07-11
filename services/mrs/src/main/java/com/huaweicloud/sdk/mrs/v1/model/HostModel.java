package com.huaweicloud.sdk.mrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * HostModel
 */
public class HostModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone_id")

    private String availabilityZoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagPlain> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private String flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mem")

    private String mem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private String cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_volume_size")

    private String rootVolumeSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_volume_type")

    private String dataVolumeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_volume_size")

    private Integer dataVolumeSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_volume_count")

    private Integer dataVolumeCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_group_name")

    private String nodeGroupName;

    public HostModel withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 虚拟机ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public HostModel withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 虚拟机名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HostModel withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * 虚拟机IP地址
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public HostModel withAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
        return this;
    }

    /**
     * 可用区域
     * @return availabilityZoneId
     */
    public String getAvailabilityZoneId() {
        return availabilityZoneId;
    }

    public void setAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
    }

    public HostModel withTags(List<TagPlain> tags) {
        this.tags = tags;
        return this;
    }

    public HostModel addTagsItem(TagPlain tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public HostModel withTags(Consumer<List<TagPlain>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表信息
     * @return tags
     */
    public List<TagPlain> getTags() {
        return tags;
    }

    public void setTags(List<TagPlain> tags) {
        this.tags = tags;
    }

    public HostModel withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 虚拟机当前状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public HostModel withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 节点资源ID
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public HostModel withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * 虚拟机规格ID
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public HostModel withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 虚拟机类型，当前支持MasterNode，CoreNode，TaskNode
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public HostModel withMem(String mem) {
        this.mem = mem;
        return this;
    }

    /**
     * 内存
     * @return mem
     */
    public String getMem() {
        return mem;
    }

    public void setMem(String mem) {
        this.mem = mem;
    }

    public HostModel withCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * CPU核数
     * @return cpu
     */
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public HostModel withRootVolumeSize(String rootVolumeSize) {
        this.rootVolumeSize = rootVolumeSize;
        return this;
    }

    /**
     * 操作系统盘容量
     * @return rootVolumeSize
     */
    public String getRootVolumeSize() {
        return rootVolumeSize;
    }

    public void setRootVolumeSize(String rootVolumeSize) {
        this.rootVolumeSize = rootVolumeSize;
    }

    public HostModel withDataVolumeType(String dataVolumeType) {
        this.dataVolumeType = dataVolumeType;
        return this;
    }

    /**
     * 数据盘类型
     * @return dataVolumeType
     */
    public String getDataVolumeType() {
        return dataVolumeType;
    }

    public void setDataVolumeType(String dataVolumeType) {
        this.dataVolumeType = dataVolumeType;
    }

    public HostModel withDataVolumeSize(Integer dataVolumeSize) {
        this.dataVolumeSize = dataVolumeSize;
        return this;
    }

    /**
     * 数据盘容量
     * @return dataVolumeSize
     */
    public Integer getDataVolumeSize() {
        return dataVolumeSize;
    }

    public void setDataVolumeSize(Integer dataVolumeSize) {
        this.dataVolumeSize = dataVolumeSize;
    }

    public HostModel withDataVolumeCount(Integer dataVolumeCount) {
        this.dataVolumeCount = dataVolumeCount;
        return this;
    }

    /**
     * 数据盘个数
     * @return dataVolumeCount
     */
    public Integer getDataVolumeCount() {
        return dataVolumeCount;
    }

    public void setDataVolumeCount(Integer dataVolumeCount) {
        this.dataVolumeCount = dataVolumeCount;
    }

    public HostModel withNodeGroupName(String nodeGroupName) {
        this.nodeGroupName = nodeGroupName;
        return this;
    }

    /**
     * 节点组名称
     * @return nodeGroupName
     */
    public String getNodeGroupName() {
        return nodeGroupName;
    }

    public void setNodeGroupName(String nodeGroupName) {
        this.nodeGroupName = nodeGroupName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HostModel that = (HostModel) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.ip, that.ip) && Objects.equals(this.availabilityZoneId, that.availabilityZoneId)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.status, that.status)
            && Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.flavor, that.flavor)
            && Objects.equals(this.type, that.type) && Objects.equals(this.mem, that.mem)
            && Objects.equals(this.cpu, that.cpu) && Objects.equals(this.rootVolumeSize, that.rootVolumeSize)
            && Objects.equals(this.dataVolumeType, that.dataVolumeType)
            && Objects.equals(this.dataVolumeSize, that.dataVolumeSize)
            && Objects.equals(this.dataVolumeCount, that.dataVolumeCount)
            && Objects.equals(this.nodeGroupName, that.nodeGroupName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            ip,
            availabilityZoneId,
            tags,
            status,
            resourceId,
            flavor,
            type,
            mem,
            cpu,
            rootVolumeSize,
            dataVolumeType,
            dataVolumeSize,
            dataVolumeCount,
            nodeGroupName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostModel {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    availabilityZoneId: ").append(toIndentedString(availabilityZoneId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    mem: ").append(toIndentedString(mem)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    rootVolumeSize: ").append(toIndentedString(rootVolumeSize)).append("\n");
        sb.append("    dataVolumeType: ").append(toIndentedString(dataVolumeType)).append("\n");
        sb.append("    dataVolumeSize: ").append(toIndentedString(dataVolumeSize)).append("\n");
        sb.append("    dataVolumeCount: ").append(toIndentedString(dataVolumeCount)).append("\n");
        sb.append("    nodeGroupName: ").append(toIndentedString(nodeGroupName)).append("\n");
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
