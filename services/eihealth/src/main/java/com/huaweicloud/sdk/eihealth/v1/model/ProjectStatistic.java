package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 空间资源统计信息
 */
public class ProjectStatistic {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_type")

    private String roleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_time")

    private String topTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_statistics")

    private List<StatisticDto> userStatistics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_statistics")

    private List<StatisticDto> totalStatistics = null;

    public ProjectStatistic withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 空间ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ProjectStatistic withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 空间名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProjectStatistic withRoleType(String roleType) {
        this.roleType = roleType;
        return this;
    }

    /**
     * 用户所属空间的角色。
     * @return roleType
     */
    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    public ProjectStatistic withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 空间所有者。
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public ProjectStatistic withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 空间创建时间。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ProjectStatistic withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 空间更新时间。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ProjectStatistic withTopTime(String topTime) {
        this.topTime = topTime;
        return this;
    }

    /**
     * 空间置顶时间。
     * @return topTime
     */
    public String getTopTime() {
        return topTime;
    }

    public void setTopTime(String topTime) {
        this.topTime = topTime;
    }

    public ProjectStatistic withUserStatistics(List<StatisticDto> userStatistics) {
        this.userStatistics = userStatistics;
        return this;
    }

    public ProjectStatistic addUserStatisticsItem(StatisticDto userStatisticsItem) {
        if (this.userStatistics == null) {
            this.userStatistics = new ArrayList<>();
        }
        this.userStatistics.add(userStatisticsItem);
        return this;
    }

    public ProjectStatistic withUserStatistics(Consumer<List<StatisticDto>> userStatisticsSetter) {
        if (this.userStatistics == null) {
            this.userStatistics = new ArrayList<>();
        }
        userStatisticsSetter.accept(this.userStatistics);
        return this;
    }

    /**
     * 用户资源统计详情
     * @return userStatistics
     */
    public List<StatisticDto> getUserStatistics() {
        return userStatistics;
    }

    public void setUserStatistics(List<StatisticDto> userStatistics) {
        this.userStatistics = userStatistics;
    }

    public ProjectStatistic withTotalStatistics(List<StatisticDto> totalStatistics) {
        this.totalStatistics = totalStatistics;
        return this;
    }

    public ProjectStatistic addTotalStatisticsItem(StatisticDto totalStatisticsItem) {
        if (this.totalStatistics == null) {
            this.totalStatistics = new ArrayList<>();
        }
        this.totalStatistics.add(totalStatisticsItem);
        return this;
    }

    public ProjectStatistic withTotalStatistics(Consumer<List<StatisticDto>> totalStatisticsSetter) {
        if (this.totalStatistics == null) {
            this.totalStatistics = new ArrayList<>();
        }
        totalStatisticsSetter.accept(this.totalStatistics);
        return this;
    }

    /**
     * 总资源统计详情
     * @return totalStatistics
     */
    public List<StatisticDto> getTotalStatistics() {
        return totalStatistics;
    }

    public void setTotalStatistics(List<StatisticDto> totalStatistics) {
        this.totalStatistics = totalStatistics;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProjectStatistic that = (ProjectStatistic) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.roleType, that.roleType) && Objects.equals(this.creator, that.creator)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.topTime, that.topTime) && Objects.equals(this.userStatistics, that.userStatistics)
            && Objects.equals(this.totalStatistics, that.totalStatistics);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, name, roleType, creator, createTime, updateTime, topTime, userStatistics, totalStatistics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectStatistic {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    roleType: ").append(toIndentedString(roleType)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    topTime: ").append(toIndentedString(topTime)).append("\n");
        sb.append("    userStatistics: ").append(toIndentedString(userStatistics)).append("\n");
        sb.append("    totalStatistics: ").append(toIndentedString(totalStatistics)).append("\n");
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
