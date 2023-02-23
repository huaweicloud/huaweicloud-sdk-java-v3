package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateLakeFormationInstanceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shared")

    private Boolean shared;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "in_recycle_bin")

    private Boolean inRecycleBin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ResourceTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specs")

    private List<CreateSpec> specs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public CreateLakeFormationInstanceResponse withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * LakeFormation实例Id
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public CreateLakeFormationInstanceResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateLakeFormationInstanceResponse withDescription(String description) {
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

    public CreateLakeFormationInstanceResponse withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目Id
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateLakeFormationInstanceResponse withShared(Boolean shared) {
        this.shared = shared;
        return this;
    }

    /**
     * 逻辑多租和物理多租的判断
     * @return shared
     */
    public Boolean getShared() {
        return shared;
    }

    public void setShared(Boolean shared) {
        this.shared = shared;
    }

    public CreateLakeFormationInstanceResponse withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 实例创建时间戳
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public CreateLakeFormationInstanceResponse withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 实例更新时间戳
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public CreateLakeFormationInstanceResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 实例状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CreateLakeFormationInstanceResponse withInRecycleBin(Boolean inRecycleBin) {
        this.inRecycleBin = inRecycleBin;
        return this;
    }

    /**
     * 是否在回收站
     * @return inRecycleBin
     */
    public Boolean getInRecycleBin() {
        return inRecycleBin;
    }

    public void setInRecycleBin(Boolean inRecycleBin) {
        this.inRecycleBin = inRecycleBin;
    }

    public CreateLakeFormationInstanceResponse withTags(List<ResourceTag> tags) {
        this.tags = tags;
        return this;
    }

    public CreateLakeFormationInstanceResponse addTagsItem(ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateLakeFormationInstanceResponse withTags(Consumer<List<ResourceTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表
     * @return tags
     */
    public List<ResourceTag> getTags() {
        return tags;
    }

    public void setTags(List<ResourceTag> tags) {
        this.tags = tags;
    }

    public CreateLakeFormationInstanceResponse withSpecs(List<CreateSpec> specs) {
        this.specs = specs;
        return this;
    }

    public CreateLakeFormationInstanceResponse addSpecsItem(CreateSpec specsItem) {
        if (this.specs == null) {
            this.specs = new ArrayList<>();
        }
        this.specs.add(specsItem);
        return this;
    }

    public CreateLakeFormationInstanceResponse withSpecs(Consumer<List<CreateSpec>> specsSetter) {
        if (this.specs == null) {
            this.specs = new ArrayList<>();
        }
        specsSetter.accept(this.specs);
        return this;
    }

    /**
     * 规格信息
     * @return specs
     */
    public List<CreateSpec> getSpecs() {
        return specs;
    }

    public void setSpecs(List<CreateSpec> specs) {
        this.specs = specs;
    }

    public CreateLakeFormationInstanceResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateLakeFormationInstanceResponse createLakeFormationInstanceResponse =
            (CreateLakeFormationInstanceResponse) o;
        return Objects.equals(this.instanceId, createLakeFormationInstanceResponse.instanceId)
            && Objects.equals(this.name, createLakeFormationInstanceResponse.name)
            && Objects.equals(this.description, createLakeFormationInstanceResponse.description)
            && Objects.equals(this.enterpriseProjectId, createLakeFormationInstanceResponse.enterpriseProjectId)
            && Objects.equals(this.shared, createLakeFormationInstanceResponse.shared)
            && Objects.equals(this.createTime, createLakeFormationInstanceResponse.createTime)
            && Objects.equals(this.updateTime, createLakeFormationInstanceResponse.updateTime)
            && Objects.equals(this.status, createLakeFormationInstanceResponse.status)
            && Objects.equals(this.inRecycleBin, createLakeFormationInstanceResponse.inRecycleBin)
            && Objects.equals(this.tags, createLakeFormationInstanceResponse.tags)
            && Objects.equals(this.specs, createLakeFormationInstanceResponse.specs)
            && Objects.equals(this.xRequestId, createLakeFormationInstanceResponse.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId,
            name,
            description,
            enterpriseProjectId,
            shared,
            createTime,
            updateTime,
            status,
            inRecycleBin,
            tags,
            specs,
            xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateLakeFormationInstanceResponse {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    inRecycleBin: ").append(toIndentedString(inRecycleBin)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    specs: ").append(toIndentedString(specs)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
