package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 创建新集群信息
 */
public class CCECreateInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_num")

    @JacksonXmlProperty(localName = "node_num")

    private Long nodeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_flavor")

    @JacksonXmlProperty(localName = "node_flavor")

    private String nodeFlavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cce_flavor")

    @JacksonXmlProperty(localName = "cce_flavor")

    private String cceFlavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "init_node_pwd")

    @JacksonXmlProperty(localName = "init_node_pwd")

    private String initNodePwd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az")

    @JacksonXmlProperty(localName = "az")

    private String az;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_platform_type")

    @JacksonXmlProperty(localName = "cluster_platform_type")

    private String clusterPlatformType;

    public CCECreateInfo withNodeNum(Long nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }

    /**
     * 集群节点数
     * @return nodeNum
     */
    public Long getNodeNum() {
        return nodeNum;
    }

    public void setNodeNum(Long nodeNum) {
        this.nodeNum = nodeNum;
    }

    public CCECreateInfo withNodeFlavor(String nodeFlavor) {
        this.nodeFlavor = nodeFlavor;
        return this;
    }

    /**
     * 集群节点规格ID（支持的规格配置最小为4u8g）
     * @return nodeFlavor
     */
    public String getNodeFlavor() {
        return nodeFlavor;
    }

    public void setNodeFlavor(String nodeFlavor) {
        this.nodeFlavor = nodeFlavor;
    }

    public CCECreateInfo withCceFlavor(String cceFlavor) {
        this.cceFlavor = cceFlavor;
        return this;
    }

    /**
     * CCE集群规格
     * @return cceFlavor
     */
    public String getCceFlavor() {
        return cceFlavor;
    }

    public void setCceFlavor(String cceFlavor) {
        this.cceFlavor = cceFlavor;
    }

    public CCECreateInfo withInitNodePwd(String initNodePwd) {
        this.initNodePwd = initNodePwd;
        return this;
    }

    /**
     * 节点初始密码
     * @return initNodePwd
     */
    public String getInitNodePwd() {
        return initNodePwd;
    }

    public void setInitNodePwd(String initNodePwd) {
        this.initNodePwd = initNodePwd;
    }

    public CCECreateInfo withAz(String az) {
        this.az = az;
        return this;
    }

    /**
     * 可用区
     * @return az
     */
    public String getAz() {
        return az;
    }

    public void setAz(String az) {
        this.az = az;
    }

    public CCECreateInfo withClusterPlatformType(String clusterPlatformType) {
        this.clusterPlatformType = clusterPlatformType;
        return this;
    }

    /**
     * 集群CPU架构类型：X86（VirtualMachine），ARM（ARM64）
     * @return clusterPlatformType
     */
    public String getClusterPlatformType() {
        return clusterPlatformType;
    }

    public void setClusterPlatformType(String clusterPlatformType) {
        this.clusterPlatformType = clusterPlatformType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CCECreateInfo ccECreateInfo = (CCECreateInfo) o;
        return Objects.equals(this.nodeNum, ccECreateInfo.nodeNum)
            && Objects.equals(this.nodeFlavor, ccECreateInfo.nodeFlavor)
            && Objects.equals(this.cceFlavor, ccECreateInfo.cceFlavor)
            && Objects.equals(this.initNodePwd, ccECreateInfo.initNodePwd) && Objects.equals(this.az, ccECreateInfo.az)
            && Objects.equals(this.clusterPlatformType, ccECreateInfo.clusterPlatformType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeNum, nodeFlavor, cceFlavor, initNodePwd, az, clusterPlatformType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CCECreateInfo {\n");
        sb.append("    nodeNum: ").append(toIndentedString(nodeNum)).append("\n");
        sb.append("    nodeFlavor: ").append(toIndentedString(nodeFlavor)).append("\n");
        sb.append("    cceFlavor: ").append(toIndentedString(cceFlavor)).append("\n");
        sb.append("    initNodePwd: ").append(toIndentedString(initNodePwd)).append("\n");
        sb.append("    az: ").append(toIndentedString(az)).append("\n");
        sb.append("    clusterPlatformType: ").append(toIndentedString(clusterPlatformType)).append("\n");
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
