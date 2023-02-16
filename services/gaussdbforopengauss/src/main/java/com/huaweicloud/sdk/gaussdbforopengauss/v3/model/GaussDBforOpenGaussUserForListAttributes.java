package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 用户的权限属性。
 */
public class GaussDBforOpenGaussUserForListAttributes  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rolsuper")
    
    
    private Boolean rolsuper;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rolinherit")
    
    
    private Boolean rolinherit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rolcreaterole")
    
    
    private Boolean rolcreaterole;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rolcreatedb")
    
    
    private Boolean rolcreatedb;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rolcanlogin")
    
    
    private Boolean rolcanlogin;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rolconnlimit")
    
    
    private Integer rolconnlimit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rolreplication")
    
    
    private Boolean rolreplication;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rolbypassrls")
    
    
    private Boolean rolbypassrls;

    public GaussDBforOpenGaussUserForListAttributes withRolsuper(Boolean rolsuper) {
        this.rolsuper = rolsuper;
        return this;
    }

    


    /**
     * 用户是否具有超级用户权限，取值为“true”或“false”。
     * @return rolsuper
     */
    public Boolean getRolsuper() {
        return rolsuper;
    }

    public void setRolsuper(Boolean rolsuper) {
        this.rolsuper = rolsuper;
    }

    

    public GaussDBforOpenGaussUserForListAttributes withRolinherit(Boolean rolinherit) {
        this.rolinherit = rolinherit;
        return this;
    }

    


    /**
     * 用户是否自动继承其所属角色的权限，取值为“true”或“false”。
     * @return rolinherit
     */
    public Boolean getRolinherit() {
        return rolinherit;
    }

    public void setRolinherit(Boolean rolinherit) {
        this.rolinherit = rolinherit;
    }

    

    public GaussDBforOpenGaussUserForListAttributes withRolcreaterole(Boolean rolcreaterole) {
        this.rolcreaterole = rolcreaterole;
        return this;
    }

    


    /**
     * 用户是否支持创建其他子用户，取值为“true”或“false”。
     * @return rolcreaterole
     */
    public Boolean getRolcreaterole() {
        return rolcreaterole;
    }

    public void setRolcreaterole(Boolean rolcreaterole) {
        this.rolcreaterole = rolcreaterole;
    }

    

    public GaussDBforOpenGaussUserForListAttributes withRolcreatedb(Boolean rolcreatedb) {
        this.rolcreatedb = rolcreatedb;
        return this;
    }

    


    /**
     * 用户是否可以创建数据库，取值为“true”或“false”。
     * @return rolcreatedb
     */
    public Boolean getRolcreatedb() {
        return rolcreatedb;
    }

    public void setRolcreatedb(Boolean rolcreatedb) {
        this.rolcreatedb = rolcreatedb;
    }

    

    public GaussDBforOpenGaussUserForListAttributes withRolcanlogin(Boolean rolcanlogin) {
        this.rolcanlogin = rolcanlogin;
        return this;
    }

    


    /**
     * 用户是否可以登录数据库，取值为“true”或“false”。
     * @return rolcanlogin
     */
    public Boolean getRolcanlogin() {
        return rolcanlogin;
    }

    public void setRolcanlogin(Boolean rolcanlogin) {
        this.rolcanlogin = rolcanlogin;
    }

    

    public GaussDBforOpenGaussUserForListAttributes withRolconnlimit(Integer rolconnlimit) {
        this.rolconnlimit = rolconnlimit;
        return this;
    }

    


    /**
     * 用户连接实例的最大并发连接数。-1表示没有限制。
     * @return rolconnlimit
     */
    public Integer getRolconnlimit() {
        return rolconnlimit;
    }

    public void setRolconnlimit(Integer rolconnlimit) {
        this.rolconnlimit = rolconnlimit;
    }

    

    public GaussDBforOpenGaussUserForListAttributes withRolreplication(Boolean rolreplication) {
        this.rolreplication = rolreplication;
        return this;
    }

    


    /**
     * 用户是否属于复制角色，取值为“true”或“false”。
     * @return rolreplication
     */
    public Boolean getRolreplication() {
        return rolreplication;
    }

    public void setRolreplication(Boolean rolreplication) {
        this.rolreplication = rolreplication;
    }

    

    public GaussDBforOpenGaussUserForListAttributes withRolbypassrls(Boolean rolbypassrls) {
        this.rolbypassrls = rolbypassrls;
        return this;
    }

    


    /**
     * 用户是否绕过每个行级安全策略，取值为“true”或“false”。
     * @return rolbypassrls
     */
    public Boolean getRolbypassrls() {
        return rolbypassrls;
    }

    public void setRolbypassrls(Boolean rolbypassrls) {
        this.rolbypassrls = rolbypassrls;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GaussDBforOpenGaussUserForListAttributes gaussDBforOpenGaussUserForListAttributes = (GaussDBforOpenGaussUserForListAttributes) o;
        return Objects.equals(this.rolsuper, gaussDBforOpenGaussUserForListAttributes.rolsuper) &&
            Objects.equals(this.rolinherit, gaussDBforOpenGaussUserForListAttributes.rolinherit) &&
            Objects.equals(this.rolcreaterole, gaussDBforOpenGaussUserForListAttributes.rolcreaterole) &&
            Objects.equals(this.rolcreatedb, gaussDBforOpenGaussUserForListAttributes.rolcreatedb) &&
            Objects.equals(this.rolcanlogin, gaussDBforOpenGaussUserForListAttributes.rolcanlogin) &&
            Objects.equals(this.rolconnlimit, gaussDBforOpenGaussUserForListAttributes.rolconnlimit) &&
            Objects.equals(this.rolreplication, gaussDBforOpenGaussUserForListAttributes.rolreplication) &&
            Objects.equals(this.rolbypassrls, gaussDBforOpenGaussUserForListAttributes.rolbypassrls);
    }
    @Override
    public int hashCode() {
        return Objects.hash(rolsuper, rolinherit, rolcreaterole, rolcreatedb, rolcanlogin, rolconnlimit, rolreplication, rolbypassrls);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GaussDBforOpenGaussUserForListAttributes {\n");
        sb.append("    rolsuper: ").append(toIndentedString(rolsuper)).append("\n");
        sb.append("    rolinherit: ").append(toIndentedString(rolinherit)).append("\n");
        sb.append("    rolcreaterole: ").append(toIndentedString(rolcreaterole)).append("\n");
        sb.append("    rolcreatedb: ").append(toIndentedString(rolcreatedb)).append("\n");
        sb.append("    rolcanlogin: ").append(toIndentedString(rolcanlogin)).append("\n");
        sb.append("    rolconnlimit: ").append(toIndentedString(rolconnlimit)).append("\n");
        sb.append("    rolreplication: ").append(toIndentedString(rolreplication)).append("\n");
        sb.append("    rolbypassrls: ").append(toIndentedString(rolbypassrls)).append("\n");
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

