package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 云服务器规格信息。
 */
public class FlavorQuasar {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vcpus")

    private Integer vcpus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ram")

    private Integer ram;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk")

    private Integer disk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_gb")

    private Integer rootGb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ephemeral_gb")

    private Integer ephemeralGb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_specs")

    private Map<String, String> extraSpecs = null;

    public FlavorQuasar withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 云服务器类型ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FlavorQuasar withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 云服务器规格名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FlavorQuasar withVcpus(Integer vcpus) {
        this.vcpus = vcpus;
        return this;
    }

    /**
     * 该云服务器规格对应的CPU核数。
     * @return vcpus
     */
    public Integer getVcpus() {
        return vcpus;
    }

    public void setVcpus(Integer vcpus) {
        this.vcpus = vcpus;
    }

    public FlavorQuasar withRam(Integer ram) {
        this.ram = ram;
        return this;
    }

    /**
     * 该云服务器规格对应的内存大小，单位为MB.
     * @return ram
     */
    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public FlavorQuasar withDisk(Integer disk) {
        this.disk = disk;
        return this;
    }

    /**
     * 该云服务器规格对应要求系统盘大小，0为不限制。
     * @return disk
     */
    public Integer getDisk() {
        return disk;
    }

    public void setDisk(Integer disk) {
        this.disk = disk;
    }

    public FlavorQuasar withRootGb(Integer rootGb) {
        this.rootGb = rootGb;
        return this;
    }

    /**
     * Get rootGb
     * @return rootGb
     */
    public Integer getRootGb() {
        return rootGb;
    }

    public void setRootGb(Integer rootGb) {
        this.rootGb = rootGb;
    }

    public FlavorQuasar withEphemeralGb(Integer ephemeralGb) {
        this.ephemeralGb = ephemeralGb;
        return this;
    }

    /**
     * Get ephemeralGb
     * @return ephemeralGb
     */
    public Integer getEphemeralGb() {
        return ephemeralGb;
    }

    public void setEphemeralGb(Integer ephemeralGb) {
        this.ephemeralGb = ephemeralGb;
    }

    public FlavorQuasar withExtraSpecs(Map<String, String> extraSpecs) {
        this.extraSpecs = extraSpecs;
        return this;
    }

    public FlavorQuasar putExtraSpecsItem(String key, String extraSpecsItem) {
        if (this.extraSpecs == null) {
            this.extraSpecs = new HashMap<>();
        }
        this.extraSpecs.put(key, extraSpecsItem);
        return this;
    }

    public FlavorQuasar withExtraSpecs(Consumer<Map<String, String>> extraSpecsSetter) {
        if (this.extraSpecs == null) {
            this.extraSpecs = new HashMap<>();
        }
        extraSpecsSetter.accept(this.extraSpecs);
        return this;
    }

    /**
     * flavor扩展字段。
     * @return extraSpecs
     */
    public Map<String, String> getExtraSpecs() {
        return extraSpecs;
    }

    public void setExtraSpecs(Map<String, String> extraSpecs) {
        this.extraSpecs = extraSpecs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FlavorQuasar that = (FlavorQuasar) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.vcpus, that.vcpus) && Objects.equals(this.ram, that.ram)
            && Objects.equals(this.disk, that.disk) && Objects.equals(this.rootGb, that.rootGb)
            && Objects.equals(this.ephemeralGb, that.ephemeralGb) && Objects.equals(this.extraSpecs, that.extraSpecs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, vcpus, ram, disk, rootGb, ephemeralGb, extraSpecs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlavorQuasar {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    vcpus: ").append(toIndentedString(vcpus)).append("\n");
        sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
        sb.append("    disk: ").append(toIndentedString(disk)).append("\n");
        sb.append("    rootGb: ").append(toIndentedString(rootGb)).append("\n");
        sb.append("    ephemeralGb: ").append(toIndentedString(ephemeralGb)).append("\n");
        sb.append("    extraSpecs: ").append(toIndentedString(extraSpecs)).append("\n");
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
