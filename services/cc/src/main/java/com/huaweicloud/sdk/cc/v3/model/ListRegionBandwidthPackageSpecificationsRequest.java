package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListRegionBandwidthPackageSpecificationsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_region_id")

    private String localRegionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_region_id")

    private String remoteRegionId;

    public ListRegionBandwidthPackageSpecificationsRequest withLocalRegionId(String localRegionId) {
        this.localRegionId = localRegionId;
        return this;
    }

    /**
     * 根据城域带宽包本端区域ID过滤租户城域带宽配置列表
     * @return localRegionId
     */
    public String getLocalRegionId() {
        return localRegionId;
    }

    public void setLocalRegionId(String localRegionId) {
        this.localRegionId = localRegionId;
    }

    public ListRegionBandwidthPackageSpecificationsRequest withRemoteRegionId(String remoteRegionId) {
        this.remoteRegionId = remoteRegionId;
        return this;
    }

    /**
     * 根据城域带宽包对端区域ID过滤租户城域带宽配置列表
     * @return remoteRegionId
     */
    public String getRemoteRegionId() {
        return remoteRegionId;
    }

    public void setRemoteRegionId(String remoteRegionId) {
        this.remoteRegionId = remoteRegionId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRegionBandwidthPackageSpecificationsRequest that = (ListRegionBandwidthPackageSpecificationsRequest) obj;
        return Objects.equals(this.localRegionId, that.localRegionId)
            && Objects.equals(this.remoteRegionId, that.remoteRegionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(localRegionId, remoteRegionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRegionBandwidthPackageSpecificationsRequest {\n");
        sb.append("    localRegionId: ").append(toIndentedString(localRegionId)).append("\n");
        sb.append("    remoteRegionId: ").append(toIndentedString(remoteRegionId)).append("\n");
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
