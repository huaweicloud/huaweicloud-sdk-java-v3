package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 节点类型对象
 */
public class NodeTypes {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_name")

    private String specName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    private List<Detail> detail = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_type")

    private String datastoreType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "architecture")

    private String architecture;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_zones")

    private List<NodeTypeAvailableZones> availableZones = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ram")

    private Integer ram;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vcpus")

    private Integer vcpus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastores")

    private List<NodeTypeDatastores> datastores = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume")

    private VolumeResp volume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elastic_volume_specs")

    private List<NodeTypeElasticVolumeSpecs> elasticVolumeSpecs = null;

    public NodeTypes withSpecName(String specName) {
        this.specName = specName;
        return this;
    }

    /**
     * 节点类型名称。
     * @return specName
     */
    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName;
    }

    public NodeTypes withDetail(List<Detail> detail) {
        this.detail = detail;
        return this;
    }

    public NodeTypes addDetailItem(Detail detailItem) {
        if (this.detail == null) {
            this.detail = new ArrayList<>();
        }
        this.detail.add(detailItem);
        return this;
    }

    public NodeTypes withDetail(Consumer<List<Detail>> detailSetter) {
        if (this.detail == null) {
            this.detail = new ArrayList<>();
        }
        detailSetter.accept(this.detail);
        return this;
    }

    /**
     * 节点类型详细。
     * @return detail
     */
    public List<Detail> getDetail() {
        return detail;
    }

    public void setDetail(List<Detail> detail) {
        this.detail = detail;
    }

    public NodeTypes withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 节点类型ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NodeTypes withDatastoreType(String datastoreType) {
        this.datastoreType = datastoreType;
        return this;
    }

    /**
     * 产品类型 - dws：云数仓。 - hybrid：实时数仓。 - stream：IoT数仓。
     * @return datastoreType
     */
    public String getDatastoreType() {
        return datastoreType;
    }

    public void setDatastoreType(String datastoreType) {
        this.datastoreType = datastoreType;
    }

    public NodeTypes withArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }

    /**
     * 架构类型 - x86。 - arm。
     * @return architecture
     */
    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public NodeTypes withAvailableZones(List<NodeTypeAvailableZones> availableZones) {
        this.availableZones = availableZones;
        return this;
    }

    public NodeTypes addAvailableZonesItem(NodeTypeAvailableZones availableZonesItem) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        this.availableZones.add(availableZonesItem);
        return this;
    }

    public NodeTypes withAvailableZones(Consumer<List<NodeTypeAvailableZones>> availableZonesSetter) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        availableZonesSetter.accept(this.availableZones);
        return this;
    }

    /**
     * 支持的可用区及状态信息。
     * @return availableZones
     */
    public List<NodeTypeAvailableZones> getAvailableZones() {
        return availableZones;
    }

    public void setAvailableZones(List<NodeTypeAvailableZones> availableZones) {
        this.availableZones = availableZones;
    }

    public NodeTypes withRam(Integer ram) {
        this.ram = ram;
        return this;
    }

    /**
     * 内存大小。
     * @return ram
     */
    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public NodeTypes withVcpus(Integer vcpus) {
        this.vcpus = vcpus;
        return this;
    }

    /**
     * CPU数量。
     * @return vcpus
     */
    public Integer getVcpus() {
        return vcpus;
    }

    public void setVcpus(Integer vcpus) {
        this.vcpus = vcpus;
    }

    public NodeTypes withDatastores(List<NodeTypeDatastores> datastores) {
        this.datastores = datastores;
        return this;
    }

    public NodeTypes addDatastoresItem(NodeTypeDatastores datastoresItem) {
        if (this.datastores == null) {
            this.datastores = new ArrayList<>();
        }
        this.datastores.add(datastoresItem);
        return this;
    }

    public NodeTypes withDatastores(Consumer<List<NodeTypeDatastores>> datastoresSetter) {
        if (this.datastores == null) {
            this.datastores = new ArrayList<>();
        }
        datastoresSetter.accept(this.datastores);
        return this;
    }

    /**
     * 内核版本信息。
     * @return datastores
     */
    public List<NodeTypeDatastores> getDatastores() {
        return datastores;
    }

    public void setDatastores(List<NodeTypeDatastores> datastores) {
        this.datastores = datastores;
    }

    public NodeTypes withVolume(VolumeResp volume) {
        this.volume = volume;
        return this;
    }

    public NodeTypes withVolume(Consumer<VolumeResp> volumeSetter) {
        if (this.volume == null) {
            this.volume = new VolumeResp();
            volumeSetter.accept(this.volume);
        }

        return this;
    }

    /**
     * Get volume
     * @return volume
     */
    public VolumeResp getVolume() {
        return volume;
    }

    public void setVolume(VolumeResp volume) {
        this.volume = volume;
    }

    public NodeTypes withElasticVolumeSpecs(List<NodeTypeElasticVolumeSpecs> elasticVolumeSpecs) {
        this.elasticVolumeSpecs = elasticVolumeSpecs;
        return this;
    }

    public NodeTypes addElasticVolumeSpecsItem(NodeTypeElasticVolumeSpecs elasticVolumeSpecsItem) {
        if (this.elasticVolumeSpecs == null) {
            this.elasticVolumeSpecs = new ArrayList<>();
        }
        this.elasticVolumeSpecs.add(elasticVolumeSpecsItem);
        return this;
    }

    public NodeTypes withElasticVolumeSpecs(Consumer<List<NodeTypeElasticVolumeSpecs>> elasticVolumeSpecsSetter) {
        if (this.elasticVolumeSpecs == null) {
            this.elasticVolumeSpecs = new ArrayList<>();
        }
        elasticVolumeSpecsSetter.accept(this.elasticVolumeSpecs);
        return this;
    }

    /**
     * 如果规格为弹性容量规格，则该属性为规格典配的弹性容量信息，包括存储类型、最小容量、最大容量以及步长信息，如果为固定存储规格，则该属性为null。
     * @return elasticVolumeSpecs
     */
    public List<NodeTypeElasticVolumeSpecs> getElasticVolumeSpecs() {
        return elasticVolumeSpecs;
    }

    public void setElasticVolumeSpecs(List<NodeTypeElasticVolumeSpecs> elasticVolumeSpecs) {
        this.elasticVolumeSpecs = elasticVolumeSpecs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeTypes that = (NodeTypes) obj;
        return Objects.equals(this.specName, that.specName) && Objects.equals(this.detail, that.detail)
            && Objects.equals(this.id, that.id) && Objects.equals(this.datastoreType, that.datastoreType)
            && Objects.equals(this.architecture, that.architecture)
            && Objects.equals(this.availableZones, that.availableZones) && Objects.equals(this.ram, that.ram)
            && Objects.equals(this.vcpus, that.vcpus) && Objects.equals(this.datastores, that.datastores)
            && Objects.equals(this.volume, that.volume)
            && Objects.equals(this.elasticVolumeSpecs, that.elasticVolumeSpecs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specName,
            detail,
            id,
            datastoreType,
            architecture,
            availableZones,
            ram,
            vcpus,
            datastores,
            volume,
            elasticVolumeSpecs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeTypes {\n");
        sb.append("    specName: ").append(toIndentedString(specName)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    datastoreType: ").append(toIndentedString(datastoreType)).append("\n");
        sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
        sb.append("    availableZones: ").append(toIndentedString(availableZones)).append("\n");
        sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
        sb.append("    vcpus: ").append(toIndentedString(vcpus)).append("\n");
        sb.append("    datastores: ").append(toIndentedString(datastores)).append("\n");
        sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
        sb.append("    elasticVolumeSpecs: ").append(toIndentedString(elasticVolumeSpecs)).append("\n");
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
