package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

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
public class ListRedisPitrRestoreTimeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_time")

    private List<String> restoreTime = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListRedisPitrRestoreTimeResponse withRestoreTime(List<String> restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }

    public ListRedisPitrRestoreTimeResponse addRestoreTimeItem(String restoreTimeItem) {
        if (this.restoreTime == null) {
            this.restoreTime = new ArrayList<>();
        }
        this.restoreTime.add(restoreTimeItem);
        return this;
    }

    public ListRedisPitrRestoreTimeResponse withRestoreTime(Consumer<List<String>> restoreTimeSetter) {
        if (this.restoreTime == null) {
            this.restoreTime = new ArrayList<>();
        }
        restoreTimeSetter.accept(this.restoreTime);
        return this;
    }

    /**
     * Redis可恢复时间点列表。 yyyy-mm-ddThh:mm:ssZ字符串格式，T指某个时间的开始，Z指时区偏移量。
     * @return restoreTime
     */
    public List<String> getRestoreTime() {
        return restoreTime;
    }

    public void setRestoreTime(List<String> restoreTime) {
        this.restoreTime = restoreTime;
    }

    public ListRedisPitrRestoreTimeResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * Redis实例可恢复时间点总数。
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
        ListRedisPitrRestoreTimeResponse that = (ListRedisPitrRestoreTimeResponse) obj;
        return Objects.equals(this.restoreTime, that.restoreTime) && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(restoreTime, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRedisPitrRestoreTimeResponse {\n");
        sb.append("    restoreTime: ").append(toIndentedString(restoreTime)).append("\n");
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
