package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AreaBandwidthPackageSpecification
 */
public class AreaBandwidthPackageSpecification {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_area_id")

    private AreaIdDef localAreaId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_area_id")

    private AreaIdDef remoteAreaId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_codes")

    private List<SpecificationCodeInfo> specCodes = null;

    public AreaBandwidthPackageSpecification withLocalAreaId(AreaIdDef localAreaId) {
        this.localAreaId = localAreaId;
        return this;
    }

    /**
     * Get localAreaId
     * @return localAreaId
     */
    public AreaIdDef getLocalAreaId() {
        return localAreaId;
    }

    public void setLocalAreaId(AreaIdDef localAreaId) {
        this.localAreaId = localAreaId;
    }

    public AreaBandwidthPackageSpecification withRemoteAreaId(AreaIdDef remoteAreaId) {
        this.remoteAreaId = remoteAreaId;
        return this;
    }

    /**
     * Get remoteAreaId
     * @return remoteAreaId
     */
    public AreaIdDef getRemoteAreaId() {
        return remoteAreaId;
    }

    public void setRemoteAreaId(AreaIdDef remoteAreaId) {
        this.remoteAreaId = remoteAreaId;
    }

    public AreaBandwidthPackageSpecification withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 互通大区带宽包的规格ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AreaBandwidthPackageSpecification withSpecCodes(List<SpecificationCodeInfo> specCodes) {
        this.specCodes = specCodes;
        return this;
    }

    public AreaBandwidthPackageSpecification addSpecCodesItem(SpecificationCodeInfo specCodesItem) {
        if (this.specCodes == null) {
            this.specCodes = new ArrayList<>();
        }
        this.specCodes.add(specCodesItem);
        return this;
    }

    public AreaBandwidthPackageSpecification withSpecCodes(Consumer<List<SpecificationCodeInfo>> specCodesSetter) {
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
        AreaBandwidthPackageSpecification that = (AreaBandwidthPackageSpecification) obj;
        return Objects.equals(this.localAreaId, that.localAreaId)
            && Objects.equals(this.remoteAreaId, that.remoteAreaId) && Objects.equals(this.id, that.id)
            && Objects.equals(this.specCodes, that.specCodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(localAreaId, remoteAreaId, id, specCodes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AreaBandwidthPackageSpecification {\n");
        sb.append("    localAreaId: ").append(toIndentedString(localAreaId)).append("\n");
        sb.append("    remoteAreaId: ").append(toIndentedString(remoteAreaId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
