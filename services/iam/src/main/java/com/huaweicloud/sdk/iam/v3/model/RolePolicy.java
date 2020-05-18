package com.huaweicloud.sdk.iam.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.PolicyDepends;
import com.huaweicloud.sdk.iam.v3.model.PolicyStatement;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class RolePolicy  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Depends")
    
    private List<PolicyDepends> depends = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Statement")
    
    private List<PolicyStatement> statement = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Version")
    
    private String version;

    public RolePolicy withDepends(List<PolicyDepends> depends) {
        this.depends = depends;
        return this;
    }

    
    public RolePolicy addDependsItem(PolicyDepends dependsItem) {
        if (this.depends == null) {
            this.depends = new ArrayList<>();
        }
        this.depends.add(dependsItem);
        return this;
    }

    public RolePolicy withDepends(Consumer<List<PolicyDepends>> dependsSetter) {
        if(this.depends == null ){
            this.depends = new ArrayList<>();
        }
        dependsSetter.accept(this.depends);
        return this;
    }

    /**
     * 该权限所依赖的权限。
     * @return depends
     */
    public List<PolicyDepends> getDepends() {
        return depends;
    }

    public void setDepends(List<PolicyDepends> depends) {
        this.depends = depends;
    }

    public RolePolicy withStatement(List<PolicyStatement> statement) {
        this.statement = statement;
        return this;
    }

    
    public RolePolicy addStatementItem(PolicyStatement statementItem) {
        this.statement.add(statementItem);
        return this;
    }

    public RolePolicy withStatement(Consumer<List<PolicyStatement>> statementSetter) {
        if(this.statement == null ){
            this.statement = new ArrayList<>();
        }
        statementSetter.accept(this.statement);
        return this;
    }

    /**
     * 授权语句，描述权限的具体内容。
     * @return statement
     */
    public List<PolicyStatement> getStatement() {
        return statement;
    }

    public void setStatement(List<PolicyStatement> statement) {
        this.statement = statement;
    }

    public RolePolicy withVersion(String version) {
        this.version = version;
        return this;
    }

    


    /**
     * 权限版本号。   > - 1.0：系统预置的角色。以服务为粒度，提供有限的服务相关角色用于授权。   > - 1.1：策略。IAM最新提供的一种细粒度授权的能力，可以精确到具体服务的操作、资源以及请求条件等。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RolePolicy rolePolicy = (RolePolicy) o;
        return Objects.equals(this.depends, rolePolicy.depends) &&
            Objects.equals(this.statement, rolePolicy.statement) &&
            Objects.equals(this.version, rolePolicy.version);
    }
    @Override
    public int hashCode() {
        return Objects.hash(depends, statement, version);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RolePolicy {\n");
            sb.append("    depends: ").append(toIndentedString(depends)).append("\n");
            sb.append("    statement: ").append(toIndentedString(statement)).append("\n");
            sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

