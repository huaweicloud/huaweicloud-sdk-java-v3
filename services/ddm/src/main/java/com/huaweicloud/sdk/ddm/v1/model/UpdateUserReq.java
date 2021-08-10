package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** This is a auto update request Object */
public class UpdateUserReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private UpdateUserDetailReq user;

    public UpdateUserReq withUser(UpdateUserDetailReq user) {
        this.user = user;
        return this;
    }

    public UpdateUserReq withUser(Consumer<UpdateUserDetailReq> userSetter) {
        if (this.user == null) {
            this.user = new UpdateUserDetailReq();
            userSetter.accept(this.user);
        }

        return this;
    }

    /** Get user
     * 
     * @return user */
    public UpdateUserDetailReq getUser() {
        return user;
    }

    public void setUser(UpdateUserDetailReq user) {
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
        UpdateUserReq updateUserReq = (UpdateUserReq) o;
        return Objects.equals(this.user, updateUserReq.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateUserReq {\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
