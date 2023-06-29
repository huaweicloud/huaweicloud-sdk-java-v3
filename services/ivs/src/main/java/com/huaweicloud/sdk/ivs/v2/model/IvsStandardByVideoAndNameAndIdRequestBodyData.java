package com.huaweicloud.sdk.ivs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 请求消息的数据部分。
 */
public class IvsStandardByVideoAndNameAndIdRequestBodyData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "req_data")

    private List<StandardReqDataByVideoAndNameAndId> reqData = null;

    public IvsStandardByVideoAndNameAndIdRequestBodyData withReqData(List<StandardReqDataByVideoAndNameAndId> reqData) {
        this.reqData = reqData;
        return this;
    }

    public IvsStandardByVideoAndNameAndIdRequestBodyData addReqDataItem(
        StandardReqDataByVideoAndNameAndId reqDataItem) {
        if (this.reqData == null) {
            this.reqData = new ArrayList<>();
        }
        this.reqData.add(reqDataItem);
        return this;
    }

    public IvsStandardByVideoAndNameAndIdRequestBodyData withReqData(
        Consumer<List<StandardReqDataByVideoAndNameAndId>> reqDataSetter) {
        if (this.reqData == null) {
            this.reqData = new ArrayList<>();
        }
        reqDataSetter.accept(this.reqData);
        return this;
    }

    /**
     * 请求列表，用于支持批量调用。目前暂时只支持单个数据查询。
     * @return reqData
     */
    public List<StandardReqDataByVideoAndNameAndId> getReqData() {
        return reqData;
    }

    public void setReqData(List<StandardReqDataByVideoAndNameAndId> reqData) {
        this.reqData = reqData;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IvsStandardByVideoAndNameAndIdRequestBodyData that = (IvsStandardByVideoAndNameAndIdRequestBodyData) obj;
        return Objects.equals(this.reqData, that.reqData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reqData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IvsStandardByVideoAndNameAndIdRequestBodyData {\n");
        sb.append("    reqData: ").append(toIndentedString(reqData)).append("\n");
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
