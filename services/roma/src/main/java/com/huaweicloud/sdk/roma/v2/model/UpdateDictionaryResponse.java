package com.huaweicloud.sdk.roma.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.DictionaryType;
import java.math.BigDecimal;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class UpdateDictionaryResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="remark")
    
    private String remark;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="code")
    
    private String code;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="order")
    
    private Integer order;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="extend_one")
    
    private String extendOne;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="extend_two")
    
    private String extendTwo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="parent_code")
    
    private String parentCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private DictionaryType type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    private BigDecimal createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_time")
    
    private BigDecimal updateTime;

    public UpdateDictionaryResponse withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 字典ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public UpdateDictionaryResponse withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 字典名称 - 字符集：中文、英文字母、数字、下划线和空格 - 约束：实例下唯一
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public UpdateDictionaryResponse withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    


    /**
     * 字典描述
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    

    public UpdateDictionaryResponse withCode(String code) {
        this.code = code;
        return this;
    }

    


    /**
     * 字典编码 - 字符集：英文字母、数字、下划线和空格 - 约束：实例下唯一
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    

    public UpdateDictionaryResponse withOrder(Integer order) {
        this.order = order;
        return this;
    }

    


    /**
     * 字典排序，值越小顺序越靠前
     * minimum: 1
     * maximum: 100
     * @return order
     */
    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    

    public UpdateDictionaryResponse withExtendOne(String extendOne) {
        this.extendOne = extendOne;
        return this;
    }

    


    /**
     * 字典扩展字段1 - 字符集：中文、英文字母、数字、下划线和空格
     * @return extendOne
     */
    public String getExtendOne() {
        return extendOne;
    }

    public void setExtendOne(String extendOne) {
        this.extendOne = extendOne;
    }

    

    public UpdateDictionaryResponse withExtendTwo(String extendTwo) {
        this.extendTwo = extendTwo;
        return this;
    }

    


    /**
     * 字典扩展字段2 - 字符集：中文、英文字母、数字、下划线和空格
     * @return extendTwo
     */
    public String getExtendTwo() {
        return extendTwo;
    }

    public void setExtendTwo(String extendTwo) {
        this.extendTwo = extendTwo;
    }

    

    public UpdateDictionaryResponse withParentCode(String parentCode) {
        this.parentCode = parentCode;
        return this;
    }

    


    /**
     * 父字典编码,为空时代表自身就是最顶级字典
     * @return parentCode
     */
    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    

    public UpdateDictionaryResponse withType(DictionaryType type) {
        this.type = type;
        return this;
    }

    


    /**
     * Get type
     * @return type
     */
    public DictionaryType getType() {
        return type;
    }

    public void setType(DictionaryType type) {
        this.type = type;
    }

    

    public UpdateDictionaryResponse withCreateTime(BigDecimal createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 创建时间
     * minimum: 1
     * maximum: 128
     * @return createTime
     */
    public BigDecimal getCreateTime() {
        return createTime;
    }

    public void setCreateTime(BigDecimal createTime) {
        this.createTime = createTime;
    }

    

    public UpdateDictionaryResponse withUpdateTime(BigDecimal updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    


    /**
     * 更新时间
     * minimum: 1
     * maximum: 128
     * @return updateTime
     */
    public BigDecimal getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(BigDecimal updateTime) {
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
        UpdateDictionaryResponse updateDictionaryResponse = (UpdateDictionaryResponse) o;
        return Objects.equals(this.id, updateDictionaryResponse.id) &&
            Objects.equals(this.name, updateDictionaryResponse.name) &&
            Objects.equals(this.remark, updateDictionaryResponse.remark) &&
            Objects.equals(this.code, updateDictionaryResponse.code) &&
            Objects.equals(this.order, updateDictionaryResponse.order) &&
            Objects.equals(this.extendOne, updateDictionaryResponse.extendOne) &&
            Objects.equals(this.extendTwo, updateDictionaryResponse.extendTwo) &&
            Objects.equals(this.parentCode, updateDictionaryResponse.parentCode) &&
            Objects.equals(this.type, updateDictionaryResponse.type) &&
            Objects.equals(this.createTime, updateDictionaryResponse.createTime) &&
            Objects.equals(this.updateTime, updateDictionaryResponse.updateTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, remark, code, order, extendOne, extendTwo, parentCode, type, createTime, updateTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDictionaryResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    extendOne: ").append(toIndentedString(extendOne)).append("\n");
        sb.append("    extendTwo: ").append(toIndentedString(extendTwo)).append("\n");
        sb.append("    parentCode: ").append(toIndentedString(parentCode)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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

