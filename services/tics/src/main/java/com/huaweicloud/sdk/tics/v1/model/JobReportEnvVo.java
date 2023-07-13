package com.huaweicloud.sdk.tics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * JobReportEnvVo
 */
public class JobReportEnvVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agg_name")

    private String aggName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "league_id")

    private String leagueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "league_name")

    private String leagueName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    public JobReportEnvVo withAggName(String aggName) {
        this.aggName = aggName;
        return this;
    }

    /**
     * 聚合器名称
     * @return aggName
     */
    public String getAggName() {
        return aggName;
    }

    public void setAggName(String aggName) {
        this.aggName = aggName;
    }

    public JobReportEnvVo withLeagueId(String leagueId) {
        this.leagueId = leagueId;
        return this;
    }

    /**
     * 联盟id
     * @return leagueId
     */
    public String getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(String leagueId) {
        this.leagueId = leagueId;
    }

    public JobReportEnvVo withLeagueName(String leagueName) {
        this.leagueName = leagueName;
        return this;
    }

    /**
     * 联盟名称
     * @return leagueName
     */
    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public JobReportEnvVo withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public JobReportEnvVo withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 区域
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobReportEnvVo that = (JobReportEnvVo) obj;
        return Objects.equals(this.aggName, that.aggName) && Objects.equals(this.leagueId, that.leagueId)
            && Objects.equals(this.leagueName, that.leagueName) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.regionId, that.regionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aggName, leagueId, leagueName, projectId, regionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobReportEnvVo {\n");
        sb.append("    aggName: ").append(toIndentedString(aggName)).append("\n");
        sb.append("    leagueId: ").append(toIndentedString(leagueId)).append("\n");
        sb.append("    leagueName: ").append(toIndentedString(leagueName)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
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
