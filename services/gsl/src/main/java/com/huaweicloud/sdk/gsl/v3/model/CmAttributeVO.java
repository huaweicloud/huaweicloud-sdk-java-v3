package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * CmAttributeVO
 */
public class CmAttributeVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_attr_name_cn")

    private String defaultAttrNameCn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_attr_name_en")

    private String defaultAttrNameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cust_attr_name")

    private String custAttrName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modify_time")

    private OffsetDateTime modifyTime;

    public CmAttributeVO withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 自定义属性标识
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CmAttributeVO withDefaultAttrNameCn(String defaultAttrNameCn) {
        this.defaultAttrNameCn = defaultAttrNameCn;
        return this;
    }

    /**
     * 默认属性名称中文
     * @return defaultAttrNameCn
     */
    public String getDefaultAttrNameCn() {
        return defaultAttrNameCn;
    }

    public void setDefaultAttrNameCn(String defaultAttrNameCn) {
        this.defaultAttrNameCn = defaultAttrNameCn;
    }

    public CmAttributeVO withDefaultAttrNameEn(String defaultAttrNameEn) {
        this.defaultAttrNameEn = defaultAttrNameEn;
        return this;
    }

    /**
     * 默认属性名称英文
     * @return defaultAttrNameEn
     */
    public String getDefaultAttrNameEn() {
        return defaultAttrNameEn;
    }

    public void setDefaultAttrNameEn(String defaultAttrNameEn) {
        this.defaultAttrNameEn = defaultAttrNameEn;
    }

    public CmAttributeVO withCustAttrName(String custAttrName) {
        this.custAttrName = custAttrName;
        return this;
    }

    /**
     * 自定义属性名称
     * @return custAttrName
     */
    public String getCustAttrName() {
        return custAttrName;
    }

    public void setCustAttrName(String custAttrName) {
        this.custAttrName = custAttrName;
    }

    public CmAttributeVO withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 自定义属性状态：0 未启用，1 已启用。
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public CmAttributeVO withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public CmAttributeVO withModifyTime(OffsetDateTime modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    /**
     * 更新时间
     * @return modifyTime
     */
    public OffsetDateTime getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(OffsetDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CmAttributeVO cmAttributeVO = (CmAttributeVO) o;
        return Objects.equals(this.id, cmAttributeVO.id)
            && Objects.equals(this.defaultAttrNameCn, cmAttributeVO.defaultAttrNameCn)
            && Objects.equals(this.defaultAttrNameEn, cmAttributeVO.defaultAttrNameEn)
            && Objects.equals(this.custAttrName, cmAttributeVO.custAttrName)
            && Objects.equals(this.status, cmAttributeVO.status)
            && Objects.equals(this.createTime, cmAttributeVO.createTime)
            && Objects.equals(this.modifyTime, cmAttributeVO.modifyTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, defaultAttrNameCn, defaultAttrNameEn, custAttrName, status, createTime, modifyTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CmAttributeVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    defaultAttrNameCn: ").append(toIndentedString(defaultAttrNameCn)).append("\n");
        sb.append("    defaultAttrNameEn: ").append(toIndentedString(defaultAttrNameEn)).append("\n");
        sb.append("    custAttrName: ").append(toIndentedString(custAttrName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    modifyTime: ").append(toIndentedString(modifyTime)).append("\n");
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
