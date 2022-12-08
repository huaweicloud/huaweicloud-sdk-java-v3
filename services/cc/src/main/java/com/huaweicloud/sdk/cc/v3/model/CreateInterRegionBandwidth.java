package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建域间带宽的详情信息。
 */
public class CreateInterRegionBandwidth {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_connection_id")

    private String cloudConnectionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_package_id")

    private String bandwidthPackageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private Integer bandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inter_region_ids")

    private List<String> interRegionIds = null;

    public CreateInterRegionBandwidth withCloudConnectionId(String cloudConnectionId) {
        this.cloudConnectionId = cloudConnectionId;
        return this;
    }

    /**
     * 云连接实例ID。
     * @return cloudConnectionId
     */
    public String getCloudConnectionId() {
        return cloudConnectionId;
    }

    public void setCloudConnectionId(String cloudConnectionId) {
        this.cloudConnectionId = cloudConnectionId;
    }

    public CreateInterRegionBandwidth withBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
        return this;
    }

    /**
     * 带宽包实例ID。
     * @return bandwidthPackageId
     */
    public String getBandwidthPackageId() {
        return bandwidthPackageId;
    }

    public void setBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
    }

    public CreateInterRegionBandwidth withBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * 域间带宽值。
     * minimum: 1
     * maximum: 999999
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public CreateInterRegionBandwidth withInterRegionIds(List<String> interRegionIds) {
        this.interRegionIds = interRegionIds;
        return this;
    }

    public CreateInterRegionBandwidth addInterRegionIdsItem(String interRegionIdsItem) {
        if (this.interRegionIds == null) {
            this.interRegionIds = new ArrayList<>();
        }
        this.interRegionIds.add(interRegionIdsItem);
        return this;
    }

    public CreateInterRegionBandwidth withInterRegionIds(Consumer<List<String>> interRegionIdsSetter) {
        if (this.interRegionIds == null) {
            this.interRegionIds = new ArrayList<>();
        }
        interRegionIdsSetter.accept(this.interRegionIds);
        return this;
    }

    /**
     * 域间RegionID。
     * @return interRegionIds
     */
    public List<String> getInterRegionIds() {
        return interRegionIds;
    }

    public void setInterRegionIds(List<String> interRegionIds) {
        this.interRegionIds = interRegionIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateInterRegionBandwidth createInterRegionBandwidth = (CreateInterRegionBandwidth) o;
        return Objects.equals(this.cloudConnectionId, createInterRegionBandwidth.cloudConnectionId)
            && Objects.equals(this.bandwidthPackageId, createInterRegionBandwidth.bandwidthPackageId)
            && Objects.equals(this.bandwidth, createInterRegionBandwidth.bandwidth)
            && Objects.equals(this.interRegionIds, createInterRegionBandwidth.interRegionIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cloudConnectionId, bandwidthPackageId, bandwidth, interRegionIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInterRegionBandwidth {\n");
        sb.append("    cloudConnectionId: ").append(toIndentedString(cloudConnectionId)).append("\n");
        sb.append("    bandwidthPackageId: ").append(toIndentedString(bandwidthPackageId)).append("\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
        sb.append("    interRegionIds: ").append(toIndentedString(interRegionIds)).append("\n");
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
