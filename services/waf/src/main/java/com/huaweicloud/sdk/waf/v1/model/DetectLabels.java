package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 检测标签配置
 */
public class DetectLabels {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compliance_labels")

    private List<String> complianceLabels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inject_labels")

    private List<String> injectLabels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "immunity_lexicon_labels")

    private List<String> immunityLexiconLabels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lexicon_labels")

    private List<String> lexiconLabels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lexicon_internal_labels")

    private List<String> lexiconInternalLabels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supported_language_labels")

    private List<String> supportedLanguageLabels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pii_labels")

    private List<String> piiLabels = null;

    public DetectLabels withComplianceLabels(List<String> complianceLabels) {
        this.complianceLabels = complianceLabels;
        return this;
    }

    public DetectLabels addComplianceLabelsItem(String complianceLabelsItem) {
        if (this.complianceLabels == null) {
            this.complianceLabels = new ArrayList<>();
        }
        this.complianceLabels.add(complianceLabelsItem);
        return this;
    }

    public DetectLabels withComplianceLabels(Consumer<List<String>> complianceLabelsSetter) {
        if (this.complianceLabels == null) {
            this.complianceLabels = new ArrayList<>();
        }
        complianceLabelsSetter.accept(this.complianceLabels);
        return this;
    }

    /**
     * 合规检测标签列表
     * @return complianceLabels
     */
    public List<String> getComplianceLabels() {
        return complianceLabels;
    }

    public void setComplianceLabels(List<String> complianceLabels) {
        this.complianceLabels = complianceLabels;
    }

    public DetectLabels withInjectLabels(List<String> injectLabels) {
        this.injectLabels = injectLabels;
        return this;
    }

    public DetectLabels addInjectLabelsItem(String injectLabelsItem) {
        if (this.injectLabels == null) {
            this.injectLabels = new ArrayList<>();
        }
        this.injectLabels.add(injectLabelsItem);
        return this;
    }

    public DetectLabels withInjectLabels(Consumer<List<String>> injectLabelsSetter) {
        if (this.injectLabels == null) {
            this.injectLabels = new ArrayList<>();
        }
        injectLabelsSetter.accept(this.injectLabels);
        return this;
    }

    /**
     * 注入检测标签列表
     * @return injectLabels
     */
    public List<String> getInjectLabels() {
        return injectLabels;
    }

    public void setInjectLabels(List<String> injectLabels) {
        this.injectLabels = injectLabels;
    }

    public DetectLabels withImmunityLexiconLabels(List<String> immunityLexiconLabels) {
        this.immunityLexiconLabels = immunityLexiconLabels;
        return this;
    }

    public DetectLabels addImmunityLexiconLabelsItem(String immunityLexiconLabelsItem) {
        if (this.immunityLexiconLabels == null) {
            this.immunityLexiconLabels = new ArrayList<>();
        }
        this.immunityLexiconLabels.add(immunityLexiconLabelsItem);
        return this;
    }

    public DetectLabels withImmunityLexiconLabels(Consumer<List<String>> immunityLexiconLabelsSetter) {
        if (this.immunityLexiconLabels == null) {
            this.immunityLexiconLabels = new ArrayList<>();
        }
        immunityLexiconLabelsSetter.accept(this.immunityLexiconLabels);
        return this;
    }

    /**
     * 豁免词库标签列表
     * @return immunityLexiconLabels
     */
    public List<String> getImmunityLexiconLabels() {
        return immunityLexiconLabels;
    }

    public void setImmunityLexiconLabels(List<String> immunityLexiconLabels) {
        this.immunityLexiconLabels = immunityLexiconLabels;
    }

    public DetectLabels withLexiconLabels(List<String> lexiconLabels) {
        this.lexiconLabels = lexiconLabels;
        return this;
    }

    public DetectLabels addLexiconLabelsItem(String lexiconLabelsItem) {
        if (this.lexiconLabels == null) {
            this.lexiconLabels = new ArrayList<>();
        }
        this.lexiconLabels.add(lexiconLabelsItem);
        return this;
    }

    public DetectLabels withLexiconLabels(Consumer<List<String>> lexiconLabelsSetter) {
        if (this.lexiconLabels == null) {
            this.lexiconLabels = new ArrayList<>();
        }
        lexiconLabelsSetter.accept(this.lexiconLabels);
        return this;
    }

    /**
     * 自定义词库检测标签列表
     * @return lexiconLabels
     */
    public List<String> getLexiconLabels() {
        return lexiconLabels;
    }

    public void setLexiconLabels(List<String> lexiconLabels) {
        this.lexiconLabels = lexiconLabels;
    }

    public DetectLabels withLexiconInternalLabels(List<String> lexiconInternalLabels) {
        this.lexiconInternalLabels = lexiconInternalLabels;
        return this;
    }

    public DetectLabels addLexiconInternalLabelsItem(String lexiconInternalLabelsItem) {
        if (this.lexiconInternalLabels == null) {
            this.lexiconInternalLabels = new ArrayList<>();
        }
        this.lexiconInternalLabels.add(lexiconInternalLabelsItem);
        return this;
    }

    public DetectLabels withLexiconInternalLabels(Consumer<List<String>> lexiconInternalLabelsSetter) {
        if (this.lexiconInternalLabels == null) {
            this.lexiconInternalLabels = new ArrayList<>();
        }
        lexiconInternalLabelsSetter.accept(this.lexiconInternalLabels);
        return this;
    }

    /**
     * 内置词库检测标签列表
     * @return lexiconInternalLabels
     */
    public List<String> getLexiconInternalLabels() {
        return lexiconInternalLabels;
    }

    public void setLexiconInternalLabels(List<String> lexiconInternalLabels) {
        this.lexiconInternalLabels = lexiconInternalLabels;
    }

    public DetectLabels withSupportedLanguageLabels(List<String> supportedLanguageLabels) {
        this.supportedLanguageLabels = supportedLanguageLabels;
        return this;
    }

    public DetectLabels addSupportedLanguageLabelsItem(String supportedLanguageLabelsItem) {
        if (this.supportedLanguageLabels == null) {
            this.supportedLanguageLabels = new ArrayList<>();
        }
        this.supportedLanguageLabels.add(supportedLanguageLabelsItem);
        return this;
    }

    public DetectLabels withSupportedLanguageLabels(Consumer<List<String>> supportedLanguageLabelsSetter) {
        if (this.supportedLanguageLabels == null) {
            this.supportedLanguageLabels = new ArrayList<>();
        }
        supportedLanguageLabelsSetter.accept(this.supportedLanguageLabels);
        return this;
    }

    /**
     * 支持检测语言标签列表
     * @return supportedLanguageLabels
     */
    public List<String> getSupportedLanguageLabels() {
        return supportedLanguageLabels;
    }

    public void setSupportedLanguageLabels(List<String> supportedLanguageLabels) {
        this.supportedLanguageLabels = supportedLanguageLabels;
    }

    public DetectLabels withPiiLabels(List<String> piiLabels) {
        this.piiLabels = piiLabels;
        return this;
    }

    public DetectLabels addPiiLabelsItem(String piiLabelsItem) {
        if (this.piiLabels == null) {
            this.piiLabels = new ArrayList<>();
        }
        this.piiLabels.add(piiLabelsItem);
        return this;
    }

    public DetectLabels withPiiLabels(Consumer<List<String>> piiLabelsSetter) {
        if (this.piiLabels == null) {
            this.piiLabels = new ArrayList<>();
        }
        piiLabelsSetter.accept(this.piiLabels);
        return this;
    }

    /**
     * 敏感词标签列表
     * @return piiLabels
     */
    public List<String> getPiiLabels() {
        return piiLabels;
    }

    public void setPiiLabels(List<String> piiLabels) {
        this.piiLabels = piiLabels;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DetectLabels that = (DetectLabels) obj;
        return Objects.equals(this.complianceLabels, that.complianceLabels)
            && Objects.equals(this.injectLabels, that.injectLabels)
            && Objects.equals(this.immunityLexiconLabels, that.immunityLexiconLabels)
            && Objects.equals(this.lexiconLabels, that.lexiconLabels)
            && Objects.equals(this.lexiconInternalLabels, that.lexiconInternalLabels)
            && Objects.equals(this.supportedLanguageLabels, that.supportedLanguageLabels)
            && Objects.equals(this.piiLabels, that.piiLabels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(complianceLabels,
            injectLabels,
            immunityLexiconLabels,
            lexiconLabels,
            lexiconInternalLabels,
            supportedLanguageLabels,
            piiLabels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DetectLabels {\n");
        sb.append("    complianceLabels: ").append(toIndentedString(complianceLabels)).append("\n");
        sb.append("    injectLabels: ").append(toIndentedString(injectLabels)).append("\n");
        sb.append("    immunityLexiconLabels: ").append(toIndentedString(immunityLexiconLabels)).append("\n");
        sb.append("    lexiconLabels: ").append(toIndentedString(lexiconLabels)).append("\n");
        sb.append("    lexiconInternalLabels: ").append(toIndentedString(lexiconInternalLabels)).append("\n");
        sb.append("    supportedLanguageLabels: ").append(toIndentedString(supportedLanguageLabels)).append("\n");
        sb.append("    piiLabels: ").append(toIndentedString(piiLabels)).append("\n");
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
