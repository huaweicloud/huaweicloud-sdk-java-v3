package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ApiAclInfoWithBindNum
 */
public class ApiAclInfoWithBindNum  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="acl_name")
    
    private String aclName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="acl_type")
    
    private String aclType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="acl_value")
    
    private String aclValue;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bind_num")
    
    private Integer bindNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="entity_type")
    
    private String entityType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_time")
    
    private OffsetDateTime updateTime;

    public ApiAclInfoWithBindNum withAclName(String aclName) {
        this.aclName = aclName;
        return this;
    }

    


    /**
     * ACL策略名称
     * @return aclName
     */
    public String getAclName() {
        return aclName;
    }

    public void setAclName(String aclName) {
        this.aclName = aclName;
    }

    

    public ApiAclInfoWithBindNum withAclType(String aclType) {
        this.aclType = aclType;
        return this;
    }

    


    /**
     * 类型 - PERMIT（白名单类型） - DENY（黑名单类型）
     * @return aclType
     */
    public String getAclType() {
        return aclType;
    }

    public void setAclType(String aclType) {
        this.aclType = aclType;
    }

    

    public ApiAclInfoWithBindNum withAclValue(String aclValue) {
        this.aclValue = aclValue;
        return this;
    }

    


    /**
     * ACL策略的值
     * @return aclValue
     */
    public String getAclValue() {
        return aclValue;
    }

    public void setAclValue(String aclValue) {
        this.aclValue = aclValue;
    }

    

    public ApiAclInfoWithBindNum withBindNum(Integer bindNum) {
        this.bindNum = bindNum;
        return this;
    }

    


    /**
     * 绑定的API数量
     * @return bindNum
     */
    public Integer getBindNum() {
        return bindNum;
    }

    public void setBindNum(Integer bindNum) {
        this.bindNum = bindNum;
    }

    

    public ApiAclInfoWithBindNum withEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }

    


    /**
     * 对象类型 - IP - DOMAIN
     * @return entityType
     */
    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    

    public ApiAclInfoWithBindNum withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * ACL策略编号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public ApiAclInfoWithBindNum withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    


    /**
     * 更新时间
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiAclInfoWithBindNum apiAclInfoWithBindNum = (ApiAclInfoWithBindNum) o;
        return Objects.equals(this.aclName, apiAclInfoWithBindNum.aclName) &&
            Objects.equals(this.aclType, apiAclInfoWithBindNum.aclType) &&
            Objects.equals(this.aclValue, apiAclInfoWithBindNum.aclValue) &&
            Objects.equals(this.bindNum, apiAclInfoWithBindNum.bindNum) &&
            Objects.equals(this.entityType, apiAclInfoWithBindNum.entityType) &&
            Objects.equals(this.id, apiAclInfoWithBindNum.id) &&
            Objects.equals(this.updateTime, apiAclInfoWithBindNum.updateTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(aclName, aclType, aclValue, bindNum, entityType, id, updateTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiAclInfoWithBindNum {\n");
        sb.append("    aclName: ").append(toIndentedString(aclName)).append("\n");
        sb.append("    aclType: ").append(toIndentedString(aclType)).append("\n");
        sb.append("    aclValue: ").append(toIndentedString(aclValue)).append("\n");
        sb.append("    bindNum: ").append(toIndentedString(bindNum)).append("\n");
        sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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

