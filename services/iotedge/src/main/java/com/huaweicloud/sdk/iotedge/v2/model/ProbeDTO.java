package com.huaweicloud.sdk.iotedge.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotedge.v2.model.HttpGetDTO;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ProbeDTO
 */
public class ProbeDTO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="exec_command")
    
    
    private String execCommand;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="http_get")
    
    
    private HttpGetDTO httpGet;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="initial_delay_seconds")
    
    
    private Integer initialDelaySeconds;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="timeout_seconds")
    
    
    private Integer timeoutSeconds;

    public ProbeDTO withExecCommand(String execCommand) {
        this.execCommand = execCommand;
        return this;
    }

    


    /**
     * 执行探测的命令行命令
     * @return execCommand
     */
    public String getExecCommand() {
        return execCommand;
    }

    public void setExecCommand(String execCommand) {
        this.execCommand = execCommand;
    }

    

    public ProbeDTO withHttpGet(HttpGetDTO httpGet) {
        this.httpGet = httpGet;
        return this;
    }

    public ProbeDTO withHttpGet(Consumer<HttpGetDTO> httpGetSetter) {
        if(this.httpGet == null ){
            this.httpGet = new HttpGetDTO();
            httpGetSetter.accept(this.httpGet);
        }
        
        return this;
    }


    /**
     * Get httpGet
     * @return httpGet
     */
    public HttpGetDTO getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(HttpGetDTO httpGet) {
        this.httpGet = httpGet;
    }

    

    public ProbeDTO withInitialDelaySeconds(Integer initialDelaySeconds) {
        this.initialDelaySeconds = initialDelaySeconds;
        return this;
    }

    


    /**
     * 表示从工作负载启动后从多久开始探测
     * minimum: 0
     * maximum: 3600
     * @return initialDelaySeconds
     */
    public Integer getInitialDelaySeconds() {
        return initialDelaySeconds;
    }

    public void setInitialDelaySeconds(Integer initialDelaySeconds) {
        this.initialDelaySeconds = initialDelaySeconds;
    }

    

    public ProbeDTO withTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }

    


    /**
     * 表示探测超时时间
     * minimum: 0
     * maximum: 3600
     * @return timeoutSeconds
     */
    public Integer getTimeoutSeconds() {
        return timeoutSeconds;
    }

    public void setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProbeDTO probeDTO = (ProbeDTO) o;
        return Objects.equals(this.execCommand, probeDTO.execCommand) &&
            Objects.equals(this.httpGet, probeDTO.httpGet) &&
            Objects.equals(this.initialDelaySeconds, probeDTO.initialDelaySeconds) &&
            Objects.equals(this.timeoutSeconds, probeDTO.timeoutSeconds);
    }
    @Override
    public int hashCode() {
        return Objects.hash(execCommand, httpGet, initialDelaySeconds, timeoutSeconds);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProbeDTO {\n");
        sb.append("    execCommand: ").append(toIndentedString(execCommand)).append("\n");
        sb.append("    httpGet: ").append(toIndentedString(httpGet)).append("\n");
        sb.append("    initialDelaySeconds: ").append(toIndentedString(initialDelaySeconds)).append("\n");
        sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
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

