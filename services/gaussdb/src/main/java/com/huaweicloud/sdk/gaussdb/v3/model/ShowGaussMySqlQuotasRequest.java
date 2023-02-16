package com.huaweicloud.sdk.gaussdb.v3.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowGaussMySqlQuotasRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    
    
    private String xLanguage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    
    private String offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    
    private String limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_name")
    
    
    private String enterpriseProjectName;

    public ShowGaussMySqlQuotasRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    


    /**
     * 语言
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    

    public ShowGaussMySqlQuotasRequest withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * 索引位置，偏移量。从第一条数据偏移offset条数据后开始查询，默认为0（偏移0条数据，表示从第一条数据开始查询），必须为数字，不能为负数。  取值范围：0 - 10000
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    

    public ShowGaussMySqlQuotasRequest withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 查询记录数。默认为10，不能为负数，最小值为1，最大值为100。
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    

    public ShowGaussMySqlQuotasRequest withEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
        return this;
    }

    


    /**
     * 企业项目名称。
     * @return enterpriseProjectName
     */
    public String getEnterpriseProjectName() {
        return enterpriseProjectName;
    }

    public void setEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowGaussMySqlQuotasRequest showGaussMySqlQuotasRequest = (ShowGaussMySqlQuotasRequest) o;
        return Objects.equals(this.xLanguage, showGaussMySqlQuotasRequest.xLanguage) &&
            Objects.equals(this.offset, showGaussMySqlQuotasRequest.offset) &&
            Objects.equals(this.limit, showGaussMySqlQuotasRequest.limit) &&
            Objects.equals(this.enterpriseProjectName, showGaussMySqlQuotasRequest.enterpriseProjectName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, offset, limit, enterpriseProjectName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowGaussMySqlQuotasRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    enterpriseProjectName: ").append(toIndentedString(enterpriseProjectName)).append("\n");
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

