package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * VPC通道详情。如果vpc_channel_status &#x3D; 1，则这个object类型为必填信息
 */
public class VpcInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ecs_id")

    private String ecsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ecs_name")

    private String ecsName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cascade_flag")

    private Boolean cascadeFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_channel_proxy_host")

    private String vpcChannelProxyHost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_channel_id")

    private String vpcChannelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_channel_port")

    private Integer vpcChannelPort;

    public VpcInfo withEcsId(String ecsId) {
        this.ecsId = ecsId;
        return this;
    }

    /**
     * 云服务器ID
     * @return ecsId
     */
    public String getEcsId() {
        return ecsId;
    }

    public void setEcsId(String ecsId) {
        this.ecsId = ecsId;
    }

    public VpcInfo withEcsName(String ecsName) {
        this.ecsName = ecsName;
        return this;
    }

    /**
     * 云服务器名称
     * @return ecsName
     */
    public String getEcsName() {
        return ecsName;
    }

    public void setEcsName(String ecsName) {
        this.ecsName = ecsName;
    }

    public VpcInfo withCascadeFlag(Boolean cascadeFlag) {
        this.cascadeFlag = cascadeFlag;
        return this;
    }

    /**
     * 是否使用级联方式  暂不支持
     * @return cascadeFlag
     */
    public Boolean getCascadeFlag() {
        return cascadeFlag;
    }

    public void setCascadeFlag(Boolean cascadeFlag) {
        this.cascadeFlag = cascadeFlag;
    }

    public VpcInfo withVpcChannelProxyHost(String vpcChannelProxyHost) {
        this.vpcChannelProxyHost = vpcChannelProxyHost;
        return this;
    }

    /**
     * 代理主机
     * @return vpcChannelProxyHost
     */
    public String getVpcChannelProxyHost() {
        return vpcChannelProxyHost;
    }

    public void setVpcChannelProxyHost(String vpcChannelProxyHost) {
        this.vpcChannelProxyHost = vpcChannelProxyHost;
    }

    public VpcInfo withVpcChannelId(String vpcChannelId) {
        this.vpcChannelId = vpcChannelId;
        return this;
    }

    /**
     * VPC通道编号
     * @return vpcChannelId
     */
    public String getVpcChannelId() {
        return vpcChannelId;
    }

    public void setVpcChannelId(String vpcChannelId) {
        this.vpcChannelId = vpcChannelId;
    }

    public VpcInfo withVpcChannelPort(Integer vpcChannelPort) {
        this.vpcChannelPort = vpcChannelPort;
        return this;
    }

    /**
     * VPC通道端口
     * @return vpcChannelPort
     */
    public Integer getVpcChannelPort() {
        return vpcChannelPort;
    }

    public void setVpcChannelPort(Integer vpcChannelPort) {
        this.vpcChannelPort = vpcChannelPort;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VpcInfo that = (VpcInfo) obj;
        return Objects.equals(this.ecsId, that.ecsId) && Objects.equals(this.ecsName, that.ecsName)
            && Objects.equals(this.cascadeFlag, that.cascadeFlag)
            && Objects.equals(this.vpcChannelProxyHost, that.vpcChannelProxyHost)
            && Objects.equals(this.vpcChannelId, that.vpcChannelId)
            && Objects.equals(this.vpcChannelPort, that.vpcChannelPort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ecsId, ecsName, cascadeFlag, vpcChannelProxyHost, vpcChannelId, vpcChannelPort);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VpcInfo {\n");
        sb.append("    ecsId: ").append(toIndentedString(ecsId)).append("\n");
        sb.append("    ecsName: ").append(toIndentedString(ecsName)).append("\n");
        sb.append("    cascadeFlag: ").append(toIndentedString(cascadeFlag)).append("\n");
        sb.append("    vpcChannelProxyHost: ").append(toIndentedString(vpcChannelProxyHost)).append("\n");
        sb.append("    vpcChannelId: ").append(toIndentedString(vpcChannelId)).append("\n");
        sb.append("    vpcChannelPort: ").append(toIndentedString(vpcChannelPort)).append("\n");
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
