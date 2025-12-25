package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListNotificationMaskResourcesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_mask_id")

    private String notificationMaskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListNotificationMaskResourcesRequest withNotificationMaskId(String notificationMaskId) {
        this.notificationMaskId = notificationMaskId;
        return this;
    }

    /**
     * **参数解释**： 屏蔽规则ID。    **约束限制**： 不涉及。 **取值范围**： 只能包含字母、数字，长度为[1,64]个字符。           **默认取值**： 不涉及。 
     * @return notificationMaskId
     */
    public String getNotificationMaskId() {
        return notificationMaskId;
    }

    public void setNotificationMaskId(String notificationMaskId) {
        this.notificationMaskId = notificationMaskId;
    }

    public ListNotificationMaskResourcesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**： 分页偏移量 **约束限制**： 不涉及 **取值范围**： 整数，[0,10000] **默认取值**： 0 
     * minimum: 0
     * maximum: 10000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListNotificationMaskResourcesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**： 分页大小 **约束限制**： 不涉及 **取值范围**： 整数，[1,100] **默认取值**： 100 
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListNotificationMaskResourcesRequest that = (ListNotificationMaskResourcesRequest) obj;
        return Objects.equals(this.notificationMaskId, that.notificationMaskId)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notificationMaskId, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNotificationMaskResourcesRequest {\n");
        sb.append("    notificationMaskId: ").append(toIndentedString(notificationMaskId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
