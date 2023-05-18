package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 数据库用户备注信息。
 */
public class UpdateDatabaseUserComment  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="host")
    

    private String host;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="comment")
    

    private String comment;

    public UpdateDatabaseUserComment withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 数据库用户名。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public UpdateDatabaseUserComment withHost(String host) {
        this.host = host;
        return this;
    }

    


    /**
     * 主机地址。
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    

    public UpdateDatabaseUserComment withComment(String comment) {
        this.comment = comment;
        return this;
    }

    


    /**
     * 数据库用户备注,长度不能超过512个字符，不能包含回车和特殊字符!<\"='>&。  该字段只针对新版本的实例生效，必须大于等于指定的内核版本-2.0.13.0，如果不符合内核版本要求，参考升级内核版本升级至最新。
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
        UpdateDatabaseUserComment updateDatabaseUserComment = (UpdateDatabaseUserComment) o;
        return Objects.equals(this.name, updateDatabaseUserComment.name) &&
            Objects.equals(this.host, updateDatabaseUserComment.host) &&
            Objects.equals(this.comment, updateDatabaseUserComment.comment);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, host, comment);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDatabaseUserComment {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
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

