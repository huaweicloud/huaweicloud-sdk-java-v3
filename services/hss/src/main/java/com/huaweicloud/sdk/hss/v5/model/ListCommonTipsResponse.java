package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListCommonTipsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private CommonList hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private CommonList hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private CommonList publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip")

    private CommonList privateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private CommonList vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private CommonList clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_tags")

    private HostTagInfoList hostTags;

    public ListCommonTipsResponse withHostName(CommonList hostName) {
        this.hostName = hostName;
        return this;
    }

    public ListCommonTipsResponse withHostName(Consumer<CommonList> hostNameSetter) {
        if (this.hostName == null) {
            this.hostName = new CommonList();
            hostNameSetter.accept(this.hostName);
        }

        return this;
    }

    /**
     * Get hostName
     * @return hostName
     */
    public CommonList getHostName() {
        return hostName;
    }

    public void setHostName(CommonList hostName) {
        this.hostName = hostName;
    }

    public ListCommonTipsResponse withHostId(CommonList hostId) {
        this.hostId = hostId;
        return this;
    }

    public ListCommonTipsResponse withHostId(Consumer<CommonList> hostIdSetter) {
        if (this.hostId == null) {
            this.hostId = new CommonList();
            hostIdSetter.accept(this.hostId);
        }

        return this;
    }

    /**
     * Get hostId
     * @return hostId
     */
    public CommonList getHostId() {
        return hostId;
    }

    public void setHostId(CommonList hostId) {
        this.hostId = hostId;
    }

    public ListCommonTipsResponse withPublicIp(CommonList publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    public ListCommonTipsResponse withPublicIp(Consumer<CommonList> publicIpSetter) {
        if (this.publicIp == null) {
            this.publicIp = new CommonList();
            publicIpSetter.accept(this.publicIp);
        }

        return this;
    }

    /**
     * Get publicIp
     * @return publicIp
     */
    public CommonList getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(CommonList publicIp) {
        this.publicIp = publicIp;
    }

    public ListCommonTipsResponse withPrivateIp(CommonList privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    public ListCommonTipsResponse withPrivateIp(Consumer<CommonList> privateIpSetter) {
        if (this.privateIp == null) {
            this.privateIp = new CommonList();
            privateIpSetter.accept(this.privateIp);
        }

        return this;
    }

    /**
     * Get privateIp
     * @return privateIp
     */
    public CommonList getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(CommonList privateIp) {
        this.privateIp = privateIp;
    }

    public ListCommonTipsResponse withVpcId(CommonList vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public ListCommonTipsResponse withVpcId(Consumer<CommonList> vpcIdSetter) {
        if (this.vpcId == null) {
            this.vpcId = new CommonList();
            vpcIdSetter.accept(this.vpcId);
        }

        return this;
    }

    /**
     * Get vpcId
     * @return vpcId
     */
    public CommonList getVpcId() {
        return vpcId;
    }

    public void setVpcId(CommonList vpcId) {
        this.vpcId = vpcId;
    }

    public ListCommonTipsResponse withClusterId(CommonList clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    public ListCommonTipsResponse withClusterId(Consumer<CommonList> clusterIdSetter) {
        if (this.clusterId == null) {
            this.clusterId = new CommonList();
            clusterIdSetter.accept(this.clusterId);
        }

        return this;
    }

    /**
     * Get clusterId
     * @return clusterId
     */
    public CommonList getClusterId() {
        return clusterId;
    }

    public void setClusterId(CommonList clusterId) {
        this.clusterId = clusterId;
    }

    public ListCommonTipsResponse withHostTags(HostTagInfoList hostTags) {
        this.hostTags = hostTags;
        return this;
    }

    public ListCommonTipsResponse withHostTags(Consumer<HostTagInfoList> hostTagsSetter) {
        if (this.hostTags == null) {
            this.hostTags = new HostTagInfoList();
            hostTagsSetter.accept(this.hostTags);
        }

        return this;
    }

    /**
     * Get hostTags
     * @return hostTags
     */
    public HostTagInfoList getHostTags() {
        return hostTags;
    }

    public void setHostTags(HostTagInfoList hostTags) {
        this.hostTags = hostTags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCommonTipsResponse that = (ListCommonTipsResponse) obj;
        return Objects.equals(this.hostName, that.hostName) && Objects.equals(this.hostId, that.hostId)
            && Objects.equals(this.publicIp, that.publicIp) && Objects.equals(this.privateIp, that.privateIp)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.hostTags, that.hostTags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostName, hostId, publicIp, privateIp, vpcId, clusterId, hostTags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCommonTipsResponse {\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    hostTags: ").append(toIndentedString(hostTags)).append("\n");
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
