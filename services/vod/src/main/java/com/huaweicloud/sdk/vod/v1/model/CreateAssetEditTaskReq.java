package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateAssetEditTaskReq
 */
public class CreateAssetEditTaskReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inputs")

    private List<EditInput> inputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "editing_settings")

    private VodEditingSetting editingSettings;

    public CreateAssetEditTaskReq withInputs(List<EditInput> inputs) {
        this.inputs = inputs;
        return this;
    }

    public CreateAssetEditTaskReq addInputsItem(EditInput inputsItem) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        this.inputs.add(inputsItem);
        return this;
    }

    public CreateAssetEditTaskReq withInputs(Consumer<List<EditInput>> inputsSetter) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        inputsSetter.accept(this.inputs);
        return this;
    }

    /**
     * 待编辑媒资列表，最多支持20个。 
     * @return inputs
     */
    public List<EditInput> getInputs() {
        return inputs;
    }

    public void setInputs(List<EditInput> inputs) {
        this.inputs = inputs;
    }

    public CreateAssetEditTaskReq withEditingSettings(VodEditingSetting editingSettings) {
        this.editingSettings = editingSettings;
        return this;
    }

    public CreateAssetEditTaskReq withEditingSettings(Consumer<VodEditingSetting> editingSettingsSetter) {
        if (this.editingSettings == null) {
            this.editingSettings = new VodEditingSetting();
            editingSettingsSetter.accept(this.editingSettings);
        }

        return this;
    }

    /**
     * Get editingSettings
     * @return editingSettings
     */
    public VodEditingSetting getEditingSettings() {
        return editingSettings;
    }

    public void setEditingSettings(VodEditingSetting editingSettings) {
        this.editingSettings = editingSettings;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAssetEditTaskReq that = (CreateAssetEditTaskReq) obj;
        return Objects.equals(this.inputs, that.inputs) && Objects.equals(this.editingSettings, that.editingSettings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inputs, editingSettings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAssetEditTaskReq {\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    editingSettings: ").append(toIndentedString(editingSettings)).append("\n");
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
