package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListUserDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_detail")

    private UserDetail userDetail;

    public ListUserDetailResponse withUserDetail(UserDetail userDetail) {
        this.userDetail = userDetail;
        return this;
    }

    public ListUserDetailResponse withUserDetail(Consumer<UserDetail> userDetailSetter) {
        if (this.userDetail == null) {
            this.userDetail = new UserDetail();
            userDetailSetter.accept(this.userDetail);
        }

        return this;
    }

    /**
     * Get userDetail
     * @return userDetail
     */
    public UserDetail getUserDetail() {
        return userDetail;
    }

    public void setUserDetail(UserDetail userDetail) {
        this.userDetail = userDetail;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListUserDetailResponse listUserDetailResponse = (ListUserDetailResponse) o;
        return Objects.equals(this.userDetail, listUserDetailResponse.userDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userDetail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUserDetailResponse {\n");
        sb.append("    userDetail: ").append(toIndentedString(userDetail)).append("\n");
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
