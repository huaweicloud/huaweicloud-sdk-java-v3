package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建热词表请求。
 */
public class CreateAsrVocabularyReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vocabulary_type")

    private AsrVocabularyTypeEnum vocabularyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private LanguageEnum language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mobvoi_vocabulary")

    private MobvoiVocabulary mobvoiVocabulary;

    public CreateAsrVocabularyReq withVocabularyType(AsrVocabularyTypeEnum vocabularyType) {
        this.vocabularyType = vocabularyType;
        return this;
    }

    /**
     * Get vocabularyType
     * @return vocabularyType
     */
    public AsrVocabularyTypeEnum getVocabularyType() {
        return vocabularyType;
    }

    public void setVocabularyType(AsrVocabularyTypeEnum vocabularyType) {
        this.vocabularyType = vocabularyType;
    }

    public CreateAsrVocabularyReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 奇妙问热词表名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateAsrVocabularyReq withLanguage(LanguageEnum language) {
        this.language = language;
        return this;
    }

    /**
     * Get language
     * @return language
     */
    public LanguageEnum getLanguage() {
        return language;
    }

    public void setLanguage(LanguageEnum language) {
        this.language = language;
    }

    public CreateAsrVocabularyReq withMobvoiVocabulary(MobvoiVocabulary mobvoiVocabulary) {
        this.mobvoiVocabulary = mobvoiVocabulary;
        return this;
    }

    public CreateAsrVocabularyReq withMobvoiVocabulary(Consumer<MobvoiVocabulary> mobvoiVocabularySetter) {
        if (this.mobvoiVocabulary == null) {
            this.mobvoiVocabulary = new MobvoiVocabulary();
            mobvoiVocabularySetter.accept(this.mobvoiVocabulary);
        }

        return this;
    }

    /**
     * Get mobvoiVocabulary
     * @return mobvoiVocabulary
     */
    public MobvoiVocabulary getMobvoiVocabulary() {
        return mobvoiVocabulary;
    }

    public void setMobvoiVocabulary(MobvoiVocabulary mobvoiVocabulary) {
        this.mobvoiVocabulary = mobvoiVocabulary;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAsrVocabularyReq that = (CreateAsrVocabularyReq) obj;
        return Objects.equals(this.vocabularyType, that.vocabularyType) && Objects.equals(this.name, that.name)
            && Objects.equals(this.language, that.language)
            && Objects.equals(this.mobvoiVocabulary, that.mobvoiVocabulary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vocabularyType, name, language, mobvoiVocabulary);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAsrVocabularyReq {\n");
        sb.append("    vocabularyType: ").append(toIndentedString(vocabularyType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    mobvoiVocabulary: ").append(toIndentedString(mobvoiVocabulary)).append("\n");
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
