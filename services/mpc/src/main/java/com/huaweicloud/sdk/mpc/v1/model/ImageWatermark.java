package com.huaweicloud.sdk.mpc.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.BasicWatermark;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ImageWatermark
 */
public class ImageWatermark  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dx")
    
    private String dx = "0";


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dy")
    
    private String dy = "0";


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="referpos")
    
    private String referpos;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="timeline_start")
    
    private String timelineStart = "0";


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="timeline_duration")
    
    private String timelineDuration;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="image_process")
    
    private String imageProcess;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="width")
    
    private String width;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="height")
    
    private String height;
    /**
     * 水印叠加母体  取值如下： - input ：水印叠加在输入片源上，转码输出后实际大小按图像等比例缩放 - output ：水印叠加在转码输出文件上。 
     */
    public static class BaseEnum {

        
        /**
         * Enum INPUT for value: "input"
         */
        public static final BaseEnum INPUT = new BaseEnum("input");
        
        /**
         * Enum OUTPUT for value: "output"
         */
        public static final BaseEnum OUTPUT = new BaseEnum("output");
        

        public static final Map<String, BaseEnum> staticFields = new HashMap<String, BaseEnum>() {
            { 
                put("input", INPUT);
                put("output", OUTPUT);
            }
        };

        private String value;

        BaseEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static BaseEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            BaseEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new BaseEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static BaseEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            BaseEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof BaseEnum) {
                return this.value.equals(((BaseEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="base")
    
    private BaseEnum base = BaseEnum.INPUT;

    public ImageWatermark withDx(String dx) {
        this.dx = dx;
        return this;
    }

    


    /**
     * 水印图片起点相对输出视频顶点的水平偏移量。  设置方法有如下两种：  - 整数型：表示图片起点水平偏移视频顶点的像素值，单位px。取值范围：[0，4096] - 小数型：表示图片起点相对于视频分辨率宽的水平偏移比率。取值范围：(0，1)，支持4位小数，如0.9999，超出部分系统自动丢弃。  示例：输出视频分辨率宽1920，设置“dx”为“0.1”，“referpos”为“TopRight”（右上角），则水印图片右上角到视频右顶点在水平方向上偏移距离为192。 
     * @return dx
     */
    public String getDx() {
        return dx;
    }

    public void setDx(String dx) {
        this.dx = dx;
    }

    public ImageWatermark withDy(String dy) {
        this.dy = dy;
        return this;
    }

    


    /**
     * 水印图片起点相对输出视频顶点的垂直偏移量。  - 设置方法有如下两种：整数型：表示图片起点垂直偏移视频顶点的像素值，单位px。取值范围：[0，4096] - 小数型：表示图片起点相对于视频分辨率高的垂直偏移比率。取值范围：(0，1)，支持4位小数，如0.9999，超出部分系统自动丢弃。  示例：输出视频分辨率高1080，设置“dy”为“0.1”，“referpos”为“TopRight”（右上角），则水印图片右上角到视频右顶点在垂直方向上的偏移距离为108。 
     * @return dy
     */
    public String getDy() {
        return dy;
    }

    public void setDy(String dy) {
        this.dy = dy;
    }

    public ImageWatermark withReferpos(String referpos) {
        this.referpos = referpos;
        return this;
    }

    


    /**
     * 水印的位置。  取值如下： - TopRight：右上角。 - TopLeft：左上角。 - BottomRight：右下角。 - BottomLeft：左下角。 
     * @return referpos
     */
    public String getReferpos() {
        return referpos;
    }

    public void setReferpos(String referpos) {
        this.referpos = referpos;
    }

    public ImageWatermark withTimelineStart(String timelineStart) {
        this.timelineStart = timelineStart;
        return this;
    }

    


    /**
     * 水印开始时间，与“timeline_duration”配合使用。  取值范围：数字。  单位：秒。 
     * @return timelineStart
     */
    public String getTimelineStart() {
        return timelineStart;
    }

    public void setTimelineStart(String timelineStart) {
        this.timelineStart = timelineStart;
    }

    public ImageWatermark withTimelineDuration(String timelineDuration) {
        this.timelineDuration = timelineDuration;
        return this;
    }

    


    /**
     * 水印持续时间，与“timeline_start”配合使用。  取值范围：[数字，ToEND]。“ToEND”表示持续到视频结束。  默认值：ToEND。 
     * @return timelineDuration
     */
    public String getTimelineDuration() {
        return timelineDuration;
    }

    public void setTimelineDuration(String timelineDuration) {
        this.timelineDuration = timelineDuration;
    }

    public ImageWatermark withImageProcess(String imageProcess) {
        this.imageProcess = imageProcess;
        return this;
    }

    


    /**
     * 图片水印处理方式，type设置为Image时有效。  取值如下：  - Original：只做简单缩放，不做其他处理。 - Grayed：彩色图片变灰。 - Transparent：透明化。 
     * @return imageProcess
     */
    public String getImageProcess() {
        return imageProcess;
    }

    public void setImageProcess(String imageProcess) {
        this.imageProcess = imageProcess;
    }

    public ImageWatermark withWidth(String width) {
        this.width = width;
        return this;
    }

    


    /**
     * 水印图片宽，值有两种形式： - 整数型代水印图片宽的像素值，范围[8，4096]，单位px。 - 小数型代表相对输出视频分辨率宽的比率，范围(0,1)，支持4位小数，如0.9999，超出部分系统自动丢弃。 
     * @return width
     */
    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public ImageWatermark withHeight(String height) {
        this.height = height;
        return this;
    }

    


    /**
     * 水印图片高，值有两种形式： - 整数型代表水印图片高的像素值，范围[8，4096]，单位px。 - 小数型代表相对输出视频分辨率高的比率，范围(0，1)，支持4位小数，如0.9999，超出部分系统自动丢弃。 
     * @return height
     */
    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public ImageWatermark withBase(BaseEnum base) {
        this.base = base;
        return this;
    }

    


    /**
     * 水印叠加母体  取值如下： - input ：水印叠加在输入片源上，转码输出后实际大小按图像等比例缩放 - output ：水印叠加在转码输出文件上。 
     * @return base
     */
    public BaseEnum getBase() {
        return base;
    }

    public void setBase(BaseEnum base) {
        this.base = base;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImageWatermark imageWatermark = (ImageWatermark) o;
        return Objects.equals(this.dx, imageWatermark.dx) &&
            Objects.equals(this.dy, imageWatermark.dy) &&
            Objects.equals(this.referpos, imageWatermark.referpos) &&
            Objects.equals(this.timelineStart, imageWatermark.timelineStart) &&
            Objects.equals(this.timelineDuration, imageWatermark.timelineDuration) &&
            Objects.equals(this.imageProcess, imageWatermark.imageProcess) &&
            Objects.equals(this.width, imageWatermark.width) &&
            Objects.equals(this.height, imageWatermark.height) &&
            Objects.equals(this.base, imageWatermark.base);
    }
    @Override
    public int hashCode() {
        return Objects.hash(dx, dy, referpos, timelineStart, timelineDuration, imageProcess, width, height, base);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageWatermark {\n");
        sb.append("    dx: ").append(toIndentedString(dx)).append("\n");
        sb.append("    dy: ").append(toIndentedString(dy)).append("\n");
        sb.append("    referpos: ").append(toIndentedString(referpos)).append("\n");
        sb.append("    timelineStart: ").append(toIndentedString(timelineStart)).append("\n");
        sb.append("    timelineDuration: ").append(toIndentedString(timelineDuration)).append("\n");
        sb.append("    imageProcess: ").append(toIndentedString(imageProcess)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    base: ").append(toIndentedString(base)).append("\n");
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

