package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * EgTargetDetail
 */
public class EgTargetDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_project_id")

    private String targetProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_channel_id")

    private String targetChannelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_region")

    private String targetRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cross_region")

    private Boolean crossRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cross_account")

    private Boolean crossAccount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_name")

    private String agencyName;

    public EgTargetDetail withTargetProjectId(String targetProjectId) {
        this.targetProjectId = targetProjectId;
        return this;
    }

    /**
     * 目标项目id
     * @return targetProjectId
     */
    public String getTargetProjectId() {
        return targetProjectId;
    }

    public void setTargetProjectId(String targetProjectId) {
        this.targetProjectId = targetProjectId;
    }

    public EgTargetDetail withTargetChannelId(String targetChannelId) {
        this.targetChannelId = targetChannelId;
        return this;
    }

    /**
     * 目标通道id
     * @return targetChannelId
     */
    public String getTargetChannelId() {
        return targetChannelId;
    }

    public void setTargetChannelId(String targetChannelId) {
        this.targetChannelId = targetChannelId;
    }

    public EgTargetDetail withTargetRegion(String targetRegion) {
        this.targetRegion = targetRegion;
        return this;
    }

    /**
     * 目标region
     * @return targetRegion
     */
    public String getTargetRegion() {
        return targetRegion;
    }

    public void setTargetRegion(String targetRegion) {
        this.targetRegion = targetRegion;
    }

    public EgTargetDetail withCrossRegion(Boolean crossRegion) {
        this.crossRegion = crossRegion;
        return this;
    }

    /**
     * 跨region开关
     * @return crossRegion
     */
    public Boolean getCrossRegion() {
        return crossRegion;
    }

    public void setCrossRegion(Boolean crossRegion) {
        this.crossRegion = crossRegion;
    }

    public EgTargetDetail withCrossAccount(Boolean crossAccount) {
        this.crossAccount = crossAccount;
        return this;
    }

    /**
     * 跨账号开关
     * @return crossAccount
     */
    public Boolean getCrossAccount() {
        return crossAccount;
    }

    public void setCrossAccount(Boolean crossAccount) {
        this.crossAccount = crossAccount;
    }

    public EgTargetDetail withAgencyName(String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    /**
     * 委托名称
     * @return agencyName
     */
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EgTargetDetail that = (EgTargetDetail) obj;
        return Objects.equals(this.targetProjectId, that.targetProjectId)
            && Objects.equals(this.targetChannelId, that.targetChannelId)
            && Objects.equals(this.targetRegion, that.targetRegion)
            && Objects.equals(this.crossRegion, that.crossRegion)
            && Objects.equals(this.crossAccount, that.crossAccount) && Objects.equals(this.agencyName, that.agencyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetProjectId, targetChannelId, targetRegion, crossRegion, crossAccount, agencyName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EgTargetDetail {\n");
        sb.append("    targetProjectId: ").append(toIndentedString(targetProjectId)).append("\n");
        sb.append("    targetChannelId: ").append(toIndentedString(targetChannelId)).append("\n");
        sb.append("    targetRegion: ").append(toIndentedString(targetRegion)).append("\n");
        sb.append("    crossRegion: ").append(toIndentedString(crossRegion)).append("\n");
        sb.append("    crossAccount: ").append(toIndentedString(crossAccount)).append("\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
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
