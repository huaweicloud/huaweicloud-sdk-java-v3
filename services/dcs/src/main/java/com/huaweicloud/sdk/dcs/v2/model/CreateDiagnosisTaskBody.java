package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 发起实例诊断请求体
 */
public class CreateDiagnosisTaskBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    @JacksonXmlProperty(localName = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    @JacksonXmlProperty(localName = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_ip_list")

    @JacksonXmlProperty(localName = "node_ip_list")

    private List<String> nodeIpList = null;

    public CreateDiagnosisTaskBody withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 诊断开始时间。UNIX时间戳，单位毫秒。
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public CreateDiagnosisTaskBody withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 诊断结束时间。UNIX时间戳，单位毫秒。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public CreateDiagnosisTaskBody withNodeIpList(List<String> nodeIpList) {
        this.nodeIpList = nodeIpList;
        return this;
    }

    public CreateDiagnosisTaskBody addNodeIpListItem(String nodeIpListItem) {
        if (this.nodeIpList == null) {
            this.nodeIpList = new ArrayList<>();
        }
        this.nodeIpList.add(nodeIpListItem);
        return this;
    }

    public CreateDiagnosisTaskBody withNodeIpList(Consumer<List<String>> nodeIpListSetter) {
        if (this.nodeIpList == null) {
            this.nodeIpList = new ArrayList<>();
        }
        nodeIpListSetter.accept(this.nodeIpList);
        return this;
    }

    /**
     * 诊断节点IP列表。默认诊断所有节点。 非读写分离实例查询方法如下：   - 方法一：参考[查看实例信息](https://support.huaweicloud.com/usermanual-dcs/dcs-ug-0312016.html)。   - 方法二：调用[查询指定实例](https://support.huaweicloud.com/api-dcs/ShowInstance.html)查询。  读写分离实例查询方法：调用[查询分片信息](https://support.huaweicloud.com/api-dcs/ListGroupReplicationInfo.html#ListGroupReplicationInfo__response_InstanceReplicationListInfo)。 
     * @return nodeIpList
     */
    public List<String> getNodeIpList() {
        return nodeIpList;
    }

    public void setNodeIpList(List<String> nodeIpList) {
        this.nodeIpList = nodeIpList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateDiagnosisTaskBody createDiagnosisTaskBody = (CreateDiagnosisTaskBody) o;
        return Objects.equals(this.beginTime, createDiagnosisTaskBody.beginTime)
            && Objects.equals(this.endTime, createDiagnosisTaskBody.endTime)
            && Objects.equals(this.nodeIpList, createDiagnosisTaskBody.nodeIpList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(beginTime, endTime, nodeIpList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDiagnosisTaskBody {\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    nodeIpList: ").append(toIndentedString(nodeIpList)).append("\n");
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
