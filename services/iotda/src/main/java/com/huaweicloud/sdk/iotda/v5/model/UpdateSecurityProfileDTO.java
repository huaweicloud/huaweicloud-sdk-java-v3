package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 安全态势感知配置
 */
public class UpdateSecurityProfileDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_level")

    private String alarmLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_level")

    private String securityLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "profile")

    private List<SecurityProfile> profile = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "profile_targets")

    private SecurityTarget profileTargets;

    public UpdateSecurityProfileDTO withAlarmLevel(String alarmLevel) {
        this.alarmLevel = alarmLevel;
        return this;
    }

    /**
     * 安全态势感知告警级别，CRITICAL：严重告警，MAJOR：重要告警，MINOR：一般告警
     * @return alarmLevel
     */
    public String getAlarmLevel() {
        return alarmLevel;
    }

    public void setAlarmLevel(String alarmLevel) {
        this.alarmLevel = alarmLevel;
    }

    public UpdateSecurityProfileDTO withSecurityLevel(String securityLevel) {
        this.securityLevel = securityLevel;
        return this;
    }

    /**
     * 安全态势感知项所属安全风险级别；BASIC_SECURITY：基础安全，ADVANCE_SECURITY：高级安全，ULTIMATE_SECURITY：极致安全
     * @return securityLevel
     */
    public String getSecurityLevel() {
        return securityLevel;
    }

    public void setSecurityLevel(String securityLevel) {
        this.securityLevel = securityLevel;
    }

    public UpdateSecurityProfileDTO withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 安全态势感知项是否开启
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public UpdateSecurityProfileDTO withProfile(List<SecurityProfile> profile) {
        this.profile = profile;
        return this;
    }

    public UpdateSecurityProfileDTO addProfileItem(SecurityProfile profileItem) {
        if (this.profile == null) {
            this.profile = new ArrayList<>();
        }
        this.profile.add(profileItem);
        return this;
    }

    public UpdateSecurityProfileDTO withProfile(Consumer<List<SecurityProfile>> profileSetter) {
        if (this.profile == null) {
            this.profile = new ArrayList<>();
        }
        profileSetter.accept(this.profile);
        return this;
    }

    /**
     * 安全态势感知项配置结构体，用于设备侧检测项下发给设备
     * @return profile
     */
    public List<SecurityProfile> getProfile() {
        return profile;
    }

    public void setProfile(List<SecurityProfile> profile) {
        this.profile = profile;
    }

    public UpdateSecurityProfileDTO withProfileTargets(SecurityTarget profileTargets) {
        this.profileTargets = profileTargets;
        return this;
    }

    public UpdateSecurityProfileDTO withProfileTargets(Consumer<SecurityTarget> profileTargetsSetter) {
        if (this.profileTargets == null) {
            this.profileTargets = new SecurityTarget();
            profileTargetsSetter.accept(this.profileTargets);
        }

        return this;
    }

    /**
     * Get profileTargets
     * @return profileTargets
     */
    public SecurityTarget getProfileTargets() {
        return profileTargets;
    }

    public void setProfileTargets(SecurityTarget profileTargets) {
        this.profileTargets = profileTargets;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateSecurityProfileDTO that = (UpdateSecurityProfileDTO) obj;
        return Objects.equals(this.alarmLevel, that.alarmLevel)
            && Objects.equals(this.securityLevel, that.securityLevel) && Objects.equals(this.enable, that.enable)
            && Objects.equals(this.profile, that.profile) && Objects.equals(this.profileTargets, that.profileTargets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmLevel, securityLevel, enable, profile, profileTargets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSecurityProfileDTO {\n");
        sb.append("    alarmLevel: ").append(toIndentedString(alarmLevel)).append("\n");
        sb.append("    securityLevel: ").append(toIndentedString(securityLevel)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
        sb.append("    profileTargets: ").append(toIndentedString(profileTargets)).append("\n");
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
