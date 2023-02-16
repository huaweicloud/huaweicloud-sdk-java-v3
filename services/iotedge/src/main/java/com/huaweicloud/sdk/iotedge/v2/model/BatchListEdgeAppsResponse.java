package com.huaweicloud.sdk.iotedge.v2.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotedge.v2.model.PageInfoDTO;
import com.huaweicloud.sdk.iotedge.v2.model.QueryApplicationBriefResponseDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class BatchListEdgeAppsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    
    private Integer count;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page_info")
    
    
    private PageInfoDTO pageInfo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="edge_apps")
    
    
    private List<QueryApplicationBriefResponseDTO> edgeApps = null;
    
    public BatchListEdgeAppsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    


    /**
     * 总记录数
     * minimum: 0
     * maximum: 1000000
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    

    public BatchListEdgeAppsResponse withPageInfo(PageInfoDTO pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public BatchListEdgeAppsResponse withPageInfo(Consumer<PageInfoDTO> pageInfoSetter) {
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

    

    public BatchListEdgeAppsResponse withEdgeApps(List<QueryApplicationBriefResponseDTO> edgeApps) {
        this.edgeApps = edgeApps;
        return this;
    }

    
    public BatchListEdgeAppsResponse addEdgeAppsItem(QueryApplicationBriefResponseDTO edgeAppsItem) {
        if(this.edgeApps == null) {
            this.edgeApps = new ArrayList<>();
        }
        this.edgeApps.add(edgeAppsItem);
        return this;
    }

    public BatchListEdgeAppsResponse withEdgeApps(Consumer<List<QueryApplicationBriefResponseDTO>> edgeAppsSetter) {
        if(this.edgeApps == null) {
            this.edgeApps = new ArrayList<>();
        }
        edgeAppsSetter.accept(this.edgeApps);
        return this;
    }

    /**
     * 每页记录数
     * @return edgeApps
     */
    public List<QueryApplicationBriefResponseDTO> getEdgeApps() {
        return edgeApps;
    }

    public void setEdgeApps(List<QueryApplicationBriefResponseDTO> edgeApps) {
        this.edgeApps = edgeApps;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchListEdgeAppsResponse batchListEdgeAppsResponse = (BatchListEdgeAppsResponse) o;
        return Objects.equals(this.count, batchListEdgeAppsResponse.count) &&
            Objects.equals(this.pageInfo, batchListEdgeAppsResponse.pageInfo) &&
            Objects.equals(this.edgeApps, batchListEdgeAppsResponse.edgeApps);
    }
    @Override
    public int hashCode() {
        return Objects.hash(count, pageInfo, edgeApps);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchListEdgeAppsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    edgeApps: ").append(toIndentedString(edgeApps)).append("\n");
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

