package com.huaweicloud.sdk.iotedge.v3.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotedge.v3.model.PageInfoDTO;
import com.huaweicloud.sdk.iotedge.v3.model.QueryAppImageResponseDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListAppImageResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page_info")
    

    private PageInfoDTO pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_images")
    
    private List<QueryAppImageResponseDTO> appImages = null;
    
    public ListAppImageResponse withCount(Integer count) {
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

    

    public ListAppImageResponse withPageInfo(PageInfoDTO pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListAppImageResponse withPageInfo(Consumer<PageInfoDTO> pageInfoSetter) {
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

    

    public ListAppImageResponse withAppImages(List<QueryAppImageResponseDTO> appImages) {
        this.appImages = appImages;
        return this;
    }

    
    public ListAppImageResponse addAppImagesItem(QueryAppImageResponseDTO appImagesItem) {
        if(this.appImages == null) {
            this.appImages = new ArrayList<>();
        }
        this.appImages.add(appImagesItem);
        return this;
    }

    public ListAppImageResponse withAppImages(Consumer<List<QueryAppImageResponseDTO>> appImagesSetter) {
        if(this.appImages == null) {
            this.appImages = new ArrayList<>();
        }
        appImagesSetter.accept(this.appImages);
        return this;
    }

    /**
     * 每页记录数
     * @return appImages
     */
    public List<QueryAppImageResponseDTO> getAppImages() {
        return appImages;
    }

    public void setAppImages(List<QueryAppImageResponseDTO> appImages) {
        this.appImages = appImages;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAppImageResponse listAppImageResponse = (ListAppImageResponse) o;
        return Objects.equals(this.count, listAppImageResponse.count) &&
            Objects.equals(this.pageInfo, listAppImageResponse.pageInfo) &&
            Objects.equals(this.appImages, listAppImageResponse.appImages);
    }
    @Override
    public int hashCode() {
        return Objects.hash(count, pageInfo, appImages);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAppImageResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    appImages: ").append(toIndentedString(appImages)).append("\n");
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

