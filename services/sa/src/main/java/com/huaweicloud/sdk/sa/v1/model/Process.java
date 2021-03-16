package com.huaweicloud.sdk.sa.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Process
 */
public class Process  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="path")
    
    private String path;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pid")
    
    private Integer pid;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="parent_pid")
    
    private Integer parentPid;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="launche_time")
    
    private OffsetDateTime launcheTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="terminate_time")
    
    private OffsetDateTime terminateTime;

    public Process withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 进程名，最大64个字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public Process withPath(String path) {
        this.path = path;
        return this;
    }

    


    /**
     * 进程执行文件路径，最大512个字符。
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    

    public Process withPid(Integer pid) {
        this.pid = pid;
        return this;
    }

    


    /**
     * 进程ID。
     * @return pid
     */
    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    

    public Process withParentPid(Integer parentPid) {
        this.parentPid = parentPid;
        return this;
    }

    


    /**
     * 父进程ID。
     * @return parentPid
     */
    public Integer getParentPid() {
        return parentPid;
    }

    public void setParentPid(Integer parentPid) {
        this.parentPid = parentPid;
    }

    

    public Process withLauncheTime(OffsetDateTime launcheTime) {
        this.launcheTime = launcheTime;
        return this;
    }

    


    /**
     * 进程启动时间，格式ISO8601：YYYY-MM-DDTHH:mm:ss.ms+timezone。时区信息为事件发生时区，无法解析时区的时间，默认时区填东八区。
     * @return launcheTime
     */
    public OffsetDateTime getLauncheTime() {
        return launcheTime;
    }

    public void setLauncheTime(OffsetDateTime launcheTime) {
        this.launcheTime = launcheTime;
    }

    

    public Process withTerminateTime(OffsetDateTime terminateTime) {
        this.terminateTime = terminateTime;
        return this;
    }

    


    /**
     * 进程结束时间，格式ISO8601：YYYY-MM-DDTHH:mm:ss.ms+timezone。时区信息为事件发生时区，无法解析时区的时间，默认时区填东八区。
     * @return terminateTime
     */
    public OffsetDateTime getTerminateTime() {
        return terminateTime;
    }

    public void setTerminateTime(OffsetDateTime terminateTime) {
        this.terminateTime = terminateTime;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Process process = (Process) o;
        return Objects.equals(this.name, process.name) &&
            Objects.equals(this.path, process.path) &&
            Objects.equals(this.pid, process.pid) &&
            Objects.equals(this.parentPid, process.parentPid) &&
            Objects.equals(this.launcheTime, process.launcheTime) &&
            Objects.equals(this.terminateTime, process.terminateTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, path, pid, parentPid, launcheTime, terminateTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Process {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
        sb.append("    parentPid: ").append(toIndentedString(parentPid)).append("\n");
        sb.append("    launcheTime: ").append(toIndentedString(launcheTime)).append("\n");
        sb.append("    terminateTime: ").append(toIndentedString(terminateTime)).append("\n");
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

