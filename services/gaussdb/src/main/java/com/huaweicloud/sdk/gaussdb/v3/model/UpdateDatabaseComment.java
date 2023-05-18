package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 数据库备注信息。
 */
public class UpdateDatabaseComment  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="comment")
    

    private String comment;

    public UpdateDatabaseComment withName(String name) {
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

    

    public UpdateDatabaseComment withComment(String comment) {
        this.comment = comment;
        return this;
    }

    


    /**
     * 数据库备注,长度不能超过512个字符，不能包含回车和特殊字符!<\"='>&。
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateDatabaseComment updateDatabaseComment = (UpdateDatabaseComment) o;
        return Objects.equals(this.name, updateDatabaseComment.name) &&
            Objects.equals(this.comment, updateDatabaseComment.comment);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, comment);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDatabaseComment {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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

