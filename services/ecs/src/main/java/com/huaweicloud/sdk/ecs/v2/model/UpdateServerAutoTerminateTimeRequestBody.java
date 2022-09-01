package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * This is a auto create Body Object
 */
public class UpdateServerAutoTerminateTimeRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_terminate_time")

    @JacksonXmlProperty(localName = "auto_terminate_time")

    private String autoTerminateTime;

    public UpdateServerAutoTerminateTimeRequestBody withAutoTerminateTime(String autoTerminateTime) {
        this.autoTerminateTime = autoTerminateTime;
        return this;
    }

    /**
     * 销毁时间
     * @return autoTerminateTime
     */
    public String getAutoTerminateTime() {
        return autoTerminateTime;
    }

    public void setAutoTerminateTime(String autoTerminateTime) {
        this.autoTerminateTime = autoTerminateTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateServerAutoTerminateTimeRequestBody updateServerAutoTerminateTimeRequestBody =
            (UpdateServerAutoTerminateTimeRequestBody) o;
        return Objects.equals(this.autoTerminateTime, updateServerAutoTerminateTimeRequestBody.autoTerminateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoTerminateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateServerAutoTerminateTimeRequestBody {\n");
        sb.append("    autoTerminateTime: ").append(toIndentedString(autoTerminateTime)).append("\n");
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
