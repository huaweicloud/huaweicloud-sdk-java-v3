package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UI控件配置
 */
public class ExtensionParameterDisplaySettings {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "DevCloud.ControlType")

    private String devCloudControlType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "DevCloud.ControlType.Default")

    private String devCloudControlTypeDefault;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "DevCloud.ControlType.Select")

    private List<String> devCloudControlTypeSelect = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "DevCloud.ControlType.Radio")

    private List<ExtensionRadioOption> devCloudControlTypeRadio = null;

    public ExtensionParameterDisplaySettings withDevCloudControlType(String devCloudControlType) {
        this.devCloudControlType = devCloudControlType;
        return this;
    }

    /**
     * 控件类型，如 Select/CodeText/Radio/SingleLineText/Hidden
     * @return devCloudControlType
     */
    public String getDevCloudControlType() {
        return devCloudControlType;
    }

    public void setDevCloudControlType(String devCloudControlType) {
        this.devCloudControlType = devCloudControlType;
    }

    public ExtensionParameterDisplaySettings withDevCloudControlTypeDefault(String devCloudControlTypeDefault) {
        this.devCloudControlTypeDefault = devCloudControlTypeDefault;
        return this;
    }

    /**
     * 默认选中值。可能为字符串，也可能为对象(如 {displayName, value})。
     * @return devCloudControlTypeDefault
     */
    public String getDevCloudControlTypeDefault() {
        return devCloudControlTypeDefault;
    }

    public void setDevCloudControlTypeDefault(String devCloudControlTypeDefault) {
        this.devCloudControlTypeDefault = devCloudControlTypeDefault;
    }

    public ExtensionParameterDisplaySettings withDevCloudControlTypeSelect(List<String> devCloudControlTypeSelect) {
        this.devCloudControlTypeSelect = devCloudControlTypeSelect;
        return this;
    }

    public ExtensionParameterDisplaySettings addDevCloudControlTypeSelectItem(String devCloudControlTypeSelectItem) {
        if (this.devCloudControlTypeSelect == null) {
            this.devCloudControlTypeSelect = new ArrayList<>();
        }
        this.devCloudControlTypeSelect.add(devCloudControlTypeSelectItem);
        return this;
    }

    public ExtensionParameterDisplaySettings withDevCloudControlTypeSelect(
        Consumer<List<String>> devCloudControlTypeSelectSetter) {
        if (this.devCloudControlTypeSelect == null) {
            this.devCloudControlTypeSelect = new ArrayList<>();
        }
        devCloudControlTypeSelectSetter.accept(this.devCloudControlTypeSelect);
        return this;
    }

    /**
     * 下拉选项(Select类型)。
     * @return devCloudControlTypeSelect
     */
    public List<String> getDevCloudControlTypeSelect() {
        return devCloudControlTypeSelect;
    }

    public void setDevCloudControlTypeSelect(List<String> devCloudControlTypeSelect) {
        this.devCloudControlTypeSelect = devCloudControlTypeSelect;
    }

    public ExtensionParameterDisplaySettings withDevCloudControlTypeRadio(
        List<ExtensionRadioOption> devCloudControlTypeRadio) {
        this.devCloudControlTypeRadio = devCloudControlTypeRadio;
        return this;
    }

    public ExtensionParameterDisplaySettings addDevCloudControlTypeRadioItem(
        ExtensionRadioOption devCloudControlTypeRadioItem) {
        if (this.devCloudControlTypeRadio == null) {
            this.devCloudControlTypeRadio = new ArrayList<>();
        }
        this.devCloudControlTypeRadio.add(devCloudControlTypeRadioItem);
        return this;
    }

    public ExtensionParameterDisplaySettings withDevCloudControlTypeRadio(
        Consumer<List<ExtensionRadioOption>> devCloudControlTypeRadioSetter) {
        if (this.devCloudControlTypeRadio == null) {
            this.devCloudControlTypeRadio = new ArrayList<>();
        }
        devCloudControlTypeRadioSetter.accept(this.devCloudControlTypeRadio);
        return this;
    }

    /**
     * 单选选项(Radio类型)。
     * @return devCloudControlTypeRadio
     */
    public List<ExtensionRadioOption> getDevCloudControlTypeRadio() {
        return devCloudControlTypeRadio;
    }

    public void setDevCloudControlTypeRadio(List<ExtensionRadioOption> devCloudControlTypeRadio) {
        this.devCloudControlTypeRadio = devCloudControlTypeRadio;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExtensionParameterDisplaySettings that = (ExtensionParameterDisplaySettings) obj;
        return Objects.equals(this.devCloudControlType, that.devCloudControlType)
            && Objects.equals(this.devCloudControlTypeDefault, that.devCloudControlTypeDefault)
            && Objects.equals(this.devCloudControlTypeSelect, that.devCloudControlTypeSelect)
            && Objects.equals(this.devCloudControlTypeRadio, that.devCloudControlTypeRadio);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(devCloudControlType, devCloudControlTypeDefault, devCloudControlTypeSelect, devCloudControlTypeRadio);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtensionParameterDisplaySettings {\n");
        sb.append("    devCloudControlType: ").append(toIndentedString(devCloudControlType)).append("\n");
        sb.append("    devCloudControlTypeDefault: ").append(toIndentedString(devCloudControlTypeDefault)).append("\n");
        sb.append("    devCloudControlTypeSelect: ").append(toIndentedString(devCloudControlTypeSelect)).append("\n");
        sb.append("    devCloudControlTypeRadio: ").append(toIndentedString(devCloudControlTypeRadio)).append("\n");
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
