package com.huaweicloud.sdk.cloudrtc.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** 录制视频混流参数。 用法如下： 如果某窗格需要展示某个固定用户的视频： 例如:{ \&quot;id\&quot;: 1, \&quot;user_id\&quot;: \&quot;user001\&quot;,
 * \&quot;video_type\&quot;: \&quot;CAMERASTREAM\&quot; } 如果某窗格需要展示某个固定用户的共享屏幕： 例如:{ \&quot;id\&quot;: 1,
 * \&quot;user_id\&quot;: \&quot;user001\&quot;, \&quot;video_type\&quot;: \&quot;SCREENSTREAM\&quot; }
 * 如果某窗格需要展示共享桌面，不特定用户： 例如:{ \&quot;id\&quot;: 1, \&quot;video_type\&quot;: \&quot;SCREENSTREAM\&quot;} */
public class MixLayoutPane {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    /** 标识视频流的类型，可选摄像头流或者屏幕分享流。 - CAMERASTREAM：摄像头视频流 - SCREENSTREAM：屏幕分享视频流 默认为CAMERASTREAM。 */
    public static final class VideoTypeEnum {

        /** Enum CAMERASTREAM for value: "CAMERASTREAM" */
        public static final VideoTypeEnum CAMERASTREAM = new VideoTypeEnum("CAMERASTREAM");

        /** Enum SCREENSTREAM for value: "SCREENSTREAM" */
        public static final VideoTypeEnum SCREENSTREAM = new VideoTypeEnum("SCREENSTREAM");

        private static final Map<String, VideoTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VideoTypeEnum> createStaticFields() {
            Map<String, VideoTypeEnum> map = new HashMap<>();
            map.put("CAMERASTREAM", CAMERASTREAM);
            map.put("SCREENSTREAM", SCREENSTREAM);
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
            VideoTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new VideoTypeEnum(value);
            }
            return result;
        }

        public static VideoTypeEnum valueOf(String value) {
            if (value == null) {
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
    @JsonProperty(value = "video_type")

    private VideoTypeEnum videoType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x")

    private Float x;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "y")

    private Float y;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "width")

    private Float width;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    private Float height;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zorder")

    private Integer zorder;

    /** 裁剪模式，自定义布局场景下填写本字段，支持两种模式： - KEEP_RATIO_PADDING ：保持比例留边。 - KEEP_RATIO_CROP ：保持比例裁剪。 */
    public static final class CropModeEnum {

        /** Enum KEEP_RATIO_PADDING for value: "KEEP_RATIO_PADDING" */
        public static final CropModeEnum KEEP_RATIO_PADDING = new CropModeEnum("KEEP_RATIO_PADDING");

        /** Enum KEEP_RATIO_CROP for value: "KEEP_RATIO_CROP" */
        public static final CropModeEnum KEEP_RATIO_CROP = new CropModeEnum("KEEP_RATIO_CROP");

