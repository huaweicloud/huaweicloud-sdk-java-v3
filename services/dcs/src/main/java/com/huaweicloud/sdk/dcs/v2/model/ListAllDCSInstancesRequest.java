package com.huaweicloud.sdk.dcs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListAllDCSInstancesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="include_failure")
    
    private String includeFailure;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name_equal")
    
    private String nameEqual;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private String tags;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ip")
    
    private String ip;

    public ListAllDCSInstancesRequest withId(String id) {
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

    public ListAllDCSInstancesRequest withIncludeFailure(String includeFailure) {
        this.includeFailure = includeFailure;
        return this;
    }

    


    /**
     * Get includeFailure
     * @return includeFailure
     */
    public String getIncludeFailure() {
        return includeFailure;
    }

    public void setIncludeFailure(String includeFailure) {
        this.includeFailure = includeFailure;
    }

    public ListAllDCSInstancesRequest withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListAllDCSInstancesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * Get offset
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListAllDCSInstancesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListAllDCSInstancesRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * Get status
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListAllDCSInstancesRequest withNameEqual(String nameEqual) {
        this.nameEqual = nameEqual;
        return this;
    }

    


    /**
     * Get nameEqual
     * @return nameEqual
     */
    public String getNameEqual() {
        return nameEqual;
    }

    public void setNameEqual(String nameEqual) {
        this.nameEqual = nameEqual;
    }

    public ListAllDCSInstancesRequest withTags(String tags) {
        this.tags = tags;
        return this;
    }

    


    /**
     * Get tags
     * @return tags
     */
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public ListAllDCSInstancesRequest withIp(String ip) {
        this.ip = ip;
        return this;
    }

    


    /**
     * Get ip
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAllDCSInstancesRequest listAllDCSInstancesRequest = (ListAllDCSInstancesRequest) o;
        return Objects.equals(this.id, listAllDCSInstancesRequest.id) &&
            Objects.equals(this.includeFailure, listAllDCSInstancesRequest.includeFailure) &&
            Objects.equals(this.name, listAllDCSInstancesRequest.name) &&
            Objects.equals(this.offset, listAllDCSInstancesRequest.offset) &&
            Objects.equals(this.limit, listAllDCSInstancesRequest.limit) &&
            Objects.equals(this.status, listAllDCSInstancesRequest.status) &&
            Objects.equals(this.nameEqual, listAllDCSInstancesRequest.nameEqual) &&
            Objects.equals(this.tags, listAllDCSInstancesRequest.tags) &&
            Objects.equals(this.ip, listAllDCSInstancesRequest.ip);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, includeFailure, name, offset, limit, status, nameEqual, tags, ip);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAllDCSInstancesRequest {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    includeFailure: ").append(toIndentedString(includeFailure)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    nameEqual: ").append(toIndentedString(nameEqual)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
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

