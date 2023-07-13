package com.huaweicloud.sdk.cloudide.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ExtensionAllSnake
 */
public class ExtensionAllSnake {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extension_id")

    private String extensionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extension_name")

    private String extensionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flags")

    private Integer flags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_updated")

    private OffsetDateTime lastUpdated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "published_date")

    private OffsetDateTime publishedDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "release_date")

    private OffsetDateTime releaseDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "short_description")

    private String shortDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_all_list")

    private List<String> tagAllList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publisher")

    private PublisherSnake publisher;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arch")

    private List<String> arch = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target")

    private String target;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "categories")

    private List<String> categories = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_all_list")

    private List<String> categoryAllList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_manager")

    private PublisherSnake publishManager;

    /**
     * 插件状态  - INIT 上传插件的第一个版本 - NORMAL 插件有审核通过的版本 - OFFLINE 插件下线 - ABANDONED 上传废弃 - GRAYED 灰度插件
     */
    public static final class StatusEnum {

        /**
         * Enum INIT for value: "INIT"
         */
        public static final StatusEnum INIT = new StatusEnum("INIT");

        /**
         * Enum NORMAL for value: "NORMAL"
         */
        public static final StatusEnum NORMAL = new StatusEnum("NORMAL");

        /**
         * Enum OFFLINE for value: "OFFLINE"
         */
        public static final StatusEnum OFFLINE = new StatusEnum("OFFLINE");

        /**
         * Enum ABANDONED for value: "ABANDONED"
         */
        public static final StatusEnum ABANDONED = new StatusEnum("ABANDONED");

        /**
         * Enum GRAYED for value: "GRAYED"
         */
        public static final StatusEnum GRAYED = new StatusEnum("GRAYED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("INIT", INIT);
            map.put("NORMAL", NORMAL);
            map.put("OFFLINE", OFFLINE);
            map.put("ABANDONED", ABANDONED);
            map.put("GRAYED", GRAYED);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
     * 插件审核状态  - NONE 审核结束 - VALIDATING 审核中
     */
    public static final class ValidateStatusEnum {

        /**
         * Enum NONE for value: "NONE"
         */
        public static final ValidateStatusEnum NONE = new ValidateStatusEnum("NONE");

        /**
         * Enum VALIDATING for value: "VALIDATING"
         */
        public static final ValidateStatusEnum VALIDATING = new ValidateStatusEnum("VALIDATING");

        private static final Map<String, ValidateStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ValidateStatusEnum> createStaticFields() {
            Map<String, ValidateStatusEnum> map = new HashMap<>();
            map.put("NONE", NONE);
            map.put("VALIDATING", VALIDATING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ValidateStatusEnum(String value) {
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
        public static ValidateStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ValidateStatusEnum(value));
        }

        public static ValidateStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ValidateStatusEnum) {
                return this.value.equals(((ValidateStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "validate_status")

    private ValidateStatusEnum validateStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "install_count")

    private Integer installCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "average_star")

    private BigDecimal averageStar;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identifier")

    private String identifier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_os")

    private List<String> supportOs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_ide")

    private Integer supportIde;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_ide_info")

    private String supportIdeInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "versions")

    private List<ExtensionVersionSnake> versions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "validate_result")

    private String validateResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extension_statistics")

    private ExtensionStatistics extensionStatistics;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preview")

    private Boolean preview;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ext_info")

    private ExtensionExternalInfo extInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform")

    private String platform;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_result")

    private CheckResult checkResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gray_version_count")

    private Integer grayVersionCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extension_owner")

    private String extensionOwner;

    public ExtensionAllSnake withExtensionId(String extensionId) {
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

    public ExtensionAllSnake withExtensionName(String extensionName) {
        this.extensionName = extensionName;
        return this;
    }

    /**
     * 插件名称
     * @return extensionName
     */
    public String getExtensionName() {
        return extensionName;
    }

    public void setExtensionName(String extensionName) {
        this.extensionName = extensionName;
    }

    public ExtensionAllSnake withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 插件显示名称
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public ExtensionAllSnake withFlags(Integer flags) {
        this.flags = flags;
        return this;
    }

    /**
     * 插件flag;通过传递flag参数来进行过滤或其他操作。flag的基础数字是2\\4\\8\\16;传递的参数只能是这四个数字加法组合而成的数字 利用它们之间二进制的运算获取的值进行其他操作.比如6=0110=0010+0100也就是2和4的集合flags
     * minimum: 2
     * maximum: 30
     * @return flags
     */
    public Integer getFlags() {
        return flags;
    }

    public void setFlags(Integer flags) {
        this.flags = flags;
    }

    public ExtensionAllSnake withLastUpdated(OffsetDateTime lastUpdated) {
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

    public ExtensionAllSnake withPublishedDate(OffsetDateTime publishedDate) {
        this.publishedDate = publishedDate;
        return this;
    }

    /**
     * 上传时间
     * @return publishedDate
     */
    public OffsetDateTime getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(OffsetDateTime publishedDate) {
        this.publishedDate = publishedDate;
    }

    public ExtensionAllSnake withReleaseDate(OffsetDateTime releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    /**
     * 发布时间
     * @return releaseDate
     */
    public OffsetDateTime getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(OffsetDateTime releaseDate) {
        this.releaseDate = releaseDate;
    }

    public ExtensionAllSnake withShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
        return this;
    }

    /**
     * 插件描述
     * @return shortDescription
     */
    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public ExtensionAllSnake withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public ExtensionAllSnake addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ExtensionAllSnake withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 插件标签
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public ExtensionAllSnake withTagAllList(List<String> tagAllList) {
        this.tagAllList = tagAllList;
        return this;
    }

    public ExtensionAllSnake addTagAllListItem(String tagAllListItem) {
        if (this.tagAllList == null) {
            this.tagAllList = new ArrayList<>();
        }
        this.tagAllList.add(tagAllListItem);
        return this;
    }

    public ExtensionAllSnake withTagAllList(Consumer<List<String>> tagAllListSetter) {
        if (this.tagAllList == null) {
            this.tagAllList = new ArrayList<>();
        }
        tagAllListSetter.accept(this.tagAllList);
        return this;
    }

    /**
     * 所有标签
     * @return tagAllList
     */
    public List<String> getTagAllList() {
        return tagAllList;
    }

    public void setTagAllList(List<String> tagAllList) {
        this.tagAllList = tagAllList;
    }

    public ExtensionAllSnake withPublisher(PublisherSnake publisher) {
        this.publisher = publisher;
        return this;
    }

    public ExtensionAllSnake withPublisher(Consumer<PublisherSnake> publisherSetter) {
        if (this.publisher == null) {
            this.publisher = new PublisherSnake();
            publisherSetter.accept(this.publisher);
        }

        return this;
    }

    /**
     * Get publisher
     * @return publisher
     */
    public PublisherSnake getPublisher() {
        return publisher;
    }

    public void setPublisher(PublisherSnake publisher) {
        this.publisher = publisher;
    }

    public ExtensionAllSnake withArch(List<String> arch) {
        this.arch = arch;
        return this;
    }

    public ExtensionAllSnake addArchItem(String archItem) {
        if (this.arch == null) {
            this.arch = new ArrayList<>();
        }
        this.arch.add(archItem);
        return this;
    }

    public ExtensionAllSnake withArch(Consumer<List<String>> archSetter) {
        if (this.arch == null) {
            this.arch = new ArrayList<>();
        }
        archSetter.accept(this.arch);
        return this;
    }

    /**
     * 系统架构
     * @return arch
     */
    public List<String> getArch() {
        return arch;
    }

    public void setArch(List<String> arch) {
        this.arch = arch;
    }

    public ExtensionAllSnake withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * 安装目标
     * @return target
     */
    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public ExtensionAllSnake withCategories(List<String> categories) {
        this.categories = categories;
        return this;
    }

    public ExtensionAllSnake addCategoriesItem(String categoriesItem) {
        if (this.categories == null) {
            this.categories = new ArrayList<>();
        }
        this.categories.add(categoriesItem);
        return this;
    }

    public ExtensionAllSnake withCategories(Consumer<List<String>> categoriesSetter) {
        if (this.categories == null) {
            this.categories = new ArrayList<>();
        }
        categoriesSetter.accept(this.categories);
        return this;
    }

    /**
     * 插件分类
     * @return categories
     */
    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public ExtensionAllSnake withCategoryAllList(List<String> categoryAllList) {
        this.categoryAllList = categoryAllList;
        return this;
    }

    public ExtensionAllSnake addCategoryAllListItem(String categoryAllListItem) {
        if (this.categoryAllList == null) {
            this.categoryAllList = new ArrayList<>();
        }
        this.categoryAllList.add(categoryAllListItem);
        return this;
    }

    public ExtensionAllSnake withCategoryAllList(Consumer<List<String>> categoryAllListSetter) {
        if (this.categoryAllList == null) {
            this.categoryAllList = new ArrayList<>();
        }
        categoryAllListSetter.accept(this.categoryAllList);
        return this;
    }

    /**
     * 全部分类列表
     * @return categoryAllList
     */
    public List<String> getCategoryAllList() {
        return categoryAllList;
    }

    public void setCategoryAllList(List<String> categoryAllList) {
        this.categoryAllList = categoryAllList;
    }

    public ExtensionAllSnake withPublishManager(PublisherSnake publishManager) {
        this.publishManager = publishManager;
        return this;
    }

    public ExtensionAllSnake withPublishManager(Consumer<PublisherSnake> publishManagerSetter) {
        if (this.publishManager == null) {
            this.publishManager = new PublisherSnake();
            publishManagerSetter.accept(this.publishManager);
        }

        return this;
    }

    /**
     * Get publishManager
     * @return publishManager
     */
    public PublisherSnake getPublishManager() {
        return publishManager;
    }

    public void setPublishManager(PublisherSnake publishManager) {
        this.publishManager = publishManager;
    }

    public ExtensionAllSnake withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 插件状态  - INIT 上传插件的第一个版本 - NORMAL 插件有审核通过的版本 - OFFLINE 插件下线 - ABANDONED 上传废弃 - GRAYED 灰度插件
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ExtensionAllSnake withValidateStatus(ValidateStatusEnum validateStatus) {
        this.validateStatus = validateStatus;
        return this;
    }

    /**
     * 插件审核状态  - NONE 审核结束 - VALIDATING 审核中
     * @return validateStatus
     */
    public ValidateStatusEnum getValidateStatus() {
        return validateStatus;
    }

    public void setValidateStatus(ValidateStatusEnum validateStatus) {
        this.validateStatus = validateStatus;
    }

    public ExtensionAllSnake withInstallCount(Integer installCount) {
        this.installCount = installCount;
        return this;
    }

    /**
     * 下载量
     * minimum: 0
     * maximum: 2147483647
     * @return installCount
     */
    public Integer getInstallCount() {
        return installCount;
    }

    public void setInstallCount(Integer installCount) {
        this.installCount = installCount;
    }

    public ExtensionAllSnake withAverageStar(BigDecimal averageStar) {
        this.averageStar = averageStar;
        return this;
    }

    /**
     * 平均评星值
     * minimum: 0
     * maximum: 5
     * @return averageStar
     */
    public BigDecimal getAverageStar() {
        return averageStar;
    }

    public void setAverageStar(BigDecimal averageStar) {
        this.averageStar = averageStar;
    }

    public ExtensionAllSnake withIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * 插件唯一标识内部插件市场保留
     * @return identifier
     */
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public ExtensionAllSnake withSupportOs(List<String> supportOs) {
        this.supportOs = supportOs;
        return this;
    }

    public ExtensionAllSnake addSupportOsItem(String supportOsItem) {
        if (this.supportOs == null) {
            this.supportOs = new ArrayList<>();
        }
        this.supportOs.add(supportOsItem);
        return this;
    }

    public ExtensionAllSnake withSupportOs(Consumer<List<String>> supportOsSetter) {
        if (this.supportOs == null) {
            this.supportOs = new ArrayList<>();
        }
        supportOsSetter.accept(this.supportOs);
        return this;
    }

    /**
     * 插件支持的操作系统
     * @return supportOs
     */
    public List<String> getSupportOs() {
        return supportOs;
    }

    public void setSupportOs(List<String> supportOs) {
        this.supportOs = supportOs;
    }

    public ExtensionAllSnake withSupportIde(Integer supportIde) {
        this.supportIde = supportIde;
        return this;
    }

    /**
     * 插件支持的ide
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

    public ExtensionAllSnake withSupportIdeInfo(String supportIdeInfo) {
        this.supportIdeInfo = supportIdeInfo;
        return this;
    }

    /**
     * 插件支持的ide名称
     * @return supportIdeInfo
     */
    public String getSupportIdeInfo() {
        return supportIdeInfo;
    }

    public void setSupportIdeInfo(String supportIdeInfo) {
        this.supportIdeInfo = supportIdeInfo;
    }

    public ExtensionAllSnake withVersions(List<ExtensionVersionSnake> versions) {
        this.versions = versions;
        return this;
    }

    public ExtensionAllSnake addVersionsItem(ExtensionVersionSnake versionsItem) {
        if (this.versions == null) {
            this.versions = new ArrayList<>();
        }
        this.versions.add(versionsItem);
        return this;
    }

    public ExtensionAllSnake withVersions(Consumer<List<ExtensionVersionSnake>> versionsSetter) {
        if (this.versions == null) {
            this.versions = new ArrayList<>();
        }
        versionsSetter.accept(this.versions);
        return this;
    }

    /**
     * 插件版本集合
     * @return versions
     */
    public List<ExtensionVersionSnake> getVersions() {
        return versions;
    }

    public void setVersions(List<ExtensionVersionSnake> versions) {
        this.versions = versions;
    }

    public ExtensionAllSnake withValidateResult(String validateResult) {
        this.validateResult = validateResult;
        return this;
    }

    /**
     * 插件审核结果
     * @return validateResult
     */
    public String getValidateResult() {
        return validateResult;
    }

    public void setValidateResult(String validateResult) {
        this.validateResult = validateResult;
    }

    public ExtensionAllSnake withExtensionStatistics(ExtensionStatistics extensionStatistics) {
        this.extensionStatistics = extensionStatistics;
        return this;
    }

    public ExtensionAllSnake withExtensionStatistics(Consumer<ExtensionStatistics> extensionStatisticsSetter) {
        if (this.extensionStatistics == null) {
            this.extensionStatistics = new ExtensionStatistics();
            extensionStatisticsSetter.accept(this.extensionStatistics);
        }

        return this;
    }

    /**
     * Get extensionStatistics
     * @return extensionStatistics
     */
    public ExtensionStatistics getExtensionStatistics() {
        return extensionStatistics;
    }

    public void setExtensionStatistics(ExtensionStatistics extensionStatistics) {
        this.extensionStatistics = extensionStatistics;
    }

    public ExtensionAllSnake withPreview(Boolean preview) {
        this.preview = preview;
        return this;
    }

    /**
     * 是否支持预览
     * @return preview
     */
    public Boolean getPreview() {
        return preview;
    }

    public void setPreview(Boolean preview) {
        this.preview = preview;
    }

    public ExtensionAllSnake withExtInfo(ExtensionExternalInfo extInfo) {
        this.extInfo = extInfo;
        return this;
    }

    public ExtensionAllSnake withExtInfo(Consumer<ExtensionExternalInfo> extInfoSetter) {
        if (this.extInfo == null) {
            this.extInfo = new ExtensionExternalInfo();
            extInfoSetter.accept(this.extInfo);
        }

        return this;
    }

    /**
     * Get extInfo
     * @return extInfo
     */
    public ExtensionExternalInfo getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(ExtensionExternalInfo extInfo) {
        this.extInfo = extInfo;
    }

    public ExtensionAllSnake withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * 安装目标
     * @return platform
     */
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public ExtensionAllSnake withCheckResult(CheckResult checkResult) {
        this.checkResult = checkResult;
        return this;
    }

    public ExtensionAllSnake withCheckResult(Consumer<CheckResult> checkResultSetter) {
        if (this.checkResult == null) {
            this.checkResult = new CheckResult();
            checkResultSetter.accept(this.checkResult);
        }

        return this;
    }

    /**
     * Get checkResult
     * @return checkResult
     */
    public CheckResult getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(CheckResult checkResult) {
        this.checkResult = checkResult;
    }

    public ExtensionAllSnake withGrayVersionCount(Integer grayVersionCount) {
        this.grayVersionCount = grayVersionCount;
        return this;
    }

    /**
     * 灰度版本数量
     * minimum: 0
     * maximum: 255
     * @return grayVersionCount
     */
    public Integer getGrayVersionCount() {
        return grayVersionCount;
    }

    public void setGrayVersionCount(Integer grayVersionCount) {
        this.grayVersionCount = grayVersionCount;
    }

    public ExtensionAllSnake withExtensionOwner(String extensionOwner) {
        this.extensionOwner = extensionOwner;
        return this;
    }

    /**
     * 插件作者
     * @return extensionOwner
     */
    public String getExtensionOwner() {
        return extensionOwner;
    }

    public void setExtensionOwner(String extensionOwner) {
        this.extensionOwner = extensionOwner;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExtensionAllSnake that = (ExtensionAllSnake) obj;
        return Objects.equals(this.extensionId, that.extensionId)
            && Objects.equals(this.extensionName, that.extensionName)
            && Objects.equals(this.displayName, that.displayName) && Objects.equals(this.flags, that.flags)
            && Objects.equals(this.lastUpdated, that.lastUpdated)
            && Objects.equals(this.publishedDate, that.publishedDate)
            && Objects.equals(this.releaseDate, that.releaseDate)
            && Objects.equals(this.shortDescription, that.shortDescription) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.tagAllList, that.tagAllList) && Objects.equals(this.publisher, that.publisher)
            && Objects.equals(this.arch, that.arch) && Objects.equals(this.target, that.target)
            && Objects.equals(this.categories, that.categories)
            && Objects.equals(this.categoryAllList, that.categoryAllList)
            && Objects.equals(this.publishManager, that.publishManager) && Objects.equals(this.status, that.status)
            && Objects.equals(this.validateStatus, that.validateStatus)
            && Objects.equals(this.installCount, that.installCount)
            && Objects.equals(this.averageStar, that.averageStar) && Objects.equals(this.identifier, that.identifier)
            && Objects.equals(this.supportOs, that.supportOs) && Objects.equals(this.supportIde, that.supportIde)
            && Objects.equals(this.supportIdeInfo, that.supportIdeInfo) && Objects.equals(this.versions, that.versions)
            && Objects.equals(this.validateResult, that.validateResult)
            && Objects.equals(this.extensionStatistics, that.extensionStatistics)
            && Objects.equals(this.preview, that.preview) && Objects.equals(this.extInfo, that.extInfo)
            && Objects.equals(this.platform, that.platform) && Objects.equals(this.checkResult, that.checkResult)
            && Objects.equals(this.grayVersionCount, that.grayVersionCount)
            && Objects.equals(this.extensionOwner, that.extensionOwner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(extensionId,
            extensionName,
            displayName,
            flags,
            lastUpdated,
            publishedDate,
            releaseDate,
            shortDescription,
            tags,
            tagAllList,
            publisher,
            arch,
            target,
            categories,
            categoryAllList,
            publishManager,
            status,
            validateStatus,
            installCount,
            averageStar,
            identifier,
            supportOs,
            supportIde,
            supportIdeInfo,
            versions,
            validateResult,
            extensionStatistics,
            preview,
            extInfo,
            platform,
            checkResult,
            grayVersionCount,
            extensionOwner);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtensionAllSnake {\n");
        sb.append("    extensionId: ").append(toIndentedString(extensionId)).append("\n");
        sb.append("    extensionName: ").append(toIndentedString(extensionName)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
        sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
        sb.append("    publishedDate: ").append(toIndentedString(publishedDate)).append("\n");
        sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
        sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    tagAllList: ").append(toIndentedString(tagAllList)).append("\n");
        sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
        sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
        sb.append("    categoryAllList: ").append(toIndentedString(categoryAllList)).append("\n");
        sb.append("    publishManager: ").append(toIndentedString(publishManager)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    validateStatus: ").append(toIndentedString(validateStatus)).append("\n");
        sb.append("    installCount: ").append(toIndentedString(installCount)).append("\n");
        sb.append("    averageStar: ").append(toIndentedString(averageStar)).append("\n");
        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
        sb.append("    supportOs: ").append(toIndentedString(supportOs)).append("\n");
        sb.append("    supportIde: ").append(toIndentedString(supportIde)).append("\n");
        sb.append("    supportIdeInfo: ").append(toIndentedString(supportIdeInfo)).append("\n");
        sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
        sb.append("    validateResult: ").append(toIndentedString(validateResult)).append("\n");
        sb.append("    extensionStatistics: ").append(toIndentedString(extensionStatistics)).append("\n");
        sb.append("    preview: ").append(toIndentedString(preview)).append("\n");
        sb.append("    extInfo: ").append(toIndentedString(extInfo)).append("\n");
        sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
        sb.append("    checkResult: ").append(toIndentedString(checkResult)).append("\n");
        sb.append("    grayVersionCount: ").append(toIndentedString(grayVersionCount)).append("\n");
        sb.append("    extensionOwner: ").append(toIndentedString(extensionOwner)).append("\n");
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
