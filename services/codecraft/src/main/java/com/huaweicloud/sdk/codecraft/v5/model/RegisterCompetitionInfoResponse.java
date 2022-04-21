package com.huaweicloud.sdk.codecraft.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class RegisterCompetitionInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_permitted")

    private Boolean isPermitted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "team_id")

    private String teamId;

    public RegisterCompetitionInfoResponse withIsPermitted(Boolean isPermitted) {
        this.isPermitted = isPermitted;
        return this;
    }

    /**
     * 是否允许提交作品，true-允许，false-不允许
     * @return isPermitted
     */
    public Boolean getIsPermitted() {
        return isPermitted;
    }

    public void setIsPermitted(Boolean isPermitted) {
        this.isPermitted = isPermitted;
    }

    public RegisterCompetitionInfoResponse withTeamId(String teamId) {
        this.teamId = teamId;
        return this;
    }

    /**
     * 团队ID
     * @return teamId
     */
    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RegisterCompetitionInfoResponse registerCompetitionInfoResponse = (RegisterCompetitionInfoResponse) o;
        return Objects.equals(this.isPermitted, registerCompetitionInfoResponse.isPermitted)
            && Objects.equals(this.teamId, registerCompetitionInfoResponse.teamId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isPermitted, teamId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RegisterCompetitionInfoResponse {\n");
        sb.append("    isPermitted: ").append(toIndentedString(isPermitted)).append("\n");
        sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
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
