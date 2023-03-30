package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListSelfPrivilegesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_privileges")

    private List<UserPrivilegeInfo> userPrivileges = null;

    public ListSelfPrivilegesResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 总数
     * minimum: 0
     * maximum: 2147483647
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListSelfPrivilegesResponse withUserPrivileges(List<UserPrivilegeInfo> userPrivileges) {
        this.userPrivileges = userPrivileges;
        return this;
    }

    public ListSelfPrivilegesResponse addUserPrivilegesItem(UserPrivilegeInfo userPrivilegesItem) {
        if (this.userPrivileges == null) {
            this.userPrivileges = new ArrayList<>();
        }
        this.userPrivileges.add(userPrivilegesItem);
        return this;
    }

    public ListSelfPrivilegesResponse withUserPrivileges(Consumer<List<UserPrivilegeInfo>> userPrivilegesSetter) {
        if (this.userPrivileges == null) {
            this.userPrivileges = new ArrayList<>();
        }
        userPrivilegesSetter.accept(this.userPrivileges);
        return this;
    }

    /**
     * 权限列表信息
     * @return userPrivileges
     */
    public List<UserPrivilegeInfo> getUserPrivileges() {
        return userPrivileges;
    }

    public void setUserPrivileges(List<UserPrivilegeInfo> userPrivileges) {
        this.userPrivileges = userPrivileges;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSelfPrivilegesResponse listSelfPrivilegesResponse = (ListSelfPrivilegesResponse) o;
        return Objects.equals(this.count, listSelfPrivilegesResponse.count)
            && Objects.equals(this.userPrivileges, listSelfPrivilegesResponse.userPrivileges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, userPrivileges);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSelfPrivilegesResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    userPrivileges: ").append(toIndentedString(userPrivileges)).append("\n");
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
