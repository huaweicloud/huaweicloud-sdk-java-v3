package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ShowShipperAuthorizeResponseBodyDataData
 */
public class ShowShipperAuthorizeResponseBodyDataData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorize_status")

    private Integer authorizeStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_source_query")

    private String dataSourceQuery;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_type")

    private Integer dataType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataspace")

    private String dataspace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipe")

    private String pipe;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_time")

    private Long requestTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handler_time")

    private Long handlerTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_status")

    private Integer runStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shipper_id")

    private String shipperId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shipper_name")

    private String shipperName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private String workspace;

    public ShowShipperAuthorizeResponseBodyDataData withAuthorizeStatus(Integer authorizeStatus) {
        this.authorizeStatus = authorizeStatus;
        return this;
    }

    /**
     * 授权状态，0-已授权，1-未授权，2-拒绝授权
     * @return authorizeStatus
     */
    public Integer getAuthorizeStatus() {
        return authorizeStatus;
    }

    public void setAuthorizeStatus(Integer authorizeStatus) {
        this.authorizeStatus = authorizeStatus;
    }

    public ShowShipperAuthorizeResponseBodyDataData withDataSourceQuery(String dataSourceQuery) {
        this.dataSourceQuery = dataSourceQuery;
        return this;
    }

    /**
     * 数据源查询字符串，表示数据源的路径
     * @return dataSourceQuery
     */
    public String getDataSourceQuery() {
        return dataSourceQuery;
    }

    public void setDataSourceQuery(String dataSourceQuery) {
        this.dataSourceQuery = dataSourceQuery;
    }

    public ShowShipperAuthorizeResponseBodyDataData withDataType(Integer dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * 数据类型，具体含义根据业务定义
     * @return dataType
     */
    public Integer getDataType() {
        return dataType;
    }

    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    public ShowShipperAuthorizeResponseBodyDataData withDataspace(String dataspace) {
        this.dataspace = dataspace;
        return this;
    }

    /**
     * 数据空间ID，唯一标识
     * @return dataspace
     */
    public String getDataspace() {
        return dataspace;
    }

    public void setDataspace(String dataspace) {
        this.dataspace = dataspace;
    }

    public ShowShipperAuthorizeResponseBodyDataData withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 唯一标识ID
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ShowShipperAuthorizeResponseBodyDataData withPipe(String pipe) {
        this.pipe = pipe;
        return this;
    }

    /**
     * 管道ID，唯一标识
     * @return pipe
     */
    public String getPipe() {
        return pipe;
    }

    public void setPipe(String pipe) {
        this.pipe = pipe;
    }

    public ShowShipperAuthorizeResponseBodyDataData withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 地域信息
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ShowShipperAuthorizeResponseBodyDataData withRequestTime(Long requestTime) {
        this.requestTime = requestTime;
        return this;
    }

    /**
     * 请求时间，单位为毫秒的时间戳
     * @return requestTime
     */
    public Long getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Long requestTime) {
        this.requestTime = requestTime;
    }

    public ShowShipperAuthorizeResponseBodyDataData withHandlerTime(Long handlerTime) {
        this.handlerTime = handlerTime;
        return this;
    }

    /**
     * 授权时间，单位为毫秒的时间戳
     * @return handlerTime
     */
    public Long getHandlerTime() {
        return handlerTime;
    }

    public void setHandlerTime(Long handlerTime) {
        this.handlerTime = handlerTime;
    }

    public ShowShipperAuthorizeResponseBodyDataData withRunStatus(Integer runStatus) {
        this.runStatus = runStatus;
        return this;
    }

    /**
     * 运行状态，具体含义根据业务定义
     * @return runStatus
     */
    public Integer getRunStatus() {
        return runStatus;
    }

    public void setRunStatus(Integer runStatus) {
        this.runStatus = runStatus;
    }

    public ShowShipperAuthorizeResponseBodyDataData withShipperId(String shipperId) {
        this.shipperId = shipperId;
        return this;
    }

    /**
     * 船运ID，唯一标识
     * @return shipperId
     */
    public String getShipperId() {
        return shipperId;
    }

    public void setShipperId(String shipperId) {
        this.shipperId = shipperId;
    }

    public ShowShipperAuthorizeResponseBodyDataData withShipperName(String shipperName) {
        this.shipperName = shipperName;
        return this;
    }

    /**
     * 船运名称
     * @return shipperName
     */
    public String getShipperName() {
        return shipperName;
    }

    public void setShipperName(String shipperName) {
        this.shipperName = shipperName;
    }

    public ShowShipperAuthorizeResponseBodyDataData withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * 工作空间ID，唯一标识
     * @return workspace
     */
    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowShipperAuthorizeResponseBodyDataData that = (ShowShipperAuthorizeResponseBodyDataData) obj;
        return Objects.equals(this.authorizeStatus, that.authorizeStatus)
            && Objects.equals(this.dataSourceQuery, that.dataSourceQuery)
            && Objects.equals(this.dataType, that.dataType) && Objects.equals(this.dataspace, that.dataspace)
            && Objects.equals(this.id, that.id) && Objects.equals(this.pipe, that.pipe)
            && Objects.equals(this.region, that.region) && Objects.equals(this.requestTime, that.requestTime)
            && Objects.equals(this.handlerTime, that.handlerTime) && Objects.equals(this.runStatus, that.runStatus)
            && Objects.equals(this.shipperId, that.shipperId) && Objects.equals(this.shipperName, that.shipperName)
            && Objects.equals(this.workspace, that.workspace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorizeStatus,
            dataSourceQuery,
            dataType,
            dataspace,
            id,
            pipe,
            region,
            requestTime,
            handlerTime,
            runStatus,
            shipperId,
            shipperName,
            workspace);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowShipperAuthorizeResponseBodyDataData {\n");
        sb.append("    authorizeStatus: ").append(toIndentedString(authorizeStatus)).append("\n");
        sb.append("    dataSourceQuery: ").append(toIndentedString(dataSourceQuery)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    dataspace: ").append(toIndentedString(dataspace)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    pipe: ").append(toIndentedString(pipe)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    requestTime: ").append(toIndentedString(requestTime)).append("\n");
        sb.append("    handlerTime: ").append(toIndentedString(handlerTime)).append("\n");
        sb.append("    runStatus: ").append(toIndentedString(runStatus)).append("\n");
        sb.append("    shipperId: ").append(toIndentedString(shipperId)).append("\n");
        sb.append("    shipperName: ").append(toIndentedString(shipperName)).append("\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
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
