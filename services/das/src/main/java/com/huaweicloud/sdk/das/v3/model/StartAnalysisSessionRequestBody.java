package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * StartAnalysisSessionRequestBody
 */
public class StartAnalysisSessionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collect_request_id")

    private String collectRequestId;

    public StartAnalysisSessionRequestBody withCollectRequestId(String collectRequestId) {
        this.collectRequestId = collectRequestId;
        return this;
    }

    /**
     * 收集会话请求ID
     * @return collectRequestId
     */
    public String getCollectRequestId() {
        return collectRequestId;
    }

    public void setCollectRequestId(String collectRequestId) {
        this.collectRequestId = collectRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StartAnalysisSessionRequestBody that = (StartAnalysisSessionRequestBody) obj;
        return Objects.equals(this.collectRequestId, that.collectRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(collectRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartAnalysisSessionRequestBody {\n");
        sb.append("    collectRequestId: ").append(toIndentedString(collectRequestId)).append("\n");
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
