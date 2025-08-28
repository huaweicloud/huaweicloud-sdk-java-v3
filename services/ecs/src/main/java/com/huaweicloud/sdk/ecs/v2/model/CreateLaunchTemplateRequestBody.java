package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateLaunchTemplateRequestBody
 */
public class CreateLaunchTemplateRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "launch_template")

    private LaunchTemplateOption launchTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dry_run")

    private Boolean dryRun;

    public CreateLaunchTemplateRequestBody withLaunchTemplate(LaunchTemplateOption launchTemplate) {
        this.launchTemplate = launchTemplate;
        return this;
    }

    public CreateLaunchTemplateRequestBody withLaunchTemplate(Consumer<LaunchTemplateOption> launchTemplateSetter) {
        if (this.launchTemplate == null) {
            this.launchTemplate = new LaunchTemplateOption();
            launchTemplateSetter.accept(this.launchTemplate);
        }

        return this;
    }

    /**
     * Get launchTemplate
     * @return launchTemplate
     */
    public LaunchTemplateOption getLaunchTemplate() {
        return launchTemplate;
    }

    public void setLaunchTemplate(LaunchTemplateOption launchTemplate) {
        this.launchTemplate = launchTemplate;
    }

    public CreateLaunchTemplateRequestBody withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * 预检，只校验权限等初级信息。
     * @return dryRun
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateLaunchTemplateRequestBody that = (CreateLaunchTemplateRequestBody) obj;
        return Objects.equals(this.launchTemplate, that.launchTemplate) && Objects.equals(this.dryRun, that.dryRun);
    }

    @Override
    public int hashCode() {
        return Objects.hash(launchTemplate, dryRun);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateLaunchTemplateRequestBody {\n");
        sb.append("    launchTemplate: ").append(toIndentedString(launchTemplate)).append("\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
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
