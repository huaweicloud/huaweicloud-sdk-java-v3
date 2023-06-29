package com.huaweicloud.sdk.tics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowJobInstanceDagRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "league_id")

    private String leagueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "round_id")

    private Integer roundId;

    public ShowJobInstanceDagRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例id，最大32位，字母和数字组成
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowJobInstanceDagRequest withLeagueId(String leagueId) {
        this.leagueId = leagueId;
        return this;
    }

    /**
     * 联盟id，最大32位，字母和数字组成
     * @return leagueId
     */
    public String getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(String leagueId) {
        this.leagueId = leagueId;
    }

    public ShowJobInstanceDagRequest withRoundId(Integer roundId) {
        this.roundId = roundId;
        return this;
    }

    /**
     * 轮数，最小值0最大值0x7fffffff
     * minimum: 0
     * maximum: 2147483647
     * @return roundId
     */
    public Integer getRoundId() {
        return roundId;
    }

    public void setRoundId(Integer roundId) {
        this.roundId = roundId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowJobInstanceDagRequest that = (ShowJobInstanceDagRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.leagueId, that.leagueId)
            && Objects.equals(this.roundId, that.roundId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, leagueId, roundId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobInstanceDagRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    leagueId: ").append(toIndentedString(leagueId)).append("\n");
        sb.append("    roundId: ").append(toIndentedString(roundId)).append("\n");
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
