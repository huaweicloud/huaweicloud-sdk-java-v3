package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 自启动项取证信息 **取值范围**： 不涉及
 */
public class EventForensicInfoAutoLaunchForensic {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event")

    private Integer event;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_interval")

    private String runInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hash")

    private String hash;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mtime")

    private String mtime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    public EventForensicInfoAutoLaunchForensic withEvent(Integer event) {
        this.event = event;
        return this;
    }

    /**
     * **参数解释**： 事件 **取值范围**： 不涉及
     * @return event
     */
    public Integer getEvent() {
        return event;
    }

    public void setEvent(Integer event) {
        this.event = event;
    }

    public EventForensicInfoAutoLaunchForensic withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 类型 **取值范围**： 不涉及
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public EventForensicInfoAutoLaunchForensic withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * **参数解释**： 用户 **取值范围**： 不涉及
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public EventForensicInfoAutoLaunchForensic withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 命令 **取值范围**： 不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EventForensicInfoAutoLaunchForensic withRunInterval(String runInterval) {
        this.runInterval = runInterval;
        return this;
    }

    /**
     * **参数解释**： 运行间隔 **取值范围**： 不涉及
     * @return runInterval
     */
    public String getRunInterval() {
        return runInterval;
    }

    public void setRunInterval(String runInterval) {
        this.runInterval = runInterval;
    }

    public EventForensicInfoAutoLaunchForensic withHash(String hash) {
        this.hash = hash;
        return this;
    }

    /**
     * **参数解释**： hash **取值范围**： 不涉及
     * @return hash
     */
    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public EventForensicInfoAutoLaunchForensic withMtime(String mtime) {
        this.mtime = mtime;
        return this;
    }

    /**
     * **参数解释**： hash **取值范围**： 不涉及
     * @return mtime
     */
    public String getMtime() {
        return mtime;
    }

    public void setMtime(String mtime) {
        this.mtime = mtime;
    }

    public EventForensicInfoAutoLaunchForensic withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 自启动项信息 **取值范围**： 不涉及
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EventForensicInfoAutoLaunchForensic withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * **参数解释**： 进程文件命令行 **取值范围**： 不涉及
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventForensicInfoAutoLaunchForensic that = (EventForensicInfoAutoLaunchForensic) obj;
        return Objects.equals(this.event, that.event) && Objects.equals(this.type, that.type)
            && Objects.equals(this.owner, that.owner) && Objects.equals(this.name, that.name)
            && Objects.equals(this.runInterval, that.runInterval) && Objects.equals(this.hash, that.hash)
            && Objects.equals(this.mtime, that.mtime) && Objects.equals(this.description, that.description)
            && Objects.equals(this.path, that.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(event, type, owner, name, runInterval, hash, mtime, description, path);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventForensicInfoAutoLaunchForensic {\n");
        sb.append("    event: ").append(toIndentedString(event)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    runInterval: ").append(toIndentedString(runInterval)).append("\n");
        sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
        sb.append("    mtime: ").append(toIndentedString(mtime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
