package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * StructuredDocShareViewDTO
 */
public class StructuredDocShareViewDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modifier")

    private String modifier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createTime")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastUpdateTime")

    private String lastUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rdmVersion")

    private Integer rdmVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rdmDeleteFlag")

    private Integer rdmDeleteFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rdmExtensionType")

    private String rdmExtensionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant")

    private TenantViewDTO tenant;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "className")

    private String className;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "structuredDoc")

    private StructuredDocViewDTO structuredDoc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shareUserName")

    private String shareUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sharedUserName")

    private String sharedUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sharedUserId")

    private String sharedUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authType")

    private String authType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shareUserId")

    private String shareUserId;

    public StructuredDocShareViewDTO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：**  分享权限记录的唯一标识，可用于批量删除分享权限接口定位目标记录。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public StructuredDocShareViewDTO withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * **参数解释：**  创建者账号，标识创建该分享记录的用户。  **取值范围：**  不涉及。
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public StructuredDocShareViewDTO withModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }

    /**
     * **参数解释：**  更新者账号，标识最后更新该分享记录的用户。  **取值范围：**  不涉及。
     * @return modifier
     */
    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public StructuredDocShareViewDTO withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释：**  创建时间。使用UTC+0时间格式，格式为yyyy-MM-ddTHH:mm:ss.SSSZ。  **取值范围：**  不涉及。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public StructuredDocShareViewDTO withLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    /**
     * **参数解释：**  最后更新时间。使用UTC+0时间格式，格式为yyyy-MM-ddTHH:mm:ss.SSSZ。  **取值范围：**  不涉及。
     * @return lastUpdateTime
     */
    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public StructuredDocShareViewDTO withRdmVersion(Integer rdmVersion) {
        this.rdmVersion = rdmVersion;
        return this;
    }

    /**
     * **参数解释：**  系统版本号，用于数据版本控制。  **取值范围：**  不涉及。
     * @return rdmVersion
     */
    public Integer getRdmVersion() {
        return rdmVersion;
    }

    public void setRdmVersion(Integer rdmVersion) {
        this.rdmVersion = rdmVersion;
    }

    public StructuredDocShareViewDTO withRdmDeleteFlag(Integer rdmDeleteFlag) {
        this.rdmDeleteFlag = rdmDeleteFlag;
        return this;
    }

    /**
     * **参数解释：**  软删除标识。  **取值范围：**  - 0：表示未删除。 - 1：表示已删除。
     * @return rdmDeleteFlag
     */
    public Integer getRdmDeleteFlag() {
        return rdmDeleteFlag;
    }

    public void setRdmDeleteFlag(Integer rdmDeleteFlag) {
        this.rdmDeleteFlag = rdmDeleteFlag;
    }

    public StructuredDocShareViewDTO withRdmExtensionType(String rdmExtensionType) {
        this.rdmExtensionType = rdmExtensionType;
        return this;
    }

    /**
     * **参数解释：**  扩展类型，标识对象的扩展类别。  **取值范围：**  不涉及。
     * @return rdmExtensionType
     */
    public String getRdmExtensionType() {
        return rdmExtensionType;
    }

    public void setRdmExtensionType(String rdmExtensionType) {
        this.rdmExtensionType = rdmExtensionType;
    }

    public StructuredDocShareViewDTO withTenant(TenantViewDTO tenant) {
        this.tenant = tenant;
        return this;
    }

    public StructuredDocShareViewDTO withTenant(Consumer<TenantViewDTO> tenantSetter) {
        if (this.tenant == null) {
            this.tenant = new TenantViewDTO();
            tenantSetter.accept(this.tenant);
        }

        return this;
    }

    /**
     * Get tenant
     * @return tenant
     */
    public TenantViewDTO getTenant() {
        return tenant;
    }

    public void setTenant(TenantViewDTO tenant) {
        this.tenant = tenant;
    }

    public StructuredDocShareViewDTO withClassName(String className) {
        this.className = className;
        return this;
    }

    /**
     * **参数解释：**  类名，标识对象的Java类名称。  **取值范围：**  不涉及。
     * @return className
     */
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public StructuredDocShareViewDTO withStructuredDoc(StructuredDocViewDTO structuredDoc) {
        this.structuredDoc = structuredDoc;
        return this;
    }

    public StructuredDocShareViewDTO withStructuredDoc(Consumer<StructuredDocViewDTO> structuredDocSetter) {
        if (this.structuredDoc == null) {
            this.structuredDoc = new StructuredDocViewDTO();
            structuredDocSetter.accept(this.structuredDoc);
        }

        return this;
    }

    /**
     * Get structuredDoc
     * @return structuredDoc
     */
    public StructuredDocViewDTO getStructuredDoc() {
        return structuredDoc;
    }

    public void setStructuredDoc(StructuredDocViewDTO structuredDoc) {
        this.structuredDoc = structuredDoc;
    }

    public StructuredDocShareViewDTO withShareUserName(String shareUserName) {
        this.shareUserName = shareUserName;
        return this;
    }

    /**
     * **参数解释：**  分享用户名，标识执行分享操作的用户名称。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  不涉及。
     * @return shareUserName
     */
    public String getShareUserName() {
        return shareUserName;
    }

    public void setShareUserName(String shareUserName) {
        this.shareUserName = shareUserName;
    }

    public StructuredDocShareViewDTO withSharedUserName(String sharedUserName) {
        this.sharedUserName = sharedUserName;
        return this;
    }

    /**
     * **参数解释：**  被分享用户名，标识接收文档分享的用户名称。  **约束限制：**  不涉及。  **取值范围：**  - all：表示分享给所有人。 - 其他值：指定具体用户的名称。  **默认取值：**  不涉及。
     * @return sharedUserName
     */
    public String getSharedUserName() {
        return sharedUserName;
    }

    public void setSharedUserName(String sharedUserName) {
        this.sharedUserName = sharedUserName;
    }

    public StructuredDocShareViewDTO withSharedUserId(String sharedUserId) {
        this.sharedUserId = sharedUserId;
        return this;
    }

    /**
     * **参数解释：**  被分享用户ID，标识接收文档分享的用户ID。  **约束限制：**  不涉及。  **取值范围：**  - all：表示分享给所有人。 - 其他值：指定具体用户的ID。  **默认取值：**  不涉及。
     * @return sharedUserId
     */
    public String getSharedUserId() {
        return sharedUserId;
    }

    public void setSharedUserId(String sharedUserId) {
        this.sharedUserId = sharedUserId;
    }

    public StructuredDocShareViewDTO withAuthType(String authType) {
        this.authType = authType;
        return this;
    }

    /**
     * **参数解释：**  认证类型，标识被分享用户对文档的访问权限级别。  **约束限制：**  不涉及。  **取值范围：**  - read：只读权限，被分享用户仅可查看文档内容。 - write：读写权限，被分享用户可查看和编辑文档内容。  **默认取值：**  不涉及。
     * @return authType
     */
    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public StructuredDocShareViewDTO withShareUserId(String shareUserId) {
        this.shareUserId = shareUserId;
        return this;
    }

    /**
     * **参数解释：**  分享用户ID，标识执行分享操作的用户ID。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  不涉及。
     * @return shareUserId
     */
    public String getShareUserId() {
        return shareUserId;
    }

    public void setShareUserId(String shareUserId) {
        this.shareUserId = shareUserId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StructuredDocShareViewDTO that = (StructuredDocShareViewDTO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.creator, that.creator)
            && Objects.equals(this.modifier, that.modifier) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.lastUpdateTime, that.lastUpdateTime)
            && Objects.equals(this.rdmVersion, that.rdmVersion)
            && Objects.equals(this.rdmDeleteFlag, that.rdmDeleteFlag)
            && Objects.equals(this.rdmExtensionType, that.rdmExtensionType) && Objects.equals(this.tenant, that.tenant)
            && Objects.equals(this.className, that.className) && Objects.equals(this.structuredDoc, that.structuredDoc)
            && Objects.equals(this.shareUserName, that.shareUserName)
            && Objects.equals(this.sharedUserName, that.sharedUserName)
            && Objects.equals(this.sharedUserId, that.sharedUserId) && Objects.equals(this.authType, that.authType)
            && Objects.equals(this.shareUserId, that.shareUserId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            creator,
            modifier,
            createTime,
            lastUpdateTime,
            rdmVersion,
            rdmDeleteFlag,
            rdmExtensionType,
            tenant,
            className,
            structuredDoc,
            shareUserName,
            sharedUserName,
            sharedUserId,
            authType,
            shareUserId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StructuredDocShareViewDTO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    modifier: ").append(toIndentedString(modifier)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
        sb.append("    rdmVersion: ").append(toIndentedString(rdmVersion)).append("\n");
        sb.append("    rdmDeleteFlag: ").append(toIndentedString(rdmDeleteFlag)).append("\n");
        sb.append("    rdmExtensionType: ").append(toIndentedString(rdmExtensionType)).append("\n");
        sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
        sb.append("    className: ").append(toIndentedString(className)).append("\n");
        sb.append("    structuredDoc: ").append(toIndentedString(structuredDoc)).append("\n");
        sb.append("    shareUserName: ").append(toIndentedString(shareUserName)).append("\n");
        sb.append("    sharedUserName: ").append(toIndentedString(sharedUserName)).append("\n");
        sb.append("    sharedUserId: ").append(toIndentedString(sharedUserId)).append("\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    shareUserId: ").append(toIndentedString(shareUserId)).append("\n");
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
