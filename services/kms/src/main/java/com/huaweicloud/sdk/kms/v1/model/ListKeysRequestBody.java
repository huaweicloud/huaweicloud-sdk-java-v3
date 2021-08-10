package com.huaweicloud.sdk.kms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** ListKeysRequestBody */
public class ListKeysRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private String limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_state")

    private String keyState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence")

    private String sequence;

    public ListKeysRequestBody withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /** 指定查询返回记录条数，如果指定查询记录条数小于存在的条数，响应参数“truncated”将返回“true”，表示存在分页。取值在密钥最大个数范围以内。例如：100
     * 
     * @return limit */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public ListKeysRequestBody withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /** 分页查询起始位置标识。分页查询收到的响应参数“truncated”为“true”时，可以发送连续的请求获取更多的记录条数，“marker”设置为响应的next_marker的值。例如：10
     * 
     * @return marker */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListKeysRequestBody withKeyState(String keyState) {
        this.keyState = keyState;
        return this;
    }

    /** 密钥状态，满足正则匹配“^[1-5]{1}$”，枚举如下： - “1”表示待激活状态 - “2”表示启用状态 - “3”表示禁用状态 - “4”表示计划删除状态 - “5”表示等待导入状态
     * 
     * @return keyState */
    public String getKeyState() {
        return keyState;
    }

    public void setKeyState(String keyState) {
        this.keyState = keyState;
    }

    public ListKeysRequestBody withSequence(String sequence) {
        this.sequence = sequence;
        return this;
    }

    /** 请求消息序列号，36字节序列号。 例如：919c82d4-8046-4722-9094-35c3c6524cff
     * 
     * @return sequence */
    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListKeysRequestBody listKeysRequestBody = (ListKeysRequestBody) o;
        return Objects.equals(this.limit, listKeysRequestBody.limit)
            && Objects.equals(this.marker, listKeysRequestBody.marker)
            && Objects.equals(this.keyState, listKeysRequestBody.keyState)
            && Objects.equals(this.sequence, listKeysRequestBody.sequence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, marker, keyState, sequence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListKeysRequestBody {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    keyState: ").append(toIndentedString(keyState)).append("\n");
        sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
