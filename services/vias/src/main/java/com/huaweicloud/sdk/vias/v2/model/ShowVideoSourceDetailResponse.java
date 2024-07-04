package com.huaweicloud.sdk.vias.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowVideoSourceDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_source_name")

    private String videoSourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_type")

    private String accessType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private VideoSourceStatusInfoDto status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latitude")

    private String latitude;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "longitude")

    private String longitude;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at")

    private Long createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type_config")

    private String typeConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_packages")

    private List<VideoGroupInfoDto> videoPackages = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_config_templates")

    private List<VideoServiceConfigTemplateDto> serviceConfigTemplates = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_path")

    private String streamPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private String image;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private List<String> tag = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scene_recommend")

    private List<String> sceneRecommend = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_source_quality")

    private List<String> videoSourceQuality = null;

    public ShowVideoSourceDetailResponse withVideoSourceName(String videoSourceName) {
        this.videoSourceName = videoSourceName;
        return this;
    }

    /**
     * 视频源名称，只支持中文、英文字母（a-z,A-Z）、数字、特殊字符（空格.-_() （）），不能以空格开头和结尾 最小长度：1 最大长度：100
     * @return videoSourceName
     */
    public String getVideoSourceName() {
        return videoSourceName;
    }

    public void setVideoSourceName(String videoSourceName) {
        this.videoSourceName = videoSourceName;
    }

    public ShowVideoSourceDetailResponse withAccessType(String accessType) {
        this.accessType = accessType;
        return this;
    }

    /**
     * 接入类型（cloud、edge）
     * @return accessType
     */
    public String getAccessType() {
        return accessType;
    }

    public void setAccessType(String accessType) {
        this.accessType = accessType;
    }

    public ShowVideoSourceDetailResponse withStatus(VideoSourceStatusInfoDto status) {
        this.status = status;
        return this;
    }

    public ShowVideoSourceDetailResponse withStatus(Consumer<VideoSourceStatusInfoDto> statusSetter) {
        if (this.status == null) {
            this.status = new VideoSourceStatusInfoDto();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public VideoSourceStatusInfoDto getStatus() {
        return status;
    }

    public void setStatus(VideoSourceStatusInfoDto status) {
        this.status = status;
    }

    public ShowVideoSourceDetailResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * [类型:obs、vcn、url、restful、camera](tag:hc)[类型:obs、vcn、url、restful、camera、VIDEO_PLATFORM、VIDEO_IMAGE_DB、RTSP_STREAM](tag:hcs)
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowVideoSourceDetailResponse withLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * 视频源的地理位置信息，纬度，-90.00000~90.00000
     * @return latitude
     */
    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public ShowVideoSourceDetailResponse withLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * 视频源的地理位置信息，经度，-180.00000~180.00000
     * @return longitude
     */
    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public ShowVideoSourceDetailResponse withCreateAt(Long createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * 创建时间
     * @return createAt
     */
    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public ShowVideoSourceDetailResponse withTypeConfig(String typeConfig) {
        this.typeConfig = typeConfig;
        return this;
    }

    /**
     * 视频源配置信息xml
     * @return typeConfig
     */
    public String getTypeConfig() {
        return typeConfig;
    }

    public void setTypeConfig(String typeConfig) {
        this.typeConfig = typeConfig;
    }

    public ShowVideoSourceDetailResponse withVideoPackages(List<VideoGroupInfoDto> videoPackages) {
        this.videoPackages = videoPackages;
        return this;
    }

    public ShowVideoSourceDetailResponse addVideoPackagesItem(VideoGroupInfoDto videoPackagesItem) {
        if (this.videoPackages == null) {
            this.videoPackages = new ArrayList<>();
        }
        this.videoPackages.add(videoPackagesItem);
        return this;
    }

    public ShowVideoSourceDetailResponse withVideoPackages(Consumer<List<VideoGroupInfoDto>> videoPackagesSetter) {
        if (this.videoPackages == null) {
            this.videoPackages = new ArrayList<>();
        }
        videoPackagesSetter.accept(this.videoPackages);
        return this;
    }

    /**
     * 视频源所在分组
     * @return videoPackages
     */
    public List<VideoGroupInfoDto> getVideoPackages() {
        return videoPackages;
    }

    public void setVideoPackages(List<VideoGroupInfoDto> videoPackages) {
        this.videoPackages = videoPackages;
    }

    public ShowVideoSourceDetailResponse withServiceConfigTemplates(
        List<VideoServiceConfigTemplateDto> serviceConfigTemplates) {
        this.serviceConfigTemplates = serviceConfigTemplates;
        return this;
    }

    public ShowVideoSourceDetailResponse addServiceConfigTemplatesItem(
        VideoServiceConfigTemplateDto serviceConfigTemplatesItem) {
        if (this.serviceConfigTemplates == null) {
            this.serviceConfigTemplates = new ArrayList<>();
        }
        this.serviceConfigTemplates.add(serviceConfigTemplatesItem);
        return this;
    }

    public ShowVideoSourceDetailResponse withServiceConfigTemplates(
        Consumer<List<VideoServiceConfigTemplateDto>> serviceConfigTemplatesSetter) {
        if (this.serviceConfigTemplates == null) {
            this.serviceConfigTemplates = new ArrayList<>();
        }
        serviceConfigTemplatesSetter.accept(this.serviceConfigTemplates);
        return this;
    }

    /**
     * 算法模板体
     * @return serviceConfigTemplates
     */
    public List<VideoServiceConfigTemplateDto> getServiceConfigTemplates() {
        return serviceConfigTemplates;
    }

    public void setServiceConfigTemplates(List<VideoServiceConfigTemplateDto> serviceConfigTemplates) {
        this.serviceConfigTemplates = serviceConfigTemplates;
    }

    public ShowVideoSourceDetailResponse withStreamPath(String streamPath) {
        this.streamPath = streamPath;
        return this;
    }

    /**
     * 流地址
     * @return streamPath
     */
    public String getStreamPath() {
        return streamPath;
    }

    public void setStreamPath(String streamPath) {
        this.streamPath = streamPath;
    }

    public ShowVideoSourceDetailResponse withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * 视频源截图的base64转码
     * @return image
     */
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public ShowVideoSourceDetailResponse withTag(List<String> tag) {
        this.tag = tag;
        return this;
    }

    public ShowVideoSourceDetailResponse addTagItem(String tagItem) {
        if (this.tag == null) {
            this.tag = new ArrayList<>();
        }
        this.tag.add(tagItem);
        return this;
    }

    public ShowVideoSourceDetailResponse withTag(Consumer<List<String>> tagSetter) {
        if (this.tag == null) {
            this.tag = new ArrayList<>();
        }
        tagSetter.accept(this.tag);
        return this;
    }

    /**
     * 视频源标签，标签最多选择4个，标签内容只能由中文， 英文字母(a~z, A~Z)、数字(0~9)、中划线(-)、下划线(_)组成, 最小长度：1 最大长度：10
     * @return tag
     */
    public List<String> getTag() {
        return tag;
    }

    public void setTag(List<String> tag) {
        this.tag = tag;
    }

    public ShowVideoSourceDetailResponse withSceneRecommend(List<String> sceneRecommend) {
        this.sceneRecommend = sceneRecommend;
        return this;
    }

    public ShowVideoSourceDetailResponse addSceneRecommendItem(String sceneRecommendItem) {
        if (this.sceneRecommend == null) {
            this.sceneRecommend = new ArrayList<>();
        }
        this.sceneRecommend.add(sceneRecommendItem);
        return this;
    }

    public ShowVideoSourceDetailResponse withSceneRecommend(Consumer<List<String>> sceneRecommendSetter) {
        if (this.sceneRecommend == null) {
            this.sceneRecommend = new ArrayList<>();
        }
        sceneRecommendSetter.accept(this.sceneRecommend);
        return this;
    }

    /**
     * 智能算法推荐的标签
     * @return sceneRecommend
     */
    public List<String> getSceneRecommend() {
        return sceneRecommend;
    }

    public void setSceneRecommend(List<String> sceneRecommend) {
        this.sceneRecommend = sceneRecommend;
    }

    public ShowVideoSourceDetailResponse withVideoSourceQuality(List<String> videoSourceQuality) {
        this.videoSourceQuality = videoSourceQuality;
        return this;
    }

    public ShowVideoSourceDetailResponse addVideoSourceQualityItem(String videoSourceQualityItem) {
        if (this.videoSourceQuality == null) {
            this.videoSourceQuality = new ArrayList<>();
        }
        this.videoSourceQuality.add(videoSourceQualityItem);
        return this;
    }

    public ShowVideoSourceDetailResponse withVideoSourceQuality(Consumer<List<String>> videoSourceQualitySetter) {
        if (this.videoSourceQuality == null) {
            this.videoSourceQuality = new ArrayList<>();
        }
        videoSourceQualitySetter.accept(this.videoSourceQuality);
        return this;
    }

    /**
     * 视频源的视频流质量： Blurry：画面模糊； ColorDistortion：画面颜色失真； AbnormalLight：画面光线异常； ScreenSplash：画面花屏异常； ScreenJitter：画面抖动； ScreenMovement：画面移动； SceneUpheaval：画面剧变； ScreenFreeze：画面冻结； BlackScreen：黑屏； SnowNoise：雪花噪声； Occlude：遮挡; GrayScreen：灰屏；ScreenSmudge：画面污迹
     * @return videoSourceQuality
     */
    public List<String> getVideoSourceQuality() {
        return videoSourceQuality;
    }

    public void setVideoSourceQuality(List<String> videoSourceQuality) {
        this.videoSourceQuality = videoSourceQuality;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowVideoSourceDetailResponse that = (ShowVideoSourceDetailResponse) obj;
        return Objects.equals(this.videoSourceName, that.videoSourceName)
            && Objects.equals(this.accessType, that.accessType) && Objects.equals(this.status, that.status)
            && Objects.equals(this.type, that.type) && Objects.equals(this.latitude, that.latitude)
            && Objects.equals(this.longitude, that.longitude) && Objects.equals(this.createAt, that.createAt)
            && Objects.equals(this.typeConfig, that.typeConfig)
            && Objects.equals(this.videoPackages, that.videoPackages)
            && Objects.equals(this.serviceConfigTemplates, that.serviceConfigTemplates)
            && Objects.equals(this.streamPath, that.streamPath) && Objects.equals(this.image, that.image)
            && Objects.equals(this.tag, that.tag) && Objects.equals(this.sceneRecommend, that.sceneRecommend)
            && Objects.equals(this.videoSourceQuality, that.videoSourceQuality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoSourceName,
            accessType,
            status,
            type,
            latitude,
            longitude,
            createAt,
            typeConfig,
            videoPackages,
            serviceConfigTemplates,
            streamPath,
            image,
            tag,
            sceneRecommend,
            videoSourceQuality);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVideoSourceDetailResponse {\n");
        sb.append("    videoSourceName: ").append(toIndentedString(videoSourceName)).append("\n");
        sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
        sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    typeConfig: ").append(toIndentedString(typeConfig)).append("\n");
        sb.append("    videoPackages: ").append(toIndentedString(videoPackages)).append("\n");
        sb.append("    serviceConfigTemplates: ").append(toIndentedString(serviceConfigTemplates)).append("\n");
        sb.append("    streamPath: ").append(toIndentedString(streamPath)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    sceneRecommend: ").append(toIndentedString(sceneRecommend)).append("\n");
        sb.append("    videoSourceQuality: ").append(toIndentedString(videoSourceQuality)).append("\n");
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
