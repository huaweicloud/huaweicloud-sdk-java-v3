package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 删除日志接入请求体 */
public class DeleteAccessConfigRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_config_id_list")

    private List<String> accessConfigIdList = null;

    public DeleteAccessConfigRequestBody withAccessConfigIdList(List<String> accessConfigIdList) {
        this.accessConfigIdList = accessConfigIdList;
        return this;
    }

    public DeleteAccessConfigRequestBody addAccessConfigIdListItem(String accessConfigIdListItem) {
        if (this.accessConfigIdList == null) {
            this.accessConfigIdList = new ArrayList<>();
        }
        this.accessConfigIdList.add(accessConfigIdListItem);
        return this;
    }

    public DeleteAccessConfigRequestBody withAccessConfigIdList(Consumer<List<String>> accessConfigIdListSetter) {
        if (this.accessConfigIdList == null) {
            this.accessConfigIdList = new ArrayList<>();
        }
        accessConfigIdListSetter.accept(this.accessConfigIdList);
        return this;
    }

    /** 日志接入ID列表
     * 
     * @return accessConfigIdList */
    public List<String> getAccessConfigIdList() {
        return accessConfigIdList;
    }

    public void setAccessConfigIdList(List<String> accessConfigIdList) {
        this.accessConfigIdList = accessConfigIdList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteAccessConfigRequestBody deleteAccessConfigRequestBody = (DeleteAccessConfigRequestBody) o;
        return Objects.equals(this.accessConfigIdList, deleteAccessConfigRequestBody.accessConfigIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessConfigIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteAccessConfigRequestBody {\n");
        sb.append("    accessConfigIdList: ").append(toIndentedString(accessConfigIdList)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
