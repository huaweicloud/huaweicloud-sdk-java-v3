package com.huaweicloud.sdk.rds.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * DropDatabaseV3Req
 */
public class DropDatabaseV3Req  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_force_delete")
    
    private Boolean isForceDelete;

    public DropDatabaseV3Req withIsForceDelete(Boolean isForceDelete) {
        this.isForceDelete = isForceDelete;
        return this;
    }

    


    /**
     * 是否强制删除数据库，默认是false。
     * @return isForceDelete
     */
    public Boolean getIsForceDelete() {
        return isForceDelete;
    }

    public void setIsForceDelete(Boolean isForceDelete) {
        this.isForceDelete = isForceDelete;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DropDatabaseV3Req dropDatabaseV3Req = (DropDatabaseV3Req) o;
        return Objects.equals(this.isForceDelete, dropDatabaseV3Req.isForceDelete);
    }
    @Override
    public int hashCode() {
        return Objects.hash(isForceDelete);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DropDatabaseV3Req {\n");
        sb.append("    isForceDelete: ").append(toIndentedString(isForceDelete)).append("\n");
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

