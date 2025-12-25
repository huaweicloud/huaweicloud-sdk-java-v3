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
public class ShowMappingFunctionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_list")

    private List<DpeCompareFunctionDetail> compareList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_list")

    private List<DpeOperateFunctionDetail> operationList = null;

    public ShowMappingFunctionResponse withCompareList(List<DpeCompareFunctionDetail> compareList) {
        this.compareList = compareList;
        return this;
    }

    public ShowMappingFunctionResponse addCompareListItem(DpeCompareFunctionDetail compareListItem) {
        if (this.compareList == null) {
            this.compareList = new ArrayList<>();
        }
        this.compareList.add(compareListItem);
        return this;
    }

    public ShowMappingFunctionResponse withCompareList(Consumer<List<DpeCompareFunctionDetail>> compareListSetter) {
        if (this.compareList == null) {
            this.compareList = new ArrayList<>();
        }
        compareListSetter.accept(this.compareList);
        return this;
    }

    /**
     * 比较函数信息
     * @return compareList
     */
    public List<DpeCompareFunctionDetail> getCompareList() {
        return compareList;
    }

    public void setCompareList(List<DpeCompareFunctionDetail> compareList) {
        this.compareList = compareList;
    }

    public ShowMappingFunctionResponse withOperationList(List<DpeOperateFunctionDetail> operationList) {
        this.operationList = operationList;
        return this;
    }

    public ShowMappingFunctionResponse addOperationListItem(DpeOperateFunctionDetail operationListItem) {
        if (this.operationList == null) {
            this.operationList = new ArrayList<>();
        }
        this.operationList.add(operationListItem);
        return this;
    }

    public ShowMappingFunctionResponse withOperationList(Consumer<List<DpeOperateFunctionDetail>> operationListSetter) {
        if (this.operationList == null) {
            this.operationList = new ArrayList<>();
        }
        operationListSetter.accept(this.operationList);
        return this;
    }

    /**
     * 操作函数信息
     * @return operationList
     */
    public List<DpeOperateFunctionDetail> getOperationList() {
        return operationList;
    }

    public void setOperationList(List<DpeOperateFunctionDetail> operationList) {
        this.operationList = operationList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowMappingFunctionResponse that = (ShowMappingFunctionResponse) obj;
        return Objects.equals(this.compareList, that.compareList)
            && Objects.equals(this.operationList, that.operationList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(compareList, operationList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMappingFunctionResponse {\n");
        sb.append("    compareList: ").append(toIndentedString(compareList)).append("\n");
        sb.append("    operationList: ").append(toIndentedString(operationList)).append("\n");
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
