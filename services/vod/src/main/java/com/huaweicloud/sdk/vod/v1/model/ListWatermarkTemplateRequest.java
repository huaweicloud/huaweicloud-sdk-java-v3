package com.huaweicloud.sdk.vod.v1.model;





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
    @JsonProperty(value="id")
    
    private List<String> id = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page")
    
    private Integer page;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Integer size;

    public ListWatermarkTemplateRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    
    public ListWatermarkTemplateRequest addIdItem(String idItem) {
        if(this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public ListWatermarkTemplateRequest withId(Consumer<List<String>> idSetter) {
        if(this.id == null) {
            this.id = new ArrayList<>();
        }
        idSetter.accept(this.id);
        return this;
    }

    /**
     * 水印模板配置id，一次最多10个<br/> 
     * @return id
     */
    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    

    public ListWatermarkTemplateRequest withPage(Integer page) {
        this.page = page;
        return this;
    }

    


    /**
     * 分页编号。默认为0。指定id时该参数无效。<br/> 
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
     * 每页记录数。默认为10，范围[1,100]。指定id时该参数无效。<br/> 
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
        return Objects.equals(this.id, listWatermarkTemplateRequest.id) &&
            Objects.equals(this.page, listWatermarkTemplateRequest.page) &&
            Objects.equals(this.size, listWatermarkTemplateRequest.size);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, page, size);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWatermarkTemplateRequest {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

