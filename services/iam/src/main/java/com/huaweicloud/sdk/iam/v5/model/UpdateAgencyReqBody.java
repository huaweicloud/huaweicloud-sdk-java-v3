package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * The request body of update agency request.
 */
public class UpdateAgencyReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_session_duration")

    private Integer maxSessionDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public UpdateAgencyReqBody withMaxSessionDuration(Integer maxSessionDuration) {
        this.maxSessionDuration = maxSessionDuration;
        return this;
    }

    /**
     * 信任委托最大会话时长，默认为3600秒，取值范围为[3600,43200]。
     * minimum: 3600
     * maximum: 43200
     * @return maxSessionDuration
     */
    public Integer getMaxSessionDuration() {
        return maxSessionDuration;
    }

    public void setMaxSessionDuration(Integer maxSessionDuration) {
        this.maxSessionDuration = maxSessionDuration;
    }

    public UpdateAgencyReqBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 信任委托描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateAgencyReqBody that = (UpdateAgencyReqBody) obj;
        return Objects.equals(this.maxSessionDuration, that.maxSessionDuration)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxSessionDuration, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAgencyReqBody {\n");
        sb.append("    maxSessionDuration: ").append(toIndentedString(maxSessionDuration)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
