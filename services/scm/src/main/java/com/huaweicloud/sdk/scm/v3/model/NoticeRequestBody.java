package com.huaweicloud.sdk.scm.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * NoticeRequestBody
 */
public class NoticeRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notice_type")

    private List<String> noticeType = null;

    public NoticeRequestBody withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源ID。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public NoticeRequestBody withNoticeType(List<String> noticeType) {
        this.noticeType = noticeType;
        return this;
    }

    public NoticeRequestBody addNoticeTypeItem(String noticeTypeItem) {
        if (this.noticeType == null) {
            this.noticeType = new ArrayList<>();
        }
        this.noticeType.add(noticeTypeItem);
        return this;
    }

    public NoticeRequestBody withNoticeType(Consumer<List<String>> noticeTypeSetter) {
        if (this.noticeType == null) {
            this.noticeType = new ArrayList<>();
        }
        noticeTypeSetter.accept(this.noticeType);
        return this;
    }

    /**
     * 提醒类型，取值如下： - CERT_EXPIRING(证书到期) - CERT_EXPIRED(证书过期)
     * @return noticeType
     */
    public List<String> getNoticeType() {
        return noticeType;
    }

    public void setNoticeType(List<String> noticeType) {
        this.noticeType = noticeType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NoticeRequestBody that = (NoticeRequestBody) obj;
        return Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.noticeType, that.noticeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId, noticeType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NoticeRequestBody {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    noticeType: ").append(toIndentedString(noticeType)).append("\n");
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
