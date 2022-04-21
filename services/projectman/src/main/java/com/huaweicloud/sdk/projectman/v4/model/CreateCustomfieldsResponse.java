package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateCustomfieldsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "options")

    private String options;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identifier")

    private String identifier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private Integer projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tracker_id")

    private Integer trackerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field")

    private String customField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort")

    private Integer sort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memo")

    private String memo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified")

    private String modified;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_delete")

    private Boolean isDelete;

    public CreateCustomfieldsResponse withOptions(String options) {
        this.options = options;
        return this;
    }

    /**
     * 字段选项
     * @return options
     */
    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public CreateCustomfieldsResponse withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 系统字段
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public CreateCustomfieldsResponse withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 字段ID
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CreateCustomfieldsResponse withIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * 字段ID
     * @return identifier
     */
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public CreateCustomfieldsResponse withProjectId(Integer projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public CreateCustomfieldsResponse withTrackerId(Integer trackerId) {
        this.trackerId = trackerId;
        return this;
    }

    /**
     * 工作项类型id
     * @return trackerId
     */
    public Integer getTrackerId() {
        return trackerId;
    }

    public void setTrackerId(Integer trackerId) {
        this.trackerId = trackerId;
    }

    public CreateCustomfieldsResponse withCustomField(String customField) {
        this.customField = customField;
        return this;
    }

    /**
     * 系统字段名
     * @return customField
     */
    public String getCustomField() {
        return customField;
    }

    public void setCustomField(String customField) {
        this.customField = customField;
    }

    public CreateCustomfieldsResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 字段类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CreateCustomfieldsResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 字段名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateCustomfieldsResponse withSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    /**
     * 系统字段
     * @return sort
     */
    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public CreateCustomfieldsResponse withMemo(String memo) {
        this.memo = memo;
        return this;
    }

    /**
     * 字段描述
     * @return memo
     */
    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public CreateCustomfieldsResponse withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * 创建时间
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public CreateCustomfieldsResponse withModified(String modified) {
        this.modified = modified;
        return this;
    }

    /**
     * 修改时间
     * @return modified
     */
    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public CreateCustomfieldsResponse withIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
        return this;
    }

    /**
     * 是否被删除
     * @return isDelete
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateCustomfieldsResponse createCustomfieldsResponse = (CreateCustomfieldsResponse) o;
        return Objects.equals(this.options, createCustomfieldsResponse.options)
            && Objects.equals(this.region, createCustomfieldsResponse.region)
            && Objects.equals(this.id, createCustomfieldsResponse.id)
            && Objects.equals(this.identifier, createCustomfieldsResponse.identifier)
            && Objects.equals(this.projectId, createCustomfieldsResponse.projectId)
            && Objects.equals(this.trackerId, createCustomfieldsResponse.trackerId)
            && Objects.equals(this.customField, createCustomfieldsResponse.customField)
            && Objects.equals(this.type, createCustomfieldsResponse.type)
            && Objects.equals(this.name, createCustomfieldsResponse.name)
            && Objects.equals(this.sort, createCustomfieldsResponse.sort)
            && Objects.equals(this.memo, createCustomfieldsResponse.memo)
            && Objects.equals(this.created, createCustomfieldsResponse.created)
            && Objects.equals(this.modified, createCustomfieldsResponse.modified)
            && Objects.equals(this.isDelete, createCustomfieldsResponse.isDelete);
    }

    @Override
    public int hashCode() {
        return Objects.hash(options,
            region,
            id,
            identifier,
            projectId,
            trackerId,
            customField,
            type,
            name,
            sort,
            memo,
            created,
            modified,
            isDelete);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCustomfieldsResponse {\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    trackerId: ").append(toIndentedString(trackerId)).append("\n");
        sb.append("    customField: ").append(toIndentedString(customField)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
        sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
        sb.append("    isDelete: ").append(toIndentedString(isDelete)).append("\n");
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
