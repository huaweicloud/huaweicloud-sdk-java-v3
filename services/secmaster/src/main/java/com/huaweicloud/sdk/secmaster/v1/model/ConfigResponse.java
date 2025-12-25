package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ConfigResponse
 */
public class ConfigResponse {

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
    @JsonProperty(value = "datasets")

    private List<DatasetInfo> datasets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private Boolean region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_display")

    private String sourceDisplay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private Boolean success;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ConfigResponse withAlert(Boolean alert) {
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

    public ConfigResponse withAllowAlert(Boolean allowAlert) {
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

    public ConfigResponse withAllowLts(Boolean allowLts) {
        this.allowLts = allowLts;
        return this;
    }

    /**
     * 是否允许长期存储
     * @return allowLts
     */
    public Boolean getAllowLts() {
        return allowLts;
    }

    public void setAllowLts(Boolean allowLts) {
        this.allowLts = allowLts;
    }

    public ConfigResponse withCsvcDisplay(String csvcDisplay) {
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

    public ConfigResponse withDatasets(List<DatasetInfo> datasets) {
        this.datasets = datasets;
        return this;
    }

    public ConfigResponse addDatasetsItem(DatasetInfo datasetsItem) {
        if (this.datasets == null) {
            this.datasets = new ArrayList<>();
        }
        this.datasets.add(datasetsItem);
        return this;
    }

    public ConfigResponse withDatasets(Consumer<List<DatasetInfo>> datasetsSetter) {
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

    public ConfigResponse withRegion(Boolean region) {
        this.region = region;
        return this;
    }

    /**
     * 是否按区域分片采集
     * @return region
     */
    public Boolean getRegion() {
        return region;
    }

    public void setRegion(Boolean region) {
        this.region = region;
    }

    public ConfigResponse withSourceDisplay(String sourceDisplay) {
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

    public ConfigResponse withSuccess(Boolean success) {
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

    public ConfigResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 当前已采集的日志条数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfigResponse that = (ConfigResponse) obj;
        return Objects.equals(this.alert, that.alert) && Objects.equals(this.allowAlert, that.allowAlert)
            && Objects.equals(this.allowLts, that.allowLts) && Objects.equals(this.csvcDisplay, that.csvcDisplay)
            && Objects.equals(this.datasets, that.datasets) && Objects.equals(this.region, that.region)
            && Objects.equals(this.sourceDisplay, that.sourceDisplay) && Objects.equals(this.success, that.success)
            && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alert, allowAlert, allowLts, csvcDisplay, datasets, region, sourceDisplay, success, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigResponse {\n");
        sb.append("    alert: ").append(toIndentedString(alert)).append("\n");
        sb.append("    allowAlert: ").append(toIndentedString(allowAlert)).append("\n");
        sb.append("    allowLts: ").append(toIndentedString(allowLts)).append("\n");
        sb.append("    csvcDisplay: ").append(toIndentedString(csvcDisplay)).append("\n");
        sb.append("    datasets: ").append(toIndentedString(datasets)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    sourceDisplay: ").append(toIndentedString(sourceDisplay)).append("\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
