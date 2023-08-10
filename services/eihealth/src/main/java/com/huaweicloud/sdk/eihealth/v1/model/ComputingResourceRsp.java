package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ComputingResourceRsp
 */
public class ComputingResourceRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evs_resource_id")

    private String evsResourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private ComputingSpecDto spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_disk")

    private DiskDto systemDisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_disks")

    private List<DiskDto> dataDisks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private ImageDto image;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_mode")

    private String chargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure_reason")

    private String failureReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone_id")

    private String availabilityZoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedulable")

    private Boolean schedulable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_labels")

    private List<String> nodeLabels = null;

    public ComputingResourceRsp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 实例ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ComputingResourceRsp withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源ID
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ComputingResourceRsp withEvsResourceId(String evsResourceId) {
        this.evsResourceId = evsResourceId;
        return this;
    }

    /**
     * 额外盘资源ID
     * @return evsResourceId
     */
    public String getEvsResourceId() {
        return evsResourceId;
    }

    public void setEvsResourceId(String evsResourceId) {
        this.evsResourceId = evsResourceId;
    }

    public ComputingResourceRsp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ComputingResourceRsp withSpec(ComputingSpecDto spec) {
        this.spec = spec;
        return this;
    }

    public ComputingResourceRsp withSpec(Consumer<ComputingSpecDto> specSetter) {
        if (this.spec == null) {
            this.spec = new ComputingSpecDto();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public ComputingSpecDto getSpec() {
        return spec;
    }

    public void setSpec(ComputingSpecDto spec) {
        this.spec = spec;
    }

    public ComputingResourceRsp withSystemDisk(DiskDto systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }

    public ComputingResourceRsp withSystemDisk(Consumer<DiskDto> systemDiskSetter) {
        if (this.systemDisk == null) {
            this.systemDisk = new DiskDto();
            systemDiskSetter.accept(this.systemDisk);
        }

        return this;
    }

    /**
     * Get systemDisk
     * @return systemDisk
     */
    public DiskDto getSystemDisk() {
        return systemDisk;
    }

    public void setSystemDisk(DiskDto systemDisk) {
        this.systemDisk = systemDisk;
    }

    public ComputingResourceRsp withDataDisks(List<DiskDto> dataDisks) {
        this.dataDisks = dataDisks;
        return this;
    }

    public ComputingResourceRsp addDataDisksItem(DiskDto dataDisksItem) {
        if (this.dataDisks == null) {
            this.dataDisks = new ArrayList<>();
        }
        this.dataDisks.add(dataDisksItem);
        return this;
    }

    public ComputingResourceRsp withDataDisks(Consumer<List<DiskDto>> dataDisksSetter) {
        if (this.dataDisks == null) {
            this.dataDisks = new ArrayList<>();
        }
        dataDisksSetter.accept(this.dataDisks);
        return this;
    }

    /**
     * 数据盘
     * @return dataDisks
     */
    public List<DiskDto> getDataDisks() {
        return dataDisks;
    }

    public void setDataDisks(List<DiskDto> dataDisks) {
        this.dataDisks = dataDisks;
    }

    public ComputingResourceRsp withImage(ImageDto image) {
        this.image = image;
        return this;
    }

    public ComputingResourceRsp withImage(Consumer<ImageDto> imageSetter) {
        if (this.image == null) {
            this.image = new ImageDto();
            imageSetter.accept(this.image);
        }

        return this;
    }

    /**
     * Get image
     * @return image
     */
    public ImageDto getImage() {
        return image;
    }

    public void setImage(ImageDto image) {
        this.image = image;
    }

    public ComputingResourceRsp withChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * 计费模式
     * @return chargeMode
     */
    public String getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
    }

    public ComputingResourceRsp withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 购买时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ComputingResourceRsp withFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * 失败原因
     * @return failureReason
     */
    public String getFailureReason() {
        return failureReason;
    }

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    public ComputingResourceRsp withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ComputingResourceRsp withAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
        return this;
    }

    /**
     * 可用区
     * @return availabilityZoneId
     */
    public String getAvailabilityZoneId() {
        return availabilityZoneId;
    }

    public void setAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
    }

    public ComputingResourceRsp withSchedulable(Boolean schedulable) {
        this.schedulable = schedulable;
        return this;
    }

    /**
     * 资源是否可调度
     * @return schedulable
     */
    public Boolean getSchedulable() {
        return schedulable;
    }

    public void setSchedulable(Boolean schedulable) {
        this.schedulable = schedulable;
    }

    public ComputingResourceRsp withNodeLabels(List<String> nodeLabels) {
        this.nodeLabels = nodeLabels;
        return this;
    }

    public ComputingResourceRsp addNodeLabelsItem(String nodeLabelsItem) {
        if (this.nodeLabels == null) {
            this.nodeLabels = new ArrayList<>();
        }
        this.nodeLabels.add(nodeLabelsItem);
        return this;
    }

    public ComputingResourceRsp withNodeLabels(Consumer<List<String>> nodeLabelsSetter) {
        if (this.nodeLabels == null) {
            this.nodeLabels = new ArrayList<>();
        }
        nodeLabelsSetter.accept(this.nodeLabels);
        return this;
    }

    /**
     * 计算节点标签列表
     * @return nodeLabels
     */
    public List<String> getNodeLabels() {
        return nodeLabels;
    }

    public void setNodeLabels(List<String> nodeLabels) {
        this.nodeLabels = nodeLabels;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ComputingResourceRsp that = (ComputingResourceRsp) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.evsResourceId, that.evsResourceId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.spec, that.spec) && Objects.equals(this.systemDisk, that.systemDisk)
            && Objects.equals(this.dataDisks, that.dataDisks) && Objects.equals(this.image, that.image)
            && Objects.equals(this.chargeMode, that.chargeMode) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.failureReason, that.failureReason) && Objects.equals(this.status, that.status)
            && Objects.equals(this.availabilityZoneId, that.availabilityZoneId)
            && Objects.equals(this.schedulable, that.schedulable) && Objects.equals(this.nodeLabels, that.nodeLabels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            resourceId,
            evsResourceId,
            name,
            spec,
            systemDisk,
            dataDisks,
            image,
            chargeMode,
            createTime,
            failureReason,
            status,
            availabilityZoneId,
            schedulable,
            nodeLabels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComputingResourceRsp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    evsResourceId: ").append(toIndentedString(evsResourceId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        sb.append("    systemDisk: ").append(toIndentedString(systemDisk)).append("\n");
        sb.append("    dataDisks: ").append(toIndentedString(dataDisks)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    availabilityZoneId: ").append(toIndentedString(availabilityZoneId)).append("\n");
        sb.append("    schedulable: ").append(toIndentedString(schedulable)).append("\n");
        sb.append("    nodeLabels: ").append(toIndentedString(nodeLabels)).append("\n");
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
