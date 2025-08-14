package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 配置文件漫游技术配置。
 */
public class PoliciesUserProfile {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_profile_enable")

    private Boolean userProfileEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "options")

    private UpmOptions options;

    public PoliciesUserProfile withUserProfileEnable(Boolean userProfileEnable) {
        this.userProfileEnable = userProfileEnable;
        return this;
    }

    /**
     * 配置文件漫游技术配置开关： false: 表示关闭 true: 表示开启
     * @return userProfileEnable
     */
    public Boolean getUserProfileEnable() {
        return userProfileEnable;
    }

    public void setUserProfileEnable(Boolean userProfileEnable) {
        this.userProfileEnable = userProfileEnable;
    }

    public PoliciesUserProfile withOptions(UpmOptions options) {
        this.options = options;
        return this;
    }

    public PoliciesUserProfile withOptions(Consumer<UpmOptions> optionsSetter) {
        if (this.options == null) {
            this.options = new UpmOptions();
            optionsSetter.accept(this.options);
        }

        return this;
    }

    /**
     * Get options
     * @return options
     */
    public UpmOptions getOptions() {
        return options;
    }

    public void setOptions(UpmOptions options) {
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
        PoliciesUserProfile that = (PoliciesUserProfile) obj;
        return Objects.equals(this.userProfileEnable, that.userProfileEnable)
            && Objects.equals(this.options, that.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userProfileEnable, options);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesUserProfile {\n");
        sb.append("    userProfileEnable: ").append(toIndentedString(userProfileEnable)).append("\n");
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
