package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Vpc
 */
public class Vpc {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_region")

    private String vpcRegion;

    public Vpc withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 关联VPC的ID。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public Vpc withVpcRegion(String vpcRegion) {
        this.vpcRegion = vpcRegion;
        return this;
    }

    /**
     * 关联VPC所在的region。
     * @return vpcRegion
     */
    public String getVpcRegion() {
        return vpcRegion;
    }

    public void setVpcRegion(String vpcRegion) {
        this.vpcRegion = vpcRegion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Vpc that = (Vpc) obj;
        return Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.vpcRegion, that.vpcRegion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcId, vpcRegion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Vpc {\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    vpcRegion: ").append(toIndentedString(vpcRegion)).append("\n");
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
