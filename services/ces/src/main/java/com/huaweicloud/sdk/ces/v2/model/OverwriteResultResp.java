package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 如果出现同名模板，返回是否覆盖的结果信息。 
 */
public class OverwriteResultResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_ids")

    private String successIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_ids")

    private String failedIds;

    public OverwriteResultResp withSuccessIds(String successIds) {
        this.successIds = successIds;
        return this;
    }

    /**
     * **参数解释**：已覆盖的模板ID值。 **取值范围**：长度为[2,64]个字符。 
     * @return successIds
     */
    public String getSuccessIds() {
        return successIds;
    }

    public void setSuccessIds(String successIds) {
        this.successIds = successIds;
    }

    public OverwriteResultResp withFailedIds(String failedIds) {
        this.failedIds = failedIds;
        return this;
    }

    /**
     * **参数解释**：未覆盖的模板ID值。 **取值范围**：长度为[2,64]个字符。 
     * @return failedIds
     */
    public String getFailedIds() {
        return failedIds;
    }

    public void setFailedIds(String failedIds) {
        this.failedIds = failedIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OverwriteResultResp that = (OverwriteResultResp) obj;
        return Objects.equals(this.successIds, that.successIds) && Objects.equals(this.failedIds, that.failedIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(successIds, failedIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OverwriteResultResp {\n");
        sb.append("    successIds: ").append(toIndentedString(successIds)).append("\n");
        sb.append("    failedIds: ").append(toIndentedString(failedIds)).append("\n");
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
