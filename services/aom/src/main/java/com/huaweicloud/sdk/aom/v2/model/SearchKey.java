package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 日志过滤条件集合，不同日志来源所需字段不同。
 */
public class SearchKey {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "appName")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterId")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hostIP")

    private String hostIP;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nameSpace")

    private String nameSpace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pathFile")

    private String pathFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "podName")

    private String podName;

    public SearchKey withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * 应用名称。
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public SearchKey withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * CCE集群ID。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public SearchKey withHostIP(String hostIP) {
        this.hostIP = hostIP;
        return this;
    }

    /**
     * 日志所在虚拟机IP。
     * @return hostIP
     */
    public String getHostIP() {
        return hostIP;
    }

    public void setHostIP(String hostIP) {
        this.hostIP = hostIP;
    }

    public SearchKey withNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
        return this;
    }

    /**
     * CCE容器集群的命名空间。
     * @return nameSpace
     */
    public String getNameSpace() {
        return nameSpace;
    }

    public void setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
    }

    public SearchKey withPathFile(String pathFile) {
        this.pathFile = pathFile;
        return this;
    }

    /**
     * 日志文件名称。
     * @return pathFile
     */
    public String getPathFile() {
        return pathFile;
    }

    public void setPathFile(String pathFile) {
        this.pathFile = pathFile;
    }

    public SearchKey withPodName(String podName) {
        this.podName = podName;
        return this;
    }

    /**
     * 容器实例名称。
     * @return podName
     */
    public String getPodName() {
        return podName;
    }

    public void setPodName(String podName) {
        this.podName = podName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchKey that = (SearchKey) obj;
        return Objects.equals(this.appName, that.appName) && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.hostIP, that.hostIP) && Objects.equals(this.nameSpace, that.nameSpace)
            && Objects.equals(this.pathFile, that.pathFile) && Objects.equals(this.podName, that.podName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appName, clusterId, hostIP, nameSpace, pathFile, podName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchKey {\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    hostIP: ").append(toIndentedString(hostIP)).append("\n");
        sb.append("    nameSpace: ").append(toIndentedString(nameSpace)).append("\n");
        sb.append("    pathFile: ").append(toIndentedString(pathFile)).append("\n");
        sb.append("    podName: ").append(toIndentedString(podName)).append("\n");
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
