package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 发布订配置文件响应信息。
 */
public class ListReplicationProfilesResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "profile_id")

    private String profileId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "profile_name")

    private String profileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_type")

    private String agentType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_def_profile")

    private Boolean isDefProfile;

    public ListReplicationProfilesResult withProfileId(String profileId) {
        this.profileId = profileId;
        return this;
    }

    /**
     * 配置文件id。
     * @return profileId
     */
    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public ListReplicationProfilesResult withProfileName(String profileName) {
        this.profileName = profileName;
        return this;
    }

    /**
     * 配置文件名。
     * @return profileName
     */
    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public ListReplicationProfilesResult withAgentType(String agentType) {
        this.agentType = agentType;
        return this;
    }

    /**
     * 代理类型。  snapshot：快照代理 log_reader：日志读取器代理 distribution：分发代理 merge:合并代理 queue_reader：队列读取器代理。
     * @return agentType
     */
    public String getAgentType() {
        return agentType;
    }

    public void setAgentType(String agentType) {
        this.agentType = agentType;
    }

    public ListReplicationProfilesResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 配置文件说明。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ListReplicationProfilesResult withIsDefProfile(Boolean isDefProfile) {
        this.isDefProfile = isDefProfile;
        return this;
    }

    /**
     * 是否为默认配置。  true：是默认配置。 false：不是默认配置。
     * @return isDefProfile
     */
    public Boolean getIsDefProfile() {
        return isDefProfile;
    }

    public void setIsDefProfile(Boolean isDefProfile) {
        this.isDefProfile = isDefProfile;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListReplicationProfilesResult that = (ListReplicationProfilesResult) obj;
        return Objects.equals(this.profileId, that.profileId) && Objects.equals(this.profileName, that.profileName)
            && Objects.equals(this.agentType, that.agentType) && Objects.equals(this.description, that.description)
            && Objects.equals(this.isDefProfile, that.isDefProfile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(profileId, profileName, agentType, description, isDefProfile);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListReplicationProfilesResult {\n");
        sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
        sb.append("    profileName: ").append(toIndentedString(profileName)).append("\n");
        sb.append("    agentType: ").append(toIndentedString(agentType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    isDefProfile: ").append(toIndentedString(isDefProfile)).append("\n");
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
