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
 * 分身模型元数据
 */
public class HumanModel2DAssetMeta {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_action_editable")

    private Boolean isActionEditable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_real_background")

    private Boolean isRealBackground;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_live")

    private Boolean supportLive;

    /**
     * **参数解释**： 分身数字人模型版本 **约束限制**： 不涉及 **取值范围**： * V2: V2版本模型 * V3：V3版本模型 * V3_2：V3.2版本模型 * V3_3：V3.3版本模型
     */
    public static final class ModelVersionEnum {

        /**
         * Enum V2 for value: "V2"
         */
        public static final ModelVersionEnum V2 = new ModelVersionEnum("V2");

        /**
         * Enum V3 for value: "V3"
         */
        public static final ModelVersionEnum V3 = new ModelVersionEnum("V3");

        /**
         * Enum V3_2 for value: "V3_2"
         */
        public static final ModelVersionEnum V3_2 = new ModelVersionEnum("V3_2");

        /**
         * Enum V3_3 for value: "V3_3"
         */
        public static final ModelVersionEnum V3_3 = new ModelVersionEnum("V3_3");

        private static final Map<String, ModelVersionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ModelVersionEnum> createStaticFields() {
            Map<String, ModelVersionEnum> map = new HashMap<>();
            map.put("V2", V2);
            map.put("V3", V3);
            map.put("V3_2", V3_2);
            map.put("V3_3", V3_3);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ModelVersionEnum(String value) {
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
        public static ModelVersionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ModelVersionEnum(value));
        }

