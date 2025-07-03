package com.huaweicloud.sdk.rds.v3.model;

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
public class ShowPrecheckResultResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_code")

    private Integer resultCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display")

    private Boolean display;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_status_check_list")

    private List<String> instanceStatusCheckList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_upgrade_precheck")

    private DBUpgradePrecheck dbUpgradePrecheck;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "download_link")

    private String downloadLink;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ShowPrecheckResultResponse withResultCode(Integer resultCode) {
        this.resultCode = resultCode;
        return this;
    }

    /**
     * 检查是否通过，0代表通过，1代表未通过
     * minimum: 0
     * maximum: 1
     * @return resultCode
     */
    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public ShowPrecheckResultResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 检查状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowPrecheckResultResponse withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 检查结果更新时间
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ShowPrecheckResultResponse withDisplay(Boolean display) {
        this.display = display;
        return this;
    }

    /**
     * 是否展示数据库检查结果
     * @return display
     */
    public Boolean getDisplay() {
        return display;
    }

    public void setDisplay(Boolean display) {
        this.display = display;
    }

    public ShowPrecheckResultResponse withInstanceStatusCheckList(List<String> instanceStatusCheckList) {
        this.instanceStatusCheckList = instanceStatusCheckList;
        return this;
    }

    public ShowPrecheckResultResponse addInstanceStatusCheckListItem(String instanceStatusCheckListItem) {
        if (this.instanceStatusCheckList == null) {
            this.instanceStatusCheckList = new ArrayList<>();
        }
        this.instanceStatusCheckList.add(instanceStatusCheckListItem);
        return this;
    }

    public ShowPrecheckResultResponse withInstanceStatusCheckList(
        Consumer<List<String>> instanceStatusCheckListSetter) {
        if (this.instanceStatusCheckList == null) {
            this.instanceStatusCheckList = new ArrayList<>();
        }
        instanceStatusCheckListSetter.accept(this.instanceStatusCheckList);
        return this;
    }

    /**
     * 实例关联关系检查失败项
     * @return instanceStatusCheckList
     */
    public List<String> getInstanceStatusCheckList() {
        return instanceStatusCheckList;
    }

    public void setInstanceStatusCheckList(List<String> instanceStatusCheckList) {
        this.instanceStatusCheckList = instanceStatusCheckList;
    }

    public ShowPrecheckResultResponse withDbUpgradePrecheck(DBUpgradePrecheck dbUpgradePrecheck) {
        this.dbUpgradePrecheck = dbUpgradePrecheck;
        return this;
    }

    public ShowPrecheckResultResponse withDbUpgradePrecheck(Consumer<DBUpgradePrecheck> dbUpgradePrecheckSetter) {
        if (this.dbUpgradePrecheck == null) {
            this.dbUpgradePrecheck = new DBUpgradePrecheck();
            dbUpgradePrecheckSetter.accept(this.dbUpgradePrecheck);
        }

        return this;
    }

    /**
     * Get dbUpgradePrecheck
     * @return dbUpgradePrecheck
     */
    public DBUpgradePrecheck getDbUpgradePrecheck() {
        return dbUpgradePrecheck;
    }

    public void setDbUpgradePrecheck(DBUpgradePrecheck dbUpgradePrecheck) {
        this.dbUpgradePrecheck = dbUpgradePrecheck;
    }

    public ShowPrecheckResultResponse withDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
        return this;
    }

    /**
     * 检查结果下载链接
     * @return downloadLink
     */
    public String getDownloadLink() {
        return downloadLink;
    }

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }

    public ShowPrecheckResultResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPrecheckResultResponse that = (ShowPrecheckResultResponse) obj;
        return Objects.equals(this.resultCode, that.resultCode) && Objects.equals(this.status, that.status)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.display, that.display)
            && Objects.equals(this.instanceStatusCheckList, that.instanceStatusCheckList)
            && Objects.equals(this.dbUpgradePrecheck, that.dbUpgradePrecheck)
            && Objects.equals(this.downloadLink, that.downloadLink) && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resultCode,
            status,
            updatedAt,
            display,
            instanceStatusCheckList,
            dbUpgradePrecheck,
            downloadLink,
            xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPrecheckResultResponse {\n");
        sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    display: ").append(toIndentedString(display)).append("\n");
        sb.append("    instanceStatusCheckList: ").append(toIndentedString(instanceStatusCheckList)).append("\n");
        sb.append("    dbUpgradePrecheck: ").append(toIndentedString(dbUpgradePrecheck)).append("\n");
        sb.append("    downloadLink: ").append(toIndentedString(downloadLink)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
