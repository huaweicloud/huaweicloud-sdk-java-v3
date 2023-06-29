package com.huaweicloud.sdk.cloudtable.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class UpdateClusterSettingResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modify_result")

    private Boolean modifyResult;

    public UpdateClusterSettingResponse withModifyResult(Boolean modifyResult) {
        this.modifyResult = modifyResult;
        return this;
    }

    /**
     * 配置修改结果
     * @return modifyResult
     */
    public Boolean getModifyResult() {
        return modifyResult;
    }

    public void setModifyResult(Boolean modifyResult) {
        this.modifyResult = modifyResult;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateClusterSettingResponse that = (UpdateClusterSettingResponse) obj;
        return Objects.equals(this.modifyResult, that.modifyResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modifyResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateClusterSettingResponse {\n");
        sb.append("    modifyResult: ").append(toIndentedString(modifyResult)).append("\n");
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
