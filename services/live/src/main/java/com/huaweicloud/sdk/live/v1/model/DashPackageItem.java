package com.huaweicloud.sdk.live.v1.model;

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
 * DASH频道出流信息
 */
public class DashPackageItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_selection")

    private List<StreamSelectionItem> streamSelection = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "segment_duration_seconds")

    private Integer segmentDurationSeconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "playlist_window_seconds")

    private Integer playlistWindowSeconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encryption")

    private Encryption encryption;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ads")

    private Object ads;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ext_args")

    private Object extArgs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_args")

    private PackageRequestArgs requestArgs;

    /**
     * 广告标识。  DASH取值：\"xml+bin\"。 
     */
    public static final class AdMarkerEnum {

        /**
         * Enum XML_BIN for value: "xml+bin"
         */
        public static final AdMarkerEnum XML_BIN = new AdMarkerEnum("xml+bin");

        /**
         * Enum XML for value: "xml"
         */
        public static final AdMarkerEnum XML = new AdMarkerEnum("xml");

        private static final Map<String, AdMarkerEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AdMarkerEnum> createStaticFields() {
            Map<String, AdMarkerEnum> map = new HashMap<>();
            map.put("xml+bin", XML_BIN);
            map.put("xml", XML);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AdMarkerEnum(String value) {
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
        public static AdMarkerEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AdMarkerEnum(value));
        }

        public static AdMarkerEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AdMarkerEnum) {
                return this.value.equals(((AdMarkerEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ad_marker")

    private AdMarkerEnum adMarker;

    public DashPackageItem withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 客户自定义的拉流地址，包括方法、域名、路径
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public DashPackageItem withStreamSelection(List<StreamSelectionItem> streamSelection) {
        this.streamSelection = streamSelection;
        return this;
    }

    public DashPackageItem addStreamSelectionItem(StreamSelectionItem streamSelectionItem) {
        if (this.streamSelection == null) {
            this.streamSelection = new ArrayList<>();
        }
        this.streamSelection.add(streamSelectionItem);
        return this;
    }

    public DashPackageItem withStreamSelection(Consumer<List<StreamSelectionItem>> streamSelectionSetter) {
        if (this.streamSelection == null) {
            this.streamSelection = new ArrayList<>();
        }
        streamSelectionSetter.accept(this.streamSelection);
        return this;
    }

    /**
     * 从全量流中过滤出一个码率在[min, max]区间的流。如果不需要码率过滤可不选。
     * @return streamSelection
     */
    public List<StreamSelectionItem> getStreamSelection() {
        return streamSelection;
    }

    public void setStreamSelection(List<StreamSelectionItem> streamSelection) {
        this.streamSelection = streamSelection;
    }

    public DashPackageItem withSegmentDurationSeconds(Integer segmentDurationSeconds) {
        this.segmentDurationSeconds = segmentDurationSeconds;
        return this;
    }

    /**
     * 频道输出分片的时长，为必选项  单位：秒。取值范围：1-10 > 修改分片时长会影响已录制内容的时移和回看服务，请谨慎修改！
     * minimum: 1
     * maximum: 10
     * @return segmentDurationSeconds
     */
    public Integer getSegmentDurationSeconds() {
        return segmentDurationSeconds;
    }

    public void setSegmentDurationSeconds(Integer segmentDurationSeconds) {
        this.segmentDurationSeconds = segmentDurationSeconds;
    }

    public DashPackageItem withPlaylistWindowSeconds(Integer playlistWindowSeconds) {
        this.playlistWindowSeconds = playlistWindowSeconds;
        return this;
    }

    /**
     * 频道直播返回分片的窗口长度，为频道输出分片的时长乘以数量后得到的值。实际返回的分片数不小于3个。  单位：秒。取值范围：0 - 86400（24小时转化成秒后的取值）
     * minimum: 0
     * maximum: 86400
     * @return playlistWindowSeconds
     */
    public Integer getPlaylistWindowSeconds() {
        return playlistWindowSeconds;
    }

    public void setPlaylistWindowSeconds(Integer playlistWindowSeconds) {
        this.playlistWindowSeconds = playlistWindowSeconds;
    }

    public DashPackageItem withEncryption(Encryption encryption) {
        this.encryption = encryption;
        return this;
    }

    public DashPackageItem withEncryption(Consumer<Encryption> encryptionSetter) {
        if (this.encryption == null) {
            this.encryption = new Encryption();
            encryptionSetter.accept(this.encryption);
        }

        return this;
    }

    /**
     * Get encryption
     * @return encryption
     */
    public Encryption getEncryption() {
        return encryption;
    }

    public void setEncryption(Encryption encryption) {
        this.encryption = encryption;
    }

    public DashPackageItem withAds(Object ads) {
        this.ads = ads;
        return this;
    }

    /**
     * 广告配置
     * @return ads
     */
    public Object getAds() {
        return ads;
    }

    public void setAds(Object ads) {
        this.ads = ads;
    }

    public DashPackageItem withExtArgs(Object extArgs) {
        this.extArgs = extArgs;
        return this;
    }

    /**
     * 其他额外参数
     * @return extArgs
     */
    public Object getExtArgs() {
        return extArgs;
    }

    public void setExtArgs(Object extArgs) {
        this.extArgs = extArgs;
    }

    public DashPackageItem withRequestArgs(PackageRequestArgs requestArgs) {
        this.requestArgs = requestArgs;
        return this;
    }

    public DashPackageItem withRequestArgs(Consumer<PackageRequestArgs> requestArgsSetter) {
        if (this.requestArgs == null) {
            this.requestArgs = new PackageRequestArgs();
            requestArgsSetter.accept(this.requestArgs);
        }

        return this;
    }

    /**
     * Get requestArgs
     * @return requestArgs
     */
    public PackageRequestArgs getRequestArgs() {
        return requestArgs;
    }

    public void setRequestArgs(PackageRequestArgs requestArgs) {
        this.requestArgs = requestArgs;
    }

    public DashPackageItem withAdMarker(AdMarkerEnum adMarker) {
        this.adMarker = adMarker;
        return this;
    }

    /**
     * 广告标识。  DASH取值：\"xml+bin\"。 
     * @return adMarker
     */
    public AdMarkerEnum getAdMarker() {
        return adMarker;
    }

    public void setAdMarker(AdMarkerEnum adMarker) {
        this.adMarker = adMarker;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DashPackageItem that = (DashPackageItem) obj;
        return Objects.equals(this.url, that.url) && Objects.equals(this.streamSelection, that.streamSelection)
            && Objects.equals(this.segmentDurationSeconds, that.segmentDurationSeconds)
            && Objects.equals(this.playlistWindowSeconds, that.playlistWindowSeconds)
            && Objects.equals(this.encryption, that.encryption) && Objects.equals(this.ads, that.ads)
            && Objects.equals(this.extArgs, that.extArgs) && Objects.equals(this.requestArgs, that.requestArgs)
            && Objects.equals(this.adMarker, that.adMarker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url,
            streamSelection,
            segmentDurationSeconds,
            playlistWindowSeconds,
            encryption,
            ads,
            extArgs,
            requestArgs,
            adMarker);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DashPackageItem {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    streamSelection: ").append(toIndentedString(streamSelection)).append("\n");
        sb.append("    segmentDurationSeconds: ").append(toIndentedString(segmentDurationSeconds)).append("\n");
        sb.append("    playlistWindowSeconds: ").append(toIndentedString(playlistWindowSeconds)).append("\n");
        sb.append("    encryption: ").append(toIndentedString(encryption)).append("\n");
        sb.append("    ads: ").append(toIndentedString(ads)).append("\n");
        sb.append("    extArgs: ").append(toIndentedString(extArgs)).append("\n");
        sb.append("    requestArgs: ").append(toIndentedString(requestArgs)).append("\n");
        sb.append("    adMarker: ").append(toIndentedString(adMarker)).append("\n");
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
