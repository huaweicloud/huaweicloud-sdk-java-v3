package com.huaweicloud.sdk.eihealth.v1.model;

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
public class ListNoticeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unread_count")

    private Integer unreadCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notices")

    private List<NoticeRsp> notices = null;

    public ListNoticeResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 通知消息总数
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListNoticeResponse withUnreadCount(Integer unreadCount) {
        this.unreadCount = unreadCount;
        return this;
    }

    /**
     * 通知消息未读总数
     * @return unreadCount
     */
    public Integer getUnreadCount() {
        return unreadCount;
    }

    public void setUnreadCount(Integer unreadCount) {
        this.unreadCount = unreadCount;
    }

    public ListNoticeResponse withNotices(List<NoticeRsp> notices) {
        this.notices = notices;
        return this;
    }

    public ListNoticeResponse addNoticesItem(NoticeRsp noticesItem) {
        if (this.notices == null) {
            this.notices = new ArrayList<>();
        }
        this.notices.add(noticesItem);
        return this;
    }

    public ListNoticeResponse withNotices(Consumer<List<NoticeRsp>> noticesSetter) {
        if (this.notices == null) {
            this.notices = new ArrayList<>();
        }
        noticesSetter.accept(this.notices);
        return this;
    }

    /**
     * 通知消息列表
     * @return notices
     */
    public List<NoticeRsp> getNotices() {
        return notices;
    }

    public void setNotices(List<NoticeRsp> notices) {
        this.notices = notices;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListNoticeResponse that = (ListNoticeResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.unreadCount, that.unreadCount)
            && Objects.equals(this.notices, that.notices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, unreadCount, notices);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNoticeResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    unreadCount: ").append(toIndentedString(unreadCount)).append("\n");
        sb.append("    notices: ").append(toIndentedString(notices)).append("\n");
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
