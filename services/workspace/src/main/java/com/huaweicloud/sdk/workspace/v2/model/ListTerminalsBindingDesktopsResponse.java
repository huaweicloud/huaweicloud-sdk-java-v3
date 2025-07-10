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
public class ListTerminalsBindingDesktopsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bind_list")

    private List<TerminalsBindingDesktopsInfo> bindList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    public ListTerminalsBindingDesktopsResponse withBindList(List<TerminalsBindingDesktopsInfo> bindList) {
        this.bindList = bindList;
        return this;
    }

    public ListTerminalsBindingDesktopsResponse addBindListItem(TerminalsBindingDesktopsInfo bindListItem) {
        if (this.bindList == null) {
            this.bindList = new ArrayList<>();
        }
        this.bindList.add(bindListItem);
        return this;
    }

    public ListTerminalsBindingDesktopsResponse withBindList(
        Consumer<List<TerminalsBindingDesktopsInfo>> bindListSetter) {
        if (this.bindList == null) {
            this.bindList = new ArrayList<>();
        }
        bindListSetter.accept(this.bindList);
        return this;
    }

    /**
     * MAC绑定VM信息列表。
     * @return bindList
     */
    public List<TerminalsBindingDesktopsInfo> getBindList() {
        return bindList;
    }

    public void setBindList(List<TerminalsBindingDesktopsInfo> bindList) {
        this.bindList = bindList;
    }

    public ListTerminalsBindingDesktopsResponse withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * 返回结果总条数。
     * minimum: 0
     * maximum: 8000
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTerminalsBindingDesktopsResponse that = (ListTerminalsBindingDesktopsResponse) obj;
        return Objects.equals(this.bindList, that.bindList) && Objects.equals(this.totalNum, that.totalNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bindList, totalNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTerminalsBindingDesktopsResponse {\n");
        sb.append("    bindList: ").append(toIndentedString(bindList)).append("\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
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
