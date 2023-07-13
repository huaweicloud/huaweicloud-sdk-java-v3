package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 规格。
 */
public class EsflavorsVersionsFlavorsResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private Integer cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ram")

    private Integer ram;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diskrange")

    private String diskrange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availableAZ")

    private String availableAZ;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_id")

    private String flavorId;

    public EsflavorsVersionsFlavorsResp withCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * 实例的CPU核数。
     * @return cpu
     */
    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    public EsflavorsVersionsFlavorsResp withRam(Integer ram) {
        this.ram = ram;
        return this;
    }

    /**
     * 实例的内存大小。单位GB。
     * @return ram
     */
    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public EsflavorsVersionsFlavorsResp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 规格名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EsflavorsVersionsFlavorsResp withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 可用region。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public EsflavorsVersionsFlavorsResp withDiskrange(String diskrange) {
        this.diskrange = diskrange;
        return this;
    }

    /**
     * 实例的硬盘容量范围。
     * @return diskrange
     */
    public String getDiskrange() {
        return diskrange;
    }

    public void setDiskrange(String diskrange) {
        this.diskrange = diskrange;
    }

    public EsflavorsVersionsFlavorsResp withAvailableAZ(String availableAZ) {
        this.availableAZ = availableAZ;
        return this;
    }

    /**
     * 可用区。
     * @return availableAZ
     */
    public String getAvailableAZ() {
        return availableAZ;
    }

    public void setAvailableAZ(String availableAZ) {
        this.availableAZ = availableAZ;
    }

    public EsflavorsVersionsFlavorsResp withFlavorId(String flavorId) {
        this.flavorId = flavorId;
        return this;
    }

    /**
     * 规格对应的ID。
     * @return flavorId
     */
    public String getFlavorId() {
        return flavorId;
    }

    public void setFlavorId(String flavorId) {
        this.flavorId = flavorId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EsflavorsVersionsFlavorsResp that = (EsflavorsVersionsFlavorsResp) obj;
        return Objects.equals(this.cpu, that.cpu) && Objects.equals(this.ram, that.ram)
            && Objects.equals(this.name, that.name) && Objects.equals(this.region, that.region)
            && Objects.equals(this.diskrange, that.diskrange) && Objects.equals(this.availableAZ, that.availableAZ)
            && Objects.equals(this.flavorId, that.flavorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, ram, name, region, diskrange, availableAZ, flavorId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EsflavorsVersionsFlavorsResp {\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    diskrange: ").append(toIndentedString(diskrange)).append("\n");
        sb.append("    availableAZ: ").append(toIndentedString(availableAZ)).append("\n");
        sb.append("    flavorId: ").append(toIndentedString(flavorId)).append("\n");
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
