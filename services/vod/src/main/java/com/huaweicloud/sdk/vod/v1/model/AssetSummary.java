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

/** 媒资总览 */
public class AssetSummary {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_id")

    private String assetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Integer duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Long size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "original_url")

    private String originalUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "covers")

    private List<CoverInfo> covers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    /** 媒资状态。 取值如下： - CREATING：上传中。 - FAILED：上传失败。 - CREATED：上传成功。 - PUBLISHED：已发布。 - DELETED：已删除。 */
    public static final class AssetStatusEnum {

        /** Enum CREATING for value: "CREATING" */
        public static final AssetStatusEnum CREATING = new AssetStatusEnum("CREATING");

        /** Enum FAILED for value: "FAILED" */
        public static final AssetStatusEnum FAILED = new AssetStatusEnum("FAILED");

        /** Enum CREATED for value: "CREATED" */
        public static final AssetStatusEnum CREATED = new AssetStatusEnum("CREATED");

        /** Enum PUBLISHED for value: "PUBLISHED" */
        public static final AssetStatusEnum PUBLISHED = new AssetStatusEnum("PUBLISHED");

        /** Enum DELETED for value: "DELETED" */
        public static final AssetStatusEnum DELETED = new AssetStatusEnum("DELETED");

        private static final Map<String, AssetStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AssetStatusEnum> createStaticFields() {
            Map<String, AssetStatusEnum> map = new HashMap<>();
            map.put("CREATING", CREATING);
            map.put("FAILED", FAILED);
            map.put("CREATED", CREATED);
            map.put("PUBLISHED", PUBLISHED);
            map.put("DELETED", DELETED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AssetStatusEnum(String value) {
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
        public static AssetStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            AssetStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AssetStatusEnum(value);
            }
            return result;
        }

        public static AssetStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            AssetStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AssetStatusEnum) {
                return this.value.equals(((AssetStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_status")

    private AssetStatusEnum assetStatus;

    /** 转码状态。 取值如下： - UN_TRANSCODE：未转码。 - WAITING_TRANSCODE：待转码 - TRANSCODING：转码中。 - TRANSCODE_SUCCEED：转码成功。 -
     * TRANSCODE_FAILED：转码失败。 */
    public static final class TranscodeStatusEnum {

        /** Enum UN_TRANSCODE for value: "UN_TRANSCODE" */
        public static final TranscodeStatusEnum UN_TRANSCODE = new TranscodeStatusEnum("UN_TRANSCODE");

        /** Enum WAITING_TRANSCODE for value: "WAITING_TRANSCODE" */
        public static final TranscodeStatusEnum WAITING_TRANSCODE = new TranscodeStatusEnum("WAITING_TRANSCODE");

        /** Enum TRANSCODING for value: "TRANSCODING" */
        public static final TranscodeStatusEnum TRANSCODING = new TranscodeStatusEnum("TRANSCODING");

        /** Enum TRANSCODE_SUCCEED for value: "TRANSCODE_SUCCEED" */
        public static final TranscodeStatusEnum TRANSCODE_SUCCEED = new TranscodeStatusEnum("TRANSCODE_SUCCEED");

        /** Enum TRANSCODE_FAILED for value: "TRANSCODE_FAILED" */
        public static final TranscodeStatusEnum TRANSCODE_FAILED = new TranscodeStatusEnum("TRANSCODE_FAILED");

        private static final Map<String, TranscodeStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TranscodeStatusEnum> createStaticFields() {
            Map<String, TranscodeStatusEnum> map = new HashMap<>();
            map.put("UN_TRANSCODE", UN_TRANSCODE);
            map.put("WAITING_TRANSCODE", WAITING_TRANSCODE);
            map.put("TRANSCODING", TRANSCODING);
            map.put("TRANSCODE_SUCCEED", TRANSCODE_SUCCEED);
            map.put("TRANSCODE_FAILED", TRANSCODE_FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TranscodeStatusEnum(String value) {
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
        public static TranscodeStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TranscodeStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TranscodeStatusEnum(value);
            }
            return result;
        }

        public static TranscodeStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TranscodeStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TranscodeStatusEnum) {
                return this.value.equals(((TranscodeStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transcode_status")

    private TranscodeStatusEnum transcodeStatus;

    /** 截图状态。 取值如下： - UN_THUMBNAIL：未截图。 - THUMBNAILING：截图中。 - THUMBNAIL_SUCCEED：截图成功。 - THUMBNAIL_FAILED：截图失败。 */
    public static final class ThumbnailStatusEnum {

        /** Enum UN_THUMBNAIL for value: "UN_THUMBNAIL" */
        public static final ThumbnailStatusEnum UN_THUMBNAIL = new ThumbnailStatusEnum("UN_THUMBNAIL");

        /** Enum THUMBNAILING for value: "THUMBNAILING" */
        public static final ThumbnailStatusEnum THUMBNAILING = new ThumbnailStatusEnum("THUMBNAILING");

        /** Enum THUMBNAIL_SUCCEED for value: "THUMBNAIL_SUCCEED" */
        public static final ThumbnailStatusEnum THUMBNAIL_SUCCEED = new ThumbnailStatusEnum("THUMBNAIL_SUCCEED");

        /** Enum THUMBNAIL_FAILED for value: "THUMBNAIL_FAILED" */
        public static final ThumbnailStatusEnum THUMBNAIL_FAILED = new ThumbnailStatusEnum("THUMBNAIL_FAILED");

        private static final Map<String, ThumbnailStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ThumbnailStatusEnum> createStaticFields() {
            Map<String, ThumbnailStatusEnum> map = new HashMap<>();
            map.put("UN_THUMBNAIL", UN_THUMBNAIL);
            map.put("THUMBNAILING", THUMBNAILING);
            map.put("THUMBNAIL_SUCCEED", THUMBNAIL_SUCCEED);
            map.put("THUMBNAIL_FAILED", THUMBNAIL_FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ThumbnailStatusEnum(String value) {
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
        public static ThumbnailStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ThumbnailStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ThumbnailStatusEnum(value);
            }
            return result;
        }

        public static ThumbnailStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ThumbnailStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ThumbnailStatusEnum) {
                return this.value.equals(((ThumbnailStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thumbnail_status")

    private ThumbnailStatusEnum thumbnailStatus;

    /** 内容审核状态 取值如下： - UN_REVIEW：未审核。 - REVIEWING：审核中。 - REVIEW_SUSPICIOUS：审核可疑，需要人工复审。 - REVIEW_PASSED：审核通过。 -
     * REVIEW_FAILED：审核失败。 - REVIEW_BLOCKED：已屏蔽。 */
    public static final class ReviewStatusEnum {

        /** Enum UN_REVIEW for value: "UN_REVIEW" */
        public static final ReviewStatusEnum UN_REVIEW = new ReviewStatusEnum("UN_REVIEW");

        /** Enum REVIEWING for value: "REVIEWING" */
        public static final ReviewStatusEnum REVIEWING = new ReviewStatusEnum("REVIEWING");

        /** Enum REVIEW_SUSPICIOUS for value: "REVIEW_SUSPICIOUS" */
        public static final ReviewStatusEnum REVIEW_SUSPICIOUS = new ReviewStatusEnum("REVIEW_SUSPICIOUS");

        /** Enum REVIEW_PASSED for value: "REVIEW_PASSED" */
        public static final ReviewStatusEnum REVIEW_PASSED = new ReviewStatusEnum("REVIEW_PASSED");

        /** Enum REVIEW_FAILED for value: "REVIEW_FAILED" */
        public static final ReviewStatusEnum REVIEW_FAILED = new ReviewStatusEnum("REVIEW_FAILED");

        /** Enum REVIEW_BLOCKED for value: "REVIEW_BLOCKED" */
        public static final ReviewStatusEnum REVIEW_BLOCKED = new ReviewStatusEnum("REVIEW_BLOCKED");

        private static final Map<String, ReviewStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ReviewStatusEnum> createStaticFields() {
            Map<String, ReviewStatusEnum> map = new HashMap<>();
            map.put("UN_REVIEW", UN_REVIEW);
            map.put("REVIEWING", REVIEWING);
            map.put("REVIEW_SUSPICIOUS", REVIEW_SUSPICIOUS);
            map.put("REVIEW_PASSED", REVIEW_PASSED);
            map.put("REVIEW_FAILED", REVIEW_FAILED);
            map.put("REVIEW_BLOCKED", REVIEW_BLOCKED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ReviewStatusEnum(String value) {
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
        public static ReviewStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ReviewStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ReviewStatusEnum(value);
            }
            return result;
        }

        public static ReviewStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ReviewStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ReviewStatusEnum) {
                return this.value.equals(((ReviewStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review_status")

    private ReviewStatusEnum reviewStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exec_desc")

    private String execDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "media_type")

    private String mediaType;

    public AssetSummary withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /** 媒资ID。
     * 
     * @return assetId */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public AssetSummary withTitle(String title) {
        this.title = title;
        return this;
    }

    /** 媒资标题。长度不超过128个字节，UTF-8编码。
     * 
     * @return title */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public AssetSummary withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 媒资描述。长度不超过1024个字节。
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AssetSummary withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /** 媒资时长。 单位：秒。
     * 
     * @return duration */
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public AssetSummary withSize(Long size) {
        this.size = size;
        return this;
    }

    /** 媒资大小。 单位：字节。
     * 
     * @return size */
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public AssetSummary withOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
        return this;
    }

    /** 原始播放url。
     * 
     * @return originalUrl */
    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public AssetSummary withCategory(String category) {
        this.category = category;
        return this;
    }

    /** 媒资分类名称。
     * 
     * @return category */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public AssetSummary withCovers(List<CoverInfo> covers) {
        this.covers = covers;
        return this;
    }

    public AssetSummary addCoversItem(CoverInfo coversItem) {
        if (this.covers == null) {
            this.covers = new ArrayList<>();
        }
        this.covers.add(coversItem);
        return this;
    }

    public AssetSummary withCovers(Consumer<List<CoverInfo>> coversSetter) {
        if (this.covers == null) {
            this.covers = new ArrayList<>();
        }
        coversSetter.accept(this.covers);
        return this;
    }

    /** 封面信息。
     * 
     * @return covers */
    public List<CoverInfo> getCovers() {
        return covers;
    }

    public void setCovers(List<CoverInfo> covers) {
        this.covers = covers;
    }

    public AssetSummary withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /** 媒资创建时间。 格式为yyyymmddhhmmss。必须是与时区无关的UTC时间。
     * 
     * @return createTime */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public AssetSummary withAssetStatus(AssetStatusEnum assetStatus) {
        this.assetStatus = assetStatus;
        return this;
    }

    /** 媒资状态。 取值如下： - CREATING：上传中。 - FAILED：上传失败。 - CREATED：上传成功。 - PUBLISHED：已发布。 - DELETED：已删除。
     * 
     * @return assetStatus */
    public AssetStatusEnum getAssetStatus() {
        return assetStatus;
    }

    public void setAssetStatus(AssetStatusEnum assetStatus) {
        this.assetStatus = assetStatus;
    }

    public AssetSummary withTranscodeStatus(TranscodeStatusEnum transcodeStatus) {
        this.transcodeStatus = transcodeStatus;
        return this;
    }

    /** 转码状态。 取值如下： - UN_TRANSCODE：未转码。 - WAITING_TRANSCODE：待转码 - TRANSCODING：转码中。 - TRANSCODE_SUCCEED：转码成功。 -
     * TRANSCODE_FAILED：转码失败。
     * 
     * @return transcodeStatus */
    public TranscodeStatusEnum getTranscodeStatus() {
        return transcodeStatus;
    }

    public void setTranscodeStatus(TranscodeStatusEnum transcodeStatus) {
        this.transcodeStatus = transcodeStatus;
    }

    public AssetSummary withThumbnailStatus(ThumbnailStatusEnum thumbnailStatus) {
        this.thumbnailStatus = thumbnailStatus;
        return this;
    }

    /** 截图状态。 取值如下： - UN_THUMBNAIL：未截图。 - THUMBNAILING：截图中。 - THUMBNAIL_SUCCEED：截图成功。 - THUMBNAIL_FAILED：截图失败。
     * 
     * @return thumbnailStatus */
    public ThumbnailStatusEnum getThumbnailStatus() {
        return thumbnailStatus;
    }

    public void setThumbnailStatus(ThumbnailStatusEnum thumbnailStatus) {
        this.thumbnailStatus = thumbnailStatus;
    }

    public AssetSummary withReviewStatus(ReviewStatusEnum reviewStatus) {
        this.reviewStatus = reviewStatus;
        return this;
    }

    /** 内容审核状态 取值如下： - UN_REVIEW：未审核。 - REVIEWING：审核中。 - REVIEW_SUSPICIOUS：审核可疑，需要人工复审。 - REVIEW_PASSED：审核通过。 -
     * REVIEW_FAILED：审核失败。 - REVIEW_BLOCKED：已屏蔽。
     * 
     * @return reviewStatus */
    public ReviewStatusEnum getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(ReviewStatusEnum reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    public AssetSummary withExecDesc(String execDesc) {
        this.execDesc = execDesc;
        return this;
    }

    /** 媒资的任务执行描述汇总。 示例： - asset_exec_desc: upload success，媒资任务执行描述信息。 - transcode_exec_desc: transcode
     * success，转码任务执行描述信息。 - thumbnail_exec_desc: thumbnail failed，截图任务执行描述信息。 - review_exec_desc: review
     * pass，审核任务执行描述信息。
     * 
     * @return execDesc */
    public String getExecDesc() {
        return execDesc;
    }

    public void setExecDesc(String execDesc) {
        this.execDesc = execDesc;
    }

    public AssetSummary withMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }

    /** 音视频文件的格式。 取值如下： - 视频文件格式：MP4、TS、MOV、MXF、MPG、FLV、WMV、AVI、M4V、F4V、MPEG -
     * 音频文件格式：MP3、OGG、WAV、WMA、APE、FLAC、AAC、AC3、MMF、AMR、M4A、M4R、WV、MP2
     * 
     * @return mediaType */
    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AssetSummary assetSummary = (AssetSummary) o;
        return Objects.equals(this.assetId, assetSummary.assetId) && Objects.equals(this.title, assetSummary.title)
            && Objects.equals(this.description, assetSummary.description)
            && Objects.equals(this.duration, assetSummary.duration) && Objects.equals(this.size, assetSummary.size)
            && Objects.equals(this.originalUrl, assetSummary.originalUrl)
            && Objects.equals(this.category, assetSummary.category) && Objects.equals(this.covers, assetSummary.covers)
            && Objects.equals(this.createTime, assetSummary.createTime)
            && Objects.equals(this.assetStatus, assetSummary.assetStatus)
            && Objects.equals(this.transcodeStatus, assetSummary.transcodeStatus)
            && Objects.equals(this.thumbnailStatus, assetSummary.thumbnailStatus)
            && Objects.equals(this.reviewStatus, assetSummary.reviewStatus)
            && Objects.equals(this.execDesc, assetSummary.execDesc)
            && Objects.equals(this.mediaType, assetSummary.mediaType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetId,
            title,
            description,
            duration,
            size,
            originalUrl,
            category,
            covers,
            createTime,
            assetStatus,
            transcodeStatus,
            thumbnailStatus,
            reviewStatus,
            execDesc,
            mediaType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssetSummary {\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    originalUrl: ").append(toIndentedString(originalUrl)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    covers: ").append(toIndentedString(covers)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    assetStatus: ").append(toIndentedString(assetStatus)).append("\n");
        sb.append("    transcodeStatus: ").append(toIndentedString(transcodeStatus)).append("\n");
        sb.append("    thumbnailStatus: ").append(toIndentedString(thumbnailStatus)).append("\n");
        sb.append("    reviewStatus: ").append(toIndentedString(reviewStatus)).append("\n");
        sb.append("    execDesc: ").append(toIndentedString(execDesc)).append("\n");
        sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
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
