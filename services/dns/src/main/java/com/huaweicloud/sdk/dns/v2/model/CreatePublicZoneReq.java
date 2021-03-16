package com.huaweicloud.sdk.dns.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dns.v2.model.Tag;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 创建公网zone请求
 */
public class CreatePublicZoneReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="zone_type")
    
    private String zoneType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="email")
    
    private String email;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ttl")
    
    private Integer ttl;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<Tag> tags = null;
    
    public CreatePublicZoneReq withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * Zone名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public CreatePublicZoneReq withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public CreatePublicZoneReq withZoneType(String zoneType) {
        this.zoneType = zoneType;
        return this;
    }

    


    /**
     * Zone类型,取值public。
     * @return zoneType
     */
    public String getZoneType() {
        return zoneType;
    }

    public void setZoneType(String zoneType) {
        this.zoneType = zoneType;
    }

    

    public CreatePublicZoneReq withEmail(String email) {
        this.email = email;
        return this;
    }

    


    /**
     * 管理该zone的管理员邮箱
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    

    public CreatePublicZoneReq withTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }

    


    /**
     * 用于填写默认生成的SOA记录中有效缓存时间，以秒为单位.
     * @return ttl
     */
    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    

    public CreatePublicZoneReq withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 域名关联的企业项目ID，长度不超过36个字符.
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    

    public CreatePublicZoneReq withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    
    public CreatePublicZoneReq addTagsItem(Tag tagsItem) {
        this.tags.add(tagsItem);
        return this;
    }

    public CreatePublicZoneReq withTags(Consumer<List<Tag>> tagsSetter) {
        if(this.tags == null ){
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 资源标签。
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreatePublicZoneReq createPublicZoneReq = (CreatePublicZoneReq) o;
        return Objects.equals(this.name, createPublicZoneReq.name) &&
            Objects.equals(this.description, createPublicZoneReq.description) &&
            Objects.equals(this.zoneType, createPublicZoneReq.zoneType) &&
            Objects.equals(this.email, createPublicZoneReq.email) &&
            Objects.equals(this.ttl, createPublicZoneReq.ttl) &&
            Objects.equals(this.enterpriseProjectId, createPublicZoneReq.enterpriseProjectId) &&
            Objects.equals(this.tags, createPublicZoneReq.tags);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, description, zoneType, email, ttl, enterpriseProjectId, tags);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePublicZoneReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    zoneType: ").append(toIndentedString(zoneType)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

