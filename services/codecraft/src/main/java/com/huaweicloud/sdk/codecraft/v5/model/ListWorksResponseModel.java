package com.huaweicloud.sdk.codecraft.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** ListWorksResponseModel */
public class ListWorksResponseModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "works_id")

    private String worksId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "team_id")

    private String teamId;

    public ListWorksResponseModel withWorksId(String worksId) {
        this.worksId = worksId;
        return this;
    }

    /** 作品ID
     * 
     * @return worksId */
    public String getWorksId() {
        return worksId;
    }

    public void setWorksId(String worksId) {
        this.worksId = worksId;
    }

    public ListWorksResponseModel withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /** 租户ID
     * 
     * @return domainId */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ListWorksResponseModel withTeamId(String teamId) {
        this.teamId = teamId;
        return this;
    }

    /** 团队ID
     * 
     * @return teamId */
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
        ListWorksResponseModel listWorksResponseModel = (ListWorksResponseModel) o;
        return Objects.equals(this.worksId, listWorksResponseModel.worksId)
            && Objects.equals(this.domainId, listWorksResponseModel.domainId)
            && Objects.equals(this.teamId, listWorksResponseModel.teamId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(worksId, domainId, teamId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWorksResponseModel {\n");
        sb.append("    worksId: ").append(toIndentedString(worksId)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
