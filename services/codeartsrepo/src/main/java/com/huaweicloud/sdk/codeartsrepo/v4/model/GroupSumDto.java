package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GroupSumDto
 */
public class GroupSumDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "open_merge_requests_count")

    private Integer openMergeRequestsCount;

    public GroupSumDto withOpenMergeRequestsCount(Integer openMergeRequestsCount) {
        this.openMergeRequestsCount = openMergeRequestsCount;
        return this;
    }

    /**
     * 打开状态MR计数
     * minimum: 0
     * maximum: 2147483647
     * @return openMergeRequestsCount
     */
    public Integer getOpenMergeRequestsCount() {
        return openMergeRequestsCount;
    }

    public void setOpenMergeRequestsCount(Integer openMergeRequestsCount) {
        this.openMergeRequestsCount = openMergeRequestsCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GroupSumDto that = (GroupSumDto) obj;
        return Objects.equals(this.openMergeRequestsCount, that.openMergeRequestsCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(openMergeRequestsCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GroupSumDto {\n");
        sb.append("    openMergeRequestsCount: ").append(toIndentedString(openMergeRequestsCount)).append("\n");
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
