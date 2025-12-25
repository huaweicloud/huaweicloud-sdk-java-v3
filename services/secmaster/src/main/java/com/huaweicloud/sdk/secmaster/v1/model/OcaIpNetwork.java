package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 线下机房网络信息
 */
public class OcaIpNetwork {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_public")

    private Boolean isPublic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition")

    private String partition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plane")

    private String plane;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vxlan_id")

    private String vxlanId;

    public OcaIpNetwork withIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
        return this;
    }

    /**
     * 外网或内网 true：外网 false: 内网
     * @return isPublic
     */
    public Boolean getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    public OcaIpNetwork withPartition(String partition) {
        this.partition = partition;
        return this;
    }

    /**
     * 网络分区：OM/PSZ/DMZ
     * @return partition
     */
    public String getPartition() {
        return partition;
    }

    public void setPartition(String partition) {
        this.partition = partition;
    }

    public OcaIpNetwork withPlane(String plane) {
        this.plane = plane;
        return this;
    }

    /**
     * 网络平面（线下有自己的代号）
     * @return plane
     */
    public String getPlane() {
        return plane;
    }

    public void setPlane(String plane) {
        this.plane = plane;
    }

    public OcaIpNetwork withVxlanId(String vxlanId) {
        this.vxlanId = vxlanId;
        return this;
    }

    /**
     * 虚拟网络ID
     * @return vxlanId
     */
    public String getVxlanId() {
        return vxlanId;
    }

    public void setVxlanId(String vxlanId) {
        this.vxlanId = vxlanId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OcaIpNetwork that = (OcaIpNetwork) obj;
        return Objects.equals(this.isPublic, that.isPublic) && Objects.equals(this.partition, that.partition)
            && Objects.equals(this.plane, that.plane) && Objects.equals(this.vxlanId, that.vxlanId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isPublic, partition, plane, vxlanId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OcaIpNetwork {\n");
        sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
        sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
        sb.append("    plane: ").append(toIndentedString(plane)).append("\n");
        sb.append("    vxlanId: ").append(toIndentedString(vxlanId)).append("\n");
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
