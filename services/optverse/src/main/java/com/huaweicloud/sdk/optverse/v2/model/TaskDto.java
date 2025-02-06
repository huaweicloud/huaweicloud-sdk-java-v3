package com.huaweicloud.sdk.optverse.v2.model;

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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskDto that = (TaskDto) obj;
        return Objects.equals(this.inputJson, that.inputJson);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inputJson);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskDto {\n");
        sb.append("    inputJson: ").append(toIndentedString(inputJson)).append("\n");
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
