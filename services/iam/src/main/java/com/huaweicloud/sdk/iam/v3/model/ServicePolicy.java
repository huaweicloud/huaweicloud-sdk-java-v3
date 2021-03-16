package com.huaweicloud.sdk.iam.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.ServiceStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class ServicePolicy  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Version")
    
    private String version;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Statement")
    
    private List<ServiceStatement> statement = null;
    
    public ServicePolicy withVersion(String version) {
        this.version = version;
        return this;
    }

    


    /**
     * 权限版本号，创建自定义策略时，该字段值填为“1.1”。 > - 1.0：系统预置的角色。以服务为粒度，提供有限的服务相关角色用于授权。   > - 1.1：策略。IAM最新提供的一种细粒度授权的能力，可以精确到具体服务的操作、资源以及请求条件等。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    

    public ServicePolicy withStatement(List<ServiceStatement> statement) {
        this.statement = statement;
        return this;
    }

    
    public ServicePolicy addStatementItem(ServiceStatement statementItem) {
        this.statement.add(statementItem);
        return this;
    }

    public ServicePolicy withStatement(Consumer<List<ServiceStatement>> statementSetter) {
        if(this.statement == null ){
            this.statement = new ArrayList<>();
        }
        statementSetter.accept(this.statement);
        return this;
    }

    /**
     * 授权语句，描述自定义策略的具体内容，不超过8个。
     * @return statement
     */
    public List<ServiceStatement> getStatement() {
        return statement;
    }

    public void setStatement(List<ServiceStatement> statement) {
        this.statement = statement;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServicePolicy servicePolicy = (ServicePolicy) o;
        return Objects.equals(this.version, servicePolicy.version) &&
            Objects.equals(this.statement, servicePolicy.statement);
    }
    @Override
    public int hashCode() {
        return Objects.hash(version, statement);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServicePolicy {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    statement: ").append(toIndentedString(statement)).append("\n");
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

