package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowManualSecurityCheckStatusResponse extends SdkResponse {

    /**
     * 体检状态
     */
    public static final class ScanStatusEnum {

        /**
         * Enum SCANNING for value: "scanning"
         */
        public static final ScanStatusEnum SCANNING = new ScanStatusEnum("scanning");

        /**
         * Enum SCANED for value: "scaned"
         */
        public static final ScanStatusEnum SCANED = new ScanStatusEnum("scaned");

        /**
         * Enum FAILED for value: "failed"
         */
        public static final ScanStatusEnum FAILED = new ScanStatusEnum("failed");

        private static final Map<String, ScanStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ScanStatusEnum> createStaticFields() {
            Map<String, ScanStatusEnum> map = new HashMap<>();
            map.put("scanning", SCANNING);
            map.put("scaned", SCANED);
            map.put("failed", FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ScanStatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ScanStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ScanStatusEnum(value));
        }

        public static ScanStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ScanStatusEnum) {
                return this.value.equals(((ScanStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_status")

    private ScanStatusEnum scanStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_host_num")

    private Integer totalHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaned_host_num")

    private Integer scanedHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_num")

    private Integer contentNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_progress")

    private Integer scanProgress;

    public ShowManualSecurityCheckStatusResponse withScanStatus(ScanStatusEnum scanStatus) {
        this.scanStatus = scanStatus;
        return this;
    }

    /**
     * 体检状态
     * @return scanStatus
     */
    public ScanStatusEnum getScanStatus() {
        return scanStatus;
    }

    public void setScanStatus(ScanStatusEnum scanStatus) {
        this.scanStatus = scanStatus;
    }

    public ShowManualSecurityCheckStatusResponse withTotalHostNum(Integer totalHostNum) {
        this.totalHostNum = totalHostNum;
        return this;
    }

    /**
     * 本次体检服务器数量
     * @return totalHostNum
     */
    public Integer getTotalHostNum() {
        return totalHostNum;
    }

    public void setTotalHostNum(Integer totalHostNum) {
        this.totalHostNum = totalHostNum;
    }

    public ShowManualSecurityCheckStatusResponse withScanedHostNum(Integer scanedHostNum) {
        this.scanedHostNum = scanedHostNum;
        return this;
    }

    /**
     * 体检完成的服务器数量
     * @return scanedHostNum
     */
    public Integer getScanedHostNum() {
        return scanedHostNum;
    }

    public void setScanedHostNum(Integer scanedHostNum) {
        this.scanedHostNum = scanedHostNum;
    }

    public ShowManualSecurityCheckStatusResponse withContentNum(Integer contentNum) {
        this.contentNum = contentNum;
        return this;
    }

    /**
     * 体检内容数量
     * @return contentNum
     */
    public Integer getContentNum() {
        return contentNum;
    }

    public void setContentNum(Integer contentNum) {
        this.contentNum = contentNum;
    }

    public ShowManualSecurityCheckStatusResponse withScanProgress(Integer scanProgress) {
        this.scanProgress = scanProgress;
        return this;
    }

    /**
     * 体检进度百分比
     * @return scanProgress
     */
    public Integer getScanProgress() {
        return scanProgress;
    }

    public void setScanProgress(Integer scanProgress) {
        this.scanProgress = scanProgress;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowManualSecurityCheckStatusResponse that = (ShowManualSecurityCheckStatusResponse) obj;
        return Objects.equals(this.scanStatus, that.scanStatus) && Objects.equals(this.totalHostNum, that.totalHostNum)
            && Objects.equals(this.scanedHostNum, that.scanedHostNum)
            && Objects.equals(this.contentNum, that.contentNum) && Objects.equals(this.scanProgress, that.scanProgress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scanStatus, totalHostNum, scanedHostNum, contentNum, scanProgress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowManualSecurityCheckStatusResponse {\n");
        sb.append("    scanStatus: ").append(toIndentedString(scanStatus)).append("\n");
        sb.append("    totalHostNum: ").append(toIndentedString(totalHostNum)).append("\n");
        sb.append("    scanedHostNum: ").append(toIndentedString(scanedHostNum)).append("\n");
        sb.append("    contentNum: ").append(toIndentedString(contentNum)).append("\n");
        sb.append("    scanProgress: ").append(toIndentedString(scanProgress)).append("\n");
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
