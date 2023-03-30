package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * StyleExtraMetaAdditionalProperties
 */
public class StyleExtraMetaAdditionalProperties {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "icon")

    private String icon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    private Map<String, String> label = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_alg_file")

    private Boolean useAlgFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algorithm_classify_tag")

    private Map<String, String> algorithmClassifyTag = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_body_style")

    private String modelBodyStyle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mc_asset")

    private EngineAssetInfo mcAsset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ue_asset")

    private EngineAssetInfo ueAsset;

    public StyleExtraMetaAdditionalProperties withIcon(String icon) {
        this.icon = icon;
        return this;
    }

    /**
     * 图标url
     * @return icon
     */
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public StyleExtraMetaAdditionalProperties withLabel(Map<String, String> label) {
        this.label = label;
        return this;
    }

    public StyleExtraMetaAdditionalProperties putLabelItem(String key, String labelItem) {
        if (this.label == null) {
            this.label = new HashMap<>();
        }
        this.label.put(key, labelItem);
        return this;
    }

    public StyleExtraMetaAdditionalProperties withLabel(Consumer<Map<String, String>> labelSetter) {
        if (this.label == null) {
            this.label = new HashMap<>();
        }
        labelSetter.accept(this.label);
        return this;
    }

    /**
     * 展示标签 {\"cn\": \"xxxxx\",\"en\":\"xxxxx\"}
     * @return label
     */
    public Map<String, String> getLabel() {
        return label;
    }

    public void setLabel(Map<String, String> label) {
        this.label = label;
    }

    public StyleExtraMetaAdditionalProperties withUseAlgFile(Boolean useAlgFile) {
        this.useAlgFile = useAlgFile;
        return this;
    }

    /**
     * 是否使用算法输出文件，针对生成算法
     * @return useAlgFile
     */
    public Boolean getUseAlgFile() {
        return useAlgFile;
    }

    public void setUseAlgFile(Boolean useAlgFile) {
        this.useAlgFile = useAlgFile;
    }

    public StyleExtraMetaAdditionalProperties withAlgorithmClassifyTag(Map<String, String> algorithmClassifyTag) {
        this.algorithmClassifyTag = algorithmClassifyTag;
        return this;
    }

    public StyleExtraMetaAdditionalProperties putAlgorithmClassifyTagItem(String key, String algorithmClassifyTagItem) {
        if (this.algorithmClassifyTag == null) {
            this.algorithmClassifyTag = new HashMap<>();
        }
        this.algorithmClassifyTag.put(key, algorithmClassifyTagItem);
        return this;
    }

    public StyleExtraMetaAdditionalProperties withAlgorithmClassifyTag(
        Consumer<Map<String, String>> algorithmClassifyTagSetter) {
        if (this.algorithmClassifyTag == null) {
            this.algorithmClassifyTag = new HashMap<>();
        }
        algorithmClassifyTagSetter.accept(this.algorithmClassifyTag);
        return this;
    }

    /**
     * 所属算法标签属性值，针对分类算法
     * @return algorithmClassifyTag
     */
    public Map<String, String> getAlgorithmClassifyTag() {
        return algorithmClassifyTag;
    }

    public void setAlgorithmClassifyTag(Map<String, String> algorithmClassifyTag) {
        this.algorithmClassifyTag = algorithmClassifyTag;
    }

    public StyleExtraMetaAdditionalProperties withModelBodyStyle(String modelBodyStyle) {
        this.modelBodyStyle = modelBodyStyle;
        return this;
    }

    /**
     * 当前使用的身体骨骼
     * @return modelBodyStyle
     */
    public String getModelBodyStyle() {
        return modelBodyStyle;
    }

    public void setModelBodyStyle(String modelBodyStyle) {
        this.modelBodyStyle = modelBodyStyle;
    }

    public StyleExtraMetaAdditionalProperties withMcAsset(EngineAssetInfo mcAsset) {
        this.mcAsset = mcAsset;
        return this;
    }

    public StyleExtraMetaAdditionalProperties withMcAsset(Consumer<EngineAssetInfo> mcAssetSetter) {
        if (this.mcAsset == null) {
            this.mcAsset = new EngineAssetInfo();
            mcAssetSetter.accept(this.mcAsset);
        }

        return this;
    }

    /**
     * Get mcAsset
     * @return mcAsset
     */
    public EngineAssetInfo getMcAsset() {
        return mcAsset;
    }

    public void setMcAsset(EngineAssetInfo mcAsset) {
        this.mcAsset = mcAsset;
    }

    public StyleExtraMetaAdditionalProperties withUeAsset(EngineAssetInfo ueAsset) {
        this.ueAsset = ueAsset;
        return this;
    }

    public StyleExtraMetaAdditionalProperties withUeAsset(Consumer<EngineAssetInfo> ueAssetSetter) {
        if (this.ueAsset == null) {
            this.ueAsset = new EngineAssetInfo();
            ueAssetSetter.accept(this.ueAsset);
        }

        return this;
    }

    /**
     * Get ueAsset
     * @return ueAsset
     */
    public EngineAssetInfo getUeAsset() {
        return ueAsset;
    }

    public void setUeAsset(EngineAssetInfo ueAsset) {
        this.ueAsset = ueAsset;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StyleExtraMetaAdditionalProperties styleExtraMetaAdditionalProperties = (StyleExtraMetaAdditionalProperties) o;
        return Objects.equals(this.icon, styleExtraMetaAdditionalProperties.icon)
            && Objects.equals(this.label, styleExtraMetaAdditionalProperties.label)
            && Objects.equals(this.useAlgFile, styleExtraMetaAdditionalProperties.useAlgFile)
            && Objects.equals(this.algorithmClassifyTag, styleExtraMetaAdditionalProperties.algorithmClassifyTag)
            && Objects.equals(this.modelBodyStyle, styleExtraMetaAdditionalProperties.modelBodyStyle)
            && Objects.equals(this.mcAsset, styleExtraMetaAdditionalProperties.mcAsset)
            && Objects.equals(this.ueAsset, styleExtraMetaAdditionalProperties.ueAsset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(icon, label, useAlgFile, algorithmClassifyTag, modelBodyStyle, mcAsset, ueAsset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StyleExtraMetaAdditionalProperties {\n");
        sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    useAlgFile: ").append(toIndentedString(useAlgFile)).append("\n");
        sb.append("    algorithmClassifyTag: ").append(toIndentedString(algorithmClassifyTag)).append("\n");
        sb.append("    modelBodyStyle: ").append(toIndentedString(modelBodyStyle)).append("\n");
        sb.append("    mcAsset: ").append(toIndentedString(mcAsset)).append("\n");
        sb.append("    ueAsset: ").append(toIndentedString(ueAsset)).append("\n");
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
