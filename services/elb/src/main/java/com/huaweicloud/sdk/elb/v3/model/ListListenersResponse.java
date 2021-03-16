package com.huaweicloud.sdk.elb.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v3.model.Listener;
import com.huaweicloud.sdk.elb.v3.model.PageInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListListenersResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="request_id")
    
    private String requestId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page_info")
    
    private PageInfo pageInfo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="listeners")
    
    private List<Listener> listeners = null;
    
    public ListListenersResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    


    /**
     * 请求ID。  注：自动生成 。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    

    public ListListenersResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListListenersResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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

    

    public ListListenersResponse withListeners(List<Listener> listeners) {
        this.listeners = listeners;
        return this;
    }

    
    public ListListenersResponse addListenersItem(Listener listenersItem) {
        this.listeners.add(listenersItem);
        return this;
    }

    public ListListenersResponse withListeners(Consumer<List<Listener>> listenersSetter) {
        if(this.listeners == null ){
            this.listeners = new ArrayList<>();
        }
        listenersSetter.accept(this.listeners);
        return this;
    }

    /**
     * listener的列表。
     * @return listeners
     */
    public List<Listener> getListeners() {
        return listeners;
    }

    public void setListeners(List<Listener> listeners) {
        this.listeners = listeners;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListListenersResponse listListenersResponse = (ListListenersResponse) o;
        return Objects.equals(this.requestId, listListenersResponse.requestId) &&
            Objects.equals(this.pageInfo, listListenersResponse.pageInfo) &&
            Objects.equals(this.listeners, listListenersResponse.listeners);
    }
    @Override
    public int hashCode() {
        return Objects.hash(requestId, pageInfo, listeners);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListListenersResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    listeners: ").append(toIndentedString(listeners)).append("\n");
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

