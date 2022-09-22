package com.huaweicloud.sdk.moderation.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 图文审核场景的黑白词库传入参数设置。
 */
public class ImgTextConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "black_glossary_names")

    private List<String> blackGlossaryNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "white_glossary_names")

    private List<String> whiteGlossaryNames = null;

    public ImgTextConfig withBlackGlossaryNames(List<String> blackGlossaryNames) {
        this.blackGlossaryNames = blackGlossaryNames;
        return this;
    }

    public ImgTextConfig addBlackGlossaryNamesItem(String blackGlossaryNamesItem) {
        if (this.blackGlossaryNames == null) {
            this.blackGlossaryNames = new ArrayList<>();
        }
        this.blackGlossaryNames.add(blackGlossaryNamesItem);
        return this;
    }

    public ImgTextConfig withBlackGlossaryNames(Consumer<List<String>> blackGlossaryNamesSetter) {
        if (this.blackGlossaryNames == null) {
            this.blackGlossaryNames = new ArrayList<>();
        }
        blackGlossaryNamesSetter.accept(this.blackGlossaryNames);
        return this;
    }

    /**
     * 用户输入的console界面自定义的黑词库名，支持传入多个。
     * @return blackGlossaryNames
     */
    public List<String> getBlackGlossaryNames() {
        return blackGlossaryNames;
    }

    public void setBlackGlossaryNames(List<String> blackGlossaryNames) {
        this.blackGlossaryNames = blackGlossaryNames;
    }

    public ImgTextConfig withWhiteGlossaryNames(List<String> whiteGlossaryNames) {
        this.whiteGlossaryNames = whiteGlossaryNames;
        return this;
    }

    public ImgTextConfig addWhiteGlossaryNamesItem(String whiteGlossaryNamesItem) {
        if (this.whiteGlossaryNames == null) {
            this.whiteGlossaryNames = new ArrayList<>();
        }
        this.whiteGlossaryNames.add(whiteGlossaryNamesItem);
        return this;
    }

    public ImgTextConfig withWhiteGlossaryNames(Consumer<List<String>> whiteGlossaryNamesSetter) {
        if (this.whiteGlossaryNames == null) {
            this.whiteGlossaryNames = new ArrayList<>();
        }
        whiteGlossaryNamesSetter.accept(this.whiteGlossaryNames);
        return this;
    }

    /**
     * 用户输入的console界面自定义的白词库名，支持传入多个。
     * @return whiteGlossaryNames
     */
    public List<String> getWhiteGlossaryNames() {
        return whiteGlossaryNames;
    }

    public void setWhiteGlossaryNames(List<String> whiteGlossaryNames) {
        this.whiteGlossaryNames = whiteGlossaryNames;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImgTextConfig imgTextConfig = (ImgTextConfig) o;
        return Objects.equals(this.blackGlossaryNames, imgTextConfig.blackGlossaryNames)
            && Objects.equals(this.whiteGlossaryNames, imgTextConfig.whiteGlossaryNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blackGlossaryNames, whiteGlossaryNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImgTextConfig {\n");
        sb.append("    blackGlossaryNames: ").append(toIndentedString(blackGlossaryNames)).append("\n");
        sb.append("    whiteGlossaryNames: ").append(toIndentedString(whiteGlossaryNames)).append("\n");
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
