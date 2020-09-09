package com.huaweicloud.sdk.cloudide.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cloudide.v2.model.PageInstancesVO;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListInstancesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instances")
    
    private PageInstancesVO instances = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;

    public ListInstancesResponse withInstances(PageInstancesVO instances) {
        this.instances = instances;
        return this;
    }

    public ListInstancesResponse withInstances(Consumer<PageInstancesVO> instancesSetter) {
        if(this.instances == null ){
            this.instances = new PageInstancesVO();
            instancesSetter.accept(this.instances);
        }
        
        return this;
    }


    /**
     * Get instances
     * @return instances
     */
    public PageInstancesVO getInstances() {
        return instances;
    }

    public void setInstances(PageInstancesVO instances) {
        this.instances = instances;
    }

    public ListInstancesResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListInstancesResponse listInstancesResponse = (ListInstancesResponse) o;
        return Objects.equals(this.instances, listInstancesResponse.instances) &&
            Objects.equals(this.status, listInstancesResponse.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instances, status);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstancesResponse {\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

