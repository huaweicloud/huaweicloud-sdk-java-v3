package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateEditTaskRequestBody
 */
public class CreateEditTaskRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inputs")

    private List<EditMediaTaskInput> inputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "editing_settings")

    private EditingSetting editingSettings;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "callback_url")

    private String callbackUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_context")

    private String sessionContext;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private ObsInfo output;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "media_process_task")

    private AdditionalObjectProcessReq mediaProcessTask;

    public CreateEditTaskRequestBody withInputs(List<EditMediaTaskInput> inputs) {
        this.inputs = inputs;
        return this;
    }

    public CreateEditTaskRequestBody addInputsItem(EditMediaTaskInput inputsItem) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        this.inputs.add(inputsItem);
        return this;
    }

    public CreateEditTaskRequestBody withInputs(Consumer<List<EditMediaTaskInput>> inputsSetter) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        inputsSetter.accept(this.inputs);
        return this;
    }

    /**
     * 编辑任务输入
     * @return inputs
     */
    public List<EditMediaTaskInput> getInputs() {
        return inputs;
    }

    public void setInputs(List<EditMediaTaskInput> inputs) {
        this.inputs = inputs;
    }

    public CreateEditTaskRequestBody withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 输出文件名
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public CreateEditTaskRequestBody withEditingSettings(EditingSetting editingSettings) {
        this.editingSettings = editingSettings;
        return this;
    }

    public CreateEditTaskRequestBody withEditingSettings(Consumer<EditingSetting> editingSettingsSetter) {
        if (this.editingSettings == null) {
            this.editingSettings = new EditingSetting();
            editingSettingsSetter.accept(this.editingSettings);
        }

        return this;
    }

    /**
     * Get editingSettings
     * @return editingSettings
     */
    public EditingSetting getEditingSettings() {
        return editingSettings;
    }

    public void setEditingSettings(EditingSetting editingSettings) {
        this.editingSettings = editingSettings;
    }

    public CreateEditTaskRequestBody withCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }

    /**
     * 回调地址
     * @return callbackUrl
     */
    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public CreateEditTaskRequestBody withSessionContext(String sessionContext) {
        this.sessionContext = sessionContext;
        return this;
    }

    /**
     * 自定义上下文
     * @return sessionContext
     */
    public String getSessionContext() {
        return sessionContext;
    }

    public void setSessionContext(String sessionContext) {
        this.sessionContext = sessionContext;
    }

    public CreateEditTaskRequestBody withOutput(ObsInfo output) {
        this.output = output;
        return this;
    }

    public CreateEditTaskRequestBody withOutput(Consumer<ObsInfo> outputSetter) {
        if (this.output == null) {
            this.output = new ObsInfo();
            outputSetter.accept(this.output);
        }

        return this;
    }

    /**
     * Get output
     * @return output
     */
    public ObsInfo getOutput() {
        return output;
    }

    public void setOutput(ObsInfo output) {
        this.output = output;
    }

    public CreateEditTaskRequestBody withMediaProcessTask(AdditionalObjectProcessReq mediaProcessTask) {
        this.mediaProcessTask = mediaProcessTask;
        return this;
    }

    public CreateEditTaskRequestBody withMediaProcessTask(Consumer<AdditionalObjectProcessReq> mediaProcessTaskSetter) {
        if (this.mediaProcessTask == null) {
            this.mediaProcessTask = new AdditionalObjectProcessReq();
            mediaProcessTaskSetter.accept(this.mediaProcessTask);
        }

        return this;
    }

    /**
     * Get mediaProcessTask
     * @return mediaProcessTask
     */
    public AdditionalObjectProcessReq getMediaProcessTask() {
        return mediaProcessTask;
    }

    public void setMediaProcessTask(AdditionalObjectProcessReq mediaProcessTask) {
        this.mediaProcessTask = mediaProcessTask;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateEditTaskRequestBody that = (CreateEditTaskRequestBody) obj;
        return Objects.equals(this.inputs, that.inputs) && Objects.equals(this.fileName, that.fileName)
            && Objects.equals(this.editingSettings, that.editingSettings)
            && Objects.equals(this.callbackUrl, that.callbackUrl)
            && Objects.equals(this.sessionContext, that.sessionContext) && Objects.equals(this.output, that.output)
            && Objects.equals(this.mediaProcessTask, that.mediaProcessTask);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inputs, fileName, editingSettings, callbackUrl, sessionContext, output, mediaProcessTask);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEditTaskRequestBody {\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    editingSettings: ").append(toIndentedString(editingSettings)).append("\n");
        sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
        sb.append("    sessionContext: ").append(toIndentedString(sessionContext)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    mediaProcessTask: ").append(toIndentedString(mediaProcessTask)).append("\n");
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
