package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * EditSetting
 */
public class EditSetting {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeline_start")

    private String timelineStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeline_end")

    private String timelineEnd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trans_template_id")

    private Integer transTemplateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "av_parameter")

    private AvParameters avParameter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mosaics")

    private List<MosaicInfo> mosaics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_watermarks")

    private List<ImageWatermarkSetting> imageWatermarks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "heads")

    private List<ObsObjInfo> heads = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tails")

    private List<ObsObjInfo> tails = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private ObsObjInfo output;

    public EditSetting withTimelineStart(String timelineStart) {
        this.timelineStart = timelineStart;
        return this;
    }

    /**
     * input指定源文件开始截取的时间，单位：秒。可以有正数或者负数，正数表示从开始往后的时间点，负数表示从结尾往前的时间点 
     * @return timelineStart
     */
    public String getTimelineStart() {
        return timelineStart;
    }

    public void setTimelineStart(String timelineStart) {
        this.timelineStart = timelineStart;
    }

    public EditSetting withTimelineEnd(String timelineEnd) {
        this.timelineEnd = timelineEnd;
        return this;
    }

    /**
     * input指定源文件接受截取的时间，单位：秒。可以有正数或者负数，正数表示从开始往后的时间点，负数表示从结尾往前的时间点。 
     * @return timelineEnd
     */
    public String getTimelineEnd() {
        return timelineEnd;
    }

    public void setTimelineEnd(String timelineEnd) {
        this.timelineEnd = timelineEnd;
    }

    public EditSetting withTransTemplateId(Integer transTemplateId) {
        this.transTemplateId = transTemplateId;
        return this;
    }

    /**
     * 转码模板id
     * @return transTemplateId
     */
    public Integer getTransTemplateId() {
        return transTemplateId;
    }

    public void setTransTemplateId(Integer transTemplateId) {
        this.transTemplateId = transTemplateId;
    }

    public EditSetting withAvParameter(AvParameters avParameter) {
        this.avParameter = avParameter;
        return this;
    }

    public EditSetting withAvParameter(Consumer<AvParameters> avParameterSetter) {
        if (this.avParameter == null) {
            this.avParameter = new AvParameters();
            avParameterSetter.accept(this.avParameter);
        }

        return this;
    }

    /**
     * Get avParameter
     * @return avParameter
     */
    public AvParameters getAvParameter() {
        return avParameter;
    }

    public void setAvParameter(AvParameters avParameter) {
        this.avParameter = avParameter;
    }

    public EditSetting withMosaics(List<MosaicInfo> mosaics) {
        this.mosaics = mosaics;
        return this;
    }

    public EditSetting addMosaicsItem(MosaicInfo mosaicsItem) {
        if (this.mosaics == null) {
            this.mosaics = new ArrayList<>();
        }
        this.mosaics.add(mosaicsItem);
        return this;
    }

    public EditSetting withMosaics(Consumer<List<MosaicInfo>> mosaicsSetter) {
        if (this.mosaics == null) {
            this.mosaics = new ArrayList<>();
        }
        mosaicsSetter.accept(this.mosaics);
        return this;
    }

    /**
     * 马赛克（模糊处理）配置，会对input指定的源文件进行马赛克处理，马赛克基于视频左上角为参考位置 
     * @return mosaics
     */
    public List<MosaicInfo> getMosaics() {
        return mosaics;
    }

    public void setMosaics(List<MosaicInfo> mosaics) {
        this.mosaics = mosaics;
    }

    public EditSetting withImageWatermarks(List<ImageWatermarkSetting> imageWatermarks) {
        this.imageWatermarks = imageWatermarks;
        return this;
    }

    public EditSetting addImageWatermarksItem(ImageWatermarkSetting imageWatermarksItem) {
        if (this.imageWatermarks == null) {
            this.imageWatermarks = new ArrayList<>();
        }
        this.imageWatermarks.add(imageWatermarksItem);
        return this;
    }

    public EditSetting withImageWatermarks(Consumer<List<ImageWatermarkSetting>> imageWatermarksSetter) {
        if (this.imageWatermarks == null) {
            this.imageWatermarks = new ArrayList<>();
        }
        imageWatermarksSetter.accept(this.imageWatermarks);
        return this;
    }

    /**
     * 图片水印配置，会对input指定的源文件进行马赛克处理。水印设置参数里面的overlay_input字段不填 
     * @return imageWatermarks
     */
    public List<ImageWatermarkSetting> getImageWatermarks() {
        return imageWatermarks;
    }

    public void setImageWatermarks(List<ImageWatermarkSetting> imageWatermarks) {
        this.imageWatermarks = imageWatermarks;
    }

    public EditSetting withHeads(List<ObsObjInfo> heads) {
        this.heads = heads;
        return this;
    }

    public EditSetting addHeadsItem(ObsObjInfo headsItem) {
        if (this.heads == null) {
            this.heads = new ArrayList<>();
        }
        this.heads.add(headsItem);
        return this;
    }

    public EditSetting withHeads(Consumer<List<ObsObjInfo>> headsSetter) {
        if (this.heads == null) {
            this.heads = new ArrayList<>();
        }
        headsSetter.accept(this.heads);
        return this;
    }

    /**
     * 头部文件列表，需要指定文件名。列表内文件会按照顺序拼接在input指定文件的前面 
     * @return heads
     */
    public List<ObsObjInfo> getHeads() {
        return heads;
    }

    public void setHeads(List<ObsObjInfo> heads) {
        this.heads = heads;
    }

    public EditSetting withTails(List<ObsObjInfo> tails) {
        this.tails = tails;
        return this;
    }

    public EditSetting addTailsItem(ObsObjInfo tailsItem) {
        if (this.tails == null) {
            this.tails = new ArrayList<>();
        }
        this.tails.add(tailsItem);
        return this;
    }

    public EditSetting withTails(Consumer<List<ObsObjInfo>> tailsSetter) {
        if (this.tails == null) {
            this.tails = new ArrayList<>();
        }
        tailsSetter.accept(this.tails);
        return this;
    }

    /**
     * 尾部文件列表，需要指定文件名。列表内文件会按照顺序拼接在input指定文件的后面 
     * @return tails
     */
    public List<ObsObjInfo> getTails() {
        return tails;
    }

    public void setTails(List<ObsObjInfo> tails) {
        this.tails = tails;
    }

    public EditSetting withOutput(ObsObjInfo output) {
        this.output = output;
        return this;
    }

    public EditSetting withOutput(Consumer<ObsObjInfo> outputSetter) {
        if (this.output == null) {
            this.output = new ObsObjInfo();
            outputSetter.accept(this.output);
        }

        return this;
    }

    /**
     * Get output
     * @return output
     */
    public ObsObjInfo getOutput() {
        return output;
    }

    public void setOutput(ObsObjInfo output) {
        this.output = output;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EditSetting editSetting = (EditSetting) o;
        return Objects.equals(this.timelineStart, editSetting.timelineStart)
            && Objects.equals(this.timelineEnd, editSetting.timelineEnd)
            && Objects.equals(this.transTemplateId, editSetting.transTemplateId)
            && Objects.equals(this.avParameter, editSetting.avParameter)
            && Objects.equals(this.mosaics, editSetting.mosaics)
            && Objects.equals(this.imageWatermarks, editSetting.imageWatermarks)
            && Objects.equals(this.heads, editSetting.heads) && Objects.equals(this.tails, editSetting.tails)
            && Objects.equals(this.output, editSetting.output);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timelineStart,
            timelineEnd,
            transTemplateId,
            avParameter,
            mosaics,
            imageWatermarks,
            heads,
            tails,
            output);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EditSetting {\n");
        sb.append("    timelineStart: ").append(toIndentedString(timelineStart)).append("\n");
        sb.append("    timelineEnd: ").append(toIndentedString(timelineEnd)).append("\n");
        sb.append("    transTemplateId: ").append(toIndentedString(transTemplateId)).append("\n");
        sb.append("    avParameter: ").append(toIndentedString(avParameter)).append("\n");
        sb.append("    mosaics: ").append(toIndentedString(mosaics)).append("\n");
        sb.append("    imageWatermarks: ").append(toIndentedString(imageWatermarks)).append("\n");
        sb.append("    heads: ").append(toIndentedString(heads)).append("\n");
        sb.append("    tails: ").append(toIndentedString(tails)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
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
