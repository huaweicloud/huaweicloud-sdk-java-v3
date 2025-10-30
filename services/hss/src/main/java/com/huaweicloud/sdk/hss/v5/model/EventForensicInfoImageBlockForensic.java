package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 容器镜像阻断取证信息 **取值范围**： 不涉及
 */
public class EventForensicInfoImageBlockForensic {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "msg")

    private String msg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private String image;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private Boolean version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private String result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    public EventForensicInfoImageBlockForensic withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 阻断类型 **取值范围**： 不涉及
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public EventForensicInfoImageBlockForensic withMsg(String msg) {
        this.msg = msg;
        return this;
    }

    /**
     * **参数解释**： 阻断原因 **取值范围**： 不涉及
     * @return msg
     */
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public EventForensicInfoImageBlockForensic withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * **参数解释**： 路径 **取值范围**： 不涉及
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public EventForensicInfoImageBlockForensic withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * **参数解释**： 镜像名称 **取值范围**： 不涉及
     * @return image
     */
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public EventForensicInfoImageBlockForensic withVersion(Boolean version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**： 镜像版本 **取值范围**： 不涉及
     * @return version
     */
    public Boolean getVersion() {
        return version;
    }

    public void setVersion(Boolean version) {
        this.version = version;
    }

    public EventForensicInfoImageBlockForensic withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * **参数解释**： 阻断结果 **取值范围**： 不涉及
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public EventForensicInfoImageBlockForensic withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * **参数解释**： 发生时间 **取值范围**： 不涉及
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventForensicInfoImageBlockForensic that = (EventForensicInfoImageBlockForensic) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.msg, that.msg)
            && Objects.equals(this.path, that.path) && Objects.equals(this.image, that.image)
            && Objects.equals(this.version, that.version) && Objects.equals(this.result, that.result)
            && Objects.equals(this.time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, msg, path, image, version, result, time);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventForensicInfoImageBlockForensic {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
