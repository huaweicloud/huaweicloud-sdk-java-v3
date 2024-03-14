package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 直播任务记录。
 */
public class LiveJobLog {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interaction_records_url")

    private String interactionRecordsUrl;

    public LiveJobLog withInteractionRecordsUrl(String interactionRecordsUrl) {
        this.interactionRecordsUrl = interactionRecordsUrl;
        return this;
    }

    /**
     * 直播互动记录文件地址
     * @return interactionRecordsUrl
     */
    public String getInteractionRecordsUrl() {
        return interactionRecordsUrl;
    }

    public void setInteractionRecordsUrl(String interactionRecordsUrl) {
        this.interactionRecordsUrl = interactionRecordsUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LiveJobLog that = (LiveJobLog) obj;
        return Objects.equals(this.interactionRecordsUrl, that.interactionRecordsUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(interactionRecordsUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LiveJobLog {\n");
        sb.append("    interactionRecordsUrl: ").append(toIndentedString(interactionRecordsUrl)).append("\n");
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
