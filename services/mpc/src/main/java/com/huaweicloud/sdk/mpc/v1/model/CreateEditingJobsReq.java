package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建剪辑任务
 */
public class CreateEditingJobsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inputs")

    private List<EditingInput> inputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private ObsObjInfo output;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "editing_settings")

    private EditingSetting editingSettings;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_data")

    private String userData;

    public CreateEditingJobsReq withInputs(List<EditingInput> inputs) {
        this.inputs = inputs;
        return this;
    }

    public CreateEditingJobsReq addInputsItem(EditingInput inputsItem) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        this.inputs.add(inputsItem);
        return this;
    }

    public CreateEditingJobsReq withInputs(Consumer<List<EditingInput>> inputsSetter) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        inputsSetter.accept(this.inputs);
        return this;
    }

    /**
     * 指定片源多个剪切时间段
     * @return inputs
     */
    public List<EditingInput> getInputs() {
        return inputs;
    }

    public void setInputs(List<EditingInput> inputs) {
        this.inputs = inputs;
    }

    public CreateEditingJobsReq withOutput(ObsObjInfo output) {
        this.output = output;
        return this;
    }

    public CreateEditingJobsReq withOutput(Consumer<ObsObjInfo> outputSetter) {
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

    public CreateEditingJobsReq withEditingSettings(EditingSetting editingSettings) {
        this.editingSettings = editingSettings;
        return this;
    }

    public CreateEditingJobsReq withEditingSettings(Consumer<EditingSetting> editingSettingsSetter) {
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

    public CreateEditingJobsReq withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * 用户自定义数据
     * @return userData
     */
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
        CreateEditingJobsReq createEditingJobsReq = (CreateEditingJobsReq) o;
        return Objects.equals(this.inputs, createEditingJobsReq.inputs)
            && Objects.equals(this.output, createEditingJobsReq.output)
            && Objects.equals(this.editingSettings, createEditingJobsReq.editingSettings)
            && Objects.equals(this.userData, createEditingJobsReq.userData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inputs, output, editingSettings, userData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEditingJobsReq {\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    editingSettings: ").append(toIndentedString(editingSettings)).append("\n");
        sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
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
