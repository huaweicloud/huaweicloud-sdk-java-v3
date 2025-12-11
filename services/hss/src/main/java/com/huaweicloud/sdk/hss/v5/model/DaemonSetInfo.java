package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * daemonset基本信息
 */
public class DaemonSetInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace_name")

    private String namespaceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_type")

    private String clusterType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

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

    public DaemonSetInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**: daemonset名称。 **取值范围**: 字符长度0-256位 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DaemonSetInfo withNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }

    /**
     * **参数解释**: 命名空间名称。 **取值范围**: 字符长度0-256位 
     * @return namespaceName
     */
    public String getNamespaceName() {
        return namespaceName;
    }

    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    public DaemonSetInfo withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * **参数解释**: 集群的唯一标识ID，用于唯一确定DaemonSet所属的集群实例。 **取值范围**: 符合标准UUID格式，字符串长度36位 
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public DaemonSetInfo withClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    /**
     * **参数解释**: DaemonSet所属集群的部署类型，用于区分不同云厂商或部署模式的集群。 **取值范围**: k8s（原生集群）、cce（CCE集群）、ali（阿里云集群）、tencent（腾讯云集群）、azure（微软云集群）、aws（亚马逊集群）、self_built_hw（华为云自建集群）、self_built_idc（IDC自建集群） 
     * @return clusterType
     */
    public String getClusterType() {
        return clusterType;
    }

    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }

    public DaemonSetInfo withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * **参数解释**: 集群名称。 **取值范围**: 字符串长度0-256 
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public DaemonSetInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**: DaemonSet的运行状态，用于标识当前实例的运行健康度； **取值范围**: Running（正常运行）、Failed（存在异常） 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DaemonSetInfo withPodsNum(Integer podsNum) {
        this.podsNum = podsNum;
        return this;
    }

    /**
     * **参数解释**: 当前DaemonSet对应的Pod实例总数量； **取值范围**: 非负整数，单位为个，最小值0，无上限（取决于集群资源） 
     * minimum: 0
     * maximum: 2147483647
     * @return podsNum
     */
    public Integer getPodsNum() {
        return podsNum;
    }

    public void setPodsNum(Integer podsNum) {
        this.podsNum = podsNum;
    }

    public DaemonSetInfo withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * **参数解释**: DaemonSet实例所使用的容器镜像的完整名称，包含镜像仓库、镜像名及标签； **取值范围**: 符合容器镜像命名规范，字符长度1 - 256位 
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public DaemonSetInfo withMatchLabels(List<LabelInfo> matchLabels) {
        this.matchLabels = matchLabels;
        return this;
    }

    public DaemonSetInfo addMatchLabelsItem(LabelInfo matchLabelsItem) {
        if (this.matchLabels == null) {
            this.matchLabels = new ArrayList<>();
        }
        this.matchLabels.add(matchLabelsItem);
        return this;
    }

    public DaemonSetInfo withMatchLabels(Consumer<List<LabelInfo>> matchLabelsSetter) {
        if (this.matchLabels == null) {
            this.matchLabels = new ArrayList<>();
        }
        matchLabelsSetter.accept(this.matchLabels);
        return this;
    }

    /**
     * **参数解释**: 用于匹配Pod的标签集合，K8s通过该标签关联DaemonSet与对应Pod； **取值范围**: 数组元素数量≥0，每个元素的key为标签名称，val为标签值，key和val字符长度均为1 - 63位 
     * @return matchLabels
     */
    public List<LabelInfo> getMatchLabels() {
        return matchLabels;
    }

    public void setMatchLabels(List<LabelInfo> matchLabels) {
        this.matchLabels = matchLabels;
    }

    public DaemonSetInfo withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**: DaemonSet资源的创建时间； **取值范围**: 以毫秒级时间戳格式返回，取值为非负长整数，对应UTC时间1970 - 01 - 01起的毫秒数 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DaemonSetInfo that = (DaemonSetInfo) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.namespaceName, that.namespaceName)
            && Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.clusterType, that.clusterType)
            && Objects.equals(this.clusterName, that.clusterName) && Objects.equals(this.status, that.status)
            && Objects.equals(this.podsNum, that.podsNum) && Objects.equals(this.imageName, that.imageName)
            && Objects.equals(this.matchLabels, that.matchLabels) && Objects.equals(this.createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            namespaceName,
            clusterId,
            clusterType,
            clusterName,
            status,
            podsNum,
            imageName,
            matchLabels,
            createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DaemonSetInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    namespaceName: ").append(toIndentedString(namespaceName)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterType: ").append(toIndentedString(clusterType)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    podsNum: ").append(toIndentedString(podsNum)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    matchLabels: ").append(toIndentedString(matchLabels)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
