package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.GaussMySqlDatabaseUser;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 数据库信息列表，列表最大长度为50。
 */
public class CreateGaussMySqlDatabase  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    @JacksonXmlProperty(localName = "name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="character_set")
    
    @JacksonXmlProperty(localName = "character_set")
    
    private String characterSet;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="users")
    
    @JacksonXmlProperty(localName = "users")
    
    private List<GaussMySqlDatabaseUser> users = null;
    
    public CreateGaussMySqlDatabase withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 数据库名称,数据库名称长度可在1～64个字符之间，由字母、数字、下划线组成，且不能包含其他特殊字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public CreateGaussMySqlDatabase withCharacterSet(String characterSet) {
        this.characterSet = characterSet;
        return this;
    }

    


    /**
     * 数据库使用的字符集名称，如utf8mb4、gbk。
     * @return characterSet
     */
    public String getCharacterSet() {
        return characterSet;
    }

    public void setCharacterSet(String characterSet) {
        this.characterSet = characterSet;
    }

    

    public CreateGaussMySqlDatabase withUsers(List<GaussMySqlDatabaseUser> users) {
        this.users = users;
        return this;
    }

    
    public CreateGaussMySqlDatabase addUsersItem(GaussMySqlDatabaseUser usersItem) {
        if(this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    public CreateGaussMySqlDatabase withUsers(Consumer<List<GaussMySqlDatabaseUser>> usersSetter) {
        if(this.users == null) {
            this.users = new ArrayList<>();
        }
        usersSetter.accept(this.users);
        return this;
    }

    /**
     * 数据库用户列表，即创建数据库时同步授权给列表中的用户，列表最大长度为50。列表可以为空，即创建数据库时不授予其权限到数据库用户，在需要给该数据库授权某数据库用户时，调用数据库用户授权接口即可。
     * @return users
     */
    public List<GaussMySqlDatabaseUser> getUsers() {
        return users;
    }

    public void setUsers(List<GaussMySqlDatabaseUser> users) {
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
        CreateGaussMySqlDatabase createGaussMySqlDatabase = (CreateGaussMySqlDatabase) o;
        return Objects.equals(this.name, createGaussMySqlDatabase.name) &&
            Objects.equals(this.characterSet, createGaussMySqlDatabase.characterSet) &&
            Objects.equals(this.users, createGaussMySqlDatabase.users);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, characterSet, users);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateGaussMySqlDatabase {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    characterSet: ").append(toIndentedString(characterSet)).append("\n");
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

