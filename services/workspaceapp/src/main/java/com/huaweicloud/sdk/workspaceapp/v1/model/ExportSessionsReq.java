package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 导出用户会话列表请求体。
 */
public class ExportSessionsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_begin_time")

    private OffsetDateTime queryBeginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_end_time")

    private OffsetDateTime queryEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_server_group_id")

    private String appServerGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vm_ip")

    private String vmIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "machine_name")

    private String machineName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_state")

    private String sessionState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_success")

    private String isSuccess;

    public ExportSessionsReq withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ExportSessionsReq withQueryBeginTime(OffsetDateTime queryBeginTime) {
        this.queryBeginTime = queryBeginTime;
        return this;
    }

    /**
     * 搜索开始时间，以会话开始时间为条件查询，只支持导出30天内数据，格式2024-02-27T03:47:51.182Z，参数中query_begin_time与query_end_time必须同时存在或都不存在，都不存在时导出近一个月的数据。
     * @return queryBeginTime
     */
    public OffsetDateTime getQueryBeginTime() {
        return queryBeginTime;
    }

    public void setQueryBeginTime(OffsetDateTime queryBeginTime) {
        this.queryBeginTime = queryBeginTime;
    }

    public ExportSessionsReq withQueryEndTime(OffsetDateTime queryEndTime) {
        this.queryEndTime = queryEndTime;
        return this;
    }

    /**
     * 搜索结束时间，以会话开始时间为条件查询，只支持导出30天内数据，格式2024-02-27T03:47:51.182Z，参数中query_begin_time与query_end_time必须同时存在或都不存在，都不存在时导出近一个月的数据。
     * @return queryEndTime
     */
    public OffsetDateTime getQueryEndTime() {
        return queryEndTime;
    }

    public void setQueryEndTime(OffsetDateTime queryEndTime) {
        this.queryEndTime = queryEndTime;
    }

    public ExportSessionsReq withAppServerGroupId(String appServerGroupId) {
        this.appServerGroupId = appServerGroupId;
        return this;
    }

    /**
     * AppServer组ID。
     * @return appServerGroupId
     */
    public String getAppServerGroupId() {
        return appServerGroupId;
    }

    public void setAppServerGroupId(String appServerGroupId) {
        this.appServerGroupId = appServerGroupId;
    }

    public ExportSessionsReq withVmIp(String vmIp) {
        this.vmIp = vmIp;
        return this;
    }

    /**
     * 服务器IP。
     * @return vmIp
     */
    public String getVmIp() {
        return vmIp;
    }

    public void setVmIp(String vmIp) {
        this.vmIp = vmIp;
    }

    public ExportSessionsReq withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * 客户端出口IP。
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public ExportSessionsReq withMachineName(String machineName) {
        this.machineName = machineName;
        return this;
    }

    /**
     * 应用服务器名称。
     * @return machineName
     */
    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public ExportSessionsReq withSessionState(String sessionState) {
        this.sessionState = sessionState;
        return this;
    }

    /**
     * 应用状态，支持查询多个，中间用英文逗号分隔： * `Active` - 会话当前处于活动状态，有用户登录并且正在使用。 * `Disconnected` - 用户已经登录但会话处于断开连接状态。 * `AppcInit` - 会话正在初始化。 * `SignedOut` - 会话已注销。 * `InitFail` - 会话初始化失败。
     * @return sessionState
     */
    public String getSessionState() {
        return sessionState;
    }

    public void setSessionState(String sessionState) {
        this.sessionState = sessionState;
    }

    public ExportSessionsReq withIsSuccess(String isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    /**
     * 会话是否创建成功,默认不填则查询全部 * 'true' - 会话创建成功 * 'false' - 会话创建失败
     * @return isSuccess
     */
    public String getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(String isSuccess) {
        this.isSuccess = isSuccess;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportSessionsReq that = (ExportSessionsReq) obj;
        return Objects.equals(this.userName, that.userName) && Objects.equals(this.queryBeginTime, that.queryBeginTime)
            && Objects.equals(this.queryEndTime, that.queryEndTime)
            && Objects.equals(this.appServerGroupId, that.appServerGroupId) && Objects.equals(this.vmIp, that.vmIp)
            && Objects.equals(this.publicIp, that.publicIp) && Objects.equals(this.machineName, that.machineName)
            && Objects.equals(this.sessionState, that.sessionState) && Objects.equals(this.isSuccess, that.isSuccess);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName,
            queryBeginTime,
            queryEndTime,
            appServerGroupId,
            vmIp,
            publicIp,
            machineName,
            sessionState,
            isSuccess);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportSessionsReq {\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    queryBeginTime: ").append(toIndentedString(queryBeginTime)).append("\n");
        sb.append("    queryEndTime: ").append(toIndentedString(queryEndTime)).append("\n");
        sb.append("    appServerGroupId: ").append(toIndentedString(appServerGroupId)).append("\n");
        sb.append("    vmIp: ").append(toIndentedString(vmIp)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    machineName: ").append(toIndentedString(machineName)).append("\n");
        sb.append("    sessionState: ").append(toIndentedString(sessionState)).append("\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
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
