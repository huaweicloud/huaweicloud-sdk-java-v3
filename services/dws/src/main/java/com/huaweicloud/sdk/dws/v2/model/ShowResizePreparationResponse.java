package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowResizePreparationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support")

    private Boolean isSupport;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private String progress;

    public ShowResizePreparationResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 扩容准备的状态。 **取值范围**： INIT：扩容准备初始化中； PREPARING：扩容准备进行中； FAIL：扩容准备失败； SUCCESS：扩容准备成功； WAIT_RETRY：等待扩容准备重试；
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowResizePreparationResponse withIsSupport(Boolean isSupport) {
        this.isSupport = isSupport;
        return this;
    }

    /**
     * **参数解释**： 是否支持扩容准备。 **取值范围**： true：支持扩容准备； false：不支持扩容准备；
     * @return isSupport
     */
    public Boolean getIsSupport() {
        return isSupport;
    }

    public void setIsSupport(Boolean isSupport) {
        this.isSupport = isSupport;
    }

    public ShowResizePreparationResponse withProgress(String progress) {
        this.progress = progress;
        return this;
    }

    /**
     * **参数解释**： 扩容准备进度。 **取值范围**： 不涉及
     * @return progress
     */
    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowResizePreparationResponse that = (ShowResizePreparationResponse) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.isSupport, that.isSupport)
            && Objects.equals(this.progress, that.progress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, isSupport, progress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowResizePreparationResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    isSupport: ").append(toIndentedString(isSupport)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
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
