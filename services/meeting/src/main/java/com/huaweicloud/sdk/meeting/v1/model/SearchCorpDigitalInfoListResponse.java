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
public class SearchCorpDigitalInfoListResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "returnCode")

    private Integer returnCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "returnDesc")

    private String returnDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "corpDigitalInfoList")

    private List<CorpDigitalInfo> corpDigitalInfoList = null;

    public SearchCorpDigitalInfoListResponse withReturnCode(Integer returnCode) {
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

    public SearchCorpDigitalInfoListResponse withReturnDesc(String returnDesc) {
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

    public SearchCorpDigitalInfoListResponse withCorpDigitalInfoList(List<CorpDigitalInfo> corpDigitalInfoList) {
        this.corpDigitalInfoList = corpDigitalInfoList;
        return this;
    }

    public SearchCorpDigitalInfoListResponse addCorpDigitalInfoListItem(CorpDigitalInfo corpDigitalInfoListItem) {
        if (this.corpDigitalInfoList == null) {
            this.corpDigitalInfoList = new ArrayList<>();
        }
        this.corpDigitalInfoList.add(corpDigitalInfoListItem);
        return this;
    }

    public SearchCorpDigitalInfoListResponse withCorpDigitalInfoList(
        Consumer<List<CorpDigitalInfo>> corpDigitalInfoListSetter) {
        if (this.corpDigitalInfoList == null) {
            this.corpDigitalInfoList = new ArrayList<>();
        }
        corpDigitalInfoListSetter.accept(this.corpDigitalInfoList);
        return this;
    }

    /**
     * 数字资产列表
     * @return corpDigitalInfoList
     */
    public List<CorpDigitalInfo> getCorpDigitalInfoList() {
        return corpDigitalInfoList;
    }

    public void setCorpDigitalInfoList(List<CorpDigitalInfo> corpDigitalInfoList) {
        this.corpDigitalInfoList = corpDigitalInfoList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchCorpDigitalInfoListResponse that = (SearchCorpDigitalInfoListResponse) obj;
        return Objects.equals(this.returnCode, that.returnCode) && Objects.equals(this.returnDesc, that.returnDesc)
            && Objects.equals(this.corpDigitalInfoList, that.corpDigitalInfoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(returnCode, returnDesc, corpDigitalInfoList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchCorpDigitalInfoListResponse {\n");
        sb.append("    returnCode: ").append(toIndentedString(returnCode)).append("\n");
        sb.append("    returnDesc: ").append(toIndentedString(returnDesc)).append("\n");
        sb.append("    corpDigitalInfoList: ").append(toIndentedString(corpDigitalInfoList)).append("\n");
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
