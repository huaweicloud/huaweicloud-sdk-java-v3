package com.huaweicloud.sdk.codecraft.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RegisterInfoRequestModel
 */
public class RegisterInfoRequestModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "competition_id")

    private String competitionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stage_id")

    private String stageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    public RegisterInfoRequestModel withCompetitionId(String competitionId) {
        this.competitionId = competitionId;
        return this;
    }

    /**
     * 大赛ID，大赛平台提供
     * @return competitionId
     */
    public String getCompetitionId() {
        return competitionId;
    }

    public void setCompetitionId(String competitionId) {
        this.competitionId = competitionId;
    }

    public RegisterInfoRequestModel withStageId(String stageId) {
        this.stageId = stageId;
        return this;
    }

    /**
     * 大赛阶段ID，大赛平台提供
     * @return stageId
     */
    public String getStageId() {
        return stageId;
    }

    public void setStageId(String stageId) {
        this.stageId = stageId;
    }

    public RegisterInfoRequestModel withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 租户ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RegisterInfoRequestModel that = (RegisterInfoRequestModel) obj;
        return Objects.equals(this.competitionId, that.competitionId) && Objects.equals(this.stageId, that.stageId)
            && Objects.equals(this.domainId, that.domainId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(competitionId, stageId, domainId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RegisterInfoRequestModel {\n");
        sb.append("    competitionId: ").append(toIndentedString(competitionId)).append("\n");
        sb.append("    stageId: ").append(toIndentedString(stageId)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
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
