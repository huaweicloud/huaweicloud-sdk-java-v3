package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 备份错误信息
 */
public class ProtectionServerInfoBackupError {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private Integer errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_description")

    private String errorDescription;

    public ProtectionServerInfoBackupError withErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * **参数解释**: 错误编码 **取值范围**: 包含如下4种。   - 0 ：无错误信息。   - 1 ：已綁定至其它存储库，无法开启备份。   - 2 ：备份库已超过最大限额。   - 3 ：CBR接口调用异常。
     * minimum: 0
     * maximum: 128
     * @return errorCode
     */
    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public ProtectionServerInfoBackupError withErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
        return this;
    }

    /**
     * **参数解释**: 错误描述 **取值范围**: 字符长度1-128 
     * @return errorDescription
     */
    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProtectionServerInfoBackupError that = (ProtectionServerInfoBackupError) obj;
        return Objects.equals(this.errorCode, that.errorCode)
            && Objects.equals(this.errorDescription, that.errorDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorCode, errorDescription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProtectionServerInfoBackupError {\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
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
