package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SubtitleModifyReq
 */
public class SubtitleModifyReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_id")

    private String assetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_language")

    private String defaultLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add_subtitles")

    private List<AddSubtitle> addSubtitles = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_subtitles")

    private List<DeleteSubtitle> deleteSubtitles = null;

    public SubtitleModifyReq withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * 媒资ID
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public SubtitleModifyReq withDefaultLanguage(String defaultLanguage) {
        this.defaultLanguage = defaultLanguage;
        return this;
    }

    /**
     * 字幕默认语言(字幕必须存在)
     * @return defaultLanguage
     */
    public String getDefaultLanguage() {
        return defaultLanguage;
    }

    public void setDefaultLanguage(String defaultLanguage) {
        this.defaultLanguage = defaultLanguage;
    }

    public SubtitleModifyReq withAddSubtitles(List<AddSubtitle> addSubtitles) {
        this.addSubtitles = addSubtitles;
        return this;
    }

    public SubtitleModifyReq addAddSubtitlesItem(AddSubtitle addSubtitlesItem) {
        if (this.addSubtitles == null) {
            this.addSubtitles = new ArrayList<>();
        }
        this.addSubtitles.add(addSubtitlesItem);
        return this;
    }

    public SubtitleModifyReq withAddSubtitles(Consumer<List<AddSubtitle>> addSubtitlesSetter) {
        if (this.addSubtitles == null) {
            this.addSubtitles = new ArrayList<>();
        }
        addSubtitlesSetter.accept(this.addSubtitles);
        return this;
    }

    /**
     * 需新增或修改的字幕
     * @return addSubtitles
     */
    public List<AddSubtitle> getAddSubtitles() {
        return addSubtitles;
    }

    public void setAddSubtitles(List<AddSubtitle> addSubtitles) {
        this.addSubtitles = addSubtitles;
    }

    public SubtitleModifyReq withDeleteSubtitles(List<DeleteSubtitle> deleteSubtitles) {
        this.deleteSubtitles = deleteSubtitles;
        return this;
    }

    public SubtitleModifyReq addDeleteSubtitlesItem(DeleteSubtitle deleteSubtitlesItem) {
        if (this.deleteSubtitles == null) {
            this.deleteSubtitles = new ArrayList<>();
        }
        this.deleteSubtitles.add(deleteSubtitlesItem);
        return this;
    }

    public SubtitleModifyReq withDeleteSubtitles(Consumer<List<DeleteSubtitle>> deleteSubtitlesSetter) {
        if (this.deleteSubtitles == null) {
            this.deleteSubtitles = new ArrayList<>();
        }
        deleteSubtitlesSetter.accept(this.deleteSubtitles);
        return this;
    }

    /**
     * 需删除的字幕，language不能与add_subtitles重复
     * @return deleteSubtitles
     */
    public List<DeleteSubtitle> getDeleteSubtitles() {
        return deleteSubtitles;
    }

    public void setDeleteSubtitles(List<DeleteSubtitle> deleteSubtitles) {
        this.deleteSubtitles = deleteSubtitles;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubtitleModifyReq that = (SubtitleModifyReq) obj;
        return Objects.equals(this.assetId, that.assetId) && Objects.equals(this.defaultLanguage, that.defaultLanguage)
            && Objects.equals(this.addSubtitles, that.addSubtitles)
            && Objects.equals(this.deleteSubtitles, that.deleteSubtitles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetId, defaultLanguage, addSubtitles, deleteSubtitles);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubtitleModifyReq {\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    defaultLanguage: ").append(toIndentedString(defaultLanguage)).append("\n");
        sb.append("    addSubtitles: ").append(toIndentedString(addSubtitles)).append("\n");
        sb.append("    deleteSubtitles: ").append(toIndentedString(deleteSubtitles)).append("\n");
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
