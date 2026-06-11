package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 精调训练环境变量信息
 */
public class EnvVar {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    private String label;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "des")

    private String des;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_name")

    private String envName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_type")

    private String envType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modifiable")

    private Boolean modifiable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "displayable")

    private Boolean displayable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_steps")

    private List<String> usedSteps = null;

    public EnvVar withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * 标签
     * @return label
     */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public EnvVar withDes(String des) {
        this.des = des;
        return this;
    }

    /**
     * 描述信息
     * @return des
     */
    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public EnvVar withEnvName(String envName) {
        this.envName = envName;
        return this;
    }

    /**
     * 环境变量名称
     * @return envName
     */
    public String getEnvName() {
        return envName;
    }

    public void setEnvName(String envName) {
        this.envName = envName;
    }

    public EnvVar withEnvType(String envType) {
        this.envType = envType;
        return this;
    }

    /**
     * 环境变量类型
     * @return envType
     */
    public String getEnvType() {
        return envType;
    }

    public void setEnvType(String envType) {
        this.envType = envType;
    }

    public EnvVar withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 环境变量值
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public EnvVar withModifiable(Boolean modifiable) {
        this.modifiable = modifiable;
        return this;
    }

    /**
     * 环境变量是否可修改
     * @return modifiable
     */
    public Boolean getModifiable() {
        return modifiable;
    }

    public void setModifiable(Boolean modifiable) {
        this.modifiable = modifiable;
    }

    public EnvVar withDisplayable(Boolean displayable) {
        this.displayable = displayable;
        return this;
    }

    /**
     * 环境变量是否展示
     * @return displayable
     */
    public Boolean getDisplayable() {
        return displayable;
    }

    public void setDisplayable(Boolean displayable) {
        this.displayable = displayable;
    }

    public EnvVar withUsedSteps(List<String> usedSteps) {
        this.usedSteps = usedSteps;
        return this;
    }

    public EnvVar addUsedStepsItem(String usedStepsItem) {
        if (this.usedSteps == null) {
            this.usedSteps = new ArrayList<>();
        }
        this.usedSteps.add(usedStepsItem);
        return this;
    }

    public EnvVar withUsedSteps(Consumer<List<String>> usedStepsSetter) {
        if (this.usedSteps == null) {
            this.usedSteps = new ArrayList<>();
        }
        usedStepsSetter.accept(this.usedSteps);
        return this;
    }

    /**
     * 环境变量使用阶段
     * @return usedSteps
     */
    public List<String> getUsedSteps() {
        return usedSteps;
    }

    public void setUsedSteps(List<String> usedSteps) {
        this.usedSteps = usedSteps;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EnvVar that = (EnvVar) obj;
        return Objects.equals(this.label, that.label) && Objects.equals(this.des, that.des)
            && Objects.equals(this.envName, that.envName) && Objects.equals(this.envType, that.envType)
            && Objects.equals(this.value, that.value) && Objects.equals(this.modifiable, that.modifiable)
            && Objects.equals(this.displayable, that.displayable) && Objects.equals(this.usedSteps, that.usedSteps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(label, des, envName, envType, value, modifiable, displayable, usedSteps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnvVar {\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    des: ").append(toIndentedString(des)).append("\n");
        sb.append("    envName: ").append(toIndentedString(envName)).append("\n");
        sb.append("    envType: ").append(toIndentedString(envType)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    modifiable: ").append(toIndentedString(modifiable)).append("\n");
        sb.append("    displayable: ").append(toIndentedString(displayable)).append("\n");
        sb.append("    usedSteps: ").append(toIndentedString(usedSteps)).append("\n");
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
