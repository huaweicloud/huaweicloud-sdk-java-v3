package com.huaweicloud.sdk.rds.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 数据库信息。
 */
public class PostgresqlListDatabase  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="owner")
    
    private String owner;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="character_set")
    
    private String characterSet;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="collate_set")
    
    private String collateSet;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Integer size;

    public PostgresqlListDatabase withName(String name) {
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

    

    public PostgresqlListDatabase withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    


    /**
     * 数据库所属用户。
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    

    public PostgresqlListDatabase withCharacterSet(String characterSet) {
        this.characterSet = characterSet;
        return this;
    }

    


    /**
     * 数据库使用的字符集，例如UTF8。
     * @return characterSet
     */
    public String getCharacterSet() {
        return characterSet;
    }

    public void setCharacterSet(String characterSet) {
        this.characterSet = characterSet;
    }

    

    public PostgresqlListDatabase withCollateSet(String collateSet) {
        this.collateSet = collateSet;
        return this;
    }

    


    /**
     * 数据库排序集，例如en_US.UTF-8等。
     * @return collateSet
     */
    public String getCollateSet() {
        return collateSet;
    }

    public void setCollateSet(String collateSet) {
        this.collateSet = collateSet;
    }

    

    public PostgresqlListDatabase withSize(Integer size) {
        this.size = size;
        return this;
    }

    


    /**
     * 数据库大小（单位：字节）。
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostgresqlListDatabase postgresqlListDatabase = (PostgresqlListDatabase) o;
        return Objects.equals(this.name, postgresqlListDatabase.name) &&
            Objects.equals(this.owner, postgresqlListDatabase.owner) &&
            Objects.equals(this.characterSet, postgresqlListDatabase.characterSet) &&
            Objects.equals(this.collateSet, postgresqlListDatabase.collateSet) &&
            Objects.equals(this.size, postgresqlListDatabase.size);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, owner, characterSet, collateSet, size);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostgresqlListDatabase {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    characterSet: ").append(toIndentedString(characterSet)).append("\n");
        sb.append("    collateSet: ").append(toIndentedString(collateSet)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

