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
public class ListEventOperatesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_accept_list")

    private List<String> operateAcceptList = null;

    public ListEventOperatesResponse withOperateAcceptList(List<String> operateAcceptList) {
        this.operateAcceptList = operateAcceptList;
        return this;
    }

    public ListEventOperatesResponse addOperateAcceptListItem(String operateAcceptListItem) {
        if (this.operateAcceptList == null) {
            this.operateAcceptList = new ArrayList<>();
        }
        this.operateAcceptList.add(operateAcceptListItem);
        return this;
    }

    public ListEventOperatesResponse withOperateAcceptList(Consumer<List<String>> operateAcceptListSetter) {
        if (this.operateAcceptList == null) {
            this.operateAcceptList = new ArrayList<>();
        }
        operateAcceptListSetter.accept(this.operateAcceptList);
        return this;
    }

    /**
     * 支持的处理操作
     * @return operateAcceptList
     */
    public List<String> getOperateAcceptList() {
        return operateAcceptList;
    }

    public void setOperateAcceptList(List<String> operateAcceptList) {
        this.operateAcceptList = operateAcceptList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEventOperatesResponse that = (ListEventOperatesResponse) obj;
        return Objects.equals(this.operateAcceptList, that.operateAcceptList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operateAcceptList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEventOperatesResponse {\n");
        sb.append("    operateAcceptList: ").append(toIndentedString(operateAcceptList)).append("\n");
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
