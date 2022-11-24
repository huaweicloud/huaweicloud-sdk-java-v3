package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class AgencyAssumedby {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private AgencyAssumedbyUser user;

    public AgencyAssumedby withUser(AgencyAssumedbyUser user) {
        this.user = user;
        return this;
    }

    public AgencyAssumedby withUser(Consumer<AgencyAssumedbyUser> userSetter) {
        if (this.user == null) {
            this.user = new AgencyAssumedbyUser();
            userSetter.accept(this.user);
        }

        return this;
    }

    /**
     * Get user
     * @return user
     */
    public AgencyAssumedbyUser getUser() {
        return user;
    }

    public void setUser(AgencyAssumedbyUser user) {
        this.user = user;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AgencyAssumedby agencyAssumedby = (AgencyAssumedby) o;
        return Objects.equals(this.user, agencyAssumedby.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgencyAssumedby {\n");
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
