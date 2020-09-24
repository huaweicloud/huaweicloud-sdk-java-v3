package com.huaweicloud.sdk.osm.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.osm.v2.model.DataCenterV2Do;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListRegionsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    private Integer totalCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data_center_list")
    
    private List<DataCenterV2Do> dataCenterList = null;
    
    public ListRegionsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * 总数
     * minimum: 0
     * maximum: 65535
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListRegionsResponse withDataCenterList(List<DataCenterV2Do> dataCenterList) {
        this.dataCenterList = dataCenterList;
        return this;
    }

    
    public ListRegionsResponse addDataCenterListItem(DataCenterV2Do dataCenterListItem) {
        if (this.dataCenterList == null) {
            this.dataCenterList = new ArrayList<>();
        }
        this.dataCenterList.add(dataCenterListItem);
        return this;
    }

    public ListRegionsResponse withDataCenterList(Consumer<List<DataCenterV2Do>> dataCenterListSetter) {
        if(this.dataCenterList == null ){
            this.dataCenterList = new ArrayList<>();
        }
        dataCenterListSetter.accept(this.dataCenterList);
        return this;
    }

    /**
     * 区域列表
     * @return dataCenterList
     */
    public List<DataCenterV2Do> getDataCenterList() {
        return dataCenterList;
    }

    public void setDataCenterList(List<DataCenterV2Do> dataCenterList) {
        this.dataCenterList = dataCenterList;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRegionsResponse listRegionsResponse = (ListRegionsResponse) o;
        return Objects.equals(this.totalCount, listRegionsResponse.totalCount) &&
            Objects.equals(this.dataCenterList, listRegionsResponse.dataCenterList);
    }
    @Override
    public int hashCode() {
        return Objects.hash(totalCount, dataCenterList);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRegionsResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    dataCenterList: ").append(toIndentedString(dataCenterList)).append("\n");
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

