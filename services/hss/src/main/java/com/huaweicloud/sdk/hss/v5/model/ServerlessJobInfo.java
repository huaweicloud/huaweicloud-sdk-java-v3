package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 普通任务基本信息
 */
public class ServerlessJobInfo {

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
    @JsonProperty(value = "pods_num")

    private Integer podsNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match_labels")

    private List<LabelInfo> matchLabels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_time")

    private Long executeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    public ServerlessJobInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 普通任务名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ServerlessJobInfo withNamespaceName(String namespaceName) {
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

    public ServerlessJobInfo withClusterName(String clusterName) {
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

    public ServerlessJobInfo withStatus(String status) {
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

    public ServerlessJobInfo withPodsNum(Integer podsNum) {
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

    public ServerlessJobInfo withImageName(String imageName) {
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

    public ServerlessJobInfo withMatchLabels(List<LabelInfo> matchLabels) {
        this.matchLabels = matchLabels;
        return this;
    }

    public ServerlessJobInfo addMatchLabelsItem(LabelInfo matchLabelsItem) {
        if (this.matchLabels == null) {
            this.matchLabels = new ArrayList<>();
        }
        this.matchLabels.add(matchLabelsItem);
        return this;
    }

    public ServerlessJobInfo withMatchLabels(Consumer<List<LabelInfo>> matchLabelsSetter) {
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

    public ServerlessJobInfo withExecuteTime(Long executeTime) {
        this.executeTime = executeTime;
        return this;
    }

    /**
     * 执行时间
     * minimum: 0
     * maximum: 4071095999000
     * @return executeTime
     */
    public Long getExecuteTime() {
        return executeTime;
    }

    public void setExecuteTime(Long executeTime) {
        this.executeTime = executeTime;
    }

    public ServerlessJobInfo withCreateTime(Long createTime) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServerlessJobInfo that = (ServerlessJobInfo) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.namespaceName, that.namespaceName)
            && Objects.equals(this.clusterName, that.clusterName) && Objects.equals(this.status, that.status)
            && Objects.equals(this.podsNum, that.podsNum) && Objects.equals(this.imageName, that.imageName)
            && Objects.equals(this.matchLabels, that.matchLabels) && Objects.equals(this.executeTime, that.executeTime)
            && Objects.equals(this.createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(name, namespaceName, clusterName, status, podsNum, imageName, matchLabels, executeTime, createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerlessJobInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    namespaceName: ").append(toIndentedString(namespaceName)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    podsNum: ").append(toIndentedString(podsNum)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    matchLabels: ").append(toIndentedString(matchLabels)).append("\n");
        sb.append("    executeTime: ").append(toIndentedString(executeTime)).append("\n");
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
