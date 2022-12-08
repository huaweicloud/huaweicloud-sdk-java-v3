package com.huaweicloud.sdk.workspace.v2.model;

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
public class DeleteTerminalsBindingDesktopsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_list")

    private List<DeleteTerminalsBindingDesktopsResult> resultList = null;

    public DeleteTerminalsBindingDesktopsResponse withResultList(
        List<DeleteTerminalsBindingDesktopsResult> resultList) {
        this.resultList = resultList;
        return this;
    }

    public DeleteTerminalsBindingDesktopsResponse addResultListItem(
        DeleteTerminalsBindingDesktopsResult resultListItem) {
        if (this.resultList == null) {
            this.resultList = new ArrayList<>();
        }
        this.resultList.add(resultListItem);
        return this;
    }

    public DeleteTerminalsBindingDesktopsResponse withResultList(
        Consumer<List<DeleteTerminalsBindingDesktopsResult>> resultListSetter) {
        if (this.resultList == null) {
            this.resultList = new ArrayList<>();
        }
        resultListSetter.accept(this.resultList);
        return this;
    }

    /**
     * 需删除的策略ID列表
     * @return resultList
     */
    public List<DeleteTerminalsBindingDesktopsResult> getResultList() {
        return resultList;
    }

    public void setResultList(List<DeleteTerminalsBindingDesktopsResult> resultList) {
        this.resultList = resultList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteTerminalsBindingDesktopsResponse deleteTerminalsBindingDesktopsResponse =
            (DeleteTerminalsBindingDesktopsResponse) o;
        return Objects.equals(this.resultList, deleteTerminalsBindingDesktopsResponse.resultList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resultList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteTerminalsBindingDesktopsResponse {\n");
        sb.append("    resultList: ").append(toIndentedString(resultList)).append("\n");
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
