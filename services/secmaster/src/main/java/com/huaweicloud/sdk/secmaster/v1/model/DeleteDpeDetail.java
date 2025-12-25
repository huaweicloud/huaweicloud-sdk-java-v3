package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 删除分类映射响应详细信息
 */
public class DeleteDpeDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_id_list")

    private List<String> successIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_id_list")

    private List<String> errorIdList = null;

    public DeleteDpeDetail withSuccessIdList(List<String> successIdList) {
        this.successIdList = successIdList;
        return this;
    }

    public DeleteDpeDetail addSuccessIdListItem(String successIdListItem) {
        if (this.successIdList == null) {
            this.successIdList = new ArrayList<>();
        }
        this.successIdList.add(successIdListItem);
        return this;
    }

    public DeleteDpeDetail withSuccessIdList(Consumer<List<String>> successIdListSetter) {
        if (this.successIdList == null) {
            this.successIdList = new ArrayList<>();
        }
        successIdListSetter.accept(this.successIdList);
        return this;
    }

    /**
     * 删除成功id集合
     * @return successIdList
     */
    public List<String> getSuccessIdList() {
        return successIdList;
    }

    public void setSuccessIdList(List<String> successIdList) {
        this.successIdList = successIdList;
    }

    public DeleteDpeDetail withErrorIdList(List<String> errorIdList) {
        this.errorIdList = errorIdList;
        return this;
    }

    public DeleteDpeDetail addErrorIdListItem(String errorIdListItem) {
        if (this.errorIdList == null) {
            this.errorIdList = new ArrayList<>();
        }
        this.errorIdList.add(errorIdListItem);
        return this;
    }

    public DeleteDpeDetail withErrorIdList(Consumer<List<String>> errorIdListSetter) {
        if (this.errorIdList == null) {
            this.errorIdList = new ArrayList<>();
        }
        errorIdListSetter.accept(this.errorIdList);
        return this;
    }

    /**
     * 删除失败id集合
     * @return errorIdList
     */
    public List<String> getErrorIdList() {
        return errorIdList;
    }

    public void setErrorIdList(List<String> errorIdList) {
        this.errorIdList = errorIdList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteDpeDetail that = (DeleteDpeDetail) obj;
        return Objects.equals(this.successIdList, that.successIdList)
            && Objects.equals(this.errorIdList, that.errorIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(successIdList, errorIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteDpeDetail {\n");
        sb.append("    successIdList: ").append(toIndentedString(successIdList)).append("\n");
        sb.append("    errorIdList: ").append(toIndentedString(errorIdList)).append("\n");
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
