package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Topic
 */
public class Topic  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private Integer id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="permission")
    
    private Integer permission;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_private")
    
    private Integer isPrivate;

    public Topic withId(Integer id) {
        this.id = id;
        return this;
    }

    


    /**
     * TOPIC的ID
     * minimum: 1
     * maximum: 999999999999999999
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    

    public Topic withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * TOPIC的名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public Topic withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * TOPIC描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public Topic withPermission(Integer permission) {
        this.permission = permission;
        return this;
    }

    


    /**
     * TOPIC权限, 主题权限 0-发布 1-订阅
     * minimum: 0
     * maximum: 10
     * @return permission
     */
    public Integer getPermission() {
        return permission;
    }

    public void setPermission(Integer permission) {
        this.permission = permission;
    }

    

    public Topic withIsPrivate(Integer isPrivate) {
        this.isPrivate = isPrivate;
        return this;
    }

    


    /**
     * TOPIC类型 0-基础TOPIC 1-用户自定义TOPIC
     * minimum: 0
     * maximum: 10
     * @return isPrivate
     */
    public Integer getIsPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(Integer isPrivate) {
        this.isPrivate = isPrivate;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Topic topic = (Topic) o;
        return Objects.equals(this.id, topic.id) &&
            Objects.equals(this.name, topic.name) &&
            Objects.equals(this.description, topic.description) &&
            Objects.equals(this.permission, topic.permission) &&
            Objects.equals(this.isPrivate, topic.isPrivate);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, permission, isPrivate);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Topic {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
        sb.append("    isPrivate: ").append(toIndentedString(isPrivate)).append("\n");
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

