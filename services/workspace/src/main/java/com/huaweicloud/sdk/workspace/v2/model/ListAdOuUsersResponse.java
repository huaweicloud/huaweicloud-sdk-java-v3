package com.huaweicloud.sdk.workspace.v2.model;

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
public class ListAdOuUsersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_infos")

    private List<AdOuUserInfo> userInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_create_count")

    private Integer enableCreateCount;

    public ListAdOuUsersResponse withUserInfos(List<AdOuUserInfo> userInfos) {
        this.userInfos = userInfos;
        return this;
    }

    public ListAdOuUsersResponse addUserInfosItem(AdOuUserInfo userInfosItem) {
        if (this.userInfos == null) {
            this.userInfos = new ArrayList<>();
        }
        this.userInfos.add(userInfosItem);
        return this;
    }

    public ListAdOuUsersResponse withUserInfos(Consumer<List<AdOuUserInfo>> userInfosSetter) {
        if (this.userInfos == null) {
            this.userInfos = new ArrayList<>();
        }
        userInfosSetter.accept(this.userInfos);
        return this;
    }

    /**
     * OU对象
     * @return userInfos
     */
    public List<AdOuUserInfo> getUserInfos() {
        return userInfos;
    }

    public void setUserInfos(List<AdOuUserInfo> userInfos) {
        this.userInfos = userInfos;
    }

    public ListAdOuUsersResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 用户数
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListAdOuUsersResponse withEnableCreateCount(Integer enableCreateCount) {
        this.enableCreateCount = enableCreateCount;
        return this;
    }

    /**
     * 可以创建的用户数量
     * @return enableCreateCount
     */
    public Integer getEnableCreateCount() {
        return enableCreateCount;
    }

    public void setEnableCreateCount(Integer enableCreateCount) {
        this.enableCreateCount = enableCreateCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAdOuUsersResponse that = (ListAdOuUsersResponse) obj;
        return Objects.equals(this.userInfos, that.userInfos) && Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.enableCreateCount, that.enableCreateCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userInfos, totalCount, enableCreateCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAdOuUsersResponse {\n");
        sb.append("    userInfos: ").append(toIndentedString(userInfos)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    enableCreateCount: ").append(toIndentedString(enableCreateCount)).append("\n");
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
