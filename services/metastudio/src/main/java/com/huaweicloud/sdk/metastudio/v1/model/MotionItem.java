package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MotionItem
 */
public class MotionItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private Float timestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root")

    private List<Float> root = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "joints")

    private List<Float> joints = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eyes")

    private List<Float> eyes = null;

    public MotionItem withTimestamp(Float timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * 时间戳，相对时间戳。  单位秒。  保留3位小数。
     * minimum: 0
     * maximum: 7.2E+3
     * @return timestamp
     */
    public Float getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Float timestamp) {
        this.timestamp = timestamp;
    }

    public MotionItem withRoot(List<Float> root) {
        this.root = root;
        return this;
    }

    public MotionItem addRootItem(Float rootItem) {
        if (this.root == null) {
            this.root = new ArrayList<>();
        }
        this.root.add(rootItem);
        return this;
    }

    public MotionItem withRoot(Consumer<List<Float>> rootSetter) {
        if (this.root == null) {
            this.root = new ArrayList<>();
        }
        rootSetter.accept(this.root);
        return this;
    }

    /**
     * root 3维坐标。
     * @return root
     */
    public List<Float> getRoot() {
        return root;
    }

    public void setRoot(List<Float> root) {
        this.root = root;
    }

    public MotionItem withJoints(List<Float> joints) {
        this.joints = joints;
        return this;
    }

    public MotionItem addJointsItem(Float jointsItem) {
        if (this.joints == null) {
            this.joints = new ArrayList<>();
        }
        this.joints.add(jointsItem);
        return this;
    }

    public MotionItem withJoints(Consumer<List<Float>> jointsSetter) {
        if (this.joints == null) {
            this.joints = new ArrayList<>();
        }
        jointsSetter.accept(this.joints);
        return this;
    }

    /**
     * 75个关节点，四元数。
     * @return joints
     */
    public List<Float> getJoints() {
        return joints;
    }

    public void setJoints(List<Float> joints) {
        this.joints = joints;
    }

    public MotionItem withEyes(List<Float> eyes) {
        this.eyes = eyes;
        return this;
    }

    public MotionItem addEyesItem(Float eyesItem) {
        if (this.eyes == null) {
            this.eyes = new ArrayList<>();
        }
        this.eyes.add(eyesItem);
        return this;
    }

    public MotionItem withEyes(Consumer<List<Float>> eyesSetter) {
        if (this.eyes == null) {
            this.eyes = new ArrayList<>();
        }
        eyesSetter.accept(this.eyes);
        return this;
    }

    /**
     * 眼动数据
     * @return eyes
     */
    public List<Float> getEyes() {
        return eyes;
    }

    public void setEyes(List<Float> eyes) {
        this.eyes = eyes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MotionItem that = (MotionItem) obj;
        return Objects.equals(this.timestamp, that.timestamp) && Objects.equals(this.root, that.root)
            && Objects.equals(this.joints, that.joints) && Objects.equals(this.eyes, that.eyes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, root, joints, eyes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MotionItem {\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    root: ").append(toIndentedString(root)).append("\n");
        sb.append("    joints: ").append(toIndentedString(joints)).append("\n");
        sb.append("    eyes: ").append(toIndentedString(eyes)).append("\n");
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
