package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 从迭代中移除需求API Body信息
 */
public class RemoveIssuesInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workitem_list")

    private List<WorkItemInfo> workitemList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_delete_case")

    private Boolean isDeleteCase;

    public RemoveIssuesInfo withWorkitemList(List<WorkItemInfo> workitemList) {
        this.workitemList = workitemList;
        return this;
    }

    public RemoveIssuesInfo addWorkitemListItem(WorkItemInfo workitemListItem) {
        if (this.workitemList == null) {
            this.workitemList = new ArrayList<>();
        }
        this.workitemList.add(workitemListItem);
        return this;
    }

    public RemoveIssuesInfo withWorkitemList(Consumer<List<WorkItemInfo>> workitemListSetter) {
        if (this.workitemList == null) {
            this.workitemList = new ArrayList<>();
        }
        workitemListSetter.accept(this.workitemList);
        return this;
    }

    /**
     * 关联需求
     * @return workitemList
     */
    public List<WorkItemInfo> getWorkitemList() {
        return workitemList;
    }

    public void setWorkitemList(List<WorkItemInfo> workitemList) {
        this.workitemList = workitemList;
    }

    public RemoveIssuesInfo withIsDeleteCase(Boolean isDeleteCase) {
        this.isDeleteCase = isDeleteCase;
        return this;
    }

    /**
     * 是否删除需求关联的用例
     * @return isDeleteCase
     */
    public Boolean getIsDeleteCase() {
        return isDeleteCase;
    }

    public void setIsDeleteCase(Boolean isDeleteCase) {
        this.isDeleteCase = isDeleteCase;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RemoveIssuesInfo that = (RemoveIssuesInfo) obj;
        return Objects.equals(this.workitemList, that.workitemList)
            && Objects.equals(this.isDeleteCase, that.isDeleteCase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workitemList, isDeleteCase);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RemoveIssuesInfo {\n");
        sb.append("    workitemList: ").append(toIndentedString(workitemList)).append("\n");
        sb.append("    isDeleteCase: ").append(toIndentedString(isDeleteCase)).append("\n");
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
