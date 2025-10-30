package com.huaweicloud.sdk.hss.v5.model;

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
public class ShowCheckRuleFixFailDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_detail_list")

    private List<CheckRuleFixFailDetailInfo> failDetailList = null;

    public ShowCheckRuleFixFailDetailResponse withFailDetailList(List<CheckRuleFixFailDetailInfo> failDetailList) {
        this.failDetailList = failDetailList;
        return this;
    }

    public ShowCheckRuleFixFailDetailResponse addFailDetailListItem(CheckRuleFixFailDetailInfo failDetailListItem) {
        if (this.failDetailList == null) {
            this.failDetailList = new ArrayList<>();
        }
        this.failDetailList.add(failDetailListItem);
        return this;
    }

    public ShowCheckRuleFixFailDetailResponse withFailDetailList(
        Consumer<List<CheckRuleFixFailDetailInfo>> failDetailListSetter) {
        if (this.failDetailList == null) {
            this.failDetailList = new ArrayList<>();
        }
        failDetailListSetter.accept(this.failDetailList);
        return this;
    }

    /**
     * 修复失败原因列表
     * @return failDetailList
     */
    public List<CheckRuleFixFailDetailInfo> getFailDetailList() {
        return failDetailList;
    }

    public void setFailDetailList(List<CheckRuleFixFailDetailInfo> failDetailList) {
        this.failDetailList = failDetailList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowCheckRuleFixFailDetailResponse that = (ShowCheckRuleFixFailDetailResponse) obj;
        return Objects.equals(this.failDetailList, that.failDetailList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(failDetailList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCheckRuleFixFailDetailResponse {\n");
        sb.append("    failDetailList: ").append(toIndentedString(failDetailList)).append("\n");
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
