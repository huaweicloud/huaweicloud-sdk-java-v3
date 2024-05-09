package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GetArchiveConfigRsp
 */
public class GetArchiveConfigRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_region")

    private Boolean currentRegion;

    public GetArchiveConfigRsp withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 华为云项目
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public GetArchiveConfigRsp withCurrentRegion(Boolean currentRegion) {
        this.currentRegion = currentRegion;
        return this;
    }

    /**
     * 该区域是否是当前设置的归档区域
     * @return currentRegion
     */
    public Boolean getCurrentRegion() {
        return currentRegion;
    }

    public void setCurrentRegion(Boolean currentRegion) {
        this.currentRegion = currentRegion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetArchiveConfigRsp that = (GetArchiveConfigRsp) obj;
        return Objects.equals(this.regionId, that.regionId) && Objects.equals(this.currentRegion, that.currentRegion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionId, currentRegion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetArchiveConfigRsp {\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    currentRegion: ").append(toIndentedString(currentRegion)).append("\n");
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
