package com.huaweicloud.sdk.aom.v1.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v1.model.Workflow;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListWorkflowResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="elements")
    
    
    private List<Workflow> elements = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_elements")
    
    
    private Long totalElements;

    public ListWorkflowResponse withElements(List<Workflow> elements) {
        this.elements = elements;
        return this;
    }

    
    public ListWorkflowResponse addElementsItem(Workflow elementsItem) {
        if(this.elements == null) {
            this.elements = new ArrayList<>();
        }
        this.elements.add(elementsItem);
        return this;
    }

    public ListWorkflowResponse withElements(Consumer<List<Workflow>> elementsSetter) {
        if(this.elements == null) {
            this.elements = new ArrayList<>();
        }
        elementsSetter.accept(this.elements);
        return this;
    }

    /**
     * 工作流详情集合。
     * @return elements
     */
    public List<Workflow> getElements() {
        return elements;
    }

    public void setElements(List<Workflow> elements) {
        this.elements = elements;
    }

    

    public ListWorkflowResponse withTotalElements(Long totalElements) {
        this.totalElements = totalElements;
        return this;
    }

    


    /**
     * 总数
     * minimum: 0
     * maximum: 99999999
     * @return totalElements
     */
    public Long getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(Long totalElements) {
        this.totalElements = totalElements;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListWorkflowResponse listWorkflowResponse = (ListWorkflowResponse) o;
        return Objects.equals(this.elements, listWorkflowResponse.elements) &&
            Objects.equals(this.totalElements, listWorkflowResponse.totalElements);
    }
    @Override
    public int hashCode() {
        return Objects.hash(elements, totalElements);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWorkflowResponse {\n");
        sb.append("    elements: ").append(toIndentedString(elements)).append("\n");
        sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
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

