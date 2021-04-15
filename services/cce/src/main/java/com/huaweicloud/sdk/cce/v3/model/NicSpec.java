package com.huaweicloud.sdk.cce.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 主网卡的描述信息。  
 */
public class NicSpec  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="fixedIps")
    
    private List<String> fixedIps = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ipBlock")
    
    private String ipBlock;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subnetId")
    
    private String subnetId;

    public NicSpec withFixedIps(List<String> fixedIps) {
        this.fixedIps = fixedIps;
        return this;
    }

    
    public NicSpec addFixedIpsItem(String fixedIpsItem) {
        if(this.fixedIps == null) {
            this.fixedIps = new ArrayList<>();
        }
        this.fixedIps.add(fixedIpsItem);
        return this;
    }

    public NicSpec withFixedIps(Consumer<List<String>> fixedIpsSetter) {
        if(this.fixedIps == null) {
            this.fixedIps = new ArrayList<>();
        }
        fixedIpsSetter.accept(this.fixedIps);
        return this;
    }

    /**
     * 主网卡的IP将通过fixedIps指定，数量不得大于创建的节点数。fixedIps或ipBlock同时只能指定一个。
     * @return fixedIps
     */
    public List<String> getFixedIps() {
        return fixedIps;
    }

    public void setFixedIps(List<String> fixedIps) {
        this.fixedIps = fixedIps;
    }

    

    public NicSpec withIpBlock(String ipBlock) {
        this.ipBlock = ipBlock;
        return this;
    }

    


    /**
     * IP段的CIDR格式，创建的节点IP将属于该IP段内。fixedIps或ipBlock同时只能指定一个。
     * @return ipBlock
     */
    public String getIpBlock() {
        return ipBlock;
    }

    public void setIpBlock(String ipBlock) {
        this.ipBlock = ipBlock;
    }

    

    public NicSpec withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    


    /**
     * 网卡所在子网的ID。  
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NicSpec nicSpec = (NicSpec) o;
        return Objects.equals(this.fixedIps, nicSpec.fixedIps) &&
            Objects.equals(this.ipBlock, nicSpec.ipBlock) &&
            Objects.equals(this.subnetId, nicSpec.subnetId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(fixedIps, ipBlock, subnetId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NicSpec {\n");
        sb.append("    fixedIps: ").append(toIndentedString(fixedIps)).append("\n");
        sb.append("    ipBlock: ").append(toIndentedString(ipBlock)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
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

