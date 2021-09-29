package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.MysqlChangeSpecificationRequest;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ChangeGaussMySqlInstanceSpecificationRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    
    
    private String xLanguage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    
    private MysqlChangeSpecificationRequest body;

    public ChangeGaussMySqlInstanceSpecificationRequest withXLanguage(String xLanguage) {
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

    

    public ChangeGaussMySqlInstanceSpecificationRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * 实例ID，严格匹配UUID规则。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    

    public ChangeGaussMySqlInstanceSpecificationRequest withBody(MysqlChangeSpecificationRequest body) {
        this.body = body;
        return this;
    }

    public ChangeGaussMySqlInstanceSpecificationRequest withBody(Consumer<MysqlChangeSpecificationRequest> bodySetter) {
        if(this.body == null ){
            this.body = new MysqlChangeSpecificationRequest();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public MysqlChangeSpecificationRequest getBody() {
        return body;
    }

    public void setBody(MysqlChangeSpecificationRequest body) {
        this.body = body;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChangeGaussMySqlInstanceSpecificationRequest changeGaussMySqlInstanceSpecificationRequest = (ChangeGaussMySqlInstanceSpecificationRequest) o;
        return Objects.equals(this.xLanguage, changeGaussMySqlInstanceSpecificationRequest.xLanguage) &&
            Objects.equals(this.instanceId, changeGaussMySqlInstanceSpecificationRequest.instanceId) &&
            Objects.equals(this.body, changeGaussMySqlInstanceSpecificationRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, instanceId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeGaussMySqlInstanceSpecificationRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

