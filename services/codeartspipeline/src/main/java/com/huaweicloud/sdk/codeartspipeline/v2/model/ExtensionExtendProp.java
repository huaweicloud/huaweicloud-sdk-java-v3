package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ExtensionExtendProp
 */
public class ExtensionExtendProp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_options")

    private String apiOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_type")

    private String apiType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "show_placeholder")

    private String showPlaceholder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "options")

    private String options;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disabled_conditions")

    private String disabledConditions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visible_conditions")

    private String visibleConditions;

    public ExtensionExtendProp withApiOptions(String apiOptions) {
        this.apiOptions = apiOptions;
        return this;
    }

    /**
     * **参数解释**： API选项。 **取值范围**： 不涉及。 
     * @return apiOptions
     */
    public String getApiOptions() {
        return apiOptions;
    }

    public void setApiOptions(String apiOptions) {
        this.apiOptions = apiOptions;
    }

    public ExtensionExtendProp withApiType(String apiType) {
        this.apiType = apiType;
        return this;
    }

    /**
     * **参数解释**： API类型。 **取值范围**： 不涉及。 
     * @return apiType
     */
    public String getApiType() {
        return apiType;
    }

    public void setApiType(String apiType) {
        this.apiType = apiType;
    }

    public ExtensionExtendProp withShowPlaceholder(String showPlaceholder) {
        this.showPlaceholder = showPlaceholder;
        return this;
    }

    /**
     * **参数解释**： 显示占位符。 **取值范围**： 不涉及。 
     * @return showPlaceholder
     */
    public String getShowPlaceholder() {
        return showPlaceholder;
    }

    public void setShowPlaceholder(String showPlaceholder) {
        this.showPlaceholder = showPlaceholder;
    }

    public ExtensionExtendProp withOptions(String options) {
        this.options = options;
        return this;
    }

    /**
     * **参数解释**： 选项。 **取值范围**： 不涉及。 
     * @return options
     */
    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public ExtensionExtendProp withDisabledConditions(String disabledConditions) {
        this.disabledConditions = disabledConditions;
        return this;
    }

    /**
     * **参数解释**： 禁用条件。 **取值范围**： 不涉及。 
     * @return disabledConditions
     */
    public String getDisabledConditions() {
        return disabledConditions;
    }

    public void setDisabledConditions(String disabledConditions) {
        this.disabledConditions = disabledConditions;
    }

    public ExtensionExtendProp withVisibleConditions(String visibleConditions) {
        this.visibleConditions = visibleConditions;
        return this;
    }

    /**
     * **参数解释**： 可见条件。 **取值范围**： 不涉及。 
     * @return visibleConditions
     */
    public String getVisibleConditions() {
        return visibleConditions;
    }

    public void setVisibleConditions(String visibleConditions) {
        this.visibleConditions = visibleConditions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExtensionExtendProp that = (ExtensionExtendProp) obj;
        return Objects.equals(this.apiOptions, that.apiOptions) && Objects.equals(this.apiType, that.apiType)
            && Objects.equals(this.showPlaceholder, that.showPlaceholder) && Objects.equals(this.options, that.options)
            && Objects.equals(this.disabledConditions, that.disabledConditions)
            && Objects.equals(this.visibleConditions, that.visibleConditions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiOptions, apiType, showPlaceholder, options, disabledConditions, visibleConditions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtensionExtendProp {\n");
        sb.append("    apiOptions: ").append(toIndentedString(apiOptions)).append("\n");
        sb.append("    apiType: ").append(toIndentedString(apiType)).append("\n");
        sb.append("    showPlaceholder: ").append(toIndentedString(showPlaceholder)).append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
        sb.append("    disabledConditions: ").append(toIndentedString(disabledConditions)).append("\n");
        sb.append("    visibleConditions: ").append(toIndentedString(visibleConditions)).append("\n");
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
