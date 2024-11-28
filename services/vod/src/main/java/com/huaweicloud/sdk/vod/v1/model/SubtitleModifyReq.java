package com.huaweicloud.sdk.vod.v1.model;

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
 * SubtitleModifyReq
 */
public class SubtitleModifyReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_id")

    private String assetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_language")

    private String defaultLanguage;

    /**
     * 外挂模式，不传默认取值为0  取值如下： -0：表示添加的字幕会外挂上历史产物 -1：表示添加的字幕不会外挂上历史产物
     */
    public static final class RepackageModeEnum {

        /**
         * Enum _0 for value: "0"
         */
        public static final RepackageModeEnum _0 = new RepackageModeEnum("0");

        /**
         * Enum _1 for value: "1"
         */
        public static final RepackageModeEnum _1 = new RepackageModeEnum("1");

        private static final Map<String, RepackageModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RepackageModeEnum> createStaticFields() {
            Map<String, RepackageModeEnum> map = new HashMap<>();
            map.put("0", _0);
            map.put("1", _1);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RepackageModeEnum(String value) {
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
        public static RepackageModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RepackageModeEnum(value));
        }

        public static RepackageModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RepackageModeEnum) {
                return this.value.equals(((RepackageModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repackage_mode")

    private RepackageModeEnum repackageMode;

    /**
     * 删除模式，不传默认取值为0  取值如下： -0：表示删除字幕会清除历史产物携带的字幕信息 -1：表示删除字幕不清除历史产物携带的字幕信息
     */
    public static final class DeleteModeEnum {

        /**
         * Enum _0 for value: "0"
         */
        public static final DeleteModeEnum _0 = new DeleteModeEnum("0");

        /**
         * Enum _1 for value: "1"
         */
        public static final DeleteModeEnum _1 = new DeleteModeEnum("1");

        private static final Map<String, DeleteModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DeleteModeEnum> createStaticFields() {
            Map<String, DeleteModeEnum> map = new HashMap<>();
            map.put("0", _0);
            map.put("1", _1);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DeleteModeEnum(String value) {
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
        public static DeleteModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DeleteModeEnum(value));
        }

        public static DeleteModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DeleteModeEnum) {
                return this.value.equals(((DeleteModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_mode")

    private DeleteModeEnum deleteMode;

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

    public SubtitleModifyReq withRepackageMode(RepackageModeEnum repackageMode) {
        this.repackageMode = repackageMode;
        return this;
    }

    /**
     * 外挂模式，不传默认取值为0  取值如下： -0：表示添加的字幕会外挂上历史产物 -1：表示添加的字幕不会外挂上历史产物
     * @return repackageMode
     */
    public RepackageModeEnum getRepackageMode() {
        return repackageMode;
    }

    public void setRepackageMode(RepackageModeEnum repackageMode) {
        this.repackageMode = repackageMode;
    }

    public SubtitleModifyReq withDeleteMode(DeleteModeEnum deleteMode) {
        this.deleteMode = deleteMode;
        return this;
    }

    /**
     * 删除模式，不传默认取值为0  取值如下： -0：表示删除字幕会清除历史产物携带的字幕信息 -1：表示删除字幕不清除历史产物携带的字幕信息
     * @return deleteMode
     */
    public DeleteModeEnum getDeleteMode() {
        return deleteMode;
    }

    public void setDeleteMode(DeleteModeEnum deleteMode) {
        this.deleteMode = deleteMode;
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
            && Objects.equals(this.repackageMode, that.repackageMode)
            && Objects.equals(this.deleteMode, that.deleteMode) && Objects.equals(this.addSubtitles, that.addSubtitles)
            && Objects.equals(this.deleteSubtitles, that.deleteSubtitles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetId, defaultLanguage, repackageMode, deleteMode, addSubtitles, deleteSubtitles);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubtitleModifyReq {\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    defaultLanguage: ").append(toIndentedString(defaultLanguage)).append("\n");
        sb.append("    repackageMode: ").append(toIndentedString(repackageMode)).append("\n");
        sb.append("    deleteMode: ").append(toIndentedString(deleteMode)).append("\n");
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
