package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ImportOpsDatasetItemsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "import_task_id")

    private String importTaskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_url")

    private String obsUrl;

    public ImportOpsDatasetItemsResponse withImportTaskId(String importTaskId) {
        this.importTaskId = importTaskId;
        return this;
    }

    /**
     * **参数解释：** 系统为本次导入操作生成的异步任务唯一标识符。 **取值范围：** 符合通用唯一识别码(UUID)标准的字符串。 
     * @return importTaskId
     */
    public String getImportTaskId() {
        return importTaskId;
    }

    public void setImportTaskId(String importTaskId) {
        this.importTaskId = importTaskId;
    }

    public ImportOpsDatasetItemsResponse withObsUrl(String obsUrl) {
        this.obsUrl = obsUrl;
        return this;
    }

    /**
     * **参数解释：** 用于将本地数据文件直接上传至对象存储（OBS）的预签名 URL 地址。 **取值范围：** 合法的 HTTP/HTTPS 协议 URL 字符串。 
     * @return obsUrl
     */
    public String getObsUrl() {
        return obsUrl;
    }

    public void setObsUrl(String obsUrl) {
        this.obsUrl = obsUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImportOpsDatasetItemsResponse that = (ImportOpsDatasetItemsResponse) obj;
        return Objects.equals(this.importTaskId, that.importTaskId) && Objects.equals(this.obsUrl, that.obsUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(importTaskId, obsUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportOpsDatasetItemsResponse {\n");
        sb.append("    importTaskId: ").append(toIndentedString(importTaskId)).append("\n");
        sb.append("    obsUrl: ").append(toIndentedString(obsUrl)).append("\n");
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
