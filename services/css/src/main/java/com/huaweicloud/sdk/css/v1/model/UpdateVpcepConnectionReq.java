package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateVpcepConnectionReq
 */
public class UpdateVpcepConnectionReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpointIdList")

    private List<String> endpointIdList = null;

    public UpdateVpcepConnectionReq withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 期望的操作行为。 - receive: 允许连接 - reject: 拒绝连接
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public UpdateVpcepConnectionReq withEndpointIdList(List<String> endpointIdList) {
        this.endpointIdList = endpointIdList;
        return this;
    }

    public UpdateVpcepConnectionReq addEndpointIdListItem(String endpointIdListItem) {
        if (this.endpointIdList == null) {
            this.endpointIdList = new ArrayList<>();
        }
        this.endpointIdList.add(endpointIdListItem);
        return this;
    }

    public UpdateVpcepConnectionReq withEndpointIdList(Consumer<List<String>> endpointIdListSetter) {
        if (this.endpointIdList == null) {
            this.endpointIdList = new ArrayList<>();
        }
        endpointIdListSetter.accept(this.endpointIdList);
        return this;
    }

    /**
     * 终端节点ID列表。
     * @return endpointIdList
     */
    public List<String> getEndpointIdList() {
        return endpointIdList;
    }

    public void setEndpointIdList(List<String> endpointIdList) {
        this.endpointIdList = endpointIdList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateVpcepConnectionReq updateVpcepConnectionReq = (UpdateVpcepConnectionReq) o;
        return Objects.equals(this.action, updateVpcepConnectionReq.action)
            && Objects.equals(this.endpointIdList, updateVpcepConnectionReq.endpointIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, endpointIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVpcepConnectionReq {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    endpointIdList: ").append(toIndentedString(endpointIdList)).append("\n");
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
