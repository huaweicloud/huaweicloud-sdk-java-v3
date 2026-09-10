package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class GenerateOpsMultimodalUploadUrlResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upload_url")

    private String uploadUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_path")

    private String obsPath;

    public GenerateOpsMultimodalUploadUrlResponse withUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
        return this;
    }

    /**
     * **参数解释：** OBS预签名上传链接，用户使用该链接上传多模态文件。 **约束限制：** 有效期为15分钟。 **取值范围：** HTTPS URL字符串。 **默认取值：** 不涉及。
     * @return uploadUrl
     */
    public String getUploadUrl() {
        return uploadUrl;
    }

    public void setUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
    }

    public GenerateOpsMultimodalUploadUrlResponse withObsPath(String obsPath) {
        this.obsPath = obsPath;
        return this;
    }

    /**
     * **参数解释：** OBS对象路径，评估时传入此路径。 **约束限制：** 格式为{uuid}.{suffix}。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return obsPath
     */
    public String getObsPath() {
        return obsPath;
    }

    public void setObsPath(String obsPath) {
        this.obsPath = obsPath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GenerateOpsMultimodalUploadUrlResponse that = (GenerateOpsMultimodalUploadUrlResponse) obj;
        return Objects.equals(this.uploadUrl, that.uploadUrl) && Objects.equals(this.obsPath, that.obsPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uploadUrl, obsPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GenerateOpsMultimodalUploadUrlResponse {\n");
        sb.append("    uploadUrl: ").append(toIndentedString(uploadUrl)).append("\n");
        sb.append("    obsPath: ").append(toIndentedString(obsPath)).append("\n");
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
