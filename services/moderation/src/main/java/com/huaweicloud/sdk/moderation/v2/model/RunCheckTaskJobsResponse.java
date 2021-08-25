package com.huaweicloud.sdk.moderation.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class RunCheckTaskJobsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private List<CheckTaskJobsItemsBody> result = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public RunCheckTaskJobsResponse withResult(List<CheckTaskJobsItemsBody> result) {
        this.result = result;
        return this;
    }

    public RunCheckTaskJobsResponse addResultItem(CheckTaskJobsItemsBody resultItem) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        this.result.add(resultItem);
        return this;
    }

    public RunCheckTaskJobsResponse withResult(Consumer<List<CheckTaskJobsItemsBody>> resultSetter) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        resultSetter.accept(this.result);
        return this;
    }

    /** 调用成功时表示调用结果。 调用失败时无此字段。
     * 
     * @return result */
    public List<CheckTaskJobsItemsBody> getResult() {
        return result;
    }

    public void setResult(List<CheckTaskJobsItemsBody> result) {
        this.result = result;
    }

    public RunCheckTaskJobsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /** 符合查询条件的总任务数量。
     * 
     * @return count */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunCheckTaskJobsResponse runCheckTaskJobsResponse = (RunCheckTaskJobsResponse) o;
        return Objects.equals(this.result, runCheckTaskJobsResponse.result)
            && Objects.equals(this.count, runCheckTaskJobsResponse.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunCheckTaskJobsResponse {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
