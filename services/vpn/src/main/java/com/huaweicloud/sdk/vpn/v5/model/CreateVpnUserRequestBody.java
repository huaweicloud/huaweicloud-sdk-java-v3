package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateVpnUserRequestBody
 */
public class CreateVpnUserRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private CreateVpnUserRequestBodyContent user;

    public CreateVpnUserRequestBody withUser(CreateVpnUserRequestBodyContent user) {
        this.user = user;
        return this;
    }

    public CreateVpnUserRequestBody withUser(Consumer<CreateVpnUserRequestBodyContent> userSetter) {
        if (this.user == null) {
            this.user = new CreateVpnUserRequestBodyContent();
            userSetter.accept(this.user);
        }

        return this;
    }

    /**
     * Get user
     * @return user
     */
    public CreateVpnUserRequestBodyContent getUser() {
        return user;
    }

    public void setUser(CreateVpnUserRequestBodyContent user) {
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
        CreateVpnUserRequestBody that = (CreateVpnUserRequestBody) obj;
        return Objects.equals(this.user, that.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVpnUserRequestBody {\n");
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
