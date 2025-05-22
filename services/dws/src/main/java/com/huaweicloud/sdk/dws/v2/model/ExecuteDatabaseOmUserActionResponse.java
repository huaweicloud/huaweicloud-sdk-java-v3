package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ExecuteDatabaseOmUserActionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private Integer errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "om_user_info")

    private DatabaseOmUserInfo omUserInfo;

    public ExecuteDatabaseOmUserActionResponse withErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * **参数解释**： 错误码。非0皆为异常场景。 **取值范围**： 不涉及。
     * @return errorCode
     */
    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public ExecuteDatabaseOmUserActionResponse withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * **参数解释**： 错误信息。 **取值范围**： 不涉及。
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public ExecuteDatabaseOmUserActionResponse withOmUserInfo(DatabaseOmUserInfo omUserInfo) {
        this.omUserInfo = omUserInfo;
        return this;
    }

    public ExecuteDatabaseOmUserActionResponse withOmUserInfo(Consumer<DatabaseOmUserInfo> omUserInfoSetter) {
        if (this.omUserInfo == null) {
            this.omUserInfo = new DatabaseOmUserInfo();
            omUserInfoSetter.accept(this.omUserInfo);
        }

        return this;
    }

    /**
     * Get omUserInfo
     * @return omUserInfo
     */
    public DatabaseOmUserInfo getOmUserInfo() {
        return omUserInfo;
    }

    public void setOmUserInfo(DatabaseOmUserInfo omUserInfo) {
        this.omUserInfo = omUserInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExecuteDatabaseOmUserActionResponse that = (ExecuteDatabaseOmUserActionResponse) obj;
        return Objects.equals(this.errorCode, that.errorCode) && Objects.equals(this.errorMsg, that.errorMsg)
            && Objects.equals(this.omUserInfo, that.omUserInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorCode, errorMsg, omUserInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteDatabaseOmUserActionResponse {\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    omUserInfo: ").append(toIndentedString(omUserInfo)).append("\n");
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
