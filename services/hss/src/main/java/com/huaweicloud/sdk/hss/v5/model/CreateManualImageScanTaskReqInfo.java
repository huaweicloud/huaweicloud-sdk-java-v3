package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建手动扫描任务请求体
 */
public class CreateManualImageScanTaskReqInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_scope")

    private Integer scanScope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rate_limit")

    private Integer rateLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_all")

    private Boolean isAll;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_info")

    private CreateManualImageScanTaskReqInfoQueryInfo queryInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_info")

    private List<CreateManualImageScanTaskReqInfoImageInfo> imageInfo = null;

    public CreateManualImageScanTaskReqInfo withScanScope(Integer scanScope) {
        this.scanScope = scanScope;
        return this;
    }

    /**
     * **参数解释**: 扫描风险类型 **约束限制**: 不涉及 **取值范围**: - 0：none。 - 0x7fffffff：全部。 - 0x000f0000：漏洞。 - 0x0000f000：基线检查。 - 0x00000f00：恶意文件。 - 0x000000f0：敏感信息。 - 0x0000000f：软件合规。  **默认取值**: 不涉及 
     * minimum: 0
     * maximum: 2147483547
     * @return scanScope
     */
    public Integer getScanScope() {
        return scanScope;
    }

    public void setScanScope(Integer scanScope) {
        this.scanScope = scanScope;
    }

    public CreateManualImageScanTaskReqInfo withRateLimit(Integer rateLimit) {
        this.rateLimit = rateLimit;
        return this;
    }

    /**
     * **参数解释**: 扫描限速 单位：个/h **约束限制**: 不涉及 **取值范围**: 0-1000，0表示不限制。  **默认取值**: 不涉及 
     * minimum: 0
     * maximum: 1000
     * @return rateLimit
     */
    public Integer getRateLimit() {
        return rateLimit;
    }

    public void setRateLimit(Integer rateLimit) {
        this.rateLimit = rateLimit;
    }

    public CreateManualImageScanTaskReqInfo withIsAll(Boolean isAll) {
        this.isAll = isAll;
        return this;
    }

    /**
     * **参数解释**: 扫描全部镜像 **约束限制**: 不涉及 **取值范围**: - true：扫描全部镜像。 - false：指定镜像扫描,见image_info字段。  **默认取值**: 不涉及 
     * @return isAll
     */
    public Boolean getIsAll() {
        return isAll;
    }

    public void setIsAll(Boolean isAll) {
        this.isAll = isAll;
    }

    public CreateManualImageScanTaskReqInfo withQueryInfo(CreateManualImageScanTaskReqInfoQueryInfo queryInfo) {
        this.queryInfo = queryInfo;
        return this;
    }

    public CreateManualImageScanTaskReqInfo withQueryInfo(
        Consumer<CreateManualImageScanTaskReqInfoQueryInfo> queryInfoSetter) {
        if (this.queryInfo == null) {
            this.queryInfo = new CreateManualImageScanTaskReqInfoQueryInfo();
            queryInfoSetter.accept(this.queryInfo);
        }

        return this;
    }

    /**
     * Get queryInfo
     * @return queryInfo
     */
    public CreateManualImageScanTaskReqInfoQueryInfo getQueryInfo() {
        return queryInfo;
    }

    public void setQueryInfo(CreateManualImageScanTaskReqInfoQueryInfo queryInfo) {
        this.queryInfo = queryInfo;
    }

    public CreateManualImageScanTaskReqInfo withImageInfo(List<CreateManualImageScanTaskReqInfoImageInfo> imageInfo) {
        this.imageInfo = imageInfo;
        return this;
    }

    public CreateManualImageScanTaskReqInfo addImageInfoItem(CreateManualImageScanTaskReqInfoImageInfo imageInfoItem) {
        if (this.imageInfo == null) {
            this.imageInfo = new ArrayList<>();
        }
        this.imageInfo.add(imageInfoItem);
        return this;
    }

    public CreateManualImageScanTaskReqInfo withImageInfo(
        Consumer<List<CreateManualImageScanTaskReqInfoImageInfo>> imageInfoSetter) {
        if (this.imageInfo == null) {
            this.imageInfo = new ArrayList<>();
        }
        imageInfoSetter.accept(this.imageInfo);
        return this;
    }

    /**
     * 待扫描镜像
     * @return imageInfo
     */
    public List<CreateManualImageScanTaskReqInfoImageInfo> getImageInfo() {
        return imageInfo;
    }

    public void setImageInfo(List<CreateManualImageScanTaskReqInfoImageInfo> imageInfo) {
        this.imageInfo = imageInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateManualImageScanTaskReqInfo that = (CreateManualImageScanTaskReqInfo) obj;
        return Objects.equals(this.scanScope, that.scanScope) && Objects.equals(this.rateLimit, that.rateLimit)
            && Objects.equals(this.isAll, that.isAll) && Objects.equals(this.queryInfo, that.queryInfo)
            && Objects.equals(this.imageInfo, that.imageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scanScope, rateLimit, isAll, queryInfo, imageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateManualImageScanTaskReqInfo {\n");
        sb.append("    scanScope: ").append(toIndentedString(scanScope)).append("\n");
        sb.append("    rateLimit: ").append(toIndentedString(rateLimit)).append("\n");
        sb.append("    isAll: ").append(toIndentedString(isAll)).append("\n");
        sb.append("    queryInfo: ").append(toIndentedString(queryInfo)).append("\n");
        sb.append("    imageInfo: ").append(toIndentedString(imageInfo)).append("\n");
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
