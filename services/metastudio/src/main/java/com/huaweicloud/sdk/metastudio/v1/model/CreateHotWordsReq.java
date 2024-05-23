package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建热词请求。
 */
public class CreateHotWordsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hot_words_type")

    private HotWordsTypeEnum hotWordsType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "robot_id")

    private String robotId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sis_hot_words")

    private CreateSisHotWords sisHotWords;

    public CreateHotWordsReq withHotWordsType(HotWordsTypeEnum hotWordsType) {
        this.hotWordsType = hotWordsType;
        return this;
    }

    /**
     * Get hotWordsType
     * @return hotWordsType
     */
    public HotWordsTypeEnum getHotWordsType() {
        return hotWordsType;
    }

    public void setHotWordsType(HotWordsTypeEnum hotWordsType) {
        this.hotWordsType = hotWordsType;
    }

    public CreateHotWordsReq withRobotId(String robotId) {
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

    public CreateHotWordsReq withSisHotWords(CreateSisHotWords sisHotWords) {
        this.sisHotWords = sisHotWords;
        return this;
    }

    public CreateHotWordsReq withSisHotWords(Consumer<CreateSisHotWords> sisHotWordsSetter) {
        if (this.sisHotWords == null) {
            this.sisHotWords = new CreateSisHotWords();
            sisHotWordsSetter.accept(this.sisHotWords);
        }

        return this;
    }

    /**
     * Get sisHotWords
     * @return sisHotWords
     */
    public CreateSisHotWords getSisHotWords() {
        return sisHotWords;
    }

    public void setSisHotWords(CreateSisHotWords sisHotWords) {
        this.sisHotWords = sisHotWords;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateHotWordsReq that = (CreateHotWordsReq) obj;
        return Objects.equals(this.hotWordsType, that.hotWordsType) && Objects.equals(this.robotId, that.robotId)
            && Objects.equals(this.sisHotWords, that.sisHotWords);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hotWordsType, robotId, sisHotWords);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateHotWordsReq {\n");
        sb.append("    hotWordsType: ").append(toIndentedString(hotWordsType)).append("\n");
        sb.append("    robotId: ").append(toIndentedString(robotId)).append("\n");
        sb.append("    sisHotWords: ").append(toIndentedString(sisHotWords)).append("\n");
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
