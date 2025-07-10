package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateTerminalsBindingDesktopsRequestBody
 */
public class CreateTerminalsBindingDesktopsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bind_list")

    private List<CreateTerminalsBindingDesktopsInfo> bindList = null;

    public CreateTerminalsBindingDesktopsRequestBody withBindList(List<CreateTerminalsBindingDesktopsInfo> bindList) {
        this.bindList = bindList;
        return this;
    }

    public CreateTerminalsBindingDesktopsRequestBody addBindListItem(CreateTerminalsBindingDesktopsInfo bindListItem) {
        if (this.bindList == null) {
            this.bindList = new ArrayList<>();
        }
        this.bindList.add(bindListItem);
        return this;
    }

    public CreateTerminalsBindingDesktopsRequestBody withBindList(
        Consumer<List<CreateTerminalsBindingDesktopsInfo>> bindListSetter) {
        if (this.bindList == null) {
            this.bindList = new ArrayList<>();
        }
        bindListSetter.accept(this.bindList);
        return this;
    }

    /**
     * 需要新增的MAC绑定VM策略信息列表。
     * @return bindList
     */
    public List<CreateTerminalsBindingDesktopsInfo> getBindList() {
        return bindList;
    }

    public void setBindList(List<CreateTerminalsBindingDesktopsInfo> bindList) {
        this.bindList = bindList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateTerminalsBindingDesktopsRequestBody that = (CreateTerminalsBindingDesktopsRequestBody) obj;
        return Objects.equals(this.bindList, that.bindList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bindList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTerminalsBindingDesktopsRequestBody {\n");
        sb.append("    bindList: ").append(toIndentedString(bindList)).append("\n");
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
