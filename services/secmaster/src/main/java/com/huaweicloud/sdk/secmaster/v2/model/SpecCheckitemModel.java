package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SpecCheckitemModel
 */
public class SpecCheckitemModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checkitem_uuid")

    private String checkitemUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remove_time")

    private String removeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specification_uuid")

    private String specificationUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uuid")

    private String uuid;

    public SpecCheckitemModel withCheckitemUuid(String checkitemUuid) {
        this.checkitemUuid = checkitemUuid;
        return this;
    }

    /**
     * 检查项的uuid
     * @return checkitemUuid
     */
    public String getCheckitemUuid() {
        return checkitemUuid;
    }

    public void setCheckitemUuid(String checkitemUuid) {
        this.checkitemUuid = checkitemUuid;
    }

    public SpecCheckitemModel withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 遵从包创建时间戳
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public SpecCheckitemModel withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * 遵从包创建的语言环境
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public SpecCheckitemModel withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 遵从包名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SpecCheckitemModel withRemoveTime(String removeTime) {
        this.removeTime = removeTime;
        return this;
    }

    /**
     * 遵从包删除时间戳
     * @return removeTime
     */
    public String getRemoveTime() {
        return removeTime;
    }

    public void setRemoveTime(String removeTime) {
        this.removeTime = removeTime;
    }

    public SpecCheckitemModel withSpecificationUuid(String specificationUuid) {
        this.specificationUuid = specificationUuid;
        return this;
    }

    /**
     * 遵从包的uuid
     * @return specificationUuid
     */
    public String getSpecificationUuid() {
        return specificationUuid;
    }

    public void setSpecificationUuid(String specificationUuid) {
        this.specificationUuid = specificationUuid;
    }

    public SpecCheckitemModel withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * uuid
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SpecCheckitemModel that = (SpecCheckitemModel) obj;
        return Objects.equals(this.checkitemUuid, that.checkitemUuid)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.language, that.language)
            && Objects.equals(this.name, that.name) && Objects.equals(this.removeTime, that.removeTime)
            && Objects.equals(this.specificationUuid, that.specificationUuid) && Objects.equals(this.uuid, that.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkitemUuid, createTime, language, name, removeTime, specificationUuid, uuid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SpecCheckitemModel {\n");
        sb.append("    checkitemUuid: ").append(toIndentedString(checkitemUuid)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    removeTime: ").append(toIndentedString(removeTime)).append("\n");
        sb.append("    specificationUuid: ").append(toIndentedString(specificationUuid)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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
