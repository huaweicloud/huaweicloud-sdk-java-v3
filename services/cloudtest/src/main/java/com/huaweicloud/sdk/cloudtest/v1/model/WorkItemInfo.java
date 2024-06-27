package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 关联需求
 */
public class WorkItemInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "work_item_id")

    private String workItemId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_child")

    private Boolean hasChild;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_open")

    private Boolean isOpen;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "child_list")

    private List<WorkItemInfo> childList = null;

    public WorkItemInfo withWorkItemId(String workItemId) {
        this.workItemId = workItemId;
        return this;
    }

    /**
     * 工作项编号
     * @return workItemId
     */
    public String getWorkItemId() {
        return workItemId;
    }

    public void setWorkItemId(String workItemId) {
        this.workItemId = workItemId;
    }

    public WorkItemInfo withHasChild(Boolean hasChild) {
        this.hasChild = hasChild;
        return this;
    }

    /**
     * 是否有子需求
     * @return hasChild
     */
    public Boolean getHasChild() {
        return hasChild;
    }

    public void setHasChild(Boolean hasChild) {
        this.hasChild = hasChild;
    }

    public WorkItemInfo withIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
        return this;
    }

    /**
     * 是否展开
     * @return isOpen
     */
    public Boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
    }

    public WorkItemInfo withChildList(List<WorkItemInfo> childList) {
        this.childList = childList;
        return this;
    }

    public WorkItemInfo addChildListItem(WorkItemInfo childListItem) {
        if (this.childList == null) {
            this.childList = new ArrayList<>();
        }
        this.childList.add(childListItem);
        return this;
    }

    public WorkItemInfo withChildList(Consumer<List<WorkItemInfo>> childListSetter) {
        if (this.childList == null) {
            this.childList = new ArrayList<>();
        }
        childListSetter.accept(this.childList);
        return this;
    }

    /**
     * 子需求
     * @return childList
     */
    public List<WorkItemInfo> getChildList() {
        return childList;
    }

    public void setChildList(List<WorkItemInfo> childList) {
        this.childList = childList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkItemInfo that = (WorkItemInfo) obj;
        return Objects.equals(this.workItemId, that.workItemId) && Objects.equals(this.hasChild, that.hasChild)
            && Objects.equals(this.isOpen, that.isOpen) && Objects.equals(this.childList, that.childList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workItemId, hasChild, isOpen, childList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkItemInfo {\n");
        sb.append("    workItemId: ").append(toIndentedString(workItemId)).append("\n");
        sb.append("    hasChild: ").append(toIndentedString(hasChild)).append("\n");
        sb.append("    isOpen: ").append(toIndentedString(isOpen)).append("\n");
        sb.append("    childList: ").append(toIndentedString(childList)).append("\n");
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
