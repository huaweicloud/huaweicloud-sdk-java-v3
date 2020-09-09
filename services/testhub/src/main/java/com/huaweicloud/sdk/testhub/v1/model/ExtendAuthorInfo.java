package com.huaweicloud.sdk.testhub.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ExtendAuthorInfo
 */
public class ExtendAuthorInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="time")
    
    private String time;

    public ExtendAuthorInfo withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * id信息
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ExtendAuthorInfo withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 名称信息
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ExtendAuthorInfo withTime(String time) {
        this.time = time;
        return this;
    }

    


    /**
     * 时间信息
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExtendAuthorInfo extendAuthorInfo = (ExtendAuthorInfo) o;
        return Objects.equals(this.id, extendAuthorInfo.id) &&
            Objects.equals(this.name, extendAuthorInfo.name) &&
            Objects.equals(this.time, extendAuthorInfo.time);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, time);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtendAuthorInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

