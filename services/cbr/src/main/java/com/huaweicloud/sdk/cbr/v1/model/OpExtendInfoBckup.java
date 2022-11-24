package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * OpExtendInfoBckup
 */
public class OpExtendInfoBckup {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_consistency_error_code")

    private String appConsistencyErrorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_consistency_error_message")

    private String appConsistencyErrorMessage;

    /**
     * 应用一致性备份状态；0:非应用一致性，1：应用一致性备份
     */
    public static final class AppConsistencyStatusEnum {

        /**
         * Enum _0 for value: "0"
         */
        public static final AppConsistencyStatusEnum _0 = new AppConsistencyStatusEnum("0");

        /**
         * Enum _1 for value: "1"
         */
        public static final AppConsistencyStatusEnum _1 = new AppConsistencyStatusEnum("1");

        private static final Map<String, AppConsistencyStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AppConsistencyStatusEnum> createStaticFields() {
            Map<String, AppConsistencyStatusEnum> map = new HashMap<>();
            map.put("0", _0);
            map.put("1", _1);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AppConsistencyStatusEnum(String value) {
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
        public static AppConsistencyStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            AppConsistencyStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AppConsistencyStatusEnum(value);
            }
            return result;
        }

        public static AppConsistencyStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            AppConsistencyStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AppConsistencyStatusEnum) {
                return this.value.equals(((AppConsistencyStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_consistency_status")

    private AppConsistencyStatusEnum appConsistencyStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_id")

    private String backupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_name")

    private String backupName;

    /**
     * 是否增备
     */
    public static final class IncrementalEnum {

        /**
         * Enum _TRUE_ for value: "\"true\""
         */
        public static final IncrementalEnum _TRUE_ = new IncrementalEnum("\"true\"");

        /**
         * Enum _FALSE_ for value: "\"false\""
         */
        public static final IncrementalEnum _FALSE_ = new IncrementalEnum("\"false\"");

        private static final Map<String, IncrementalEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IncrementalEnum> createStaticFields() {
            Map<String, IncrementalEnum> map = new HashMap<>();
            map.put("\"true\"", _TRUE_);
            map.put("\"false\"", _FALSE_);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IncrementalEnum(String value) {
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
        public static IncrementalEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            IncrementalEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new IncrementalEnum(value);
            }
            return result;
        }

        public static IncrementalEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            IncrementalEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IncrementalEnum) {
                return this.value.equals(((IncrementalEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incremental")

    private IncrementalEnum incremental;

    public OpExtendInfoBckup withAppConsistencyErrorCode(String appConsistencyErrorCode) {
        this.appConsistencyErrorCode = appConsistencyErrorCode;
        return this;
    }

    /**
     * 应用一致性备份失败错误码。请参见[错误码](ErrorCode.xml)。
     * @return appConsistencyErrorCode
     */
    public String getAppConsistencyErrorCode() {
        return appConsistencyErrorCode;
    }

    public void setAppConsistencyErrorCode(String appConsistencyErrorCode) {
        this.appConsistencyErrorCode = appConsistencyErrorCode;
    }

    public OpExtendInfoBckup withAppConsistencyErrorMessage(String appConsistencyErrorMessage) {
        this.appConsistencyErrorMessage = appConsistencyErrorMessage;
        return this;
    }

    /**
     * 应用一致性备份错误信息
     * @return appConsistencyErrorMessage
     */
    public String getAppConsistencyErrorMessage() {
        return appConsistencyErrorMessage;
    }

    public void setAppConsistencyErrorMessage(String appConsistencyErrorMessage) {
        this.appConsistencyErrorMessage = appConsistencyErrorMessage;
    }

    public OpExtendInfoBckup withAppConsistencyStatus(AppConsistencyStatusEnum appConsistencyStatus) {
        this.appConsistencyStatus = appConsistencyStatus;
        return this;
    }

    /**
     * 应用一致性备份状态；0:非应用一致性，1：应用一致性备份
     * @return appConsistencyStatus
     */
    public AppConsistencyStatusEnum getAppConsistencyStatus() {
        return appConsistencyStatus;
    }

    public void setAppConsistencyStatus(AppConsistencyStatusEnum appConsistencyStatus) {
        this.appConsistencyStatus = appConsistencyStatus;
    }

    public OpExtendInfoBckup withBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    /**
     * 备份副本ID
     * @return backupId
     */
    public String getBackupId() {
        return backupId;
    }

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    public OpExtendInfoBckup withBackupName(String backupName) {
        this.backupName = backupName;
        return this;
    }

    /**
     * 备份名称
     * @return backupName
     */
    public String getBackupName() {
        return backupName;
    }

    public void setBackupName(String backupName) {
        this.backupName = backupName;
    }

    public OpExtendInfoBckup withIncremental(IncrementalEnum incremental) {
        this.incremental = incremental;
        return this;
    }

    /**
     * 是否增备
     * @return incremental
     */
    public IncrementalEnum getIncremental() {
        return incremental;
    }

    public void setIncremental(IncrementalEnum incremental) {
        this.incremental = incremental;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OpExtendInfoBckup opExtendInfoBckup = (OpExtendInfoBckup) o;
        return Objects.equals(this.appConsistencyErrorCode, opExtendInfoBckup.appConsistencyErrorCode)
            && Objects.equals(this.appConsistencyErrorMessage, opExtendInfoBckup.appConsistencyErrorMessage)
            && Objects.equals(this.appConsistencyStatus, opExtendInfoBckup.appConsistencyStatus)
            && Objects.equals(this.backupId, opExtendInfoBckup.backupId)
            && Objects.equals(this.backupName, opExtendInfoBckup.backupName)
            && Objects.equals(this.incremental, opExtendInfoBckup.incremental);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appConsistencyErrorCode,
            appConsistencyErrorMessage,
            appConsistencyStatus,
            backupId,
            backupName,
            incremental);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpExtendInfoBckup {\n");
        sb.append("    appConsistencyErrorCode: ").append(toIndentedString(appConsistencyErrorCode)).append("\n");
        sb.append("    appConsistencyErrorMessage: ").append(toIndentedString(appConsistencyErrorMessage)).append("\n");
        sb.append("    appConsistencyStatus: ").append(toIndentedString(appConsistencyStatus)).append("\n");
        sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
        sb.append("    backupName: ").append(toIndentedString(backupName)).append("\n");
        sb.append("    incremental: ").append(toIndentedString(incremental)).append("\n");
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
