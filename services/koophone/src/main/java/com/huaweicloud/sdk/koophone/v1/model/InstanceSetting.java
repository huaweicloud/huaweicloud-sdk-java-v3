package com.huaweicloud.sdk.koophone.v1.model;

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
 * 实例设置内容
 */
public class InstanceSetting {

    /**
     * 网络类型，枚举：MOBILE_NETWORK/WIFI
     */
    public static final class NetworkTypeEnum {

        /**
         * Enum WIFI for value: "WIFI"
         */
        public static final NetworkTypeEnum WIFI = new NetworkTypeEnum("WIFI");

        /**
         * Enum MOBILE_NETWORK for value: "MOBILE_NETWORK"
         */
        public static final NetworkTypeEnum MOBILE_NETWORK = new NetworkTypeEnum("MOBILE_NETWORK");

        private static final Map<String, NetworkTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NetworkTypeEnum> createStaticFields() {
            Map<String, NetworkTypeEnum> map = new HashMap<>();
            map.put("WIFI", WIFI);
            map.put("MOBILE_NETWORK", MOBILE_NETWORK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NetworkTypeEnum(String value) {
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
        public static NetworkTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NetworkTypeEnum(value));
        }

        public static NetworkTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NetworkTypeEnum) {
                return this.value.equals(((NetworkTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_type")

    private NetworkTypeEnum networkType;

    /**
     * 编码类型，目前固定值H264
     */
    public static final class EncodingTypeEnum {

        /**
         * Enum H264 for value: "H264"
         */
        public static final EncodingTypeEnum H264 = new EncodingTypeEnum("H264");

        private static final Map<String, EncodingTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EncodingTypeEnum> createStaticFields() {
            Map<String, EncodingTypeEnum> map = new HashMap<>();
            map.put("H264", H264);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EncodingTypeEnum(String value) {
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
        public static EncodingTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EncodingTypeEnum(value));
        }

        public static EncodingTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EncodingTypeEnum) {
                return this.value.equals(((EncodingTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encoding_type")

    private EncodingTypeEnum encodingType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_spec_groups")

    private List<VideoSpecGroup> videoSpecGroups = null;

    public InstanceSetting withNetworkType(NetworkTypeEnum networkType) {
        this.networkType = networkType;
        return this;
    }

    /**
     * 网络类型，枚举：MOBILE_NETWORK/WIFI
     * @return networkType
     */
    public NetworkTypeEnum getNetworkType() {
        return networkType;
    }

    public void setNetworkType(NetworkTypeEnum networkType) {
        this.networkType = networkType;
    }

    public InstanceSetting withEncodingType(EncodingTypeEnum encodingType) {
        this.encodingType = encodingType;
        return this;
    }

    /**
     * 编码类型，目前固定值H264
     * @return encodingType
     */
    public EncodingTypeEnum getEncodingType() {
        return encodingType;
    }

    public void setEncodingType(EncodingTypeEnum encodingType) {
        this.encodingType = encodingType;
    }

    public InstanceSetting withVideoSpecGroups(List<VideoSpecGroup> videoSpecGroups) {
        this.videoSpecGroups = videoSpecGroups;
        return this;
    }

    public InstanceSetting addVideoSpecGroupsItem(VideoSpecGroup videoSpecGroupsItem) {
        if (this.videoSpecGroups == null) {
            this.videoSpecGroups = new ArrayList<>();
        }
        this.videoSpecGroups.add(videoSpecGroupsItem);
        return this;
    }

    public InstanceSetting withVideoSpecGroups(Consumer<List<VideoSpecGroup>> videoSpecGroupsSetter) {
        if (this.videoSpecGroups == null) {
            this.videoSpecGroups = new ArrayList<>();
        }
        videoSpecGroupsSetter.accept(this.videoSpecGroups);
        return this;
    }

    /**
     * 视频规格组
     * @return videoSpecGroups
     */
    public List<VideoSpecGroup> getVideoSpecGroups() {
        return videoSpecGroups;
    }

    public void setVideoSpecGroups(List<VideoSpecGroup> videoSpecGroups) {
        this.videoSpecGroups = videoSpecGroups;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceSetting that = (InstanceSetting) obj;
        return Objects.equals(this.networkType, that.networkType)
            && Objects.equals(this.encodingType, that.encodingType)
            && Objects.equals(this.videoSpecGroups, that.videoSpecGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(networkType, encodingType, videoSpecGroups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceSetting {\n");
        sb.append("    networkType: ").append(toIndentedString(networkType)).append("\n");
        sb.append("    encodingType: ").append(toIndentedString(encodingType)).append("\n");
        sb.append("    videoSpecGroups: ").append(toIndentedString(videoSpecGroups)).append("\n");
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
