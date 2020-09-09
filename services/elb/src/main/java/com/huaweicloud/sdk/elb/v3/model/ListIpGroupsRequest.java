package com.huaweicloud.sdk.elb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListIpGroupsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="marker")
    
    private String marker;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page_reverse")
    
    private Boolean pageReverse;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private List<String> id = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private List<String> name = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private List<String> description = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ip_list")
    
    private List<String> ipList = null;
    
    public ListIpGroupsRequest withMarker(String marker) {
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

    public ListIpGroupsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * minimum: 0
     * maximum: 2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListIpGroupsRequest withPageReverse(Boolean pageReverse) {
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

    public ListIpGroupsRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    
    public ListIpGroupsRequest addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public ListIpGroupsRequest withId(Consumer<List<String>> idSetter) {
        if(this.id == null ){
            this.id = new ArrayList<>();
        }
        idSetter.accept(this.id);
        return this;
    }

    /**
     * Get id
     * @return id
     */
    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public ListIpGroupsRequest withName(List<String> name) {
        this.name = name;
        return this;
    }

    
    public ListIpGroupsRequest addNameItem(String nameItem) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        this.name.add(nameItem);
        return this;
    }

    public ListIpGroupsRequest withName(Consumer<List<String>> nameSetter) {
        if(this.name == null ){
            this.name = new ArrayList<>();
        }
        nameSetter.accept(this.name);
        return this;
    }

    /**
     * Get name
     * @return name
     */
    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public ListIpGroupsRequest withDescription(List<String> description) {
        this.description = description;
        return this;
    }

    
    public ListIpGroupsRequest addDescriptionItem(String descriptionItem) {
        if (this.description == null) {
            this.description = new ArrayList<>();
        }
        this.description.add(descriptionItem);
        return this;
    }

    public ListIpGroupsRequest withDescription(Consumer<List<String>> descriptionSetter) {
        if(this.description == null ){
            this.description = new ArrayList<>();
        }
        descriptionSetter.accept(this.description);
        return this;
    }

    /**
     * Get description
     * @return description
     */
    public List<String> getDescription() {
        return description;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }

    public ListIpGroupsRequest withIpList(List<String> ipList) {
        this.ipList = ipList;
        return this;
    }

    
    public ListIpGroupsRequest addIpListItem(String ipListItem) {
        if (this.ipList == null) {
            this.ipList = new ArrayList<>();
        }
        this.ipList.add(ipListItem);
        return this;
    }

    public ListIpGroupsRequest withIpList(Consumer<List<String>> ipListSetter) {
        if(this.ipList == null ){
            this.ipList = new ArrayList<>();
        }
        ipListSetter.accept(this.ipList);
        return this;
    }

    /**
     * Get ipList
     * @return ipList
     */
    public List<String> getIpList() {
        return ipList;
    }

    public void setIpList(List<String> ipList) {
        this.ipList = ipList;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListIpGroupsRequest listIpGroupsRequest = (ListIpGroupsRequest) o;
        return Objects.equals(this.marker, listIpGroupsRequest.marker) &&
            Objects.equals(this.limit, listIpGroupsRequest.limit) &&
            Objects.equals(this.pageReverse, listIpGroupsRequest.pageReverse) &&
            Objects.equals(this.id, listIpGroupsRequest.id) &&
            Objects.equals(this.name, listIpGroupsRequest.name) &&
            Objects.equals(this.description, listIpGroupsRequest.description) &&
            Objects.equals(this.ipList, listIpGroupsRequest.ipList);
    }
    @Override
    public int hashCode() {
        return Objects.hash(marker, limit, pageReverse, id, name, description, ipList);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListIpGroupsRequest {\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    pageReverse: ").append(toIndentedString(pageReverse)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    ipList: ").append(toIndentedString(ipList)).append("\n");
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

