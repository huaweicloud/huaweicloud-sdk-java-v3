package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**: 容器网页防篡改信息 **取值范围**: 不涉及 
 */
public class WebTamperProtectionConfigResponseInfoContainerWtpInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "web_app_name")

    private String webAppName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_version")

    private String imageVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_type")

    private String imageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_type")

    private String protectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_info")

    private WebTamperProtectionConfigResponseInfoContainerWtpInfoClusterInfo clusterInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_label_list")

    private List<WebTamperProtectionConfigResponseInfoContainerWtpInfoClusterLabelList> clusterLabelList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_info")

    private WebTamperProtectionConfigResponseInfoContainerWtpInfoHostInfo hostInfo;

    public WebTamperProtectionConfigResponseInfoContainerWtpInfo withWebAppName(String webAppName) {
        this.webAppName = webAppName;
        return this;
    }

    /**
     * **参数解释**： 网站应用名称 **取值范围**： 字符长度1-128位 
     * @return webAppName
     */
    public String getWebAppName() {
        return webAppName;
    }

    public void setWebAppName(String webAppName) {
        this.webAppName = webAppName;
    }

    public WebTamperProtectionConfigResponseInfoContainerWtpInfo withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * **参数解释**： 镜像名称 **取值范围**： 字符长度1-512位 
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public WebTamperProtectionConfigResponseInfoContainerWtpInfo withImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
        return this;
    }

    /**
     * **参数解释**： 镜像版本 **取值范围**： 字符长度1-64位 
     * @return imageVersion
     */
    public String getImageVersion() {
        return imageVersion;
    }

    public void setImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
    }

    public WebTamperProtectionConfigResponseInfoContainerWtpInfo withImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * **参数解释**： 镜像类型 **取值范围**： - registry 仓库镜像 - local 本地镜像 - custom 自定义镜像 
     * @return imageType
     */
    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public WebTamperProtectionConfigResponseInfoContainerWtpInfo withProtectType(String protectType) {
        this.protectType = protectType;
        return this;
    }

    /**
     * **参数解释**: 防护类型 **取值范围**: - cluster：对集群下的容器进行网页防篡改防护 - host：对主机下的容器进行网页防篡改防护 
     * @return protectType
     */
    public String getProtectType() {
        return protectType;
    }

    public void setProtectType(String protectType) {
        this.protectType = protectType;
    }

    public WebTamperProtectionConfigResponseInfoContainerWtpInfo withClusterInfo(
        WebTamperProtectionConfigResponseInfoContainerWtpInfoClusterInfo clusterInfo) {
        this.clusterInfo = clusterInfo;
        return this;
    }

    public WebTamperProtectionConfigResponseInfoContainerWtpInfo withClusterInfo(
        Consumer<WebTamperProtectionConfigResponseInfoContainerWtpInfoClusterInfo> clusterInfoSetter) {
        if (this.clusterInfo == null) {
            this.clusterInfo = new WebTamperProtectionConfigResponseInfoContainerWtpInfoClusterInfo();
            clusterInfoSetter.accept(this.clusterInfo);
        }

        return this;
    }

    /**
     * Get clusterInfo
     * @return clusterInfo
     */
    public WebTamperProtectionConfigResponseInfoContainerWtpInfoClusterInfo getClusterInfo() {
        return clusterInfo;
    }

    public void setClusterInfo(WebTamperProtectionConfigResponseInfoContainerWtpInfoClusterInfo clusterInfo) {
        this.clusterInfo = clusterInfo;
    }

    public WebTamperProtectionConfigResponseInfoContainerWtpInfo withClusterLabelList(
        List<WebTamperProtectionConfigResponseInfoContainerWtpInfoClusterLabelList> clusterLabelList) {
        this.clusterLabelList = clusterLabelList;
        return this;
    }

    public WebTamperProtectionConfigResponseInfoContainerWtpInfo addClusterLabelListItem(
        WebTamperProtectionConfigResponseInfoContainerWtpInfoClusterLabelList clusterLabelListItem) {
        if (this.clusterLabelList == null) {
            this.clusterLabelList = new ArrayList<>();
        }
        this.clusterLabelList.add(clusterLabelListItem);
        return this;
    }

    public WebTamperProtectionConfigResponseInfoContainerWtpInfo withClusterLabelList(
        Consumer<List<WebTamperProtectionConfigResponseInfoContainerWtpInfoClusterLabelList>> clusterLabelListSetter) {
        if (this.clusterLabelList == null) {
            this.clusterLabelList = new ArrayList<>();
        }
        clusterLabelListSetter.accept(this.clusterLabelList);
        return this;
    }

    /**
     * **参数解释**: 集群标签列表 **取值范围**: 最少0条，最多10条 
     * @return clusterLabelList
     */
    public List<WebTamperProtectionConfigResponseInfoContainerWtpInfoClusterLabelList> getClusterLabelList() {
        return clusterLabelList;
    }

    public void setClusterLabelList(
        List<WebTamperProtectionConfigResponseInfoContainerWtpInfoClusterLabelList> clusterLabelList) {
        this.clusterLabelList = clusterLabelList;
    }

    public WebTamperProtectionConfigResponseInfoContainerWtpInfo withHostInfo(
        WebTamperProtectionConfigResponseInfoContainerWtpInfoHostInfo hostInfo) {
        this.hostInfo = hostInfo;
        return this;
    }

    public WebTamperProtectionConfigResponseInfoContainerWtpInfo withHostInfo(
        Consumer<WebTamperProtectionConfigResponseInfoContainerWtpInfoHostInfo> hostInfoSetter) {
        if (this.hostInfo == null) {
            this.hostInfo = new WebTamperProtectionConfigResponseInfoContainerWtpInfoHostInfo();
            hostInfoSetter.accept(this.hostInfo);
        }

        return this;
    }

    /**
     * Get hostInfo
     * @return hostInfo
     */
    public WebTamperProtectionConfigResponseInfoContainerWtpInfoHostInfo getHostInfo() {
        return hostInfo;
    }

    public void setHostInfo(WebTamperProtectionConfigResponseInfoContainerWtpInfoHostInfo hostInfo) {
        this.hostInfo = hostInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WebTamperProtectionConfigResponseInfoContainerWtpInfo that =
            (WebTamperProtectionConfigResponseInfoContainerWtpInfo) obj;
        return Objects.equals(this.webAppName, that.webAppName) && Objects.equals(this.imageName, that.imageName)
            && Objects.equals(this.imageVersion, that.imageVersion) && Objects.equals(this.imageType, that.imageType)
            && Objects.equals(this.protectType, that.protectType) && Objects.equals(this.clusterInfo, that.clusterInfo)
            && Objects.equals(this.clusterLabelList, that.clusterLabelList)
            && Objects.equals(this.hostInfo, that.hostInfo);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(webAppName, imageName, imageVersion, imageType, protectType, clusterInfo, clusterLabelList, hostInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebTamperProtectionConfigResponseInfoContainerWtpInfo {\n");
        sb.append("    webAppName: ").append(toIndentedString(webAppName)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    imageVersion: ").append(toIndentedString(imageVersion)).append("\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
        sb.append("    protectType: ").append(toIndentedString(protectType)).append("\n");
        sb.append("    clusterInfo: ").append(toIndentedString(clusterInfo)).append("\n");
        sb.append("    clusterLabelList: ").append(toIndentedString(clusterLabelList)).append("\n");
        sb.append("    hostInfo: ").append(toIndentedString(hostInfo)).append("\n");
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
