package com.huaweicloud.sdk.meeting.v1.model;

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
public class ListNetworkQualityResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "returnCode")

    private Integer returnCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "returnDesc")

    private String returnDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qosList")

    private List<UserQos> qosList = null;

    public ListNetworkQualityResponse withReturnCode(Integer returnCode) {
        this.returnCode = returnCode;
        return this;
    }

    /**
     * 结果码
     * @return returnCode
     */
    public Integer getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(Integer returnCode) {
        this.returnCode = returnCode;
    }

    public ListNetworkQualityResponse withReturnDesc(String returnDesc) {
        this.returnDesc = returnDesc;
        return this;
    }

    /**
     * 结果描述
     * @return returnDesc
     */
    public String getReturnDesc() {
        return returnDesc;
    }

    public void setReturnDesc(String returnDesc) {
        this.returnDesc = returnDesc;
    }

    public ListNetworkQualityResponse withQosList(List<UserQos> qosList) {
        this.qosList = qosList;
        return this;
    }

    public ListNetworkQualityResponse addQosListItem(UserQos qosListItem) {
        if (this.qosList == null) {
            this.qosList = new ArrayList<>();
        }
        this.qosList.add(qosListItem);
        return this;
    }

    public ListNetworkQualityResponse withQosList(Consumer<List<UserQos>> qosListSetter) {
        if (this.qosList == null) {
            this.qosList = new ArrayList<>();
        }
        qosListSetter.accept(this.qosList);
        return this;
    }

    /**
     * 会场Qos列表
     * @return qosList
     */
    public List<UserQos> getQosList() {
        return qosList;
    }

    public void setQosList(List<UserQos> qosList) {
        this.qosList = qosList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListNetworkQualityResponse that = (ListNetworkQualityResponse) obj;
        return Objects.equals(this.returnCode, that.returnCode) && Objects.equals(this.returnDesc, that.returnDesc)
            && Objects.equals(this.qosList, that.qosList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(returnCode, returnDesc, qosList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNetworkQualityResponse {\n");
        sb.append("    returnCode: ").append(toIndentedString(returnCode)).append("\n");
        sb.append("    returnDesc: ").append(toIndentedString(returnDesc)).append("\n");
        sb.append("    qosList: ").append(toIndentedString(qosList)).append("\n");
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
