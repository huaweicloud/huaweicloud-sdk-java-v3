package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class RebuildRepositoryNavigationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private String result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private String duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Long size;

    public RebuildRepositoryNavigationResponse withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * **参数解释：** 结果标识。 **约束限制：** 不涉及。
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public RebuildRepositoryNavigationResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * **参数解释：** 结果消息。 **约束限制：** 不涉及。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public RebuildRepositoryNavigationResponse withDuration(String duration) {
        this.duration = duration;
        return this;
    }

    /**
     * **参数解释：** 触发任务耗时（毫秒）。 **约束限制：** 不涉及。
     * @return duration
     */
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public RebuildRepositoryNavigationResponse withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * **参数解释：** 当前代码导航索引大小（字节）。 **约束限制：** 不涉及。
     * @return size
     */
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RebuildRepositoryNavigationResponse that = (RebuildRepositoryNavigationResponse) obj;
        return Objects.equals(this.result, that.result) && Objects.equals(this.message, that.message)
            && Objects.equals(this.duration, that.duration) && Objects.equals(this.size, that.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, message, duration, size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RebuildRepositoryNavigationResponse {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
