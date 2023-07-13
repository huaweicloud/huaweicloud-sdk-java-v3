package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
public class ListRestoreTimesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_time")

    private List<GetRestoreTimeResponseRestoreTime> restoreTime = null;

    public ListRestoreTimesResponse withRestoreTime(List<GetRestoreTimeResponseRestoreTime> restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }

    public ListRestoreTimesResponse addRestoreTimeItem(GetRestoreTimeResponseRestoreTime restoreTimeItem) {
        if (this.restoreTime == null) {
            this.restoreTime = new ArrayList<>();
        }
        this.restoreTime.add(restoreTimeItem);
        return this;
    }

    public ListRestoreTimesResponse withRestoreTime(
        Consumer<List<GetRestoreTimeResponseRestoreTime>> restoreTimeSetter) {
        if (this.restoreTime == null) {
            this.restoreTime = new ArrayList<>();
        }
        restoreTimeSetter.accept(this.restoreTime);
        return this;
    }

    /**
     * 可恢复时间段列表。
     * @return restoreTime
     */
    public List<GetRestoreTimeResponseRestoreTime> getRestoreTime() {
        return restoreTime;
    }

    public void setRestoreTime(List<GetRestoreTimeResponseRestoreTime> restoreTime) {
        this.restoreTime = restoreTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRestoreTimesResponse that = (ListRestoreTimesResponse) obj;
        return Objects.equals(this.restoreTime, that.restoreTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(restoreTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRestoreTimesResponse {\n");
        sb.append("    restoreTime: ").append(toIndentedString(restoreTime)).append("\n");
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
