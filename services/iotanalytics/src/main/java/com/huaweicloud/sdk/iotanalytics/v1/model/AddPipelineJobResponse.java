package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class AddPipelineJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline_id")

    private String pipelineId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_info")

    private Map<String, Object> checkInfo = null;

    public AddPipelineJobResponse withPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    /** 管道ID
     * 
     * @return pipelineId */
    public String getPipelineId() {
        return pipelineId;
    }

    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }

    public AddPipelineJobResponse withCheckInfo(Map<String, Object> checkInfo) {
        this.checkInfo = checkInfo;
        return this;
    }

    public AddPipelineJobResponse putCheckInfoItem(String key, Object checkInfoItem) {
        if (this.checkInfo == null) {
            this.checkInfo = new HashMap<>();
        }
        this.checkInfo.put(key, checkInfoItem);
        return this;
    }

    public AddPipelineJobResponse withCheckInfo(Consumer<Map<String, Object>> checkInfoSetter) {
        if (this.checkInfo == null) {
            this.checkInfo = new HashMap<>();
        }
        checkInfoSetter.accept(this.checkInfo);
        return this;
    }

    /** 管道错误详情
     * 
     * @return checkInfo */
    public Map<String, Object> getCheckInfo() {
        return checkInfo;
    }

    public void setCheckInfo(Map<String, Object> checkInfo) {
        this.checkInfo = checkInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddPipelineJobResponse addPipelineJobResponse = (AddPipelineJobResponse) o;
        return Objects.equals(this.pipelineId, addPipelineJobResponse.pipelineId)
            && Objects.equals(this.checkInfo, addPipelineJobResponse.checkInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pipelineId, checkInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddPipelineJobResponse {\n");
        sb.append("    pipelineId: ").append(toIndentedString(pipelineId)).append("\n");
        sb.append("    checkInfo: ").append(toIndentedString(checkInfo)).append("\n");
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
