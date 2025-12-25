package com.huaweicloud.sdk.secmaster.v1.model;

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
public class DeleteNodeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_fail_list")

    private List<Node> deleteFailList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_success_list")

    private List<Node> deleteSuccessList = null;

    public DeleteNodeResponse withDeleteFailList(List<Node> deleteFailList) {
        this.deleteFailList = deleteFailList;
        return this;
    }

    public DeleteNodeResponse addDeleteFailListItem(Node deleteFailListItem) {
        if (this.deleteFailList == null) {
            this.deleteFailList = new ArrayList<>();
        }
        this.deleteFailList.add(deleteFailListItem);
        return this;
    }

    public DeleteNodeResponse withDeleteFailList(Consumer<List<Node>> deleteFailListSetter) {
        if (this.deleteFailList == null) {
            this.deleteFailList = new ArrayList<>();
        }
        deleteFailListSetter.accept(this.deleteFailList);
        return this;
    }

    /**
     * 删除失败列表
     * @return deleteFailList
     */
    public List<Node> getDeleteFailList() {
        return deleteFailList;
    }

    public void setDeleteFailList(List<Node> deleteFailList) {
        this.deleteFailList = deleteFailList;
    }

    public DeleteNodeResponse withDeleteSuccessList(List<Node> deleteSuccessList) {
        this.deleteSuccessList = deleteSuccessList;
        return this;
    }

    public DeleteNodeResponse addDeleteSuccessListItem(Node deleteSuccessListItem) {
        if (this.deleteSuccessList == null) {
            this.deleteSuccessList = new ArrayList<>();
        }
        this.deleteSuccessList.add(deleteSuccessListItem);
        return this;
    }

    public DeleteNodeResponse withDeleteSuccessList(Consumer<List<Node>> deleteSuccessListSetter) {
        if (this.deleteSuccessList == null) {
            this.deleteSuccessList = new ArrayList<>();
        }
        deleteSuccessListSetter.accept(this.deleteSuccessList);
        return this;
    }

    /**
     * 删除成功列表
     * @return deleteSuccessList
     */
    public List<Node> getDeleteSuccessList() {
        return deleteSuccessList;
    }

    public void setDeleteSuccessList(List<Node> deleteSuccessList) {
        this.deleteSuccessList = deleteSuccessList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteNodeResponse that = (DeleteNodeResponse) obj;
        return Objects.equals(this.deleteFailList, that.deleteFailList)
            && Objects.equals(this.deleteSuccessList, that.deleteSuccessList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deleteFailList, deleteSuccessList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteNodeResponse {\n");
        sb.append("    deleteFailList: ").append(toIndentedString(deleteFailList)).append("\n");
        sb.append("    deleteSuccessList: ").append(toIndentedString(deleteSuccessList)).append("\n");
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
