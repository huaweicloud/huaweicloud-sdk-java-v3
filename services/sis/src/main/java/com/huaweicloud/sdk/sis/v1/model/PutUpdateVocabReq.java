package com.huaweicloud.sdk.sis.v1.model;

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
 * 
 */
public class PutUpdateVocabReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /** 热词表语言类型。 language取值范围： chinese_mandarin 汉语普通话 */
    public static final class LanguageEnum {

        /** Enum CHINESE_MANDARIN for value: "chinese_mandarin" */
        public static final LanguageEnum CHINESE_MANDARIN = new LanguageEnum("chinese_mandarin");

        private static final Map<String, LanguageEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LanguageEnum> createStaticFields() {
            Map<String, LanguageEnum> map = new HashMap<>();
            map.put("chinese_mandarin", CHINESE_MANDARIN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LanguageEnum(String value) {
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
        public static LanguageEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            LanguageEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new LanguageEnum(value);
            }
            return result;
        }

        public static LanguageEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            LanguageEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LanguageEnum) {
                return this.value.equals(((LanguageEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private LanguageEnum language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contents")

    private List<String> contents = null;

    public PutUpdateVocabReq withName(String name) {
        this.name = name;
        return this;
    }

    /** 热词表名，不可重复。内容限制为字母，数字，下中划线和井号，长度不超过32字节。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PutUpdateVocabReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 热词表描述，长度不超过255字节。
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PutUpdateVocabReq withLanguage(LanguageEnum language) {
        this.language = language;
        return this;
    }

    /** 热词表语言类型。 language取值范围： chinese_mandarin 汉语普通话
     * 
     * @return language */
    public LanguageEnum getLanguage() {
        return language;
    }

    public void setLanguage(LanguageEnum language) {
        this.language = language;
    }

    public PutUpdateVocabReq withContents(List<String> contents) {
        this.contents = contents;
        return this;
    }

    public PutUpdateVocabReq addContentsItem(String contentsItem) {
        if (this.contents == null) {
            this.contents = new ArrayList<>();
        }
        this.contents.add(contentsItem);
        return this;
    }

    public PutUpdateVocabReq withContents(Consumer<List<String>> contentsSetter) {
        if (this.contents == null) {
            this.contents = new ArrayList<>();
        }
        contentsSetter.accept(this.contents);
        return this;
    }

    /** 支持中英混编热词，单个热词只能由英文字母和unicode编码的汉字组成，不能有其他符号，包括空格。 单词库支持热词数上限1024。 单个热词长度上限32字节。
     * 
     * @return contents */
    public List<String> getContents() {
        return contents;
    }

    public void setContents(List<String> contents) {
        this.contents = contents;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PutUpdateVocabReq putUpdateVocabReq = (PutUpdateVocabReq) o;
        return Objects.equals(this.name, putUpdateVocabReq.name)
            && Objects.equals(this.description, putUpdateVocabReq.description)
            && Objects.equals(this.language, putUpdateVocabReq.language)
            && Objects.equals(this.contents, putUpdateVocabReq.contents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, language, contents);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutUpdateVocabReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
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
