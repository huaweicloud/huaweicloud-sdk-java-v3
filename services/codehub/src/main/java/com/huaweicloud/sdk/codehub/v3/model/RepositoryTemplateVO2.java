package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RepositoryTemplateVO2
 */
public class RepositoryTemplateVO2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_type")

    private String templateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code_title")

    private String codeTitle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_name")

    private String creatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code_description")

    private String codeDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "languages")

    private List<String> languages = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plateform")

    private List<String> plateform = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entertype")

    private List<String> entertype = null;

    public RepositoryTemplateVO2 withTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }

    /**
     * 模板类型
     * @return templateType
     */
    public String getTemplateType() {
        return templateType;
    }

    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    public RepositoryTemplateVO2 withCodeTitle(String codeTitle) {
        this.codeTitle = codeTitle;
        return this;
    }

    /**
     * 代码模板名称
     * @return codeTitle
     */
    public String getCodeTitle() {
        return codeTitle;
    }

    public void setCodeTitle(String codeTitle) {
        this.codeTitle = codeTitle;
    }

    public RepositoryTemplateVO2 withCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    /**
     * 创建者名称
     * @return creatorName
     */
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public RepositoryTemplateVO2 withCodeDescription(String codeDescription) {
        this.codeDescription = codeDescription;
        return this;
    }

    /**
     * 代码模板描述
     * @return codeDescription
     */
    public String getCodeDescription() {
        return codeDescription;
    }

    public void setCodeDescription(String codeDescription) {
        this.codeDescription = codeDescription;
    }

    public RepositoryTemplateVO2 withLanguages(List<String> languages) {
        this.languages = languages;
        return this;
    }

    public RepositoryTemplateVO2 addLanguagesItem(String languagesItem) {
        if (this.languages == null) {
            this.languages = new ArrayList<>();
        }
        this.languages.add(languagesItem);
        return this;
    }

    public RepositoryTemplateVO2 withLanguages(Consumer<List<String>> languagesSetter) {
        if (this.languages == null) {
            this.languages = new ArrayList<>();
        }
        languagesSetter.accept(this.languages);
        return this;
    }

    /**
     * 模板语言
     * @return languages
     */
    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public RepositoryTemplateVO2 withPlateform(List<String> plateform) {
        this.plateform = plateform;
        return this;
    }

    public RepositoryTemplateVO2 addPlateformItem(String plateformItem) {
        if (this.plateform == null) {
            this.plateform = new ArrayList<>();
        }
        this.plateform.add(plateformItem);
        return this;
    }

    public RepositoryTemplateVO2 withPlateform(Consumer<List<String>> plateformSetter) {
        if (this.plateform == null) {
            this.plateform = new ArrayList<>();
        }
        plateformSetter.accept(this.plateform);
        return this;
    }

    /**
     * 模板平台
     * @return plateform
     */
    public List<String> getPlateform() {
        return plateform;
    }

    public void setPlateform(List<String> plateform) {
        this.plateform = plateform;
    }

    public RepositoryTemplateVO2 withEntertype(List<String> entertype) {
        this.entertype = entertype;
        return this;
    }

    public RepositoryTemplateVO2 addEntertypeItem(String entertypeItem) {
        if (this.entertype == null) {
            this.entertype = new ArrayList<>();
        }
        this.entertype.add(entertypeItem);
        return this;
    }

    public RepositoryTemplateVO2 withEntertype(Consumer<List<String>> entertypeSetter) {
        if (this.entertype == null) {
            this.entertype = new ArrayList<>();
        }
        entertypeSetter.accept(this.entertype);
        return this;
    }

    /**
     * 模板类型
     * @return entertype
     */
    public List<String> getEntertype() {
        return entertype;
    }

    public void setEntertype(List<String> entertype) {
        this.entertype = entertype;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RepositoryTemplateVO2 that = (RepositoryTemplateVO2) obj;
        return Objects.equals(this.templateType, that.templateType) && Objects.equals(this.codeTitle, that.codeTitle)
            && Objects.equals(this.creatorName, that.creatorName)
            && Objects.equals(this.codeDescription, that.codeDescription)
            && Objects.equals(this.languages, that.languages) && Objects.equals(this.plateform, that.plateform)
            && Objects.equals(this.entertype, that.entertype);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateType, codeTitle, creatorName, codeDescription, languages, plateform, entertype);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryTemplateVO2 {\n");
        sb.append("    templateType: ").append(toIndentedString(templateType)).append("\n");
        sb.append("    codeTitle: ").append(toIndentedString(codeTitle)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
        sb.append("    codeDescription: ").append(toIndentedString(codeDescription)).append("\n");
        sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
        sb.append("    plateform: ").append(toIndentedString(plateform)).append("\n");
        sb.append("    entertype: ").append(toIndentedString(entertype)).append("\n");
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
