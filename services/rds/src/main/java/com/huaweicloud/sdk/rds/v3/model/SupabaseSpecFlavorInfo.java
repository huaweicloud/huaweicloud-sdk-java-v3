package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 规格信息，含可售AZ和版本。
 */
public class SupabaseSpecFlavorInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vcpus")

    private Integer vcpus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ram")

    private Integer ram;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private String specCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_type")

    private String groupType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zones")

    private List<SupabaseSpecFlavorInfoAvailabilityZones> availabilityZones = null;

    public SupabaseSpecFlavorInfo withId(String id) {
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

    public SupabaseSpecFlavorInfo withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Get mode
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public SupabaseSpecFlavorInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get version
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public SupabaseSpecFlavorInfo withVcpus(Integer vcpus) {
        this.vcpus = vcpus;
        return this;
    }

    /**
     * Get vcpus
     * @return vcpus
     */
    public Integer getVcpus() {
        return vcpus;
    }

    public void setVcpus(Integer vcpus) {
        this.vcpus = vcpus;
    }

    public SupabaseSpecFlavorInfo withRam(Integer ram) {
        this.ram = ram;
        return this;
    }

    /**
     * Get ram
     * @return ram
     */
    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public SupabaseSpecFlavorInfo withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * Get specCode
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public SupabaseSpecFlavorInfo withGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }

    /**
     * Get groupType
     * @return groupType
     */
    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    public SupabaseSpecFlavorInfo withAvailabilityZones(
        List<SupabaseSpecFlavorInfoAvailabilityZones> availabilityZones) {
        this.availabilityZones = availabilityZones;
        return this;
    }

    public SupabaseSpecFlavorInfo addAvailabilityZonesItem(
        SupabaseSpecFlavorInfoAvailabilityZones availabilityZonesItem) {
        if (this.availabilityZones == null) {
            this.availabilityZones = new ArrayList<>();
        }
        this.availabilityZones.add(availabilityZonesItem);
        return this;
    }

    public SupabaseSpecFlavorInfo withAvailabilityZones(
        Consumer<List<SupabaseSpecFlavorInfoAvailabilityZones>> availabilityZonesSetter) {
        if (this.availabilityZones == null) {
            this.availabilityZones = new ArrayList<>();
        }
        availabilityZonesSetter.accept(this.availabilityZones);
        return this;
    }

    /**
     * Get availabilityZones
     * @return availabilityZones
     */
    public List<SupabaseSpecFlavorInfoAvailabilityZones> getAvailabilityZones() {
        return availabilityZones;
    }

    public void setAvailabilityZones(List<SupabaseSpecFlavorInfoAvailabilityZones> availabilityZones) {
        this.availabilityZones = availabilityZones;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SupabaseSpecFlavorInfo that = (SupabaseSpecFlavorInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.mode, that.mode)
            && Objects.equals(this.version, that.version) && Objects.equals(this.vcpus, that.vcpus)
            && Objects.equals(this.ram, that.ram) && Objects.equals(this.specCode, that.specCode)
            && Objects.equals(this.groupType, that.groupType)
            && Objects.equals(this.availabilityZones, that.availabilityZones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mode, version, vcpus, ram, specCode, groupType, availabilityZones);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SupabaseSpecFlavorInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    vcpus: ").append(toIndentedString(vcpus)).append("\n");
        sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
        sb.append("    availabilityZones: ").append(toIndentedString(availabilityZones)).append("\n");
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
