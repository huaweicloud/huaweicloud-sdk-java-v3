package com.huaweicloud.sdk.iotedge.v2.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotedge.v2.model.PageInfoDTO;
import com.huaweicloud.sdk.iotedge.v2.model.QueryDcDsBriefRespDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class BatchListDcDsResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page_info")
    

    private PageInfoDTO pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="datasources")
    
    private List<QueryDcDsBriefRespDTO> datasources = null;
    
    public BatchListDcDsResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    


    /**
     * 总记录数
     * minimum: 0
     * maximum: 1000000
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    

    public BatchListDcDsResponse withPageInfo(PageInfoDTO pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public BatchListDcDsResponse withPageInfo(Consumer<PageInfoDTO> pageInfoSetter) {
        if(this.pageInfo == null ){
            this.pageInfo = new PageInfoDTO();
            pageInfoSetter.accept(this.pageInfo);
        }
        
        return this;
    }


    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfoDTO getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfoDTO pageInfo) {
        this.pageInfo = pageInfo;
    }

    

    public BatchListDcDsResponse withDatasources(List<QueryDcDsBriefRespDTO> datasources) {
        this.datasources = datasources;
        return this;
    }

    
    public BatchListDcDsResponse addDatasourcesItem(QueryDcDsBriefRespDTO datasourcesItem) {
        if(this.datasources == null) {
            this.datasources = new ArrayList<>();
        }
        this.datasources.add(datasourcesItem);
        return this;
    }

    public BatchListDcDsResponse withDatasources(Consumer<List<QueryDcDsBriefRespDTO>> datasourcesSetter) {
        if(this.datasources == null) {
            this.datasources = new ArrayList<>();
        }
        datasourcesSetter.accept(this.datasources);
        return this;
    }

    /**
     * 每页记录数
     * @return datasources
     */
    public List<QueryDcDsBriefRespDTO> getDatasources() {
        return datasources;
    }

    public void setDatasources(List<QueryDcDsBriefRespDTO> datasources) {
        this.datasources = datasources;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchListDcDsResponse batchListDcDsResponse = (BatchListDcDsResponse) o;
        return Objects.equals(this.count, batchListDcDsResponse.count) &&
            Objects.equals(this.pageInfo, batchListDcDsResponse.pageInfo) &&
            Objects.equals(this.datasources, batchListDcDsResponse.datasources);
    }
    @Override
    public int hashCode() {
        return Objects.hash(count, pageInfo, datasources);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchListDcDsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    datasources: ").append(toIndentedString(datasources)).append("\n");
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

