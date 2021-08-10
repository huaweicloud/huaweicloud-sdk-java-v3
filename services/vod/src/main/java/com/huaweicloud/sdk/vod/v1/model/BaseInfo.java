package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 媒资基本信息。 */
public class BaseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_name")

    private String videoName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_id")

    private Long categoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_name")

    private String categoryName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modified")

    private String lastModified;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_type")

    private String videoType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private String tags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "meta_data")

    private MetaData metaData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_url")

    private String videoUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cover_info_array")

    private List<CoverInfo> coverInfoArray = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subtitle_info")

    private List<SubtitleInfo> subtitleInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_path")

    private FileAddr sourcePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_path")

    private FileAddr outputPath;

    public BaseInfo withTitle(String title) {
        this.title = title;
        return this;
    }

    /** 媒资标题。 长度不超过128个字节，UTF8编码。
     * 
     * @return title */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BaseInfo withVideoName(String videoName) {
        this.videoName = videoName;
        return this;
    }

    /** 媒资文件名。
     * 
     * @return videoName */
    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public BaseInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 媒资描述。 长度不超过1024个字节。
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BaseInfo withCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    /** 媒资分类id。
     * 
     * @return categoryId */
    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public BaseInfo withCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }

    /** 媒资分类名称。
     * 
     * @return categoryName */
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public BaseInfo withCreateTime(String createTime) {
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

    public BaseInfo withLastModified(String lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /** 媒资最近修改时间。 格式为yyyymmddhhmmss。必须是与时区无关的UTC时间。
     * 
     * @return lastModified */
    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public BaseInfo withVideoType(String videoType) {
        this.videoType = videoType;
        return this;
    }

    /** 音视频文件类型。 取值如下： - 视频文件：MP4、TS、MOV、MXF、MPG、FLV、WMV、AVI、M4V、F4V、MPEG、3GP、ASF、MKV。 -
     * 音频文件：MP3、OGG、WAV、WMA、APE、FLAC、AAC、AC3、MMF、AMR、M4A、M4R、WV、MP2。
     * 
     * @return videoType */
    public String getVideoType() {
        return videoType;
    }

    public void setVideoType(String videoType) {
        this.videoType = videoType;
    }

    public BaseInfo withTags(String tags) {
        this.tags = tags;
        return this;
    }

    /** 媒资标签。 单个标签不超过16个字节，最多不超过16个标签。 多个用逗号分隔，UTF8编码。
     * 
     * @return tags */
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public BaseInfo withMetaData(MetaData metaData) {
        this.metaData = metaData;
        return this;
    }

    public BaseInfo withMetaData(Consumer<MetaData> metaDataSetter) {
        if (this.metaData == null) {
            this.metaData = new MetaData();
            metaDataSetter.accept(this.metaData);
        }

        return this;
    }

    /** Get metaData
     * 
     * @return metaData */
    public MetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }

    public BaseInfo withVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }

    /** 原始视频文件的访问地址。
     * 
     * @return videoUrl */
    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public BaseInfo withCoverInfoArray(List<CoverInfo> coverInfoArray) {
        this.coverInfoArray = coverInfoArray;
        return this;
    }

    public BaseInfo addCoverInfoArrayItem(CoverInfo coverInfoArrayItem) {
        if (this.coverInfoArray == null) {
            this.coverInfoArray = new ArrayList<>();
        }
        this.coverInfoArray.add(coverInfoArrayItem);
        return this;
    }

    public BaseInfo withCoverInfoArray(Consumer<List<CoverInfo>> coverInfoArraySetter) {
        if (this.coverInfoArray == null) {
            this.coverInfoArray = new ArrayList<>();
        }
        coverInfoArraySetter.accept(this.coverInfoArray);
        return this;
    }

    /** 封面信息。
     * 
     * @return coverInfoArray */
    public List<CoverInfo> getCoverInfoArray() {
        return coverInfoArray;
    }

    public void setCoverInfoArray(List<CoverInfo> coverInfoArray) {
        this.coverInfoArray = coverInfoArray;
    }

    public BaseInfo withSubtitleInfo(List<SubtitleInfo> subtitleInfo) {
        this.subtitleInfo = subtitleInfo;
        return this;
    }

    public BaseInfo addSubtitleInfoItem(SubtitleInfo subtitleInfoItem) {
        if (this.subtitleInfo == null) {
            this.subtitleInfo = new ArrayList<>();
        }
        this.subtitleInfo.add(subtitleInfoItem);
        return this;
    }

    public BaseInfo withSubtitleInfo(Consumer<List<SubtitleInfo>> subtitleInfoSetter) {
        if (this.subtitleInfo == null) {
            this.subtitleInfo = new ArrayList<>();
        }
        subtitleInfoSetter.accept(this.subtitleInfo);
        return this;
    }

    /** 字幕信息数组
     * 
     * @return subtitleInfo */
    public List<SubtitleInfo> getSubtitleInfo() {
        return subtitleInfo;
    }

    public void setSubtitleInfo(List<SubtitleInfo> subtitleInfo) {
        this.subtitleInfo = subtitleInfo;
    }

    public BaseInfo withSourcePath(FileAddr sourcePath) {
        this.sourcePath = sourcePath;
        return this;
    }

    public BaseInfo withSourcePath(Consumer<FileAddr> sourcePathSetter) {
        if (this.sourcePath == null) {
            this.sourcePath = new FileAddr();
            sourcePathSetter.accept(this.sourcePath);
        }

        return this;
    }

    /** Get sourcePath
     * 
     * @return sourcePath */
    public FileAddr getSourcePath() {
        return sourcePath;
    }

    public void setSourcePath(FileAddr sourcePath) {
        this.sourcePath = sourcePath;
    }

    public BaseInfo withOutputPath(FileAddr outputPath) {
        this.outputPath = outputPath;
        return this;
    }

    public BaseInfo withOutputPath(Consumer<FileAddr> outputPathSetter) {
        if (this.outputPath == null) {
            this.outputPath = new FileAddr();
            outputPathSetter.accept(this.outputPath);
        }

        return this;
    }

    /** Get outputPath
     * 
     * @return outputPath */
    public FileAddr getOutputPath() {
        return outputPath;
    }

    public void setOutputPath(FileAddr outputPath) {
        this.outputPath = outputPath;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BaseInfo baseInfo = (BaseInfo) o;
        return Objects.equals(this.title, baseInfo.title) && Objects.equals(this.videoName, baseInfo.videoName)
            && Objects.equals(this.description, baseInfo.description)
            && Objects.equals(this.categoryId, baseInfo.categoryId)
            && Objects.equals(this.categoryName, baseInfo.categoryName)
            && Objects.equals(this.createTime, baseInfo.createTime)
            && Objects.equals(this.lastModified, baseInfo.lastModified)
            && Objects.equals(this.videoType, baseInfo.videoType) && Objects.equals(this.tags, baseInfo.tags)
            && Objects.equals(this.metaData, baseInfo.metaData) && Objects.equals(this.videoUrl, baseInfo.videoUrl)
            && Objects.equals(this.coverInfoArray, baseInfo.coverInfoArray)
            && Objects.equals(this.subtitleInfo, baseInfo.subtitleInfo)
            && Objects.equals(this.sourcePath, baseInfo.sourcePath)
            && Objects.equals(this.outputPath, baseInfo.outputPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title,
            videoName,
            description,
            categoryId,
            categoryName,
            createTime,
            lastModified,
            videoType,
            tags,
            metaData,
            videoUrl,
            coverInfoArray,
            subtitleInfo,
            sourcePath,
            outputPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BaseInfo {\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    videoName: ").append(toIndentedString(videoName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
        sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
        sb.append("    videoType: ").append(toIndentedString(videoType)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
        sb.append("    videoUrl: ").append(toIndentedString(videoUrl)).append("\n");
        sb.append("    coverInfoArray: ").append(toIndentedString(coverInfoArray)).append("\n");
        sb.append("    subtitleInfo: ").append(toIndentedString(subtitleInfo)).append("\n");
        sb.append("    sourcePath: ").append(toIndentedString(sourcePath)).append("\n");
        sb.append("    outputPath: ").append(toIndentedString(outputPath)).append("\n");
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