        public static ModelVersionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ModelVersionEnum) {
                return this.value.equals(((ModelVersionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_version")

    private ModelVersionEnum modelVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_resolution")

    private String modelResolution;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_names")

    private List<String> deviceNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_with_action_library")

    private Boolean isWithActionLibrary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_tag_map")

    private List<ActionTagInfo> actionTagMap = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_flexus")

    private Boolean isFlexus;

    public HumanModel2DAssetMeta withIsActionEditable(Boolean isActionEditable) {
        this.isActionEditable = isActionEditable;
        return this;
    }

    /**
     * **参数解释**： 分身数字人的动作是否可编辑 **约束限制**： 不涉及 **取值范围**： * true: 动作可编辑 * false: 动作不可编辑
     * @return isActionEditable
     */
    public Boolean getIsActionEditable() {
        return isActionEditable;
    }

    public void setIsActionEditable(Boolean isActionEditable) {
        this.isActionEditable = isActionEditable;
    }

    public HumanModel2DAssetMeta withIsRealBackground(Boolean isRealBackground) {
        this.isRealBackground = isRealBackground;
        return this;
    }

    /**
     * **参数解释**： 是否是实景分身数字人 **约束限制**： 实景分身数字人不做背景替换。 **取值范围**： * true: 实景分身数字人 * false: 普通分身数字人，不带背景。
     * @return isRealBackground
     */
    public Boolean getIsRealBackground() {
        return isRealBackground;
    }

    public void setIsRealBackground(Boolean isRealBackground) {
        this.isRealBackground = isRealBackground;
    }

    public HumanModel2DAssetMeta withSupportLive(Boolean supportLive) {
        this.supportLive = supportLive;
        return this;
    }

    /**
     * **参数解释**： 是否支持直播 **约束限制**： 不涉及 **取值范围**： * true: 支持直播 * false: 不支持直播。
     * @return supportLive
     */
    public Boolean getSupportLive() {
        return supportLive;
    }

    public void setSupportLive(Boolean supportLive) {
        this.supportLive = supportLive;
    }

    public HumanModel2DAssetMeta withModelVersion(ModelVersionEnum modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }

    /**
     * **参数解释**： 分身数字人模型版本 **约束限制**： 不涉及 **取值范围**： * V2: V2版本模型 * V3：V3版本模型 * V3_2：V3.2版本模型 * V3_3：V3.3版本模型
     * @return modelVersion
     */
    public ModelVersionEnum getModelVersion() {
        return modelVersion;
    }

    public void setModelVersion(ModelVersionEnum modelVersion) {
        this.modelVersion = modelVersion;
    }

    public HumanModel2DAssetMeta withModelResolution(String modelResolution) {
        this.modelResolution = modelResolution;
        return this;
    }

    /**
     * **参数解释**： 分身数字人模型分辨率。 **约束限制**： 不涉及 **取值范围**： * 1080P：1080P。支持1080P及720P的视频输出。 * 4K：4K。支持4K、1080P及720P的视频输出。
     * @return modelResolution
     */
    public String getModelResolution() {
        return modelResolution;
    }

    public void setModelResolution(String modelResolution) {
        this.modelResolution = modelResolution;
    }

    public HumanModel2DAssetMeta withDeviceNames(List<String> deviceNames) {
        this.deviceNames = deviceNames;
        return this;
    }

    public HumanModel2DAssetMeta addDeviceNamesItem(String deviceNamesItem) {
        if (this.deviceNames == null) {
            this.deviceNames = new ArrayList<>();
        }
        this.deviceNames.add(deviceNamesItem);
        return this;
    }

    public HumanModel2DAssetMeta withDeviceNames(Consumer<List<String>> deviceNamesSetter) {
        if (this.deviceNames == null) {
            this.deviceNames = new ArrayList<>();
        }
        deviceNamesSetter.accept(this.deviceNames);
        return this;
    }

    /**
     * **参数解释**： 已执行编译任务设备类型列表。 **约束限制**： 支持走动的数字人，当前仅用于视频制作，不能用于直播和智能交互 **取值范围**： 设备名称列表最多16个。 设备名称字符长度1-64位。 **默认取值**： false
     * @return deviceNames
     */
    public List<String> getDeviceNames() {
        return deviceNames;
    }

    public void setDeviceNames(List<String> deviceNames) {
        this.deviceNames = deviceNames;
    }

    public HumanModel2DAssetMeta withIsWithActionLibrary(Boolean isWithActionLibrary) {
        this.isWithActionLibrary = isWithActionLibrary;
        return this;
    }

    /**
     * 分身数字人是否带原子动作库。 > * 带原子动作库的分身数字人可做动作编排。
     * @return isWithActionLibrary
     */
    public Boolean getIsWithActionLibrary() {
        return isWithActionLibrary;
    }

    public void setIsWithActionLibrary(Boolean isWithActionLibrary) {
        this.isWithActionLibrary = isWithActionLibrary;
    }

    public HumanModel2DAssetMeta withActionTagMap(List<ActionTagInfo> actionTagMap) {
        this.actionTagMap = actionTagMap;
        return this;
    }

    public HumanModel2DAssetMeta addActionTagMapItem(ActionTagInfo actionTagMapItem) {
        if (this.actionTagMap == null) {
            this.actionTagMap = new ArrayList<>();
        }
        this.actionTagMap.add(actionTagMapItem);
        return this;
    }

    public HumanModel2DAssetMeta withActionTagMap(Consumer<List<ActionTagInfo>> actionTagMapSetter) {
        if (this.actionTagMap == null) {
            this.actionTagMap = new ArrayList<>();
        }
        actionTagMapSetter.accept(this.actionTagMap);
        return this;
    }

    /**
     * 动作标签映射。
     * @return actionTagMap
     */
    public List<ActionTagInfo> getActionTagMap() {
        return actionTagMap;
    }

    public void setActionTagMap(List<ActionTagInfo> actionTagMap) {
        this.actionTagMap = actionTagMap;
    }

    public HumanModel2DAssetMeta withIsFlexus(Boolean isFlexus) {
        this.isFlexus = isFlexus;
        return this;
    }

    /**
     * 是否是Flexus版本分身数字人。
     * @return isFlexus
     */
    public Boolean getIsFlexus() {
        return isFlexus;
    }

    public void setIsFlexus(Boolean isFlexus) {
        this.isFlexus = isFlexus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HumanModel2DAssetMeta that = (HumanModel2DAssetMeta) obj;
        return Objects.equals(this.isActionEditable, that.isActionEditable)
            && Objects.equals(this.isRealBackground, that.isRealBackground)
            && Objects.equals(this.supportLive, that.supportLive)
            && Objects.equals(this.modelVersion, that.modelVersion)
            && Objects.equals(this.modelResolution, that.modelResolution)
            && Objects.equals(this.deviceNames, that.deviceNames)
            && Objects.equals(this.isWithActionLibrary, that.isWithActionLibrary)
            && Objects.equals(this.actionTagMap, that.actionTagMap) && Objects.equals(this.isFlexus, that.isFlexus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isActionEditable,
            isRealBackground,
            supportLive,
            modelVersion,
            modelResolution,
            deviceNames,
            isWithActionLibrary,
            actionTagMap,
            isFlexus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HumanModel2DAssetMeta {\n");
        sb.append("    isActionEditable: ").append(toIndentedString(isActionEditable)).append("\n");
        sb.append("    isRealBackground: ").append(toIndentedString(isRealBackground)).append("\n");
        sb.append("    supportLive: ").append(toIndentedString(supportLive)).append("\n");
        sb.append("    modelVersion: ").append(toIndentedString(modelVersion)).append("\n");
        sb.append("    modelResolution: ").append(toIndentedString(modelResolution)).append("\n");
        sb.append("    deviceNames: ").append(toIndentedString(deviceNames)).append("\n");
        sb.append("    isWithActionLibrary: ").append(toIndentedString(isWithActionLibrary)).append("\n");
        sb.append("    actionTagMap: ").append(toIndentedString(actionTagMap)).append("\n");
        sb.append("    isFlexus: ").append(toIndentedString(isFlexus)).append("\n");
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
