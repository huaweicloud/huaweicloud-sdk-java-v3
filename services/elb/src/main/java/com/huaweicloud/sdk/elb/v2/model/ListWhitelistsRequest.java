package com.huaweicloud.sdk.elb.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListWhitelistsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="marker")
    
    private String marker;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page_reverse")
    
    private Boolean pageReverse;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enable_whitelist")
    
    private Boolean enableWhitelist;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="listener_id")
    
    private String listenerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="whitelist")
    
    private String whitelist;

    public ListWhitelistsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * minimum: 0
     * maximum: -1
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public ListWhitelistsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    


    /**
     * Get marker
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    

    public ListWhitelistsRequest withPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
        return this;
    }

    


    /**
     * Get pageReverse
     * @return pageReverse
     */
    public Boolean getPageReverse() {
        return pageReverse;
    }

    public void setPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
    }

    

    public ListWhitelistsRequest withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * Get id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public ListWhitelistsRequest withEnableWhitelist(Boolean enableWhitelist) {
        this.enableWhitelist = enableWhitelist;
        return this;
    }

    


    /**
     * Get enableWhitelist
     * @return enableWhitelist
     */
    public Boolean getEnableWhitelist() {
        return enableWhitelist;
    }

    public void setEnableWhitelist(Boolean enableWhitelist) {
        this.enableWhitelist = enableWhitelist;
    }

    

    public ListWhitelistsRequest withListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }

    


    /**
     * Get listenerId
     * @return listenerId
     */
    public String getListenerId() {
        return listenerId;
    }

    public void setListenerId(String listenerId) {
        this.listenerId = listenerId;
    }

    

    public ListWhitelistsRequest withWhitelist(String whitelist) {
        this.whitelist = whitelist;
        return this;
    }

    


    /**
     * Get whitelist
     * @return whitelist
     */
    public String getWhitelist() {
        return whitelist;
    }

    public void setWhitelist(String whitelist) {
        this.whitelist = whitelist;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListWhitelistsRequest listWhitelistsRequest = (ListWhitelistsRequest) o;
        return Objects.equals(this.limit, listWhitelistsRequest.limit) &&
            Objects.equals(this.marker, listWhitelistsRequest.marker) &&
            Objects.equals(this.pageReverse, listWhitelistsRequest.pageReverse) &&
            Objects.equals(this.id, listWhitelistsRequest.id) &&
            Objects.equals(this.enableWhitelist, listWhitelistsRequest.enableWhitelist) &&
            Objects.equals(this.listenerId, listWhitelistsRequest.listenerId) &&
            Objects.equals(this.whitelist, listWhitelistsRequest.whitelist);
    }
    @Override
    public int hashCode() {
        return Objects.hash(limit, marker, pageReverse, id, enableWhitelist, listenerId, whitelist);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWhitelistsRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    pageReverse: ").append(toIndentedString(pageReverse)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    enableWhitelist: ").append(toIndentedString(enableWhitelist)).append("\n");
        sb.append("    listenerId: ").append(toIndentedString(listenerId)).append("\n");
        sb.append("    whitelist: ").append(toIndentedString(whitelist)).append("\n");
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

