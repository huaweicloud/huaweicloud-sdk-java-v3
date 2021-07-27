package com.huaweicloud.sdk.vod.v1.model;




import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vod.v1.model.Subtitle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * UploadAssetReq
 */
public class UploadAssetReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="asset_id")
    
    private String assetId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="video_md5")
    
    private String videoMd5;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="video_name")
    
    private String videoName;
    /**
     * 视频文件类型。 取值为MP4、TS、MOV、MXF、MPG、FLV、WMV、AVI、M4V、F4V、MPEG、3GP、ASF、MKV
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
            map.put("UNKNOW", UNKNOW);
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
    @JsonProperty(value="video_type")
    
    private VideoTypeEnum videoType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cover_id")
    
    private Integer coverId;
    /**
     * 封面图片格式类型。  取值如下： - JPG - PNG
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
    @JsonProperty(value="cover_type")
    
    private CoverTypeEnum coverType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cover_md5")
    
    private String coverMd5;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subtitles")
    
    private List<Subtitle> subtitles = null;
    
    public UploadAssetReq withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    


    /**
     * 媒资ID。
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    

    public UploadAssetReq withVideoMd5(String videoMd5) {
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

    

    public UploadAssetReq withVideoName(String videoName) {
        this.videoName = videoName;
        return this;
    }

    


    /**
     * 视频文件名。  文件名后缀为可选。
     * @return videoName
     */
    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    

    public UploadAssetReq withVideoType(VideoTypeEnum videoType) {
        this.videoType = videoType;
        return this;
    }

    


    /**
     * 视频文件类型。 取值为MP4、TS、MOV、MXF、MPG、FLV、WMV、AVI、M4V、F4V、MPEG、3GP、ASF、MKV
     * @return videoType
     */
    public VideoTypeEnum getVideoType() {
        return videoType;
    }

    public void setVideoType(VideoTypeEnum videoType) {
        this.videoType = videoType;
    }

    

    public UploadAssetReq withCoverId(Integer coverId) {
        this.coverId = coverId;
        return this;
    }

    


    /**
     * 封面ID。  取值范围：[0,7]。  当前只支持一张封面，只能设置为0。
     * @return coverId
     */
    public Integer getCoverId() {
        return coverId;
    }

    public void setCoverId(Integer coverId) {
        this.coverId = coverId;
    }

    

    public UploadAssetReq withCoverType(CoverTypeEnum coverType) {
        this.coverType = coverType;
        return this;
    }

    


    /**
     * 封面图片格式类型。  取值如下： - JPG - PNG
     * @return coverType
     */
    public CoverTypeEnum getCoverType() {
        return coverType;
    }

    public void setCoverType(CoverTypeEnum coverType) {
        this.coverType = coverType;
    }

    

    public UploadAssetReq withCoverMd5(String coverMd5) {
        this.coverMd5 = coverMd5;
        return this;
    }

    


    /**
     * 封面文件的MD5值。
     * @return coverMd5
     */
    public String getCoverMd5() {
        return coverMd5;
    }

    public void setCoverMd5(String coverMd5) {
        this.coverMd5 = coverMd5;
    }

    

    public UploadAssetReq withSubtitles(List<Subtitle> subtitles) {
        this.subtitles = subtitles;
        return this;
    }

    
    public UploadAssetReq addSubtitlesItem(Subtitle subtitlesItem) {
        if(this.subtitles == null) {
            this.subtitles = new ArrayList<>();
        }
        this.subtitles.add(subtitlesItem);
        return this;
    }

    public UploadAssetReq withSubtitles(Consumer<List<Subtitle>> subtitlesSetter) {
        if(this.subtitles == null) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UploadAssetReq uploadAssetReq = (UploadAssetReq) o;
        return Objects.equals(this.assetId, uploadAssetReq.assetId) &&
            Objects.equals(this.videoMd5, uploadAssetReq.videoMd5) &&
            Objects.equals(this.videoName, uploadAssetReq.videoName) &&
            Objects.equals(this.videoType, uploadAssetReq.videoType) &&
            Objects.equals(this.coverId, uploadAssetReq.coverId) &&
            Objects.equals(this.coverType, uploadAssetReq.coverType) &&
            Objects.equals(this.coverMd5, uploadAssetReq.coverMd5) &&
            Objects.equals(this.subtitles, uploadAssetReq.subtitles);
    }
    @Override
    public int hashCode() {
        return Objects.hash(assetId, videoMd5, videoName, videoType, coverId, coverType, coverMd5, subtitles);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadAssetReq {\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    videoMd5: ").append(toIndentedString(videoMd5)).append("\n");
        sb.append("    videoName: ").append(toIndentedString(videoName)).append("\n");
        sb.append("    videoType: ").append(toIndentedString(videoType)).append("\n");
        sb.append("    coverId: ").append(toIndentedString(coverId)).append("\n");
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

