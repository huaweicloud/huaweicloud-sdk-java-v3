package com.huaweicloud.sdk.frs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 活体检测结果，VideoDetectResult结构见[VideoDetectResult](zh-cn_topic_0130807053.xml)。 调用失败时无此字段。 */
public class LiveDetectRespVideoresult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alive")

    private Boolean alive;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actions")

    private List<ActionsList> actions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "picture")

    private String picture;

    public LiveDetectRespVideoresult withAlive(Boolean alive) {
        this.alive = alive;
        return this;
    }

    /** 是否是活体。
     * 
     * @return alive */
    public Boolean getAlive() {
        return alive;
    }

    public void setAlive(Boolean alive) {
        this.alive = alive;
    }

    public LiveDetectRespVideoresult withActions(List<ActionsList> actions) {
        this.actions = actions;
        return this;
    }

    public LiveDetectRespVideoresult addActionsItem(ActionsList actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    public LiveDetectRespVideoresult withActions(Consumer<List<ActionsList>> actionsSetter) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        actionsSetter.accept(this.actions);
        return this;
    }

    /** 动作列表。
     * 
     * @return actions */
    public List<ActionsList> getActions() {
        return actions;
    }

    public void setActions(List<ActionsList> actions) {
        this.actions = actions;
    }

    public LiveDetectRespVideoresult withPicture(String picture) {
        this.picture = picture;
        return this;
    }

    /** 检测出最大人脸的图片base64。
     * 
     * @return picture */
    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LiveDetectRespVideoresult liveDetectRespVideoresult = (LiveDetectRespVideoresult) o;
        return Objects.equals(this.alive, liveDetectRespVideoresult.alive)
            && Objects.equals(this.actions, liveDetectRespVideoresult.actions)
            && Objects.equals(this.picture, liveDetectRespVideoresult.picture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alive, actions, picture);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LiveDetectRespVideoresult {\n");
        sb.append("    alive: ").append(toIndentedString(alive)).append("\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("    picture: ").append(toIndentedString(picture)).append("\n");
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
