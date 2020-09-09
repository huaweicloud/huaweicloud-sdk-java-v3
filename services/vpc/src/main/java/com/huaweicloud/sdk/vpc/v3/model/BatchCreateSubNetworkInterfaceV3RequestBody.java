package com.huaweicloud.sdk.vpc.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vpc.v3.model.BatchCreateSubNetworkInterfaceOption;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * This is a auto create Body Object
 */
public class BatchCreateSubNetworkInterfaceV3RequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dry_run")
    
    private Boolean dryRun;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sub_network_interface")
    
    private BatchCreateSubNetworkInterfaceOption subNetworkInterface = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    private Integer count;

    public BatchCreateSubNetworkInterfaceV3RequestBody withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    


    /**
     * 功能说明：是否只预检此次请求 取值范围： -true：发送检查请求，不会创建辅助弹性网卡。检查项包括是否填写了必需参数、请求格式、业务限制。如果检查不通过，则返回对应错误。如果检查通过，则返回响应码202。 -false（默认值）：发送正常请求，并直接创建辅助弹性网卡。
     * @return dryRun
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    public BatchCreateSubNetworkInterfaceV3RequestBody withSubNetworkInterface(BatchCreateSubNetworkInterfaceOption subNetworkInterface) {
        this.subNetworkInterface = subNetworkInterface;
        return this;
    }

    public BatchCreateSubNetworkInterfaceV3RequestBody withSubNetworkInterface(Consumer<BatchCreateSubNetworkInterfaceOption> subNetworkInterfaceSetter) {
        if(this.subNetworkInterface == null ){
            this.subNetworkInterface = new BatchCreateSubNetworkInterfaceOption();
            subNetworkInterfaceSetter.accept(this.subNetworkInterface);
        }
        
        return this;
    }


    /**
     * Get subNetworkInterface
     * @return subNetworkInterface
     */
    public BatchCreateSubNetworkInterfaceOption getSubNetworkInterface() {
        return subNetworkInterface;
    }

    public void setSubNetworkInterface(BatchCreateSubNetworkInterfaceOption subNetworkInterface) {
        this.subNetworkInterface = subNetworkInterface;
    }

    public BatchCreateSubNetworkInterfaceV3RequestBody withCount(Integer count) {
        this.count = count;
        return this;
    }

    


    /**
     * 批量创建辅助弹性网卡的个数
     * minimum: 1
     * maximum: 20
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchCreateSubNetworkInterfaceV3RequestBody batchCreateSubNetworkInterfaceV3RequestBody = (BatchCreateSubNetworkInterfaceV3RequestBody) o;
        return Objects.equals(this.dryRun, batchCreateSubNetworkInterfaceV3RequestBody.dryRun) &&
            Objects.equals(this.subNetworkInterface, batchCreateSubNetworkInterfaceV3RequestBody.subNetworkInterface) &&
            Objects.equals(this.count, batchCreateSubNetworkInterfaceV3RequestBody.count);
    }
    @Override
    public int hashCode() {
        return Objects.hash(dryRun, subNetworkInterface, count);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateSubNetworkInterfaceV3RequestBody {\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
        sb.append("    subNetworkInterface: ").append(toIndentedString(subNetworkInterface)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

