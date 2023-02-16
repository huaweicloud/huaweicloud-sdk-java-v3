package com.huaweicloud.sdk.osm.v2.model;

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
public class ListDiagnoseItemsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_results")

    private List<ItemResultDetailVo> itemResults = null;

    public ListDiagnoseItemsResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 错误码
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public ListDiagnoseItemsResponse withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 错误描述
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public ListDiagnoseItemsResponse withItemResults(List<ItemResultDetailVo> itemResults) {
        this.itemResults = itemResults;
        return this;
    }

    public ListDiagnoseItemsResponse addItemResultsItem(ItemResultDetailVo itemResultsItem) {
        if (this.itemResults == null) {
            this.itemResults = new ArrayList<>();
        }
        this.itemResults.add(itemResultsItem);
        return this;
    }

    public ListDiagnoseItemsResponse withItemResults(Consumer<List<ItemResultDetailVo>> itemResultsSetter) {
        if (this.itemResults == null) {
            this.itemResults = new ArrayList<>();
        }
        itemResultsSetter.accept(this.itemResults);
        return this;
    }

    /**
     * 检查项结果列表
     * @return itemResults
     */
    public List<ItemResultDetailVo> getItemResults() {
        return itemResults;
    }

    public void setItemResults(List<ItemResultDetailVo> itemResults) {
        this.itemResults = itemResults;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListDiagnoseItemsResponse listDiagnoseItemsResponse = (ListDiagnoseItemsResponse) o;
        return Objects.equals(this.errorCode, listDiagnoseItemsResponse.errorCode)
            && Objects.equals(this.errorMsg, listDiagnoseItemsResponse.errorMsg)
            && Objects.equals(this.itemResults, listDiagnoseItemsResponse.itemResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorCode, errorMsg, itemResults);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDiagnoseItemsResponse {\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    itemResults: ").append(toIndentedString(itemResults)).append("\n");
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
