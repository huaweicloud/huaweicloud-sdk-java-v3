package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * GaussDBforOpenGaussCreateSchemaReq
 */
public class GaussDBforOpenGaussCreateSchemaReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="owner")
    
    
    private String owner;

    public GaussDBforOpenGaussCreateSchemaReq withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * schema名称。  schema名称在1到63个字符之间，由字母、数字、或下划线组成，不能包含其他特殊字符，不能以“pg”和数字开头，且不能和GaussDB 模板库和已存在的schema重名。 GaussDB 模板库包括postgres， template0 ，template1。  已存在的schema包括public，information_schema。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public GaussDBforOpenGaussCreateSchemaReq withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    


    /**
     * 数据库属主用户。  数据库属主名称在1到63个字符之间，不能以“pg”和数字开头，不能和系统用户名称相同。  系统用户包括“rdsAdmin”,“ rdsMetric”, “rdsBackup”, “rdsRepl”。
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GaussDBforOpenGaussCreateSchemaReq gaussDBforOpenGaussCreateSchemaReq = (GaussDBforOpenGaussCreateSchemaReq) o;
        return Objects.equals(this.name, gaussDBforOpenGaussCreateSchemaReq.name) &&
            Objects.equals(this.owner, gaussDBforOpenGaussCreateSchemaReq.owner);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, owner);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GaussDBforOpenGaussCreateSchemaReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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

