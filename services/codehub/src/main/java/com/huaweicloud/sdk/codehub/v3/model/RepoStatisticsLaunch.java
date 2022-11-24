package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RepoStatisticsLaunch
 */
public class RepoStatisticsLaunch {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_statistics")

    private Boolean canStatistics;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "join_id")

    private String joinId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    public RepoStatisticsLaunch withCanStatistics(Boolean canStatistics) {
        this.canStatistics = canStatistics;
        return this;
    }

    /**
     * 仓库是否可以统计
     * @return canStatistics
     */
    public Boolean getCanStatistics() {
        return canStatistics;
    }

    public void setCanStatistics(Boolean canStatistics) {
        this.canStatistics = canStatistics;
    }

    public RepoStatisticsLaunch withJoinId(String joinId) {
        this.joinId = joinId;
        return this;
    }

    /**
     * sidekiq任务的 id
     * @return joinId
     */
    public String getJoinId() {
        return joinId;
    }

    public void setJoinId(String joinId) {
        this.joinId = joinId;
    }

    public RepoStatisticsLaunch withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 启动仓库统计返回的信息
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepoStatisticsLaunch repoStatisticsLaunch = (RepoStatisticsLaunch) o;
        return Objects.equals(this.canStatistics, repoStatisticsLaunch.canStatistics)
            && Objects.equals(this.joinId, repoStatisticsLaunch.joinId)
            && Objects.equals(this.message, repoStatisticsLaunch.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(canStatistics, joinId, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepoStatisticsLaunch {\n");
        sb.append("    canStatistics: ").append(toIndentedString(canStatistics)).append("\n");
        sb.append("    joinId: ").append(toIndentedString(joinId)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
