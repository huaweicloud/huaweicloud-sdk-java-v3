package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowBinlogTaskInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gmt_create")

    private Long gmtCreate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gmt_modified")

    private Long gmtModified;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_name")

    private String tenantName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_id")

    private String connectionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "binlog_type")

    private String binlogType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "position")

    private String position;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "err_msg")

    private String errMsg;

    public ShowBinlogTaskInfoResponse withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 解析任务ID
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ShowBinlogTaskInfoResponse withGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }

    /**
     * 任务创建时间，单位毫秒
     * @return gmtCreate
     */
    public Long getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public ShowBinlogTaskInfoResponse withGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }

    /**
     * 任务修改时间，单位毫秒
     * @return gmtModified
     */
    public Long getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
    }

    public ShowBinlogTaskInfoResponse withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 租户ID
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public ShowBinlogTaskInfoResponse withTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }

    /**
     * 租户名称
     * @return tenantName
     */
    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public ShowBinlogTaskInfoResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户ID
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ShowBinlogTaskInfoResponse withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名称
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ShowBinlogTaskInfoResponse withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * 连接ID
     * @return connectionId
     */
    public String getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    public ShowBinlogTaskInfoResponse withBinlogType(String binlogType) {
        this.binlogType = binlogType;
        return this;
    }

    /**
     * binlog类型。取值范围：latest（最近日志）、backup（归档日志）
     * @return binlogType
     */
    public String getBinlogType() {
        return binlogType;
    }

    public void setBinlogType(String binlogType) {
        this.binlogType = binlogType;
    }

    public ShowBinlogTaskInfoResponse withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * binlog文件名称
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public ShowBinlogTaskInfoResponse withPosition(String position) {
        this.position = position;
        return this;
    }

    /**
     * binlog文件解析位置
     * @return position
     */
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public ShowBinlogTaskInfoResponse withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 任务状态。取值范围：0（初始化）、1（运行中）、2（部分成功）、3（成功）、4（失败）、-1（已删除）
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ShowBinlogTaskInfoResponse withErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }

    /**
     * 错误信息
     * @return errMsg
     */
    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowBinlogTaskInfoResponse that = (ShowBinlogTaskInfoResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.gmtCreate, that.gmtCreate)
            && Objects.equals(this.gmtModified, that.gmtModified) && Objects.equals(this.tenantId, that.tenantId)
            && Objects.equals(this.tenantName, that.tenantName) && Objects.equals(this.userId, that.userId)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.connectionId, that.connectionId)
            && Objects.equals(this.binlogType, that.binlogType) && Objects.equals(this.fileName, that.fileName)
            && Objects.equals(this.position, that.position) && Objects.equals(this.status, that.status)
            && Objects.equals(this.errMsg, that.errMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            gmtCreate,
            gmtModified,
            tenantId,
            tenantName,
            userId,
            userName,
            connectionId,
            binlogType,
            fileName,
            position,
            status,
            errMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBinlogTaskInfoResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    gmtCreate: ").append(toIndentedString(gmtCreate)).append("\n");
        sb.append("    gmtModified: ").append(toIndentedString(gmtModified)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
        sb.append("    binlogType: ").append(toIndentedString(binlogType)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    errMsg: ").append(toIndentedString(errMsg)).append("\n");
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
