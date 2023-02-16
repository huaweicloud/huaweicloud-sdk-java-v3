package com.huaweicloud.sdk.imagesearch.v2.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.imagesearch.v2.model.SearchParam;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class RunSearchRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service_name")
    
    
    private String serviceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    
    private SearchParam body;

    public RunSearchRequest withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    


    /**
     * 服务实例的名称，用户创建服务实例时指定。
     * @return serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    

    public RunSearchRequest withBody(SearchParam body) {
        this.body = body;
        return this;
    }

    public RunSearchRequest withBody(Consumer<SearchParam> bodySetter) {
        if(this.body == null ){
            this.body = new SearchParam();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public SearchParam getBody() {
        return body;
    }

    public void setBody(SearchParam body) {
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
        RunSearchRequest runSearchRequest = (RunSearchRequest) o;
        return Objects.equals(this.serviceName, runSearchRequest.serviceName) &&
            Objects.equals(this.body, runSearchRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(serviceName, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunSearchRequest {\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
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

