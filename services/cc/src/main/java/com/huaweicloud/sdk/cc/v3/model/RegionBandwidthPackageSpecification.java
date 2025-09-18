package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 城域带宽包实例。
 */
public class RegionBandwidthPackageSpecification {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_region_id")

    private String localRegionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_region_id")

    private String remoteRegionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "en_name")

    private String enName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "es_name")

    private String esName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pt_name")

    private String ptName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_codes")

    private List<SpecificationCodeInfo> specCodes = null;

    public RegionBandwidthPackageSpecification withLocalRegionId(String localRegionId) {
        this.localRegionId = localRegionId;
        return this;
    }

    /**
     * RegionID。
     * @return localRegionId
     */
    public String getLocalRegionId() {
        return localRegionId;
    }

    public void setLocalRegionId(String localRegionId) {
        this.localRegionId = localRegionId;
    }

    public RegionBandwidthPackageSpecification withRemoteRegionId(String remoteRegionId) {
        this.remoteRegionId = remoteRegionId;
        return this;
    }

    /**
     * RegionID。
     * @return remoteRegionId
     */
    public String getRemoteRegionId() {
        return remoteRegionId;
    }

    public void setRemoteRegionId(String remoteRegionId) {
        this.remoteRegionId = remoteRegionId;
    }

    public RegionBandwidthPackageSpecification withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 互通区域带宽包的规格ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RegionBandwidthPackageSpecification withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 互通区域带宽包的规格名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RegionBandwidthPackageSpecification withEnName(String enName) {
        this.enName = enName;
        return this;
    }

    /**
     * 互通区域带宽包的规格英文名称。
     * @return enName
     */
    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public RegionBandwidthPackageSpecification withEsName(String esName) {
        this.esName = esName;
        return this;
    }

    /**
     * 互通区域带宽包的规格西语名称。
     * @return esName
     */
    public String getEsName() {
        return esName;
    }

    public void setEsName(String esName) {
        this.esName = esName;
    }

    public RegionBandwidthPackageSpecification withPtName(String ptName) {
        this.ptName = ptName;
        return this;
    }

    /**
     * 互通区域带宽包的规格葡语名称。
     * @return ptName
     */
    public String getPtName() {
        return ptName;
    }

    public void setPtName(String ptName) {
        this.ptName = ptName;
    }

    public RegionBandwidthPackageSpecification withSpecCodes(List<SpecificationCodeInfo> specCodes) {
        this.specCodes = specCodes;
        return this;
    }

    public RegionBandwidthPackageSpecification addSpecCodesItem(SpecificationCodeInfo specCodesItem) {
        if (this.specCodes == null) {
            this.specCodes = new ArrayList<>();
        }
        this.specCodes.add(specCodesItem);
        return this;
    }

    public RegionBandwidthPackageSpecification withSpecCodes(Consumer<List<SpecificationCodeInfo>> specCodesSetter) {
        if (this.specCodes == null) {
            this.specCodes = new ArrayList<>();
        }
        specCodesSetter.accept(this.specCodes);
        return this;
    }

    /**
     * 带宽包产品规格列表。
     * @return specCodes
     */
    public List<SpecificationCodeInfo> getSpecCodes() {
        return specCodes;
    }

    public void setSpecCodes(List<SpecificationCodeInfo> specCodes) {
        this.specCodes = specCodes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RegionBandwidthPackageSpecification that = (RegionBandwidthPackageSpecification) obj;
        return Objects.equals(this.localRegionId, that.localRegionId)
            && Objects.equals(this.remoteRegionId, that.remoteRegionId) && Objects.equals(this.id, that.id)
            && Objects.equals(this.name, that.name) && Objects.equals(this.enName, that.enName)
            && Objects.equals(this.esName, that.esName) && Objects.equals(this.ptName, that.ptName)
            && Objects.equals(this.specCodes, that.specCodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(localRegionId, remoteRegionId, id, name, enName, esName, ptName, specCodes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RegionBandwidthPackageSpecification {\n");
        sb.append("    localRegionId: ").append(toIndentedString(localRegionId)).append("\n");
        sb.append("    remoteRegionId: ").append(toIndentedString(remoteRegionId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    enName: ").append(toIndentedString(enName)).append("\n");
        sb.append("    esName: ").append(toIndentedString(esName)).append("\n");
        sb.append("    ptName: ").append(toIndentedString(ptName)).append("\n");
        sb.append("    specCodes: ").append(toIndentedString(specCodes)).append("\n");
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
