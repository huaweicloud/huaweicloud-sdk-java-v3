package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowClusterAccessInfoRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterid")

    private String clusterid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpcendpoint")

    private String vpcendpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    public ShowClusterAccessInfoRequest withClusterid(String clusterid) {
        this.clusterid = clusterid;
        return this;
    }

    /**
     * 集群ID
     * @return clusterid
     */
    public String getClusterid() {
        return clusterid;
    }

    public void setClusterid(String clusterid) {
        this.clusterid = clusterid;
    }

    public ShowClusterAccessInfoRequest withVpcendpoint(String vpcendpoint) {
        this.vpcendpoint = vpcendpoint;
        return this;
    }

    /**
     * VPC终端节点的IP地址。私网接入的集群必填，且必须是打通线下集群的VPC终端节点。  创建VPC终端节点及查询IP地址的方法请参见[创建终端节点](https://support.huaweicloud.com/usermanual-ucs/ucs_01_0336.html#section2)。
     * @return vpcendpoint
     */
    public String getVpcendpoint() {
        return vpcendpoint;
    }

    public void setVpcendpoint(String vpcendpoint) {
        this.vpcendpoint = vpcendpoint;
    }

    public ShowClusterAccessInfoRequest withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 接入region，私网接入的集群必填
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowClusterAccessInfoRequest that = (ShowClusterAccessInfoRequest) obj;
        return Objects.equals(this.clusterid, that.clusterid) && Objects.equals(this.vpcendpoint, that.vpcendpoint)
            && Objects.equals(this.region, that.region);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterid, vpcendpoint, region);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowClusterAccessInfoRequest {\n");
        sb.append("    clusterid: ").append(toIndentedString(clusterid)).append("\n");
        sb.append("    vpcendpoint: ").append(toIndentedString(vpcendpoint)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
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
