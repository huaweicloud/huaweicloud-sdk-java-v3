package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 卷配置
 */
public class Volumes {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination")

    private String destination;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_only")

    private Boolean readOnly;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_mode")

    private Integer defaultMode;

    public Volumes withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 卷名称，小写字母或数字，最长63个字符
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Volumes withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 卷的类型，支持configMap,secret,emptyDir,hostPath
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Volumes withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * 卷来源，type为hostPath时输入路径，要求以/开头，后面可包含中划线，反斜杠，下划线，点号，字母，数字； secret时输入secret名称，configMap时输入configMap名称，emptyDir时输入disk或memory
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Volumes withDestination(String destination) {
        this.destination = destination;
        return this;
    }

    /**
     * 卷挂载路径，必须是合法的路径
     * @return destination
     */
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Volumes withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    /**
     * 读写权限，configMap和secret类型只支持读权限
     * @return readOnly
     */
    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public Volumes withDefaultMode(Integer defaultMode) {
        this.defaultMode = defaultMode;
        return this;
    }

    /**
     * 挂载的文件权限，仅configMap和secret类型生效，填写值为十进制表示的linux文件权限，默认为420（对应权限644）
     * @return defaultMode
     */
    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Volumes that = (Volumes) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.source, that.source) && Objects.equals(this.destination, that.destination)
            && Objects.equals(this.readOnly, that.readOnly) && Objects.equals(this.defaultMode, that.defaultMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, source, destination, readOnly, defaultMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Volumes {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
        sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
        sb.append("    defaultMode: ").append(toIndentedString(defaultMode)).append("\n");
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
