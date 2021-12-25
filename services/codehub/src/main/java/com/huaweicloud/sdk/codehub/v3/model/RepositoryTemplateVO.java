package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** RepositoryTemplateVO */
public class RepositoryTemplateVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "templateType")

    private String templateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "codeTitle")

    private String codeTitle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creatorName")

    private String creatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "codeDescription")

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

    public RepositoryTemplateVO withTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }

    /** 模板类型
     * 
     * @return templateType */
    public String getTemplateType() {
        return templateType;
    }

    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    public RepositoryTemplateVO withCodeTitle(String codeTitle) {
        this.codeTitle = codeTitle;
        return this;
    }

    /** 代码模板名称
     * 
     * @return codeTitle */
    public String getCodeTitle() {
        return codeTitle;
    }

    public void setCodeTitle(String codeTitle) {
        this.codeTitle = codeTitle;
    }

    public RepositoryTemplateVO withCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    /** 创建者名称
     * 
     * @return creatorName */
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public RepositoryTemplateVO withCodeDescription(String codeDescription) {
        this.codeDescription = codeDescription;
        return this;
    }

    /** 代码模板描述
     * 
     * @return codeDescription */
    public String getCodeDescription() {
        return codeDescription;
    }

    public void setCodeDescription(String codeDescription) {
        this.codeDescription = codeDescription;
    }

    public RepositoryTemplateVO withLanguages(List<String> languages) {
        this.languages = languages;
        return this;
    }

    public RepositoryTemplateVO addLanguagesItem(String languagesItem) {
        if (this.languages == null) {
            this.languages = new ArrayList<>();
        }
        this.languages.add(languagesItem);
        return this;
    }

    public RepositoryTemplateVO withLanguages(Consumer<List<String>> languagesSetter) {
        if (this.languages == null) {
            this.languages = new ArrayList<>();
        }
        languagesSetter.accept(this.languages);
        return this;
    }

    /** 模板语言
     * 
     * @return languages */
    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public RepositoryTemplateVO withPlateform(List<String> plateform) {
        this.plateform = plateform;
        return this;
    }

    public RepositoryTemplateVO addPlateformItem(String plateformItem) {
        if (this.plateform == null) {
            this.plateform = new ArrayList<>();
        }
        this.plateform.add(plateformItem);
        return this;
    }

    public RepositoryTemplateVO withPlateform(Consumer<List<String>> plateformSetter) {
        if (this.plateform == null) {
            this.plateform = new ArrayList<>();
        }
        plateformSetter.accept(this.plateform);
        return this;
    }

    /** 模板平台
     * 
     * @return plateform */
    public List<String> getPlateform() {
        return plateform;
    }

    public void setPlateform(List<String> plateform) {
        this.plateform = plateform;
    }

    public RepositoryTemplateVO withEntertype(List<String> entertype) {
        this.entertype = entertype;
        return this;
    }

    public RepositoryTemplateVO addEntertypeItem(String entertypeItem) {
        if (this.entertype == null) {
            this.entertype = new ArrayList<>();
        }
        this.entertype.add(entertypeItem);
        return this;
    }

    public RepositoryTemplateVO withEntertype(Consumer<List<String>> entertypeSetter) {
        if (this.entertype == null) {
            this.entertype = new ArrayList<>();
        }
        entertypeSetter.accept(this.entertype);
        return this;
    }

    /** 模板类型
     * 
     * @return entertype */
    public List<String> getEntertype() {
        return entertype;
    }

    public void setEntertype(List<String> entertype) {
        this.entertype = entertype;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepositoryTemplateVO repositoryTemplateVO = (RepositoryTemplateVO) o;
        return Objects.equals(this.templateType, repositoryTemplateVO.templateType)
            && Objects.equals(this.codeTitle, repositoryTemplateVO.codeTitle)
            && Objects.equals(this.creatorName, repositoryTemplateVO.creatorName)
            && Objects.equals(this.codeDescription, repositoryTemplateVO.codeDescription)
            && Objects.equals(this.languages, repositoryTemplateVO.languages)
            && Objects.equals(this.plateform, repositoryTemplateVO.plateform)
            && Objects.equals(this.entertype, repositoryTemplateVO.entertype);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateType, codeTitle, creatorName, codeDescription, languages, plateform, entertype);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryTemplateVO {\n");
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

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
