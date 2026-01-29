package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateCollectConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert")

    private Boolean alert;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allow_alert")

    private Boolean allowAlert;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allow_lts")

    private Boolean allowLts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "csvc_display")

    private String csvcDisplay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_display")

    private String sourceDisplay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private Boolean success;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasets")

    private List<DatasetInfo> datasets = null;

    public CreateCollectConfigResponse withAlert(Boolean alert) {
        this.alert = alert;
        return this;
    }

    /**
     * 自动转告警的开关
     * @return alert
     */
    public Boolean getAlert() {
        return alert;
    }

    public void setAlert(Boolean alert) {
        this.alert = alert;
    }

    public CreateCollectConfigResponse withAllowAlert(Boolean allowAlert) {
        this.allowAlert = allowAlert;
        return this;
    }

    /**
     * 能否开自动转告警
     * @return allowAlert
     */
    public Boolean getAllowAlert() {
        return allowAlert;
    }

    public void setAllowAlert(Boolean allowAlert) {
        this.allowAlert = allowAlert;
    }

    public CreateCollectConfigResponse withAllowLts(Boolean allowLts) {
        this.allowLts = allowLts;
        return this;
    }

    /**
     * 是否支持lts
     * @return allowLts
     */
    public Boolean getAllowLts() {
        return allowLts;
    }

    public void setAllowLts(Boolean allowLts) {
        this.allowLts = allowLts;
    }

    public CreateCollectConfigResponse withCsvcDisplay(String csvcDisplay) {
        this.csvcDisplay = csvcDisplay;
        return this;
    }

    /**
     * 云服务描述
     * @return csvcDisplay
     */
    public String getCsvcDisplay() {
        return csvcDisplay;
    }

    public void setCsvcDisplay(String csvcDisplay) {
        this.csvcDisplay = csvcDisplay;
    }

    public CreateCollectConfigResponse withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 局点
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public CreateCollectConfigResponse withSourceDisplay(String sourceDisplay) {
        this.sourceDisplay = sourceDisplay;
        return this;
    }

    /**
     * 数据源描述
     * @return sourceDisplay
     */
    public String getSourceDisplay() {
        return sourceDisplay;
    }

    public void setSourceDisplay(String sourceDisplay) {
        this.sourceDisplay = sourceDisplay;
    }

    public CreateCollectConfigResponse withSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    /**
     * 是否创建成功
     * @return success
     */
    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public CreateCollectConfigResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 条数
     * minimum: 0
     * maximum: 256
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public CreateCollectConfigResponse withDatasets(List<DatasetInfo> datasets) {
        this.datasets = datasets;
        return this;
    }

    public CreateCollectConfigResponse addDatasetsItem(DatasetInfo datasetsItem) {
        if (this.datasets == null) {
            this.datasets = new ArrayList<>();
        }
        this.datasets.add(datasetsItem);
        return this;
    }

    public CreateCollectConfigResponse withDatasets(Consumer<List<DatasetInfo>> datasetsSetter) {
        if (this.datasets == null) {
            this.datasets = new ArrayList<>();
        }
        datasetsSetter.accept(this.datasets);
        return this;
    }

    /**
     * 关联的数据集列表
     * @return datasets
     */
    public List<DatasetInfo> getDatasets() {
        return datasets;
    }

    public void setDatasets(List<DatasetInfo> datasets) {
        this.datasets = datasets;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateCollectConfigResponse that = (CreateCollectConfigResponse) obj;
        return Objects.equals(this.alert, that.alert) && Objects.equals(this.allowAlert, that.allowAlert)
            && Objects.equals(this.allowLts, that.allowLts) && Objects.equals(this.csvcDisplay, that.csvcDisplay)
            && Objects.equals(this.region, that.region) && Objects.equals(this.sourceDisplay, that.sourceDisplay)
            && Objects.equals(this.success, that.success) && Objects.equals(this.total, that.total)
            && Objects.equals(this.datasets, that.datasets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alert, allowAlert, allowLts, csvcDisplay, region, sourceDisplay, success, total, datasets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCollectConfigResponse {\n");
        sb.append("    alert: ").append(toIndentedString(alert)).append("\n");
        sb.append("    allowAlert: ").append(toIndentedString(allowAlert)).append("\n");
        sb.append("    allowLts: ").append(toIndentedString(allowLts)).append("\n");
        sb.append("    csvcDisplay: ").append(toIndentedString(csvcDisplay)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    sourceDisplay: ").append(toIndentedString(sourceDisplay)).append("\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    datasets: ").append(toIndentedString(datasets)).append("\n");
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