        private static final Map<String, CropModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CropModeEnum> createStaticFields() {
            Map<String, CropModeEnum> map = new HashMap<>();
            map.put("KEEP_RATIO_PADDING", KEEP_RATIO_PADDING);
            map.put("KEEP_RATIO_CROP", KEEP_RATIO_CROP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CropModeEnum(String value) {
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
        public static CropModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            CropModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new CropModeEnum(value);
            }
            return result;
        }

        public static CropModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            CropModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CropModeEnum) {
                return this.value.equals(((CropModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "crop_mode")

    private CropModeEnum cropMode;

    public MixLayoutPane withId(Integer id) {
        this.id = id;
        return this;
    }

    /** 窗口id，从1开始编号 minimum: 1 maximum: 25
     * 
     * @return id */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public MixLayoutPane withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /** 加入房间的用户id
     * 
     * @return userId */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public MixLayoutPane withVideoType(VideoTypeEnum videoType) {
        this.videoType = videoType;
        return this;
    }

    /** 标识视频流的类型，可选摄像头流或者屏幕分享流。 - CAMERASTREAM：摄像头视频流 - SCREENSTREAM：屏幕分享视频流 默认为CAMERASTREAM。
     * 
     * @return videoType */
    public VideoTypeEnum getVideoType() {
        return videoType;
    }

    public void setVideoType(VideoTypeEnum videoType) {
        this.videoType = videoType;
    }

    public MixLayoutPane withX(Float x) {
        this.x = x;
        return this;
    }

    /** 坐标x，归一化百分比，画布上该画面左上角的横坐标的相对值，范围是 [0.0,1.0]。从左到右布局，0.0在最左端，1.0在最右端，小数取值范围在float内，自定义布局场景下填写本字段。 minimum: 0
     * maximum: 1
     * 
     * @return x */
    public Float getX() {
        return x;
    }

    public void setX(Float x) {
        this.x = x;
    }

    public MixLayoutPane withY(Float y) {
        this.y = y;
        return this;
    }

    /** 坐标y，归一化百分比，画布上该画面左上角的纵坐标的相对值，范围是 [0.0,1.0]。从上到下布局，0.0在最上端，1.0在最下端，小数取值范围在float内，自定义布局场景下填写本字段。 minimum: 0
     * maximum: 1
     * 
     * @return y */
    public Float getY() {
        return y;
    }

    public void setY(Float y) {
        this.y = y;
    }

    public MixLayoutPane withWidth(Float width) {
        this.width = width;
        return this;
    }

    /** 窗格宽，归一化百分比，小数取值范围在float内，自定义布局场景下填写本字段。 minimum: 0 maximum: 1
     * 
     * @return width */
    public Float getWidth() {
        return width;
    }

    public void setWidth(Float width) {
        this.width = width;
    }

    public MixLayoutPane withHeight(Float height) {
        this.height = height;
        return this;
    }

    /** 窗格宽，归一化百分比，小数取值范围在float内，自定义布局场景下填写本字段。 minimum: 0 maximum: 1
     * 
     * @return height */
    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public MixLayoutPane withZorder(Integer zorder) {
        this.zorder = zorder;
        return this;
    }

    /** 叠放顺序，0为最底层，1层在0层之上，以此类推，最大支持25层，自定义布局场景下填写本字段。 minimum: 0 maximum: 24
     * 
     * @return zorder */
    public Integer getZorder() {
        return zorder;
    }

    public void setZorder(Integer zorder) {
        this.zorder = zorder;
    }

    public MixLayoutPane withCropMode(CropModeEnum cropMode) {
        this.cropMode = cropMode;
        return this;
    }

    /** 裁剪模式，自定义布局场景下填写本字段，支持两种模式： - KEEP_RATIO_PADDING ：保持比例留边。 - KEEP_RATIO_CROP ：保持比例裁剪。
     * 
     * @return cropMode */
    public CropModeEnum getCropMode() {
        return cropMode;
    }

    public void setCropMode(CropModeEnum cropMode) {
        this.cropMode = cropMode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MixLayoutPane mixLayoutPane = (MixLayoutPane) o;
        return Objects.equals(this.id, mixLayoutPane.id) && Objects.equals(this.userId, mixLayoutPane.userId)
            && Objects.equals(this.videoType, mixLayoutPane.videoType) && Objects.equals(this.x, mixLayoutPane.x)
            && Objects.equals(this.y, mixLayoutPane.y) && Objects.equals(this.width, mixLayoutPane.width)
            && Objects.equals(this.height, mixLayoutPane.height) && Objects.equals(this.zorder, mixLayoutPane.zorder)
            && Objects.equals(this.cropMode, mixLayoutPane.cropMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, videoType, x, y, width, height, zorder, cropMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MixLayoutPane {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    videoType: ").append(toIndentedString(videoType)).append("\n");
        sb.append("    x: ").append(toIndentedString(x)).append("\n");
        sb.append("    y: ").append(toIndentedString(y)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    zorder: ").append(toIndentedString(zorder)).append("\n");
        sb.append("    cropMode: ").append(toIndentedString(cropMode)).append("\n");
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
