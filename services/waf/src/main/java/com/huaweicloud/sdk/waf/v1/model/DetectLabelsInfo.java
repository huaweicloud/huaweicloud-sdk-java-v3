package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 检测标签详情
 */
public class DetectLabelsInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compliance_labels_info")

    private List<LabelInfo> complianceLabelsInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inject_labels_info")

    private List<LabelInfo> injectLabelsInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "immunity_lexicon_labels_info")

    private List<LabelInfo> immunityLexiconLabelsInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lexicon_labels_info")

    private List<LabelInfo> lexiconLabelsInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lexicon_internal_labels_info")

    private List<LabelInfo> lexiconInternalLabelsInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supported_language_labels")

    private List<LabelInfo> supportedLanguageLabels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pii_labels_info")

    private List<LabelInfo> piiLabelsInfo = null;

    public DetectLabelsInfo withComplianceLabelsInfo(List<LabelInfo> complianceLabelsInfo) {
        this.complianceLabelsInfo = complianceLabelsInfo;
        return this;
    }

    public DetectLabelsInfo addComplianceLabelsInfoItem(LabelInfo complianceLabelsInfoItem) {
        if (this.complianceLabelsInfo == null) {
            this.complianceLabelsInfo = new ArrayList<>();
        }
        this.complianceLabelsInfo.add(complianceLabelsInfoItem);
        return this;
    }

    public DetectLabelsInfo withComplianceLabelsInfo(Consumer<List<LabelInfo>> complianceLabelsInfoSetter) {
        if (this.complianceLabelsInfo == null) {
            this.complianceLabelsInfo = new ArrayList<>();
        }
        complianceLabelsInfoSetter.accept(this.complianceLabelsInfo);
        return this;
    }

    /**
     * 合规检测标签详情列表
     * @return complianceLabelsInfo
     */
    public List<LabelInfo> getComplianceLabelsInfo() {
        return complianceLabelsInfo;
    }

    public void setComplianceLabelsInfo(List<LabelInfo> complianceLabelsInfo) {
        this.complianceLabelsInfo = complianceLabelsInfo;
    }

    public DetectLabelsInfo withInjectLabelsInfo(List<LabelInfo> injectLabelsInfo) {
        this.injectLabelsInfo = injectLabelsInfo;
        return this;
    }

    public DetectLabelsInfo addInjectLabelsInfoItem(LabelInfo injectLabelsInfoItem) {
        if (this.injectLabelsInfo == null) {
            this.injectLabelsInfo = new ArrayList<>();
        }
        this.injectLabelsInfo.add(injectLabelsInfoItem);
        return this;
    }

    public DetectLabelsInfo withInjectLabelsInfo(Consumer<List<LabelInfo>> injectLabelsInfoSetter) {
        if (this.injectLabelsInfo == null) {
            this.injectLabelsInfo = new ArrayList<>();
        }
        injectLabelsInfoSetter.accept(this.injectLabelsInfo);
        return this;
    }

    /**
     * 注入检测标签详情列表
     * @return injectLabelsInfo
     */
    public List<LabelInfo> getInjectLabelsInfo() {
        return injectLabelsInfo;
    }

    public void setInjectLabelsInfo(List<LabelInfo> injectLabelsInfo) {
        this.injectLabelsInfo = injectLabelsInfo;
    }

    public DetectLabelsInfo withImmunityLexiconLabelsInfo(List<LabelInfo> immunityLexiconLabelsInfo) {
        this.immunityLexiconLabelsInfo = immunityLexiconLabelsInfo;
        return this;
    }

    public DetectLabelsInfo addImmunityLexiconLabelsInfoItem(LabelInfo immunityLexiconLabelsInfoItem) {
        if (this.immunityLexiconLabelsInfo == null) {
            this.immunityLexiconLabelsInfo = new ArrayList<>();
        }
        this.immunityLexiconLabelsInfo.add(immunityLexiconLabelsInfoItem);
        return this;
    }

    public DetectLabelsInfo withImmunityLexiconLabelsInfo(Consumer<List<LabelInfo>> immunityLexiconLabelsInfoSetter) {
        if (this.immunityLexiconLabelsInfo == null) {
            this.immunityLexiconLabelsInfo = new ArrayList<>();
        }
        immunityLexiconLabelsInfoSetter.accept(this.immunityLexiconLabelsInfo);
        return this;
    }

    /**
     * 豁免词库标签详情列表
     * @return immunityLexiconLabelsInfo
     */
    public List<LabelInfo> getImmunityLexiconLabelsInfo() {
        return immunityLexiconLabelsInfo;
    }

    public void setImmunityLexiconLabelsInfo(List<LabelInfo> immunityLexiconLabelsInfo) {
        this.immunityLexiconLabelsInfo = immunityLexiconLabelsInfo;
    }

    public DetectLabelsInfo withLexiconLabelsInfo(List<LabelInfo> lexiconLabelsInfo) {
        this.lexiconLabelsInfo = lexiconLabelsInfo;
        return this;
    }

    public DetectLabelsInfo addLexiconLabelsInfoItem(LabelInfo lexiconLabelsInfoItem) {
        if (this.lexiconLabelsInfo == null) {
            this.lexiconLabelsInfo = new ArrayList<>();
        }
        this.lexiconLabelsInfo.add(lexiconLabelsInfoItem);
        return this;
    }

    public DetectLabelsInfo withLexiconLabelsInfo(Consumer<List<LabelInfo>> lexiconLabelsInfoSetter) {
        if (this.lexiconLabelsInfo == null) {
            this.lexiconLabelsInfo = new ArrayList<>();
        }
        lexiconLabelsInfoSetter.accept(this.lexiconLabelsInfo);
        return this;
    }

    /**
     * 自定义词库检测标签详情列表
     * @return lexiconLabelsInfo
     */
    public List<LabelInfo> getLexiconLabelsInfo() {
        return lexiconLabelsInfo;
    }

    public void setLexiconLabelsInfo(List<LabelInfo> lexiconLabelsInfo) {
        this.lexiconLabelsInfo = lexiconLabelsInfo;
    }

    public DetectLabelsInfo withLexiconInternalLabelsInfo(List<LabelInfo> lexiconInternalLabelsInfo) {
        this.lexiconInternalLabelsInfo = lexiconInternalLabelsInfo;
        return this;
    }

    public DetectLabelsInfo addLexiconInternalLabelsInfoItem(LabelInfo lexiconInternalLabelsInfoItem) {
        if (this.lexiconInternalLabelsInfo == null) {
            this.lexiconInternalLabelsInfo = new ArrayList<>();
        }
        this.lexiconInternalLabelsInfo.add(lexiconInternalLabelsInfoItem);
        return this;
    }

    public DetectLabelsInfo withLexiconInternalLabelsInfo(Consumer<List<LabelInfo>> lexiconInternalLabelsInfoSetter) {
        if (this.lexiconInternalLabelsInfo == null) {
            this.lexiconInternalLabelsInfo = new ArrayList<>();
        }
        lexiconInternalLabelsInfoSetter.accept(this.lexiconInternalLabelsInfo);
        return this;
    }

    /**
     * 内置词库检测标签详情列表
     * @return lexiconInternalLabelsInfo
     */
    public List<LabelInfo> getLexiconInternalLabelsInfo() {
        return lexiconInternalLabelsInfo;
    }

    public void setLexiconInternalLabelsInfo(List<LabelInfo> lexiconInternalLabelsInfo) {
        this.lexiconInternalLabelsInfo = lexiconInternalLabelsInfo;
    }

    public DetectLabelsInfo withSupportedLanguageLabels(List<LabelInfo> supportedLanguageLabels) {
        this.supportedLanguageLabels = supportedLanguageLabels;
        return this;
    }

    public DetectLabelsInfo addSupportedLanguageLabelsItem(LabelInfo supportedLanguageLabelsItem) {
        if (this.supportedLanguageLabels == null) {
            this.supportedLanguageLabels = new ArrayList<>();
        }
        this.supportedLanguageLabels.add(supportedLanguageLabelsItem);
        return this;
    }

    public DetectLabelsInfo withSupportedLanguageLabels(Consumer<List<LabelInfo>> supportedLanguageLabelsSetter) {
        if (this.supportedLanguageLabels == null) {
            this.supportedLanguageLabels = new ArrayList<>();
        }
        supportedLanguageLabelsSetter.accept(this.supportedLanguageLabels);
        return this;
    }

    /**
     * 语言检测标签信息列表
     * @return supportedLanguageLabels
     */
    public List<LabelInfo> getSupportedLanguageLabels() {
        return supportedLanguageLabels;
    }

    public void setSupportedLanguageLabels(List<LabelInfo> supportedLanguageLabels) {
        this.supportedLanguageLabels = supportedLanguageLabels;
    }

    public DetectLabelsInfo withPiiLabelsInfo(List<LabelInfo> piiLabelsInfo) {
        this.piiLabelsInfo = piiLabelsInfo;
        return this;
    }

    public DetectLabelsInfo addPiiLabelsInfoItem(LabelInfo piiLabelsInfoItem) {
        if (this.piiLabelsInfo == null) {
            this.piiLabelsInfo = new ArrayList<>();
        }
        this.piiLabelsInfo.add(piiLabelsInfoItem);
        return this;
    }

    public DetectLabelsInfo withPiiLabelsInfo(Consumer<List<LabelInfo>> piiLabelsInfoSetter) {
        if (this.piiLabelsInfo == null) {
            this.piiLabelsInfo = new ArrayList<>();
        }
        piiLabelsInfoSetter.accept(this.piiLabelsInfo);
        return this;
    }

    /**
     * 敏感词的标签详情列表
     * @return piiLabelsInfo
     */
    public List<LabelInfo> getPiiLabelsInfo() {
        return piiLabelsInfo;
    }

    public void setPiiLabelsInfo(List<LabelInfo> piiLabelsInfo) {
        this.piiLabelsInfo = piiLabelsInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DetectLabelsInfo that = (DetectLabelsInfo) obj;
        return Objects.equals(this.complianceLabelsInfo, that.complianceLabelsInfo)
            && Objects.equals(this.injectLabelsInfo, that.injectLabelsInfo)
            && Objects.equals(this.immunityLexiconLabelsInfo, that.immunityLexiconLabelsInfo)
            && Objects.equals(this.lexiconLabelsInfo, that.lexiconLabelsInfo)
            && Objects.equals(this.lexiconInternalLabelsInfo, that.lexiconInternalLabelsInfo)
            && Objects.equals(this.supportedLanguageLabels, that.supportedLanguageLabels)
            && Objects.equals(this.piiLabelsInfo, that.piiLabelsInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(complianceLabelsInfo,
            injectLabelsInfo,
            immunityLexiconLabelsInfo,
            lexiconLabelsInfo,
            lexiconInternalLabelsInfo,
            supportedLanguageLabels,
            piiLabelsInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DetectLabelsInfo {\n");
        sb.append("    complianceLabelsInfo: ").append(toIndentedString(complianceLabelsInfo)).append("\n");
        sb.append("    injectLabelsInfo: ").append(toIndentedString(injectLabelsInfo)).append("\n");
        sb.append("    immunityLexiconLabelsInfo: ").append(toIndentedString(immunityLexiconLabelsInfo)).append("\n");
        sb.append("    lexiconLabelsInfo: ").append(toIndentedString(lexiconLabelsInfo)).append("\n");
        sb.append("    lexiconInternalLabelsInfo: ").append(toIndentedString(lexiconInternalLabelsInfo)).append("\n");
        sb.append("    supportedLanguageLabels: ").append(toIndentedString(supportedLanguageLabels)).append("\n");
        sb.append("    piiLabelsInfo: ").append(toIndentedString(piiLabelsInfo)).append("\n");
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
