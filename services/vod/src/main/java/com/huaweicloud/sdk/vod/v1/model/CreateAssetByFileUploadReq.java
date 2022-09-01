package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateAssetByFileUploadReq
 */
public class CreateAssetByFileUploadReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    @JacksonXmlProperty(localName = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_name")

    @JacksonXmlProperty(localName = "video_name")

    private String videoName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_type")

    @JacksonXmlProperty(localName = "video_type")

    private String videoType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_id")

    @JacksonXmlProperty(localName = "category_id")

    private String categoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_md5")

    @JacksonXmlProperty(localName = "video_md5")

    private String videoMd5;

    /**
     * 封面图片文件类型。  取值如下： - JPG - PNG  上传后的封面名称是固定的，后缀名为封面类型缩写。例如cover0.jpg，cover1.png 若不指定类型，则封面文件无后缀名。  > 如果设置了图片格式，则不会执行首帧截图作为封面动作，需自行上传封面。
     */
    public static final class CoverTypeEnum {

        /**
         * Enum JPG for value: "JPG"
         */
        public static final CoverTypeEnum JPG = new CoverTypeEnum("JPG");

        /**
         * Enum PNG for value: "PNG"
         */
        public static final CoverTypeEnum PNG = new CoverTypeEnum("PNG");

        private static final Map<String, CoverTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CoverTypeEnum> createStaticFields() {
            Map<String, CoverTypeEnum> map = new HashMap<>();
            map.put("JPG", JPG);
            map.put("PNG", PNG);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CoverTypeEnum(String value) {
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
        public static CoverTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            CoverTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new CoverTypeEnum(value);
            }
            return result;
        }

        public static CoverTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            CoverTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CoverTypeEnum) {
                return this.value.equals(((CoverTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cover_type")

    @JacksonXmlProperty(localName = "cover_type")

    private CoverTypeEnum coverType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cover_md5")

    @JacksonXmlProperty(localName = "cover_md5")

    private String coverMd5;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subtitles")

    @JacksonXmlProperty(localName = "subtitles")

    private List<Subtitle> subtitles = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    @JacksonXmlProperty(localName = "tags")

    private String tags;

    /**
     * 是否自动发布。  取值如下： - 0：表示不自动发布。 - 1：表示自动发布。  默认值：0。
     */
    public static final class AutoPublishEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final AutoPublishEnum NUMBER_0 = new AutoPublishEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final AutoPublishEnum NUMBER_1 = new AutoPublishEnum(1);

        private static final Map<Integer, AutoPublishEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, AutoPublishEnum> createStaticFields() {
            Map<Integer, AutoPublishEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        AutoPublishEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static AutoPublishEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            AutoPublishEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AutoPublishEnum(value);
            }
            return result;
        }

        public static AutoPublishEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            AutoPublishEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AutoPublishEnum) {
                return this.value.equals(((AutoPublishEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_publish")

    @JacksonXmlProperty(localName = "auto_publish")

    private AutoPublishEnum autoPublish;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_group_name")

    @JacksonXmlProperty(localName = "template_group_name")

    private String templateGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_encrypt")

    @JacksonXmlProperty(localName = "auto_encrypt")

    private Integer autoEncrypt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_preheat")

    @JacksonXmlProperty(localName = "auto_preheat")

    private String autoPreheat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thumbnail")

    @JacksonXmlProperty(localName = "thumbnail")

    private Thumbnail thumbnail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review")

    @JacksonXmlProperty(localName = "review")

    private Review review;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workflow_name")

    @JacksonXmlProperty(localName = "workflow_name")

    private String workflowName;

    public CreateAssetByFileUploadReq withTitle(String title) {
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

    public CreateAssetByFileUploadReq withDescription(String description) {
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

    public CreateAssetByFileUploadReq withVideoName(String videoName) {
        this.videoName = videoName;
        return this;
    }

    /**
     * 音视频文件名，长度不超过128个字节。  文件名后缀可选。
     * @return videoName
     */
    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public CreateAssetByFileUploadReq withVideoType(String videoType) {
        this.videoType = videoType;
        return this;
    }

    /**
     * 上传音视频文件的格式。  取值如下： - 视频文件：MP4、TS、MOV、MXF、MPG、FLV、WMV、AVI、M4V、F4V、MPEG、3GP、ASF、MKV、HLS - 音频文件：MP3、OGG、WAV、WMA、APE、FLAC、AAC、AC3、MMF、AMR、M4A、M4R、WV、MP2  若上传格式为音频文件，则不支持转码、添加水印和字幕。
     * @return videoType
     */
    public String getVideoType() {
        return videoType;
    }

    public void setVideoType(String videoType) {
        this.videoType = videoType;
    }

    public CreateAssetByFileUploadReq withCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    /**
     * 媒资分类ID。  您可以调用[创建媒资分类](https://support.huaweicloud.com/api-vod/vod_04_0028.html)接口或在点播控制台的[分类设置](https://support.huaweicloud.com/usermanual-vod/vod010006.html)中创建对应的媒资分类，并获取分类ID。  > 若不设置或者设置为-1，则上传的音视频归类到系统预置的“其它”分类中。
     * @return categoryId
     */
    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public CreateAssetByFileUploadReq withVideoMd5(String videoMd5) {
        this.videoMd5 = videoMd5;
        return this;
    }

    /**
     * 视频文件MD5值。  建议参考[媒资上传和更新](https://support.huaweicloud.com/api-vod/vod_04_0212.html)生成对应的MD5值。
     * @return videoMd5
     */
    public String getVideoMd5() {
        return videoMd5;
    }

    public void setVideoMd5(String videoMd5) {
        this.videoMd5 = videoMd5;
    }

    public CreateAssetByFileUploadReq withCoverType(CoverTypeEnum coverType) {
        this.coverType = coverType;
        return this;
    }

    /**
     * 封面图片文件类型。  取值如下： - JPG - PNG  上传后的封面名称是固定的，后缀名为封面类型缩写。例如cover0.jpg，cover1.png 若不指定类型，则封面文件无后缀名。  > 如果设置了图片格式，则不会执行首帧截图作为封面动作，需自行上传封面。
     * @return coverType
     */
    public CoverTypeEnum getCoverType() {
        return coverType;
    }

    public void setCoverType(CoverTypeEnum coverType) {
        this.coverType = coverType;
    }

    public CreateAssetByFileUploadReq withCoverMd5(String coverMd5) {
        this.coverMd5 = coverMd5;
        return this;
    }

    /**
     * 封面文件MD5值
     * @return coverMd5
     */
    public String getCoverMd5() {
        return coverMd5;
    }

    public void setCoverMd5(String coverMd5) {
        this.coverMd5 = coverMd5;
    }

    public CreateAssetByFileUploadReq withSubtitles(List<Subtitle> subtitles) {
        this.subtitles = subtitles;
        return this;
    }

    public CreateAssetByFileUploadReq addSubtitlesItem(Subtitle subtitlesItem) {
        if (this.subtitles == null) {
            this.subtitles = new ArrayList<>();
        }
        this.subtitles.add(subtitlesItem);
        return this;
    }

    public CreateAssetByFileUploadReq withSubtitles(Consumer<List<Subtitle>> subtitlesSetter) {
        if (this.subtitles == null) {
            this.subtitles = new ArrayList<>();
        }
        subtitlesSetter.accept(this.subtitles);
        return this;
    }

    /**
     * 字幕文件信息
     * @return subtitles
     */
    public List<Subtitle> getSubtitles() {
        return subtitles;
    }

    public void setSubtitles(List<Subtitle> subtitles) {
        this.subtitles = subtitles;
    }

    public CreateAssetByFileUploadReq withTags(String tags) {
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

    public CreateAssetByFileUploadReq withAutoPublish(AutoPublishEnum autoPublish) {
        this.autoPublish = autoPublish;
        return this;
    }

    /**
     * 是否自动发布。  取值如下： - 0：表示不自动发布。 - 1：表示自动发布。  默认值：0。
     * @return autoPublish
     */
    public AutoPublishEnum getAutoPublish() {
        return autoPublish;
    }

    public void setAutoPublish(AutoPublishEnum autoPublish) {
        this.autoPublish = autoPublish;
    }

    public CreateAssetByFileUploadReq withTemplateGroupName(String templateGroupName) {
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

    public CreateAssetByFileUploadReq withAutoEncrypt(Integer autoEncrypt) {
        this.autoEncrypt = autoEncrypt;
        return this;
    }

    /**
     * 是否自动加密。  取值如下： - 0：表示不加密。 - 1：表示需要加密。  默认值：0。  加密与转码必须要一起进行，当需要加密时，转码参数不能为空，且转码输出格式必须要为HLS。
     * @return autoEncrypt
     */
    public Integer getAutoEncrypt() {
        return autoEncrypt;
    }

    public void setAutoEncrypt(Integer autoEncrypt) {
        this.autoEncrypt = autoEncrypt;
    }

    public CreateAssetByFileUploadReq withAutoPreheat(String autoPreheat) {
        this.autoPreheat = autoPreheat;
        return this;
    }

    /**
     * 是否自动预热到CDN。  取值如下： - 0：表示不自动预热。 - 1：表示自动预热。  默认值：0。
     * @return autoPreheat
     */
    public String getAutoPreheat() {
        return autoPreheat;
    }

    public void setAutoPreheat(String autoPreheat) {
        this.autoPreheat = autoPreheat;
    }

    public CreateAssetByFileUploadReq withThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    public CreateAssetByFileUploadReq withThumbnail(Consumer<Thumbnail> thumbnailSetter) {
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

    public CreateAssetByFileUploadReq withReview(Review review) {
        this.review = review;
        return this;
    }

    public CreateAssetByFileUploadReq withReview(Consumer<Review> reviewSetter) {
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

    public CreateAssetByFileUploadReq withWorkflowName(String workflowName) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateAssetByFileUploadReq createAssetByFileUploadReq = (CreateAssetByFileUploadReq) o;
        return Objects.equals(this.title, createAssetByFileUploadReq.title)
            && Objects.equals(this.description, createAssetByFileUploadReq.description)
            && Objects.equals(this.videoName, createAssetByFileUploadReq.videoName)
            && Objects.equals(this.videoType, createAssetByFileUploadReq.videoType)
            && Objects.equals(this.categoryId, createAssetByFileUploadReq.categoryId)
            && Objects.equals(this.videoMd5, createAssetByFileUploadReq.videoMd5)
            && Objects.equals(this.coverType, createAssetByFileUploadReq.coverType)
            && Objects.equals(this.coverMd5, createAssetByFileUploadReq.coverMd5)
            && Objects.equals(this.subtitles, createAssetByFileUploadReq.subtitles)
            && Objects.equals(this.tags, createAssetByFileUploadReq.tags)
            && Objects.equals(this.autoPublish, createAssetByFileUploadReq.autoPublish)
            && Objects.equals(this.templateGroupName, createAssetByFileUploadReq.templateGroupName)
            && Objects.equals(this.autoEncrypt, createAssetByFileUploadReq.autoEncrypt)
            && Objects.equals(this.autoPreheat, createAssetByFileUploadReq.autoPreheat)
            && Objects.equals(this.thumbnail, createAssetByFileUploadReq.thumbnail)
            && Objects.equals(this.review, createAssetByFileUploadReq.review)
            && Objects.equals(this.workflowName, createAssetByFileUploadReq.workflowName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title,
            description,
            videoName,
            videoType,
            categoryId,
            videoMd5,
            coverType,
            coverMd5,
            subtitles,
            tags,
            autoPublish,
            templateGroupName,
            autoEncrypt,
            autoPreheat,
            thumbnail,
            review,
            workflowName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAssetByFileUploadReq {\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    videoName: ").append(toIndentedString(videoName)).append("\n");
        sb.append("    videoType: ").append(toIndentedString(videoType)).append("\n");
        sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
        sb.append("    videoMd5: ").append(toIndentedString(videoMd5)).append("\n");
        sb.append("    coverType: ").append(toIndentedString(coverType)).append("\n");
        sb.append("    coverMd5: ").append(toIndentedString(coverMd5)).append("\n");
        sb.append("    subtitles: ").append(toIndentedString(subtitles)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    autoPublish: ").append(toIndentedString(autoPublish)).append("\n");
        sb.append("    templateGroupName: ").append(toIndentedString(templateGroupName)).append("\n");
        sb.append("    autoEncrypt: ").append(toIndentedString(autoEncrypt)).append("\n");
        sb.append("    autoPreheat: ").append(toIndentedString(autoPreheat)).append("\n");
        sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
        sb.append("    review: ").append(toIndentedString(review)).append("\n");
        sb.append("    workflowName: ").append(toIndentedString(workflowName)).append("\n");
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
