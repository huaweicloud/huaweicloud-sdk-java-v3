package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PoolSpecModelResources
 */
public class PoolSpecModelResources {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private String flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxCount")

    private Integer maxCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "azs")

    private List<PoolNodeAz> azs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extendParams")

    private PoolSpecModelExtendParams extendParams;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os")

    private Os os;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataVolumes")

    private PoolSpecModelDataVolumes dataVolumes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumeGroupConfigs")

    private PoolSpecModelVolumeGroupConfigs volumeGroupConfigs;

    public PoolSpecModelResources withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * **参数解释**：资源规格ID。 **取值范围**：不涉及。
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public PoolSpecModelResources withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**：资源池中资源规格实例数量。 **取值范围**：不涉及。
     * minimum: 1
     * maximum: 2000
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public PoolSpecModelResources withMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
        return this;
    }

    /**
     * **参数解释**：资源规格的弹性资源量。物理池中该值和count必须一致。 **取值范围**：不涉及。
     * @return maxCount
     */
    public Integer getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
    }

    public PoolSpecModelResources withAzs(List<PoolNodeAz> azs) {
        this.azs = azs;
        return this;
    }

    public PoolSpecModelResources addAzsItem(PoolNodeAz azsItem) {
        if (this.azs == null) {
            this.azs = new ArrayList<>();
        }
        this.azs.add(azsItem);
        return this;
    }

    public PoolSpecModelResources withAzs(Consumer<List<PoolNodeAz>> azsSetter) {
        if (this.azs == null) {
            this.azs = new ArrayList<>();
        }
        azsSetter.accept(this.azs);
        return this;
    }

    /**
     * **参数解释**：资源池中期望创建的资源规格实例的az分布。
     * @return azs
     */
    public List<PoolNodeAz> getAzs() {
        return azs;
    }

    public void setAzs(List<PoolNodeAz> azs) {
        this.azs = azs;
    }

    public PoolSpecModelResources withExtendParams(PoolSpecModelExtendParams extendParams) {
        this.extendParams = extendParams;
        return this;
    }

    public PoolSpecModelResources withExtendParams(Consumer<PoolSpecModelExtendParams> extendParamsSetter) {
        if (this.extendParams == null) {
            this.extendParams = new PoolSpecModelExtendParams();
            extendParamsSetter.accept(this.extendParams);
        }

        return this;
    }

    /**
     * Get extendParams
     * @return extendParams
     */
    public PoolSpecModelExtendParams getExtendParams() {
        return extendParams;
    }

    public void setExtendParams(PoolSpecModelExtendParams extendParams) {
        this.extendParams = extendParams;
    }

    public PoolSpecModelResources withOs(Os os) {
        this.os = os;
        return this;
    }

    public PoolSpecModelResources withOs(Consumer<Os> osSetter) {
        if (this.os == null) {
            this.os = new Os();
            osSetter.accept(this.os);
        }

        return this;
    }

    /**
     * Get os
     * @return os
     */
    public Os getOs() {
        return os;
    }

    public void setOs(Os os) {
        this.os = os;
    }

    public PoolSpecModelResources withDataVolumes(PoolSpecModelDataVolumes dataVolumes) {
        this.dataVolumes = dataVolumes;
        return this;
    }

    public PoolSpecModelResources withDataVolumes(Consumer<PoolSpecModelDataVolumes> dataVolumesSetter) {
        if (this.dataVolumes == null) {
            this.dataVolumes = new PoolSpecModelDataVolumes();
            dataVolumesSetter.accept(this.dataVolumes);
        }

        return this;
    }

    /**
     * Get dataVolumes
     * @return dataVolumes
     */
    public PoolSpecModelDataVolumes getDataVolumes() {
        return dataVolumes;
    }

    public void setDataVolumes(PoolSpecModelDataVolumes dataVolumes) {
        this.dataVolumes = dataVolumes;
    }

    public PoolSpecModelResources withVolumeGroupConfigs(PoolSpecModelVolumeGroupConfigs volumeGroupConfigs) {
        this.volumeGroupConfigs = volumeGroupConfigs;
        return this;
    }

    public PoolSpecModelResources withVolumeGroupConfigs(
        Consumer<PoolSpecModelVolumeGroupConfigs> volumeGroupConfigsSetter) {
        if (this.volumeGroupConfigs == null) {
            this.volumeGroupConfigs = new PoolSpecModelVolumeGroupConfigs();
            volumeGroupConfigsSetter.accept(this.volumeGroupConfigs);
        }

        return this;
    }

    /**
     * Get volumeGroupConfigs
     * @return volumeGroupConfigs
     */
    public PoolSpecModelVolumeGroupConfigs getVolumeGroupConfigs() {
        return volumeGroupConfigs;
    }

    public void setVolumeGroupConfigs(PoolSpecModelVolumeGroupConfigs volumeGroupConfigs) {
        this.volumeGroupConfigs = volumeGroupConfigs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoolSpecModelResources that = (PoolSpecModelResources) obj;
        return Objects.equals(this.flavor, that.flavor) && Objects.equals(this.count, that.count)
            && Objects.equals(this.maxCount, that.maxCount) && Objects.equals(this.azs, that.azs)
            && Objects.equals(this.extendParams, that.extendParams) && Objects.equals(this.os, that.os)
            && Objects.equals(this.dataVolumes, that.dataVolumes)
            && Objects.equals(this.volumeGroupConfigs, that.volumeGroupConfigs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor, count, maxCount, azs, extendParams, os, dataVolumes, volumeGroupConfigs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoolSpecModelResources {\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    maxCount: ").append(toIndentedString(maxCount)).append("\n");
        sb.append("    azs: ").append(toIndentedString(azs)).append("\n");
        sb.append("    extendParams: ").append(toIndentedString(extendParams)).append("\n");
        sb.append("    os: ").append(toIndentedString(os)).append("\n");
        sb.append("    dataVolumes: ").append(toIndentedString(dataVolumes)).append("\n");
        sb.append("    volumeGroupConfigs: ").append(toIndentedString(volumeGroupConfigs)).append("\n");
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
