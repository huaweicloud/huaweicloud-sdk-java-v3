package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MultiConcatInfo
 */
public class MultiConcatInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inputs")

    private List<ObsObjInfo> inputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trans_template_ids")

    private List<Integer> transTemplateIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "av_parameters")

    private List<AvParameters> avParameters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private ObsObjInfo output;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_watermark_settings")

    private List<ImageWatermarkSetting> imageWatermarkSettings = null;

    public MultiConcatInfo withInputs(List<ObsObjInfo> inputs) {
        this.inputs = inputs;
        return this;
    }

    public MultiConcatInfo addInputsItem(ObsObjInfo inputsItem) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        this.inputs.add(inputsItem);
        return this;
    }

    public MultiConcatInfo withInputs(Consumer<List<ObsObjInfo>> inputsSetter) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        inputsSetter.accept(this.inputs);
        return this;
    }

    /**
     * 拼接任务输入源地址。
     * @return inputs
     */
    public List<ObsObjInfo> getInputs() {
        return inputs;
    }

    public void setInputs(List<ObsObjInfo> inputs) {
        this.inputs = inputs;
    }

    public MultiConcatInfo withTransTemplateIds(List<Integer> transTemplateIds) {
        this.transTemplateIds = transTemplateIds;
        return this;
    }

    public MultiConcatInfo addTransTemplateIdsItem(Integer transTemplateIdsItem) {
        if (this.transTemplateIds == null) {
            this.transTemplateIds = new ArrayList<>();
        }
        this.transTemplateIds.add(transTemplateIdsItem);
        return this;
    }

    public MultiConcatInfo withTransTemplateIds(Consumer<List<Integer>> transTemplateIdsSetter) {
        if (this.transTemplateIds == null) {
            this.transTemplateIds = new ArrayList<>();
        }
        transTemplateIdsSetter.accept(this.transTemplateIds);
        return this;
    }

    /**
     * 拼接完成后转码对应的转码模板ID 
     * @return transTemplateIds
     */
    public List<Integer> getTransTemplateIds() {
        return transTemplateIds;
    }

    public void setTransTemplateIds(List<Integer> transTemplateIds) {
        this.transTemplateIds = transTemplateIds;
    }

    public MultiConcatInfo withAvParameters(List<AvParameters> avParameters) {
        this.avParameters = avParameters;
        return this;
    }

    public MultiConcatInfo addAvParametersItem(AvParameters avParametersItem) {
        if (this.avParameters == null) {
            this.avParameters = new ArrayList<>();
        }
        this.avParameters.add(avParametersItem);
        return this;
    }

    public MultiConcatInfo withAvParameters(Consumer<List<AvParameters>> avParametersSetter) {
        if (this.avParameters == null) {
            this.avParameters = new ArrayList<>();
        }
        avParametersSetter.accept(this.avParameters);
        return this;
    }

    /**
     * 转码参数。 设置“trans_template_id”和此参数，则优先使用此参数进行转码。 
     * @return avParameters
     */
    public List<AvParameters> getAvParameters() {
        return avParameters;
    }

    public void setAvParameters(List<AvParameters> avParameters) {
        this.avParameters = avParameters;
    }

    public MultiConcatInfo withOutput(ObsObjInfo output) {
        this.output = output;
        return this;
    }

    public MultiConcatInfo withOutput(Consumer<ObsObjInfo> outputSetter) {
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

    public MultiConcatInfo withImageWatermarkSettings(List<ImageWatermarkSetting> imageWatermarkSettings) {
        this.imageWatermarkSettings = imageWatermarkSettings;
        return this;
    }

    public MultiConcatInfo addImageWatermarkSettingsItem(ImageWatermarkSetting imageWatermarkSettingsItem) {
        if (this.imageWatermarkSettings == null) {
            this.imageWatermarkSettings = new ArrayList<>();
        }
        this.imageWatermarkSettings.add(imageWatermarkSettingsItem);
        return this;
    }

    public MultiConcatInfo withImageWatermarkSettings(
        Consumer<List<ImageWatermarkSetting>> imageWatermarkSettingsSetter) {
        if (this.imageWatermarkSettings == null) {
            this.imageWatermarkSettings = new ArrayList<>();
        }
        imageWatermarkSettingsSetter.accept(this.imageWatermarkSettings);
        return this;
    }

    /**
     * 水印信息。
     * @return imageWatermarkSettings
     */
    public List<ImageWatermarkSetting> getImageWatermarkSettings() {
        return imageWatermarkSettings;
    }

    public void setImageWatermarkSettings(List<ImageWatermarkSetting> imageWatermarkSettings) {
        this.imageWatermarkSettings = imageWatermarkSettings;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MultiConcatInfo that = (MultiConcatInfo) obj;
        return Objects.equals(this.inputs, that.inputs) && Objects.equals(this.transTemplateIds, that.transTemplateIds)
            && Objects.equals(this.avParameters, that.avParameters) && Objects.equals(this.output, that.output)
            && Objects.equals(this.imageWatermarkSettings, that.imageWatermarkSettings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inputs, transTemplateIds, avParameters, output, imageWatermarkSettings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MultiConcatInfo {\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    transTemplateIds: ").append(toIndentedString(transTemplateIds)).append("\n");
        sb.append("    avParameters: ").append(toIndentedString(avParameters)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    imageWatermarkSettings: ").append(toIndentedString(imageWatermarkSettings)).append("\n");
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
