package com.huaweicloud.sdk.aos.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aos.v1.model.StackResource;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListStackResourcesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stack_resources")
    
    
    private List<StackResource> stackResources = null;
    
    public ListStackResourcesResponse withStackResources(List<StackResource> stackResources) {
        this.stackResources = stackResources;
        return this;
    }

    
    public ListStackResourcesResponse addStackResourcesItem(StackResource stackResourcesItem) {
        if(this.stackResources == null) {
            this.stackResources = new ArrayList<>();
        }
        this.stackResources.add(stackResourcesItem);
        return this;
    }

    public ListStackResourcesResponse withStackResources(Consumer<List<StackResource>> stackResourcesSetter) {
        if(this.stackResources == null) {
            this.stackResources = new ArrayList<>();
        }
        stackResourcesSetter.accept(this.stackResources);
        return this;
    }

    /**
     * 资源栈输出
     * @return stackResources
     */
    public List<StackResource> getStackResources() {
        return stackResources;
    }

    public void setStackResources(List<StackResource> stackResources) {
        this.stackResources = stackResources;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListStackResourcesResponse listStackResourcesResponse = (ListStackResourcesResponse) o;
        return Objects.equals(this.stackResources, listStackResourcesResponse.stackResources);
    }
    @Override
    public int hashCode() {
        return Objects.hash(stackResources);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStackResourcesResponse {\n");
        sb.append("    stackResources: ").append(toIndentedString(stackResources)).append("\n");
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

