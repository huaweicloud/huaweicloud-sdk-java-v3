package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 用户配置策略。
 */
public class PoliciesUserProfileManagement {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upm_status")

    private Integer upmStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "options")

    private UserProfileManagementOptions options;

    public PoliciesUserProfileManagement withUpmStatus(Integer upmStatus) {
        this.upmStatus = upmStatus;
        return this;
    }

    /**
     * 用户配置状态： 0: 已禁用 1: 已启用 2: 未配置
     * @return upmStatus
     */
    public Integer getUpmStatus() {
        return upmStatus;
    }

    public void setUpmStatus(Integer upmStatus) {
        this.upmStatus = upmStatus;
    }

    public PoliciesUserProfileManagement withOptions(UserProfileManagementOptions options) {
        this.options = options;
        return this;
    }

    public PoliciesUserProfileManagement withOptions(Consumer<UserProfileManagementOptions> optionsSetter) {
        if (this.options == null) {
            this.options = new UserProfileManagementOptions();
            optionsSetter.accept(this.options);
        }

        return this;
    }

    /**
     * Get options
     * @return options
     */
    public UserProfileManagementOptions getOptions() {
        return options;
    }

    public void setOptions(UserProfileManagementOptions options) {
        this.options = options;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoliciesUserProfileManagement that = (PoliciesUserProfileManagement) obj;
        return Objects.equals(this.upmStatus, that.upmStatus) && Objects.equals(this.options, that.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(upmStatus, options);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesUserProfileManagement {\n");
        sb.append("    upmStatus: ").append(toIndentedString(upmStatus)).append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
