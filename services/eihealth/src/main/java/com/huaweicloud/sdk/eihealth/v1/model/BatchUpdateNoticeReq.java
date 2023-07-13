package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchUpdateNoticeReq
 */
public class BatchUpdateNoticeReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notice_ids")

    private List<String> noticeIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation")

    private NoticeOperation operation;

    public BatchUpdateNoticeReq withNoticeIds(List<String> noticeIds) {
        this.noticeIds = noticeIds;
        return this;
    }

    public BatchUpdateNoticeReq addNoticeIdsItem(String noticeIdsItem) {
        if (this.noticeIds == null) {
            this.noticeIds = new ArrayList<>();
        }
        this.noticeIds.add(noticeIdsItem);
        return this;
    }

    public BatchUpdateNoticeReq withNoticeIds(Consumer<List<String>> noticeIdsSetter) {
        if (this.noticeIds == null) {
            this.noticeIds = new ArrayList<>();
        }
        noticeIdsSetter.accept(this.noticeIds);
        return this;
    }

    /**
     * 批量更新通知消息id列表
     * @return noticeIds
     */
    public List<String> getNoticeIds() {
        return noticeIds;
    }

    public void setNoticeIds(List<String> noticeIds) {
        this.noticeIds = noticeIds;
    }

    public BatchUpdateNoticeReq withOperation(NoticeOperation operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get operation
     * @return operation
     */
    public NoticeOperation getOperation() {
        return operation;
    }

    public void setOperation(NoticeOperation operation) {
        this.operation = operation;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchUpdateNoticeReq that = (BatchUpdateNoticeReq) obj;
        return Objects.equals(this.noticeIds, that.noticeIds) && Objects.equals(this.operation, that.operation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(noticeIds, operation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdateNoticeReq {\n");
        sb.append("    noticeIds: ").append(toIndentedString(noticeIds)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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
