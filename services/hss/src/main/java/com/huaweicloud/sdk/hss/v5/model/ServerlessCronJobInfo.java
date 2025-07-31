package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 定时任务基本信息
 */
public class ServerlessCronJobInfo {

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
    @JsonProperty(value = "running_jobs_num")

    private Integer runningJobsNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule")

    private String schedule;

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

    public ServerlessCronJobInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 定时任务名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ServerlessCronJobInfo withNamespaceName(String namespaceName) {
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

    public ServerlessCronJobInfo withClusterName(String clusterName) {
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

    public ServerlessCronJobInfo withStatus(String status) {
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

    public ServerlessCronJobInfo withRunningJobsNum(Integer runningJobsNum) {
        this.runningJobsNum = runningJobsNum;
        return this;
    }

    /**
     * 正在运行任务个数
     * minimum: 0
     * maximum: 10000000
     * @return runningJobsNum
     */
    public Integer getRunningJobsNum() {
        return runningJobsNum;
    }

    public void setRunningJobsNum(Integer runningJobsNum) {
        this.runningJobsNum = runningJobsNum;
    }

    public ServerlessCronJobInfo withSchedule(String schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * 任务触发周期
     * @return schedule
     */
    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public ServerlessCronJobInfo withImageName(String imageName) {
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

    public ServerlessCronJobInfo withMatchLabels(List<LabelInfo> matchLabels) {
        this.matchLabels = matchLabels;
        return this;
    }

    public ServerlessCronJobInfo addMatchLabelsItem(LabelInfo matchLabelsItem) {
        if (this.matchLabels == null) {
            this.matchLabels = new ArrayList<>();
        }
        this.matchLabels.add(matchLabelsItem);
        return this;
    }

    public ServerlessCronJobInfo withMatchLabels(Consumer<List<LabelInfo>> matchLabelsSetter) {
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

    public ServerlessCronJobInfo withExecuteTime(Long executeTime) {
        this.executeTime = executeTime;
        return this;
    }

    /**
     * 最近执行时间
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

    public ServerlessCronJobInfo withCreateTime(Long createTime) {
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
        ServerlessCronJobInfo that = (ServerlessCronJobInfo) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.namespaceName, that.namespaceName)
            && Objects.equals(this.clusterName, that.clusterName) && Objects.equals(this.status, that.status)
            && Objects.equals(this.runningJobsNum, that.runningJobsNum) && Objects.equals(this.schedule, that.schedule)
            && Objects.equals(this.imageName, that.imageName) && Objects.equals(this.matchLabels, that.matchLabels)
            && Objects.equals(this.executeTime, that.executeTime) && Objects.equals(this.createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            namespaceName,
            clusterName,
            status,
            runningJobsNum,
            schedule,
            imageName,
            matchLabels,
            executeTime,
            createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerlessCronJobInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    namespaceName: ").append(toIndentedString(namespaceName)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    runningJobsNum: ").append(toIndentedString(runningJobsNum)).append("\n");
        sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
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
