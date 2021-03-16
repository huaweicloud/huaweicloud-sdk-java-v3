package com.huaweicloud.sdk.das.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 注册数据库用户请求
 */
public class RegisterDbUserRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="db_username")
    
    private String dbUsername;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="db_user_password")
    
    private String dbUserPassword;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="datastore_type")
    
    private String datastoreType;

    public RegisterDbUserRequestBody withDbUsername(String dbUsername) {
        this.dbUsername = dbUsername;
        return this;
    }

    


    /**
     * 数据库用户名称
     * @return dbUsername
     */
    public String getDbUsername() {
        return dbUsername;
    }

    public void setDbUsername(String dbUsername) {
        this.dbUsername = dbUsername;
    }

    

    public RegisterDbUserRequestBody withDbUserPassword(String dbUserPassword) {
        this.dbUserPassword = dbUserPassword;
        return this;
    }

    


    /**
     * 数据库用户密码
     * @return dbUserPassword
     */
    public String getDbUserPassword() {
        return dbUserPassword;
    }

    public void setDbUserPassword(String dbUserPassword) {
        this.dbUserPassword = dbUserPassword;
    }

    

    public RegisterDbUserRequestBody withDatastoreType(String datastoreType) {
        this.datastoreType = datastoreType;
        return this;
    }

    


    /**
     * 数据库类型，取值为MySQL
     * @return datastoreType
     */
    public String getDatastoreType() {
        return datastoreType;
    }

    public void setDatastoreType(String datastoreType) {
        this.datastoreType = datastoreType;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RegisterDbUserRequestBody registerDbUserRequestBody = (RegisterDbUserRequestBody) o;
        return Objects.equals(this.dbUsername, registerDbUserRequestBody.dbUsername) &&
            Objects.equals(this.dbUserPassword, registerDbUserRequestBody.dbUserPassword) &&
            Objects.equals(this.datastoreType, registerDbUserRequestBody.datastoreType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(dbUsername, dbUserPassword, datastoreType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RegisterDbUserRequestBody {\n");
        sb.append("    dbUsername: ").append(toIndentedString(dbUsername)).append("\n");
        sb.append("    dbUserPassword: ").append(toIndentedString(dbUserPassword)).append("\n");
        sb.append("    datastoreType: ").append(toIndentedString(datastoreType)).append("\n");
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

