package com.huaweicloud.sdk.cloudide.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ExtensionVersionSnake
 */
public class ExtensionVersionSnake {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_ranking")

    private Long versionRanking;

    /**
     * 插件版本状态 - INIT 待发布 - VALIDATING 审核中 - REJECTED 审核拒绝 - PUBLISHED 插件上架 - OFFLINE 插件下线 - ABANDONED 废弃 - GRAY_INIT 灰度审核 - GRAYED 灰度发布 - GRAY_REJECTED 灰度拒绝
     */
    public static final class StatusEnum {

        /**
         * Enum INIT for value: "INIT"
         */
        public static final StatusEnum INIT = new StatusEnum("INIT");

        /**
         * Enum VALIDATING for value: "VALIDATING"
         */
        public static final StatusEnum VALIDATING = new StatusEnum("VALIDATING");

        /**
         * Enum REJECTED for value: "REJECTED"
         */
        public static final StatusEnum REJECTED = new StatusEnum("REJECTED");

        /**
         * Enum PUBLISHED for value: "PUBLISHED"
         */
        public static final StatusEnum PUBLISHED = new StatusEnum("PUBLISHED");

        /**
         * Enum OFFLINE for value: "OFFLINE"
         */
        public static final StatusEnum OFFLINE = new StatusEnum("OFFLINE");

        /**
         * Enum ABANDONED for value: "ABANDONED"
         */
        public static final StatusEnum ABANDONED = new StatusEnum("ABANDONED");

        /**
         * Enum GRAY_INIT for value: "GRAY_INIT"
         */
        public static final StatusEnum GRAY_INIT = new StatusEnum("GRAY_INIT");

        /**
         * Enum GRAYED for value: "GRAYED"
         */
        public static final StatusEnum GRAYED = new StatusEnum("GRAYED");

