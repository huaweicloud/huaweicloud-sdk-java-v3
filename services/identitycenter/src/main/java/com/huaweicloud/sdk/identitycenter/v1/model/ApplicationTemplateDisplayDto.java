package com.huaweicloud.sdk.identitycenter.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 应用程序模板显示信息
 */
public class ApplicationTemplateDisplayDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_id")

    private String applicationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display")

    private DisplayDto display;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_type")

    private String applicationType;

    public ApplicationTemplateDisplayDto withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * 应用程序Id,以app-为前缀
     * @return applicationId
     */
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public ApplicationTemplateDisplayDto withDisplay(DisplayDto display) {
        this.display = display;
        return this;
    }

    public ApplicationTemplateDisplayDto withDisplay(Consumer<DisplayDto> displaySetter) {
        if (this.display == null) {
            this.display = new DisplayDto();
            displaySetter.accept(this.display);
        }

        return this;
    }

    /**
     * Get display
     * @return display
     */
    public DisplayDto getDisplay() {
        return display;
    }

    public void setDisplay(DisplayDto display) {
        this.display = display;
    }

    public ApplicationTemplateDisplayDto withApplicationType(String applicationType) {
        this.applicationType = applicationType;
        return this;
    }

    /**
     * 应用程序类型
     * @return applicationType
     */
    public String getApplicationType() {
        return applicationType;
    }

    public void setApplicationType(String applicationType) {
        this.applicationType = applicationType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApplicationTemplateDisplayDto that = (ApplicationTemplateDisplayDto) obj;
        return Objects.equals(this.applicationId, that.applicationId) && Objects.equals(this.display, that.display)
            && Objects.equals(this.applicationType, that.applicationType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationId, display, applicationType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplicationTemplateDisplayDto {\n");
        sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
        sb.append("    display: ").append(toIndentedString(display)).append("\n");
        sb.append("    applicationType: ").append(toIndentedString(applicationType)).append("\n");
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
