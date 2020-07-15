package com.huaweicloud.sdk.eip.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.eip.v2.model.PubicipBandwidthDict;
import com.huaweicloud.sdk.eip.v2.model.PublicipsPublicipDict;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 创建弹性公网IP并绑定带宽的请求参数
 */
public class CreatePublicip  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bandwidth")
    
    private PubicipBandwidthDict bandwidth = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId = "0";


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="publicip")
    
    private PublicipsPublicipDict publicip = null;

    public CreatePublicip withBandwidth(PubicipBandwidthDict bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public CreatePublicip withBandwidth(Consumer<PubicipBandwidthDict> bandwidthSetter) {
        if(this.bandwidth == null ){
            this.bandwidth = new PubicipBandwidthDict();
            bandwidthSetter.accept(this.bandwidth);
        }
        
        return this;
    }


    /**
     * Get bandwidth
     * @return bandwidth
     */
    public PubicipBandwidthDict getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(PubicipBandwidthDict bandwidth) {
        this.bandwidth = bandwidth;
    }

    public CreatePublicip withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 企业项目ID。最大长度36字节，带“-”连字符的UUID格式，或者是字符串“0”。  创建弹性公网IP时，给弹性公网IP绑定企业项目ID。  不指定该参数时，默认值是 0
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreatePublicip withPublicip(PublicipsPublicipDict publicip) {
        this.publicip = publicip;
        return this;
    }

    public CreatePublicip withPublicip(Consumer<PublicipsPublicipDict> publicipSetter) {
        if(this.publicip == null ){
            this.publicip = new PublicipsPublicipDict();
            publicipSetter.accept(this.publicip);
        }
        
        return this;
    }


    /**
     * Get publicip
     * @return publicip
     */
    public PublicipsPublicipDict getPublicip() {
        return publicip;
    }

    public void setPublicip(PublicipsPublicipDict publicip) {
        this.publicip = publicip;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreatePublicip createPublicip = (CreatePublicip) o;
        return Objects.equals(this.bandwidth, createPublicip.bandwidth) &&
            Objects.equals(this.enterpriseProjectId, createPublicip.enterpriseProjectId) &&
            Objects.equals(this.publicip, createPublicip.publicip);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bandwidth, enterpriseProjectId, publicip);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePublicip {\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    publicip: ").append(toIndentedString(publicip)).append("\n");
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

