package com.huaweicloud.sdk.functiongraph.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionAsyncInvokeConfigResult;
import com.huaweicloud.sdk.functiongraph.v2.model.PageInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListFunctionAsyncInvokeConfigResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="async_invoke_configs")
    
    private List<ListFunctionAsyncInvokeConfigResult> asyncInvokeConfigs = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    private Long count;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page_info")
    
    private PageInfo pageInfo;

    public ListFunctionAsyncInvokeConfigResponse withAsyncInvokeConfigs(List<ListFunctionAsyncInvokeConfigResult> asyncInvokeConfigs) {
        this.asyncInvokeConfigs = asyncInvokeConfigs;
        return this;
    }

    
    public ListFunctionAsyncInvokeConfigResponse addAsyncInvokeConfigsItem(ListFunctionAsyncInvokeConfigResult asyncInvokeConfigsItem) {
        if(this.asyncInvokeConfigs == null) {
            this.asyncInvokeConfigs = new ArrayList<>();
        }
        this.asyncInvokeConfigs.add(asyncInvokeConfigsItem);
        return this;
    }

    public ListFunctionAsyncInvokeConfigResponse withAsyncInvokeConfigs(Consumer<List<ListFunctionAsyncInvokeConfigResult>> asyncInvokeConfigsSetter) {
        if(this.asyncInvokeConfigs == null) {
            this.asyncInvokeConfigs = new ArrayList<>();
        }
        asyncInvokeConfigsSetter.accept(this.asyncInvokeConfigs);
        return this;
    }

    /**
     * 函数异步配置列表。
     * @return asyncInvokeConfigs
     */
    public List<ListFunctionAsyncInvokeConfigResult> getAsyncInvokeConfigs() {
        return asyncInvokeConfigs;
    }

    public void setAsyncInvokeConfigs(List<ListFunctionAsyncInvokeConfigResult> asyncInvokeConfigs) {
        this.asyncInvokeConfigs = asyncInvokeConfigs;
    }

    

    public ListFunctionAsyncInvokeConfigResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    


    /**
     * 列表总数。
     * minimum: 0
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    

    public ListFunctionAsyncInvokeConfigResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListFunctionAsyncInvokeConfigResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
        if(this.pageInfo == null ){
            this.pageInfo = new PageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }
        
        return this;
    }


    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
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
        ListFunctionAsyncInvokeConfigResponse listFunctionAsyncInvokeConfigResponse = (ListFunctionAsyncInvokeConfigResponse) o;
        return Objects.equals(this.asyncInvokeConfigs, listFunctionAsyncInvokeConfigResponse.asyncInvokeConfigs) &&
            Objects.equals(this.count, listFunctionAsyncInvokeConfigResponse.count) &&
            Objects.equals(this.pageInfo, listFunctionAsyncInvokeConfigResponse.pageInfo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(asyncInvokeConfigs, count, pageInfo);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFunctionAsyncInvokeConfigResponse {\n");
        sb.append("    asyncInvokeConfigs: ").append(toIndentedString(asyncInvokeConfigs)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

