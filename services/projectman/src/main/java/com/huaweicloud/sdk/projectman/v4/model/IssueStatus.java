package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * IssueStatus
 */
public class IssueStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_id")

    private Integer statusId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tracker_ids")

    private List<Integer> trackerIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_attribute")

    private StatusAttribute statusAttribute;

    public IssueStatus withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 状态uuid
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public IssueStatus withStatusId(Integer statusId) {
        this.statusId = statusId;
        return this;
    }

    /**
     * 状态数字id
     * @return statusId
     */
    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public IssueStatus withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 状态名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IssueStatus withTrackerIds(List<Integer> trackerIds) {
        this.trackerIds = trackerIds;
        return this;
    }

    public IssueStatus addTrackerIdsItem(Integer trackerIdsItem) {
        if (this.trackerIds == null) {
            this.trackerIds = new ArrayList<>();
        }
        this.trackerIds.add(trackerIdsItem);
        return this;
    }

    public IssueStatus withTrackerIds(Consumer<List<Integer>> trackerIdsSetter) {
        if (this.trackerIds == null) {
            this.trackerIds = new ArrayList<>();
        }
        trackerIdsSetter.accept(this.trackerIds);
        return this;
    }

    /**
     * 关联的工作项类型列表
     * @return trackerIds
     */
    public List<Integer> getTrackerIds() {
        return trackerIds;
    }

    public void setTrackerIds(List<Integer> trackerIds) {
        this.trackerIds = trackerIds;
    }

    public IssueStatus withStatusAttribute(StatusAttribute statusAttribute) {
        this.statusAttribute = statusAttribute;
        return this;
    }

    public IssueStatus withStatusAttribute(Consumer<StatusAttribute> statusAttributeSetter) {
        if (this.statusAttribute == null) {
            this.statusAttribute = new StatusAttribute();
            statusAttributeSetter.accept(this.statusAttribute);
        }

        return this;
    }

    /**
     * Get statusAttribute
     * @return statusAttribute
     */
    public StatusAttribute getStatusAttribute() {
        return statusAttribute;
    }

    public void setStatusAttribute(StatusAttribute statusAttribute) {
        this.statusAttribute = statusAttribute;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IssueStatus that = (IssueStatus) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.statusId, that.statusId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.trackerIds, that.trackerIds)
            && Objects.equals(this.statusAttribute, that.statusAttribute);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, statusId, name, trackerIds, statusAttribute);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueStatus {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    statusId: ").append(toIndentedString(statusId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    trackerIds: ").append(toIndentedString(trackerIds)).append("\n");
        sb.append("    statusAttribute: ").append(toIndentedString(statusAttribute)).append("\n");
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
