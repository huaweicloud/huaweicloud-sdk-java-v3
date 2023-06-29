package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 远程鉴权配置。
 */
public class RemoteAuthRuleVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_server")

    private String authServer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_method")

    private String requestMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_type_setting")

    private String fileTypeSetting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specified_file_type")

    private String specifiedFileType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reserve_args_setting")

    private String reserveArgsSetting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reserve_args")

    private String reserveArgs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add_custom_args_rules")

    private List<CustomArgs> addCustomArgsRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reserve_headers_setting")

    private String reserveHeadersSetting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add_custom_headers_rules")

    private List<CustomArgs> addCustomHeadersRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_success_status")

    private String authSuccessStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_failed_status")

    private String authFailedStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_status")

    private String responseStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout")

    private Integer timeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout_action")

    private String timeoutAction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reserve_headers")

    private String reserveHeaders;

    public RemoteAuthRuleVo withAuthServer(String authServer) {
        this.authServer = authServer;
        return this;
    }

    /**
     * 可访问的鉴权服务器地址。 输入的URL必须有“http”或“https”。不能是localhost或127.0.0.1这类本地地址。 不能是CDN的加速域名。
     * @return authServer
     */
    public String getAuthServer() {
        return authServer;
    }

    public void setAuthServer(String authServer) {
        this.authServer = authServer;
    }

    public RemoteAuthRuleVo withRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
        return this;
    }

    /**
     * 鉴权服务器支持的请求方法，支持GET、POST、HEAD。
     * @return requestMethod
     */
    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public RemoteAuthRuleVo withFileTypeSetting(String fileTypeSetting) {
        this.fileTypeSetting = fileTypeSetting;
        return this;
    }

    /**
     * all（所有文件类型）：所有文件均参与鉴权。 specific_file（指定文件类型）：指定类型的文件参与鉴权。示例：jpg|MP4。 文件类型不区分大小写，即：jpg和JPG代表同一种文件类型，多个文件类型用“|”分割。
     * @return fileTypeSetting
     */
    public String getFileTypeSetting() {
        return fileTypeSetting;
    }

    public void setFileTypeSetting(String fileTypeSetting) {
        this.fileTypeSetting = fileTypeSetting;
    }

    public RemoteAuthRuleVo withSpecifiedFileType(String specifiedFileType) {
        this.specifiedFileType = specifiedFileType;
        return this;
    }

    /**
     * 字符总数不能超过512,当file_type_setting等于specific_file时为必选，其余情况为空， 由大小写字母和数字构成，文件类型用竖线分隔，例如jpg|mp4，只有在必选情况下才会对该字段做校验。
     * @return specifiedFileType
     */
    public String getSpecifiedFileType() {
        return specifiedFileType;
    }

    public void setSpecifiedFileType(String specifiedFileType) {
        this.specifiedFileType = specifiedFileType;
    }

    public RemoteAuthRuleVo withReserveArgsSetting(String reserveArgsSetting) {
        this.reserveArgsSetting = reserveArgsSetting;
        return this;
    }

    /**
     * 设置用户请求中需要参与鉴权的参数，可选reserve_all_args（保留所有URL参数）、reserve_specific_args（保留指定URL参数）、ignore_all_args（忽略所有URL参数）。
     * @return reserveArgsSetting
     */
    public String getReserveArgsSetting() {
        return reserveArgsSetting;
    }

    public void setReserveArgsSetting(String reserveArgsSetting) {
        this.reserveArgsSetting = reserveArgsSetting;
    }

    public RemoteAuthRuleVo withReserveArgs(String reserveArgs) {
        this.reserveArgs = reserveArgs;
        return this;
    }

    /**
     * 当reserve_args_setting等于reserve_specific_args时为必选，其余情况为空，要保留的参数，多个参数用竖线分隔：key1|key2。
     * @return reserveArgs
     */
    public String getReserveArgs() {
        return reserveArgs;
    }

    public void setReserveArgs(String reserveArgs) {
        this.reserveArgs = reserveArgs;
    }

    public RemoteAuthRuleVo withAddCustomArgsRules(List<CustomArgs> addCustomArgsRules) {
        this.addCustomArgsRules = addCustomArgsRules;
        return this;
    }

    public RemoteAuthRuleVo addAddCustomArgsRulesItem(CustomArgs addCustomArgsRulesItem) {
        if (this.addCustomArgsRules == null) {
            this.addCustomArgsRules = new ArrayList<>();
        }
        this.addCustomArgsRules.add(addCustomArgsRulesItem);
        return this;
    }

    public RemoteAuthRuleVo withAddCustomArgsRules(Consumer<List<CustomArgs>> addCustomArgsRulesSetter) {
        if (this.addCustomArgsRules == null) {
            this.addCustomArgsRules = new ArrayList<>();
        }
        addCustomArgsRulesSetter.accept(this.addCustomArgsRules);
        return this;
    }

    /**
     * URL鉴权参数
     * @return addCustomArgsRules
     */
    public List<CustomArgs> getAddCustomArgsRules() {
        return addCustomArgsRules;
    }

    public void setAddCustomArgsRules(List<CustomArgs> addCustomArgsRules) {
        this.addCustomArgsRules = addCustomArgsRules;
    }

    public RemoteAuthRuleVo withReserveHeadersSetting(String reserveHeadersSetting) {
        this.reserveHeadersSetting = reserveHeadersSetting;
        return this;
    }

    /**
     * 设置用户请求中参与鉴权请求头，可选reserve_all_headers（保留所有请求头参数）、reserve_specific_headers（保留指定请求头参数）、ignore_all_headers（忽略所有请求头参数）。
     * @return reserveHeadersSetting
     */
    public String getReserveHeadersSetting() {
        return reserveHeadersSetting;
    }

    public void setReserveHeadersSetting(String reserveHeadersSetting) {
        this.reserveHeadersSetting = reserveHeadersSetting;
    }

    public RemoteAuthRuleVo withAddCustomHeadersRules(List<CustomArgs> addCustomHeadersRules) {
        this.addCustomHeadersRules = addCustomHeadersRules;
        return this;
    }

    public RemoteAuthRuleVo addAddCustomHeadersRulesItem(CustomArgs addCustomHeadersRulesItem) {
        if (this.addCustomHeadersRules == null) {
            this.addCustomHeadersRules = new ArrayList<>();
        }
        this.addCustomHeadersRules.add(addCustomHeadersRulesItem);
        return this;
    }

    public RemoteAuthRuleVo withAddCustomHeadersRules(Consumer<List<CustomArgs>> addCustomHeadersRulesSetter) {
        if (this.addCustomHeadersRules == null) {
            this.addCustomHeadersRules = new ArrayList<>();
        }
        addCustomHeadersRulesSetter.accept(this.addCustomHeadersRules);
        return this;
    }

    /**
     * 请求头鉴权参数
     * @return addCustomHeadersRules
     */
    public List<CustomArgs> getAddCustomHeadersRules() {
        return addCustomHeadersRules;
    }

    public void setAddCustomHeadersRules(List<CustomArgs> addCustomHeadersRules) {
        this.addCustomHeadersRules = addCustomHeadersRules;
    }

    public RemoteAuthRuleVo withAuthSuccessStatus(String authSuccessStatus) {
        this.authSuccessStatus = authSuccessStatus;
        return this;
    }

    /**
     * 设置鉴权成功时远程鉴权服务器返回给CDN节点的状态码。取值范围：2xx/3xx。
     * @return authSuccessStatus
     */
    public String getAuthSuccessStatus() {
        return authSuccessStatus;
    }

    public void setAuthSuccessStatus(String authSuccessStatus) {
        this.authSuccessStatus = authSuccessStatus;
    }

    public RemoteAuthRuleVo withAuthFailedStatus(String authFailedStatus) {
        this.authFailedStatus = authFailedStatus;
        return this;
    }

    /**
     * 设置鉴权失败时远程鉴权服务器返回给CDN节点的状态码。取值范围：4xx/5xx。
     * @return authFailedStatus
     */
    public String getAuthFailedStatus() {
        return authFailedStatus;
    }

    public void setAuthFailedStatus(String authFailedStatus) {
        this.authFailedStatus = authFailedStatus;
    }

    public RemoteAuthRuleVo withResponseStatus(String responseStatus) {
        this.responseStatus = responseStatus;
        return this;
    }

    /**
     * 设置鉴权失败时CDN节点返回给用户的状态码。取值范围：2xx/3xx/4xx/5xx。
     * @return responseStatus
     */
    public String getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(String responseStatus) {
        this.responseStatus = responseStatus;
    }

    public RemoteAuthRuleVo withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * 设置鉴权超时时间，即从CDN转发鉴权请求开始，到CDN节点收到远程鉴权服务器返回的结果的时间。单位为毫秒，值为0或50~3000。
     * @return timeout
     */
    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public RemoteAuthRuleVo withTimeoutAction(String timeoutAction) {
        this.timeoutAction = timeoutAction;
        return this;
    }

    /**
     * 设置鉴权超时后，CDN节点如何处理用户请求。 pass(鉴权失败放过)：鉴权超时后允许用户请求，返回对应的资源。 forbid(鉴权失败拒绝)：鉴权超时后拒绝用户请求，返回配置的响应自定义状态码给用户。
     * @return timeoutAction
     */
    public String getTimeoutAction() {
        return timeoutAction;
    }

    public void setTimeoutAction(String timeoutAction) {
        this.timeoutAction = timeoutAction;
    }

    public RemoteAuthRuleVo withReserveHeaders(String reserveHeaders) {
        this.reserveHeaders = reserveHeaders;
        return this;
    }

    /**
     * 当reserve_headers_setting等于reserve_specific_headers时为必选，其余情况为空，要保留的请求头，多个请求头用竖线分隔：key1|key2。
     * @return reserveHeaders
     */
    public String getReserveHeaders() {
        return reserveHeaders;
    }

    public void setReserveHeaders(String reserveHeaders) {
        this.reserveHeaders = reserveHeaders;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RemoteAuthRuleVo that = (RemoteAuthRuleVo) obj;
        return Objects.equals(this.authServer, that.authServer)
            && Objects.equals(this.requestMethod, that.requestMethod)
            && Objects.equals(this.fileTypeSetting, that.fileTypeSetting)
            && Objects.equals(this.specifiedFileType, that.specifiedFileType)
            && Objects.equals(this.reserveArgsSetting, that.reserveArgsSetting)
            && Objects.equals(this.reserveArgs, that.reserveArgs)
            && Objects.equals(this.addCustomArgsRules, that.addCustomArgsRules)
            && Objects.equals(this.reserveHeadersSetting, that.reserveHeadersSetting)
            && Objects.equals(this.addCustomHeadersRules, that.addCustomHeadersRules)
            && Objects.equals(this.authSuccessStatus, that.authSuccessStatus)
            && Objects.equals(this.authFailedStatus, that.authFailedStatus)
            && Objects.equals(this.responseStatus, that.responseStatus) && Objects.equals(this.timeout, that.timeout)
            && Objects.equals(this.timeoutAction, that.timeoutAction)
            && Objects.equals(this.reserveHeaders, that.reserveHeaders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authServer,
            requestMethod,
            fileTypeSetting,
            specifiedFileType,
            reserveArgsSetting,
            reserveArgs,
            addCustomArgsRules,
            reserveHeadersSetting,
            addCustomHeadersRules,
            authSuccessStatus,
            authFailedStatus,
            responseStatus,
            timeout,
            timeoutAction,
            reserveHeaders);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RemoteAuthRuleVo {\n");
        sb.append("    authServer: ").append(toIndentedString(authServer)).append("\n");
        sb.append("    requestMethod: ").append(toIndentedString(requestMethod)).append("\n");
        sb.append("    fileTypeSetting: ").append(toIndentedString(fileTypeSetting)).append("\n");
        sb.append("    specifiedFileType: ").append(toIndentedString(specifiedFileType)).append("\n");
        sb.append("    reserveArgsSetting: ").append(toIndentedString(reserveArgsSetting)).append("\n");
        sb.append("    reserveArgs: ").append(toIndentedString(reserveArgs)).append("\n");
        sb.append("    addCustomArgsRules: ").append(toIndentedString(addCustomArgsRules)).append("\n");
        sb.append("    reserveHeadersSetting: ").append(toIndentedString(reserveHeadersSetting)).append("\n");
        sb.append("    addCustomHeadersRules: ").append(toIndentedString(addCustomHeadersRules)).append("\n");
        sb.append("    authSuccessStatus: ").append(toIndentedString(authSuccessStatus)).append("\n");
        sb.append("    authFailedStatus: ").append(toIndentedString(authFailedStatus)).append("\n");
        sb.append("    responseStatus: ").append(toIndentedString(responseStatus)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    timeoutAction: ").append(toIndentedString(timeoutAction)).append("\n");
        sb.append("    reserveHeaders: ").append(toIndentedString(reserveHeaders)).append("\n");
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
