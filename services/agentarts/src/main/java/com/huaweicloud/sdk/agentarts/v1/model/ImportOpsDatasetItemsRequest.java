package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ImportOpsDatasetItemsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataset_id")

    private String datasetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_version_id")

    private String sourceVersionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "overwrite")

    private Boolean overwrite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "get_obs_url")

    private Boolean getObsUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_object_name")

    private String obsObjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_file_hash")

    private String obsFileHash;

    public ImportOpsDatasetItemsRequest withDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }

    /**
     * **参数解释：** 评测集的唯一标识符（ID） **约束限制：** 由英文、数字、“-”、“_”组成，长度为1到64个字符。 **取值范围：** 由英文、数字、连字符(-)、下划线(_)组成的1-64位字符串。 **默认取值：** 无。 
     * @return datasetId
     */
    public String getDatasetId() {
        return datasetId;
    }

    public void setDatasetId(String datasetId) {
        this.datasetId = datasetId;
    }

    public ImportOpsDatasetItemsRequest withSourceVersionId(String sourceVersionId) {
        this.sourceVersionId = sourceVersionId;
        return this;
    }

    /**
     * **参数解释：** 源版本ID。用于指定在数据还原或复制操作中作为参考的基础版本。 **约束限制：** 长度为0到100个字符。 **取值范围：** 0到100字符。 **默认取值：** 不涉及。
     * @return sourceVersionId
     */
    public String getSourceVersionId() {
        return sourceVersionId;
    }

    public void setSourceVersionId(String sourceVersionId) {
        this.sourceVersionId = sourceVersionId;
    }

    public ImportOpsDatasetItemsRequest withOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
        return this;
    }

    /**
     * **参数解释：** 覆盖模式开关。决定在导入新数据前是否清空草稿版本中的现有数据。 **约束限制：** 不涉及。 **取值范围：** - `true`: 覆盖模式，执行清空操作。 - `false`: 追加模式，保留现有数据。 **默认取值：** false。
     * @return overwrite
     */
    public Boolean getOverwrite() {
        return overwrite;
    }

    public void setOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
    }

    public ImportOpsDatasetItemsRequest withGetObsUrl(Boolean getObsUrl) {
        this.getObsUrl = getObsUrl;
        return this;
    }

    /**
     * **参数解释：** 获取OBS预签名URL标识。用于确定是否需要系统生成并返回用于大文件直传的临时上传链接。 **约束限制：** 仅在不使用 multipart/form-data 模式时启用。 **取值范围：** true, false。 **默认取值：** false。
     * @return getObsUrl
     */
    public Boolean getGetObsUrl() {
        return getObsUrl;
    }

    public void setGetObsUrl(Boolean getObsUrl) {
        this.getObsUrl = getObsUrl;
    }

    public ImportOpsDatasetItemsRequest withObsObjectName(String obsObjectName) {
        this.obsObjectName = obsObjectName;
        return this;
    }

    /**
     * **参数解释：** OBS对象名称。指定待导入文件在对象存储（OBS）中的完整存储路径或文件名。 **约束限制：** 字符串长度限制为0到10000个字符。 **取值范围：** 0到10000 字符。 **默认取值：** 不涉及。
     * @return obsObjectName
     */
    public String getObsObjectName() {
        return obsObjectName;
    }

    public void setObsObjectName(String obsObjectName) {
        this.obsObjectName = obsObjectName;
    }

    public ImportOpsDatasetItemsRequest withObsFileHash(String obsFileHash) {
        this.obsFileHash = obsFileHash;
        return this;
    }

    /**
     * **参数解释：** 文件哈希值（SHA-256）。用于在服务端进行文件完整性校验，确保上传过程中数据未损坏或被篡改。 **约束限制：** 十六进制字符串，最大长度 256 个字符。 **取值范围：** 0到256字符。 **默认取值：** 不涉及。
     * @return obsFileHash
     */
    public String getObsFileHash() {
        return obsFileHash;
    }

    public void setObsFileHash(String obsFileHash) {
        this.obsFileHash = obsFileHash;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImportOpsDatasetItemsRequest that = (ImportOpsDatasetItemsRequest) obj;
        return Objects.equals(this.datasetId, that.datasetId)
            && Objects.equals(this.sourceVersionId, that.sourceVersionId)
            && Objects.equals(this.overwrite, that.overwrite) && Objects.equals(this.getObsUrl, that.getObsUrl)
            && Objects.equals(this.obsObjectName, that.obsObjectName)
            && Objects.equals(this.obsFileHash, that.obsFileHash);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datasetId, sourceVersionId, overwrite, getObsUrl, obsObjectName, obsFileHash);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportOpsDatasetItemsRequest {\n");
        sb.append("    datasetId: ").append(toIndentedString(datasetId)).append("\n");
        sb.append("    sourceVersionId: ").append(toIndentedString(sourceVersionId)).append("\n");
        sb.append("    overwrite: ").append(toIndentedString(overwrite)).append("\n");
        sb.append("    getObsUrl: ").append(toIndentedString(getObsUrl)).append("\n");
        sb.append("    obsObjectName: ").append(toIndentedString(obsObjectName)).append("\n");
        sb.append("    obsFileHash: ").append(toIndentedString(obsFileHash)).append("\n");
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
