package com.huaweicloud.sdk.sa.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/** Container */
public class Container {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_name")

    private String nodeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "launched_time")

    private OffsetDateTime launchedTime;

    public Container withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /** 镜像ID。
     * 
     * @return imageId */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public Container withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /** 镜像名称。
     * 
     * @return imageName */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public Container withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /** 容器所在节点ID。
     * 
     * @return nodeId */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public Container withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /** 容器所在节点名称。
     * 
     * @return nodeName */
    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public Container withLaunchedTime(OffsetDateTime launchedTime) {
        this.launchedTime = launchedTime;
        return this;
    }

    /** 容器启动时间。
     * 
     * @return launchedTime */
    public OffsetDateTime getLaunchedTime() {
        return launchedTime;
    }

    public void setLaunchedTime(OffsetDateTime launchedTime) {
        this.launchedTime = launchedTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Container container = (Container) o;
        return Objects.equals(this.imageId, container.imageId) && Objects.equals(this.imageName, container.imageName)
            && Objects.equals(this.nodeId, container.nodeId) && Objects.equals(this.nodeName, container.nodeName)
            && Objects.equals(this.launchedTime, container.launchedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageId, imageName, nodeId, nodeName, launchedTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Container {\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
        sb.append("    launchedTime: ").append(toIndentedString(launchedTime)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
