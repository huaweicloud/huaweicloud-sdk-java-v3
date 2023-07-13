package com.huaweicloud.sdk.ram.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SearchResourceShareInvitationReqBody
 */
public class SearchResourceShareInvitationReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_share_ids")

    private List<String> resourceShareIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_share_invitation_ids")

    private List<String> resourceShareInvitationIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    public SearchResourceShareInvitationReqBody withResourceShareIds(List<String> resourceShareIds) {
        this.resourceShareIds = resourceShareIds;
        return this;
    }

    public SearchResourceShareInvitationReqBody addResourceShareIdsItem(String resourceShareIdsItem) {
        if (this.resourceShareIds == null) {
            this.resourceShareIds = new ArrayList<>();
        }
        this.resourceShareIds.add(resourceShareIdsItem);
        return this;
    }

    public SearchResourceShareInvitationReqBody withResourceShareIds(Consumer<List<String>> resourceShareIdsSetter) {
        if (this.resourceShareIds == null) {
            this.resourceShareIds = new ArrayList<>();
        }
        resourceShareIdsSetter.accept(this.resourceShareIds);
        return this;
    }

    /**
     * 资源共享实例的ID列表。
     * @return resourceShareIds
     */
    public List<String> getResourceShareIds() {
        return resourceShareIds;
    }

    public void setResourceShareIds(List<String> resourceShareIds) {
        this.resourceShareIds = resourceShareIds;
    }

    public SearchResourceShareInvitationReqBody withResourceShareInvitationIds(
        List<String> resourceShareInvitationIds) {
        this.resourceShareInvitationIds = resourceShareInvitationIds;
        return this;
    }

    public SearchResourceShareInvitationReqBody addResourceShareInvitationIdsItem(
        String resourceShareInvitationIdsItem) {
        if (this.resourceShareInvitationIds == null) {
            this.resourceShareInvitationIds = new ArrayList<>();
        }
        this.resourceShareInvitationIds.add(resourceShareInvitationIdsItem);
        return this;
    }

    public SearchResourceShareInvitationReqBody withResourceShareInvitationIds(
        Consumer<List<String>> resourceShareInvitationIdsSetter) {
        if (this.resourceShareInvitationIds == null) {
            this.resourceShareInvitationIds = new ArrayList<>();
        }
        resourceShareInvitationIdsSetter.accept(this.resourceShareInvitationIds);
        return this;
    }

    /**
     * 资源共享邀请的ID列表。
     * @return resourceShareInvitationIds
     */
    public List<String> getResourceShareInvitationIds() {
        return resourceShareInvitationIds;
    }

    public void setResourceShareInvitationIds(List<String> resourceShareInvitationIds) {
        this.resourceShareInvitationIds = resourceShareInvitationIds;
    }

    public SearchResourceShareInvitationReqBody withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 资源共享邀请的当前状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SearchResourceShareInvitationReqBody withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页页面的最大值。
     * minimum: 1
     * maximum: 2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public SearchResourceShareInvitationReqBody withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 分页位置标识。从marker指定索引的下一条数据开始查询。查询第一页数据时，不需要传入此参数，查询后续页码数据时，将查询前一页数据响应体中marker值配入此参数。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchResourceShareInvitationReqBody that = (SearchResourceShareInvitationReqBody) obj;
        return Objects.equals(this.resourceShareIds, that.resourceShareIds)
            && Objects.equals(this.resourceShareInvitationIds, that.resourceShareInvitationIds)
            && Objects.equals(this.status, that.status) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.marker, that.marker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceShareIds, resourceShareInvitationIds, status, limit, marker);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchResourceShareInvitationReqBody {\n");
        sb.append("    resourceShareIds: ").append(toIndentedString(resourceShareIds)).append("\n");
        sb.append("    resourceShareInvitationIds: ").append(toIndentedString(resourceShareInvitationIds)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
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
