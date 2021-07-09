package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.CreatedUser;
import com.huaweicloud.sdk.roma.v2.model.LastUpdatedUser;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ProductTemplate
 */
public class ProductTemplate  {



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
    @JsonProperty(value="status")
    
    private Integer status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_user")
    
    private CreatedUser createdUser;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="last_updated_user")
    
    private LastUpdatedUser lastUpdatedUser;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_datetime")
    
    private Long createdDatetime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="last_updated_datetime")
    
    private Long lastUpdatedDatetime;

    public ProductTemplate withId(Integer id) {
        this.id = id;
        return this;
    }

    


    /**
     * 产品模板ID
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

    

    public ProductTemplate withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 产品模板名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ProductTemplate withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 产品模板描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public ProductTemplate withStatus(Integer status) {
        this.status = status;
        return this;
    }

    


    /**
     * 产品模板状态 0-启用 1-停用
     * minimum: 0
     * maximum: 10
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    

    public ProductTemplate withCreatedUser(CreatedUser createdUser) {
        this.createdUser = createdUser;
        return this;
    }

    public ProductTemplate withCreatedUser(Consumer<CreatedUser> createdUserSetter) {
        if(this.createdUser == null ){
            this.createdUser = new CreatedUser();
            createdUserSetter.accept(this.createdUser);
        }
        
        return this;
    }


    /**
     * Get createdUser
     * @return createdUser
     */
    public CreatedUser getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(CreatedUser createdUser) {
        this.createdUser = createdUser;
    }

    

    public ProductTemplate withLastUpdatedUser(LastUpdatedUser lastUpdatedUser) {
        this.lastUpdatedUser = lastUpdatedUser;
        return this;
    }

    public ProductTemplate withLastUpdatedUser(Consumer<LastUpdatedUser> lastUpdatedUserSetter) {
        if(this.lastUpdatedUser == null ){
            this.lastUpdatedUser = new LastUpdatedUser();
            lastUpdatedUserSetter.accept(this.lastUpdatedUser);
        }
        
        return this;
    }


    /**
     * Get lastUpdatedUser
     * @return lastUpdatedUser
     */
    public LastUpdatedUser getLastUpdatedUser() {
        return lastUpdatedUser;
    }

    public void setLastUpdatedUser(LastUpdatedUser lastUpdatedUser) {
        this.lastUpdatedUser = lastUpdatedUser;
    }

    

    public ProductTemplate withCreatedDatetime(Long createdDatetime) {
        this.createdDatetime = createdDatetime;
        return this;
    }

    


    /**
     * 创建时间，timestamp(ms)，使用UTC时区
     * minimum: 1
     * maximum: 999999999999999999
     * @return createdDatetime
     */
    public Long getCreatedDatetime() {
        return createdDatetime;
    }

    public void setCreatedDatetime(Long createdDatetime) {
        this.createdDatetime = createdDatetime;
    }

    

    public ProductTemplate withLastUpdatedDatetime(Long lastUpdatedDatetime) {
        this.lastUpdatedDatetime = lastUpdatedDatetime;
        return this;
    }

    


    /**
     * 最后修改时间，timestamp(ms)，使用UTC时区
     * minimum: 1
     * maximum: 999999999999999999
     * @return lastUpdatedDatetime
     */
    public Long getLastUpdatedDatetime() {
        return lastUpdatedDatetime;
    }

    public void setLastUpdatedDatetime(Long lastUpdatedDatetime) {
        this.lastUpdatedDatetime = lastUpdatedDatetime;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductTemplate productTemplate = (ProductTemplate) o;
        return Objects.equals(this.id, productTemplate.id) &&
            Objects.equals(this.name, productTemplate.name) &&
            Objects.equals(this.description, productTemplate.description) &&
            Objects.equals(this.status, productTemplate.status) &&
            Objects.equals(this.createdUser, productTemplate.createdUser) &&
            Objects.equals(this.lastUpdatedUser, productTemplate.lastUpdatedUser) &&
            Objects.equals(this.createdDatetime, productTemplate.createdDatetime) &&
            Objects.equals(this.lastUpdatedDatetime, productTemplate.lastUpdatedDatetime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, status, createdUser, lastUpdatedUser, createdDatetime, lastUpdatedDatetime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductTemplate {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createdUser: ").append(toIndentedString(createdUser)).append("\n");
        sb.append("    lastUpdatedUser: ").append(toIndentedString(lastUpdatedUser)).append("\n");
        sb.append("    createdDatetime: ").append(toIndentedString(createdDatetime)).append("\n");
        sb.append("    lastUpdatedDatetime: ").append(toIndentedString(lastUpdatedDatetime)).append("\n");
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

