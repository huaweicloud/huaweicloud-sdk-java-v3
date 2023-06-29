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

    private List<Object> root = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "joints")

    private List<Object> joints = null;

    public MotionItem withTimestamp(Float timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * 时间戳，相对时间戳，单位S，保留3位小数。
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

    public MotionItem withRoot(List<Object> root) {
        this.root = root;
        return this;
    }

    public MotionItem addRootItem(Object rootItem) {
        if (this.root == null) {
            this.root = new ArrayList<>();
        }
        this.root.add(rootItem);
        return this;
    }

    public MotionItem withRoot(Consumer<List<Object>> rootSetter) {
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
    public List<Object> getRoot() {
        return root;
    }

    public void setRoot(List<Object> root) {
        this.root = root;
    }

    public MotionItem withJoints(List<Object> joints) {
        this.joints = joints;
        return this;
    }

    public MotionItem addJointsItem(Object jointsItem) {
        if (this.joints == null) {
            this.joints = new ArrayList<>();
        }
        this.joints.add(jointsItem);
        return this;
    }

    public MotionItem withJoints(Consumer<List<Object>> jointsSetter) {
        if (this.joints == null) {
            this.joints = new ArrayList<>();
        }
        jointsSetter.accept(this.joints);
        return this;
    }

    /**
     * 75个关节点,四元数。
     * @return joints
     */
    public List<Object> getJoints() {
        return joints;
    }

    public void setJoints(List<Object> joints) {
        this.joints = joints;
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
            && Objects.equals(this.joints, that.joints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, root, joints);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MotionItem {\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    root: ").append(toIndentedString(root)).append("\n");
        sb.append("    joints: ").append(toIndentedString(joints)).append("\n");
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
