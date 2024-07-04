package com.huaweicloud.sdk.vias.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateVideoSourceDto
 */
public class CreateVideoSourceDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_source_name")

    private String videoSourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_type")

    private String accessType;

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
    @JsonProperty(value = "video_group_ids")

    private List<String> videoGroupIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type_config")

    private String typeConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private List<String> tag = null;

    public CreateVideoSourceDto withVideoSourceName(String videoSourceName) {
        this.videoSourceName = videoSourceName;
        return this;
    }

    /**
     * 视频源名称，只支持中文、英文字母（a-z,A-Z）、数字、特殊字符（空格.-_() （）），不能以空格开头和结尾
     * @return videoSourceName
     */
    public String getVideoSourceName() {
        return videoSourceName;
    }

    public void setVideoSourceName(String videoSourceName) {
        this.videoSourceName = videoSourceName;
    }

    public CreateVideoSourceDto withAccessType(String accessType) {
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

    public CreateVideoSourceDto withType(String type) {
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

    public CreateVideoSourceDto withLatitude(String latitude) {
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

    public CreateVideoSourceDto withLongitude(String longitude) {
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

    public CreateVideoSourceDto withVideoGroupIds(List<String> videoGroupIds) {
        this.videoGroupIds = videoGroupIds;
        return this;
    }

    public CreateVideoSourceDto addVideoGroupIdsItem(String videoGroupIdsItem) {
        if (this.videoGroupIds == null) {
            this.videoGroupIds = new ArrayList<>();
        }
        this.videoGroupIds.add(videoGroupIdsItem);
        return this;
    }

    public CreateVideoSourceDto withVideoGroupIds(Consumer<List<String>> videoGroupIdsSetter) {
        if (this.videoGroupIds == null) {
            this.videoGroupIds = new ArrayList<>();
        }
        videoGroupIdsSetter.accept(this.videoGroupIds);
        return this;
    }

    /**
     * 系统中所有的视频源分组，只能由小写英文字母(a~z)、数字(0~9)、中划线(-)、下划线(_)组成, 长度范围为[4, 36]
     * @return videoGroupIds
     */
    public List<String> getVideoGroupIds() {
        return videoGroupIds;
    }

    public void setVideoGroupIds(List<String> videoGroupIds) {
        this.videoGroupIds = videoGroupIds;
    }

    public CreateVideoSourceDto withTypeConfig(String typeConfig) {
        this.typeConfig = typeConfig;
        return this;
    }

    /**
     * 视频源配置信息xml url形式： \\<type>URL\\</type> \\<config> <URL_ADDRESS>\\</URL_ADDRESS> \\</config> vcn形式： \\<type>VCN\\</type> \\<config> <DATA_SOURCE_ID>\\</DATA_SOURCE_ID> <STREAM_TYPE>\\</STREAM_TYPE> \\<IP>\\</IP> \\<PORT>\\</PORT> <USER_NAME>\\</USER_NAME> \\<PASSWORD>\\</PASSWORD> \\</config> restful形式： \\<type>RESTFUL\\</type> \\<config> \\<HTTP_CHECK>\\</HTTP_CHECK> \\<URL>\\</URL> <RTSP_URL>\\</RTSP_URL> \\</config> camera形式： \\<type>CAMERA\\</type> \\<config> <EDGE_CAMERA_ID>\\</EDGE_CAMERA_ID> \\</config>
     * @return typeConfig
     */
    public String getTypeConfig() {
        return typeConfig;
    }

    public void setTypeConfig(String typeConfig) {
        this.typeConfig = typeConfig;
    }

    public CreateVideoSourceDto withTag(List<String> tag) {
        this.tag = tag;
        return this;
    }

    public CreateVideoSourceDto addTagItem(String tagItem) {
        if (this.tag == null) {
            this.tag = new ArrayList<>();
        }
        this.tag.add(tagItem);
        return this;
    }

    public CreateVideoSourceDto withTag(Consumer<List<String>> tagSetter) {
        if (this.tag == null) {
            this.tag = new ArrayList<>();
        }
        tagSetter.accept(this.tag);
        return this;
    }

    /**
     * 视频源标签，标签最多选择4个，标签内容只能由中文， 英文字母(a~z, A~Z)、数字(0~9)、中划线(-)、下划线(_)组成,  最小长度：1 最大长度：10
     * @return tag
     */
    public List<String> getTag() {
        return tag;
    }

    public void setTag(List<String> tag) {
        this.tag = tag;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateVideoSourceDto that = (CreateVideoSourceDto) obj;
        return Objects.equals(this.videoSourceName, that.videoSourceName)
            && Objects.equals(this.accessType, that.accessType) && Objects.equals(this.type, that.type)
            && Objects.equals(this.latitude, that.latitude) && Objects.equals(this.longitude, that.longitude)
            && Objects.equals(this.videoGroupIds, that.videoGroupIds)
            && Objects.equals(this.typeConfig, that.typeConfig) && Objects.equals(this.tag, that.tag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoSourceName, accessType, type, latitude, longitude, videoGroupIds, typeConfig, tag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVideoSourceDto {\n");
        sb.append("    videoSourceName: ").append(toIndentedString(videoSourceName)).append("\n");
        sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
        sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
        sb.append("    videoGroupIds: ").append(toIndentedString(videoGroupIds)).append("\n");
        sb.append("    typeConfig: ").append(toIndentedString(typeConfig)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
