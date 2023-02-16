package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.GaussMySqlDatabaseInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 数据库信息。
 */
public class ListGaussMysqlDatabaseInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="charset")
    
    
    private String charset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="users")
    
    
    private List<GaussMySqlDatabaseInfo> users = null;
    
    public ListGaussMysqlDatabaseInfo withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 数据库名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ListGaussMysqlDatabaseInfo withCharset(String charset) {
        this.charset = charset;
        return this;
    }

    


    /**
     * 数据库使用的字符集，如utf8mb4、gbk等。
     * @return charset
     */
    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    

    public ListGaussMysqlDatabaseInfo withUsers(List<GaussMySqlDatabaseInfo> users) {
        this.users = users;
        return this;
    }

    
    public ListGaussMysqlDatabaseInfo addUsersItem(GaussMySqlDatabaseInfo usersItem) {
        if(this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    public ListGaussMysqlDatabaseInfo withUsers(Consumer<List<GaussMySqlDatabaseInfo>> usersSetter) {
        if(this.users == null) {
            this.users = new ArrayList<>();
        }
        usersSetter.accept(this.users);
        return this;
    }

    /**
     * 已授权数据库用户列表。
     * @return users
     */
    public List<GaussMySqlDatabaseInfo> getUsers() {
        return users;
    }

    public void setUsers(List<GaussMySqlDatabaseInfo> users) {
        this.users = users;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListGaussMysqlDatabaseInfo listGaussMysqlDatabaseInfo = (ListGaussMysqlDatabaseInfo) o;
        return Objects.equals(this.name, listGaussMysqlDatabaseInfo.name) &&
            Objects.equals(this.charset, listGaussMysqlDatabaseInfo.charset) &&
            Objects.equals(this.users, listGaussMysqlDatabaseInfo.users);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, charset, users);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGaussMysqlDatabaseInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    charset: ").append(toIndentedString(charset)).append("\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

