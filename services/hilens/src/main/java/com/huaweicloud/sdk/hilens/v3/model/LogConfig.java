package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 日志配置列表
 */
public class LogConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component")

    private String component;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private String level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rotate_num")

    private Integer rotateNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rotate_period")

    private String rotatePeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public LogConfig withComponent(String component) {
        this.component = component;
        return this;
    }

    /**
     * app：应用日志。 system：系统的日志
     * @return component
     */
    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public LogConfig withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * 系统级日志可配置为/error/warning/info/debug ; 不传会默认为info。
     * @return level
     */
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public LogConfig withRotateNum(Integer rotateNum) {
        this.rotateNum = rotateNum;
        return this;
    }

    /**
     * 日志rotate个数，默认5，hilens取值范围1-30，ief取值范围1-10
     * @return rotateNum
     */
    public Integer getRotateNum() {
        return rotateNum;
    }

    public void setRotateNum(Integer rotateNum) {
        this.rotateNum = rotateNum;
    }

    public LogConfig withRotatePeriod(String rotatePeriod) {
        this.rotatePeriod = rotatePeriod;
        return this;
    }

    /**
     * 日志rotate周期，可选项，只支持ief：daily monthly weekly yearly.
     * @return rotatePeriod
     */
    public String getRotatePeriod() {
        return rotatePeriod;
    }

    public void setRotatePeriod(String rotatePeriod) {
        this.rotatePeriod = rotatePeriod;
    }

    public LogConfig withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 应用日志文件大小限制，单位MB，默认50，取值范围10-1000。
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public LogConfig withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * - LTS 将日志发送到云日志服务（Log Tank Service，简称LTS） - local 本地日志
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LogConfig that = (LogConfig) obj;
        return Objects.equals(this.component, that.component) && Objects.equals(this.level, that.level)
            && Objects.equals(this.rotateNum, that.rotateNum) && Objects.equals(this.rotatePeriod, that.rotatePeriod)
            && Objects.equals(this.size, that.size) && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(component, level, rotateNum, rotatePeriod, size, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogConfig {\n");
        sb.append("    component: ").append(toIndentedString(component)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    rotateNum: ").append(toIndentedString(rotateNum)).append("\n");
        sb.append("    rotatePeriod: ").append(toIndentedString(rotatePeriod)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
