package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 模板中构建执行步骤列表
 */
public class QueryTemplateVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "steps")

    private List<CreateBuildJobSteps> steps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actions")

    private Object actions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_update_sub_module")

    private Boolean autoUpdateSubModule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private String image;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_source")

    private String imageSource;

    public QueryTemplateVo withSteps(List<CreateBuildJobSteps> steps) {
        this.steps = steps;
        return this;
    }

    public QueryTemplateVo addStepsItem(CreateBuildJobSteps stepsItem) {
        if (this.steps == null) {
            this.steps = new ArrayList<>();
        }
        this.steps.add(stepsItem);
        return this;
    }

    public QueryTemplateVo withSteps(Consumer<List<CreateBuildJobSteps>> stepsSetter) {
        if (this.steps == null) {
            this.steps = new ArrayList<>();
        }
        stepsSetter.accept(this.steps);
        return this;
    }

    /**
     * 构建执行的步骤。
     * @return steps
     */
    public List<CreateBuildJobSteps> getSteps() {
        return steps;
    }

    public void setSteps(List<CreateBuildJobSteps> steps) {
        this.steps = steps;
    }

    public QueryTemplateVo withActions(Object actions) {
        this.actions = actions;
        return this;
    }

    /**
     * 构建步骤中的action。
     * @return actions
     */
    public Object getActions() {
        return actions;
    }

    public void setActions(Object actions) {
        this.actions = actions;
    }

    public QueryTemplateVo withAutoUpdateSubModule(Boolean autoUpdateSubModule) {
        this.autoUpdateSubModule = autoUpdateSubModule;
        return this;
    }

    /**
     * 是否自动更新子模块。
     * @return autoUpdateSubModule
     */
    public Boolean getAutoUpdateSubModule() {
        return autoUpdateSubModule;
    }

    public void setAutoUpdateSubModule(Boolean autoUpdateSubModule) {
        this.autoUpdateSubModule = autoUpdateSubModule;
    }

    public QueryTemplateVo withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * 配置镜像地址。
     * @return image
     */
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public QueryTemplateVo withImageSource(String imageSource) {
        this.imageSource = imageSource;
        return this;
    }

    /**
     * 配置镜像源的地址。
     * @return imageSource
     */
    public String getImageSource() {
        return imageSource;
    }

    public void setImageSource(String imageSource) {
        this.imageSource = imageSource;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryTemplateVo that = (QueryTemplateVo) obj;
        return Objects.equals(this.steps, that.steps) && Objects.equals(this.actions, that.actions)
            && Objects.equals(this.autoUpdateSubModule, that.autoUpdateSubModule)
            && Objects.equals(this.image, that.image) && Objects.equals(this.imageSource, that.imageSource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(steps, actions, autoUpdateSubModule, image, imageSource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryTemplateVo {\n");
        sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("    autoUpdateSubModule: ").append(toIndentedString(autoUpdateSubModule)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    imageSource: ").append(toIndentedString(imageSource)).append("\n");
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
