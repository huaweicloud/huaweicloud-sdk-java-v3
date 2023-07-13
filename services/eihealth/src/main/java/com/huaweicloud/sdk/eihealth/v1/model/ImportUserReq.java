package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ImportUserReq
 */
public class ImportUserReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iam_user_id")

    private String iamUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    private String role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "settings")

    private UserSettingDto settings;

    public ImportUserReq withIamUserId(String iamUserId) {
        this.iamUserId = iamUserId;
        return this;
    }

    /**
     * IAM用户id
     * @return iamUserId
     */
    public String getIamUserId() {
        return iamUserId;
    }

    public void setIamUserId(String iamUserId) {
        this.iamUserId = iamUserId;
    }

    public ImportUserReq withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * 角色类型：管理员(ADMIN)、操作者(OPERATOR)
     * @return role
     */
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public ImportUserReq withSettings(UserSettingDto settings) {
        this.settings = settings;
        return this;
    }

    public ImportUserReq withSettings(Consumer<UserSettingDto> settingsSetter) {
        if (this.settings == null) {
            this.settings = new UserSettingDto();
            settingsSetter.accept(this.settings);
        }

        return this;
    }

    /**
     * Get settings
     * @return settings
     */
    public UserSettingDto getSettings() {
        return settings;
    }

    public void setSettings(UserSettingDto settings) {
        this.settings = settings;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImportUserReq that = (ImportUserReq) obj;
        return Objects.equals(this.iamUserId, that.iamUserId) && Objects.equals(this.role, that.role)
            && Objects.equals(this.settings, that.settings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iamUserId, role, settings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportUserReq {\n");
        sb.append("    iamUserId: ").append(toIndentedString(iamUserId)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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
