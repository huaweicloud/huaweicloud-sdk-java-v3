package com.huaweicloud.sdk.tics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateLeagueRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "league_id")

    private String leagueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private LeagueUpdateVo body;

    public UpdateLeagueRequest withLeagueId(String leagueId) {
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

    public UpdateLeagueRequest withBody(LeagueUpdateVo body) {
        this.body = body;
        return this;
    }

    public UpdateLeagueRequest withBody(Consumer<LeagueUpdateVo> bodySetter) {
        if (this.body == null) {
            this.body = new LeagueUpdateVo();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public LeagueUpdateVo getBody() {
        return body;
    }

    public void setBody(LeagueUpdateVo body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateLeagueRequest that = (UpdateLeagueRequest) obj;
        return Objects.equals(this.leagueId, that.leagueId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(leagueId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLeagueRequest {\n");
        sb.append("    leagueId: ").append(toIndentedString(leagueId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
