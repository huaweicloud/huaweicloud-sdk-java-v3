package com.huaweicloud.sdk.kafka.v2.model;

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
public class BatchDeleteGroupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_groups")

    private List<BatchDeleteGroupRespFailedGroups> failedGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public BatchDeleteGroupResponse withFailedGroups(List<BatchDeleteGroupRespFailedGroups> failedGroups) {
        this.failedGroups = failedGroups;
        return this;
    }

    public BatchDeleteGroupResponse addFailedGroupsItem(BatchDeleteGroupRespFailedGroups failedGroupsItem) {
        if (this.failedGroups == null) {
            this.failedGroups = new ArrayList<>();
        }
        this.failedGroups.add(failedGroupsItem);
        return this;
    }

    public BatchDeleteGroupResponse withFailedGroups(
        Consumer<List<BatchDeleteGroupRespFailedGroups>> failedGroupsSetter) {
        if (this.failedGroups == null) {
            this.failedGroups = new ArrayList<>();
        }
        failedGroupsSetter.accept(this.failedGroups);
        return this;
    }

    /**
     * 删除失败的消费组列表。
     * @return failedGroups
     */
    public List<BatchDeleteGroupRespFailedGroups> getFailedGroups() {
        return failedGroups;
    }

    public void setFailedGroups(List<BatchDeleteGroupRespFailedGroups> failedGroups) {
        this.failedGroups = failedGroups;
    }

    public BatchDeleteGroupResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 删除失败的个数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteGroupResponse that = (BatchDeleteGroupResponse) obj;
        return Objects.equals(this.failedGroups, that.failedGroups) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(failedGroups, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteGroupResponse {\n");
        sb.append("    failedGroups: ").append(toIndentedString(failedGroups)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
