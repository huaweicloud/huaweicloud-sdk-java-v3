package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListFactoryAlarmRulesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private String workspace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Project-Id")

    private String xProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remind_type")

    private Integer remindType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ding_name")

    private String dingName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListFactoryAlarmRulesRequest withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * 工作空间ID，获取方法请参见[实例ID和工作空间ID](dataartsstudio_02_0350.xml)。
     * @return workspace
     */
    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public ListFactoryAlarmRulesRequest withXProjectId(String xProjectId) {
        this.xProjectId = xProjectId;
        return this;
    }

    /**
     * 项目ID，获取方法请参见[项目ID和账号ID](projectid_accountid.xml)。  多project场景采用AK/SK认证的接口请求，则该字段必选。
     * @return xProjectId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Project-Id")
    public String getXProjectId() {
        return xProjectId;
    }

    public void setXProjectId(String xProjectId) {
        this.xProjectId = xProjectId;
    }

    public ListFactoryAlarmRulesRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 作业/规则名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListFactoryAlarmRulesRequest withRemindType(Integer remindType) {
        this.remindType = remindType;
        return this;
    }

    /**
     * 通知类型：  - 0：运行成功。 - 1：运行异常/失败。 - 3：未完成。 - 4：资源繁忙。 - 5：基线任务异常。 - 6：基线预警。 - 7：基线破线。 - 8：基线加剧。 - 9：保障作业预警时间未完成。 - 10：保障作业承诺时间未完成。 - 11：保障作业失败。 - 12：周期未完成。 - 13：运行取消。 - 14：失败作业重跑成功。 - 15：作业改动。 默认查询所有状态。
     * @return remindType
     */
    public Integer getRemindType() {
        return remindType;
    }

    public void setRemindType(Integer remindType) {
        this.remindType = remindType;
    }

    public ListFactoryAlarmRulesRequest withDingName(String dingName) {
        this.dingName = dingName;
        return this;
    }

    /**
     * 钉钉机器人名称。
     * @return dingName
     */
    public String getDingName() {
        return dingName;
    }

    public void setDingName(String dingName) {
        this.dingName = dingName;
    }

    public ListFactoryAlarmRulesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页列表的页数，默认值为0。取值范围大于等于0。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListFactoryAlarmRulesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页返回结果，指定每页最大记录数。范围[1,100]，默认为10。  默认值：10
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListFactoryAlarmRulesRequest that = (ListFactoryAlarmRulesRequest) obj;
        return Objects.equals(this.workspace, that.workspace) && Objects.equals(this.xProjectId, that.xProjectId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.remindType, that.remindType)
            && Objects.equals(this.dingName, that.dingName) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspace, xProjectId, name, remindType, dingName, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFactoryAlarmRulesRequest {\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
        sb.append("    xProjectId: ").append(toIndentedString(xProjectId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    remindType: ").append(toIndentedString(remindType)).append("\n");
        sb.append("    dingName: ").append(toIndentedString(dingName)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
