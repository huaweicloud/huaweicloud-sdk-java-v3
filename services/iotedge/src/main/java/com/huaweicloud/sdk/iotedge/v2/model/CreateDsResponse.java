package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateDsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ds_id")

    private String dsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config")

    private Object config;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edge_node_id")

    private String edgeNodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_id")

    private String moduleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tpl_id")

    private String tplId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quality_report")

    private Boolean qualityReport;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edge_app_name")

    private String edgeAppName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_info")

    private Object connectionInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_state")

    private String moduleState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "synchronized")

    private Boolean _synchronized;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "synchronized_time")

    private String synchronizedTime;

    public CreateDsResponse withDsId(String dsId) {
        this.dsId = dsId;
        return this;
    }

    /**
     * 采集数据源id，节点下唯一
     * @return dsId
     */
    public String getDsId() {
        return dsId;
    }

    public void setDsId(String dsId) {
        this.dsId = dsId;
    }

    public CreateDsResponse withConfig(Object config) {
        this.config = config;
        return this;
    }

    /**
     * 数据源的连接及采集信息
     * @return config
     */
    public Object getConfig() {
        return config;
    }

    public void setConfig(Object config) {
        this.config = config;
    }

    public CreateDsResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 采集数据源名称，允许中、数字、英文大小写、下划线、中划线
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateDsResponse withEdgeNodeId(String edgeNodeId) {
        this.edgeNodeId = edgeNodeId;
        return this;
    }

    /**
     * 边缘节点id
     * @return edgeNodeId
     */
    public String getEdgeNodeId() {
        return edgeNodeId;
    }

    public void setEdgeNodeId(String edgeNodeId) {
        this.edgeNodeId = edgeNodeId;
    }

    public CreateDsResponse withModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }

    /**
     * 模块id
     * @return moduleId
     */
    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public CreateDsResponse withTplId(String tplId) {
        this.tplId = tplId;
        return this;
    }

    /**
     * 模板id，节点下唯一
     * @return tplId
     */
    public String getTplId() {
        return tplId;
    }

    public void setTplId(String tplId) {
        this.tplId = tplId;
    }

    public CreateDsResponse withQualityReport(Boolean qualityReport) {
        this.qualityReport = qualityReport;
        return this;
    }

    /**
     * 质量上报开关，不携带或值不为true，默认为false
     * @return qualityReport
     */
    public Boolean getQualityReport() {
        return qualityReport;
    }

    public void setQualityReport(Boolean qualityReport) {
        this.qualityReport = qualityReport;
    }

    public CreateDsResponse withEdgeAppName(String edgeAppName) {
        this.edgeAppName = edgeAppName;
        return this;
    }

    /**
     * 应用ID
     * @return edgeAppName
     */
    public String getEdgeAppName() {
        return edgeAppName;
    }

    public void setEdgeAppName(String edgeAppName) {
        this.edgeAppName = edgeAppName;
    }

    public CreateDsResponse withConnectionInfo(Object connectionInfo) {
        this.connectionInfo = connectionInfo;
        return this;
    }

    /**
     * 数采连接信息
     * @return connectionInfo
     */
    public Object getConnectionInfo() {
        return connectionInfo;
    }

    public void setConnectionInfo(Object connectionInfo) {
        this.connectionInfo = connectionInfo;
    }

    public CreateDsResponse withModuleState(String moduleState) {
        this.moduleState = moduleState;
        return this;
    }

    /**
     * 数采连接状态,stopped|running
     * @return moduleState
     */
    public String getModuleState() {
        return moduleState;
    }

    public void setModuleState(String moduleState) {
        this.moduleState = moduleState;
    }

    public CreateDsResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 数采连接下点位数
     * minimum: 0
     * maximum: 1000000
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public CreateDsResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public CreateDsResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 最后一次修改时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public CreateDsResponse withSynchronized(Boolean _synchronized) {
        this._synchronized = _synchronized;
        return this;
    }

    /**
     * 数采配置是否已同步，已同步：true,未同步：false
     * @return _synchronized
     */
    public Boolean getSynchronized() {
        return _synchronized;
    }

    public void setSynchronized(Boolean _synchronized) {
        this._synchronized = _synchronized;
    }

    public CreateDsResponse withSynchronizedTime(String synchronizedTime) {
        this.synchronizedTime = synchronizedTime;
        return this;
    }

    /**
     * 数采配置同步时间
     * @return synchronizedTime
     */
    public String getSynchronizedTime() {
        return synchronizedTime;
    }

    public void setSynchronizedTime(String synchronizedTime) {
        this.synchronizedTime = synchronizedTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateDsResponse that = (CreateDsResponse) obj;
        return Objects.equals(this.dsId, that.dsId) && Objects.equals(this.config, that.config)
            && Objects.equals(this.name, that.name) && Objects.equals(this.edgeNodeId, that.edgeNodeId)
            && Objects.equals(this.moduleId, that.moduleId) && Objects.equals(this.tplId, that.tplId)
            && Objects.equals(this.qualityReport, that.qualityReport)
            && Objects.equals(this.edgeAppName, that.edgeAppName)
            && Objects.equals(this.connectionInfo, that.connectionInfo)
            && Objects.equals(this.moduleState, that.moduleState) && Objects.equals(this.count, that.count)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this._synchronized, that._synchronized)
            && Objects.equals(this.synchronizedTime, that.synchronizedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dsId,
            config,
            name,
            edgeNodeId,
            moduleId,
            tplId,
            qualityReport,
            edgeAppName,
            connectionInfo,
            moduleState,
            count,
            createTime,
            updateTime,
            _synchronized,
            synchronizedTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDsResponse {\n");
        sb.append("    dsId: ").append(toIndentedString(dsId)).append("\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    edgeNodeId: ").append(toIndentedString(edgeNodeId)).append("\n");
        sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
        sb.append("    tplId: ").append(toIndentedString(tplId)).append("\n");
        sb.append("    qualityReport: ").append(toIndentedString(qualityReport)).append("\n");
        sb.append("    edgeAppName: ").append(toIndentedString(edgeAppName)).append("\n");
        sb.append("    connectionInfo: ").append(toIndentedString(connectionInfo)).append("\n");
        sb.append("    moduleState: ").append(toIndentedString(moduleState)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    _synchronized: ").append(toIndentedString(_synchronized)).append("\n");
        sb.append("    synchronizedTime: ").append(toIndentedString(synchronizedTime)).append("\n");
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
