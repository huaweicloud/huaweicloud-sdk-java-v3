package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 数据源请求。 **取值范围**： 不涉及。
 */
public class ExtDataSourceReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_source_id")

    private String dataSourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_source_name")

    private String dataSourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_pwd")

    private String userPwd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reboot")

    private Boolean reboot;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connect_info")

    private String connectInfo;

    public ExtDataSourceReq withDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }

    /**
     * **参数解释**： 外部数据源ID。当数据源为MRS时为必选字段。 **取值范围**： 不涉及。
     * @return dataSourceId
     */
    public String getDataSourceId() {
        return dataSourceId;
    }

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    public ExtDataSourceReq withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 数据源类型。 **取值范围**： 不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ExtDataSourceReq withDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
        return this;
    }

    /**
     * **参数解释**： 外部数据源名称。 **取值范围**： 仅可包含大小写字母、数字、下划线，1到64个字符。
     * @return dataSourceName
     */
    public String getDataSourceName() {
        return dataSourceName;
    }

    public void setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
    }

    public ExtDataSourceReq withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * **参数解释**： 用户名。数据源类型为OBS时，传对应OBS委托名称。 **取值范围**： 仅可包含大小写字母、数字、下划线，3到20个字符。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ExtDataSourceReq withUserPwd(String userPwd) {
        this.userPwd = userPwd;
        return this;
    }

    /**
     * **参数解释**： 密码。当数据源为MRS时为必选字段。 **取值范围**： 不涉及。
     * @return userPwd
     */
    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public ExtDataSourceReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 描述。 **取值范围**： 除!<>'=&等特殊字符外的字符。长度256个字符以内。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ExtDataSourceReq withReboot(Boolean reboot) {
        this.reboot = reboot;
        return this;
    }

    /**
     * **参数解释**： 是否重启集群。 **取值范围**： 不涉及。
     * @return reboot
     */
    public Boolean getReboot() {
        return reboot;
    }

    public void setReboot(Boolean reboot) {
        this.reboot = reboot;
    }

    public ExtDataSourceReq withConnectInfo(String connectInfo) {
        this.connectInfo = connectInfo;
        return this;
    }

    /**
     * **参数解释**： 连接的数据库。当数据源为OBS时为必选字段。 **取值范围**： 不涉及。
     * @return connectInfo
     */
    public String getConnectInfo() {
        return connectInfo;
    }

    public void setConnectInfo(String connectInfo) {
        this.connectInfo = connectInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExtDataSourceReq that = (ExtDataSourceReq) obj;
        return Objects.equals(this.dataSourceId, that.dataSourceId) && Objects.equals(this.type, that.type)
            && Objects.equals(this.dataSourceName, that.dataSourceName) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.userPwd, that.userPwd) && Objects.equals(this.description, that.description)
            && Objects.equals(this.reboot, that.reboot) && Objects.equals(this.connectInfo, that.connectInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataSourceId, type, dataSourceName, userName, userPwd, description, reboot, connectInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtDataSourceReq {\n");
        sb.append("    dataSourceId: ").append(toIndentedString(dataSourceId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    dataSourceName: ").append(toIndentedString(dataSourceName)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    userPwd: ").append(toIndentedString(userPwd)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    reboot: ").append(toIndentedString(reboot)).append("\n");
        sb.append("    connectInfo: ").append(toIndentedString(connectInfo)).append("\n");
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
