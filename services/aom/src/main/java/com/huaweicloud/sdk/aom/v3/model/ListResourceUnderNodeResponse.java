package com.huaweicloud.sdk.aom.v3.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListResourceUnderNodeResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data")
    
    private List<Object> data = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page_info")
    

    private Object pageInfo;

    public ListResourceUnderNodeResponse withData(List<Object> data) {
        this.data = data;
        return this;
    }

    
    public ListResourceUnderNodeResponse addDataItem(Object dataItem) {
        if(this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public ListResourceUnderNodeResponse withData(Consumer<List<Object>> dataSetter) {
        if(this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * 分页查询的数据。
     * @return data
     */
    public List<Object> getData() {
        return data;
    }

    public void setData(List<Object> data) {
        this.data = data;
    }

    

    public ListResourceUnderNodeResponse withPageInfo(Object pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    


    /**
     * 分页信息。
     * @return pageInfo
     */
    public Object getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(Object pageInfo) {
        this.pageInfo = pageInfo;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListResourceUnderNodeResponse listResourceUnderNodeResponse = (ListResourceUnderNodeResponse) o;
        return Objects.equals(this.data, listResourceUnderNodeResponse.data) &&
            Objects.equals(this.pageInfo, listResourceUnderNodeResponse.pageInfo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(data, pageInfo);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResourceUnderNodeResponse {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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

