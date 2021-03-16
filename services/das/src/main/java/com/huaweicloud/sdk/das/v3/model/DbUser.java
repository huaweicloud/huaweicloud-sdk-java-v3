package com.huaweicloud.sdk.das.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 注册的数据库用户信息
 */
public class DbUser  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="db_user_id")
    
    private String dbUserId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="db_username")
    
    private String dbUsername;

    public DbUser withDbUserId(String dbUserId) {
        this.dbUserId = dbUserId;
        return this;
    }

    


    /**
     * 数据库用户ID
     * @return dbUserId
     */
    public String getDbUserId() {
        return dbUserId;
    }

    public void setDbUserId(String dbUserId) {
        this.dbUserId = dbUserId;
    }

    

    public DbUser withDbUsername(String dbUsername) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DbUser dbUser = (DbUser) o;
        return Objects.equals(this.dbUserId, dbUser.dbUserId) &&
            Objects.equals(this.dbUsername, dbUser.dbUsername);
    }
    @Override
    public int hashCode() {
        return Objects.hash(dbUserId, dbUsername);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DbUser {\n");
        sb.append("    dbUserId: ").append(toIndentedString(dbUserId)).append("\n");
        sb.append("    dbUsername: ").append(toIndentedString(dbUsername)).append("\n");
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

