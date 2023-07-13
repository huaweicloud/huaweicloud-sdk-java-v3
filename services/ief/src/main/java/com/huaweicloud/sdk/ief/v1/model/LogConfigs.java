package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 边缘节点日志配置
 */
public class LogConfigs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

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
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component")

    private String component;

    public LogConfigs withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 数据库保存的主键，不需要关注此字段。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LogConfigs withSize(Integer size) {
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

    public LogConfigs withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * - 当type为LTS时，应用级日志可配置为On或Off；系统级日志可配置为Off/Error/Warning/Info/Debug； - 当type为local时，无需配置level。
     * @return level
     */
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public LogConfigs withRotateNum(Integer rotateNum) {
        this.rotateNum = rotateNum;
        return this;
    }

    /**
     * 应用日志rotate个数，默认5，取值范围1-10。
     * @return rotateNum
     */
    public Integer getRotateNum() {
        return rotateNum;
    }

    public void setRotateNum(Integer rotateNum) {
        this.rotateNum = rotateNum;
    }

    public LogConfigs withRotatePeriod(String rotatePeriod) {
        this.rotatePeriod = rotatePeriod;
        return this;
    }

    /**
     * 应用日志rotate周期，可选项： - daily - monthly - weekly - yearly
     * @return rotatePeriod
     */
    public String getRotatePeriod() {
        return rotatePeriod;
    }

    public void setRotatePeriod(String rotatePeriod) {
        this.rotatePeriod = rotatePeriod;
    }

    public LogConfigs withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * - LTS：将日志发送到AOM - local：本地日志
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LogConfigs withComponent(String component) {
        this.component = component;
        return this;
    }

    /**
     * - app：部署到边缘节点上的应用的日志 - system：边缘节点上系统的日志
     * @return component
     */
    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LogConfigs that = (LogConfigs) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.size, that.size)
            && Objects.equals(this.level, that.level) && Objects.equals(this.rotateNum, that.rotateNum)
            && Objects.equals(this.rotatePeriod, that.rotatePeriod) && Objects.equals(this.type, that.type)
            && Objects.equals(this.component, that.component);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, size, level, rotateNum, rotatePeriod, type, component);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogConfigs {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    rotateNum: ").append(toIndentedString(rotateNum)).append("\n");
        sb.append("    rotatePeriod: ").append(toIndentedString(rotatePeriod)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    component: ").append(toIndentedString(component)).append("\n");
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
