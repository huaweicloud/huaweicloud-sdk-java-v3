package com.huaweicloud.sdk.optverse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowModelServiceListRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "infer_type")

    private String inferType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_id")

    private String assetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_type")

    private String assetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_sub_type")

    private String assetSubType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chip_type")

    private String chipType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform")

    private String platform;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_type")

    private String useType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_name")

    private String modelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_name")

    private String serviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private String sortDir;

    public ShowModelServiceListRequest withInferType(String inferType) {
        this.inferType = inferType;
        return this;
    }

    /**
     * 推理类型，分为online和edge
     * @return inferType
     */
    public String getInferType() {
        return inferType;
    }

    public void setInferType(String inferType) {
        this.inferType = inferType;
    }

    public ShowModelServiceListRequest withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * 推理服务所关联的模型ID
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public ShowModelServiceListRequest withAssetType(String assetType) {
        this.assetType = assetType;
        return this;
    }

    /**
     * 推理服务所关联的模型类型
     * @return assetType
     */
    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public ShowModelServiceListRequest withAssetSubType(String assetSubType) {
        this.assetSubType = assetSubType;
        return this;
    }

    /**
     * 推理服务所关联的模型子类型
     * @return assetSubType
     */
    public String getAssetSubType() {
        return assetSubType;
    }

    public void setAssetSubType(String assetSubType) {
        this.assetSubType = assetSubType;
    }

    public ShowModelServiceListRequest withChipType(String chipType) {
        this.chipType = chipType;
        return this;
    }

    /**
     * 芯片类型
     * @return chipType
     */
    public String getChipType() {
        return chipType;
    }

    public void setChipType(String chipType) {
        this.chipType = chipType;
    }

    public ShowModelServiceListRequest withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * 部署平台，Modelarts或者CCE
     * @return platform
     */
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public ShowModelServiceListRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 服务状态，INIT/DEPLOYING/RUNNING/SUCCEEDED/FAILED/STOPPED/PENDING/CANCELLED/WAITING
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowModelServiceListRequest withUseType(String useType) {
        this.useType = useType;
        return this;
    }

    /**
     * 使用类型，private表示用户创建的服务，public表示预置服务
     * @return useType
     */
    public String getUseType() {
        return useType;
    }

    public void setUseType(String useType) {
        this.useType = useType;
    }

    public ShowModelServiceListRequest withModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    /**
     * 模型名称，支持模糊匹配
     * @return modelName
     */
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public ShowModelServiceListRequest withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * 服务名称，支持模糊匹配
     * @return serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public ShowModelServiceListRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，取值范围[0,100000000]，默认值0
     * minimum: 0
     * maximum: 100000000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ShowModelServiceListRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 返回限制个数，取值范围[1-1000]，默认值100
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ShowModelServiceListRequest withSortDir(String sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /**
     * **参数解释**： 排序规则。 **约束限制**： 不涉及 **取值范围**： - DESC：降序。 - ASC：升序。 **默认取值**： DESC 
     * @return sortDir
     */
    public String getSortDir() {
        return sortDir;
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowModelServiceListRequest that = (ShowModelServiceListRequest) obj;
        return Objects.equals(this.inferType, that.inferType) && Objects.equals(this.assetId, that.assetId)
            && Objects.equals(this.assetType, that.assetType) && Objects.equals(this.assetSubType, that.assetSubType)
            && Objects.equals(this.chipType, that.chipType) && Objects.equals(this.platform, that.platform)
            && Objects.equals(this.status, that.status) && Objects.equals(this.useType, that.useType)
            && Objects.equals(this.modelName, that.modelName) && Objects.equals(this.serviceName, that.serviceName)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.sortDir, that.sortDir);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inferType,
            assetId,
            assetType,
            assetSubType,
            chipType,
            platform,
            status,
            useType,
            modelName,
            serviceName,
            offset,
            limit,
            sortDir);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowModelServiceListRequest {\n");
        sb.append("    inferType: ").append(toIndentedString(inferType)).append("\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
        sb.append("    assetSubType: ").append(toIndentedString(assetSubType)).append("\n");
        sb.append("    chipType: ").append(toIndentedString(chipType)).append("\n");
        sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    useType: ").append(toIndentedString(useType)).append("\n");
        sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
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
