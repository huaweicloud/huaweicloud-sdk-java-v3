package com.huaweicloud.sdk.bcs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * BCS组织实例监控数据详情查询请求结构
 */
public class ListInstanceMetricRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="entity_name")
    
    private String entityName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_name")
    
    private String instanceName;

    public ListInstanceMetricRequestBody withType(String type) {
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

    

    public ListInstanceMetricRequestBody withEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }

    


    /**
     * 所属实体的名称
     * @return entityName
     */
    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    

    public ListInstanceMetricRequestBody withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    


    /**
     * 具体实例的名称
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListInstanceMetricRequestBody listInstanceMetricRequestBody = (ListInstanceMetricRequestBody) o;
        return Objects.equals(this.type, listInstanceMetricRequestBody.type) &&
            Objects.equals(this.entityName, listInstanceMetricRequestBody.entityName) &&
            Objects.equals(this.instanceName, listInstanceMetricRequestBody.instanceName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(type, entityName, instanceName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceMetricRequestBody {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
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

