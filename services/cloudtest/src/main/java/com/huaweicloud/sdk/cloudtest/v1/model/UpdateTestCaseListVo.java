package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 实际的数据类型：单个对象，集合 或 NULL
 */
public class UpdateTestCaseListVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_list")

    private List<String> successList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_list")

    private List<String> failedList = null;

    public UpdateTestCaseListVo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * CTS需要返回资源id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateTestCaseListVo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * CTS需要返回资源name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateTestCaseListVo withSuccessList(List<String> successList) {
        this.successList = successList;
        return this;
    }

    public UpdateTestCaseListVo addSuccessListItem(String successListItem) {
        if (this.successList == null) {
            this.successList = new ArrayList<>();
        }
        this.successList.add(successListItem);
        return this;
    }

    public UpdateTestCaseListVo withSuccessList(Consumer<List<String>> successListSetter) {
        if (this.successList == null) {
            this.successList = new ArrayList<>();
        }
        successListSetter.accept(this.successList);
        return this;
    }

    /**
     * 成功批量更新用例的id列表
     * @return successList
     */
    public List<String> getSuccessList() {
        return successList;
    }

    public void setSuccessList(List<String> successList) {
        this.successList = successList;
    }

    public UpdateTestCaseListVo withFailedList(List<String> failedList) {
        this.failedList = failedList;
        return this;
    }

    public UpdateTestCaseListVo addFailedListItem(String failedListItem) {
        if (this.failedList == null) {
            this.failedList = new ArrayList<>();
        }
        this.failedList.add(failedListItem);
        return this;
    }

    public UpdateTestCaseListVo withFailedList(Consumer<List<String>> failedListSetter) {
        if (this.failedList == null) {
            this.failedList = new ArrayList<>();
        }
        failedListSetter.accept(this.failedList);
        return this;
    }

    /**
     * 没有批量更新用例的id列表
     * @return failedList
     */
    public List<String> getFailedList() {
        return failedList;
    }

    public void setFailedList(List<String> failedList) {
        this.failedList = failedList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTestCaseListVo that = (UpdateTestCaseListVo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.successList, that.successList) && Objects.equals(this.failedList, that.failedList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, successList, failedList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTestCaseListVo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    successList: ").append(toIndentedString(successList)).append("\n");
        sb.append("    failedList: ").append(toIndentedString(failedList)).append("\n");
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
