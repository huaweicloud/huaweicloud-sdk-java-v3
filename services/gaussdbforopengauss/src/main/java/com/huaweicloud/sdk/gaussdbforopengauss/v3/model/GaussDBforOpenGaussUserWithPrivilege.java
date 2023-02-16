package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 用户及其权限。
 */
public class GaussDBforOpenGaussUserWithPrivilege  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="readonly")
    
    
    private Boolean readonly;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="schema_name")
    
    
    private String schemaName;

    public GaussDBforOpenGaussUserWithPrivilege withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 数据库帐号名称。  数据库帐号名称在1到63个字符之间，由字母、数字、或下划线组成，不能包含其他特殊字符，不能以“pg”和数字开头，不能和系统用户名称相同且帐号名称必须存在。  系统用户包括“rdsAdmin”,“ rdsMetric”, “rdsBackup”, “rdsRepl”。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public GaussDBforOpenGaussUserWithPrivilege withReadonly(Boolean readonly) {
        this.readonly = readonly;
        return this;
    }

    


    /**
     * 数据库帐号权限。 - true：只读。 - false：可读可写。
     * @return readonly
     */
    public Boolean getReadonly() {
        return readonly;
    }

    public void setReadonly(Boolean readonly) {
        this.readonly = readonly;
    }

    

    public GaussDBforOpenGaussUserWithPrivilege withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    


    /**
     * schema名称。  schema名称在1到63个字符之间，由字母、数字、或下划线组成，不能包含其他特殊字符，不能以“pg”和数字开头，不能和GaussDB 模板库重名，且schema名称必须存在。  GaussDB 模板库包括postgres， template0 ，template1, public，information_schema。
     * @return schemaName
     */
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GaussDBforOpenGaussUserWithPrivilege gaussDBforOpenGaussUserWithPrivilege = (GaussDBforOpenGaussUserWithPrivilege) o;
        return Objects.equals(this.name, gaussDBforOpenGaussUserWithPrivilege.name) &&
            Objects.equals(this.readonly, gaussDBforOpenGaussUserWithPrivilege.readonly) &&
            Objects.equals(this.schemaName, gaussDBforOpenGaussUserWithPrivilege.schemaName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, readonly, schemaName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GaussDBforOpenGaussUserWithPrivilege {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    readonly: ").append(toIndentedString(readonly)).append("\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
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

