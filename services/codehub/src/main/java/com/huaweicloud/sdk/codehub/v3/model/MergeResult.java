package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MergeResult
 */
public class MergeResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "closed")

    private Double closed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mergeRequests")

    private List<MergeRequestsItem> mergeRequests = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merged")

    private Double merged;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "opened")

    private Double opened;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Double total;

    public MergeResult withClosed(Double closed) {
        this.closed = closed;
        return this;
    }

    /**
     * 已关闭合并请求数
     * @return closed
     */
    public Double getClosed() {
        return closed;
    }

    public void setClosed(Double closed) {
        this.closed = closed;
    }

    public MergeResult withMergeRequests(List<MergeRequestsItem> mergeRequests) {
        this.mergeRequests = mergeRequests;
        return this;
    }

    public MergeResult addMergeRequestsItem(MergeRequestsItem mergeRequestsItem) {
        if (this.mergeRequests == null) {
            this.mergeRequests = new ArrayList<>();
        }
        this.mergeRequests.add(mergeRequestsItem);
        return this;
    }

    public MergeResult withMergeRequests(Consumer<List<MergeRequestsItem>> mergeRequestsSetter) {
        if (this.mergeRequests == null) {
            this.mergeRequests = new ArrayList<>();
        }
        mergeRequestsSetter.accept(this.mergeRequests);
        return this;
    }

    /**
     * 合并请求详情
     * @return mergeRequests
     */
    public List<MergeRequestsItem> getMergeRequests() {
        return mergeRequests;
    }

    public void setMergeRequests(List<MergeRequestsItem> mergeRequests) {
        this.mergeRequests = mergeRequests;
    }

    public MergeResult withMerged(Double merged) {
        this.merged = merged;
        return this;
    }

    /**
     * 已合并合并请求数数
     * @return merged
     */
    public Double getMerged() {
        return merged;
    }

    public void setMerged(Double merged) {
        this.merged = merged;
    }

    public MergeResult withOpened(Double opened) {
        this.opened = opened;
        return this;
    }

    /**
     * 开启中合并请求数
     * @return opened
     */
    public Double getOpened() {
        return opened;
    }

    public void setOpened(Double opened) {
        this.opened = opened;
    }

    public MergeResult withTotal(Double total) {
        this.total = total;
        return this;
    }

    /**
     * 合并请求总数
     * @return total
     */
    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MergeResult mergeResult = (MergeResult) o;
        return Objects.equals(this.closed, mergeResult.closed)
            && Objects.equals(this.mergeRequests, mergeResult.mergeRequests)
            && Objects.equals(this.merged, mergeResult.merged) && Objects.equals(this.opened, mergeResult.opened)
            && Objects.equals(this.total, mergeResult.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(closed, mergeRequests, merged, opened, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MergeResult {\n");
        sb.append("    closed: ").append(toIndentedString(closed)).append("\n");
        sb.append("    mergeRequests: ").append(toIndentedString(mergeRequests)).append("\n");
        sb.append("    merged: ").append(toIndentedString(merged)).append("\n");
        sb.append("    opened: ").append(toIndentedString(opened)).append("\n");
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
