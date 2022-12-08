package com.huaweicloud.sdk.dbss.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dbss.v1.model.DataBase;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * DataBaseBean
 */
public class DataBaseBean  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="database")
    
    
    private DataBase database;

    public DataBaseBean withDatabase(DataBase database) {
        this.database = database;
        return this;
    }

    public DataBaseBean withDatabase(Consumer<DataBase> databaseSetter) {
        if(this.database == null ){
            this.database = new DataBase();
            databaseSetter.accept(this.database);
        }
        
        return this;
    }


    /**
     * Get database
     * @return database
     */
    public DataBase getDatabase() {
        return database;
    }

    public void setDatabase(DataBase database) {
        this.database = database;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DataBaseBean dataBaseBean = (DataBaseBean) o;
        return Objects.equals(this.database, dataBaseBean.database);
    }
    @Override
    public int hashCode() {
        return Objects.hash(database);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataBaseBean {\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
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

