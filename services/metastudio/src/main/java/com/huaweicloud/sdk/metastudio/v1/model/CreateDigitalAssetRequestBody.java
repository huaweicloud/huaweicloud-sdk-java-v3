package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建资产请求体。
 */
public class CreateDigitalAssetRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_name")

    private String assetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_description")

    private String assetDescription;

    /**
     * 资产类型。  公共资产类型： * VOICE_MODEL：音色模型（仅系统管理员可上传，普通租户仅可查询） * VIDEO：视频文件 * IMAGE：图片文件 * PPT：幻灯片文件 * MUSIC: 音乐 * AUDIO: 音频 * COMMON_FILE：通用文件  分身数字人资产： * HUMAN_MODEL_2D: 分身数字人模型 * BUSINESS_CARD_TEMPLET: 数字人名片模板  3D数字人资产： * HUMAN_MODEL：3D数字人模型 * SCENE：场景模型 * ANIMATION：动作动画 * MATERIAL：风格化素材 * NORMAL_MODEL: 普通模型
     */
    public static final class AssetTypeEnum {

        /**
         * Enum HUMAN_MODEL for value: "HUMAN_MODEL"
         */
        public static final AssetTypeEnum HUMAN_MODEL = new AssetTypeEnum("HUMAN_MODEL");

        /**
         * Enum VOICE_MODEL for value: "VOICE_MODEL"
         */
        public static final AssetTypeEnum VOICE_MODEL = new AssetTypeEnum("VOICE_MODEL");

        /**
         * Enum SCENE for value: "SCENE"
         */
        public static final AssetTypeEnum SCENE = new AssetTypeEnum("SCENE");

        /**
         * Enum ANIMATION for value: "ANIMATION"
         */
        public static final AssetTypeEnum ANIMATION = new AssetTypeEnum("ANIMATION");

        /**
         * Enum VIDEO for value: "VIDEO"
         */
        public static final AssetTypeEnum VIDEO = new AssetTypeEnum("VIDEO");

        /**
         * Enum IMAGE for value: "IMAGE"
         */
        public static final AssetTypeEnum IMAGE = new AssetTypeEnum("IMAGE");

        /**
         * Enum PPT for value: "PPT"
         */
        public static final AssetTypeEnum PPT = new AssetTypeEnum("PPT");

        /**
         * Enum MATERIAL for value: "MATERIAL"
         */
        public static final AssetTypeEnum MATERIAL = new AssetTypeEnum("MATERIAL");

        /**
         * Enum NORMAL_MODEL for value: "NORMAL_MODEL"
         */
        public static final AssetTypeEnum NORMAL_MODEL = new AssetTypeEnum("NORMAL_MODEL");

        /**
         * Enum COMMON_FILE for value: "COMMON_FILE"
         */
        public static final AssetTypeEnum COMMON_FILE = new AssetTypeEnum("COMMON_FILE");

        /**
         * Enum HUMAN_MODEL_2D for value: "HUMAN_MODEL_2D"
         */
        public static final AssetTypeEnum HUMAN_MODEL_2D = new AssetTypeEnum("HUMAN_MODEL_2D");

        /**
         * Enum BUSINESS_CARD_TEMPLET for value: "BUSINESS_CARD_TEMPLET"
         */
        public static final AssetTypeEnum BUSINESS_CARD_TEMPLET = new AssetTypeEnum("BUSINESS_CARD_TEMPLET");

        /**
         * Enum MUSIC for value: "MUSIC"
         */
        public static final AssetTypeEnum MUSIC = new AssetTypeEnum("MUSIC");

        /**
         * Enum AUDIO for value: "AUDIO"
         */
        public static final AssetTypeEnum AUDIO = new AssetTypeEnum("AUDIO");

        private static final Map<String, AssetTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AssetTypeEnum> createStaticFields() {
            Map<String, AssetTypeEnum> map = new HashMap<>();
            map.put("HUMAN_MODEL", HUMAN_MODEL);
            map.put("VOICE_MODEL", VOICE_MODEL);
            map.put("SCENE", SCENE);
            map.put("ANIMATION", ANIMATION);
            map.put("VIDEO", VIDEO);
            map.put("IMAGE", IMAGE);
            map.put("PPT", PPT);
            map.put("MATERIAL", MATERIAL);
            map.put("NORMAL_MODEL", NORMAL_MODEL);
            map.put("COMMON_FILE", COMMON_FILE);
            map.put("HUMAN_MODEL_2D", HUMAN_MODEL_2D);
            map.put("BUSINESS_CARD_TEMPLET", BUSINESS_CARD_TEMPLET);
            map.put("MUSIC", MUSIC);
            map.put("AUDIO", AUDIO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AssetTypeEnum(String value) {
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
        public static AssetTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AssetTypeEnum(value));
        }

        public static AssetTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AssetTypeEnum) {
                return this.value.equals(((AssetTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_type")

    private AssetTypeEnum assetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_owner")

    private String assetOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review_config")

    private ReviewConfig reviewConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_extra_meta")

    private AssetExtraMeta assetExtraMeta;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_properties")

    private List<SystemProperty> systemProperties = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shared_config")

    private AssetSharedConfig sharedConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_need_generate_cover")

    private Boolean isNeedGenerateCover;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_order")

    private Integer assetOrder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supported_service")

    private List<SupportedServiceEnum> supportedService = null;

    public CreateDigitalAssetRequestBody withAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }

    /**
     * 资产名称。
     * @return assetName
     */
    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public CreateDigitalAssetRequestBody withAssetDescription(String assetDescription) {
        this.assetDescription = assetDescription;
        return this;
    }

    /**
     * 资产描述。
     * @return assetDescription
     */
    public String getAssetDescription() {
        return assetDescription;
    }

    public void setAssetDescription(String assetDescription) {
        this.assetDescription = assetDescription;
    }

    public CreateDigitalAssetRequestBody withAssetType(AssetTypeEnum assetType) {
        this.assetType = assetType;
        return this;
    }

    /**
     * 资产类型。  公共资产类型： * VOICE_MODEL：音色模型（仅系统管理员可上传，普通租户仅可查询） * VIDEO：视频文件 * IMAGE：图片文件 * PPT：幻灯片文件 * MUSIC: 音乐 * AUDIO: 音频 * COMMON_FILE：通用文件  分身数字人资产： * HUMAN_MODEL_2D: 分身数字人模型 * BUSINESS_CARD_TEMPLET: 数字人名片模板  3D数字人资产： * HUMAN_MODEL：3D数字人模型 * SCENE：场景模型 * ANIMATION：动作动画 * MATERIAL：风格化素材 * NORMAL_MODEL: 普通模型
     * @return assetType
     */
    public AssetTypeEnum getAssetType() {
        return assetType;
    }

    public void setAssetType(AssetTypeEnum assetType) {
        this.assetType = assetType;
    }

    public CreateDigitalAssetRequestBody withAssetOwner(String assetOwner) {
        this.assetOwner = assetOwner;
        return this;
    }

    /**
     * 项目ID。 > * 仅管理员账号可设置此参数。
     * @return assetOwner
     */
    public String getAssetOwner() {
        return assetOwner;
    }

    public void setAssetOwner(String assetOwner) {
        this.assetOwner = assetOwner;
    }

    public CreateDigitalAssetRequestBody withReviewConfig(ReviewConfig reviewConfig) {
        this.reviewConfig = reviewConfig;
        return this;
    }

    public CreateDigitalAssetRequestBody withReviewConfig(Consumer<ReviewConfig> reviewConfigSetter) {
        if (this.reviewConfig == null) {
            this.reviewConfig = new ReviewConfig();
            reviewConfigSetter.accept(this.reviewConfig);
        }

        return this;
    }

    /**
     * Get reviewConfig
     * @return reviewConfig
     */
    public ReviewConfig getReviewConfig() {
        return reviewConfig;
    }

    public void setReviewConfig(ReviewConfig reviewConfig) {
        this.reviewConfig = reviewConfig;
    }

    public CreateDigitalAssetRequestBody withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public CreateDigitalAssetRequestBody addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateDigitalAssetRequestBody withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表。 > 分身形象系统资产的tag定义如下： > - 行业：NEWS,BUSINESS,E-COMMERCE,MARKETING,KNOWLEDGE,EDUCATION,SPORTS > - 性别：MALE,FEMALE > - 姿势：FULL-BODY,HALF-BODY,STANDING,SITTING,WALKING > - 区域：ASIAN,WESTERN,MIDDLE-EASTERNER,AFRICAN,LATINO
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public CreateDigitalAssetRequestBody withAssetExtraMeta(AssetExtraMeta assetExtraMeta) {
        this.assetExtraMeta = assetExtraMeta;
        return this;
    }

    public CreateDigitalAssetRequestBody withAssetExtraMeta(Consumer<AssetExtraMeta> assetExtraMetaSetter) {
        if (this.assetExtraMeta == null) {
            this.assetExtraMeta = new AssetExtraMeta();
            assetExtraMetaSetter.accept(this.assetExtraMeta);
        }

        return this;
    }

    /**
     * Get assetExtraMeta
     * @return assetExtraMeta
     */
    public AssetExtraMeta getAssetExtraMeta() {
        return assetExtraMeta;
    }

    public void setAssetExtraMeta(AssetExtraMeta assetExtraMeta) {
        this.assetExtraMeta = assetExtraMeta;
    }

    public CreateDigitalAssetRequestBody withSystemProperties(List<SystemProperty> systemProperties) {
        this.systemProperties = systemProperties;
        return this;
    }

    public CreateDigitalAssetRequestBody addSystemPropertiesItem(SystemProperty systemPropertiesItem) {
        if (this.systemProperties == null) {
            this.systemProperties = new ArrayList<>();
        }
        this.systemProperties.add(systemPropertiesItem);
        return this;
    }

    public CreateDigitalAssetRequestBody withSystemProperties(Consumer<List<SystemProperty>> systemPropertiesSetter) {
        if (this.systemProperties == null) {
            this.systemProperties = new ArrayList<>();
        }
        systemPropertiesSetter.accept(this.systemProperties);
        return this;
    }

    /**
     * 设置系统属性。
     * @return systemProperties
     */
    public List<SystemProperty> getSystemProperties() {
        return systemProperties;
    }

    public void setSystemProperties(List<SystemProperty> systemProperties) {
        this.systemProperties = systemProperties;
    }

    public CreateDigitalAssetRequestBody withSharedConfig(AssetSharedConfig sharedConfig) {
        this.sharedConfig = sharedConfig;
        return this;
    }

    public CreateDigitalAssetRequestBody withSharedConfig(Consumer<AssetSharedConfig> sharedConfigSetter) {
        if (this.sharedConfig == null) {
            this.sharedConfig = new AssetSharedConfig();
            sharedConfigSetter.accept(this.sharedConfig);
        }

        return this;
    }

    /**
     * Get sharedConfig
     * @return sharedConfig
     */
    public AssetSharedConfig getSharedConfig() {
        return sharedConfig;
    }

    public void setSharedConfig(AssetSharedConfig sharedConfig) {
        this.sharedConfig = sharedConfig;
    }

    public CreateDigitalAssetRequestBody withIsNeedGenerateCover(Boolean isNeedGenerateCover) {
        this.isNeedGenerateCover = isNeedGenerateCover;
        return this;
    }

    /**
     * 是否需要生成封面。
     * @return isNeedGenerateCover
     */
    public Boolean getIsNeedGenerateCover() {
        return isNeedGenerateCover;
    }

    public void setIsNeedGenerateCover(Boolean isNeedGenerateCover) {
        this.isNeedGenerateCover = isNeedGenerateCover;
    }

    public CreateDigitalAssetRequestBody withAssetOrder(Integer assetOrder) {
        this.assetOrder = assetOrder;
        return this;
    }

    /**
     * 展示顺序
     * minimum: 0
     * maximum: 32767
     * @return assetOrder
     */
    public Integer getAssetOrder() {
        return assetOrder;
    }

    public void setAssetOrder(Integer assetOrder) {
        this.assetOrder = assetOrder;
    }

    public CreateDigitalAssetRequestBody withSupportedService(List<SupportedServiceEnum> supportedService) {
        this.supportedService = supportedService;
        return this;
    }

    public CreateDigitalAssetRequestBody addSupportedServiceItem(SupportedServiceEnum supportedServiceItem) {
        if (this.supportedService == null) {
            this.supportedService = new ArrayList<>();
        }
        this.supportedService.add(supportedServiceItem);
        return this;
    }

    public CreateDigitalAssetRequestBody withSupportedService(
        Consumer<List<SupportedServiceEnum>> supportedServiceSetter) {
        if (this.supportedService == null) {
            this.supportedService = new ArrayList<>();
        }
        supportedServiceSetter.accept(this.supportedService);
        return this;
    }

    /**
     * 支持的业务类型。： * VIDEO_2D：分身数字人视频制作 * LIVE_2D：分身数字人直播 * CHAT_2D：分身数字人智能交互
     * @return supportedService
     */
    public List<SupportedServiceEnum> getSupportedService() {
        return supportedService;
    }

    public void setSupportedService(List<SupportedServiceEnum> supportedService) {
        this.supportedService = supportedService;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateDigitalAssetRequestBody that = (CreateDigitalAssetRequestBody) obj;
        return Objects.equals(this.assetName, that.assetName)
            && Objects.equals(this.assetDescription, that.assetDescription)
            && Objects.equals(this.assetType, that.assetType) && Objects.equals(this.assetOwner, that.assetOwner)
            && Objects.equals(this.reviewConfig, that.reviewConfig) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.assetExtraMeta, that.assetExtraMeta)
            && Objects.equals(this.systemProperties, that.systemProperties)
            && Objects.equals(this.sharedConfig, that.sharedConfig)
            && Objects.equals(this.isNeedGenerateCover, that.isNeedGenerateCover)
            && Objects.equals(this.assetOrder, that.assetOrder)
            && Objects.equals(this.supportedService, that.supportedService);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetName,
            assetDescription,
            assetType,
            assetOwner,
            reviewConfig,
            tags,
            assetExtraMeta,
            systemProperties,
            sharedConfig,
            isNeedGenerateCover,
            assetOrder,
            supportedService);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDigitalAssetRequestBody {\n");
        sb.append("    assetName: ").append(toIndentedString(assetName)).append("\n");
        sb.append("    assetDescription: ").append(toIndentedString(assetDescription)).append("\n");
        sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
        sb.append("    assetOwner: ").append(toIndentedString(assetOwner)).append("\n");
        sb.append("    reviewConfig: ").append(toIndentedString(reviewConfig)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    assetExtraMeta: ").append(toIndentedString(assetExtraMeta)).append("\n");
        sb.append("    systemProperties: ").append(toIndentedString(systemProperties)).append("\n");
        sb.append("    sharedConfig: ").append(toIndentedString(sharedConfig)).append("\n");
        sb.append("    isNeedGenerateCover: ").append(toIndentedString(isNeedGenerateCover)).append("\n");
        sb.append("    assetOrder: ").append(toIndentedString(assetOrder)).append("\n");
        sb.append("    supportedService: ").append(toIndentedString(supportedService)).append("\n");
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
