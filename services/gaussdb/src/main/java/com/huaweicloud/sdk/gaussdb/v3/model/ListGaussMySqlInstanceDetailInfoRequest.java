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
public class ListGaussMySqlInstanceDetailInfoRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    
    
    private String xLanguage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_ids")
    
    
    private String instanceIds;

    public ListGaussMySqlInstanceDetailInfoRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    


    /**
     * 语言。默认英语。
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

    

    public ListGaussMySqlInstanceDetailInfoRequest withInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

    


    /**
     * 实例ID。最多同时输入20个实例ID，用英文逗号分隔。
     * @return instanceIds
     */
    public String getInstanceIds() {
        return instanceIds;
    }

    public void setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListGaussMySqlInstanceDetailInfoRequest listGaussMySqlInstanceDetailInfoRequest = (ListGaussMySqlInstanceDetailInfoRequest) o;
        return Objects.equals(this.xLanguage, listGaussMySqlInstanceDetailInfoRequest.xLanguage) &&
            Objects.equals(this.instanceIds, listGaussMySqlInstanceDetailInfoRequest.instanceIds);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, instanceIds);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGaussMySqlInstanceDetailInfoRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    instanceIds: ").append(toIndentedString(instanceIds)).append("\n");
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

