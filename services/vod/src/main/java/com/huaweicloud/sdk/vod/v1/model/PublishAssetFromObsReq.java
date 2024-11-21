package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class PublishAssetFromObsReq {

    /**
     * 转存的音视频文件类型。  取值如下： - 视频文件：MP4、TS、MOV、MXF、MPG、FLV、WMV、AVI、M4V、F4V、MPEG、3GP、ASF、MKV、HLS - 音频文件：MP3、OGG、WAV、WMA、APE、FLAC、AAC、AC3、MMF、AMR、M4A、M4R、WV、MP2  若上传格式为音频文件，则不支持转码、添加水印和字幕。  > 当**video_type**选择HLS时，**storage_mode**（存储模式）需选择存储在租户桶，且输出路径设置为和输入路径在同一个目录。
     */
    public static final class VideoTypeEnum {

        /**
         * Enum MP4 for value: "MP4"
         */
        public static final VideoTypeEnum MP4 = new VideoTypeEnum("MP4");

        /**
         * Enum TS for value: "TS"
         */
        public static final VideoTypeEnum TS = new VideoTypeEnum("TS");

        /**
         * Enum MOV for value: "MOV"
         */
        public static final VideoTypeEnum MOV = new VideoTypeEnum("MOV");

        /**
         * Enum MXF for value: "MXF"
         */
        public static final VideoTypeEnum MXF = new VideoTypeEnum("MXF");

        /**
         * Enum MPG for value: "MPG"
         */
        public static final VideoTypeEnum MPG = new VideoTypeEnum("MPG");

        /**
         * Enum FLV for value: "FLV"
         */
        public static final VideoTypeEnum FLV = new VideoTypeEnum("FLV");

        /**
         * Enum WMV for value: "WMV"
         */
        public static final VideoTypeEnum WMV = new VideoTypeEnum("WMV");

        /**
         * Enum AVI for value: "AVI"
         */
        public static final VideoTypeEnum AVI = new VideoTypeEnum("AVI");

        /**
         * Enum M4V for value: "M4V"
         */
        public static final VideoTypeEnum M4V = new VideoTypeEnum("M4V");

        /**
         * Enum F4V for value: "F4V"
         */
        public static final VideoTypeEnum F4V = new VideoTypeEnum("F4V");

        /**
         * Enum MPEG for value: "MPEG"
         */
        public static final VideoTypeEnum MPEG = new VideoTypeEnum("MPEG");

        /**
         * Enum _3GP for value: "3GP"
         */
        public static final VideoTypeEnum _3GP = new VideoTypeEnum("3GP");

        /**
         * Enum ASF for value: "ASF"
         */
        public static final VideoTypeEnum ASF = new VideoTypeEnum("ASF");

        /**
         * Enum MKV for value: "MKV"
         */
        public static final VideoTypeEnum MKV = new VideoTypeEnum("MKV");

        /**
         * Enum HLS for value: "HLS"
         */
        public static final VideoTypeEnum HLS = new VideoTypeEnum("HLS");

        /**
         * Enum MP3 for value: "MP3"
         */
        public static final VideoTypeEnum MP3 = new VideoTypeEnum("MP3");

        /**
         * Enum OGG for value: "OGG"
         */
        public static final VideoTypeEnum OGG = new VideoTypeEnum("OGG");

        /**
         * Enum WAV for value: "WAV"
         */
        public static final VideoTypeEnum WAV = new VideoTypeEnum("WAV");

        /**
         * Enum WMA for value: "WMA"
         */
        public static final VideoTypeEnum WMA = new VideoTypeEnum("WMA");

        /**
         * Enum APE for value: "APE"
         */
        public static final VideoTypeEnum APE = new VideoTypeEnum("APE");

        /**
         * Enum FLAC for value: "FLAC"
         */
        public static final VideoTypeEnum FLAC = new VideoTypeEnum("FLAC");

        /**
         * Enum AAC for value: "AAC"
         */
        public static final VideoTypeEnum AAC = new VideoTypeEnum("AAC");

        /**
         * Enum AC3 for value: "AC3"
         */
        public static final VideoTypeEnum AC3 = new VideoTypeEnum("AC3");

        /**
         * Enum MMF for value: "MMF"
         */
        public static final VideoTypeEnum MMF = new VideoTypeEnum("MMF");

        /**
         * Enum AMR for value: "AMR"
         */
        public static final VideoTypeEnum AMR = new VideoTypeEnum("AMR");

        /**
         * Enum M4A for value: "M4A"
         */
        public static final VideoTypeEnum M4A = new VideoTypeEnum("M4A");

        /**
         * Enum M4R for value: "M4R"
         */
        public static final VideoTypeEnum M4R = new VideoTypeEnum("M4R");

        /**
         * Enum WV for value: "WV"
         */
        public static final VideoTypeEnum WV = new VideoTypeEnum("WV");

        /**
         * Enum MP2 for value: "MP2"
         */
        public static final VideoTypeEnum MP2 = new VideoTypeEnum("MP2");

        /**
         * Enum RMVB for value: "RMVB"
         */
        public static final VideoTypeEnum RMVB = new VideoTypeEnum("RMVB");

        /**
         * Enum WEBM for value: "WEBM"
         */
        public static final VideoTypeEnum WEBM = new VideoTypeEnum("WEBM");

        private static final Map<String, VideoTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VideoTypeEnum> createStaticFields() {
            Map<String, VideoTypeEnum> map = new HashMap<>();
            map.put("MP4", MP4);
            map.put("TS", TS);
            map.put("MOV", MOV);
            map.put("MXF", MXF);
            map.put("MPG", MPG);
            map.put("FLV", FLV);
            map.put("WMV", WMV);
            map.put("AVI", AVI);
            map.put("M4V", M4V);
            map.put("F4V", F4V);
            map.put("MPEG", MPEG);
            map.put("3GP", _3GP);
            map.put("ASF", ASF);
            map.put("MKV", MKV);
            map.put("HLS", HLS);
            map.put("MP3", MP3);
            map.put("OGG", OGG);
            map.put("WAV", WAV);
            map.put("WMA", WMA);
            map.put("APE", APE);
            map.put("FLAC", FLAC);
            map.put("AAC", AAC);
            map.put("AC3", AC3);
            map.put("MMF", MMF);
            map.put("AMR", AMR);
            map.put("M4A", M4A);
            map.put("M4R", M4R);
            map.put("WV", WV);
            map.put("MP2", MP2);
            map.put("RMVB", RMVB);
            map.put("WEBM", WEBM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VideoTypeEnum(String value) {
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
        public static VideoTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new VideoTypeEnum(value));
        }

        public static VideoTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VideoTypeEnum) {
                return this.value.equals(((VideoTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_type")

    private VideoTypeEnum videoType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_id")

    private Integer categoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private String tags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_publish")

    private Integer autoPublish;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_group_name")

    private String templateGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_encrypt")

    private Integer autoEncrypt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_preheat")

    private Integer autoPreheat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thumbnail")

    private Thumbnail thumbnail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review")

    private Review review;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workflow_name")

    private String workflowName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    private FileAddr input;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_mode")

    private Integer storageMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_bucket")

    private String outputBucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_path")

    private String outputPath;

    public PublishAssetFromObsReq withVideoType(VideoTypeEnum videoType) {
        this.videoType = videoType;
        return this;
    }

    /**
     * 转存的音视频文件类型。  取值如下： - 视频文件：MP4、TS、MOV、MXF、MPG、FLV、WMV、AVI、M4V、F4V、MPEG、3GP、ASF、MKV、HLS - 音频文件：MP3、OGG、WAV、WMA、APE、FLAC、AAC、AC3、MMF、AMR、M4A、M4R、WV、MP2  若上传格式为音频文件，则不支持转码、添加水印和字幕。  > 当**video_type**选择HLS时，**storage_mode**（存储模式）需选择存储在租户桶，且输出路径设置为和输入路径在同一个目录。
     * @return videoType
     */
    public VideoTypeEnum getVideoType() {
        return videoType;
    }

    public void setVideoType(VideoTypeEnum videoType) {
        this.videoType = videoType;
    }

    public PublishAssetFromObsReq withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 媒资标题，长度不超过128个字节，UTF-8编码。
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public PublishAssetFromObsReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 视频描述，长度不超过1024个字节。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PublishAssetFromObsReq withCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    /**
     * 媒资分类ID。  您可以调用[创建媒资分类](https://support.huaweicloud.com/api-vod/vod_04_0028.html)接口或在点播控制台的[分类设置](https://support.huaweicloud.com/usermanual-vod/vod010006.html)中创建对应的媒资分类，并获取分类ID。  > 若不设置或者设置为-1，则上传的音视频归类到系统预置的“其它”分类中。
     * @return categoryId
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public PublishAssetFromObsReq withTags(String tags) {
        this.tags = tags;
        return this;
    }

    /**
     * 视频标签。  单个标签不超过16个字节，最多不超过16个标签。  多个用逗号分隔，UTF8编码。
     * @return tags
     */
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public PublishAssetFromObsReq withAutoPublish(Integer autoPublish) {
        this.autoPublish = autoPublish;
        return this;
    }

    /**
     * 是否自动发布。  取值如下： - 0：表示不自动发布。 - 1：表示自动发布。  默认值：1。
     * minimum: 0
     * maximum: 1
     * @return autoPublish
     */
    public Integer getAutoPublish() {
        return autoPublish;
    }

    public void setAutoPublish(Integer autoPublish) {
        this.autoPublish = autoPublish;
    }

    public PublishAssetFromObsReq withTemplateGroupName(String templateGroupName) {
        this.templateGroupName = templateGroupName;
        return this;
    }

    /**
     * 转码模板组名称。  若不为空，则使用指定的转码模板对上传的音视频进行转码，您可以在视频点播控制台配置转码模板，具体请参见[转码设置](https://support.huaweicloud.com/usermanual-vod/vod_01_0072.html)。  > 若同时设置了“**template_group_name**”和“**workflow_name**”字段，则“**template_group_name**”字段生效。
     * @return templateGroupName
     */
    public String getTemplateGroupName() {
        return templateGroupName;
    }

    public void setTemplateGroupName(String templateGroupName) {
        this.templateGroupName = templateGroupName;
    }

    public PublishAssetFromObsReq withAutoEncrypt(Integer autoEncrypt) {
        this.autoEncrypt = autoEncrypt;
        return this;
    }

    /**
     * 是否自动加密。  取值如下： - 0：表示不加密。 - 1：表示需要加密。  默认值：0。  若设置为需要加密，则必须配置转码模板，且转码的输出格式是HLS。
     * minimum: 0
     * maximum: 1
     * @return autoEncrypt
     */
    public Integer getAutoEncrypt() {
        return autoEncrypt;
    }

    public void setAutoEncrypt(Integer autoEncrypt) {
        this.autoEncrypt = autoEncrypt;
    }

    public PublishAssetFromObsReq withAutoPreheat(Integer autoPreheat) {
        this.autoPreheat = autoPreheat;
        return this;
    }

    /**
     * 是否自动预热到CDN。  取值如下： - 0：表示不自动预热。 - 1：表示自动预热。  默认值：0。
     * @return autoPreheat
     */
    public Integer getAutoPreheat() {
        return autoPreheat;
    }

    public void setAutoPreheat(Integer autoPreheat) {
        this.autoPreheat = autoPreheat;
    }

    public PublishAssetFromObsReq withThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    public PublishAssetFromObsReq withThumbnail(Consumer<Thumbnail> thumbnailSetter) {
        if (this.thumbnail == null) {
            this.thumbnail = new Thumbnail();
            thumbnailSetter.accept(this.thumbnail);
        }

        return this;
    }

    /**
     * Get thumbnail
     * @return thumbnail
     */
    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    public PublishAssetFromObsReq withReview(Review review) {
        this.review = review;
        return this;
    }

    public PublishAssetFromObsReq withReview(Consumer<Review> reviewSetter) {
        if (this.review == null) {
            this.review = new Review();
            reviewSetter.accept(this.review);
        }

        return this;
    }

    /**
     * Get review
     * @return review
     */
    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }

    public PublishAssetFromObsReq withWorkflowName(String workflowName) {
        this.workflowName = workflowName;
        return this;
    }

    /**
     * 工作流名称。  若不为空，则使用指定的工作流对上传的音视频进行处理，您可以在视频点播控制台配置工作流，具体请参见[工作流设置](https://support.huaweicloud.com/usermanual-vod/vod010041.html)。
     * @return workflowName
     */
    public String getWorkflowName() {
        return workflowName;
    }

    public void setWorkflowName(String workflowName) {
        this.workflowName = workflowName;
    }

    public PublishAssetFromObsReq withInput(FileAddr input) {
        this.input = input;
        return this;
    }

    public PublishAssetFromObsReq withInput(Consumer<FileAddr> inputSetter) {
        if (this.input == null) {
            this.input = new FileAddr();
            inputSetter.accept(this.input);
        }

        return this;
    }

    /**
     * Get input
     * @return input
     */
    public FileAddr getInput() {
        return input;
    }

    public void setInput(FileAddr input) {
        this.input = input;
    }

    public PublishAssetFromObsReq withStorageMode(Integer storageMode) {
        this.storageMode = storageMode;
        return this;
    }

    /**
     * 存储模式。  取值如下： - 0：表示视频拷贝到点播桶。 - 1：表示视频存储在租户桶。  默认值：0
     * @return storageMode
     */
    public Integer getStorageMode() {
        return storageMode;
    }

    public void setStorageMode(Integer storageMode) {
        this.storageMode = storageMode;
    }

    public PublishAssetFromObsReq withOutputBucket(String outputBucket) {
        this.outputBucket = outputBucket;
        return this;
    }

    /**
     * 输出桶名，“**storage_mode**”为1时必选。
     * @return outputBucket
     */
    public String getOutputBucket() {
        return outputBucket;
    }

    public void setOutputBucket(String outputBucket) {
        this.outputBucket = outputBucket;
    }

    public PublishAssetFromObsReq withOutputPath(String outputPath) {
        this.outputPath = outputPath;
        return this;
    }

    /**
     * 输出路径名，“**storage_mode**”为1时必选。
     * @return outputPath
     */
    public String getOutputPath() {
        return outputPath;
    }

    public void setOutputPath(String outputPath) {
        this.outputPath = outputPath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PublishAssetFromObsReq that = (PublishAssetFromObsReq) obj;
        return Objects.equals(this.videoType, that.videoType) && Objects.equals(this.title, that.title)
            && Objects.equals(this.description, that.description) && Objects.equals(this.categoryId, that.categoryId)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.autoPublish, that.autoPublish)
            && Objects.equals(this.templateGroupName, that.templateGroupName)
            && Objects.equals(this.autoEncrypt, that.autoEncrypt) && Objects.equals(this.autoPreheat, that.autoPreheat)
            && Objects.equals(this.thumbnail, that.thumbnail) && Objects.equals(this.review, that.review)
            && Objects.equals(this.workflowName, that.workflowName) && Objects.equals(this.input, that.input)
            && Objects.equals(this.storageMode, that.storageMode)
            && Objects.equals(this.outputBucket, that.outputBucket) && Objects.equals(this.outputPath, that.outputPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoType,
            title,
            description,
            categoryId,
            tags,
            autoPublish,
            templateGroupName,
            autoEncrypt,
            autoPreheat,
            thumbnail,
            review,
            workflowName,
            input,
            storageMode,
            outputBucket,
            outputPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublishAssetFromObsReq {\n");
        sb.append("    videoType: ").append(toIndentedString(videoType)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    autoPublish: ").append(toIndentedString(autoPublish)).append("\n");
        sb.append("    templateGroupName: ").append(toIndentedString(templateGroupName)).append("\n");
        sb.append("    autoEncrypt: ").append(toIndentedString(autoEncrypt)).append("\n");
        sb.append("    autoPreheat: ").append(toIndentedString(autoPreheat)).append("\n");
        sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
        sb.append("    review: ").append(toIndentedString(review)).append("\n");
        sb.append("    workflowName: ").append(toIndentedString(workflowName)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    storageMode: ").append(toIndentedString(storageMode)).append("\n");
        sb.append("    outputBucket: ").append(toIndentedString(outputBucket)).append("\n");
        sb.append("    outputPath: ").append(toIndentedString(outputPath)).append("\n");
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
