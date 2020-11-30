package com.huaweicloud.sdk.bcs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 创建新集群信息
 */
public class CreateRequestBodyCceCreateInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_num")
    
    private Integer nodeNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_flavor")
    
    private String nodeFlavor;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cce_flavor")
    
    private String cceFlavor;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="init_node_pwd")
    
    private String initNodePwd;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="az")
    
    private String az;

    public CreateRequestBodyCceCreateInfo withNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }

    


    /**
     * 集群节点数
     * @return nodeNum
     */
    public Integer getNodeNum() {
        return nodeNum;
    }

    public void setNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
    }

    public CreateRequestBodyCceCreateInfo withNodeFlavor(String nodeFlavor) {
        this.nodeFlavor = nodeFlavor;
        return this;
    }

    


    /**
     * 集群节点规格
     * @return nodeFlavor
     */
    public String getNodeFlavor() {
        return nodeFlavor;
    }

    public void setNodeFlavor(String nodeFlavor) {
        this.nodeFlavor = nodeFlavor;
    }

    public CreateRequestBodyCceCreateInfo withCceFlavor(String cceFlavor) {
        this.cceFlavor = cceFlavor;
        return this;
    }

    


    /**
     * CCE集群规格
     * @return cceFlavor
     */
    public String getCceFlavor() {
        return cceFlavor;
    }

    public void setCceFlavor(String cceFlavor) {
        this.cceFlavor = cceFlavor;
    }

    public CreateRequestBodyCceCreateInfo withInitNodePwd(String initNodePwd) {
        this.initNodePwd = initNodePwd;
        return this;
    }

    


    /**
     * 节点初始密码
     * @return initNodePwd
     */
    public String getInitNodePwd() {
        return initNodePwd;
    }

    public void setInitNodePwd(String initNodePwd) {
        this.initNodePwd = initNodePwd;
    }

    public CreateRequestBodyCceCreateInfo withAz(String az) {
        this.az = az;
        return this;
    }

    


    /**
     * 可用区
     * @return az
     */
    public String getAz() {
        return az;
    }

    public void setAz(String az) {
        this.az = az;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateRequestBodyCceCreateInfo createRequestBodyCceCreateInfo = (CreateRequestBodyCceCreateInfo) o;
        return Objects.equals(this.nodeNum, createRequestBodyCceCreateInfo.nodeNum) &&
            Objects.equals(this.nodeFlavor, createRequestBodyCceCreateInfo.nodeFlavor) &&
            Objects.equals(this.cceFlavor, createRequestBodyCceCreateInfo.cceFlavor) &&
            Objects.equals(this.initNodePwd, createRequestBodyCceCreateInfo.initNodePwd) &&
            Objects.equals(this.az, createRequestBodyCceCreateInfo.az);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nodeNum, nodeFlavor, cceFlavor, initNodePwd, az);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRequestBodyCceCreateInfo {\n");
        sb.append("    nodeNum: ").append(toIndentedString(nodeNum)).append("\n");
        sb.append("    nodeFlavor: ").append(toIndentedString(nodeFlavor)).append("\n");
        sb.append("    cceFlavor: ").append(toIndentedString(cceFlavor)).append("\n");
        sb.append("    initNodePwd: ").append(toIndentedString(initNodePwd)).append("\n");
        sb.append("    az: ").append(toIndentedString(az)).append("\n");
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

