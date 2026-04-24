package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 用户使用频次信息。
 */
public class UserUsageFrequencyInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_count")

    private Integer useCount;

    public UserUsageFrequencyInfo withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 桌面用户名。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UserUsageFrequencyInfo withUseCount(Integer useCount) {
        this.useCount = useCount;
        return this;
    }

    /**
     * 用户使用次数。
     * minimum: 0
     * maximum: 10000
     * @return useCount
     */
    public Integer getUseCount() {
        return useCount;
    }

    public void setUseCount(Integer useCount) {
        this.useCount = useCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserUsageFrequencyInfo that = (UserUsageFrequencyInfo) obj;
        return Objects.equals(this.userName, that.userName) && Objects.equals(this.useCount, that.useCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, useCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserUsageFrequencyInfo {\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    useCount: ").append(toIndentedString(useCount)).append("\n");
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
