package com.huaweicloud.sdk.devstar.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * PipelineTemplateInfo
 */
public class PipelineTemplateInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="detail")
    
    private String detail;

    public PipelineTemplateInfo withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 流水线模板的id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public PipelineTemplateInfo withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 流水线模板的名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public PipelineTemplateInfo withDetail(String detail) {
        this.detail = detail;
        return this;
    }

    


    /**
     * 流水线模板的详细信息。
     * @return detail
     */
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PipelineTemplateInfo pipelineTemplateInfo = (PipelineTemplateInfo) o;
        return Objects.equals(this.id, pipelineTemplateInfo.id) &&
            Objects.equals(this.name, pipelineTemplateInfo.name) &&
            Objects.equals(this.detail, pipelineTemplateInfo.detail);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, detail);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PipelineTemplateInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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

