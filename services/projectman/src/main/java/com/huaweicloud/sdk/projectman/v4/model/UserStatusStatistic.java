package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UserStatusStatistic
 */
public class UserStatusStatistic {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private IssueUser user;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_count")

    private Integer itemCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private Map<String, Integer> data = null;

    public UserStatusStatistic withUser(IssueUser user) {
        this.user = user;
        return this;
    }

    public UserStatusStatistic withUser(Consumer<IssueUser> userSetter) {
        if (this.user == null) {
            this.user = new IssueUser();
            userSetter.accept(this.user);
        }

        return this;
    }

    /**
     * Get user
     * @return user
     */
    public IssueUser getUser() {
        return user;
    }

    public void setUser(IssueUser user) {
        this.user = user;
    }

    public UserStatusStatistic withItemCount(Integer itemCount) {
        this.itemCount = itemCount;
        return this;
    }

    /**
     * 满足条件的工作项总数
     * @return itemCount
     */
    public Integer getItemCount() {
        return itemCount;
    }

    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    public UserStatusStatistic withData(Map<String, Integer> data) {
        this.data = data;
        return this;
    }

    public UserStatusStatistic putDataItem(String key, Integer dataItem) {
        if (this.data == null) {
            this.data = new HashMap<>();
        }
        this.data.put(key, dataItem);
        return this;
    }

    public UserStatusStatistic withData(Consumer<Map<String, Integer>> dataSetter) {
        if (this.data == null) {
            this.data = new HashMap<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * 工作项对应状态的统计计数
     * @return data
     */
    public Map<String, Integer> getData() {
        return data;
    }

    public void setData(Map<String, Integer> data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserStatusStatistic userStatusStatistic = (UserStatusStatistic) o;
        return Objects.equals(this.user, userStatusStatistic.user)
            && Objects.equals(this.itemCount, userStatusStatistic.itemCount)
            && Objects.equals(this.data, userStatusStatistic.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, itemCount, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserStatusStatistic {\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    itemCount: ").append(toIndentedString(itemCount)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
