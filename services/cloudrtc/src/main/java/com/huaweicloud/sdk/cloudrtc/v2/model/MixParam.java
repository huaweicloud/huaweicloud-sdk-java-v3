package com.huaweicloud.sdk.cloudrtc.v2.model;

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
 * 合流参数  - 纯音频录制  encode_template 填 audio_only，音频合流会动态选择最大三方的声音。  layout_template、layout_panes 以及其他视频相关参数都不填，填就忽略。  - 音视频录制（包括共享桌面）  encode_template 非 audio_only，layout_template必须非空。  音频合流会动态选择最大三方的声音 
 */
public class MixParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "room_id")

    private String roomId;

    /**
     * 输出编码模板名称 - 1920*1080_30_4620：输出流是1080p，帧率30，码率4.62Mbps - 1920*1080_30_3150：输出流是1080p，帧率30，码率3.15Mbps - 1920*1080_15_3460：输出流是1080p，帧率15，码率3.46Mbps - 1920*1080_15_2080：输出流是1080p，帧率15，码率2.08Mbps - 1280*720_30_3420：输出流是720p，帧率30，码率3.42Mbps - 1280*720_30_1710：输出流是720p，帧率30，码率1.71Mbps - 1280*720_15_2260：输出流是720p，帧率15，码率2.26Mbps - 1280*720_15_1130：输出流是720p，帧率15，码率1.13Mbps - 640*480_30_1500：输出流是480p，帧率30，码率1.50Mbps - 640*480_15_500：输出流是480p，帧率15，码率500Kbps - 640*480_30_1000 输出流是480p，帧率30，码率1000Kbps - 480*360_30_490：输出流是360p，帧率30，码率490Kbps - 480*360_15_320：输出流是360p，帧率15，码率320Kbps 
     */
    public static final class EncodeTemplateEnum {

        /**
         * Enum _1920_1080_30_4620 for value: "1920*1080_30_4620"
         */
        public static final EncodeTemplateEnum _1920_1080_30_4620 = new EncodeTemplateEnum("1920*1080_30_4620");

        /**
         * Enum _1920_1080_30_3150 for value: "1920*1080_30_3150"
         */
        public static final EncodeTemplateEnum _1920_1080_30_3150 = new EncodeTemplateEnum("1920*1080_30_3150");

        /**
         * Enum _1920_1080_15_3460 for value: "1920*1080_15_3460"
         */
        public static final EncodeTemplateEnum _1920_1080_15_3460 = new EncodeTemplateEnum("1920*1080_15_3460");

        /**
         * Enum _1920_1080_15_2080 for value: "1920*1080_15_2080"
         */
        public static final EncodeTemplateEnum _1920_1080_15_2080 = new EncodeTemplateEnum("1920*1080_15_2080");

        /**
         * Enum _1280_720_30_3420 for value: "1280*720_30_3420"
         */
        public static final EncodeTemplateEnum _1280_720_30_3420 = new EncodeTemplateEnum("1280*720_30_3420");

        /**
         * Enum _1280_720_30_1710 for value: "1280*720_30_1710"
         */
        public static final EncodeTemplateEnum _1280_720_30_1710 = new EncodeTemplateEnum("1280*720_30_1710");

        /**
         * Enum _1280_720_15_2260 for value: "1280*720_15_2260"
         */
        public static final EncodeTemplateEnum _1280_720_15_2260 = new EncodeTemplateEnum("1280*720_15_2260");

        /**
         * Enum _1280_720_15_1130 for value: "1280*720_15_1130"
         */
        public static final EncodeTemplateEnum _1280_720_15_1130 = new EncodeTemplateEnum("1280*720_15_1130");

        /**
         * Enum _640_480_30_1000 for value: "640*480_30_1000"
         */
        public static final EncodeTemplateEnum _640_480_30_1000 = new EncodeTemplateEnum("640*480_30_1000");

        /**
         * Enum _640_480_30_1500 for value: "640*480_30_1500"
         */
        public static final EncodeTemplateEnum _640_480_30_1500 = new EncodeTemplateEnum("640*480_30_1500");

        /**
         * Enum _640_480_15_500 for value: "640*480_15_500"
         */
        public static final EncodeTemplateEnum _640_480_15_500 = new EncodeTemplateEnum("640*480_15_500");

        /**
         * Enum _480_360_30_490 for value: "480*360_30_490"
         */
        public static final EncodeTemplateEnum _480_360_30_490 = new EncodeTemplateEnum("480*360_30_490");

        /**
         * Enum _480_360_15_320 for value: "480*360_15_320"
         */
        public static final EncodeTemplateEnum _480_360_15_320 = new EncodeTemplateEnum("480*360_15_320");

        private static final Map<String, EncodeTemplateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EncodeTemplateEnum> createStaticFields() {
            Map<String, EncodeTemplateEnum> map = new HashMap<>();
            map.put("1920*1080_30_4620", _1920_1080_30_4620);
            map.put("1920*1080_30_3150", _1920_1080_30_3150);
            map.put("1920*1080_15_3460", _1920_1080_15_3460);
            map.put("1920*1080_15_2080", _1920_1080_15_2080);
            map.put("1280*720_30_3420", _1280_720_30_3420);
            map.put("1280*720_30_1710", _1280_720_30_1710);
            map.put("1280*720_15_2260", _1280_720_15_2260);
            map.put("1280*720_15_1130", _1280_720_15_1130);
            map.put("640*480_30_1000", _640_480_30_1000);
            map.put("640*480_30_1500", _640_480_30_1500);
            map.put("640*480_15_500", _640_480_15_500);
            map.put("480*360_30_490", _480_360_30_490);
            map.put("480*360_15_320", _480_360_15_320);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EncodeTemplateEnum(String value) {
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
        public static EncodeTemplateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EncodeTemplateEnum(value));
        }

        public static EncodeTemplateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EncodeTemplateEnum) {
                return this.value.equals(((EncodeTemplateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encode_template")

    private EncodeTemplateEnum encodeTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_idle_time")

    private Integer maxIdleTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "layout_template")

    private String layoutTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_user_background_image")

    private String defaultUserBackgroundImage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "screen_background_image")

    private String screenBackgroundImage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "background_image")

    private String backgroundImage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "layout_panes")

    private List<MixLayoutPane> layoutPanes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_background_images")

    private List<MixUserBackgroundImage> userBackgroundImages = null;

    public MixParam withRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }

    /**
     * 房间id
     * @return roomId
     */
    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public MixParam withEncodeTemplate(EncodeTemplateEnum encodeTemplate) {
        this.encodeTemplate = encodeTemplate;
        return this;
    }

    /**
     * 输出编码模板名称 - 1920*1080_30_4620：输出流是1080p，帧率30，码率4.62Mbps - 1920*1080_30_3150：输出流是1080p，帧率30，码率3.15Mbps - 1920*1080_15_3460：输出流是1080p，帧率15，码率3.46Mbps - 1920*1080_15_2080：输出流是1080p，帧率15，码率2.08Mbps - 1280*720_30_3420：输出流是720p，帧率30，码率3.42Mbps - 1280*720_30_1710：输出流是720p，帧率30，码率1.71Mbps - 1280*720_15_2260：输出流是720p，帧率15，码率2.26Mbps - 1280*720_15_1130：输出流是720p，帧率15，码率1.13Mbps - 640*480_30_1500：输出流是480p，帧率30，码率1.50Mbps - 640*480_15_500：输出流是480p，帧率15，码率500Kbps - 640*480_30_1000 输出流是480p，帧率30，码率1000Kbps - 480*360_30_490：输出流是360p，帧率30，码率490Kbps - 480*360_15_320：输出流是360p，帧率15，码率320Kbps 
     * @return encodeTemplate
     */
    public EncodeTemplateEnum getEncodeTemplate() {
        return encodeTemplate;
    }

    public void setEncodeTemplate(EncodeTemplateEnum encodeTemplate) {
        this.encodeTemplate = encodeTemplate;
    }

    public MixParam withMaxIdleTime(Integer maxIdleTime) {
        this.maxIdleTime = maxIdleTime;
        return this;
    }

    /**
     * 最长空闲频道时间。  取值范围：[5，43200]，默认值为30。  单位：秒。  如果频道内无连麦方的状态持续超过该时间，录制程序会自动退出。退出后，再次调用start请求，会产生新的录制任务。  连麦方指：joiner或者publisher的用户。 
     * minimum: 5
     * maximum: 43200
     * @return maxIdleTime
     */
    public Integer getMaxIdleTime() {
        return maxIdleTime;
    }

    public void setMaxIdleTime(Integer maxIdleTime) {
        this.maxIdleTime = maxIdleTime;
    }

    public MixParam withLayoutTemplate(String layoutTemplate) {
        this.layoutTemplate = layoutTemplate;
        return this;
    }

    /**
     * 视频布局模板编号，不混视频的时候，不需要带。 - nine_grids_view：九宫格模板（自适应模板） - screen_share_left：主视图在左边的屏幕共享模板（自适应模板） - screen_share_right：主视图在右边的屏幕共享模板（自适应模板） - custom：自定义布局 
     * @return layoutTemplate
     */
    public String getLayoutTemplate() {
        return layoutTemplate;
    }

    public void setLayoutTemplate(String layoutTemplate) {
        this.layoutTemplate = layoutTemplate;
    }

    public MixParam withDefaultUserBackgroundImage(String defaultUserBackgroundImage) {
        this.defaultUserBackgroundImage = defaultUserBackgroundImage;
        return this;
    }

    /**
     * 默认用户背景图地址，图片先上传obs，格式s3://bucket/object。默认使用等比缩放裁剪，保证铺满。
     * @return defaultUserBackgroundImage
     */
    public String getDefaultUserBackgroundImage() {
        return defaultUserBackgroundImage;
    }

    public void setDefaultUserBackgroundImage(String defaultUserBackgroundImage) {
        this.defaultUserBackgroundImage = defaultUserBackgroundImage;
    }

    public MixParam withScreenBackgroundImage(String screenBackgroundImage) {
        this.screenBackgroundImage = screenBackgroundImage;
        return this;
    }

    /**
     * 共享屏幕的背景图地址，图片先上传obs，格式s3://bucket/object。  在一大多小的布局场景下，无论大窗是显示非指定用户（屏幕共享人的桌面）还是指定用户的共享桌面，都通过该字段指定背景图。 
     * @return screenBackgroundImage
     */
    public String getScreenBackgroundImage() {
        return screenBackgroundImage;
    }

    public void setScreenBackgroundImage(String screenBackgroundImage) {
        this.screenBackgroundImage = screenBackgroundImage;
    }

    public MixParam withBackgroundImage(String backgroundImage) {
        this.backgroundImage = backgroundImage;
        return this;
    }

    /**
     * 画布背景图地址，图片先上传obs，格式s3://bucket/object。默认使用等比缩放裁剪，保证铺满。
     * @return backgroundImage
     */
    public String getBackgroundImage() {
        return backgroundImage;
    }

    public void setBackgroundImage(String backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    public MixParam withLayoutPanes(List<MixLayoutPane> layoutPanes) {
        this.layoutPanes = layoutPanes;
        return this;
    }

    public MixParam addLayoutPanesItem(MixLayoutPane layoutPanesItem) {
        if (this.layoutPanes == null) {
            this.layoutPanes = new ArrayList<>();
        }
        this.layoutPanes.add(layoutPanesItem);
        return this;
    }

    public MixParam withLayoutPanes(Consumer<List<MixLayoutPane>> layoutPanesSetter) {
        if (this.layoutPanes == null) {
            this.layoutPanes = new ArrayList<>();
        }
        layoutPanesSetter.accept(this.layoutPanes);
        return this;
    }

    /**
     * 需要混流的视频列表。若不需要混流视频，则可不传递该参数。  nine_grids_view模板不需要填写本字段。 
     * @return layoutPanes
     */
    public List<MixLayoutPane> getLayoutPanes() {
        return layoutPanes;
    }

    public void setLayoutPanes(List<MixLayoutPane> layoutPanes) {
        this.layoutPanes = layoutPanes;
    }

    public MixParam withUserBackgroundImages(List<MixUserBackgroundImage> userBackgroundImages) {
        this.userBackgroundImages = userBackgroundImages;
        return this;
    }

    public MixParam addUserBackgroundImagesItem(MixUserBackgroundImage userBackgroundImagesItem) {
        if (this.userBackgroundImages == null) {
            this.userBackgroundImages = new ArrayList<>();
        }
        this.userBackgroundImages.add(userBackgroundImagesItem);
        return this;
    }

    public MixParam withUserBackgroundImages(Consumer<List<MixUserBackgroundImage>> userBackgroundImagesSetter) {
        if (this.userBackgroundImages == null) {
            this.userBackgroundImages = new ArrayList<>();
        }
        userBackgroundImagesSetter.accept(this.userBackgroundImages);
        return this;
    }

    /**
     * 指定用户背景图，优先级大于default_user_background_image
     * @return userBackgroundImages
     */
    public List<MixUserBackgroundImage> getUserBackgroundImages() {
        return userBackgroundImages;
    }

    public void setUserBackgroundImages(List<MixUserBackgroundImage> userBackgroundImages) {
        this.userBackgroundImages = userBackgroundImages;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MixParam that = (MixParam) obj;
        return Objects.equals(this.roomId, that.roomId) && Objects.equals(this.encodeTemplate, that.encodeTemplate)
            && Objects.equals(this.maxIdleTime, that.maxIdleTime)
            && Objects.equals(this.layoutTemplate, that.layoutTemplate)
            && Objects.equals(this.defaultUserBackgroundImage, that.defaultUserBackgroundImage)
            && Objects.equals(this.screenBackgroundImage, that.screenBackgroundImage)
            && Objects.equals(this.backgroundImage, that.backgroundImage)
            && Objects.equals(this.layoutPanes, that.layoutPanes)
            && Objects.equals(this.userBackgroundImages, that.userBackgroundImages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomId,
            encodeTemplate,
            maxIdleTime,
            layoutTemplate,
            defaultUserBackgroundImage,
            screenBackgroundImage,
            backgroundImage,
            layoutPanes,
            userBackgroundImages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MixParam {\n");
        sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
        sb.append("    encodeTemplate: ").append(toIndentedString(encodeTemplate)).append("\n");
        sb.append("    maxIdleTime: ").append(toIndentedString(maxIdleTime)).append("\n");
        sb.append("    layoutTemplate: ").append(toIndentedString(layoutTemplate)).append("\n");
        sb.append("    defaultUserBackgroundImage: ").append(toIndentedString(defaultUserBackgroundImage)).append("\n");
        sb.append("    screenBackgroundImage: ").append(toIndentedString(screenBackgroundImage)).append("\n");
        sb.append("    backgroundImage: ").append(toIndentedString(backgroundImage)).append("\n");
        sb.append("    layoutPanes: ").append(toIndentedString(layoutPanes)).append("\n");
        sb.append("    userBackgroundImages: ").append(toIndentedString(userBackgroundImages)).append("\n");
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
