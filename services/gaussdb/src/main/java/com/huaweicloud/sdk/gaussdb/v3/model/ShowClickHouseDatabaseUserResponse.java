package com.huaweicloud.sdk.gaussdb.v3.model;

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
public class ShowClickHouseDatabaseUserResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_details")

    private List<ShowClickHouseDatabaseUsersUserDetails> userDetails = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ShowClickHouseDatabaseUserResponse withUserDetails(
        List<ShowClickHouseDatabaseUsersUserDetails> userDetails) {
        this.userDetails = userDetails;
        return this;
    }

    public ShowClickHouseDatabaseUserResponse addUserDetailsItem(
        ShowClickHouseDatabaseUsersUserDetails userDetailsItem) {
        if (this.userDetails == null) {
            this.userDetails = new ArrayList<>();
        }
        this.userDetails.add(userDetailsItem);
        return this;
    }

    public ShowClickHouseDatabaseUserResponse withUserDetails(
        Consumer<List<ShowClickHouseDatabaseUsersUserDetails>> userDetailsSetter) {
        if (this.userDetails == null) {
            this.userDetails = new ArrayList<>();
        }
        userDetailsSetter.accept(this.userDetails);
        return this;
    }

    /**
     * 数据库账户信息。
     * @return userDetails
     */
    public List<ShowClickHouseDatabaseUsersUserDetails> getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(List<ShowClickHouseDatabaseUsersUserDetails> userDetails) {
        this.userDetails = userDetails;
    }

    public ShowClickHouseDatabaseUserResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 数据库账户数量。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowClickHouseDatabaseUserResponse that = (ShowClickHouseDatabaseUserResponse) obj;
        return Objects.equals(this.userDetails, that.userDetails) && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userDetails, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowClickHouseDatabaseUserResponse {\n");
        sb.append("    userDetails: ").append(toIndentedString(userDetails)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
