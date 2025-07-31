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
public class ListSystemUserWhiteListResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remain_num")

    private Integer remainNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit_num")

    private Integer limitNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_list")

    private List<SystemUserWhiteListResponseInfo> dataList = null;

    public ListSystemUserWhiteListResponse withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * **参数解释**: 总数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public ListSystemUserWhiteListResponse withRemainNum(Integer remainNum) {
        this.remainNum = remainNum;
        return this;
    }

    /**
     * 可继续添加的白名单数量
     * @return remainNum
     */
    public Integer getRemainNum() {
        return remainNum;
    }

    public void setRemainNum(Integer remainNum) {
        this.remainNum = remainNum;
    }

    public ListSystemUserWhiteListResponse withLimitNum(Integer limitNum) {
        this.limitNum = limitNum;
        return this;
    }

    /**
     * 白名单数量上限
     * @return limitNum
     */
    public Integer getLimitNum() {
        return limitNum;
    }

    public void setLimitNum(Integer limitNum) {
        this.limitNum = limitNum;
    }

    public ListSystemUserWhiteListResponse withDataList(List<SystemUserWhiteListResponseInfo> dataList) {
        this.dataList = dataList;
        return this;
    }

    public ListSystemUserWhiteListResponse addDataListItem(SystemUserWhiteListResponseInfo dataListItem) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataListItem);
        return this;
    }

    public ListSystemUserWhiteListResponse withDataList(
        Consumer<List<SystemUserWhiteListResponseInfo>> dataListSetter) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        dataListSetter.accept(this.dataList);
        return this;
    }

    /**
     * 系统用户白名单详情
     * @return dataList
     */
    public List<SystemUserWhiteListResponseInfo> getDataList() {
        return dataList;
    }

    public void setDataList(List<SystemUserWhiteListResponseInfo> dataList) {
        this.dataList = dataList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSystemUserWhiteListResponse that = (ListSystemUserWhiteListResponse) obj;
        return Objects.equals(this.totalNum, that.totalNum) && Objects.equals(this.remainNum, that.remainNum)
            && Objects.equals(this.limitNum, that.limitNum) && Objects.equals(this.dataList, that.dataList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalNum, remainNum, limitNum, dataList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSystemUserWhiteListResponse {\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    remainNum: ").append(toIndentedString(remainNum)).append("\n");
        sb.append("    limitNum: ").append(toIndentedString(limitNum)).append("\n");
        sb.append("    dataList: ").append(toIndentedString(dataList)).append("\n");
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
