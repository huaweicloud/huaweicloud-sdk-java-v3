package com.huaweicloud.sdk.cloudide.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PublisherVO
 */
public class PublisherVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code_repo")

    private String codeRepo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private OffsetDateTime createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eamap_info")

    private String eamapInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "espase_group")

    private String espaseGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extension_count")

    private Long extensionCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identifier")

    private String identifier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_open")

    private Boolean isOpen;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_org")

    private Boolean isOrg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logo_url")

    private String logoUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_count")

    private Long memberCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "official")

    private Boolean official;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owners")

    private List<MemberRoleVo> owners = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publisher_review")

    private Boolean publisherReview;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    private String role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Boolean status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suite_count")

    private Long suiteCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_url")

    private String supportUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_review")

    private Boolean systemReview;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_time")

    private OffsetDateTime updatedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "web_url")

    private String webUrl;

    public PublisherVO withCodeRepo(String codeRepo) {
        this.codeRepo = codeRepo;
        return this;
    }

    /**
     * 代码地址
     * @return codeRepo
     */
    public String getCodeRepo() {
        return codeRepo;
    }

    public void setCodeRepo(String codeRepo) {
        this.codeRepo = codeRepo;
    }

    public PublisherVO withCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 创建时间
     * @return createdTime
     */
    public OffsetDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public PublisherVO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 发布商描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PublisherVO withEamapInfo(String eamapInfo) {
        this.eamapInfo = eamapInfo;
        return this;
    }

    /**
     * EAMAP注册信息
     * @return eamapInfo
     */
    public String getEamapInfo() {
        return eamapInfo;
    }

    public void setEamapInfo(String eamapInfo) {
        this.eamapInfo = eamapInfo;
    }

    public PublisherVO withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * 邮箱
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public PublisherVO withEspaseGroup(String espaseGroup) {
        this.espaseGroup = espaseGroup;
        return this;
    }

    /**
     * espase交流群号
     * @return espaseGroup
     */
    public String getEspaseGroup() {
        return espaseGroup;
    }

    public void setEspaseGroup(String espaseGroup) {
        this.espaseGroup = espaseGroup;
    }

    public PublisherVO withExtensionCount(Long extensionCount) {
        this.extensionCount = extensionCount;
        return this;
    }

    /**
     * 插件数量
     * minimum: 0
     * maximum: 2147483647
     * @return extensionCount
     */
    public Long getExtensionCount() {
        return extensionCount;
    }

    public void setExtensionCount(Long extensionCount) {
        this.extensionCount = extensionCount;
    }

    public PublisherVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 发布商ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PublisherVO withIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * 唯一标志
     * @return identifier
     */
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public PublisherVO withIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
        return this;
    }

    /**
     * 开源发布商,0:非开源; 1:开源;
     * @return isOpen
     */
    public Boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
    }

    public PublisherVO withIsOrg(Boolean isOrg) {
        this.isOrg = isOrg;
        return this;
    }

    /**
     * 发布商或组织,0:发布商; 1:组织;
     * @return isOrg
     */
    public Boolean getIsOrg() {
        return isOrg;
    }

    public void setIsOrg(Boolean isOrg) {
        this.isOrg = isOrg;
    }

    public PublisherVO withLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
        return this;
    }

    /**
     * 发布商logo
     * @return logoUrl
     */
    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public PublisherVO withMemberCount(Long memberCount) {
        this.memberCount = memberCount;
        return this;
    }

    /**
     * 成员数量
     * minimum: 0
     * maximum: 2147483647
     * @return memberCount
     */
    public Long getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(Long memberCount) {
        this.memberCount = memberCount;
    }

    public PublisherVO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 发布商名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PublisherVO withOfficial(Boolean official) {
        this.official = official;
        return this;
    }

    /**
     * 是否是官方发布商
     * @return official
     */
    public Boolean getOfficial() {
        return official;
    }

    public void setOfficial(Boolean official) {
        this.official = official;
    }

    public PublisherVO withOwners(List<MemberRoleVo> owners) {
        this.owners = owners;
        return this;
    }

    public PublisherVO addOwnersItem(MemberRoleVo ownersItem) {
        if (this.owners == null) {
            this.owners = new ArrayList<>();
        }
        this.owners.add(ownersItem);
        return this;
    }

    public PublisherVO withOwners(Consumer<List<MemberRoleVo>> ownersSetter) {
        if (this.owners == null) {
            this.owners = new ArrayList<>();
        }
        ownersSetter.accept(this.owners);
        return this;
    }

    /**
     * 成员角色
     * @return owners
     */
    public List<MemberRoleVo> getOwners() {
        return owners;
    }

    public void setOwners(List<MemberRoleVo> owners) {
        this.owners = owners;
    }

    public PublisherVO withPublisherReview(Boolean publisherReview) {
        this.publisherReview = publisherReview;
        return this;
    }

    /**
     * 是否开启发布商审核,1:开启；0:关闭
     * @return publisherReview
     */
    public Boolean getPublisherReview() {
        return publisherReview;
    }

    public void setPublisherReview(Boolean publisherReview) {
        this.publisherReview = publisherReview;
    }

    public PublisherVO withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * 角色
     * @return role
     */
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public PublisherVO withStatus(Boolean status) {
        this.status = status;
        return this;
    }

    /**
     * 状态,0:禁用; 1:正常;
     * @return status
     */
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public PublisherVO withSuiteCount(Long suiteCount) {
        this.suiteCount = suiteCount;
        return this;
    }

    /**
     * 匹配数量
     * minimum: 0
     * maximum: 2147483647
     * @return suiteCount
     */
    public Long getSuiteCount() {
        return suiteCount;
    }

    public void setSuiteCount(Long suiteCount) {
        this.suiteCount = suiteCount;
    }

    public PublisherVO withSupportUrl(String supportUrl) {
        this.supportUrl = supportUrl;
        return this;
    }

    /**
     * 支持地址
     * @return supportUrl
     */
    public String getSupportUrl() {
        return supportUrl;
    }

    public void setSupportUrl(String supportUrl) {
        this.supportUrl = supportUrl;
    }

    public PublisherVO withSystemReview(Boolean systemReview) {
        this.systemReview = systemReview;
        return this;
    }

    /**
     * 是否忽略系统审核,1:忽略；0:不忽略
     * @return systemReview
     */
    public Boolean getSystemReview() {
        return systemReview;
    }

    public void setSystemReview(Boolean systemReview) {
        this.systemReview = systemReview;
    }

    public PublisherVO withUpdatedTime(OffsetDateTime updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /**
     * 更新时间
     * @return updatedTime
     */
    public OffsetDateTime getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(OffsetDateTime updatedTime) {
        this.updatedTime = updatedTime;
    }

    public PublisherVO withWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    /**
     * 官网地址
     * @return webUrl
     */
    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PublisherVO publisherVO = (PublisherVO) o;
        return Objects.equals(this.codeRepo, publisherVO.codeRepo)
            && Objects.equals(this.createdTime, publisherVO.createdTime)
            && Objects.equals(this.description, publisherVO.description)
            && Objects.equals(this.eamapInfo, publisherVO.eamapInfo) && Objects.equals(this.email, publisherVO.email)
            && Objects.equals(this.espaseGroup, publisherVO.espaseGroup)
            && Objects.equals(this.extensionCount, publisherVO.extensionCount)
            && Objects.equals(this.id, publisherVO.id) && Objects.equals(this.identifier, publisherVO.identifier)
            && Objects.equals(this.isOpen, publisherVO.isOpen) && Objects.equals(this.isOrg, publisherVO.isOrg)
            && Objects.equals(this.logoUrl, publisherVO.logoUrl)
            && Objects.equals(this.memberCount, publisherVO.memberCount) && Objects.equals(this.name, publisherVO.name)
            && Objects.equals(this.official, publisherVO.official) && Objects.equals(this.owners, publisherVO.owners)
            && Objects.equals(this.publisherReview, publisherVO.publisherReview)
            && Objects.equals(this.role, publisherVO.role) && Objects.equals(this.status, publisherVO.status)
            && Objects.equals(this.suiteCount, publisherVO.suiteCount)
            && Objects.equals(this.supportUrl, publisherVO.supportUrl)
            && Objects.equals(this.systemReview, publisherVO.systemReview)
            && Objects.equals(this.updatedTime, publisherVO.updatedTime)
            && Objects.equals(this.webUrl, publisherVO.webUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeRepo,
            createdTime,
            description,
            eamapInfo,
            email,
            espaseGroup,
            extensionCount,
            id,
            identifier,
            isOpen,
            isOrg,
            logoUrl,
            memberCount,
            name,
            official,
            owners,
            publisherReview,
            role,
            status,
            suiteCount,
            supportUrl,
            systemReview,
            updatedTime,
            webUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublisherVO {\n");
        sb.append("    codeRepo: ").append(toIndentedString(codeRepo)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    eamapInfo: ").append(toIndentedString(eamapInfo)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    espaseGroup: ").append(toIndentedString(espaseGroup)).append("\n");
        sb.append("    extensionCount: ").append(toIndentedString(extensionCount)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
        sb.append("    isOpen: ").append(toIndentedString(isOpen)).append("\n");
        sb.append("    isOrg: ").append(toIndentedString(isOrg)).append("\n");
        sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
        sb.append("    memberCount: ").append(toIndentedString(memberCount)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    official: ").append(toIndentedString(official)).append("\n");
        sb.append("    owners: ").append(toIndentedString(owners)).append("\n");
        sb.append("    publisherReview: ").append(toIndentedString(publisherReview)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    suiteCount: ").append(toIndentedString(suiteCount)).append("\n");
        sb.append("    supportUrl: ").append(toIndentedString(supportUrl)).append("\n");
        sb.append("    systemReview: ").append(toIndentedString(systemReview)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
        sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
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
