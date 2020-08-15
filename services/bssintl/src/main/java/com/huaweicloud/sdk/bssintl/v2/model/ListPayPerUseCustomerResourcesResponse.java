package com.huaweicloud.sdk.bssintl.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bssintl.v2.model.OrderInstanceV2;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListPayPerUseCustomerResourcesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data")
    
    private List<OrderInstanceV2> data = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    private Integer totalCount;

    public ListPayPerUseCustomerResourcesResponse withData(List<OrderInstanceV2> data) {
        this.data = data;
        return this;
    }

    
    public ListPayPerUseCustomerResourcesResponse addDataItem(OrderInstanceV2 dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public ListPayPerUseCustomerResourcesResponse withData(Consumer<List<OrderInstanceV2>> dataSetter) {
        if(this.data == null ){
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * |参数名称：资源列表。具体请参见表2 OrderInstanceV2。| |参数约束以及描述：资源列表。具体请参见表2 OrderInstanceV2。|
     * @return data
     */
    public List<OrderInstanceV2> getData() {
        return data;
    }

    public void setData(List<OrderInstanceV2> data) {
        this.data = data;
    }

    public ListPayPerUseCustomerResourcesResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * |参数名称：总记录数。| |参数的约束及描述：总记录数。|
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPayPerUseCustomerResourcesResponse listPayPerUseCustomerResourcesResponse = (ListPayPerUseCustomerResourcesResponse) o;
        return Objects.equals(this.data, listPayPerUseCustomerResourcesResponse.data) &&
            Objects.equals(this.totalCount, listPayPerUseCustomerResourcesResponse.totalCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(data, totalCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPayPerUseCustomerResourcesResponse {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

