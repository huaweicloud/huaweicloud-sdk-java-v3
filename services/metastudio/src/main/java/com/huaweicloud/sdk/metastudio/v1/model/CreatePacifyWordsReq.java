package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建安抚话术请求。
 */
public class CreatePacifyWordsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "robot_id")

    private String robotId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pacify_words_type")

    private Integer pacifyWordsType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "intent")

    private String intent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pacify_words")

    private String pacifyWords;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private LanguageEnum language;

    public CreatePacifyWordsReq withRobotId(String robotId) {
        this.robotId = robotId;
        return this;
    }

    /**
     * 应用ID。
     * @return robotId
     */
    public String getRobotId() {
        return robotId;
    }

    public void setRobotId(String robotId) {
        this.robotId = robotId;
    }

    public CreatePacifyWordsReq withPacifyWordsType(Integer pacifyWordsType) {
        this.pacifyWordsType = pacifyWordsType;
        return this;
    }

    /**
     * 安抚话术类型 > 0:通用安抚话术, 1:意图匹配安抚话术
     * minimum: 0
     * maximum: 32
     * @return pacifyWordsType
     */
    public Integer getPacifyWordsType() {
        return pacifyWordsType;
    }

    public void setPacifyWordsType(Integer pacifyWordsType) {
        this.pacifyWordsType = pacifyWordsType;
    }

    public CreatePacifyWordsReq withIntent(String intent) {
        this.intent = intent;
        return this;
    }

    /**
     * 意图名称
     * @return intent
     */
    public String getIntent() {
        return intent;
    }

    public void setIntent(String intent) {
        this.intent = intent;
    }

    public CreatePacifyWordsReq withPacifyWords(String pacifyWords) {
        this.pacifyWords = pacifyWords;
        return this;
    }

    /**
     * 安抚话术。
     * @return pacifyWords
     */
    public String getPacifyWords() {
        return pacifyWords;
    }

    public void setPacifyWords(String pacifyWords) {
        this.pacifyWords = pacifyWords;
    }

    public CreatePacifyWordsReq withLanguage(LanguageEnum language) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreatePacifyWordsReq that = (CreatePacifyWordsReq) obj;
        return Objects.equals(this.robotId, that.robotId) && Objects.equals(this.pacifyWordsType, that.pacifyWordsType)
            && Objects.equals(this.intent, that.intent) && Objects.equals(this.pacifyWords, that.pacifyWords)
            && Objects.equals(this.language, that.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(robotId, pacifyWordsType, intent, pacifyWords, language);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePacifyWordsReq {\n");
        sb.append("    robotId: ").append(toIndentedString(robotId)).append("\n");
        sb.append("    pacifyWordsType: ").append(toIndentedString(pacifyWordsType)).append("\n");
        sb.append("    intent: ").append(toIndentedString(intent)).append("\n");
        sb.append("    pacifyWords: ").append(toIndentedString(pacifyWords)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
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
