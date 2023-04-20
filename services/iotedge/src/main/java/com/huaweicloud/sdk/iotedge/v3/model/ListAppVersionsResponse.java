package com.huaweicloud.sdk.iotedge.v3.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotedge.v3.model.PageInfoDTO;
import com.huaweicloud.sdk.iotedge.v3.model.QueryAppVersionResponseDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListAppVersionsResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page_info")
    

    private PageInfoDTO pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_versions")
    
    private List<QueryAppVersionResponseDTO> appVersions = null;
    
    public ListAppVersionsResponse withCount(Integer count) {
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

    

    public ListAppVersionsResponse withPageInfo(PageInfoDTO pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListAppVersionsResponse withPageInfo(Consumer<PageInfoDTO> pageInfoSetter) {
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

    

    public ListAppVersionsResponse withAppVersions(List<QueryAppVersionResponseDTO> appVersions) {
        this.appVersions = appVersions;
        return this;
    }

    
    public ListAppVersionsResponse addAppVersionsItem(QueryAppVersionResponseDTO appVersionsItem) {
        if(this.appVersions == null) {
            this.appVersions = new ArrayList<>();
        }
        this.appVersions.add(appVersionsItem);
        return this;
    }

    public ListAppVersionsResponse withAppVersions(Consumer<List<QueryAppVersionResponseDTO>> appVersionsSetter) {
        if(this.appVersions == null) {
            this.appVersions = new ArrayList<>();
        }
        appVersionsSetter.accept(this.appVersions);
        return this;
    }

    /**
     * 每页记录数
     * @return appVersions
     */
    public List<QueryAppVersionResponseDTO> getAppVersions() {
        return appVersions;
    }

    public void setAppVersions(List<QueryAppVersionResponseDTO> appVersions) {
        this.appVersions = appVersions;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAppVersionsResponse listAppVersionsResponse = (ListAppVersionsResponse) o;
        return Objects.equals(this.count, listAppVersionsResponse.count) &&
            Objects.equals(this.pageInfo, listAppVersionsResponse.pageInfo) &&
            Objects.equals(this.appVersions, listAppVersionsResponse.appVersions);
    }
    @Override
    public int hashCode() {
        return Objects.hash(count, pageInfo, appVersions);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAppVersionsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    appVersions: ").append(toIndentedString(appVersions)).append("\n");
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

