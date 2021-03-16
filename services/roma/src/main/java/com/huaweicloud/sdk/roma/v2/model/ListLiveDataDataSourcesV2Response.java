package com.huaweicloud.sdk.roma.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.BasePage;
import com.huaweicloud.sdk.roma.v2.model.LdDatasourceInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListLiveDataDataSourcesV2Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Integer size;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Long total;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data_sources")
    
    private List<LdDatasourceInfo> dataSources = null;
    
    public ListLiveDataDataSourcesV2Response withSize(Integer size) {
        this.size = size;
        return this;
    }

    


    /**
     * 本次返回的列表长度
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    

    public ListLiveDataDataSourcesV2Response withTotal(Long total) {
        this.total = total;
        return this;
    }

    


    /**
     * 满足条件的记录数
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    

    public ListLiveDataDataSourcesV2Response withDataSources(List<LdDatasourceInfo> dataSources) {
        this.dataSources = dataSources;
        return this;
    }

    
    public ListLiveDataDataSourcesV2Response addDataSourcesItem(LdDatasourceInfo dataSourcesItem) {
        this.dataSources.add(dataSourcesItem);
        return this;
    }

    public ListLiveDataDataSourcesV2Response withDataSources(Consumer<List<LdDatasourceInfo>> dataSourcesSetter) {
        if(this.dataSources == null ){
            this.dataSources = new ArrayList<>();
        }
        dataSourcesSetter.accept(this.dataSources);
        return this;
    }

    /**
     * 数据源列表
     * @return dataSources
     */
    public List<LdDatasourceInfo> getDataSources() {
        return dataSources;
    }

    public void setDataSources(List<LdDatasourceInfo> dataSources) {
        this.dataSources = dataSources;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListLiveDataDataSourcesV2Response listLiveDataDataSourcesV2Response = (ListLiveDataDataSourcesV2Response) o;
        return Objects.equals(this.size, listLiveDataDataSourcesV2Response.size) &&
            Objects.equals(this.total, listLiveDataDataSourcesV2Response.total) &&
            Objects.equals(this.dataSources, listLiveDataDataSourcesV2Response.dataSources);
    }
    @Override
    public int hashCode() {
        return Objects.hash(size, total, dataSources);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLiveDataDataSourcesV2Response {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    dataSources: ").append(toIndentedString(dataSources)).append("\n");
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

