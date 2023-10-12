package com.huaweicloud.sdk.ces.v2.model;

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
public class BatchUpdateNotificationMasksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation_ids")

    private List<String> relationIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_mask_id")

    private String notificationMaskId;

    public BatchUpdateNotificationMasksResponse withRelationIds(List<String> relationIds) {
        this.relationIds = relationIds;
        return this;
    }

    public BatchUpdateNotificationMasksResponse addRelationIdsItem(String relationIdsItem) {
        if (this.relationIds == null) {
            this.relationIds = new ArrayList<>();
        }
        this.relationIds.add(relationIdsItem);
        return this;
    }

    public BatchUpdateNotificationMasksResponse withRelationIds(Consumer<List<String>> relationIdsSetter) {
        if (this.relationIds == null) {
            this.relationIds = new ArrayList<>();
        }
        relationIdsSetter.accept(this.relationIds);
        return this;
    }

    /**
     * 创建成功的关联ID列表
     * @return relationIds
     */
    public List<String> getRelationIds() {
        return relationIds;
    }

    public void setRelationIds(List<String> relationIds) {
        this.relationIds = relationIds;
    }

    public BatchUpdateNotificationMasksResponse withNotificationMaskId(String notificationMaskId) {
        this.notificationMaskId = notificationMaskId;
        return this;
    }

    /**
     * 屏蔽规则ID
     * @return notificationMaskId
     */
    public String getNotificationMaskId() {
        return notificationMaskId;
    }

    public void setNotificationMaskId(String notificationMaskId) {
        this.notificationMaskId = notificationMaskId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchUpdateNotificationMasksResponse that = (BatchUpdateNotificationMasksResponse) obj;
        return Objects.equals(this.relationIds, that.relationIds)
            && Objects.equals(this.notificationMaskId, that.notificationMaskId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(relationIds, notificationMaskId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdateNotificationMasksResponse {\n");
        sb.append("    relationIds: ").append(toIndentedString(relationIds)).append("\n");
        sb.append("    notificationMaskId: ").append(toIndentedString(notificationMaskId)).append("\n");
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
