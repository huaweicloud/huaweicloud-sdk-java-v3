package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchDeleteNoticeReq
 */
public class BatchDeleteNoticeReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notice_ids")

    private List<String> noticeIds = null;

    public BatchDeleteNoticeReq withNoticeIds(List<String> noticeIds) {
        this.noticeIds = noticeIds;
        return this;
    }

    public BatchDeleteNoticeReq addNoticeIdsItem(String noticeIdsItem) {
        if (this.noticeIds == null) {
            this.noticeIds = new ArrayList<>();
        }
        this.noticeIds.add(noticeIdsItem);
        return this;
    }

    public BatchDeleteNoticeReq withNoticeIds(Consumer<List<String>> noticeIdsSetter) {
        if (this.noticeIds == null) {
            this.noticeIds = new ArrayList<>();
        }
        noticeIdsSetter.accept(this.noticeIds);
        return this;
    }

    /**
     * 批量删除通知消息id列表
     * @return noticeIds
     */
    public List<String> getNoticeIds() {
        return noticeIds;
    }

    public void setNoticeIds(List<String> noticeIds) {
        this.noticeIds = noticeIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchDeleteNoticeReq batchDeleteNoticeReq = (BatchDeleteNoticeReq) o;
        return Objects.equals(this.noticeIds, batchDeleteNoticeReq.noticeIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(noticeIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteNoticeReq {\n");
        sb.append("    noticeIds: ").append(toIndentedString(noticeIds)).append("\n");
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
