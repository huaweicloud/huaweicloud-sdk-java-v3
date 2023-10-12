package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateCnfReq
 */
public class CreateCnfReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confContent")

    private String confContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "setting")

    private Setting setting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sensitive_words")

    private List<String> sensitiveWords = null;

    public CreateCnfReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 配置文件名称。4～32个字符，只能包含数字、字母、中划线和下划线，且必须以字母开头。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateCnfReq withConfContent(String confContent) {
        this.confContent = confContent;
        return this;
    }

    /**
     * 配置文件内容。
     * @return confContent
     */
    public String getConfContent() {
        return confContent;
    }

    public void setConfContent(String confContent) {
        this.confContent = confContent;
    }

    public CreateCnfReq withSetting(Setting setting) {
        this.setting = setting;
        return this;
    }

    public CreateCnfReq withSetting(Consumer<Setting> settingSetter) {
        if (this.setting == null) {
            this.setting = new Setting();
            settingSetter.accept(this.setting);
        }

        return this;
    }

    /**
     * Get setting
     * @return setting
     */
    public Setting getSetting() {
        return setting;
    }

    public void setSetting(Setting setting) {
        this.setting = setting;
    }

    public CreateCnfReq withSensitiveWords(List<String> sensitiveWords) {
        this.sensitiveWords = sensitiveWords;
        return this;
    }

    public CreateCnfReq addSensitiveWordsItem(String sensitiveWordsItem) {
        if (this.sensitiveWords == null) {
            this.sensitiveWords = new ArrayList<>();
        }
        this.sensitiveWords.add(sensitiveWordsItem);
        return this;
    }

    public CreateCnfReq withSensitiveWords(Consumer<List<String>> sensitiveWordsSetter) {
        if (this.sensitiveWords == null) {
            this.sensitiveWords = new ArrayList<>();
        }
        sensitiveWordsSetter.accept(this.sensitiveWords);
        return this;
    }

    /**
     * 敏感字符替换 输入需要隐藏的敏感字串列表。配置隐藏字符串列表后，在返回的配置内容中，会将所有在列表中的字串隐藏为***（列表最大支持20条，单个字串最大长度512字节）
     * @return sensitiveWords
     */
    public List<String> getSensitiveWords() {
        return sensitiveWords;
    }

    public void setSensitiveWords(List<String> sensitiveWords) {
        this.sensitiveWords = sensitiveWords;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateCnfReq that = (CreateCnfReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.confContent, that.confContent)
            && Objects.equals(this.setting, that.setting) && Objects.equals(this.sensitiveWords, that.sensitiveWords);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, confContent, setting, sensitiveWords);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCnfReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    confContent: ").append(toIndentedString(confContent)).append("\n");
        sb.append("    setting: ").append(toIndentedString(setting)).append("\n");
        sb.append("    sensitiveWords: ").append(toIndentedString(sensitiveWords)).append("\n");
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
