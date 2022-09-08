package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowCloudPhoneServerDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "servers")

    private List<Object> servers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "band_widths")

    private List<Object> bandWidths = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumes")

    private List<Object> volumes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_groups")

    private List<String> securityGroups = null;

    public ShowCloudPhoneServerDetailResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求的唯一标识ID
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ShowCloudPhoneServerDetailResponse withServers(List<Object> servers) {
        this.servers = servers;
        return this;
    }

    public ShowCloudPhoneServerDetailResponse addServersItem(Object serversItem) {
        if (this.servers == null) {
            this.servers = new ArrayList<>();
        }
        this.servers.add(serversItem);
        return this;
    }

    public ShowCloudPhoneServerDetailResponse withServers(Consumer<List<Object>> serversSetter) {
        if (this.servers == null) {
            this.servers = new ArrayList<>();
        }
        serversSetter.accept(this.servers);
        return this;
    }

    /**
     * 云手机服务器信息
     * @return servers
     */
    public List<Object> getServers() {
        return servers;
    }

    public void setServers(List<Object> servers) {
        this.servers = servers;
    }

    public ShowCloudPhoneServerDetailResponse withBandWidths(List<Object> bandWidths) {
        this.bandWidths = bandWidths;
        return this;
    }

    public ShowCloudPhoneServerDetailResponse addBandWidthsItem(Object bandWidthsItem) {
        if (this.bandWidths == null) {
            this.bandWidths = new ArrayList<>();
        }
        this.bandWidths.add(bandWidthsItem);
        return this;
    }

    public ShowCloudPhoneServerDetailResponse withBandWidths(Consumer<List<Object>> bandWidthsSetter) {
        if (this.bandWidths == null) {
            this.bandWidths = new ArrayList<>();
        }
        bandWidthsSetter.accept(this.bandWidths);
        return this;
    }

    /**
     * 云手机服务器带宽信息的结构体数组
     * @return bandWidths
     */
    public List<Object> getBandWidths() {
        return bandWidths;
    }

    public void setBandWidths(List<Object> bandWidths) {
        this.bandWidths = bandWidths;
    }

    public ShowCloudPhoneServerDetailResponse withVolumes(List<Object> volumes) {
        this.volumes = volumes;
        return this;
    }

    public ShowCloudPhoneServerDetailResponse addVolumesItem(Object volumesItem) {
        if (this.volumes == null) {
            this.volumes = new ArrayList<>();
        }
        this.volumes.add(volumesItem);
        return this;
    }

    public ShowCloudPhoneServerDetailResponse withVolumes(Consumer<List<Object>> volumesSetter) {
        if (this.volumes == null) {
            this.volumes = new ArrayList<>();
        }
        volumesSetter.accept(this.volumes);
        return this;
    }

    /**
     * 云手机服务器卷信息的结构体数组
     * @return volumes
     */
    public List<Object> getVolumes() {
        return volumes;
    }

    public void setVolumes(List<Object> volumes) {
        this.volumes = volumes;
    }

    public ShowCloudPhoneServerDetailResponse withSecurityGroups(List<String> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    public ShowCloudPhoneServerDetailResponse addSecurityGroupsItem(String securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public ShowCloudPhoneServerDetailResponse withSecurityGroups(Consumer<List<String>> securityGroupsSetter) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /**
     * 服务器扩展网卡绑定的安全组信息 系统定义网络的服务器，该字段返回为空列表
     * @return securityGroups
     */
    public List<String> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<String> securityGroups) {
        this.securityGroups = securityGroups;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowCloudPhoneServerDetailResponse showCloudPhoneServerDetailResponse = (ShowCloudPhoneServerDetailResponse) o;
        return Objects.equals(this.requestId, showCloudPhoneServerDetailResponse.requestId)
            && Objects.equals(this.servers, showCloudPhoneServerDetailResponse.servers)
            && Objects.equals(this.bandWidths, showCloudPhoneServerDetailResponse.bandWidths)
            && Objects.equals(this.volumes, showCloudPhoneServerDetailResponse.volumes)
            && Objects.equals(this.securityGroups, showCloudPhoneServerDetailResponse.securityGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, servers, bandWidths, volumes, securityGroups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCloudPhoneServerDetailResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
        sb.append("    bandWidths: ").append(toIndentedString(bandWidths)).append("\n");
        sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
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