        /**
         * Enum GRAY_REJECTED for value: "GRAY_REJECTED"
         */
        public static final StatusEnum GRAY_REJECTED = new StatusEnum("GRAY_REJECTED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("INIT", INIT);
            map.put("VALIDATING", VALIDATING);
            map.put("REJECTED", REJECTED);
            map.put("PUBLISHED", PUBLISHED);
            map.put("OFFLINE", OFFLINE);
            map.put("ABANDONED", ABANDONED);
            map.put("GRAY_INIT", GRAY_INIT);
            map.put("GRAYED", GRAYED);
            map.put("GRAY_REJECTED", GRAY_REJECTED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    /**
     * 插件状态 - INIT 待发布 - VALIDATING 审核中 - REJECTED 审核拒绝 - PUBLISHED 插件上架 - OFFLINE 插件下线 - ABANDONED 废弃 - GRAY_INIT 灰度审核 - GRAYED 灰度发布 - GRAY_REJECTED 灰度拒绝
     */
    public static final class VersionStatusEnum {

        /**
         * Enum INIT for value: "INIT"
         */
        public static final VersionStatusEnum INIT = new VersionStatusEnum("INIT");

        /**
         * Enum VALIDATING for value: "VALIDATING"
         */
        public static final VersionStatusEnum VALIDATING = new VersionStatusEnum("VALIDATING");

        /**
         * Enum REJECTED for value: "REJECTED"
         */
        public static final VersionStatusEnum REJECTED = new VersionStatusEnum("REJECTED");

        /**
         * Enum PUBLISHED for value: "PUBLISHED"
         */
        public static final VersionStatusEnum PUBLISHED = new VersionStatusEnum("PUBLISHED");

        /**
         * Enum OFFLINE for value: "OFFLINE"
         */
        public static final VersionStatusEnum OFFLINE = new VersionStatusEnum("OFFLINE");

        /**
         * Enum ABANDONED for value: "ABANDONED"
         */
        public static final VersionStatusEnum ABANDONED = new VersionStatusEnum("ABANDONED");

        /**
         * Enum GRAY_INIT for value: "GRAY_INIT"
         */
        public static final VersionStatusEnum GRAY_INIT = new VersionStatusEnum("GRAY_INIT");

        /**
         * Enum GRAYED for value: "GRAYED"
         */
        public static final VersionStatusEnum GRAYED = new VersionStatusEnum("GRAYED");

        /**
         * Enum GRAY_REJECTED for value: "GRAY_REJECTED"
         */
        public static final VersionStatusEnum GRAY_REJECTED = new VersionStatusEnum("GRAY_REJECTED");

        private static final Map<String, VersionStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VersionStatusEnum> createStaticFields() {
            Map<String, VersionStatusEnum> map = new HashMap<>();
            map.put("INIT", INIT);
            map.put("VALIDATING", VALIDATING);
            map.put("REJECTED", REJECTED);
            map.put("PUBLISHED", PUBLISHED);
            map.put("OFFLINE", OFFLINE);
            map.put("ABANDONED", ABANDONED);
            map.put("GRAY_INIT", GRAY_INIT);
            map.put("GRAYED", GRAYED);
            map.put("GRAY_REJECTED", GRAY_REJECTED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VersionStatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static VersionStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            VersionStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new VersionStatusEnum(value);
            }
            return result;
        }

        public static VersionStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            VersionStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VersionStatusEnum) {
                return this.value.equals(((VersionStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_status")

    private VersionStatusEnum versionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_uri")

    private String assetUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_updated")

    private OffsetDateTime lastUpdated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "files")

    private List<ExtensionFileSnake> files = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "validate_message")

    private String validateMessage;

    /**
     * 插件审核状态 - NONE 无 - UPLOADING 上传中 - VALIDATING 系统审核 - OFFLINING 用户申请下线 - ONLINING 用户申请上线 - UMS_VALIDATING 发布商审核中
     */
    public static final class VersionValidateStatusEnum {

        /**
         * Enum NONE for value: "NONE"
         */
        public static final VersionValidateStatusEnum NONE = new VersionValidateStatusEnum("NONE");

        /**
         * Enum UPLOADING for value: "UPLOADING"
         */
        public static final VersionValidateStatusEnum UPLOADING = new VersionValidateStatusEnum("UPLOADING");

        /**
         * Enum VALIDATING for value: "VALIDATING"
         */
        public static final VersionValidateStatusEnum VALIDATING = new VersionValidateStatusEnum("VALIDATING");

        /**
         * Enum OFFLINING for value: "OFFLINING"
         */
        public static final VersionValidateStatusEnum OFFLINING = new VersionValidateStatusEnum("OFFLINING");

        /**
         * Enum ONLINING for value: "ONLINING"
         */
        public static final VersionValidateStatusEnum ONLINING = new VersionValidateStatusEnum("ONLINING");

        /**
         * Enum UMS_VALIDATING for value: "UMS_VALIDATING"
         */
        public static final VersionValidateStatusEnum UMS_VALIDATING = new VersionValidateStatusEnum("UMS_VALIDATING");

        private static final Map<String, VersionValidateStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VersionValidateStatusEnum> createStaticFields() {
            Map<String, VersionValidateStatusEnum> map = new HashMap<>();
            map.put("NONE", NONE);
            map.put("UPLOADING", UPLOADING);
            map.put("VALIDATING", VALIDATING);
            map.put("OFFLINING", OFFLINING);
            map.put("ONLINING", ONLINING);
            map.put("UMS_VALIDATING", UMS_VALIDATING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VersionValidateStatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static VersionValidateStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            VersionValidateStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new VersionValidateStatusEnum(value);
            }
            return result;
        }

        public static VersionValidateStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            VersionValidateStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VersionValidateStatusEnum) {
                return this.value.equals(((VersionValidateStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_validate_status")

    private VersionValidateStatusEnum versionValidateStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_ide_version")

    private String minIdeVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_ide_version")

    private String maxIdeVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_date")

    private OffsetDateTime versionDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preview")

    private Boolean preview;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extension_pack")

    private String extensionPack;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extension_dependencies")

    private String extensionDependencies;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_ide")

    private Integer supportIde;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_url")

    private String repoUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "help_page")

    private String helpPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "website")

    private String website;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_link")

    private String issueLink;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_size")

    private Long assetSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "depends")

    private List<String> depends = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "property_list")

    private List<CloudIDEExtensionVersionProperty> propertyList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uploader")

    private String uploader;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extension_id")

    private String extensionId;

    public ExtensionVersionSnake withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 插件版本id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ExtensionVersionSnake withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 插件版本号
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ExtensionVersionSnake withVersionRanking(Long versionRanking) {
        this.versionRanking = versionRanking;
        return this;
    }

    /**
     * 版本排序
     * minimum: 0
     * maximum: 2147483647
     * @return versionRanking
     */
    public Long getVersionRanking() {
        return versionRanking;
    }

    public void setVersionRanking(Long versionRanking) {
        this.versionRanking = versionRanking;
    }

    public ExtensionVersionSnake withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 插件版本状态 - INIT 待发布 - VALIDATING 审核中 - REJECTED 审核拒绝 - PUBLISHED 插件上架 - OFFLINE 插件下线 - ABANDONED 废弃 - GRAY_INIT 灰度审核 - GRAYED 灰度发布 - GRAY_REJECTED 灰度拒绝
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ExtensionVersionSnake withVersionStatus(VersionStatusEnum versionStatus) {
        this.versionStatus = versionStatus;
        return this;
    }

    /**
     * 插件状态 - INIT 待发布 - VALIDATING 审核中 - REJECTED 审核拒绝 - PUBLISHED 插件上架 - OFFLINE 插件下线 - ABANDONED 废弃 - GRAY_INIT 灰度审核 - GRAYED 灰度发布 - GRAY_REJECTED 灰度拒绝
     * @return versionStatus
     */
    public VersionStatusEnum getVersionStatus() {
        return versionStatus;
    }

    public void setVersionStatus(VersionStatusEnum versionStatus) {
        this.versionStatus = versionStatus;
    }

    public ExtensionVersionSnake withAssetUri(String assetUri) {
        this.assetUri = assetUri;
        return this;
    }

    /**
     * 资源文件url
     * @return assetUri
     */
    public String getAssetUri() {
        return assetUri;
    }

    public void setAssetUri(String assetUri) {
        this.assetUri = assetUri;
    }

    public ExtensionVersionSnake withLastUpdated(OffsetDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
        return this;
    }

    /**
     * 更新时间
     * @return lastUpdated
     */
    public OffsetDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(OffsetDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public ExtensionVersionSnake withFiles(List<ExtensionFileSnake> files) {
        this.files = files;
        return this;
    }

    public ExtensionVersionSnake addFilesItem(ExtensionFileSnake filesItem) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        this.files.add(filesItem);
        return this;
    }

    public ExtensionVersionSnake withFiles(Consumer<List<ExtensionFileSnake>> filesSetter) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        filesSetter.accept(this.files);
        return this;
    }

    /**
     * 插件文件集合
     * @return files
     */
    public List<ExtensionFileSnake> getFiles() {
        return files;
    }

    public void setFiles(List<ExtensionFileSnake> files) {
        this.files = files;
    }

    public ExtensionVersionSnake withValidateMessage(String validateMessage) {
        this.validateMessage = validateMessage;
        return this;
    }

    /**
     * 插件审核信息
     * @return validateMessage
     */
    public String getValidateMessage() {
        return validateMessage;
    }

    public void setValidateMessage(String validateMessage) {
        this.validateMessage = validateMessage;
    }

    public ExtensionVersionSnake withVersionValidateStatus(VersionValidateStatusEnum versionValidateStatus) {
        this.versionValidateStatus = versionValidateStatus;
        return this;
    }

    /**
     * 插件审核状态 - NONE 无 - UPLOADING 上传中 - VALIDATING 系统审核 - OFFLINING 用户申请下线 - ONLINING 用户申请上线 - UMS_VALIDATING 发布商审核中
     * @return versionValidateStatus
     */
    public VersionValidateStatusEnum getVersionValidateStatus() {
        return versionValidateStatus;
    }

    public void setVersionValidateStatus(VersionValidateStatusEnum versionValidateStatus) {
        this.versionValidateStatus = versionValidateStatus;
    }

    public ExtensionVersionSnake withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 插件展示名称
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public ExtensionVersionSnake withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 插件描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ExtensionVersionSnake withMinIdeVersion(String minIdeVersion) {
        this.minIdeVersion = minIdeVersion;
        return this;
    }

    /**
     * 插件支持ide版本
     * @return minIdeVersion
     */
    public String getMinIdeVersion() {
        return minIdeVersion;
    }

    public void setMinIdeVersion(String minIdeVersion) {
        this.minIdeVersion = minIdeVersion;
    }

    public ExtensionVersionSnake withMaxIdeVersion(String maxIdeVersion) {
        this.maxIdeVersion = maxIdeVersion;
        return this;
    }

    /**
     * 支持的最大版本
     * @return maxIdeVersion
     */
    public String getMaxIdeVersion() {
        return maxIdeVersion;
    }

    public void setMaxIdeVersion(String maxIdeVersion) {
        this.maxIdeVersion = maxIdeVersion;
    }

    public ExtensionVersionSnake withVersionDate(OffsetDateTime versionDate) {
        this.versionDate = versionDate;
        return this;
    }

    /**
     * 发布时间
     * @return versionDate
     */
    public OffsetDateTime getVersionDate() {
        return versionDate;
    }

    public void setVersionDate(OffsetDateTime versionDate) {
        this.versionDate = versionDate;
    }

    public ExtensionVersionSnake withPreview(Boolean preview) {
        this.preview = preview;
        return this;
    }

    /**
     * 是否预览
     * @return preview
     */
    public Boolean getPreview() {
        return preview;
    }

    public void setPreview(Boolean preview) {
        this.preview = preview;
    }

    public ExtensionVersionSnake withExtensionPack(String extensionPack) {
        this.extensionPack = extensionPack;
        return this;
    }

    /**
     * 包含插件列表
     * @return extensionPack
     */
    public String getExtensionPack() {
        return extensionPack;
    }

    public void setExtensionPack(String extensionPack) {
        this.extensionPack = extensionPack;
    }

    public ExtensionVersionSnake withExtensionDependencies(String extensionDependencies) {
        this.extensionDependencies = extensionDependencies;
        return this;
    }

    /**
     * 依赖插件列表
     * @return extensionDependencies
     */
    public String getExtensionDependencies() {
        return extensionDependencies;
    }

    public void setExtensionDependencies(String extensionDependencies) {
        this.extensionDependencies = extensionDependencies;
    }

    public ExtensionVersionSnake withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public ExtensionVersionSnake withSupportIde(Integer supportIde) {
        this.supportIde = supportIde;
        return this;
    }

    /**
     * 支持的ide编码
     * minimum: 0
     * maximum: 2147483647
     * @return supportIde
     */
    public Integer getSupportIde() {
        return supportIde;
    }

    public void setSupportIde(Integer supportIde) {
        this.supportIde = supportIde;
    }

    public ExtensionVersionSnake withRepoUrl(String repoUrl) {
        this.repoUrl = repoUrl;
        return this;
    }

    /**
     * 插件包源码仓
     * @return repoUrl
     */
    public String getRepoUrl() {
        return repoUrl;
    }

    public void setRepoUrl(String repoUrl) {
        this.repoUrl = repoUrl;
    }

    public ExtensionVersionSnake withHelpPage(String helpPage) {
        this.helpPage = helpPage;
        return this;
    }

    /**
     * 帮助页面
     * @return helpPage
     */
    public String getHelpPage() {
        return helpPage;
    }

    public void setHelpPage(String helpPage) {
        this.helpPage = helpPage;
    }

    public ExtensionVersionSnake withWebsite(String website) {
        this.website = website;
        return this;
    }

    /**
     * 产品首页
     * @return website
     */
    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public ExtensionVersionSnake withIssueLink(String issueLink) {
        this.issueLink = issueLink;
        return this;
    }

    /**
     * 问题链接
     * @return issueLink
     */
    public String getIssueLink() {
        return issueLink;
    }

    public void setIssueLink(String issueLink) {
        this.issueLink = issueLink;
    }

    public ExtensionVersionSnake withAssetSize(Long assetSize) {
        this.assetSize = assetSize;
        return this;
    }

    /**
     * 插件大小
     * minimum: 0
     * maximum: 2147483647
     * @return assetSize
     */
    public Long getAssetSize() {
        return assetSize;
    }

    public void setAssetSize(Long assetSize) {
        this.assetSize = assetSize;
    }

    public ExtensionVersionSnake withDepends(List<String> depends) {
        this.depends = depends;
        return this;
    }

    public ExtensionVersionSnake addDependsItem(String dependsItem) {
        if (this.depends == null) {
            this.depends = new ArrayList<>();
        }
        this.depends.add(dependsItem);
        return this;
    }

    public ExtensionVersionSnake withDepends(Consumer<List<String>> dependsSetter) {
        if (this.depends == null) {
            this.depends = new ArrayList<>();
        }
        dependsSetter.accept(this.depends);
        return this;
    }

    /**
     * 依赖插件
     * @return depends
     */
    public List<String> getDepends() {
        return depends;
    }

    public void setDepends(List<String> depends) {
        this.depends = depends;
    }

    public ExtensionVersionSnake withPropertyList(List<CloudIDEExtensionVersionProperty> propertyList) {
        this.propertyList = propertyList;
        return this;
    }

    public ExtensionVersionSnake addPropertyListItem(CloudIDEExtensionVersionProperty propertyListItem) {
        if (this.propertyList == null) {
            this.propertyList = new ArrayList<>();
        }
        this.propertyList.add(propertyListItem);
        return this;
    }

    public ExtensionVersionSnake withPropertyList(Consumer<List<CloudIDEExtensionVersionProperty>> propertyListSetter) {
        if (this.propertyList == null) {
            this.propertyList = new ArrayList<>();
        }
        propertyListSetter.accept(this.propertyList);
        return this;
    }

    /**
     * cloudide插件版本参数
     * @return propertyList
     */
    public List<CloudIDEExtensionVersionProperty> getPropertyList() {
        return propertyList;
    }

    public void setPropertyList(List<CloudIDEExtensionVersionProperty> propertyList) {
        this.propertyList = propertyList;
    }

    public ExtensionVersionSnake withUploader(String uploader) {
        this.uploader = uploader;
        return this;
    }

    /**
     * 版本发布者
     * @return uploader
     */
    public String getUploader() {
        return uploader;
    }

    public void setUploader(String uploader) {
        this.uploader = uploader;
    }

    public ExtensionVersionSnake withExtensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    /**
     * 插件id
     * @return extensionId
     */
    public String getExtensionId() {
        return extensionId;
    }

    public void setExtensionId(String extensionId) {
        this.extensionId = extensionId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExtensionVersionSnake extensionVersionSnake = (ExtensionVersionSnake) o;
        return Objects.equals(this.id, extensionVersionSnake.id)
            && Objects.equals(this.version, extensionVersionSnake.version)
            && Objects.equals(this.versionRanking, extensionVersionSnake.versionRanking)
            && Objects.equals(this.status, extensionVersionSnake.status)
            && Objects.equals(this.versionStatus, extensionVersionSnake.versionStatus)
            && Objects.equals(this.assetUri, extensionVersionSnake.assetUri)
            && Objects.equals(this.lastUpdated, extensionVersionSnake.lastUpdated)
            && Objects.equals(this.files, extensionVersionSnake.files)
            && Objects.equals(this.validateMessage, extensionVersionSnake.validateMessage)
            && Objects.equals(this.versionValidateStatus, extensionVersionSnake.versionValidateStatus)
            && Objects.equals(this.displayName, extensionVersionSnake.displayName)
            && Objects.equals(this.description, extensionVersionSnake.description)
            && Objects.equals(this.minIdeVersion, extensionVersionSnake.minIdeVersion)
            && Objects.equals(this.maxIdeVersion, extensionVersionSnake.maxIdeVersion)
            && Objects.equals(this.versionDate, extensionVersionSnake.versionDate)
            && Objects.equals(this.preview, extensionVersionSnake.preview)
            && Objects.equals(this.extensionPack, extensionVersionSnake.extensionPack)
            && Objects.equals(this.extensionDependencies, extensionVersionSnake.extensionDependencies)
            && Objects.equals(this.createdAt, extensionVersionSnake.createdAt)
            && Objects.equals(this.supportIde, extensionVersionSnake.supportIde)
            && Objects.equals(this.repoUrl, extensionVersionSnake.repoUrl)
            && Objects.equals(this.helpPage, extensionVersionSnake.helpPage)
            && Objects.equals(this.website, extensionVersionSnake.website)
            && Objects.equals(this.issueLink, extensionVersionSnake.issueLink)
            && Objects.equals(this.assetSize, extensionVersionSnake.assetSize)
            && Objects.equals(this.depends, extensionVersionSnake.depends)
            && Objects.equals(this.propertyList, extensionVersionSnake.propertyList)
            && Objects.equals(this.uploader, extensionVersionSnake.uploader)
            && Objects.equals(this.extensionId, extensionVersionSnake.extensionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            version,
            versionRanking,
            status,
            versionStatus,
            assetUri,
            lastUpdated,
            files,
            validateMessage,
            versionValidateStatus,
            displayName,
            description,
            minIdeVersion,
            maxIdeVersion,
            versionDate,
            preview,
            extensionPack,
            extensionDependencies,
            createdAt,
            supportIde,
            repoUrl,
            helpPage,
            website,
            issueLink,
            assetSize,
            depends,
            propertyList,
            uploader,
            extensionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtensionVersionSnake {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    versionRanking: ").append(toIndentedString(versionRanking)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    versionStatus: ").append(toIndentedString(versionStatus)).append("\n");
        sb.append("    assetUri: ").append(toIndentedString(assetUri)).append("\n");
        sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
        sb.append("    files: ").append(toIndentedString(files)).append("\n");
        sb.append("    validateMessage: ").append(toIndentedString(validateMessage)).append("\n");
        sb.append("    versionValidateStatus: ").append(toIndentedString(versionValidateStatus)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    minIdeVersion: ").append(toIndentedString(minIdeVersion)).append("\n");
        sb.append("    maxIdeVersion: ").append(toIndentedString(maxIdeVersion)).append("\n");
        sb.append("    versionDate: ").append(toIndentedString(versionDate)).append("\n");
        sb.append("    preview: ").append(toIndentedString(preview)).append("\n");
        sb.append("    extensionPack: ").append(toIndentedString(extensionPack)).append("\n");
        sb.append("    extensionDependencies: ").append(toIndentedString(extensionDependencies)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    supportIde: ").append(toIndentedString(supportIde)).append("\n");
        sb.append("    repoUrl: ").append(toIndentedString(repoUrl)).append("\n");
        sb.append("    helpPage: ").append(toIndentedString(helpPage)).append("\n");
        sb.append("    website: ").append(toIndentedString(website)).append("\n");
        sb.append("    issueLink: ").append(toIndentedString(issueLink)).append("\n");
        sb.append("    assetSize: ").append(toIndentedString(assetSize)).append("\n");
        sb.append("    depends: ").append(toIndentedString(depends)).append("\n");
        sb.append("    propertyList: ").append(toIndentedString(propertyList)).append("\n");
        sb.append("    uploader: ").append(toIndentedString(uploader)).append("\n");
        sb.append("    extensionId: ").append(toIndentedString(extensionId)).append("\n");
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
