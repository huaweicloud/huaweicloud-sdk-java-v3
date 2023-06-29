package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class CheckNetAclRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "t_project_id")

    private String tProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "t_network_id")

    private String tNetworkId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    public CheckNetAclRequest withTProjectId(String tProjectId) {
        this.tProjectId = tProjectId;
        return this;
    }

    /**
     * 目的虚拟机所属project_id
     * @return tProjectId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "t_project_id")
    public String getTProjectId() {
        return tProjectId;
    }

    public void setTProjectId(String tProjectId) {
        this.tProjectId = tProjectId;
    }

    public CheckNetAclRequest withTNetworkId(String tNetworkId) {
        this.tNetworkId = tNetworkId;
        return this;
    }

    /**
     * 目的端子网ID
     * @return tNetworkId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "t_network_id")
    public String getTNetworkId() {
        return tNetworkId;
    }

    public void setTNetworkId(String tNetworkId) {
        this.tNetworkId = tNetworkId;
    }

    public CheckNetAclRequest withRegionId(String regionId) {
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

    public CheckNetAclRequest withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * 操作系统类型
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckNetAclRequest that = (CheckNetAclRequest) obj;
        return Objects.equals(this.tProjectId, that.tProjectId) && Objects.equals(this.tNetworkId, that.tNetworkId)
            && Objects.equals(this.regionId, that.regionId) && Objects.equals(this.osType, that.osType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tProjectId, tNetworkId, regionId, osType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckNetAclRequest {\n");
        sb.append("    tProjectId: ").append(toIndentedString(tProjectId)).append("\n");
        sb.append("    tNetworkId: ").append(toIndentedString(tNetworkId)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
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
