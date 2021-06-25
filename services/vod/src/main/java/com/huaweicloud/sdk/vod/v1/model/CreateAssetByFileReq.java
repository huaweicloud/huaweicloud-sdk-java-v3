package com.huaweicloud.sdk.vod.v1.model;




import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vod.v1.model.Review;
import com.huaweicloud.sdk.vod.v1.model.Subtitle;
import com.huaweicloud.sdk.vod.v1.model.Thumbnail;
import com.huaweicloud.sdk.vod.v1.model.VideoTypeRef;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CreateAssetByFileReq
 */
public class CreateAssetByFileReq  {

    /**
     * 视频类型<br/> 
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
         * Enum HLS for value: "HLS"
         */
        public static final VideoTypeEnum HLS = new VideoTypeEnum("HLS");
        
        /**
         * Enum DASH for value: "DASH"
         */
        public static final VideoTypeEnum DASH = new VideoTypeEnum("DASH");
        
        /**
         * Enum MP3 for value: "MP3"
         */
        public static final VideoTypeEnum MP3 = new VideoTypeEnum("MP3");
        
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
         * Enum OGG for value: "OGG"
         */
        public static final VideoTypeEnum OGG = new VideoTypeEnum("OGG");
        
        /**
         * Enum WAV for value: "WAV"
         */
        public static final VideoTypeEnum WAV = new VideoTypeEnum("WAV");
        
        /**
         * Enum WV for value: "WV"
         */
        public static final VideoTypeEnum WV = new VideoTypeEnum("WV");
        
        /**
         * Enum MP2 for value: "MP2"
         */
        public static final VideoTypeEnum MP2 = new VideoTypeEnum("MP2");
        
        /**
         * Enum AVI for value: "AVI"
         */
        public static final VideoTypeEnum AVI = new VideoTypeEnum("AVI");
        
        /**
         * Enum F4V for value: "F4V"
         */
        public static final VideoTypeEnum F4V = new VideoTypeEnum("F4V");
        
        /**
         * Enum M4V for value: "M4V"
         */
        public static final VideoTypeEnum M4V = new VideoTypeEnum("M4V");
        
        /**
         * Enum MPEG for value: "MPEG"
         */
        public static final VideoTypeEnum MPEG = new VideoTypeEnum("MPEG");
        
