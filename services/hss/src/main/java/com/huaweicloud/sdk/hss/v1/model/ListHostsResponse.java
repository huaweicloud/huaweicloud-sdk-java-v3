package com.huaweicloud.sdk.hss.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.hss.v1.model.Host;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListHostsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_num")
    
    private Integer totalNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data_list")
    
    private List<Host> dataList = null;
    
    public ListHostsResponse withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    


    /**
     * 总数
     * minimum: 0
     * maximum: 2097152
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    

    public ListHostsResponse withDataList(List<Host> dataList) {
        this.dataList = dataList;
        return this;
    }

    
    public ListHostsResponse addDataListItem(Host dataListItem) {
        if(this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataListItem);
        return this;
    }

    public ListHostsResponse withDataList(Consumer<List<Host>> dataListSetter) {
        if(this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        dataListSetter.accept(this.dataList);
        return this;
    }

    /**
     * 查询弹性云服务器状态列表
     * @return dataList
     */
    public List<Host> getDataList() {
        return dataList;
    }

    public void setDataList(List<Host> dataList) {
        this.dataList = dataList;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListHostsResponse listHostsResponse = (ListHostsResponse) o;
        return Objects.equals(this.totalNum, listHostsResponse.totalNum) &&
            Objects.equals(this.dataList, listHostsResponse.dataList);
    }
    @Override
    public int hashCode() {
        return Objects.hash(totalNum, dataList);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHostsResponse {\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
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

