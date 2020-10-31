package com.huaweicloud.sdk.sms.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 修改源端信息json的请求体，当前只支持修改源端服务器名称和迁移项目id
 */
public class PutSourceServerBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="migprojectid")
    
    private String migprojectid;

    public PutSourceServerBody withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 源端服务器修改后的名字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PutSourceServerBody withMigprojectid(String migprojectid) {
        this.migprojectid = migprojectid;
        return this;
    }

    


    /**
     * 源端服务器修改后所属的迁移项目id
     * @return migprojectid
     */
    public String getMigprojectid() {
        return migprojectid;
    }

    public void setMigprojectid(String migprojectid) {
        this.migprojectid = migprojectid;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PutSourceServerBody putSourceServerBody = (PutSourceServerBody) o;
        return Objects.equals(this.name, putSourceServerBody.name) &&
            Objects.equals(this.migprojectid, putSourceServerBody.migprojectid);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, migprojectid);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutSourceServerBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    migprojectid: ").append(toIndentedString(migprojectid)).append("\n");
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

