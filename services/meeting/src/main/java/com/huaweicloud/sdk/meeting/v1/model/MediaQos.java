package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 某种媒体的QoS，包括视频、音频或辅流
 */
public class MediaQos {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upList")

    private List<Qos> upList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "downList")

    private List<Qos> downList = null;

    public MediaQos withUpList(List<Qos> upList) {
        this.upList = upList;
        return this;
    }

    public MediaQos addUpListItem(Qos upListItem) {
        if (this.upList == null) {
            this.upList = new ArrayList<>();
        }
        this.upList.add(upListItem);
        return this;
    }

    public MediaQos withUpList(Consumer<List<Qos>> upListSetter) {
        if (this.upList == null) {
            this.upList = new ArrayList<>();
        }
        upListSetter.accept(this.upList);
        return this;
    }

    /**
     * 客户端-->服务器方向QoS
     * @return upList
     */
    public List<Qos> getUpList() {
        return upList;
    }

    public void setUpList(List<Qos> upList) {
        this.upList = upList;
    }

    public MediaQos withDownList(List<Qos> downList) {
        this.downList = downList;
        return this;
    }

    public MediaQos addDownListItem(Qos downListItem) {
        if (this.downList == null) {
            this.downList = new ArrayList<>();
        }
        this.downList.add(downListItem);
        return this;
    }

    public MediaQos withDownList(Consumer<List<Qos>> downListSetter) {
        if (this.downList == null) {
            this.downList = new ArrayList<>();
        }
        downListSetter.accept(this.downList);
        return this;
    }

    /**
     * 服务器-->客户端方向QoS
     * @return downList
     */
    public List<Qos> getDownList() {
        return downList;
    }

    public void setDownList(List<Qos> downList) {
        this.downList = downList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MediaQos that = (MediaQos) obj;
        return Objects.equals(this.upList, that.upList) && Objects.equals(this.downList, that.downList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(upList, downList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MediaQos {\n");
        sb.append("    upList: ").append(toIndentedString(upList)).append("\n");
        sb.append("    downList: ").append(toIndentedString(downList)).append("\n");
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
