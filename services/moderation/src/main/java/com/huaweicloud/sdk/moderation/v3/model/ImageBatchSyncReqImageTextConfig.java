package com.huaweicloud.sdk.moderation.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 图文审核黑白词库配置。
 */
public class ImageBatchSyncReqImageTextConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "black_glossary_names")

    private List<String> blackGlossaryNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "white_glossary_names")

    private List<String> whiteGlossaryNames = null;

    public ImageBatchSyncReqImageTextConfig withBlackGlossaryNames(List<String> blackGlossaryNames) {
        this.blackGlossaryNames = blackGlossaryNames;
        return this;
    }

    public ImageBatchSyncReqImageTextConfig addBlackGlossaryNamesItem(String blackGlossaryNamesItem) {
        if (this.blackGlossaryNames == null) {
            this.blackGlossaryNames = new ArrayList<>();
        }
        this.blackGlossaryNames.add(blackGlossaryNamesItem);
        return this;
    }

    public ImageBatchSyncReqImageTextConfig withBlackGlossaryNames(Consumer<List<String>> blackGlossaryNamesSetter) {
        if (this.blackGlossaryNames == null) {
            this.blackGlossaryNames = new ArrayList<>();
        }
        blackGlossaryNamesSetter.accept(this.blackGlossaryNames);
        return this;
    }

    /**
     * 检测时使用的自定义黑名单词库列表。
     * @return blackGlossaryNames
     */
    public List<String> getBlackGlossaryNames() {
        return blackGlossaryNames;
    }

    public void setBlackGlossaryNames(List<String> blackGlossaryNames) {
        this.blackGlossaryNames = blackGlossaryNames;
    }

    public ImageBatchSyncReqImageTextConfig withWhiteGlossaryNames(List<String> whiteGlossaryNames) {
        this.whiteGlossaryNames = whiteGlossaryNames;
        return this;
    }

    public ImageBatchSyncReqImageTextConfig addWhiteGlossaryNamesItem(String whiteGlossaryNamesItem) {
        if (this.whiteGlossaryNames == null) {
            this.whiteGlossaryNames = new ArrayList<>();
        }
        this.whiteGlossaryNames.add(whiteGlossaryNamesItem);
        return this;
    }

    public ImageBatchSyncReqImageTextConfig withWhiteGlossaryNames(Consumer<List<String>> whiteGlossaryNamesSetter) {
        if (this.whiteGlossaryNames == null) {
            this.whiteGlossaryNames = new ArrayList<>();
        }
        whiteGlossaryNamesSetter.accept(this.whiteGlossaryNames);
        return this;
    }

    /**
     * 检测时使用的自定义白名单词库列表。
     * @return whiteGlossaryNames
     */
    public List<String> getWhiteGlossaryNames() {
        return whiteGlossaryNames;
    }

    public void setWhiteGlossaryNames(List<String> whiteGlossaryNames) {
        this.whiteGlossaryNames = whiteGlossaryNames;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageBatchSyncReqImageTextConfig that = (ImageBatchSyncReqImageTextConfig) obj;
        return Objects.equals(this.blackGlossaryNames, that.blackGlossaryNames)
            && Objects.equals(this.whiteGlossaryNames, that.whiteGlossaryNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blackGlossaryNames, whiteGlossaryNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageBatchSyncReqImageTextConfig {\n");
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
