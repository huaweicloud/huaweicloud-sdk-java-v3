package com.huaweicloud.sdk.dns.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dns.v2.model.PageLink;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowPtrRecordSetResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ptrdname")
    
    private String ptrdname;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ttl")
    
    private Integer ttl;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="address")
    
    private String address;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action")
    
    private String action;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="links")
    
    private PageLink links;

    public ShowPtrRecordSetResponse withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * PTR记录的ID，格式形如{region}:{floatingip_id}。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public ShowPtrRecordSetResponse withPtrdname(String ptrdname) {
        this.ptrdname = ptrdname;
        return this;
    }

    


    /**
     * PTR记录对应的域名。
     * @return ptrdname
     */
    public String getPtrdname() {
        return ptrdname;
    }

    public void setPtrdname(String ptrdname) {
        this.ptrdname = ptrdname;
    }

    

    public ShowPtrRecordSetResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 对PTR记录的描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public ShowPtrRecordSetResponse withTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }

    


    /**
     * PTR记录在本地DNS服务器的缓存时间，缓存时间越长更新生效越慢，以秒为单位。
     * @return ttl
     */
    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    

    public ShowPtrRecordSetResponse withAddress(String address) {
        this.address = address;
        return this;
    }

    


    /**
     * 弹性IP的IP地址。
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    

    public ShowPtrRecordSetResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 资源状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public ShowPtrRecordSetResponse withAction(String action) {
        this.action = action;
        return this;
    }

    


    /**
     * 对该资源的当前操作。取值范围：CREATE，UPDATE，DELETE，NONE CREATE：表示创建，UPDATE：表示更新，DELETE：表示删除，NONE：表示无操作
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    

    public ShowPtrRecordSetResponse withLinks(PageLink links) {
        this.links = links;
        return this;
    }

    public ShowPtrRecordSetResponse withLinks(Consumer<PageLink> linksSetter) {
        if(this.links == null ){
            this.links = new PageLink();
            linksSetter.accept(this.links);
        }
        
        return this;
    }


    /**
     * Get links
     * @return links
     */
    public PageLink getLinks() {
        return links;
    }

    public void setLinks(PageLink links) {
        this.links = links;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowPtrRecordSetResponse showPtrRecordSetResponse = (ShowPtrRecordSetResponse) o;
        return Objects.equals(this.id, showPtrRecordSetResponse.id) &&
            Objects.equals(this.ptrdname, showPtrRecordSetResponse.ptrdname) &&
            Objects.equals(this.description, showPtrRecordSetResponse.description) &&
            Objects.equals(this.ttl, showPtrRecordSetResponse.ttl) &&
            Objects.equals(this.address, showPtrRecordSetResponse.address) &&
            Objects.equals(this.status, showPtrRecordSetResponse.status) &&
            Objects.equals(this.action, showPtrRecordSetResponse.action) &&
            Objects.equals(this.links, showPtrRecordSetResponse.links);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, ptrdname, description, ttl, address, status, action, links);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPtrRecordSetResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ptrdname: ").append(toIndentedString(ptrdname)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

