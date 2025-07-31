package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 有状态工作负载基本信息
 */
public class ServerlessStatefulSetInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace_name")

    private String namespaceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_status")

    private String protectStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pods_num")

    private Integer podsNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match_labels")

    private List<LabelInfo> matchLabels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_installed_num")

    private Integer agentInstalledNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_install_failed_num")

    private Integer agentInstallFailedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_not_install_num")

    private Integer agentNotInstallNum;

    public ServerlessStatefulSetInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 有状态工作负载名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ServerlessStatefulSetInfo withNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }

    /**
     * 命名空间名称
     * @return namespaceName
     */
    public String getNamespaceName() {
        return namespaceName;
    }

    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    public ServerlessStatefulSetInfo withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * 所属集群
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public ServerlessStatefulSetInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态，包含以下几种 -Running：正常运行 -Failed：存在异常
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ServerlessStatefulSetInfo withProtectStatus(String protectStatus) {
        this.protectStatus = protectStatus;
        return this;
    }

    /**
     * 防护状态，包含如下2种。   - closed ：关闭。   - opened ：开启。
     * @return protectStatus
     */
    public String getProtectStatus() {
        return protectStatus;
    }

    public void setProtectStatus(String protectStatus) {
        this.protectStatus = protectStatus;
    }

    public ServerlessStatefulSetInfo withPodsNum(Integer podsNum) {
        this.podsNum = podsNum;
        return this;
    }

    /**
     * 实例个数
     * minimum: 0
     * maximum: 10000000
     * @return podsNum
     */
    public Integer getPodsNum() {
        return podsNum;
    }

    public void setPodsNum(Integer podsNum) {
        this.podsNum = podsNum;
    }

    public ServerlessStatefulSetInfo withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * 镜像名称
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public ServerlessStatefulSetInfo withMatchLabels(List<LabelInfo> matchLabels) {
        this.matchLabels = matchLabels;
        return this;
    }

    public ServerlessStatefulSetInfo addMatchLabelsItem(LabelInfo matchLabelsItem) {
        if (this.matchLabels == null) {
            this.matchLabels = new ArrayList<>();
        }
        this.matchLabels.add(matchLabelsItem);
        return this;
    }

    public ServerlessStatefulSetInfo withMatchLabels(Consumer<List<LabelInfo>> matchLabelsSetter) {
        if (this.matchLabels == null) {
            this.matchLabels = new ArrayList<>();
        }
        matchLabelsSetter.accept(this.matchLabels);
        return this;
    }

    /**
     * 标签
     * @return matchLabels
     */
    public List<LabelInfo> getMatchLabels() {
        return matchLabels;
    }

    public void setMatchLabels(List<LabelInfo> matchLabels) {
        this.matchLabels = matchLabels;
    }

    public ServerlessStatefulSetInfo withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * minimum: 0
     * maximum: 4071095999000
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ServerlessStatefulSetInfo withAgentInstalledNum(Integer agentInstalledNum) {
        this.agentInstalledNum = agentInstalledNum;
        return this;
    }

    /**
     * 工作负载下已安装agent实例数
     * minimum: 0
     * maximum: 1000000
     * @return agentInstalledNum
     */
    public Integer getAgentInstalledNum() {
        return agentInstalledNum;
    }

    public void setAgentInstalledNum(Integer agentInstalledNum) {
        this.agentInstalledNum = agentInstalledNum;
    }

    public ServerlessStatefulSetInfo withAgentInstallFailedNum(Integer agentInstallFailedNum) {
        this.agentInstallFailedNum = agentInstallFailedNum;
        return this;
    }

    /**
     * 工作负载下安装失败实例数
     * minimum: 0
     * maximum: 1000000
     * @return agentInstallFailedNum
     */
    public Integer getAgentInstallFailedNum() {
        return agentInstallFailedNum;
    }

    public void setAgentInstallFailedNum(Integer agentInstallFailedNum) {
        this.agentInstallFailedNum = agentInstallFailedNum;
    }

    public ServerlessStatefulSetInfo withAgentNotInstallNum(Integer agentNotInstallNum) {
        this.agentNotInstallNum = agentNotInstallNum;
        return this;
    }

    /**
     * 工作负载下未安装agent实例数
     * minimum: 0
     * maximum: 1000000
     * @return agentNotInstallNum
     */
    public Integer getAgentNotInstallNum() {
        return agentNotInstallNum;
    }

    public void setAgentNotInstallNum(Integer agentNotInstallNum) {
        this.agentNotInstallNum = agentNotInstallNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServerlessStatefulSetInfo that = (ServerlessStatefulSetInfo) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.namespaceName, that.namespaceName)
            && Objects.equals(this.clusterName, that.clusterName) && Objects.equals(this.status, that.status)
            && Objects.equals(this.protectStatus, that.protectStatus) && Objects.equals(this.podsNum, that.podsNum)
            && Objects.equals(this.imageName, that.imageName) && Objects.equals(this.matchLabels, that.matchLabels)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.agentInstalledNum, that.agentInstalledNum)
            && Objects.equals(this.agentInstallFailedNum, that.agentInstallFailedNum)
            && Objects.equals(this.agentNotInstallNum, that.agentNotInstallNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            namespaceName,
            clusterName,
            status,
            protectStatus,
            podsNum,
            imageName,
            matchLabels,
            createTime,
            agentInstalledNum,
            agentInstallFailedNum,
            agentNotInstallNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerlessStatefulSetInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    namespaceName: ").append(toIndentedString(namespaceName)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    protectStatus: ").append(toIndentedString(protectStatus)).append("\n");
        sb.append("    podsNum: ").append(toIndentedString(podsNum)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    matchLabels: ").append(toIndentedString(matchLabels)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    agentInstalledNum: ").append(toIndentedString(agentInstalledNum)).append("\n");
        sb.append("    agentInstallFailedNum: ").append(toIndentedString(agentInstallFailedNum)).append("\n");
        sb.append("    agentNotInstallNum: ").append(toIndentedString(agentNotInstallNum)).append("\n");
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
