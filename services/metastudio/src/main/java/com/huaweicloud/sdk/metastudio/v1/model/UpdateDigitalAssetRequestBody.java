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
 * 更新资产请求体。
 */
public class UpdateDigitalAssetRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_name")

    private String assetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_description")

    private String assetDescription;

    /**
     * 资产类型。 * HUMAN_MODEL:数字人模型 * VOICE_MODEL:音色模型(仅系统管理员可更新) * SCENE:场景模型 * ANIMATION:动作动画 * VIDEO:视频文件 * IMAGE:图片文件 * PPT:幻灯片文件 * MATERIAL:风格化素材
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

    /**
     * 资产状态。 * UNACTIVED: 取消激活。未激活的资产不可用于其他业务 * ACTIVED: 激活。激活后的资产科用于其他业务
     */
    public static final class AssetStateEnum {

        /**
         * Enum UNACTIVED for value: "UNACTIVED"
         */
        public static final AssetStateEnum UNACTIVED = new AssetStateEnum("UNACTIVED");

        /**
         * Enum ACTIVED for value: "ACTIVED"
         */
        public static final AssetStateEnum ACTIVED = new AssetStateEnum("ACTIVED");

        private static final Map<String, AssetStateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AssetStateEnum> createStaticFields() {
            Map<String, AssetStateEnum> map = new HashMap<>();
            map.put("UNACTIVED", UNACTIVED);
            map.put("ACTIVED", ACTIVED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AssetStateEnum(String value) {
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
        public static AssetStateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AssetStateEnum(value));
        }

        public static AssetStateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AssetStateEnum) {
                return this.value.equals(((AssetStateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_state")

    private AssetStateEnum assetState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_owner")

    private String assetOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_extra_meta")

    private AssetExtraMeta assetExtraMeta;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_properties")

    private List<SystemProperty> systemProperties = null;

    public UpdateDigitalAssetRequestBody withAssetName(String assetName) {
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

    public UpdateDigitalAssetRequestBody withAssetDescription(String assetDescription) {
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

    public UpdateDigitalAssetRequestBody withAssetType(AssetTypeEnum assetType) {
        this.assetType = assetType;
        return this;
    }

    /**
     * 资产类型。 * HUMAN_MODEL:数字人模型 * VOICE_MODEL:音色模型(仅系统管理员可更新) * SCENE:场景模型 * ANIMATION:动作动画 * VIDEO:视频文件 * IMAGE:图片文件 * PPT:幻灯片文件 * MATERIAL:风格化素材
     * @return assetType
     */
    public AssetTypeEnum getAssetType() {
        return assetType;
    }

    public void setAssetType(AssetTypeEnum assetType) {
        this.assetType = assetType;
    }

    public UpdateDigitalAssetRequestBody withAssetState(AssetStateEnum assetState) {
        this.assetState = assetState;
        return this;
    }

    /**
     * 资产状态。 * UNACTIVED: 取消激活。未激活的资产不可用于其他业务 * ACTIVED: 激活。激活后的资产科用于其他业务
     * @return assetState
     */
    public AssetStateEnum getAssetState() {
        return assetState;
    }

    public void setAssetState(AssetStateEnum assetState) {
        this.assetState = assetState;
    }

    public UpdateDigitalAssetRequestBody withAssetOwner(String assetOwner) {
        this.assetOwner = assetOwner;
        return this;
    }

    /**
     * 资产所属者。填租户的project id。
     * @return assetOwner
     */
    public String getAssetOwner() {
        return assetOwner;
    }

    public void setAssetOwner(String assetOwner) {
        this.assetOwner = assetOwner;
    }

    public UpdateDigitalAssetRequestBody withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public UpdateDigitalAssetRequestBody addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public UpdateDigitalAssetRequestBody withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表。
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public UpdateDigitalAssetRequestBody withAssetExtraMeta(AssetExtraMeta assetExtraMeta) {
        this.assetExtraMeta = assetExtraMeta;
        return this;
    }

    public UpdateDigitalAssetRequestBody withAssetExtraMeta(Consumer<AssetExtraMeta> assetExtraMetaSetter) {
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

    public UpdateDigitalAssetRequestBody withSystemProperties(List<SystemProperty> systemProperties) {
        this.systemProperties = systemProperties;
        return this;
    }

    public UpdateDigitalAssetRequestBody addSystemPropertiesItem(SystemProperty systemPropertiesItem) {
        if (this.systemProperties == null) {
            this.systemProperties = new ArrayList<>();
        }
        this.systemProperties.add(systemPropertiesItem);
        return this;
    }

    public UpdateDigitalAssetRequestBody withSystemProperties(Consumer<List<SystemProperty>> systemPropertiesSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateDigitalAssetRequestBody that = (UpdateDigitalAssetRequestBody) obj;
        return Objects.equals(this.assetName, that.assetName)
            && Objects.equals(this.assetDescription, that.assetDescription)
            && Objects.equals(this.assetType, that.assetType) && Objects.equals(this.assetState, that.assetState)
            && Objects.equals(this.assetOwner, that.assetOwner) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.assetExtraMeta, that.assetExtraMeta)
            && Objects.equals(this.systemProperties, that.systemProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetName,
            assetDescription,
            assetType,
            assetState,
            assetOwner,
            tags,
            assetExtraMeta,
            systemProperties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDigitalAssetRequestBody {\n");
        sb.append("    assetName: ").append(toIndentedString(assetName)).append("\n");
        sb.append("    assetDescription: ").append(toIndentedString(assetDescription)).append("\n");
        sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
        sb.append("    assetState: ").append(toIndentedString(assetState)).append("\n");
        sb.append("    assetOwner: ").append(toIndentedString(assetOwner)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    assetExtraMeta: ").append(toIndentedString(assetExtraMeta)).append("\n");
        sb.append("    systemProperties: ").append(toIndentedString(systemProperties)).append("\n");
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
