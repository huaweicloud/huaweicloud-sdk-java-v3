package com.huaweicloud.sdk.codehub.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListTwoTemplatesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="platform")
    
    private String platform;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="language")
    
    private String language;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pipeline")
    
    private String pipeline;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enter_type")
    
    private String enterType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="search")
    
    private String search;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="date_order")
    
    private String dateOrder;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="used_time_order")
    
    private String usedTimeOrder;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region")
    
    private String region;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page_no")
    
    private String pageNo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page_size")
    
    private String pageSize;

    public ListTwoTemplatesRequest withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    


    /**
     * Get platform
     * @return platform
     */
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public ListTwoTemplatesRequest withLanguage(String language) {
        this.language = language;
        return this;
    }

    


    /**
     * Get language
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public ListTwoTemplatesRequest withPipeline(String pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    


    /**
     * Get pipeline
     * @return pipeline
     */
    public String getPipeline() {
        return pipeline;
    }

    public void setPipeline(String pipeline) {
        this.pipeline = pipeline;
    }

    public ListTwoTemplatesRequest withEnterType(String enterType) {
        this.enterType = enterType;
        return this;
    }

    


    /**
     * Get enterType
     * @return enterType
     */
    public String getEnterType() {
        return enterType;
    }

    public void setEnterType(String enterType) {
        this.enterType = enterType;
    }

    public ListTwoTemplatesRequest withSearch(String search) {
        this.search = search;
        return this;
    }

    


    /**
     * Get search
     * @return search
     */
    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public ListTwoTemplatesRequest withDateOrder(String dateOrder) {
        this.dateOrder = dateOrder;
        return this;
    }

    


    /**
     * Get dateOrder
     * @return dateOrder
     */
    public String getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(String dateOrder) {
        this.dateOrder = dateOrder;
    }

    public ListTwoTemplatesRequest withUsedTimeOrder(String usedTimeOrder) {
        this.usedTimeOrder = usedTimeOrder;
        return this;
    }

    


    /**
     * Get usedTimeOrder
     * @return usedTimeOrder
     */
    public String getUsedTimeOrder() {
        return usedTimeOrder;
    }

    public void setUsedTimeOrder(String usedTimeOrder) {
        this.usedTimeOrder = usedTimeOrder;
    }

    public ListTwoTemplatesRequest withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * Get type
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ListTwoTemplatesRequest withRegion(String region) {
        this.region = region;
        return this;
    }

    


    /**
     * Get region
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ListTwoTemplatesRequest withPageNo(String pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    


    /**
     * Get pageNo
     * @return pageNo
     */
    public String getPageNo() {
        return pageNo;
    }

    public void setPageNo(String pageNo) {
        this.pageNo = pageNo;
    }

    public ListTwoTemplatesRequest withPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    


    /**
     * Get pageSize
     * @return pageSize
     */
    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTwoTemplatesRequest listTwoTemplatesRequest = (ListTwoTemplatesRequest) o;
        return Objects.equals(this.platform, listTwoTemplatesRequest.platform) &&
            Objects.equals(this.language, listTwoTemplatesRequest.language) &&
            Objects.equals(this.pipeline, listTwoTemplatesRequest.pipeline) &&
            Objects.equals(this.enterType, listTwoTemplatesRequest.enterType) &&
            Objects.equals(this.search, listTwoTemplatesRequest.search) &&
            Objects.equals(this.dateOrder, listTwoTemplatesRequest.dateOrder) &&
            Objects.equals(this.usedTimeOrder, listTwoTemplatesRequest.usedTimeOrder) &&
            Objects.equals(this.type, listTwoTemplatesRequest.type) &&
            Objects.equals(this.region, listTwoTemplatesRequest.region) &&
            Objects.equals(this.pageNo, listTwoTemplatesRequest.pageNo) &&
            Objects.equals(this.pageSize, listTwoTemplatesRequest.pageSize);
    }
    @Override
    public int hashCode() {
        return Objects.hash(platform, language, pipeline, enterType, search, dateOrder, usedTimeOrder, type, region, pageNo, pageSize);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTwoTemplatesRequest {\n");
        sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    pipeline: ").append(toIndentedString(pipeline)).append("\n");
        sb.append("    enterType: ").append(toIndentedString(enterType)).append("\n");
        sb.append("    search: ").append(toIndentedString(search)).append("\n");
        sb.append("    dateOrder: ").append(toIndentedString(dateOrder)).append("\n");
        sb.append("    usedTimeOrder: ").append(toIndentedString(usedTimeOrder)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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

