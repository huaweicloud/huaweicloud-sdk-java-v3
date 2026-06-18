package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AlgorithmResponseJobConfigInputs
 */
public class AlgorithmResponseJobConfigInputs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_constraints")

    private List<AlgorithmResponseJobConfigRemoteConstraints> remoteConstraints = null;

    public AlgorithmResponseJobConfigInputs withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 数据输入通道名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AlgorithmResponseJobConfigInputs withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 数据输入通道描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AlgorithmResponseJobConfigInputs withRemoteConstraints(
        List<AlgorithmResponseJobConfigRemoteConstraints> remoteConstraints) {
        this.remoteConstraints = remoteConstraints;
        return this;
    }

    public AlgorithmResponseJobConfigInputs addRemoteConstraintsItem(
        AlgorithmResponseJobConfigRemoteConstraints remoteConstraintsItem) {
        if (this.remoteConstraints == null) {
            this.remoteConstraints = new ArrayList<>();
        }
        this.remoteConstraints.add(remoteConstraintsItem);
        return this;
    }

    public AlgorithmResponseJobConfigInputs withRemoteConstraints(
        Consumer<List<AlgorithmResponseJobConfigRemoteConstraints>> remoteConstraintsSetter) {
        if (this.remoteConstraints == null) {
            this.remoteConstraints = new ArrayList<>();
        }
        remoteConstraintsSetter.accept(this.remoteConstraints);
        return this;
    }

    /**
     * 数据输入约束。
     * @return remoteConstraints
     */
    public List<AlgorithmResponseJobConfigRemoteConstraints> getRemoteConstraints() {
        return remoteConstraints;
    }

    public void setRemoteConstraints(List<AlgorithmResponseJobConfigRemoteConstraints> remoteConstraints) {
        this.remoteConstraints = remoteConstraints;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlgorithmResponseJobConfigInputs that = (AlgorithmResponseJobConfigInputs) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.remoteConstraints, that.remoteConstraints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, remoteConstraints);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlgorithmResponseJobConfigInputs {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    remoteConstraints: ").append(toIndentedString(remoteConstraints)).append("\n");
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
