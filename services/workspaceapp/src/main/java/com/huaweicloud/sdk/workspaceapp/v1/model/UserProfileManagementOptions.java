package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 用户漫游配置。
 */
public class UserProfileManagementOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "profiles")

    private UserProfileManagementProfiles profiles;

    public UserProfileManagementOptions withProfiles(UserProfileManagementProfiles profiles) {
        this.profiles = profiles;
        return this;
    }

    public UserProfileManagementOptions withProfiles(Consumer<UserProfileManagementProfiles> profilesSetter) {
        if (this.profiles == null) {
            this.profiles = new UserProfileManagementProfiles();
            profilesSetter.accept(this.profiles);
        }

        return this;
    }

    /**
     * Get profiles
     * @return profiles
     */
    public UserProfileManagementProfiles getProfiles() {
        return profiles;
    }

    public void setProfiles(UserProfileManagementProfiles profiles) {
        this.profiles = profiles;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserProfileManagementOptions that = (UserProfileManagementOptions) obj;
        return Objects.equals(this.profiles, that.profiles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(profiles);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserProfileManagementOptions {\n");
        sb.append("    profiles: ").append(toIndentedString(profiles)).append("\n");
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
