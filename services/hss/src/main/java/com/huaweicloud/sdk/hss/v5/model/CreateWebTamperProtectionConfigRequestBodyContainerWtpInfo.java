package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**: 容器网页防篡改相关配置信息 **约束限制**: type值为“container_wtp”容器网页防篡改时有效 **取值范围**: 不涉及 **默认取值**: 不涉及 
 */
public class CreateWebTamperProtectionConfigRequestBodyContainerWtpInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_type")

    private String protectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "web_app_name")

    private String webAppName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_label_list")

    private List<ClusterLabelInfo> clusterLabelList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_image_list")

    private List<ProtectImageInfo> protectImageList = null;

    public CreateWebTamperProtectionConfigRequestBodyContainerWtpInfo withProtectType(String protectType) {
        this.protectType = protectType;
        return this;
    }

    /**
     * **参数解释**: 防护类型 **约束限制**: 不涉及 **取值范围**: - cluster：对集群下的容器进行网页防篡改防护 - host：对主机下的容器进行网页防篡改防护  **默认取值**: 不涉及 
     * @return protectType
     */
    public String getProtectType() {
        return protectType;
    }

    public void setProtectType(String protectType) {
        this.protectType = protectType;
    }

    public CreateWebTamperProtectionConfigRequestBodyContainerWtpInfo withWebAppName(String webAppName) {
        this.webAppName = webAppName;
        return this;
    }

    /**
     * **参数解释**: 网站应用的名称 **约束限制**: 不涉及 **取值范围**: 字符长度1-128位 **默认取值**: 不涉及 
     * @return webAppName
     */
    public String getWebAppName() {
        return webAppName;
    }

    public void setWebAppName(String webAppName) {
        this.webAppName = webAppName;
    }

    public CreateWebTamperProtectionConfigRequestBodyContainerWtpInfo withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * **参数解释**: 集群id **约束限制**: protect_type值为“cluster”时有效 **取值范围**: 字符长度1-64位 **默认取值**: 不涉及 
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public CreateWebTamperProtectionConfigRequestBodyContainerWtpInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * **参数解释**: 主机id **约束限制**: protect_type值为“host”时有效 **取值范围**: 字符长度1-64位 **默认取值**: 不涉及 
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public CreateWebTamperProtectionConfigRequestBodyContainerWtpInfo withClusterLabelList(
        List<ClusterLabelInfo> clusterLabelList) {
        this.clusterLabelList = clusterLabelList;
        return this;
    }

    public CreateWebTamperProtectionConfigRequestBodyContainerWtpInfo addClusterLabelListItem(
        ClusterLabelInfo clusterLabelListItem) {
        if (this.clusterLabelList == null) {
            this.clusterLabelList = new ArrayList<>();
        }
        this.clusterLabelList.add(clusterLabelListItem);
        return this;
    }

    public CreateWebTamperProtectionConfigRequestBodyContainerWtpInfo withClusterLabelList(
        Consumer<List<ClusterLabelInfo>> clusterLabelListSetter) {
        if (this.clusterLabelList == null) {
            this.clusterLabelList = new ArrayList<>();
        }
        clusterLabelListSetter.accept(this.clusterLabelList);
        return this;
    }

    /**
     * **参数解释**: 集群标签列表 **约束限制**: protect_type值为“cluster”时生效 **取值范围**: 最少0条，最多10条 **默认取值**: 不涉及 
     * @return clusterLabelList
     */
    public List<ClusterLabelInfo> getClusterLabelList() {
        return clusterLabelList;
    }

    public void setClusterLabelList(List<ClusterLabelInfo> clusterLabelList) {
        this.clusterLabelList = clusterLabelList;
    }

    public CreateWebTamperProtectionConfigRequestBodyContainerWtpInfo withProtectImageList(
        List<ProtectImageInfo> protectImageList) {
        this.protectImageList = protectImageList;
        return this;
    }

    public CreateWebTamperProtectionConfigRequestBodyContainerWtpInfo addProtectImageListItem(
        ProtectImageInfo protectImageListItem) {
        if (this.protectImageList == null) {
            this.protectImageList = new ArrayList<>();
        }
        this.protectImageList.add(protectImageListItem);
        return this;
    }

    public CreateWebTamperProtectionConfigRequestBodyContainerWtpInfo withProtectImageList(
        Consumer<List<ProtectImageInfo>> protectImageListSetter) {
        if (this.protectImageList == null) {
            this.protectImageList = new ArrayList<>();
        }
        protectImageListSetter.accept(this.protectImageList);
        return this;
    }

    /**
     * **参数解释**: 防护的镜像列表 **约束限制**: 不涉及 **取值范围**: 最少1条，最多10条 **默认取值**: 不涉及 
     * @return protectImageList
     */
    public List<ProtectImageInfo> getProtectImageList() {
        return protectImageList;
    }

    public void setProtectImageList(List<ProtectImageInfo> protectImageList) {
        this.protectImageList = protectImageList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateWebTamperProtectionConfigRequestBodyContainerWtpInfo that =
            (CreateWebTamperProtectionConfigRequestBodyContainerWtpInfo) obj;
        return Objects.equals(this.protectType, that.protectType) && Objects.equals(this.webAppName, that.webAppName)
            && Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.hostId, that.hostId)
            && Objects.equals(this.clusterLabelList, that.clusterLabelList)
            && Objects.equals(this.protectImageList, that.protectImageList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protectType, webAppName, clusterId, hostId, clusterLabelList, protectImageList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateWebTamperProtectionConfigRequestBodyContainerWtpInfo {\n");
        sb.append("    protectType: ").append(toIndentedString(protectType)).append("\n");
        sb.append("    webAppName: ").append(toIndentedString(webAppName)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    clusterLabelList: ").append(toIndentedString(clusterLabelList)).append("\n");
        sb.append("    protectImageList: ").append(toIndentedString(protectImageList)).append("\n");
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
