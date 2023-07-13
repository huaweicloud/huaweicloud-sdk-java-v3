package com.huaweicloud.sdk.oroas.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 任务请求信息
 */
public class TaskDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_json")

    private Object inputJson;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_url")

    private String inputUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_url")

    private String outputUrl;

    public TaskDto withInputJson(Object inputJson) {
        this.inputJson = inputJson;
        return this;
    }

    /**
     * 任务输入信息，json格式；每个子服务该对象结构不同，框架层不解析具体key，运行态直接透传给子服务REST API处理（参数合法性校验 只能子服务镜像内进行；当前算法镜像提供单独校验接口和处理接口，后续待统一交互机制）
     * @return inputJson
     */
    public Object getInputJson() {
        return inputJson;
    }

    public void setInputJson(Object inputJson) {
        this.inputJson = inputJson;
    }

    public TaskDto withInputUrl(String inputUrl) {
        this.inputUrl = inputUrl;
        return this;
    }

    /**
     * 任务输入信息为文件格式，传入值为租户OBS对应的文件绝对路径；在请求信息大于12MB情形使用该参数，需用户在Console进行OBS委托授权方可使用（和input_json二选一），暂不开放该功能
     * @return inputUrl
     */
    public String getInputUrl() {
        return inputUrl;
    }

    public void setInputUrl(String inputUrl) {
        this.inputUrl = inputUrl;
    }

    public TaskDto withOutputUrl(String outputUrl) {
        this.outputUrl = outputUrl;
        return this;
    }

    /**
     * 任务输出信息为文件格式，传入值为租户OBS对应的待存储路径前缀（和input_url成对使用），文件名服务端固定用task_id命名；在响应信息大于12MB情形使用该参数，需用户在Console进行OBS委托授权方可使用，暂不开放该功能
     * @return outputUrl
     */
    public String getOutputUrl() {
        return outputUrl;
    }

    public void setOutputUrl(String outputUrl) {
        this.outputUrl = outputUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskDto that = (TaskDto) obj;
        return Objects.equals(this.inputJson, that.inputJson) && Objects.equals(this.inputUrl, that.inputUrl)
            && Objects.equals(this.outputUrl, that.outputUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inputJson, inputUrl, outputUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskDto {\n");
        sb.append("    inputJson: ").append(toIndentedString(inputJson)).append("\n");
        sb.append("    inputUrl: ").append(toIndentedString(inputUrl)).append("\n");
        sb.append("    outputUrl: ").append(toIndentedString(outputUrl)).append("\n");
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
