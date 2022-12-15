package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 数据库名称列表，即创建数据库用户时同步将列表中的数据库授权给用户，列表最大长度为50。列表可以为空，在需要给该用户授权某数据库时，调用数据库用户授权接口即可。
 */
public class CreateDatabaseList  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="readonly")
    
    
    private Boolean readonly;

    public CreateDatabaseList withName(String name) {
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

    

    public CreateDatabaseList withReadonly(Boolean readonly) {
        this.readonly = readonly;
        return this;
    }

    


    /**
     * 是否为只读权限： - true，表示只读。 - false，表示可读写。
     * @return readonly
     */
    public Boolean getReadonly() {
        return readonly;
    }

    public void setReadonly(Boolean readonly) {
        this.readonly = readonly;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateDatabaseList createDatabaseList = (CreateDatabaseList) o;
        return Objects.equals(this.name, createDatabaseList.name) &&
            Objects.equals(this.readonly, createDatabaseList.readonly);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, readonly);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDatabaseList {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    readonly: ").append(toIndentedString(readonly)).append("\n");
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

