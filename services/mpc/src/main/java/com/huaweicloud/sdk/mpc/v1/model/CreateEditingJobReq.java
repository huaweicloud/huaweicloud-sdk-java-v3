package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 创建剪辑任务 */
public class CreateEditingJobReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edit_type")

    private List<String> editType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clips")

    private List<ClipInfo> clips = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contcat")

    private ConcatInfo contcat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_setting")

    private OutputSetting outputSetting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_watermark_settings")

    private List<ImageWatermarkSetting> imageWatermarkSettings = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_data")

    private String userData;

    public CreateEditingJobReq withEditType(List<String> editType) {
        this.editType = editType;
        return this;
    }

    public CreateEditingJobReq addEditTypeItem(String editTypeItem) {
        if (this.editType == null) {
            this.editType = new ArrayList<>();
        }
        this.editType.add(editTypeItem);
        return this;
    }

    public CreateEditingJobReq withEditType(Consumer<List<String>> editTypeSetter) {
        if (this.editType == null) {
            this.editType = new ArrayList<>();
        }
        editTypeSetter.accept(this.editType);
        return this;
    }

    /** 剪辑任务类型。取值如下：\"CLIP\",\"CONCAT\"。
     * 
     * @return editType */
    public List<String> getEditType() {
        return editType;
    }

    public void setEditType(List<String> editType) {
        this.editType = editType;
    }

    public CreateEditingJobReq withClips(List<ClipInfo> clips) {
        this.clips = clips;
        return this;
    }

    public CreateEditingJobReq addClipsItem(ClipInfo clipsItem) {
        if (this.clips == null) {
            this.clips = new ArrayList<>();
        }
        this.clips.add(clipsItem);
        return this;
    }

    public CreateEditingJobReq withClips(Consumer<List<ClipInfo>> clipsSetter) {
        if (this.clips == null) {
            this.clips = new ArrayList<>();
        }
        clipsSetter.accept(this.clips);
        return this;
    }

    /** 剪切信息
     * 
     * @return clips */
    public List<ClipInfo> getClips() {
        return clips;
    }

    public void setClips(List<ClipInfo> clips) {
        this.clips = clips;
    }

    public CreateEditingJobReq withContcat(ConcatInfo contcat) {
        this.contcat = contcat;
        return this;
    }

    public CreateEditingJobReq withContcat(Consumer<ConcatInfo> contcatSetter) {
        if (this.contcat == null) {
            this.contcat = new ConcatInfo();
            contcatSetter.accept(this.contcat);
        }

        return this;
    }

    /** Get contcat
     * 
     * @return contcat */
    public ConcatInfo getContcat() {
        return contcat;
    }

    public void setContcat(ConcatInfo contcat) {
        this.contcat = contcat;
    }

    public CreateEditingJobReq withOutputSetting(OutputSetting outputSetting) {
        this.outputSetting = outputSetting;
        return this;
    }

    public CreateEditingJobReq withOutputSetting(Consumer<OutputSetting> outputSettingSetter) {
        if (this.outputSetting == null) {
            this.outputSetting = new OutputSetting();
            outputSettingSetter.accept(this.outputSetting);
        }

        return this;
    }

    /** Get outputSetting
     * 
     * @return outputSetting */
    public OutputSetting getOutputSetting() {
        return outputSetting;
    }

    public void setOutputSetting(OutputSetting outputSetting) {
        this.outputSetting = outputSetting;
    }

    public CreateEditingJobReq withImageWatermarkSettings(List<ImageWatermarkSetting> imageWatermarkSettings) {
        this.imageWatermarkSettings = imageWatermarkSettings;
        return this;
    }

    public CreateEditingJobReq addImageWatermarkSettingsItem(ImageWatermarkSetting imageWatermarkSettingsItem) {
        if (this.imageWatermarkSettings == null) {
            this.imageWatermarkSettings = new ArrayList<>();
        }
        this.imageWatermarkSettings.add(imageWatermarkSettingsItem);
        return this;
    }

    public CreateEditingJobReq withImageWatermarkSettings(
        Consumer<List<ImageWatermarkSetting>> imageWatermarkSettingsSetter) {
        if (this.imageWatermarkSettings == null) {
            this.imageWatermarkSettings = new ArrayList<>();
        }
        imageWatermarkSettingsSetter.accept(this.imageWatermarkSettings);
        return this;
    }

    /** 水印信息。
     * 
     * @return imageWatermarkSettings */
    public List<ImageWatermarkSetting> getImageWatermarkSettings() {
        return imageWatermarkSettings;
    }

    public void setImageWatermarkSettings(List<ImageWatermarkSetting> imageWatermarkSettings) {
        this.imageWatermarkSettings = imageWatermarkSettings;
    }

    public CreateEditingJobReq withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /** 用户自定义数据。
     * 
     * @return userData */
    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateEditingJobReq createEditingJobReq = (CreateEditingJobReq) o;
        return Objects.equals(this.editType, createEditingJobReq.editType)
            && Objects.equals(this.clips, createEditingJobReq.clips)
            && Objects.equals(this.contcat, createEditingJobReq.contcat)
            && Objects.equals(this.outputSetting, createEditingJobReq.outputSetting)
            && Objects.equals(this.imageWatermarkSettings, createEditingJobReq.imageWatermarkSettings)
            && Objects.equals(this.userData, createEditingJobReq.userData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(editType, clips, contcat, outputSetting, imageWatermarkSettings, userData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEditingJobReq {\n");
        sb.append("    editType: ").append(toIndentedString(editType)).append("\n");
        sb.append("    clips: ").append(toIndentedString(clips)).append("\n");
        sb.append("    contcat: ").append(toIndentedString(contcat)).append("\n");
        sb.append("    outputSetting: ").append(toIndentedString(outputSetting)).append("\n");
        sb.append("    imageWatermarkSettings: ").append(toIndentedString(imageWatermarkSettings)).append("\n");
        sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
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
