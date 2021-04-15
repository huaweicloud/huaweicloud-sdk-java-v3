package com.huaweicloud.sdk.mpc.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.TemplateInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListTemplateResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="template_array")
    
    private List<TemplateInfo> templateArray = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;

    public ListTemplateResponse withTemplateArray(List<TemplateInfo> templateArray) {
        this.templateArray = templateArray;
        return this;
    }

    
    public ListTemplateResponse addTemplateArrayItem(TemplateInfo templateArrayItem) {
        if(this.templateArray == null) {
            this.templateArray = new ArrayList<>();
        }
        this.templateArray.add(templateArrayItem);
        return this;
    }

    public ListTemplateResponse withTemplateArray(Consumer<List<TemplateInfo>> templateArraySetter) {
        if(this.templateArray == null) {
            this.templateArray = new ArrayList<>();
        }
        templateArraySetter.accept(this.templateArray);
        return this;
    }

    /**
     * 转码模板
     * @return templateArray
     */
    public List<TemplateInfo> getTemplateArray() {
        return templateArray;
    }

    public void setTemplateArray(List<TemplateInfo> templateArray) {
        this.templateArray = templateArray;
    }

    

    public ListTemplateResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 转码模板总数 
     * minimum: 0
     * maximum: 2147483647
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
        ListTemplateResponse listTemplateResponse = (ListTemplateResponse) o;
        return Objects.equals(this.templateArray, listTemplateResponse.templateArray) &&
            Objects.equals(this.total, listTemplateResponse.total);
    }
    @Override
    public int hashCode() {
        return Objects.hash(templateArray, total);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTemplateResponse {\n");
        sb.append("    templateArray: ").append(toIndentedString(templateArray)).append("\n");
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

