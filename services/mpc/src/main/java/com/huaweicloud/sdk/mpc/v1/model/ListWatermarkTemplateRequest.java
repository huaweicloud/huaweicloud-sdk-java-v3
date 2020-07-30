package com.huaweicloud.sdk.mpc.v1.model;




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
public class ListWatermarkTemplateRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="template_id")
    
    private List<Integer> templateId = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page")
    
    private Integer page = 0;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Integer size = 10;

    public ListWatermarkTemplateRequest withTemplateId(List<Integer> templateId) {
        this.templateId = templateId;
        return this;
    }

    
    public ListWatermarkTemplateRequest addTemplateIdItem(Integer templateIdItem) {
        if (this.templateId == null) {
            this.templateId = new ArrayList<>();
        }
        this.templateId.add(templateIdItem);
        return this;
    }

    public ListWatermarkTemplateRequest withTemplateId(Consumer<List<Integer>> templateIdSetter) {
        if(this.templateId == null ){
            this.templateId = new ArrayList<>();
        }
        templateIdSetter.accept(this.templateId);
        return this;
    }

    /**
     * Get templateId
     * @return templateId
     */
    public List<Integer> getTemplateId() {
        return templateId;
    }

    public void setTemplateId(List<Integer> templateId) {
        this.templateId = templateId;
    }

    public ListWatermarkTemplateRequest withPage(Integer page) {
        this.page = page;
        return this;
    }

    


    /**
     * Get page
     * minimum: 0
     * maximum: 50000
     * @return page
     */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public ListWatermarkTemplateRequest withSize(Integer size) {
        this.size = size;
        return this;
    }

    


    /**
     * Get size
     * minimum: 0
     * maximum: 100
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListWatermarkTemplateRequest listWatermarkTemplateRequest = (ListWatermarkTemplateRequest) o;
        return Objects.equals(this.templateId, listWatermarkTemplateRequest.templateId) &&
            Objects.equals(this.page, listWatermarkTemplateRequest.page) &&
            Objects.equals(this.size, listWatermarkTemplateRequest.size);
    }
    @Override
    public int hashCode() {
        return Objects.hash(templateId, page, size);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWatermarkTemplateRequest {\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

