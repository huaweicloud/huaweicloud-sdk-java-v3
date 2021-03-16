package com.huaweicloud.sdk.bcs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * BCS组织监控数据列表查询请求结构
 */
public class ListEntityMetricRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="entity_name")
    
    private String entityName;

    public ListEntityMetricRequestBody withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 实体类型，可选值如下 org     # 节点组织 plugin  # 插件 默认为org 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public ListEntityMetricRequestBody withEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }

    


    /**
     * 具体实体的名称
     * @return entityName
     */
    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEntityMetricRequestBody listEntityMetricRequestBody = (ListEntityMetricRequestBody) o;
        return Objects.equals(this.type, listEntityMetricRequestBody.type) &&
            Objects.equals(this.entityName, listEntityMetricRequestBody.entityName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(type, entityName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEntityMetricRequestBody {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
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

