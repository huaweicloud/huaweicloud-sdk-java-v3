package com.huaweicloud.sdk.aidatalake.v2.model;

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
public class UpdateV2WorkspaceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_domain_name")

    private String createDomainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user_name")

    private String createUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metastore_id")

    private String metastoreId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ResourceTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cross_tenant_access")

    private Boolean crossTenantAccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_domain_id")

    private String targetDomainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_project_id")

    private String targetProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public UpdateV2WorkspaceResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：工作空间ID。 **取值范围**：长度为1~36的英文字母、数字和中划线的组合。 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateV2WorkspaceResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：工作空间名称。 **约束限制**：不涉及。 **取值范围**：长度为4~32的英文字母、数字、下划线和中划线的组合。 **默认取值**：不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateV2WorkspaceResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：用户输入的描述。 **约束限制**：不涉及。 **取值范围**：不允许输入感叹号、小于号、大于号、等号、与号、双引号、单引号、艾特符、井号、百分号、分号、左括号、右括号、竖线、星号、反斜杠。长度为0~255个字符。 **默认取值**：不涉及。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateV2WorkspaceResponse withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**：资源创建时间。 **取值范围**：ISO 8601格式，yyyy-MM-dd'T'HH:mm:ss.SSSZ，UTC时间。 
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public UpdateV2WorkspaceResponse withCreateDomainName(String createDomainName) {
        this.createDomainName = createDomainName;
        return this;
    }

    /**
     * **参数解释**：创建账号名称。 **取值范围**：长度为0~64个英文字母、数字、下划线和中划线的组合。
     * @return createDomainName
     */
    public String getCreateDomainName() {
        return createDomainName;
    }

    public void setCreateDomainName(String createDomainName) {
        this.createDomainName = createDomainName;
    }

    public UpdateV2WorkspaceResponse withCreateUserName(String createUserName) {
        this.createUserName = createUserName;
        return this;
    }

    /**
     * **参数解释**：创建用户名称。 **取值范围**：长度为0~64个英文字母、数字、下划线和中划线的组合。
     * @return createUserName
     */
    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public UpdateV2WorkspaceResponse withMetastoreId(String metastoreId) {
        this.metastoreId = metastoreId;
        return this;
    }

    /**
     * **参数解释**：LakeFormation服务的实例ID，可在LakeFormation控制台实例列表中查看，或通过调用LakeFormation服务的查询实例列表接口获取。 **约束限制**：不涉及。 **取值范围**：长度为32~36的英文字母、数字和中划线的组合。 **默认取值**：不涉及。 
     * @return metastoreId
     */
    public String getMetastoreId() {
        return metastoreId;
    }

    public void setMetastoreId(String metastoreId) {
        this.metastoreId = metastoreId;
    }

    public UpdateV2WorkspaceResponse withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释**：企业项目ID，获取方法，请参见[获取企业项目ID](aidatalake_02_0042.xml)。 **约束限制**：不涉及。 **取值范围**：长度为0~128个英文字母、数字、下划线和中划线的组合。 **默认取值**：0。 
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public UpdateV2WorkspaceResponse withTags(List<ResourceTag> tags) {
        this.tags = tags;
        return this;
    }

    public UpdateV2WorkspaceResponse addTagsItem(ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public UpdateV2WorkspaceResponse withTags(Consumer<List<ResourceTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释**：工作空间的资源标签，每个元素为一个ResourceTag对象，包含key（标签键）和value（标签值）字段。 
     * @return tags
     */
    public List<ResourceTag> getTags() {
        return tags;
    }

    public void setTags(List<ResourceTag> tags) {
        this.tags = tags;
    }

    public UpdateV2WorkspaceResponse withCrossTenantAccess(Boolean crossTenantAccess) {
        this.crossTenantAccess = crossTenantAccess;
        return this;
    }

    /**
     * **参数解释**：是否跨租户访问。 **取值范围**：   - true：允许跨租户访问。   - false：不允许跨租户访问。
     * @return crossTenantAccess
     */
    public Boolean getCrossTenantAccess() {
        return crossTenantAccess;
    }

    public void setCrossTenantAccess(Boolean crossTenantAccess) {
        this.crossTenantAccess = crossTenantAccess;
    }

    public UpdateV2WorkspaceResponse withTargetDomainId(String targetDomainId) {
        this.targetDomainId = targetDomainId;
        return this;
    }

    /**
     * **参数解释**：目标租户Domain ID。 **取值范围**：长度为1~64的英文字母、数字和中划线的组合。
     * @return targetDomainId
     */
    public String getTargetDomainId() {
        return targetDomainId;
    }

    public void setTargetDomainId(String targetDomainId) {
        this.targetDomainId = targetDomainId;
    }

    public UpdateV2WorkspaceResponse withTargetProjectId(String targetProjectId) {
        this.targetProjectId = targetProjectId;
        return this;
    }

    /**
     * **参数解释**：目标租户Project ID。 **取值范围**：长度为1~64的英文字母、数字和中划线的组合。
     * @return targetProjectId
     */
    public String getTargetProjectId() {
        return targetProjectId;
    }

    public void setTargetProjectId(String targetProjectId) {
        this.targetProjectId = targetProjectId;
    }

    public UpdateV2WorkspaceResponse withXRequestId(String xRequestId) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateV2WorkspaceResponse that = (UpdateV2WorkspaceResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.createDomainName, that.createDomainName)
            && Objects.equals(this.createUserName, that.createUserName)
            && Objects.equals(this.metastoreId, that.metastoreId)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.crossTenantAccess, that.crossTenantAccess)
            && Objects.equals(this.targetDomainId, that.targetDomainId)
            && Objects.equals(this.targetProjectId, that.targetProjectId)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            createTime,
            createDomainName,
            createUserName,
            metastoreId,
            enterpriseProjectId,
            tags,
            crossTenantAccess,
            targetDomainId,
            targetProjectId,
            xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateV2WorkspaceResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    createDomainName: ").append(toIndentedString(createDomainName)).append("\n");
        sb.append("    createUserName: ").append(toIndentedString(createUserName)).append("\n");
        sb.append("    metastoreId: ").append(toIndentedString(metastoreId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    crossTenantAccess: ").append(toIndentedString(crossTenantAccess)).append("\n");
        sb.append("    targetDomainId: ").append(toIndentedString(targetDomainId)).append("\n");
        sb.append("    targetProjectId: ").append(toIndentedString(targetProjectId)).append("\n");
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
