package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 描述容器当前状态
 */
public class ContainerStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private Object state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastState")

    private String lastState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ready")

    private Boolean ready;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restartCount")

    private Integer restartCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private String image;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "imageID")

    private String imageID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "started")

    private String started;

    public ContainerStatus withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 容器的唯一名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ContainerStatus withState(Object state) {
        this.state = state;
        return this;
    }

    /**
     * 当前容器状态
     * @return state
     */
    public Object getState() {
        return state;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public ContainerStatus withLastState(String lastState) {
        this.lastState = lastState;
        return this;
    }

    /**
     * 上次终止时的状态
     * @return lastState
     */
    public String getLastState() {
        return lastState;
    }

    public void setLastState(String lastState) {
        this.lastState = lastState;
    }

    public ContainerStatus withReady(Boolean ready) {
        this.ready = ready;
        return this;
    }

    /**
     * 容器是否通过就绪检查
     * @return ready
     */
    public Boolean getReady() {
        return ready;
    }

    public void setReady(Boolean ready) {
        this.ready = ready;
    }

    public ContainerStatus withRestartCount(Integer restartCount) {
        this.restartCount = restartCount;
        return this;
    }

    /**
     * 容器重启次数
     * @return restartCount
     */
    public Integer getRestartCount() {
        return restartCount;
    }

    public void setRestartCount(Integer restartCount) {
        this.restartCount = restartCount;
    }

    public ContainerStatus withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * 容器运行的镜像名称
     * @return image
     */
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public ContainerStatus withImageID(String imageID) {
        this.imageID = imageID;
        return this;
    }

    /**
     * 容器运行的镜像ID
     * @return imageID
     */
    public String getImageID() {
        return imageID;
    }

    public void setImageID(String imageID) {
        this.imageID = imageID;
    }

    public ContainerStatus withStarted(String started) {
        this.started = started;
        return this;
    }

    /**
     * 容器是否已经成功启动并进入稳定运行阶段
     * @return started
     */
    public String getStarted() {
        return started;
    }

    public void setStarted(String started) {
        this.started = started;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ContainerStatus that = (ContainerStatus) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.state, that.state)
            && Objects.equals(this.lastState, that.lastState) && Objects.equals(this.ready, that.ready)
            && Objects.equals(this.restartCount, that.restartCount) && Objects.equals(this.image, that.image)
            && Objects.equals(this.imageID, that.imageID) && Objects.equals(this.started, that.started);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, state, lastState, ready, restartCount, image, imageID, started);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContainerStatus {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    lastState: ").append(toIndentedString(lastState)).append("\n");
        sb.append("    ready: ").append(toIndentedString(ready)).append("\n");
        sb.append("    restartCount: ").append(toIndentedString(restartCount)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    imageID: ").append(toIndentedString(imageID)).append("\n");
        sb.append("    started: ").append(toIndentedString(started)).append("\n");
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
