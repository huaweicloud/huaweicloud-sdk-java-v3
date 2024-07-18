package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateVpnUserRequestBody
 */
public class UpdateVpnUserRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private UpdateVpnUserRequestBodyContent user;

    public UpdateVpnUserRequestBody withUser(UpdateVpnUserRequestBodyContent user) {
        this.user = user;
        return this;
    }

    public UpdateVpnUserRequestBody withUser(Consumer<UpdateVpnUserRequestBodyContent> userSetter) {
        if (this.user == null) {
            this.user = new UpdateVpnUserRequestBodyContent();
            userSetter.accept(this.user);
        }

        return this;
    }

    /**
     * Get user
     * @return user
     */
    public UpdateVpnUserRequestBodyContent getUser() {
        return user;
    }

    public void setUser(UpdateVpnUserRequestBodyContent user) {
        this.user = user;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateVpnUserRequestBody that = (UpdateVpnUserRequestBody) obj;
        return Objects.equals(this.user, that.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVpnUserRequestBody {\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
