package com.huaweicloud.sdk.workspace.v2.model;

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
public class ImportIpResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_list")

    private List<ImportIpInfo> ipList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_ip_list")

    private List<ImportIpInfo> failedIpList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_code")

    private String failedCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_message")

    private String failedMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ImportIpResponse withIpList(List<ImportIpInfo> ipList) {
        this.ipList = ipList;
        return this;
    }

    public ImportIpResponse addIpListItem(ImportIpInfo ipListItem) {
        if (this.ipList == null) {
            this.ipList = new ArrayList<>();
        }
        this.ipList.add(ipListItem);
        return this;
    }

    public ImportIpResponse withIpList(Consumer<List<ImportIpInfo>> ipListSetter) {
        if (this.ipList == null) {
            this.ipList = new ArrayList<>();
        }
        ipListSetter.accept(this.ipList);
        return this;
    }

    /**
     * ip成功列表。
     * @return ipList
     */
    public List<ImportIpInfo> getIpList() {
        return ipList;
    }

    public void setIpList(List<ImportIpInfo> ipList) {
        this.ipList = ipList;
    }

    public ImportIpResponse withFailedIpList(List<ImportIpInfo> failedIpList) {
        this.failedIpList = failedIpList;
        return this;
    }

    public ImportIpResponse addFailedIpListItem(ImportIpInfo failedIpListItem) {
        if (this.failedIpList == null) {
            this.failedIpList = new ArrayList<>();
        }
        this.failedIpList.add(failedIpListItem);
        return this;
    }

    public ImportIpResponse withFailedIpList(Consumer<List<ImportIpInfo>> failedIpListSetter) {
        if (this.failedIpList == null) {
            this.failedIpList = new ArrayList<>();
        }
        failedIpListSetter.accept(this.failedIpList);
        return this;
    }

    /**
     * ip失败列表。
     * @return failedIpList
     */
    public List<ImportIpInfo> getFailedIpList() {
        return failedIpList;
    }

    public void setFailedIpList(List<ImportIpInfo> failedIpList) {
        this.failedIpList = failedIpList;
    }

    public ImportIpResponse withFailedCode(String failedCode) {
        this.failedCode = failedCode;
        return this;
    }

    /**
     * 错误码。
     * @return failedCode
     */
    public String getFailedCode() {
        return failedCode;
    }

    public void setFailedCode(String failedCode) {
        this.failedCode = failedCode;
    }

    public ImportIpResponse withFailedMessage(String failedMessage) {
        this.failedMessage = failedMessage;
        return this;
    }

    /**
     * 错误码。
     * @return failedMessage
     */
    public String getFailedMessage() {
        return failedMessage;
    }

    public void setFailedMessage(String failedMessage) {
        this.failedMessage = failedMessage;
    }

    public ImportIpResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * ip列表数量。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImportIpResponse that = (ImportIpResponse) obj;
        return Objects.equals(this.ipList, that.ipList) && Objects.equals(this.failedIpList, that.failedIpList)
            && Objects.equals(this.failedCode, that.failedCode)
            && Objects.equals(this.failedMessage, that.failedMessage)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipList, failedIpList, failedCode, failedMessage, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportIpResponse {\n");
        sb.append("    ipList: ").append(toIndentedString(ipList)).append("\n");
        sb.append("    failedIpList: ").append(toIndentedString(failedIpList)).append("\n");
        sb.append("    failedCode: ").append(toIndentedString(failedCode)).append("\n");
        sb.append("    failedMessage: ").append(toIndentedString(failedMessage)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
