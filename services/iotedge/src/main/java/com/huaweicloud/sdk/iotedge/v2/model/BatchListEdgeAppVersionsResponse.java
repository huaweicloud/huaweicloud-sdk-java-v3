package com.huaweicloud.sdk.iotedge.v2.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotedge.v2.model.PageInfoDTO;
import com.huaweicloud.sdk.iotedge.v2.model.QueryEdgeAppVersionBriefResponseDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class BatchListEdgeAppVersionsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    
    private Integer count;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page_info")
    
    
    private PageInfoDTO pageInfo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="versions")
    
    
    private List<QueryEdgeAppVersionBriefResponseDTO> versions = null;
    
    public BatchListEdgeAppVersionsResponse withCount(Integer count) {
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

    

    public BatchListEdgeAppVersionsResponse withPageInfo(PageInfoDTO pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public BatchListEdgeAppVersionsResponse withPageInfo(Consumer<PageInfoDTO> pageInfoSetter) {
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

    

    public BatchListEdgeAppVersionsResponse withVersions(List<QueryEdgeAppVersionBriefResponseDTO> versions) {
        this.versions = versions;
        return this;
    }

    
    public BatchListEdgeAppVersionsResponse addVersionsItem(QueryEdgeAppVersionBriefResponseDTO versionsItem) {
        if(this.versions == null) {
            this.versions = new ArrayList<>();
        }
        this.versions.add(versionsItem);
        return this;
    }

    public BatchListEdgeAppVersionsResponse withVersions(Consumer<List<QueryEdgeAppVersionBriefResponseDTO>> versionsSetter) {
        if(this.versions == null) {
            this.versions = new ArrayList<>();
        }
        versionsSetter.accept(this.versions);
        return this;
    }

    /**
     * 每页记录数
     * @return versions
     */
    public List<QueryEdgeAppVersionBriefResponseDTO> getVersions() {
        return versions;
    }

    public void setVersions(List<QueryEdgeAppVersionBriefResponseDTO> versions) {
        this.versions = versions;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchListEdgeAppVersionsResponse batchListEdgeAppVersionsResponse = (BatchListEdgeAppVersionsResponse) o;
        return Objects.equals(this.count, batchListEdgeAppVersionsResponse.count) &&
            Objects.equals(this.pageInfo, batchListEdgeAppVersionsResponse.pageInfo) &&
            Objects.equals(this.versions, batchListEdgeAppVersionsResponse.versions);
    }
    @Override
    public int hashCode() {
        return Objects.hash(count, pageInfo, versions);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchListEdgeAppVersionsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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

