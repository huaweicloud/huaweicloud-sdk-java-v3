package com.huaweicloud.sdk.iotedge.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 创建数据表请求结构体
 */
public class QueryDcDsBriefRespDTO  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ds_id")
    

    private String dsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="edge_node_id")
    

    private String edgeNodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="module_id")
    

    private String moduleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tpl_id")
    

    private String tplId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="quality_report")
    

    private Boolean qualityReport;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="edge_app_name")
    

    private String edgeAppName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="connection_info")
    

    private Object connectionInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="module_state")
    

    private String moduleState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_time")
    

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="synchronized")
    

    private Boolean _synchronized;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="synchronized_time")
    

    private String synchronizedTime;

    public QueryDcDsBriefRespDTO withDsId(String dsId) {
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

    

    public QueryDcDsBriefRespDTO withName(String name) {
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

    

    public QueryDcDsBriefRespDTO withEdgeNodeId(String edgeNodeId) {
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

    

    public QueryDcDsBriefRespDTO withModuleId(String moduleId) {
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

    

    public QueryDcDsBriefRespDTO withTplId(String tplId) {
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

    

    public QueryDcDsBriefRespDTO withQualityReport(Boolean qualityReport) {
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

    

    public QueryDcDsBriefRespDTO withEdgeAppName(String edgeAppName) {
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

    

    public QueryDcDsBriefRespDTO withConnectionInfo(Object connectionInfo) {
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

    

    public QueryDcDsBriefRespDTO withModuleState(String moduleState) {
        this.moduleState = moduleState;
        return this;
    }

    


    /**
     * 数采连接状态,RUNNING|STOPPED
     * @return moduleState
     */
    public String getModuleState() {
        return moduleState;
    }

    public void setModuleState(String moduleState) {
        this.moduleState = moduleState;
    }

    

    public QueryDcDsBriefRespDTO withCount(Long count) {
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

    

    public QueryDcDsBriefRespDTO withCreateTime(String createTime) {
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

    

    public QueryDcDsBriefRespDTO withUpdateTime(String updateTime) {
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

    

    public QueryDcDsBriefRespDTO withSynchronized(Boolean _synchronized) {
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

    

    public QueryDcDsBriefRespDTO withSynchronizedTime(String synchronizedTime) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryDcDsBriefRespDTO queryDcDsBriefRespDTO = (QueryDcDsBriefRespDTO) o;
        return Objects.equals(this.dsId, queryDcDsBriefRespDTO.dsId) &&
            Objects.equals(this.name, queryDcDsBriefRespDTO.name) &&
            Objects.equals(this.edgeNodeId, queryDcDsBriefRespDTO.edgeNodeId) &&
            Objects.equals(this.moduleId, queryDcDsBriefRespDTO.moduleId) &&
            Objects.equals(this.tplId, queryDcDsBriefRespDTO.tplId) &&
            Objects.equals(this.qualityReport, queryDcDsBriefRespDTO.qualityReport) &&
            Objects.equals(this.edgeAppName, queryDcDsBriefRespDTO.edgeAppName) &&
            Objects.equals(this.connectionInfo, queryDcDsBriefRespDTO.connectionInfo) &&
            Objects.equals(this.moduleState, queryDcDsBriefRespDTO.moduleState) &&
            Objects.equals(this.count, queryDcDsBriefRespDTO.count) &&
            Objects.equals(this.createTime, queryDcDsBriefRespDTO.createTime) &&
            Objects.equals(this.updateTime, queryDcDsBriefRespDTO.updateTime) &&
            Objects.equals(this._synchronized, queryDcDsBriefRespDTO._synchronized) &&
            Objects.equals(this.synchronizedTime, queryDcDsBriefRespDTO.synchronizedTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(dsId, name, edgeNodeId, moduleId, tplId, qualityReport, edgeAppName, connectionInfo, moduleState, count, createTime, updateTime, _synchronized, synchronizedTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryDcDsBriefRespDTO {\n");
        sb.append("    dsId: ").append(toIndentedString(dsId)).append("\n");
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