        /**
         * Enum M3U8 for value: "M3U8"
         */
        public static final VideoTypeEnum M3U8 = new VideoTypeEnum("M3U8");
        
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
         * Enum UNKNOW for value: "UNKNOW"
         */
        public static final VideoTypeEnum UNKNOW = new VideoTypeEnum("UNKNOW");
        

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
            map.put("HLS", HLS);
            map.put("DASH", DASH);
            map.put("MP3", MP3);
            map.put("WMA", WMA);
            map.put("APE", APE);
            map.put("FLAC", FLAC);
            map.put("AAC", AAC);
            map.put("AC3", AC3);
            map.put("MMF", MMF);
            map.put("AMR", AMR);
            map.put("M4A", M4A);
            map.put("M4R", M4R);
            map.put("OGG", OGG);
            map.put("WAV", WAV);
            map.put("WV", WV);
            map.put("MP2", MP2);
            map.put("AVI", AVI);
            map.put("F4V", F4V);
            map.put("M4V", M4V);
            map.put("MPEG", MPEG);
            map.put("M3U8", M3U8);
            map.put("3GP", _3GP);
            map.put("ASF", ASF);
            map.put("MKV", MKV);
            map.put("UNKNOW", UNKNOW);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VideoTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static VideoTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            VideoTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new VideoTypeEnum(value);
            }
            return result;
        }

        public static VideoTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            VideoTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof VideoTypeEnum) {
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
    @JsonProperty(value="video_type")
    
    private VideoTypeEnum videoType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="title")
    
    private String title;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="category_id")
    
    private Integer categoryId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private String tags;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auto_publish")
    
    private Integer autoPublish;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="template_group_name")
    
    private String templateGroupName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auto_encrypt")
    
    private Integer autoEncrypt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auto_preheat")
    
    private Integer autoPreheat;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="thumbnail")
    
    private Thumbnail thumbnail;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="review")
    
    private Review review;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="workflow_name")
    
    private String workflowName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="video_name")
    
    private String videoName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="video_md5")
    
    private String videoMd5;
    /**
     * 封面图片文件类型<br/> 
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
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static CoverTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            CoverTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new CoverTypeEnum(value);
            }
            return result;
        }

        public static CoverTypeEnum valueOf(String value) {
            if( value == null ){
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
            if (obj != null && obj instanceof CoverTypeEnum) {
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
    @JsonProperty(value="cover_type")
    
    private CoverTypeEnum coverType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cover_md5")
    
    private String coverMd5;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subtitles")
    
    private List<Subtitle> subtitles = null;
    
    public CreateAssetByFileReq withVideoType(VideoTypeEnum videoType) {
        this.videoType = videoType;
        return this;
    }

    


    /**
     * 视频类型<br/> 
     * @return videoType
     */
    public VideoTypeEnum getVideoType() {
        return videoType;
    }

    public void setVideoType(VideoTypeEnum videoType) {
        this.videoType = videoType;
    }

    

    public CreateAssetByFileReq withTitle(String title) {
        this.title = title;
        return this;
    }

    


    /**
     * 媒资标题</br> 
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    

    public CreateAssetByFileReq withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 视频描述<br/> 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public CreateAssetByFileReq withCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    


    /**
     * 媒资分类id<br/> 
     * @return categoryId
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    

    public CreateAssetByFileReq withTags(String tags) {
        this.tags = tags;
        return this;
    }

    


    /**
     * 视频标签<br/> 
     * @return tags
     */
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    

    public CreateAssetByFileReq withAutoPublish(Integer autoPublish) {
        this.autoPublish = autoPublish;
        return this;
    }

    


    /**
     * 是否自动发布<br/> 
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

    

    public CreateAssetByFileReq withTemplateGroupName(String templateGroupName) {
        this.templateGroupName = templateGroupName;
        return this;
    }

    


    /**
     * 转码模板组名称<br/> 
     * @return templateGroupName
     */
    public String getTemplateGroupName() {
        return templateGroupName;
    }

    public void setTemplateGroupName(String templateGroupName) {
        this.templateGroupName = templateGroupName;
    }

    

    public CreateAssetByFileReq withAutoEncrypt(Integer autoEncrypt) {
        this.autoEncrypt = autoEncrypt;
        return this;
    }

    


    /**
     * 是否自动加密，取值[0，1]，0表示需要不加密；1表示需要加密。加密与转码必须要一起进行，当需要加密时，转码参数不能为空，且转码输出必须要为HLS 
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

    

    public CreateAssetByFileReq withAutoPreheat(Integer autoPreheat) {
        this.autoPreheat = autoPreheat;
        return this;
    }

    


    /**
     * 是否自动预热到CDN,取值[0，1]，0表示不自动预热 
     * @return autoPreheat
     */
    public Integer getAutoPreheat() {
        return autoPreheat;
    }

    public void setAutoPreheat(Integer autoPreheat) {
        this.autoPreheat = autoPreheat;
    }

    

    public CreateAssetByFileReq withThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    public CreateAssetByFileReq withThumbnail(Consumer<Thumbnail> thumbnailSetter) {
        if(this.thumbnail == null ){
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

    

    public CreateAssetByFileReq withReview(Review review) {
        this.review = review;
        return this;
    }

    public CreateAssetByFileReq withReview(Consumer<Review> reviewSetter) {
        if(this.review == null ){
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

    

    public CreateAssetByFileReq withWorkflowName(String workflowName) {
        this.workflowName = workflowName;
        return this;
    }

    


    /**
     * 工作流ID
     * @return workflowName
     */
    public String getWorkflowName() {
        return workflowName;
    }

    public void setWorkflowName(String workflowName) {
        this.workflowName = workflowName;
    }

    

    public CreateAssetByFileReq withVideoName(String videoName) {
        this.videoName = videoName;
        return this;
    }

    


    /**
     * 视频文件名<br/> 
     * @return videoName
     */
    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    

    public CreateAssetByFileReq withVideoMd5(String videoMd5) {
        this.videoMd5 = videoMd5;
        return this;
    }

    


    /**
     * 视频文件MD5值<br/> 
     * @return videoMd5
     */
    public String getVideoMd5() {
        return videoMd5;
    }

    public void setVideoMd5(String videoMd5) {
        this.videoMd5 = videoMd5;
    }

    

    public CreateAssetByFileReq withCoverType(CoverTypeEnum coverType) {
        this.coverType = coverType;
        return this;
    }

    


    /**
     * 封面图片文件类型<br/> 
     * @return coverType
     */
    public CoverTypeEnum getCoverType() {
        return coverType;
    }

    public void setCoverType(CoverTypeEnum coverType) {
        this.coverType = coverType;
    }

    

    public CreateAssetByFileReq withCoverMd5(String coverMd5) {
        this.coverMd5 = coverMd5;
        return this;
    }

    


    /**
     * 封面文件MD5值<br/> 
     * @return coverMd5
     */
    public String getCoverMd5() {
        return coverMd5;
    }

    public void setCoverMd5(String coverMd5) {
        this.coverMd5 = coverMd5;
    }

    

    public CreateAssetByFileReq withSubtitles(List<Subtitle> subtitles) {
        this.subtitles = subtitles;
        return this;
    }

    
    public CreateAssetByFileReq addSubtitlesItem(Subtitle subtitlesItem) {
        if(this.subtitles == null) {
            this.subtitles = new ArrayList<>();
        }
        this.subtitles.add(subtitlesItem);
        return this;
    }

    public CreateAssetByFileReq withSubtitles(Consumer<List<Subtitle>> subtitlesSetter) {
        if(this.subtitles == null) {
            this.subtitles = new ArrayList<>();
        }
        subtitlesSetter.accept(this.subtitles);
        return this;
    }

    /**
     * 字幕文件信息<br/> 
     * @return subtitles
     */
    public List<Subtitle> getSubtitles() {
        return subtitles;
    }

    public void setSubtitles(List<Subtitle> subtitles) {
        this.subtitles = subtitles;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateAssetByFileReq createAssetByFileReq = (CreateAssetByFileReq) o;
        return Objects.equals(this.videoType, createAssetByFileReq.videoType) &&
            Objects.equals(this.title, createAssetByFileReq.title) &&
            Objects.equals(this.description, createAssetByFileReq.description) &&
            Objects.equals(this.categoryId, createAssetByFileReq.categoryId) &&
            Objects.equals(this.tags, createAssetByFileReq.tags) &&
            Objects.equals(this.autoPublish, createAssetByFileReq.autoPublish) &&
            Objects.equals(this.templateGroupName, createAssetByFileReq.templateGroupName) &&
            Objects.equals(this.autoEncrypt, createAssetByFileReq.autoEncrypt) &&
            Objects.equals(this.autoPreheat, createAssetByFileReq.autoPreheat) &&
            Objects.equals(this.thumbnail, createAssetByFileReq.thumbnail) &&
            Objects.equals(this.review, createAssetByFileReq.review) &&
            Objects.equals(this.workflowName, createAssetByFileReq.workflowName) &&
            Objects.equals(this.videoName, createAssetByFileReq.videoName) &&
            Objects.equals(this.videoMd5, createAssetByFileReq.videoMd5) &&
            Objects.equals(this.coverType, createAssetByFileReq.coverType) &&
            Objects.equals(this.coverMd5, createAssetByFileReq.coverMd5) &&
            Objects.equals(this.subtitles, createAssetByFileReq.subtitles);
    }
    @Override
    public int hashCode() {
        return Objects.hash(videoType, title, description, categoryId, tags, autoPublish, templateGroupName, autoEncrypt, autoPreheat, thumbnail, review, workflowName, videoName, videoMd5, coverType, coverMd5, subtitles);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAssetByFileReq {\n");
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
        sb.append("    videoName: ").append(toIndentedString(videoName)).append("\n");
        sb.append("    videoMd5: ").append(toIndentedString(videoMd5)).append("\n");
        sb.append("    coverType: ").append(toIndentedString(coverType)).append("\n");
        sb.append("    coverMd5: ").append(toIndentedString(coverMd5)).append("\n");
        sb.append("    subtitles: ").append(toIndentedString(subtitles)).append("\n");
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

