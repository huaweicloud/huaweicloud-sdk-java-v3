package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * WizardUpdateRequestPojoBindingButton
 */
public class WizardUpdateRequestPojoBindingButton {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "button_id")

    private String buttonId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "button_name")

    private String buttonName;

    public WizardUpdateRequestPojoBindingButton withButtonId(String buttonId) {
        this.buttonId = buttonId;
        return this;
    }

    /**
     * 按钮id
     * @return buttonId
     */
    public String getButtonId() {
        return buttonId;
    }

    public void setButtonId(String buttonId) {
        this.buttonId = buttonId;
    }

    public WizardUpdateRequestPojoBindingButton withButtonName(String buttonName) {
        this.buttonName = buttonName;
        return this;
    }

    /**
     * 按钮名称
     * @return buttonName
     */
    public String getButtonName() {
        return buttonName;
    }

    public void setButtonName(String buttonName) {
        this.buttonName = buttonName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WizardUpdateRequestPojoBindingButton that = (WizardUpdateRequestPojoBindingButton) obj;
        return Objects.equals(this.buttonId, that.buttonId) && Objects.equals(this.buttonName, that.buttonName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(buttonId, buttonName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WizardUpdateRequestPojoBindingButton {\n");
        sb.append("    buttonId: ").append(toIndentedString(buttonId)).append("\n");
        sb.append("    buttonName: ").append(toIndentedString(buttonName)).append("\n");
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
