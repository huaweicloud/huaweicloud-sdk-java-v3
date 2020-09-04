package com.huaweicloud.sdk.mpc.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.WatermarkTemplate;
import com.huaweicloud.sdk.mpc.v1.model.XCodeError;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListWatermarkTemplateResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="templates")
    
    private List<WatermarkTemplate> templates = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error")
    
    private XCodeError error = null;

    public ListWatermarkTemplateResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 水印模板总数。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListWatermarkTemplateResponse withTemplates(List<WatermarkTemplate> templates) {
        this.templates = templates;
        return this;
    }

    
    public ListWatermarkTemplateResponse addTemplatesItem(WatermarkTemplate templatesItem) {
        if (this.templates == null) {
            this.templates = new ArrayList<>();
        }
        this.templates.add(templatesItem);
        return this;
    }

    public ListWatermarkTemplateResponse withTemplates(Consumer<List<WatermarkTemplate>> templatesSetter) {
        if(this.templates == null ){
            this.templates = new ArrayList<>();
        }
        templatesSetter.accept(this.templates);
        return this;
    }

    /**
     * 水印模板
     * @return templates
     */
    public List<WatermarkTemplate> getTemplates() {
        return templates;
    }

    public void setTemplates(List<WatermarkTemplate> templates) {
        this.templates = templates;
    }

    public ListWatermarkTemplateResponse withError(XCodeError error) {
        this.error = error;
        return this;
    }

    public ListWatermarkTemplateResponse withError(Consumer<XCodeError> errorSetter) {
        if(this.error == null ){
            this.error = new XCodeError();
            errorSetter.accept(this.error);
        }
        
        return this;
    }


    /**
     * Get error
     * @return error
     */
    public XCodeError getError() {
        return error;
    }

    public void setError(XCodeError error) {
        this.error = error;
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
        return Objects.equals(this.total, listWatermarkTemplateResponse.total) &&
            Objects.equals(this.templates, listWatermarkTemplateResponse.templates) &&
            Objects.equals(this.error, listWatermarkTemplateResponse.error);
    }
    @Override
    public int hashCode() {
        return Objects.hash(total, templates, error);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWatermarkTemplateResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

