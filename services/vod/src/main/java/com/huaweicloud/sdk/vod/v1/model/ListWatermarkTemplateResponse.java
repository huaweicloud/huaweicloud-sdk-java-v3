package com.huaweicloud.sdk.vod.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vod.v1.model.WatermarkTemplate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListWatermarkTemplateResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="templates")
    
    private List<WatermarkTemplate> templates = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;

    public ListWatermarkTemplateResponse withTemplates(List<WatermarkTemplate> templates) {
        this.templates = templates;
        return this;
    }

    
    public ListWatermarkTemplateResponse addTemplatesItem(WatermarkTemplate templatesItem) {
        if(this.templates == null) {
            this.templates = new ArrayList<>();
        }
        this.templates.add(templatesItem);
        return this;
    }

    public ListWatermarkTemplateResponse withTemplates(Consumer<List<WatermarkTemplate>> templatesSetter) {
        if(this.templates == null) {
            this.templates = new ArrayList<>();
        }
        templatesSetter.accept(this.templates);
        return this;
    }

    /**
     * Get templates
     * @return templates
     */
    public List<WatermarkTemplate> getTemplates() {
        return templates;
    }

    public void setTemplates(List<WatermarkTemplate> templates) {
        this.templates = templates;
    }

    

    public ListWatermarkTemplateResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * Get total
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListWatermarkTemplateResponse listWatermarkTemplateResponse = (ListWatermarkTemplateResponse) o;
        return Objects.equals(this.templates, listWatermarkTemplateResponse.templates) &&
            Objects.equals(this.total, listWatermarkTemplateResponse.total);
    }
    @Override
    public int hashCode() {
        return Objects.hash(templates, total);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWatermarkTemplateResponse {\n");
        sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

