package com.huaweicloud.sdk.cloudpipeline.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListTemplatesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    
    private String xLanguage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="template_type")
    
    private String templateType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_build_in")
    
    private String isBuildIn;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sort")
    
    private String sort;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="asc")
    
    private String asc;

    public ListTemplatesRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    


    /**
     * Get xLanguage
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public ListTemplatesRequest withTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }

    


    /**
     * Get templateType
     * @return templateType
     */
    public String getTemplateType() {
        return templateType;
    }

    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    public ListTemplatesRequest withIsBuildIn(String isBuildIn) {
        this.isBuildIn = isBuildIn;
        return this;
    }

    


    /**
     * Get isBuildIn
     * @return isBuildIn
     */
    public String getIsBuildIn() {
        return isBuildIn;
    }

    public void setIsBuildIn(String isBuildIn) {
        this.isBuildIn = isBuildIn;
    }

    public ListTemplatesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * Get offset
     * minimum: 0
     * maximum: 100
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListTemplatesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListTemplatesRequest withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListTemplatesRequest withSort(String sort) {
        this.sort = sort;
        return this;
    }

    


    /**
     * Get sort
     * @return sort
     */
    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public ListTemplatesRequest withAsc(String asc) {
        this.asc = asc;
        return this;
    }

    


    /**
     * Get asc
     * @return asc
     */
    public String getAsc() {
        return asc;
    }

    public void setAsc(String asc) {
        this.asc = asc;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTemplatesRequest listTemplatesRequest = (ListTemplatesRequest) o;
        return Objects.equals(this.xLanguage, listTemplatesRequest.xLanguage) &&
            Objects.equals(this.templateType, listTemplatesRequest.templateType) &&
            Objects.equals(this.isBuildIn, listTemplatesRequest.isBuildIn) &&
            Objects.equals(this.offset, listTemplatesRequest.offset) &&
            Objects.equals(this.limit, listTemplatesRequest.limit) &&
            Objects.equals(this.name, listTemplatesRequest.name) &&
            Objects.equals(this.sort, listTemplatesRequest.sort) &&
            Objects.equals(this.asc, listTemplatesRequest.asc);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, templateType, isBuildIn, offset, limit, name, sort, asc);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTemplatesRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    templateType: ").append(toIndentedString(templateType)).append("\n");
        sb.append("    isBuildIn: ").append(toIndentedString(isBuildIn)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
        sb.append("    asc: ").append(toIndentedString(asc)).append("\n");
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

