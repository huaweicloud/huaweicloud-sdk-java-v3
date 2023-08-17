package com.huaweicloud.sdk.ec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * EcnWithErRequest
 */
public class EcnWithErRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "er_id")

    private String erId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_project_id")

    private String regionProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    public EcnWithErRequest withErId(String erId) {
        this.erId = erId;
        return this;
    }

    /**
     * 企业路由器ID
     * @return erId
     */
    public String getErId() {
        return erId;
    }

    public void setErId(String erId) {
        this.erId = erId;
    }

    public EcnWithErRequest withRegionProjectId(String regionProjectId) {
        this.regionProjectId = regionProjectId;
        return this;
    }

    /**
     * 企业路由器区域项目ID
     * @return regionProjectId
     */
    public String getRegionProjectId() {
        return regionProjectId;
    }

    public void setRegionProjectId(String regionProjectId) {
        this.regionProjectId = regionProjectId;
    }

    public EcnWithErRequest withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 区域ID
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EcnWithErRequest that = (EcnWithErRequest) obj;
        return Objects.equals(this.erId, that.erId) && Objects.equals(this.regionProjectId, that.regionProjectId)
            && Objects.equals(this.regionId, that.regionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(erId, regionProjectId, regionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EcnWithErRequest {\n");
        sb.append("    erId: ").append(toIndentedString(erId)).append("\n");
        sb.append("    regionProjectId: ").append(toIndentedString(regionProjectId)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
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
