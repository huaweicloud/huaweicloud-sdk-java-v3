package com.huaweicloud.sdk.cloudpipeline.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cloudpipeline.v1.model.TemplateView;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListTemplatesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page_number")
    
    private Integer pageNumber;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page_size")
    
    private Integer pageSize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="content")
    
    private List<TemplateView> content = null;
    
    public ListTemplatesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListTemplatesResponse withPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    


    /**
     * 页码数
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public ListTemplatesResponse withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    


    /**
     * 每页显示数
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public ListTemplatesResponse withContent(List<TemplateView> content) {
        this.content = content;
        return this;
    }

    
    public ListTemplatesResponse addContentItem(TemplateView contentItem) {
        if (this.content == null) {
            this.content = new ArrayList<>();
        }
        this.content.add(contentItem);
        return this;
    }

    public ListTemplatesResponse withContent(Consumer<List<TemplateView>> contentSetter) {
        if(this.content == null ){
            this.content = new ArrayList<>();
        }
        contentSetter.accept(this.content);
        return this;
    }

    /**
     * 模板数据,list类型数据
     * @return content
     */
    public List<TemplateView> getContent() {
        return content;
    }

    public void setContent(List<TemplateView> content) {
        this.content = content;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTemplatesResponse listTemplatesResponse = (ListTemplatesResponse) o;
        return Objects.equals(this.total, listTemplatesResponse.total) &&
            Objects.equals(this.pageNumber, listTemplatesResponse.pageNumber) &&
            Objects.equals(this.pageSize, listTemplatesResponse.pageSize) &&
            Objects.equals(this.content, listTemplatesResponse.content);
    }
    @Override
    public int hashCode() {
        return Objects.hash(total, pageNumber, pageSize, content);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTemplatesResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

