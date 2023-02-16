package com.huaweicloud.sdk.dbss.v1.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dbss.v1.model.ResourceInstanceTagRequest;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListResourceInstanceByTagRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_type")
    
    
    private String resourceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    
    private String limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    
    private String offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    
    private ResourceInstanceTagRequest body;

    public ListResourceInstanceByTagRequest withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    


    /**
     * 资源类型。审计：auditInstance
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    

    public ListResourceInstanceByTagRequest withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 查询记录数（action为count时无此参数）如果action为filter默认为1000，limit最多为1000,不能为负数，最小值为1
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    

    public ListResourceInstanceByTagRequest withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * 索引位置，偏移量（action为count时无此参数）从第一条数据偏移offset条数据后开始查询，如果action为filter默认为0（偏移0条数据，表示从第一条数据开始查询）,必须为数字，不能为负数
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    

    public ListResourceInstanceByTagRequest withBody(ResourceInstanceTagRequest body) {
        this.body = body;
        return this;
    }

    public ListResourceInstanceByTagRequest withBody(Consumer<ResourceInstanceTagRequest> bodySetter) {
        if(this.body == null ){
            this.body = new ResourceInstanceTagRequest();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public ResourceInstanceTagRequest getBody() {
        return body;
    }

    public void setBody(ResourceInstanceTagRequest body) {
        this.body = body;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListResourceInstanceByTagRequest listResourceInstanceByTagRequest = (ListResourceInstanceByTagRequest) o;
        return Objects.equals(this.resourceType, listResourceInstanceByTagRequest.resourceType) &&
            Objects.equals(this.limit, listResourceInstanceByTagRequest.limit) &&
            Objects.equals(this.offset, listResourceInstanceByTagRequest.offset) &&
            Objects.equals(this.body, listResourceInstanceByTagRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(resourceType, limit, offset, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResourceInstanceByTagRequest {\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

