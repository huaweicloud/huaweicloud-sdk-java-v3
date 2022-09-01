package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 慢日志单个条目
 */
public class SlowlogItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command")

    @JacksonXmlProperty(localName = "command")

    private String command;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    @JacksonXmlProperty(localName = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    @JacksonXmlProperty(localName = "duration")

    private String duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shard_name")

    @JacksonXmlProperty(localName = "shard_name")

    private String shardName;

    public SlowlogItem withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 慢日志的唯一标识
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public SlowlogItem withCommand(String command) {
        this.command = command;
        return this;
    }

    /**
     * 慢命令
     * @return command
     */
    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public SlowlogItem withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 执行开始时间,格式为“2020-06-19T07:06:07Z”
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public SlowlogItem withDuration(String duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 持续时间，单位是ms
     * @return duration
     */
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public SlowlogItem withShardName(String shardName) {
        this.shardName = shardName;
        return this;
    }

    /**
     * 慢命令所在的分片名称，仅在实例类型为集群时支持
     * @return shardName
     */
    public String getShardName() {
        return shardName;
    }

    public void setShardName(String shardName) {
        this.shardName = shardName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SlowlogItem slowlogItem = (SlowlogItem) o;
        return Objects.equals(this.id, slowlogItem.id) && Objects.equals(this.command, slowlogItem.command)
            && Objects.equals(this.startTime, slowlogItem.startTime)
            && Objects.equals(this.duration, slowlogItem.duration)
            && Objects.equals(this.shardName, slowlogItem.shardName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, command, startTime, duration, shardName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SlowlogItem {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    shardName: ").append(toIndentedString(shardName)).append("\n");
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
