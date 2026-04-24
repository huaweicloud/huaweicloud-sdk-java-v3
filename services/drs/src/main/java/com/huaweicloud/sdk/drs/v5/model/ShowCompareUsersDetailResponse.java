package com.huaweicloud.sdk.drs.v5.model;

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
public class ShowCompareUsersDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_compare_info")

    private List<CompareUserInfo> userCompareInfo = null;

    public ShowCompareUsersDetailResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 用户对比信息的总数
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ShowCompareUsersDetailResponse withUserCompareInfo(List<CompareUserInfo> userCompareInfo) {
        this.userCompareInfo = userCompareInfo;
        return this;
    }

    public ShowCompareUsersDetailResponse addUserCompareInfoItem(CompareUserInfo userCompareInfoItem) {
        if (this.userCompareInfo == null) {
            this.userCompareInfo = new ArrayList<>();
        }
        this.userCompareInfo.add(userCompareInfoItem);
        return this;
    }

    public ShowCompareUsersDetailResponse withUserCompareInfo(Consumer<List<CompareUserInfo>> userCompareInfoSetter) {
        if (this.userCompareInfo == null) {
            this.userCompareInfo = new ArrayList<>();
        }
        userCompareInfoSetter.accept(this.userCompareInfo);
        return this;
    }

    /**
     * 用户对比信息
     * @return userCompareInfo
     */
    public List<CompareUserInfo> getUserCompareInfo() {
        return userCompareInfo;
    }

    public void setUserCompareInfo(List<CompareUserInfo> userCompareInfo) {
        this.userCompareInfo = userCompareInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowCompareUsersDetailResponse that = (ShowCompareUsersDetailResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.userCompareInfo, that.userCompareInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, userCompareInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCompareUsersDetailResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    userCompareInfo: ").append(toIndentedString(userCompareInfo)).append("\n");
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
