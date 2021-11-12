package com.huaweicloud.sdk.aom.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Array of ALSDatasDetail object  数据数组。
 */
public class ALSDatasDetail  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="appName")
    
    
    private String appName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="category")
    
    
    private String category;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="clusterId")
    
    
    private String clusterId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="clusterName")
    
    
    private String clusterName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="collectTime")
    
    
    private String collectTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="containerName")
    
    
    private String containerName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hostIP")
    
    
    private String hostIP;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hostId")
    
    
    private String hostId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hostName")
    
    
    private String hostName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="lineNum")
    
    
    private String lineNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="logContent")
    
    
    private String logContent;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="logContentSize")
    
    
    private String logContentSize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="loghash")
    
    
    private String loghash;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="nameSpace")
    
    
    private String nameSpace;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pathFile")
    
    
    private String pathFile;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="podName")
    
    
    private String podName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="serviceID")
    
    
    private String serviceID;

    public ALSDatasDetail withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    


    /**
     * 服务名称。
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    

    public ALSDatasDetail withCategory(String category) {
        this.category = category;
        return this;
    }

    


    /**
     * 日志类型。
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    

    public ALSDatasDetail withClusterId(String clusterId) {
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

    

    public ALSDatasDetail withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    


    /**
     * CCE集群名称。
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    

    public ALSDatasDetail withCollectTime(String collectTime) {
        this.collectTime = collectTime;
        return this;
    }

    


    /**
     * 日志采集时间，UTC时间，毫秒级。
     * @return collectTime
     */
    public String getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(String collectTime) {
        this.collectTime = collectTime;
    }

    

    public ALSDatasDetail withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    


    /**
     * CCE容器名称。
     * @return containerName
     */
    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    

    public ALSDatasDetail withHostIP(String hostIP) {
        this.hostIP = hostIP;
        return this;
    }

    


    /**
     * 日志文件所在虚拟机主机IP。
     * @return hostIP
     */
    public String getHostIP() {
        return hostIP;
    }

    public void setHostIP(String hostIP) {
        this.hostIP = hostIP;
    }

    

    public ALSDatasDetail withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    


    /**
     * 主机在集群中的ID。
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    

    public ALSDatasDetail withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    


    /**
     * 日志所在虚拟机名称。
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    

    public ALSDatasDetail withLineNum(String lineNum) {
        this.lineNum = lineNum;
        return this;
    }

    


    /**
     * 日志单序列号。
     * @return lineNum
     */
    public String getLineNum() {
        return lineNum;
    }

    public void setLineNum(String lineNum) {
        this.lineNum = lineNum;
    }

    

    public ALSDatasDetail withLogContent(String logContent) {
        this.logContent = logContent;
        return this;
    }

    


    /**
     * 日志原数据。
     * @return logContent
     */
    public String getLogContent() {
        return logContent;
    }

    public void setLogContent(String logContent) {
        this.logContent = logContent;
    }

    

    public ALSDatasDetail withLogContentSize(String logContentSize) {
        this.logContentSize = logContentSize;
        return this;
    }

    


    /**
     * 单行日志大小。
     * @return logContentSize
     */
    public String getLogContentSize() {
        return logContentSize;
    }

    public void setLogContentSize(String logContentSize) {
        this.logContentSize = logContentSize;
    }

    

    public ALSDatasDetail withLoghash(String loghash) {
        this.loghash = loghash;
        return this;
    }

    


    /**
     * 日志来源HASH值。
     * @return loghash
     */
    public String getLoghash() {
        return loghash;
    }

    public void setLoghash(String loghash) {
        this.loghash = loghash;
    }

    

    public ALSDatasDetail withNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
        return this;
    }

    


    /**
     * CCE集群命名空间。
     * @return nameSpace
     */
    public String getNameSpace() {
        return nameSpace;
    }

    public void setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
    }

    

    public ALSDatasDetail withPathFile(String pathFile) {
        this.pathFile = pathFile;
        return this;
    }

    


    /**
     * 日志文件绝对路径。
     * @return pathFile
     */
    public String getPathFile() {
        return pathFile;
    }

    public void setPathFile(String pathFile) {
        this.pathFile = pathFile;
    }

    

    public ALSDatasDetail withPodName(String podName) {
        this.podName = podName;
        return this;
    }

    


    /**
     * CCE容器实例名称。
     * @return podName
     */
    public String getPodName() {
        return podName;
    }

    public void setPodName(String podName) {
        this.podName = podName;
    }

    

    public ALSDatasDetail withServiceID(String serviceID) {
        this.serviceID = serviceID;
        return this;
    }

    


    /**
     * AOM资源—服务ID。
     * @return serviceID
     */
    public String getServiceID() {
        return serviceID;
    }

    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ALSDatasDetail alSDatasDetail = (ALSDatasDetail) o;
        return Objects.equals(this.appName, alSDatasDetail.appName) &&
            Objects.equals(this.category, alSDatasDetail.category) &&
            Objects.equals(this.clusterId, alSDatasDetail.clusterId) &&
            Objects.equals(this.clusterName, alSDatasDetail.clusterName) &&
            Objects.equals(this.collectTime, alSDatasDetail.collectTime) &&
            Objects.equals(this.containerName, alSDatasDetail.containerName) &&
            Objects.equals(this.hostIP, alSDatasDetail.hostIP) &&
            Objects.equals(this.hostId, alSDatasDetail.hostId) &&
            Objects.equals(this.hostName, alSDatasDetail.hostName) &&
            Objects.equals(this.lineNum, alSDatasDetail.lineNum) &&
            Objects.equals(this.logContent, alSDatasDetail.logContent) &&
            Objects.equals(this.logContentSize, alSDatasDetail.logContentSize) &&
            Objects.equals(this.loghash, alSDatasDetail.loghash) &&
            Objects.equals(this.nameSpace, alSDatasDetail.nameSpace) &&
            Objects.equals(this.pathFile, alSDatasDetail.pathFile) &&
            Objects.equals(this.podName, alSDatasDetail.podName) &&
            Objects.equals(this.serviceID, alSDatasDetail.serviceID);
    }
    @Override
    public int hashCode() {
        return Objects.hash(appName, category, clusterId, clusterName, collectTime, containerName, hostIP, hostId, hostName, lineNum, logContent, logContentSize, loghash, nameSpace, pathFile, podName, serviceID);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ALSDatasDetail {\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    collectTime: ").append(toIndentedString(collectTime)).append("\n");
        sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
        sb.append("    hostIP: ").append(toIndentedString(hostIP)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    lineNum: ").append(toIndentedString(lineNum)).append("\n");
        sb.append("    logContent: ").append(toIndentedString(logContent)).append("\n");
        sb.append("    logContentSize: ").append(toIndentedString(logContentSize)).append("\n");
        sb.append("    loghash: ").append(toIndentedString(loghash)).append("\n");
        sb.append("    nameSpace: ").append(toIndentedString(nameSpace)).append("\n");
        sb.append("    pathFile: ").append(toIndentedString(pathFile)).append("\n");
        sb.append("    podName: ").append(toIndentedString(podName)).append("\n");
        sb.append("    serviceID: ").append(toIndentedString(serviceID)).append("\n");
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

