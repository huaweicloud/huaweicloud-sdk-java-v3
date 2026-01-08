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
public class ImportUserListResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encoded_authorization_message")

    private String encodedAuthorizationMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_detail_list")

    private List<DesktopUserDetail> userDetailList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_detail_list")

    private List<DesktopUserDetail> failedDetailList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ImportUserListResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 错误码。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public ImportUserListResponse withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 错误描述。
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public ImportUserListResponse withEncodedAuthorizationMessage(String encodedAuthorizationMessage) {
        this.encodedAuthorizationMessage = encodedAuthorizationMessage;
        return this;
    }

    /**
     * 加密后的详细拒绝原因，用户可以自行调用STS服务的decode-authorization-message接口进行解密。
     * @return encodedAuthorizationMessage
     */
    public String getEncodedAuthorizationMessage() {
        return encodedAuthorizationMessage;
    }

    public void setEncodedAuthorizationMessage(String encodedAuthorizationMessage) {
        this.encodedAuthorizationMessage = encodedAuthorizationMessage;
    }

    public ImportUserListResponse withUserDetailList(List<DesktopUserDetail> userDetailList) {
        this.userDetailList = userDetailList;
        return this;
    }

    public ImportUserListResponse addUserDetailListItem(DesktopUserDetail userDetailListItem) {
        if (this.userDetailList == null) {
            this.userDetailList = new ArrayList<>();
        }
        this.userDetailList.add(userDetailListItem);
        return this;
    }

    public ImportUserListResponse withUserDetailList(Consumer<List<DesktopUserDetail>> userDetailListSetter) {
        if (this.userDetailList == null) {
            this.userDetailList = new ArrayList<>();
        }
        userDetailListSetter.accept(this.userDetailList);
        return this;
    }

    /**
     * 成功列表。
     * @return userDetailList
     */
    public List<DesktopUserDetail> getUserDetailList() {
        return userDetailList;
    }

    public void setUserDetailList(List<DesktopUserDetail> userDetailList) {
        this.userDetailList = userDetailList;
    }

    public ImportUserListResponse withFailedDetailList(List<DesktopUserDetail> failedDetailList) {
        this.failedDetailList = failedDetailList;
        return this;
    }

    public ImportUserListResponse addFailedDetailListItem(DesktopUserDetail failedDetailListItem) {
        if (this.failedDetailList == null) {
            this.failedDetailList = new ArrayList<>();
        }
        this.failedDetailList.add(failedDetailListItem);
        return this;
    }

    public ImportUserListResponse withFailedDetailList(Consumer<List<DesktopUserDetail>> failedDetailListSetter) {
        if (this.failedDetailList == null) {
            this.failedDetailList = new ArrayList<>();
        }
        failedDetailListSetter.accept(this.failedDetailList);
        return this;
    }

    /**
     * 失败列表。
     * @return failedDetailList
     */
    public List<DesktopUserDetail> getFailedDetailList() {
        return failedDetailList;
    }

    public void setFailedDetailList(List<DesktopUserDetail> failedDetailList) {
        this.failedDetailList = failedDetailList;
    }

    public ImportUserListResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 用户列表数量。
     * minimum: 1
     * maximum: 1000
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
        ImportUserListResponse that = (ImportUserListResponse) obj;
        return Objects.equals(this.errorCode, that.errorCode) && Objects.equals(this.errorMsg, that.errorMsg)
            && Objects.equals(this.encodedAuthorizationMessage, that.encodedAuthorizationMessage)
            && Objects.equals(this.userDetailList, that.userDetailList)
            && Objects.equals(this.failedDetailList, that.failedDetailList)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(errorCode, errorMsg, encodedAuthorizationMessage, userDetailList, failedDetailList, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportUserListResponse {\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    encodedAuthorizationMessage: ")
            .append(toIndentedString(encodedAuthorizationMessage))
            .append("\n");
        sb.append("    userDetailList: ").append(toIndentedString(userDetailList)).append("\n");
        sb.append("    failedDetailList: ").append(toIndentedString(failedDetailList)).append("\n");
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
