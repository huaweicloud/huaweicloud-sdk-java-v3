package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 实际的数据类型：单个对象，集合 或 NULL
 */
public class ProjectFieldConfigOptionVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uri")

    private String uri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updator")

    private NameAndIdVo updator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flag")

    private Integer flag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_numb")

    private Integer sortNumb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private NameAndIdVo creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time_stamp")

    private Long createTimeStamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time_stamp")

    private Long updateTimeStamp;

    public ProjectFieldConfigOptionVo withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * 字段选项URI标识.新增不传，修改、删除使用必传
     * @return uri
     */
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public ProjectFieldConfigOptionVo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 可选项名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProjectFieldConfigOptionVo withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 可选项code值
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ProjectFieldConfigOptionVo withUpdator(NameAndIdVo updator) {
        this.updator = updator;
        return this;
    }

    public ProjectFieldConfigOptionVo withUpdator(Consumer<NameAndIdVo> updatorSetter) {
        if (this.updator == null) {
            this.updator = new NameAndIdVo();
            updatorSetter.accept(this.updator);
        }

        return this;
    }

    /**
     * Get updator
     * @return updator
     */
    public NameAndIdVo getUpdator() {
        return updator;
    }

    public void setUpdator(NameAndIdVo updator) {
        this.updator = updator;
    }

    public ProjectFieldConfigOptionVo withDescription(String description) {
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

    public ProjectFieldConfigOptionVo withFlag(Integer flag) {
        this.flag = flag;
        return this;
    }

    /**
     * 修改标识，0：不可修改 1：可修改，用于结果和状态的选项值
     * @return flag
     */
    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public ProjectFieldConfigOptionVo withSortNumb(Integer sortNumb) {
        this.sortNumb = sortNumb;
        return this;
    }

    /**
     * 顺序数值
     * @return sortNumb
     */
    public Integer getSortNumb() {
        return sortNumb;
    }

    public void setSortNumb(Integer sortNumb) {
        this.sortNumb = sortNumb;
    }

    public ProjectFieldConfigOptionVo withCreator(NameAndIdVo creator) {
        this.creator = creator;
        return this;
    }

    public ProjectFieldConfigOptionVo withCreator(Consumer<NameAndIdVo> creatorSetter) {
        if (this.creator == null) {
            this.creator = new NameAndIdVo();
            creatorSetter.accept(this.creator);
        }

        return this;
    }

    /**
     * Get creator
     * @return creator
     */
    public NameAndIdVo getCreator() {
        return creator;
    }

    public void setCreator(NameAndIdVo creator) {
        this.creator = creator;
    }

    public ProjectFieldConfigOptionVo withCreateTimeStamp(Long createTimeStamp) {
        this.createTimeStamp = createTimeStamp;
        return this;
    }

    /**
     * 创建时间时间戳
     * @return createTimeStamp
     */
    public Long getCreateTimeStamp() {
        return createTimeStamp;
    }

    public void setCreateTimeStamp(Long createTimeStamp) {
        this.createTimeStamp = createTimeStamp;
    }

    public ProjectFieldConfigOptionVo withUpdateTimeStamp(Long updateTimeStamp) {
        this.updateTimeStamp = updateTimeStamp;
        return this;
    }

    /**
     * 更新时间时间戳
     * @return updateTimeStamp
     */
    public Long getUpdateTimeStamp() {
        return updateTimeStamp;
    }

    public void setUpdateTimeStamp(Long updateTimeStamp) {
        this.updateTimeStamp = updateTimeStamp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProjectFieldConfigOptionVo that = (ProjectFieldConfigOptionVo) obj;
        return Objects.equals(this.uri, that.uri) && Objects.equals(this.name, that.name)
            && Objects.equals(this.code, that.code) && Objects.equals(this.updator, that.updator)
            && Objects.equals(this.description, that.description) && Objects.equals(this.flag, that.flag)
            && Objects.equals(this.sortNumb, that.sortNumb) && Objects.equals(this.creator, that.creator)
            && Objects.equals(this.createTimeStamp, that.createTimeStamp)
            && Objects.equals(this.updateTimeStamp, that.updateTimeStamp);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(uri, name, code, updator, description, flag, sortNumb, creator, createTimeStamp, updateTimeStamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectFieldConfigOptionVo {\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    updator: ").append(toIndentedString(updator)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
        sb.append("    sortNumb: ").append(toIndentedString(sortNumb)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    createTimeStamp: ").append(toIndentedString(createTimeStamp)).append("\n");
        sb.append("    updateTimeStamp: ").append(toIndentedString(updateTimeStamp)).append("\n");
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
