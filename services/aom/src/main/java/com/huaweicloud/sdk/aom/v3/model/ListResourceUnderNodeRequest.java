package com.huaweicloud.sdk.aom.v3.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v3.model.PageResourceListParam;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListResourceUnderNodeRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rf_resource_type")
    
    
    private String rfResourceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    
    private PageResourceListParam body;

    public ListResourceUnderNodeRequest withRfResourceType(String rfResourceType) {
        this.rfResourceType = rfResourceType;
        return this;
    }

    


    /**
     * 云服务资源；同rms服务的provider
     * @return rfResourceType
     */
    public String getRfResourceType() {
        return rfResourceType;
    }

    public void setRfResourceType(String rfResourceType) {
        this.rfResourceType = rfResourceType;
    }

    

    public ListResourceUnderNodeRequest withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 云服务资源类型；同rms服务的type
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public ListResourceUnderNodeRequest withBody(PageResourceListParam body) {
        this.body = body;
        return this;
    }

    public ListResourceUnderNodeRequest withBody(Consumer<PageResourceListParam> bodySetter) {
        if(this.body == null ){
            this.body = new PageResourceListParam();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public PageResourceListParam getBody() {
        return body;
    }

    public void setBody(PageResourceListParam body) {
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
        ListResourceUnderNodeRequest listResourceUnderNodeRequest = (ListResourceUnderNodeRequest) o;
        return Objects.equals(this.rfResourceType, listResourceUnderNodeRequest.rfResourceType) &&
            Objects.equals(this.type, listResourceUnderNodeRequest.type) &&
            Objects.equals(this.body, listResourceUnderNodeRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(rfResourceType, type, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResourceUnderNodeRequest {\n");
        sb.append("    rfResourceType: ").append(toIndentedString(rfResourceType)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

